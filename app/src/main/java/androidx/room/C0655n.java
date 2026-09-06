package androidx.room;

import androidx.room.C0648g;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p323h.p324a.AbstractC9040j;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9048r;
import p323h.p324a.AbstractC9049s;
import p323h.p324a.InterfaceC9042l;
import p323h.p324a.InterfaceC9044n;
import p323h.p324a.InterfaceC9045o;
import p323h.p324a.InterfaceC9050t;
import p323h.p324a.InterfaceC9052v;
import p323h.p324a.p326b0.C9032a;
import p323h.p324a.p327x.C9057d;
import p323h.p324a.p328y.InterfaceC9060a;
import p323h.p324a.p328y.InterfaceC9065f;

/* compiled from: RxRoom.java */
/* renamed from: androidx.room.n */
/* loaded from: classes.dex */
public class C0655n {

    /* renamed from: a */
    public static final Object f4337a = new Object();

    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.n$a */
    static class a implements InterfaceC9045o<Object> {

        /* renamed from: a */
        final /* synthetic */ String[] f4338a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0651j f4339b;

        /* compiled from: RxRoom.java */
        /* renamed from: androidx.room.n$a$a, reason: collision with other inner class name */
        class C11394a extends C0648g.c {

            /* renamed from: b */
            final /* synthetic */ InterfaceC9044n f4340b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11394a(String[] strArr, InterfaceC9044n interfaceC9044n) {
                super(strArr);
                this.f4340b = interfaceC9044n;
            }

            @Override // androidx.room.C0648g.c
            /* renamed from: b */
            public void mo4610b(Set<String> set) {
                this.f4340b.onNext(C0655n.f4337a);
            }
        }

        /* compiled from: RxRoom.java */
        /* renamed from: androidx.room.n$a$b */
        class b implements InterfaceC9060a {

            /* renamed from: a */
            final /* synthetic */ C0648g.c f4342a;

            b(C0648g.c cVar) {
                this.f4342a = cVar;
            }

            @Override // p323h.p324a.p328y.InterfaceC9060a
            public void run() throws Exception {
                a.this.f4339b.getInvalidationTracker().m4599g(this.f4342a);
            }
        }

        a(String[] strArr, AbstractC0651j abstractC0651j) {
            this.f4338a = strArr;
            this.f4339b = abstractC0651j;
        }

        @Override // p323h.p324a.InterfaceC9045o
        /* renamed from: a */
        public void mo4659a(InterfaceC9044n<Object> interfaceC9044n) throws Exception {
            C11394a c11394a = new C11394a(this.f4338a, interfaceC9044n);
            this.f4339b.getInvalidationTracker().m4594a(c11394a);
            interfaceC9044n.mo29217a(C9057d.m29244c(new b(c11394a)));
            interfaceC9044n.onNext(C0655n.f4337a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.n$b */
    static class b<T> implements InterfaceC9065f<Object, InterfaceC9042l<T>> {

        /* renamed from: f */
        final /* synthetic */ AbstractC9040j f4344f;

        b(AbstractC9040j abstractC9040j) {
            this.f4344f = abstractC9040j;
        }

        @Override // p323h.p324a.p328y.InterfaceC9065f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9042l<T> mo4660a(Object obj) throws Exception {
            return this.f4344f;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RxRoom.java */
    /* renamed from: androidx.room.n$c */
    static class c<T> implements InterfaceC9052v<T> {

        /* renamed from: a */
        final /* synthetic */ Callable f4345a;

        c(Callable callable) {
            this.f4345a = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p323h.p324a.InterfaceC9052v
        /* renamed from: a */
        public void mo4662a(InterfaceC9050t<T> interfaceC9050t) throws Exception {
            try {
                interfaceC9050t.onSuccess(this.f4345a.call());
            } catch (EmptyResultSetException e2) {
                interfaceC9050t.mo29235c(e2);
            }
        }
    }

    /* renamed from: a */
    public static <T> AbstractC9043m<T> m4655a(AbstractC0651j abstractC0651j, boolean z, String[] strArr, Callable<T> callable) {
        AbstractC9048r m29162a = C9032a.m29162a(m4658d(abstractC0651j, z));
        return (AbstractC9043m<T>) m4656b(abstractC0651j, strArr).m29215y(m29162a).m29198C(m29162a).m29211u(m29162a).m29209q(new b(AbstractC9040j.m29181c(callable)));
    }

    /* renamed from: b */
    public static AbstractC9043m<Object> m4656b(AbstractC0651j abstractC0651j, String... strArr) {
        return AbstractC9043m.m29189c(new a(strArr, abstractC0651j));
    }

    /* renamed from: c */
    public static <T> AbstractC9049s<T> m4657c(Callable<T> callable) {
        return AbstractC9049s.m29226c(new c(callable));
    }

    /* renamed from: d */
    private static Executor m4658d(AbstractC0651j abstractC0651j, boolean z) {
        return z ? abstractC0651j.getTransactionExecutor() : abstractC0651j.getQueryExecutor();
    }
}
