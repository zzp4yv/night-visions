package p241e.p254e.p256b.p257a.p258i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6258u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6260w;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.InterfaceC8757g;
import p241e.p254e.p256b.p257a.InterfaceC8758h;
import p241e.p254e.p256b.p257a.p258i.p260b0.InterfaceC8768e;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;

/* compiled from: TransportRuntime.java */
@Singleton
/* renamed from: e.e.b.a.i.u */
/* loaded from: classes2.dex */
public class C8845u implements InterfaceC8844t {

    /* renamed from: a */
    private static volatile AbstractC8846v f33617a;

    /* renamed from: b */
    private final InterfaceC8821a f33618b;

    /* renamed from: c */
    private final InterfaceC8821a f33619c;

    /* renamed from: d */
    private final InterfaceC8768e f33620d;

    /* renamed from: e */
    private final C6258u f33621e;

    @Inject
    C8845u(InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2, InterfaceC8768e interfaceC8768e, C6258u c6258u, C6260w c6260w) {
        this.f33618b = interfaceC8821a;
        this.f33619c = interfaceC8821a2;
        this.f33620d = interfaceC8768e;
        this.f33621e = c6258u;
        c6260w.m13593a();
    }

    /* renamed from: b */
    private AbstractC8834j m28175b(AbstractC8840p abstractC8840p) {
        return AbstractC8834j.m28150a().mo28107i(this.f33618b.mo28110a()).mo28109k(this.f33619c.mo28110a()).mo28108j(abstractC8840p.mo28125g()).mo28106h(new C8833i(abstractC8840p.mo28121b(), abstractC8840p.m28168d())).mo28105g(abstractC8840p.mo28122c().mo27942a()).mo28102d();
    }

    /* renamed from: c */
    public static C8845u m28176c() {
        AbstractC8846v abstractC8846v = f33617a;
        if (abstractC8846v != null) {
            return abstractC8846v.mo28144b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C8752b> m28177d(InterfaceC8831g interfaceC8831g) {
        return interfaceC8831g instanceof InterfaceC8832h ? Collections.unmodifiableSet(((InterfaceC8832h) interfaceC8831g).mo13398a()) : Collections.singleton(C8752b.m27945b("proto"));
    }

    /* renamed from: f */
    public static void m28178f(Context context) {
        if (f33617a == null) {
            synchronized (C8845u.class) {
                if (f33617a == null) {
                    f33617a = C8830f.m28141c().mo28145a(context).mo28147c();
                }
            }
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.InterfaceC8844t
    /* renamed from: a */
    public void mo28174a(AbstractC8840p abstractC8840p, InterfaceC8758h interfaceC8758h) {
        this.f33620d.mo27960a(abstractC8840p.mo28124f().m28171f(abstractC8840p.mo28122c().mo27944c()), m28175b(abstractC8840p), interfaceC8758h);
    }

    /* renamed from: e */
    public C6258u m28179e() {
        return this.f33621e;
    }

    /* renamed from: g */
    public InterfaceC8757g m28180g(InterfaceC8831g interfaceC8831g) {
        return new C8842r(m28177d(interfaceC8831g), AbstractC8841q.m28169a().mo28138b(interfaceC8831g.getName()).mo28139c(interfaceC8831g.getExtras()).mo28137a(), this);
    }
}
