package io.sentry;

import io.sentry.hints.InterfaceC9426i;
import io.sentry.hints.InterfaceC9427j;
import io.sentry.hints.InterfaceC9428k;
import io.sentry.hints.InterfaceC9433p;
import io.sentry.protocol.C9525q;
import io.sentry.protocol.C9532x;
import io.sentry.util.C9605i;
import io.sentry.util.C9609m;
import io.sentry.util.C9612p;
import io.sentry.util.C9613q;
import io.sentry.util.C9616t;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: OutboxSender.java */
@ApiStatus.Internal
/* renamed from: io.sentry.j3 */
/* loaded from: classes2.dex */
public final class C9458j3 extends AbstractC9392e1 implements InterfaceC9558t1 {

    /* renamed from: c */
    private static final Charset f36384c = Charset.forName("UTF-8");

    /* renamed from: d */
    private final InterfaceC9625v1 f36385d;

    /* renamed from: e */
    private final InterfaceC9551s1 f36386e;

    /* renamed from: f */
    private final InterfaceC9340c2 f36387f;

    /* renamed from: g */
    private final InterfaceC9637w1 f36388g;

    public C9458j3(InterfaceC9625v1 interfaceC9625v1, InterfaceC9551s1 interfaceC9551s1, InterfaceC9340c2 interfaceC9340c2, InterfaceC9637w1 interfaceC9637w1, long j2) {
        super(interfaceC9637w1, j2);
        this.f36385d = (InterfaceC9625v1) C9613q.m31802c(interfaceC9625v1, "Hub is required.");
        this.f36386e = (InterfaceC9551s1) C9613q.m31802c(interfaceC9551s1, "Envelope reader is required.");
        this.f36387f = (InterfaceC9340c2) C9613q.m31802c(interfaceC9340c2, "Serializer is required.");
        this.f36388g = (InterfaceC9637w1) C9613q.m31802c(interfaceC9637w1, "Logger is required.");
    }

