package p355k.p357b.p360g;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p355k.p357b.InterfaceC9698a;
import p355k.p357b.InterfaceC9699b;

/* compiled from: SimpleLoggerFactory.java */
/* renamed from: k.b.g.b */
/* loaded from: classes3.dex */
public class C9716b implements InterfaceC9698a {

    /* renamed from: a */
    ConcurrentMap<String, InterfaceC9699b> f37160a = new ConcurrentHashMap();

    public C9716b() {
        C9715a.m32254r();
    }

    @Override // p355k.p357b.InterfaceC9698a
    /* renamed from: a */
    public InterfaceC9699b mo32171a(String str) {
        InterfaceC9699b interfaceC9699b = this.f37160a.get(str);
        if (interfaceC9699b != null) {
            return interfaceC9699b;
        }
        C9715a c9715a = new C9715a(str);
        InterfaceC9699b putIfAbsent = this.f37160a.putIfAbsent(str, c9715a);
        return putIfAbsent == null ? c9715a : putIfAbsent;
    }
}
