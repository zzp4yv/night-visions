package p241e.p294g.p306b;

import p241e.p294g.p306b.C8957e;
import p456rx.C11186e;

/* compiled from: PublishRelay.java */
/* renamed from: e.g.b.c */
/* loaded from: classes.dex */
public class C8955c<T> extends AbstractC8956d<T, T> {

    /* renamed from: g */
    private final C8957e<T> f34563g;

    protected C8955c(C11186e.a<T> aVar, C8957e<T> c8957e) {
        super(aVar);
        this.f34563g = c8957e;
    }

    /* renamed from: f1 */
    public static <T> C8955c<T> m28593f1() {
        C8957e c8957e = new C8957e();
        return new C8955c<>(c8957e, c8957e);
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(T t) {
        for (C8957e.b<T> bVar : this.f34563g.m28599f()) {
            bVar.onNext(t);
        }
    }
}
