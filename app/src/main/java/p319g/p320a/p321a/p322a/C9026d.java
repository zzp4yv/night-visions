package p319g.p320a.p321a.p322a;

import p323h.p324a.AbstractC9031b;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;
import p323h.p324a.EnumC9029a;
import p323h.p324a.InterfaceC9036f;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.InterfaceC9053w;
import p323h.p324a.p329z.p331b.C9075b;
import p355k.p356a.InterfaceC9695a;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;

/* compiled from: RxJavaInterop.java */
/* renamed from: g.a.a.a.d */
/* loaded from: classes2.dex */
public final class C9026d {
    /* renamed from: a */
    public static C11183b m29123a(InterfaceC9036f interfaceC9036f) {
        C9075b.m29271c(interfaceC9036f, "source is null");
        return C11183b.m39948h(new C9024b(interfaceC9036f));
    }

    /* renamed from: b */
    public static <T> C11186e<T> m29124b(InterfaceC9046p<T> interfaceC9046p, EnumC9029a enumC9029a) {
        C9075b.m29271c(interfaceC9046p, "source is null");
        C9075b.m29271c(enumC9029a, "strategy is null");
        return m29125c(AbstractC9043m.m29187D(interfaceC9046p).m29216z(enumC9029a));
    }

    /* renamed from: c */
    public static <T> C11186e<T> m29125c(InterfaceC9695a<T> interfaceC9695a) {
        C9075b.m29271c(interfaceC9695a, "source is null");
        return C11186e.m40035b1(new C9025c(interfaceC9695a));
    }

    /* renamed from: d */
    public static <T> Single<T> m29126d(InterfaceC9053w<T> interfaceC9053w) {
        C9075b.m29271c(interfaceC9053w, "source is null");
        return Single.m39909b(new C9028f(interfaceC9053w));
    }

    /* renamed from: e */
    public static AbstractC9031b m29127e(C11183b c11183b) {
        C9075b.m29271c(c11183b, "source is null");
        return new C9023a(c11183b);
    }

    /* renamed from: f */
    public static <T> AbstractC9049s<T> m29128f(Single<T> single) {
        C9075b.m29271c(single, "source is null");
        return new C9027e(single);
    }
}
