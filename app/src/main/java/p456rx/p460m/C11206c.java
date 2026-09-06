package p456rx.p460m;

/* compiled from: Actions.java */
/* renamed from: rx.m.c */
/* loaded from: classes3.dex */
public final class C11206c {

    /* renamed from: a */
    private static final b f42151a = new b();

    /* compiled from: Actions.java */
    /* renamed from: rx.m.c$a */
    static final class a<T> implements InterfaceC11205b<T> {

        /* renamed from: f */
        final InterfaceC11204a f42152f;

        public a(InterfaceC11204a interfaceC11204a) {
            this.f42152f = interfaceC11204a;
        }

        @Override // p456rx.p460m.InterfaceC11205b
        public void call(T t) {
            this.f42152f.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Actions.java */
    /* renamed from: rx.m.c$b */
    public static final class b<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements InterfaceC11204a, InterfaceC11205b<T0> {
        b() {
        }

        @Override // p456rx.p460m.InterfaceC11204a
        public void call() {
        }

        @Override // p456rx.p460m.InterfaceC11205b
        public void call(T0 t0) {
        }
    }

    /* renamed from: a */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> b<T0, T1, T2, T3, T4, T5, T6, T7, T8> m40157a() {
        return f42151a;
    }

    /* renamed from: b */
    public static <T> InterfaceC11205b<T> m40158b(InterfaceC11204a interfaceC11204a) {
        return new a(interfaceC11204a);
    }
}
