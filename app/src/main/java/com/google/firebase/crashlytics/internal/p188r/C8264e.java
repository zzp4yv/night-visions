package com.google.firebase.crashlytics.internal.p188r;

import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p183n.AbstractC8162b0;
import com.google.firebase.crashlytics.internal.p183n.C8197v;
import com.google.firebase.crashlytics.internal.p184o.C8213l;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8279i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;

/* compiled from: CrashlyticsReportPersistence.java */
/* renamed from: com.google.firebase.crashlytics.h.r.e */
/* loaded from: classes2.dex */
public class C8264e {

    /* renamed from: a */
    private static final Charset f31548a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final int f31549b = 15;

    /* renamed from: c */
    private static final C8238j f31550c = new C8238j();

    /* renamed from: d */
    private static final Comparator<? super File> f31551d = new Comparator() { // from class: com.google.firebase.crashlytics.h.r.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareTo;
            compareTo = ((File) obj2).getName().compareTo(((File) obj).getName());
            return compareTo;
        }
    };

    /* renamed from: e */
    private static final FilenameFilter f31552e = new FilenameFilter() { // from class: com.google.firebase.crashlytics.h.r.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean startsWith;
            startsWith = str.startsWith("event");
            return startsWith;
        }
    };

    /* renamed from: f */
    private final AtomicInteger f31553f = new AtomicInteger(0);

    /* renamed from: g */
    private final C8265f f31554g;

    /* renamed from: h */
    private final InterfaceC8279i f31555h;

    /* renamed from: i */
    private final C8197v f31556i;

    public C8264e(C8265f c8265f, InterfaceC8279i interfaceC8279i, C8197v c8197v) {
        this.f31554g = c8265f;
        this.f31555h = interfaceC8279i;
        this.f31556i = c8197v;
    }

    /* renamed from: A */
    private void m25956A(String str, long j2) {
        boolean z;
        List<File> m26008p = this.f31554g.m26008p(str, f31552e);
        if (m26008p.isEmpty()) {
            C8146h.m25176f().m25183i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(m26008p);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : m26008p) {
                try {
                    arrayList.add(f31550c.m25946a(m25976y(file)));
                } catch (IOException e2) {
                    C8146h.m25176f().m25186l("Could not add event to report for " + file, e2);
                }
                if (z || m25969o(file.getName())) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m25957B(this.f31554g.m26007o(str, "report"), arrayList, j2, z, C8213l.m25540i(str, this.f31554g), this.f31556i.m25367d(str));
        } else {
            C8146h.m25176f().m25185k("Could not parse event files for session " + str);
        }
    }

    /* renamed from: B */
    private void m25957B(File file, List<AbstractC8225f0.e.d> list, long j2, boolean z, String str, String str2) {
        try {
            C8238j c8238j = f31550c;
            AbstractC8225f0 m25667q = c8238j.m25944L(m25976y(file)).m25670t(j2, z, str).m25665o(str2).m25667q(list);
            AbstractC8225f0.e mo25592m = m25667q.mo25592m();
            if (mo25592m == null) {
                return;
            }
            C8146h.m25176f().m25177b("appQualitySessionId: " + str2);
            m25959D(z ? this.f31554g.m26003j(mo25592m.mo25689i()) : this.f31554g.m26005l(mo25592m.mo25689i()), c8238j.m25945M(m25667q));
        } catch (IOException e2) {
            C8146h.m25176f().m25186l("Could not synthesize final report file for " + file, e2);
        }
    }

    /* renamed from: C */
    private int m25958C(String str, int i2) {
        List<File> m26008p = this.f31554g.m26008p(str, new FilenameFilter() { // from class: com.google.firebase.crashlytics.h.r.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean m25970p;
                m25970p = C8264e.m25970p(file, str2);
                return m25970p;
            }
        });
        Collections.sort(m26008p, new Comparator() { // from class: com.google.firebase.crashlytics.h.r.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m25975v;
                m25975v = C8264e.m25975v((File) obj, (File) obj2);
                return m25975v;
            }
        });
        return m25962b(m26008p, i2);
    }

    /* renamed from: D */
    private static void m25959D(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f31548a);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: E */
    private static void m25960E(File file, String str, long j2) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f31548a);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m25964d(j2));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private SortedSet<String> m25961a(String str) {
        this.f31554g.m25995b();
        SortedSet<String> m25981l = m25981l();
        if (str != null) {
            m25981l.remove(str);
        }
        if (m25981l.size() <= 8) {
            return m25981l;
        }
        while (m25981l.size() > 8) {
            String last = m25981l.last();
            C8146h.m25176f().m25177b("Removing session over cap: " + last);
            this.f31554g.m25996c(last);
            m25981l.remove(last);
        }
        return m25981l;
    }

    /* renamed from: b */
    private static int m25962b(List<File> list, int i2) {
        int size = list.size();
        for (File file : list) {
            if (size <= i2) {
                return size;
            }
            C8265f.m25991s(file);
            size--;
        }
        return size;
    }

    /* renamed from: c */
    private void m25963c() {
        int i2 = this.f31555h.mo26060b().f31594a.f31606b;
        List<File> m25967j = m25967j();
        int size = m25967j.size();
        if (size <= i2) {
            return;
        }
        Iterator<File> it = m25967j.subList(i2, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* renamed from: d */
    private static long m25964d(long j2) {
        return j2 * 1000;
    }

    /* renamed from: f */
    private void m25965f(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* renamed from: i */
    private static String m25966i(int i2, boolean z) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i2)) + (z ? "_" : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: j */
    private List<File> m25967j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f31554g.m26004k());
        arrayList.addAll(this.f31554g.m26001h());
        Comparator<? super File> comparator = f31551d;
        Collections.sort(arrayList, comparator);
        List<File> m26006m = this.f31554g.m26006m();
        Collections.sort(m26006m, comparator);
        arrayList.addAll(m26006m);
        return arrayList;
    }

    /* renamed from: k */
    private static String m25968k(String str) {
        return str.substring(0, f31549b);
    }

    /* renamed from: o */
    private static boolean m25969o(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static boolean m25970p(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static int m25975v(File file, File file2) {
        return m25968k(file.getName()).compareTo(m25968k(file2.getName()));
    }

    /* renamed from: y */
    private static String m25976y(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f31548a);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }

    /* renamed from: z */
    private void m25977z(File file, AbstractC8225f0.d dVar, String str, AbstractC8225f0.a aVar) {
        String m25367d = this.f31556i.m25367d(str);
        try {
            C8238j c8238j = f31550c;
            m25959D(this.f31554g.m26000g(str), c8238j.m25945M(c8238j.m25944L(m25976y(file)).m25669s(dVar).m25666p(aVar).m25665o(m25367d)));
        } catch (IOException e2) {
            C8146h.m25176f().m25186l("Could not synthesize final native report file for " + file, e2);
        }
    }

    /* renamed from: e */
    public void m25978e() {
        m25965f(this.f31554g.m26006m());
        m25965f(this.f31554g.m26004k());
        m25965f(this.f31554g.m26001h());
    }

    /* renamed from: g */
    public void m25979g(String str, long j2) {
        for (String str2 : m25961a(str)) {
            C8146h.m25176f().m25183i("Finalizing report for session " + str2);
            m25956A(str2, j2);
            this.f31554g.m25996c(str2);
        }
        m25963c();
    }

    /* renamed from: h */
    public void m25980h(String str, AbstractC8225f0.d dVar, AbstractC8225f0.a aVar) {
        File m26007o = this.f31554g.m26007o(str, "report");
        C8146h.m25176f().m25177b("Writing native session report for " + str + " to file: " + m26007o);
        m25977z(m26007o, dVar, str, aVar);
    }

    /* renamed from: l */
    public SortedSet<String> m25981l() {
        return new TreeSet(this.f31554g.m25997d()).descendingSet();
    }

    /* renamed from: m */
    public long m25982m(String str) {
        return this.f31554g.m26007o(str, "start-time").lastModified();
    }

    /* renamed from: n */
    public boolean m25983n() {
        return (this.f31554g.m26006m().isEmpty() && this.f31554g.m26004k().isEmpty() && this.f31554g.m26001h().isEmpty()) ? false : true;
    }

    /* renamed from: u */
    public List<AbstractC8162b0> m25984u() {
        List<File> m25967j = m25967j();
        ArrayList arrayList = new ArrayList();
        for (File file : m25967j) {
            try {
                arrayList.add(AbstractC8162b0.m25225a(f31550c.m25944L(m25976y(file)), file.getName(), file));
            } catch (IOException e2) {
                C8146h.m25176f().m25186l("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public void m25985w(AbstractC8225f0.e.d dVar, String str, boolean z) {
        int i2 = this.f31555h.mo26060b().f31594a.f31605a;
        try {
            m25959D(this.f31554g.m26007o(str, m25966i(this.f31553f.getAndIncrement(), z)), f31550c.m25947b(dVar));
        } catch (IOException e2) {
            C8146h.m25176f().m25186l("Could not persist event for session " + str, e2);
        }
        m25958C(str, i2);
    }

    /* renamed from: x */
    public void m25986x(AbstractC8225f0 abstractC8225f0) {
        AbstractC8225f0.e mo25592m = abstractC8225f0.mo25592m();
        if (mo25592m == null) {
            C8146h.m25176f().m25177b("Could not get session for report");
            return;
        }
        String mo25689i = mo25592m.mo25689i();
        try {
            m25959D(this.f31554g.m26007o(mo25689i, "report"), f31550c.m25945M(abstractC8225f0));
            m25960E(this.f31554g.m26007o(mo25689i, "start-time"), HttpUrl.FRAGMENT_ENCODE_SET, mo25592m.mo25692l());
        } catch (IOException e2) {
            C8146h.m25176f().m25178c("Could not persist report for session " + mo25689i, e2);
        }
    }
}
