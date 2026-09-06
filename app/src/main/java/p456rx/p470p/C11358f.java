package p456rx.p470p;

import p456rx.AbstractC11197j;
import p456rx.InterfaceC11193f;

/* compiled from: Subscribers.java */
/* renamed from: rx.p.f */
/* loaded from: classes3.dex */
public final class C11358f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Subscribers.java */
    /* renamed from: rx.p.f$a */
    static class a<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11193f f42999f;

        a(InterfaceC11193f interfaceC11193f) {
            this.f42999f = interfaceC11193f;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f42999f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42999f.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f42999f.onNext(t);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Subscribers.java */
    /* renamed from: rx.p.f$b */
    static class b<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f43000f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC11197j abstractC11197j, AbstractC11197j abstractC11197j2) {
            super(abstractC11197j);
            this.f43000f = abstractC11197j2;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.f43000f.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f43000f.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            this.f43000f.onNext(t);
        }
    }

    /* renamed from: a */
    public static <T> AbstractC11197j<T> m40559a() {
        return m40560b(C11353a.m40556a());
    }

    /* renamed from: b */
    public static <T> AbstractC11197j<T> m40560b(InterfaceC11193f<? super T> interfaceC11193f) {
        return new a(interfaceC11193f);
    }

    /* renamed from: c */
    public static <T> AbstractC11197j<T> m40561c(AbstractC11197j<? super T> abstractC11197j) {
        return new b(abstractC11197j, abstractC11197j);
    }
}
