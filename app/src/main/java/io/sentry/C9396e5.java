package io.sentry;

import io.sentry.protocol.C9525q;
import io.sentry.util.C9613q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Span.java */
@ApiStatus.Internal
/* renamed from: io.sentry.e5 */
/* loaded from: classes2.dex */
public final class C9396e5 implements InterfaceC9386d2 {

    /* renamed from: a */
    private AbstractC9402f4 f36301a;

    /* renamed from: b */
    private AbstractC9402f4 f36302b;

    /* renamed from: c */
    private final C9403f5 f36303c;

    /* renamed from: d */
    private final C9336b5 f36304d;

    /* renamed from: e */
    private Throwable f36305e;

    /* renamed from: f */
    private final InterfaceC9625v1 f36306f;

    /* renamed from: g */
    private final AtomicBoolean f36307g;

    /* renamed from: h */
    private final C9441i5 f36308h;

    /* renamed from: i */
    private InterfaceC9410g5 f36309i;

    /* renamed from: j */
    private final Map<String, Object> f36310j;

    C9396e5(C9525q c9525q, C9417h5 c9417h5, C9336b5 c9336b5, String str, InterfaceC9625v1 interfaceC9625v1, AbstractC9402f4 abstractC9402f4, C9441i5 c9441i5, InterfaceC9410g5 interfaceC9410g5) {
        this.f36307g = new AtomicBoolean(false);
        this.f36310j = new ConcurrentHashMap();
        this.f36303c = new C9403f5(c9525q, new C9417h5(), str, c9417h5, c9336b5.m30506B());
        this.f36304d = (C9336b5) C9613q.m31802c(c9336b5, "transaction is required");
        this.f36306f = (InterfaceC9625v1) C9613q.m31802c(interfaceC9625v1, "hub is required");
        this.f36308h = c9441i5;
        this.f36309i = interfaceC9410g5;
        if (abstractC9402f4 != null) {
            this.f36301a = abstractC9402f4;
        } else {
            this.f36301a = interfaceC9625v1.mo31156q().getDateProvider().mo30210a();
        }
    }

    /* renamed from: F */
    private void m30764F(AbstractC9402f4 abstractC9402f4) {
        this.f36301a = abstractC9402f4;
    }

