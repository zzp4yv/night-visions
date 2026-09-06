package p456rx.p461n.p462a;

import java.util.NoSuchElementException;
import p456rx.AbstractC11196i;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.Single;

/* compiled from: OnSubscribeSingle.java */
/* renamed from: rx.n.a.a0 */
/* loaded from: classes3.dex */
public class C11214a0<T> implements Single.InterfaceC11181j<T> {

    /* renamed from: f */
    private final C11186e<T> f42155f;

    /* compiled from: OnSubscribeSingle.java */
    /* renamed from: rx.n.a.a0$a */
    class a extends AbstractC11197j<T> {

        /* renamed from: f */
        private boolean f42156f;

        /* renamed from: g */
        private boolean f42157g;

        /* renamed from: h */
        private T f42158h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11196i f42159i;

        a(AbstractC11196i abstractC11196i) {
            this.f42159i = abstractC11196i;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42156f) {
                return;
            }
            if (this.f42157g) {
                this.f42159i.mo29130c(this.f42158h);
            } else {
                this.f42159i.onError(new NoSuchElementException("Observable emitted no items"));
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42159i.onError(th);
            unsubscribe();
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (!this.f42157g) {
                this.f42157g = true;
                this.f42158h = t;
            } else {
                this.f42156f = true;
                this.f42159i.onError(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
            }
        }

        @Override // p456rx.AbstractC11197j
        public void onStart() {
            request(2L);
        }
    }

    public C11214a0(C11186e<T> c11186e) {
        this.f42155f = c11186e;
    }

    /* renamed from: b */
    public static <T> C11214a0<T> m40165b(C11186e<T> c11186e) {
        return new C11214a0<>(c11186e);
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11196i<? super T> abstractC11196i) {
        a aVar = new a(abstractC11196i);
        abstractC11196i.m40149b(aVar);
        this.f42155f.m40089c1(aVar);
    }
}
