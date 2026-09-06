package p241e.p294g.p306b;

import p241e.p294g.p306b.C8957e;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11205b;

/* compiled from: BehaviorRelay.java */
/* renamed from: e.g.b.a */
/* loaded from: classes.dex */
public class C8953a<T> extends AbstractC8956d<T, T> {

    /* renamed from: g */
    private static final Object[] f34559g = new Object[0];

    /* renamed from: h */
    private final C8957e<T> f34560h;

    /* compiled from: BehaviorRelay.java */
    /* renamed from: e.g.b.a$a */
    /* loaded from: classes2.dex */
    static class a implements InterfaceC11205b<C8957e.b<T>> {

        /* renamed from: f */
        final /* synthetic */ C8957e f34561f;

        a(C8957e c8957e) {
            this.f34561f = c8957e;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C8957e.b<T> bVar) {
            bVar.m28604b(this.f34561f.m28597d());
        }
    }

    protected C8953a(C11186e.a<T> aVar, C8957e<T> c8957e) {
        super(aVar);
        this.f34560h = c8957e;
    }

    /* renamed from: f1 */
    public static <T> C8953a<T> m28588f1() {
        return m28589g1(null, false);
    }

    /* renamed from: g1 */
    private static <T> C8953a<T> m28589g1(T t, boolean z) {
        C8957e c8957e = new C8957e();
        if (z) {
            c8957e.m28601h(C8954b.m28592b(t));
        }
        c8957e.f34567i = new a(c8957e);
        return new C8953a<>(c8957e, c8957e);
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(T t) {
        if (this.f34560h.m28597d() == null || this.f34560h.f34565g) {
            Object m28592b = C8954b.m28592b(t);
            for (C8957e.b<T> bVar : this.f34560h.m28598e(m28592b)) {
                bVar.m28605d(m28592b);
            }
        }
    }
}