    /* renamed from: s */
    private List<C9396e5> m30765s() {
        ArrayList arrayList = new ArrayList();
        for (C9396e5 c9396e5 : this.f36304d.m30507C()) {
            if (c9396e5.m30774v() != null && c9396e5.m30774v().equals(m30776x())) {
                arrayList.add(c9396e5);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public Boolean m30766A() {
        return this.f36303c.m30797e();
    }

    /* renamed from: B */
    public Boolean m30767B() {
        return this.f36303c.m30798f();
    }

    /* renamed from: C */
    public void m30768C(String str, Object obj) {
        if (this.f36307g.get()) {
            return;
        }
        this.f36310j.put(str, obj);
    }

    /* renamed from: D */
    void m30769D(InterfaceC9410g5 interfaceC9410g5) {
        this.f36309i = interfaceC9410g5;
    }

    /* renamed from: E */
    public InterfaceC9386d2 m30770E(String str, String str2, AbstractC9402f4 abstractC9402f4, EnumC9414h2 enumC9414h2, C9441i5 c9441i5) {
        return this.f36307g.get() ? C9341c3.m30546r() : this.f36304d.m30513N(this.f36303c.m30800h(), str, str2, abstractC9402f4, enumC9414h2, c9441i5);
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: b */
    public boolean mo30516b() {
        return this.f36307g.get();
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: c */
    public boolean mo30517c(AbstractC9402f4 abstractC9402f4) {
        if (this.f36302b == null) {
            return false;
        }
        this.f36302b = abstractC9402f4;
        return true;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: d */
    public void mo30518d(EnumC9460j5 enumC9460j5) {
        mo30529o(enumC9460j5, this.f36306f.mo31156q().getDateProvider().mo30210a());
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: g */
    public void mo30521g() {
        mo30518d(this.f36303c.m30801i());
    }

    @Override // io.sentry.InterfaceC9386d2
    public String getDescription() {
        return this.f36303c.m30793a();
    }

    @Override // io.sentry.InterfaceC9386d2
    public EnumC9460j5 getStatus() {
        return this.f36303c.m30801i();
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: h */
    public void mo30522h(String str, Number number, InterfaceC9626v2 interfaceC9626v2) {
        this.f36304d.mo30522h(str, number, interfaceC9626v2);
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: j */
    public void mo30524j(String str) {
        if (this.f36307g.get()) {
            return;
        }
        this.f36303c.m30804l(str);
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: m */
    public C9403f5 mo30527m() {
        return this.f36303c;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: n */
    public AbstractC9402f4 mo30528n() {
        return this.f36302b;
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: o */
    public void mo30529o(EnumC9460j5 enumC9460j5, AbstractC9402f4 abstractC9402f4) {
        AbstractC9402f4 abstractC9402f42;
        if (this.f36307g.compareAndSet(false, true)) {
            this.f36303c.m30807o(enumC9460j5);
            if (abstractC9402f4 == null) {
                abstractC9402f4 = this.f36306f.mo31156q().getDateProvider().mo30210a();
            }
            this.f36302b = abstractC9402f4;
            if (this.f36308h.m30857c() || this.f36308h.m30856b()) {
                AbstractC9402f4 abstractC9402f43 = null;
                AbstractC9402f4 abstractC9402f44 = null;
                for (C9396e5 c9396e5 : this.f36304d.m30505A().m30776x().equals(m30776x()) ? this.f36304d.m30533x() : m30765s()) {
                    if (abstractC9402f43 == null || c9396e5.mo30531q().m30790u(abstractC9402f43)) {
                        abstractC9402f43 = c9396e5.mo30531q();
                    }
                    if (abstractC9402f44 == null || (c9396e5.mo30528n() != null && c9396e5.mo30528n().m30789q(abstractC9402f44))) {
                        abstractC9402f44 = c9396e5.mo30528n();
                    }
                }
                if (this.f36308h.m30857c() && abstractC9402f43 != null && this.f36301a.m30790u(abstractC9402f43)) {
                    m30764F(abstractC9402f43);
                }
                if (this.f36308h.m30856b() && abstractC9402f44 != null && ((abstractC9402f42 = this.f36302b) == null || abstractC9402f42.m30789q(abstractC9402f44))) {
                    mo30517c(abstractC9402f44);
                }
            }
            Throwable th = this.f36305e;
            if (th != null) {
                this.f36306f.mo31155p(th, this, this.f36304d.getName());
            }
            InterfaceC9410g5 interfaceC9410g5 = this.f36309i;
            if (interfaceC9410g5 != null) {
                interfaceC9410g5.mo30814a(this);
            }
        }
    }

    @Override // io.sentry.InterfaceC9386d2
    /* renamed from: q */
    public AbstractC9402f4 mo30531q() {
        return this.f36301a;
    }

    /* renamed from: r */
    public Map<String, Object> m30771r() {
        return this.f36310j;
    }

    /* renamed from: t */
    public String m30772t() {
        return this.f36303c.m30794b();
    }

    /* renamed from: u */
    C9441i5 m30773u() {
        return this.f36308h;
    }

    /* renamed from: v */
    public C9417h5 m30774v() {
        return this.f36303c.m30796d();
    }

    /* renamed from: w */
    public C9541q5 m30775w() {
        return this.f36303c.m30799g();
    }

    /* renamed from: x */
    public C9417h5 m30776x() {
        return this.f36303c.m30800h();
    }

    /* renamed from: y */
    public Map<String, String> m30777y() {
        return this.f36303c.m30802j();
    }

    /* renamed from: z */
    public C9525q m30778z() {
        return this.f36303c.m30803k();
    }

    public C9396e5(C9548r5 c9548r5, C9336b5 c9336b5, InterfaceC9625v1 interfaceC9625v1, AbstractC9402f4 abstractC9402f4, C9441i5 c9441i5) {
        this.f36307g = new AtomicBoolean(false);
        this.f36310j = new ConcurrentHashMap();
        this.f36303c = (C9403f5) C9613q.m31802c(c9548r5, "context is required");
        this.f36304d = (C9336b5) C9613q.m31802c(c9336b5, "sentryTracer is required");
        this.f36306f = (InterfaceC9625v1) C9613q.m31802c(interfaceC9625v1, "hub is required");
        this.f36309i = null;
        if (abstractC9402f4 != null) {
            this.f36301a = abstractC9402f4;
        } else {
            this.f36301a = interfaceC9625v1.mo31156q().getDateProvider().mo30210a();
        }
        this.f36308h = c9441i5;
    }
}
