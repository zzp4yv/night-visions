package androidx.work.impl.p016n;

import android.database.Cursor;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.p010t.C0663c;
import java.util.ArrayList;
import java.util.List;
import p024c.p082u.p083a.InterfaceC1012f;

/* compiled from: WorkNameDao_Impl.java */
/* renamed from: androidx.work.impl.n.l */
/* loaded from: classes.dex */
public final class C0771l implements InterfaceC0770k {

    /* renamed from: a */
    private final AbstractC0651j f4785a;

    /* renamed from: b */
    private final AbstractC0644c<C0769j> f4786b;

    /* compiled from: WorkNameDao_Impl.java */
    /* renamed from: androidx.work.impl.n.l$a */
    class a extends AbstractC0644c<C0769j> {
        a(AbstractC0651j abstractC0651j) {
            super(abstractC0651j);
        }

        @Override // androidx.room.AbstractC0644c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC1012f interfaceC1012f, C0769j c0769j) {
            String str = c0769j.f4783a;
            if (str == null) {
                interfaceC1012f.mo4646I0(1);
            } else {
                interfaceC1012f.mo4654w(1, str);
            }
            String str2 = c0769j.f4784b;
            if (str2 == null) {
                interfaceC1012f.mo4646I0(2);
            } else {
                interfaceC1012f.mo4654w(2, str2);
            }
        }

        @Override // androidx.room.AbstractC0658q
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public C0771l(AbstractC0651j abstractC0651j) {
        this.f4785a = abstractC0651j;
        this.f4786b = new a(abstractC0651j);
    }

    @Override // androidx.work.impl.p016n.InterfaceC0770k
    /* renamed from: a */
    public void mo5084a(C0769j c0769j) {
        this.f4785a.assertNotSuspendingTransaction();
        this.f4785a.beginTransaction();
        try {
            this.f4786b.insert((AbstractC0644c<C0769j>) c0769j);
            this.f4785a.setTransactionSuccessful();
        } finally {
            this.f4785a.endTransaction();
        }
    }

    @Override // androidx.work.impl.p016n.InterfaceC0770k
    /* renamed from: b */
    public List<String> mo5085b(String str) {
        C0654m m4644c = C0654m.m4644c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        this.f4785a.assertNotSuspendingTransaction();
        Cursor m4675b = C0663c.m4675b(this.f4785a, m4644c, false, null);
        try {
            ArrayList arrayList = new ArrayList(m4675b.getCount());
            while (m4675b.moveToNext()) {
                arrayList.add(m4675b.getString(0));
            }
            return arrayList;
        } finally {
            m4675b.close();
            m4644c.m4651f();
        }
    }
}
