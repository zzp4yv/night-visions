package p456rx.p461n.p462a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11209f;
import p456rx.p461n.p463b.C11286b;

/* compiled from: OperatorToObservableSortedList.java */
/* renamed from: rx.n.a.f1 */
/* loaded from: classes3.dex */
public final class C11230f1<T> implements C11186e.b<List<T>, T> {

    /* renamed from: f */
    private static final Comparator f42271f = new c();

    /* renamed from: g */
    final Comparator<? super T> f42272g;

    /* renamed from: h */
    final int f42273h;

    /* compiled from: OperatorToObservableSortedList.java */
    /* renamed from: rx.n.a.f1$a */
    class a implements Comparator<T> {

        /* renamed from: f */
        final /* synthetic */ InterfaceC11209f f42274f;

        a(InterfaceC11209f interfaceC11209f) {
            this.f42274f = interfaceC11209f;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return ((Integer) this.f42274f.mo6865a(t, t2)).intValue();
        }
    }

    /* compiled from: OperatorToObservableSortedList.java */
    /* renamed from: rx.n.a.f1$b */
    class b extends AbstractC11197j<T> {

        /* renamed from: f */
        List<T> f42276f;

        /* renamed from: g */
        boolean f42277g;

        /* renamed from: h */
        final /* synthetic */ C11286b f42278h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11197j f42279i;

        b(C11286b c11286b, AbstractC11197j abstractC11197j) {
            this.f42278h = c11286b;
            this.f42279i = abstractC11197j;
            this.f42276f = new ArrayList(C11230f1.this.f42273h);
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42277g) {
                return;
            }
            this.f42277g = true;
            List<T> list = this.f42276f;
            this.f42276f = null;
            try {
                Collections.sort(list, C11230f1.this.f42272g);
                this.f42278h.m40377b(list);
            } catch (Throwable th) {
                C11192a.m40141f(th, this);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            this.f42279i.onError(th);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (this.f42277g) {
                return;
            }
            this.f42276f.add(t);
        }

        @Override // p456rx.AbstractC11197j
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: OperatorToObservableSortedList.java */
    /* renamed from: rx.n.a.f1$c */
    static final class c implements Comparator<Object> {
        c() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public C11230f1(InterfaceC11209f<? super T, ? super T, Integer> interfaceC11209f, int i2) {
        this.f42273h = i2;
        this.f42272g = new a(interfaceC11209f);
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super List<T>> abstractC11197j) {
        C11286b c11286b = new C11286b(abstractC11197j);
        b bVar = new b(c11286b, abstractC11197j);
        abstractC11197j.add(bVar);
        abstractC11197j.setProducer(c11286b);
        return bVar;
    }
}