    /* renamed from: g */
    private C9541q5 m30877g(C9495o5 c9495o5) {
        String m31131a;
        if (c9495o5 != null && (m31131a = c9495o5.m31131a()) != null) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(m31131a));
                if (C9616t.m31811e(valueOf, false)) {
                    return new C9541q5(Boolean.TRUE, valueOf);
                }
                this.f36388g.mo30214c(EnumC9554s4.ERROR, "Invalid sample rate parsed from TraceContext: %s", m31131a);
            } catch (Exception unused) {
                this.f36388g.mo30214c(EnumC9554s4.ERROR, "Unable to parse sample rate from TraceContext: %s", m31131a);
            }
        }
        return new C9541q5(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30886j(File file, InterfaceC9428k interfaceC9428k) {
        if (interfaceC9428k.mo30474b()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f36388g.mo30214c(EnumC9554s4.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e2) {
            this.f36388g.mo30212a(EnumC9554s4.ERROR, e2, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    /* renamed from: k */
    private void m30880k(C9459j4 c9459j4, int i2) {
        this.f36388g.mo30214c(EnumC9554s4.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i2), c9459j4.m30910i().m30919b());
    }

    /* renamed from: l */
    private void m30881l(int i2) {
        this.f36388g.mo30214c(EnumC9554s4.DEBUG, "Item %d is being captured.", Integer.valueOf(i2));
    }

    /* renamed from: m */
    private void m30882m(C9525q c9525q) {
        this.f36388g.mo30214c(EnumC9554s4.WARNING, "Timed out waiting for event id submission: %s", c9525q);
    }

    /* renamed from: n */
    private void m30883n(C9416h4 c9416h4, C9525q c9525q, int i2) {
        this.f36388g.mo30214c(EnumC9554s4.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i2), c9416h4.m30831b().m30849a(), c9525q);
    }

    /* renamed from: o */
    private void m30884o(C9416h4 c9416h4, C9484n1 c9484n1) throws IOException {
        BufferedReader bufferedReader;
        Object m31780c;
        this.f36388g.mo30214c(EnumC9554s4.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(C9605i.m31769d(c9416h4.m30832c())));
        int i2 = 0;
        for (C9459j4 c9459j4 : c9416h4.m30832c()) {
            i2++;
            if (c9459j4.m30910i() == null) {
                this.f36388g.mo30214c(EnumC9554s4.ERROR, "Item %d has no header", Integer.valueOf(i2));
            } else if (EnumC9547r4.Event.equals(c9459j4.m30910i().m30919b())) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c9459j4.m30909h()), f36384c));
                    try {
                        C9473l4 c9473l4 = (C9473l4) this.f36387f.mo30489c(bufferedReader, C9473l4.class);
                        if (c9473l4 == null) {
                            m30880k(c9459j4, i2);
                        } else {
                            if (c9473l4.m30584L() != null) {
                                C9609m.m31792o(c9484n1, c9473l4.m30584L().m31428e());
                            }
                            if (c9416h4.m30831b().m30849a() == null || c9416h4.m30831b().m30849a().equals(c9473l4.m30579G())) {
                                this.f36385d.mo31159t(c9473l4, c9484n1);
                                m30881l(i2);
                                if (!m30885p(c9484n1)) {
                                    m30882m(c9473l4.m30579G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                m30883n(c9416h4, c9473l4.m30579G(), i2);
                                bufferedReader.close();
                            }
                        }
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    this.f36388g.mo30213b(EnumC9554s4.ERROR, "Item failed to process.", th);
                }
                m31780c = C9609m.m31780c(c9484n1);
                if (!(m31780c instanceof InterfaceC9433p) && !((InterfaceC9433p) m31780c).mo30478f()) {
                    this.f36388g.mo30214c(EnumC9554s4.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i2));
                    return;
                }
                C9609m.m31788k(c9484n1, InterfaceC9427j.class, new C9609m.a() { // from class: io.sentry.q
                    @Override // io.sentry.util.C9609m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        ((InterfaceC9427j) obj).mo30473a();
                    }
                });
            } else {
                if (EnumC9547r4.Transaction.equals(c9459j4.m30910i().m30919b())) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c9459j4.m30909h()), f36384c));
                        try {
                            C9532x c9532x = (C9532x) this.f36387f.mo30489c(bufferedReader, C9532x.class);
                            if (c9532x == null) {
                                m30880k(c9459j4, i2);
                            } else if (c9416h4.m30831b().m30849a() == null || c9416h4.m30831b().m30849a().equals(c9532x.m30579G())) {
                                C9495o5 m30851c = c9416h4.m30831b().m30851c();
                                if (c9532x.m30575C().m31234e() != null) {
                                    c9532x.m30575C().m31234e().m30806n(m30877g(m30851c));
                                }
                                this.f36385d.mo31152m(c9532x, m30851c, c9484n1);
                                m30881l(i2);
                                if (!m30885p(c9484n1)) {
                                    m30882m(c9532x.m30579G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                m30883n(c9416h4, c9532x.m30579G(), i2);
                                bufferedReader.close();
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th2) {
                        this.f36388g.mo30213b(EnumC9554s4.ERROR, "Item failed to process.", th2);
                    }
                } else {
                    this.f36385d.mo31149j(new C9416h4(c9416h4.m30831b().m30849a(), c9416h4.m30831b().m30850b(), c9459j4), c9484n1);
                    this.f36388g.mo30214c(EnumC9554s4.DEBUG, "%s item %d is being captured.", c9459j4.m30910i().m30919b().getItemType(), Integer.valueOf(i2));
                    if (!m30885p(c9484n1)) {
                        this.f36388g.mo30214c(EnumC9554s4.WARNING, "Timed out waiting for item type submission: %s", c9459j4.m30910i().m30919b().getItemType());
                        return;
                    }
                }
                m31780c = C9609m.m31780c(c9484n1);
                if (!(m31780c instanceof InterfaceC9433p)) {
                }
                C9609m.m31788k(c9484n1, InterfaceC9427j.class, new C9609m.a() { // from class: io.sentry.q
                    @Override // io.sentry.util.C9609m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        ((InterfaceC9427j) obj).mo30473a();
                    }
                });
            }
        }
    }

    /* renamed from: p */
    private boolean m30885p(C9484n1 c9484n1) {
        Object m31780c = C9609m.m31780c(c9484n1);
        if (m31780c instanceof InterfaceC9426i) {
            return ((InterfaceC9426i) m31780c).mo30477e();
        }
        C9612p.m31799a(InterfaceC9426i.class, m31780c, this.f36388g);
        return true;
    }

    @Override // io.sentry.InterfaceC9558t1
    /* renamed from: a */
    public void mo30841a(String str, C9484n1 c9484n1) {
        C9613q.m31802c(str, "Path is required.");
        mo30760f(new File(str), c9484n1);
    }

    @Override // io.sentry.AbstractC9392e1
    /* renamed from: b */
    protected boolean mo30757b(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.AbstractC9392e1
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo30759e(File file) {
        super.mo30759e(file);
    }

    @Override // io.sentry.AbstractC9392e1
    /* renamed from: f */
    protected void mo30760f(final File file, C9484n1 c9484n1) {
        InterfaceC9637w1 interfaceC9637w1;
        C9609m.a aVar;
        C9613q.m31802c(file, "File is required.");
        try {
            if (!mo30757b(file.getName())) {
                this.f36388g.mo30214c(EnumC9554s4.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C9416h4 mo30817a = this.f36386e.mo30817a(bufferedInputStream);
                    if (mo30817a == null) {
                        this.f36388g.mo30214c(EnumC9554s4.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m30884o(mo30817a, c9484n1);
                        this.f36388g.mo30214c(EnumC9554s4.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    interfaceC9637w1 = this.f36388g;
                    aVar = new C9609m.a() { // from class: io.sentry.p
                        @Override // io.sentry.util.C9609m.a
                        /* renamed from: a */
                        public final void mo30156a(Object obj) {
                            C9458j3.this.m30886j(file, (InterfaceC9428k) obj);
                        }
                    };
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                this.f36388g.mo30213b(EnumC9554s4.ERROR, "Error processing envelope.", e2);
                interfaceC9637w1 = this.f36388g;
                aVar = new C9609m.a() { // from class: io.sentry.p
                    @Override // io.sentry.util.C9609m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        C9458j3.this.m30886j(file, (InterfaceC9428k) obj);
                    }
                };
            }
            C9609m.m31790m(c9484n1, InterfaceC9428k.class, interfaceC9637w1, aVar);
        } catch (Throwable th2) {
            C9609m.m31790m(c9484n1, InterfaceC9428k.class, this.f36388g, new C9609m.a() { // from class: io.sentry.p
                @Override // io.sentry.util.C9609m.a
                /* renamed from: a */
                public final void mo30156a(Object obj) {
                    C9458j3.this.m30886j(file, (InterfaceC9428k) obj);
                }
            });
            throw th2;
        }
    }
}
