package p456rx.p461n.p462a;

import java.util.NoSuchElementException;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p461n.p463b.C11287c;
import p456rx.p471q.C11361c;

/* compiled from: OperatorSingle.java */
/* renamed from: rx.n.a.w0 */
/* loaded from: classes3.dex */
public final class C11278w0<T> implements C11186e.b<T, T> {

    /* renamed from: f */
    private final boolean f42647f;

    /* renamed from: g */
    private final T f42648g;

    /* compiled from: OperatorSingle.java */
    /* renamed from: rx.n.a.w0$a */
    static final class a {

        /* renamed from: a */
        static final C11278w0<?> f42649a = new C11278w0<>();
    }

    /* compiled from: OperatorSingle.java */
    /* renamed from: rx.n.a.w0$b */
    static final class b<T> extends AbstractC11197j<T> {

        /* renamed from: f */
        private final AbstractC11197j<? super T> f42650f;

        /* renamed from: g */
        private final boolean f42651g;

        /* renamed from: h */
        private final T f42652h;

        /* renamed from: i */
        private T f42653i;

        /* renamed from: j */
        private boolean f42654j;

        /* renamed from: k */
        private boolean f42655k;

        b(AbstractC11197j<? super T> abstractC11197j, boolean z, T t) {
            this.f42650f = abstractC11197j;
            this.f42651g = z;
            this.f42652h = t;
            request(2L);
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42655k) {
                return;
            }
            if (this.f42654j) {
                this.f42650f.setProducer(new C11287c(this.f42650f, this.f42653i));
            } else if (this.f42651g) {
                this.f42650f.setProducer(new C11287c(this.f42650f, this.f42652h));
            } else {
                this.f42650f.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42655k) {
                C11361c.m40578j(th);
            } else {
                this.f42650f.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (this.f42655k) {
                return;
            }
            if (!this.f42654j) {
                this.f42653i = t;
                this.f42654j = true;
            } else {
                this.f42655k = true;
                this.f42650f.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
            }
        }
    }

    C11278w0() {
        this(false, null);
    }

    /* renamed from: b */
    public static <T> C11278w0<T> m40348b() {
        return (C11278w0<T>) a.f42649a;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super T> abstractC11197j) {
        b bVar = new b(abstractC11197j, this.f42647f, this.f42648g);
        abstractC11197j.add(bVar);
        return bVar;
    }

    private C11278w0(boolean z, T t) {
        this.f42647f = z;
        this.f42648g = t;
    }
}
