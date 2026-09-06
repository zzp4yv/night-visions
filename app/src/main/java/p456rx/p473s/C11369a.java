package p456rx.p473s;

import java.util.ArrayList;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p461n.p462a.C11234h;
import p456rx.p473s.C11373e;

/* compiled from: BehaviorSubject.java */
/* renamed from: rx.s.a */
/* loaded from: classes.dex */
public final class C11369a<T> extends AbstractC11372d<T, T> {

    /* renamed from: g */
    private static final Object[] f43037g = new Object[0];

    /* renamed from: h */
    private final C11373e<T> f43038h;

    /* compiled from: BehaviorSubject.java */
    /* renamed from: rx.s.a$a */
    /* loaded from: classes3.dex */
    static class a implements InterfaceC11205b<C11373e.c<T>> {

        /* renamed from: f */
        final /* synthetic */ C11373e f43039f;

        a(C11373e c11373e) {
            this.f43039f = c11373e;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C11373e.c<T> cVar) {
            cVar.m40654b(this.f43039f.m40646d());
        }
    }

    protected C11369a(C11186e.a<T> aVar, C11373e<T> c11373e) {
        super(aVar);
        this.f43038h = c11373e;
    }

    /* renamed from: g1 */
    public static <T> C11369a<T> m40634g1() {
        return m40635h1(null, false);
    }

    /* renamed from: h1 */
    private static <T> C11369a<T> m40635h1(T t, boolean z) {
        C11373e c11373e = new C11373e();
        if (z) {
            c11373e.m40649g(C11234h.m40221g(t));
        }
        a aVar = new a(c11373e);
        c11373e.f43053i = aVar;
        c11373e.f43054j = aVar;
        return new C11369a<>(c11373e, c11373e);
    }

    @Override // p456rx.InterfaceC11193f
    public void onCompleted() {
        if (this.f43038h.m40646d() == null || this.f43038h.f43051g) {
            Object m40216b = C11234h.m40216b();
            for (C11373e.c<T> cVar : this.f43038h.m40650h(m40216b)) {
                cVar.m40656d(m40216b);
            }
        }
    }

    @Override // p456rx.InterfaceC11193f
    public void onError(Throwable th) {
        if (this.f43038h.m40646d() == null || this.f43038h.f43051g) {
            Object m40217c = C11234h.m40217c(th);
            ArrayList arrayList = null;
            for (C11373e.c<T> cVar : this.f43038h.m40650h(m40217c)) {
                try {
                    cVar.m40656d(m40217c);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            C11192a.m40139d(arrayList);
        }
    }

    @Override // p456rx.InterfaceC11193f
    public void onNext(T t) {
        if (this.f43038h.m40646d() == null || this.f43038h.f43051g) {
            Object m40221g = C11234h.m40221g(t);
            for (C11373e.c<T> cVar : this.f43038h.m40647e(m40221g)) {
                cVar.m40656d(m40221g);
            }
        }
    }
}
