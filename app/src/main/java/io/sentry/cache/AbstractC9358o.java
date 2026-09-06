package io.sentry.cache;

import io.sentry.C9389d5;
import io.sentry.C9416h4;
import io.sentry.C9459j4;
import io.sentry.C9647x4;
import io.sentry.EnumC9547r4;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9340c2;
import io.sentry.clientreport.EnumC9368e;
import io.sentry.util.C9613q;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CacheStrategy.java */
/* renamed from: io.sentry.cache.o */
/* loaded from: classes2.dex */
public abstract class AbstractC9358o {

    /* renamed from: f */
    protected static final Charset f36229f = Charset.forName("UTF-8");

    /* renamed from: g */
    protected final C9647x4 f36230g;

    /* renamed from: h */
    protected final InterfaceC9340c2 f36231h;

    /* renamed from: i */
    protected final File f36232i;

    /* renamed from: j */
    private final int f36233j;

    AbstractC9358o(C9647x4 c9647x4, String str, int i2) {
        C9613q.m31802c(str, "Directory is required.");
        this.f36230g = (C9647x4) C9613q.m31802c(c9647x4, "SentryOptions is required.");
        this.f36231h = c9647x4.getSerializer();
        this.f36232i = new File(str);
        this.f36233j = i2;
    }

    /* renamed from: c */
    private C9416h4 m30607c(C9416h4 c9416h4, C9459j4 c9459j4) {
        ArrayList arrayList = new ArrayList();
        Iterator<C9459j4> it = c9416h4.m30832c().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(c9459j4);
        return new C9416h4(c9416h4.m30831b(), arrayList);
    }

    /* renamed from: f */
    private C9389d5 m30608f(C9416h4 c9416h4) {
        for (C9459j4 c9459j4 : c9416h4.m30832c()) {
            if (m30609h(c9459j4)) {
                return m30615s(c9459j4);
            }
        }
        return null;
    }

    /* renamed from: h */
    private boolean m30609h(C9459j4 c9459j4) {
        if (c9459j4 == null) {
            return false;
        }
        return c9459j4.m30910i().m30919b().equals(EnumC9547r4.Session);
    }

    /* renamed from: i */
    private boolean m30610i(C9416h4 c9416h4) {
        return c9416h4.m30832c().iterator().hasNext();
    }

    /* renamed from: n */
    private boolean m30611n(C9389d5 c9389d5) {
        return c9389d5.m30748l().equals(C9389d5.b.Ok) && c9389d5.m30746j() != null;
    }

    /* renamed from: o */
    static /* synthetic */ int m30612o(File file, File file2) {
        return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
    }

    /* renamed from: q */
    private void m30613q(File file, File[] fileArr) {
        Boolean m30744g;
        int i2;
        File file2;
        C9416h4 m30614r;
        C9459j4 c9459j4;
        C9389d5 m30615s;
        C9416h4 m30614r2 = m30614r(file);
        if (m30614r2 == null || !m30610i(m30614r2)) {
            return;
        }
        this.f36230g.getClientReportRecorder().mo30691b(EnumC9368e.CACHE_OVERFLOW, m30614r2);
        C9389d5 m30608f = m30608f(m30614r2);
        if (m30608f == null || !m30611n(m30608f) || (m30744g = m30608f.m30744g()) == null || !m30744g.booleanValue()) {
            return;
        }
        int length = fileArr.length;
        for (i2 = 0; i2 < length; i2++) {
            file2 = fileArr[i2];
            m30614r = m30614r(file2);
            if (m30614r != null && m30610i(m30614r)) {
                c9459j4 = null;
                Iterator<C9459j4> it = m30614r.m30832c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C9459j4 next = it.next();
                    if (m30609h(next) && (m30615s = m30615s(next)) != null && m30611n(m30615s)) {
                        Boolean m30744g2 = m30615s.m30744g();
                        if (m30744g2 != null && m30744g2.booleanValue()) {
                            this.f36230g.getLogger().mo30214c(EnumC9554s4.ERROR, "Session %s has 2 times the init flag.", m30608f.m30746j());
                            return;
                        }
                        if (m30608f.m30746j() != null && m30608f.m30746j().equals(m30615s.m30746j())) {
                            m30615s.m30750n();
                            try {
                                c9459j4 = C9459j4.m30892f(this.f36231h, m30615s);
                                it.remove();
                                break;
                            } catch (IOException e2) {
                                this.f36230g.getLogger().mo30212a(EnumC9554s4.ERROR, e2, "Failed to create new envelope item for the session %s", m30608f.m30746j());
                            }
                        }
                    }
                }
            }
        }
        return;
        if (c9459j4 != null) {
            C9416h4 m30607c = m30607c(m30614r, c9459j4);
            long lastModified = file2.lastModified();
            if (!file2.delete()) {
                this.f36230g.getLogger().mo30214c(EnumC9554s4.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
            }
            m30616u(m30607c, file2, lastModified);
            return;
        }
    }

    /* renamed from: r */
    private C9416h4 m30614r(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C9416h4 mo30490d = this.f36231h.mo30490d(bufferedInputStream);
                bufferedInputStream.close();
                return mo30490d;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to deserialize the envelope.", e2);
            return null;
        }
    }

    /* renamed from: s */
    private C9389d5 m30615s(C9459j4 c9459j4) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c9459j4.m30909h()), f36229f));
            try {
                C9389d5 c9389d5 = (C9389d5) this.f36231h.mo30489c(bufferedReader, C9389d5.class);
                bufferedReader.close();
                return c9389d5;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    /* renamed from: u */
    private void m30616u(C9416h4 c9416h4, File file, long j2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f36231h.mo30488b(c9416h4, fileOutputStream);
                file.setLastModified(j2);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36230g.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to serialize the new envelope to the disk.", th2);
        }
    }

    /* renamed from: v */
    private void m30617v(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC9358o.m30612o((File) obj, (File) obj2);
                }
            });
        }
    }

    /* renamed from: g */
    protected boolean m30618g() {
        if (this.f36232i.isDirectory() && this.f36232i.canWrite() && this.f36232i.canRead()) {
            return true;
        }
        this.f36230g.getLogger().mo30214c(EnumC9554s4.ERROR, "The directory for caching files is inaccessible.: %s", this.f36232i.getAbsolutePath());
        return false;
    }

    /* renamed from: t */
    protected void m30619t(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f36233j) {
            this.f36230g.getLogger().mo30214c(EnumC9554s4.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i2 = (length - this.f36233j) + 1;
            m30617v(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i2, length);
            for (int i3 = 0; i3 < i2; i3++) {
                File file = fileArr[i3];
                m30613q(file, fileArr2);
                if (!file.delete()) {
                    this.f36230g.getLogger().mo30214c(EnumC9554s4.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
