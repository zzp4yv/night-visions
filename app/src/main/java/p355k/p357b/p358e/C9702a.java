package p355k.p357b.p358e;

import java.util.Queue;
import p355k.p357b.InterfaceC9699b;
import p355k.p357b.InterfaceC9701d;
import p355k.p357b.p359f.C9712g;

/* compiled from: EventRecodingLogger.java */
/* renamed from: k.b.e.a */
/* loaded from: classes3.dex */
public class C9702a implements InterfaceC9699b {

    /* renamed from: f */
    String f37109f;

    /* renamed from: g */
    C9712g f37110g;

    /* renamed from: h */
    Queue<C9705d> f37111h;

    public C9702a(C9712g c9712g, Queue<C9705d> queue) {
        this.f37110g = c9712g;
        this.f37109f = c9712g.m32233l();
        this.f37111h = queue;
    }

    /* renamed from: j */
    private void m32199j(EnumC9703b enumC9703b, String str, Object[] objArr, Throwable th) {
        m32200k(enumC9703b, null, str, objArr, th);
    }

    /* renamed from: k */
    private void m32200k(EnumC9703b enumC9703b, InterfaceC9701d interfaceC9701d, String str, Object[] objArr, Throwable th) {
        C9705d c9705d = new C9705d();
        c9705d.m32209i(System.currentTimeMillis());
        c9705d.m32203c(enumC9703b);
        c9705d.m32204d(this.f37110g);
        c9705d.m32205e(this.f37109f);
        c9705d.m32206f(str);
        c9705d.m32202b(objArr);
        c9705d.m32208h(th);
        c9705d.m32207g(Thread.currentThread().getName());
        this.f37111h.add(c9705d);
    }

    @Override // p355k.p357b.InterfaceC9699b
    /* renamed from: a */
    public void mo32172a(String str, Object obj, Object obj2) {
        m32199j(EnumC9703b.DEBUG, str, new Object[]{obj, obj2}, null);
    }

    @Override // p355k.p357b.InterfaceC9699b
    /* renamed from: b */
    public boolean mo32173b() {
        return true;
    }

    @Override // p355k.p357b.InterfaceC9699b
    /* renamed from: c */
    public void mo32174c(String str) {
        m32199j(EnumC9703b.TRACE, str, null, null);
    }

    @Override // p355k.p357b.InterfaceC9699b
    /* renamed from: d */
    public boolean mo32175d() {
        return true;
    }

    @Override // p355k.p357b.InterfaceC9699b
    /* renamed from: e */
    public void mo32176e(String str, Throwable th) {
        m32199j(EnumC9703b.INFO, str, null, th);
    }

    @Override // p355k.p357b.InterfaceC9699b
    /* renamed from: f */
    public void mo32177f(String str, Throwable th) {
        m32199j(EnumC9703b.WARN, str, null, th);
    }

    @Override // p355k.p357b.InterfaceC9699b
    /* renamed from: g */
    public void mo32178g(String str, Throwable th) {
        m32199j(EnumC9703b.DEBUG, str, null, th);
    }

    @Override // p355k.p357b.InterfaceC9699b
    /* renamed from: h */
    public void mo32179h(String str) {
        m32199j(EnumC9703b.WARN, str, null, null);
    }

    @Override // p355k.p357b.InterfaceC9699b
    /* renamed from: i */
    public void mo32180i(String str) {
        m32199j(EnumC9703b.TRACE, str, null, null);
    }
}
