package p456rx.p460m;

/* compiled from: Functions.java */
/* renamed from: rx.m.i */
/* loaded from: classes3.dex */
public final class C11212i {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Functions.java */
    /* renamed from: rx.m.i$a */
    static class a<R> implements InterfaceC11211h<R> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11209f f42153a;

        a(InterfaceC11209f interfaceC11209f) {
            this.f42153a = interfaceC11209f;
        }

        @Override // p456rx.p460m.InterfaceC11211h
        public R call(Object... objArr) {
            if (objArr.length == 2) {
                return (R) this.f42153a.mo6865a(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Func2 expecting 2 arguments.");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Functions.java */
    /* renamed from: rx.m.i$b */
    static class b<R> implements InterfaceC11211h<R> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11210g f42154a;

        b(InterfaceC11210g interfaceC11210g) {
            this.f42154a = interfaceC11210g;
        }

        @Override // p456rx.p460m.InterfaceC11211h
        public R call(Object... objArr) {
            if (objArr.length == 3) {
                return (R) this.f42154a.mo6864a(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Func3 expecting 3 arguments.");
        }
    }

    /* renamed from: a */
    public static <T0, T1, R> InterfaceC11211h<R> m40159a(InterfaceC11209f<? super T0, ? super T1, ? extends R> interfaceC11209f) {
        return new a(interfaceC11209f);
    }

    /* renamed from: b */
    public static <T0, T1, T2, R> InterfaceC11211h<R> m40160b(InterfaceC11210g<? super T0, ? super T1, ? super T2, ? extends R> interfaceC11210g) {
        return new b(interfaceC11210g);
    }
}
