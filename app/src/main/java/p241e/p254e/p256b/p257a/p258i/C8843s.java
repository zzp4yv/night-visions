package p241e.p254e.p256b.p257a.p258i;

import p241e.p254e.p256b.p257a.AbstractC8753c;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.InterfaceC8755e;
import p241e.p254e.p256b.p257a.InterfaceC8756f;
import p241e.p254e.p256b.p257a.InterfaceC8758h;

/* compiled from: TransportImpl.java */
/* renamed from: e.e.b.a.i.s */
/* loaded from: classes2.dex */
final class C8843s<T> implements InterfaceC8756f<T> {

    /* renamed from: a */
    private final AbstractC8841q f33612a;

    /* renamed from: b */
    private final String f33613b;

    /* renamed from: c */
    private final C8752b f33614c;

    /* renamed from: d */
    private final InterfaceC8755e<T, byte[]> f33615d;

    /* renamed from: e */
    private final InterfaceC8844t f33616e;

    C8843s(AbstractC8841q abstractC8841q, String str, C8752b c8752b, InterfaceC8755e<T, byte[]> interfaceC8755e, InterfaceC8844t interfaceC8844t) {
        this.f33612a = abstractC8841q;
        this.f33613b = str;
        this.f33614c = c8752b;
        this.f33615d = interfaceC8755e;
        this.f33616e = interfaceC8844t;
    }

    /* renamed from: d */
    static /* synthetic */ void m28172d(Exception exc) {
    }

    @Override // p241e.p254e.p256b.p257a.InterfaceC8756f
    /* renamed from: a */
    public void mo26452a(AbstractC8753c<T> abstractC8753c) {
        mo26453b(abstractC8753c, new InterfaceC8758h() { // from class: e.e.b.a.i.a
            @Override // p241e.p254e.p256b.p257a.InterfaceC8758h
            /* renamed from: a */
            public final void mo26010a(Exception exc) {
                C8843s.m28172d(exc);
            }
        });
    }

    @Override // p241e.p254e.p256b.p257a.InterfaceC8756f
    /* renamed from: b */
    public void mo26453b(AbstractC8753c<T> abstractC8753c, InterfaceC8758h interfaceC8758h) {
        this.f33616e.mo28174a(AbstractC8840p.m28167a().mo28130e(this.f33612a).mo28128c(abstractC8753c).mo28131f(this.f33613b).mo28129d(this.f33615d).mo28127b(this.f33614c).mo28126a(), interfaceC8758h);
    }

    /* renamed from: c */
    AbstractC8841q m28173c() {
        return this.f33612a;
    }
}
