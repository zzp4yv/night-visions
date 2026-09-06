package androidx.work.impl.p016n;

import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.work.C0706e;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: WorkProgressDao_Impl.java */
/* renamed from: androidx.work.impl.n.o */
/* loaded from: classes.dex */
public final class C0774o implements InterfaceC0773n {

    /* renamed from: a */
    private final AbstractC0651j f4790a;

    /* renamed from: b */
    private final AbstractC0644c<C0772m> f4791b;

    /* renamed from: c */
    private final AbstractC0658q f4792c;

    /* renamed from: d */
    private final AbstractC0658q f4793d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* renamed from: androidx.work.impl.n.o$a */
    class a extends AbstractC0644c<C0772m> {
        a(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0644c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC1012f interfaceC1012f, C0772m c0772m) {
            String str = c0772m.f4788a;
            if (str == null) {
                interfaceC1012f.mo4646I0(1);
            } else {
                interfaceC1012f.mo4654w(1, str);
            }
            byte[] m4830l = C0706e.m4830l(c0772m.f4789b);
            if (m4830l == null) {
                interfaceC1012f.mo4646I0(2);
            } else {
                interfaceC1012f.mo4653o0(2, m4830l);
            }
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* renamed from: androidx.work.impl.n.o$b */
    class b extends AbstractC0658q {
        b(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* renamed from: androidx.work.impl.n.o$c */
    class c extends AbstractC0658q {
        c(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C0774o(AbstractC0651j abstractC0651j) {
        this.f4790a = abstractC0651j;
        this.f4791b = new a(abstractC0651j);
        this.f4792c = new b(abstractC0651j);
        this.f4793d = new c(abstractC0651j);
    }

    @Override // androidx.work.impl.p016n.InterfaceC0773n
    /* renamed from: a */
    public void mo5087a() {
        this.f4790a.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.f4793d.acquire();
        this.f4790a.beginTransaction();
        try {
            acquire.mo6470E();
            this.f4790a.setTransactionSuccessful();
        } finally {
            this.f4790a.endTransaction();
            this.f4793d.release(acquire);
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0773n
    /* renamed from: b */
    public void mo5088b(C0772m c0772m) {
        this.f4790a.assertNotSuspendingTransaction();
        this.f4790a.beginTransaction();
        try {
            this.f4791b.insert((AbstractC0644c<C0772m>) c0772m);
            this.f4790a.setTransactionSuccessful();
        } finally {
            this.f4790a.endTransaction();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0773n
    public void delete(String str) {
        this.f4790a.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.f4792c.acquire();
        if (str == null) {
            acquire.mo4646I0(1);
        } else {
            acquire.mo4654w(1, str);
        }
        this.f4790a.beginTransaction();
        try {
            acquire.mo6470E();
            this.f4790a.setTransactionSuccessful();
        } finally {
            this.f4790a.endTransaction();
            this.f4792c.release(acquire);
        }
    }
}
