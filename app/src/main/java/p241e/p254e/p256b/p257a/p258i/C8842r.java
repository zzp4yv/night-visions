package p241e.p254e.p256b.p257a.p258i;

import java.util.Set;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.InterfaceC8755e;
import p241e.p254e.p256b.p257a.InterfaceC8756f;
import p241e.p254e.p256b.p257a.InterfaceC8757g;

/* compiled from: TransportFactoryImpl.java */
/* renamed from: e.e.b.a.i.r */
/* loaded from: classes2.dex */
final class C8842r implements InterfaceC8757g {

    /* renamed from: a */
    private final Set<C8752b> f33609a;

    /* renamed from: b */
    private final AbstractC8841q f33610b;

    /* renamed from: c */
    private final InterfaceC8844t f33611c;

    C8842r(Set<C8752b> set, AbstractC8841q abstractC8841q, InterfaceC8844t interfaceC8844t) {
        this.f33609a = set;
        this.f33610b = abstractC8841q;
        this.f33611c = interfaceC8844t;
    }

    @Override // p241e.p254e.p256b.p257a.InterfaceC8757g
    /* renamed from: a */
    public <T> InterfaceC8756f<T> mo26454a(String str, Class<T> cls, C8752b c8752b, InterfaceC8755e<T, byte[]> interfaceC8755e) {
        if (this.f33609a.contains(c8752b)) {
            return new C8843s(this.f33610b, str, c8752b, interfaceC8755e, this.f33611c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c8752b, this.f33609a));
    }
}
