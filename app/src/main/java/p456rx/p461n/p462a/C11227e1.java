package p456rx.p461n.p462a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p461n.p463b.C11286b;

/* compiled from: OperatorToObservableList.java */
/* renamed from: rx.n.a.e1 */
/* loaded from: classes3.dex */
public final class C11227e1<T> implements C11186e.b<List<T>, T> {

    /* compiled from: OperatorToObservableList.java */
    /* renamed from: rx.n.a.e1$a */
    class a extends AbstractC11197j<T> {

        /* renamed from: f */
        boolean f42254f;

        /* renamed from: g */
        List<T> f42255g = new LinkedList();

        /* renamed from: h */
        final /* synthetic */ C11286b f42256h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11197j f42257i;

        a(C11286b c11286b, AbstractC11197j abstractC11197j) {
            this.f42256h = c11286b;
            this.f42257i = abstractC11197j;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42254f) {
                return;
            }
            this.f42254f = true;
            try {
                ArrayList arrayList = new ArrayList(this.f42255g);
                this.f42255g = null;
                this.f42256h.m40377b(arrayList);
            } catch (Throwable th) {
                C11192a.m40141f(th, this);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42257i.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (this.f42254f) {
                return;
            }
            this.f42255g.add(t);
        }

        @Override // p456rx.AbstractC11197j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: OperatorToObservableList.java */
    /* renamed from: rx.n.a.e1$b */
    static final class b {

        /* renamed from: a */
        static final C11227e1<Object> f42259a = new C11227e1<>();
    }

    C11227e1() {
    }

    /* renamed from: b */
    public static <T> C11227e1<T> m40201b() {
        return (C11227e1<T>) b.f42259a;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super List<T>> abstractC11197j) {
        C11286b c11286b = new C11286b(abstractC11197j);
        a aVar = new a(c11286b, abstractC11197j);
        abstractC11197j.add(aVar);
        abstractC11197j.setProducer(c11286b);
        return aVar;
    }
}
