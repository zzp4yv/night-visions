package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0363c0;
import androidx.datastore.preferences.protobuf.C0409r1;
import androidx.datastore.preferences.protobuf.C0415u;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* renamed from: androidx.datastore.preferences.protobuf.u0 */
/* loaded from: classes.dex */
final class C0416u0<T> implements InterfaceC0373f1<T> {

    /* renamed from: a */
    private final InterfaceC0405q0 f2940a;

    /* renamed from: b */
    private final AbstractC0391l1<?, ?> f2941b;

    /* renamed from: c */
    private final boolean f2942c;

    /* renamed from: d */
    private final AbstractC0404q<?> f2943d;

    private C0416u0(AbstractC0391l1<?, ?> abstractC0391l1, AbstractC0404q<?> abstractC0404q, InterfaceC0405q0 interfaceC0405q0) {
        this.f2941b = abstractC0391l1;
        this.f2942c = abstractC0404q.mo3146e(interfaceC0405q0);
        this.f2943d = abstractC0404q;
        this.f2940a = interfaceC0405q0;
    }

    /* renamed from: j */
    private <UT, UB> int m3306j(AbstractC0391l1<UT, UB> abstractC0391l1, T t) {
        return abstractC0391l1.mo3006i(abstractC0391l1.mo3004g(t));
    }

    /* renamed from: k */
    private <UT, UB, ET extends C0415u.b<ET>> void m3307k(AbstractC0391l1<UT, UB> abstractC0391l1, AbstractC0404q<ET> abstractC0404q, T t, InterfaceC0370e1 interfaceC0370e1, C0401p c0401p) throws IOException {
        UB mo3003f = abstractC0391l1.mo3003f(t);
        C0415u<ET> mo3145d = abstractC0404q.mo3145d(t);
        do {
            try {
                if (interfaceC0370e1.mo2626A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC0391l1.mo3012o(t, mo3003f);
            }
        } while (m3309m(interfaceC0370e1, c0401p, abstractC0404q, mo3145d, abstractC0391l1, mo3003f));
    }

    /* renamed from: l */
    static <T> C0416u0<T> m3308l(AbstractC0391l1<?, ?> abstractC0391l1, AbstractC0404q<?> abstractC0404q, InterfaceC0405q0 interfaceC0405q0) {
        return new C0416u0<>(abstractC0391l1, abstractC0404q, interfaceC0405q0);
    }

    /* renamed from: m */
    private <UT, UB, ET extends C0415u.b<ET>> boolean m3309m(InterfaceC0370e1 interfaceC0370e1, C0401p c0401p, AbstractC0404q<ET> abstractC0404q, C0415u<ET> c0415u, AbstractC0391l1<UT, UB> abstractC0391l1, UB ub) throws IOException {
        int tag = interfaceC0370e1.getTag();
        if (tag != C0409r1.f2874a) {
            if (C0409r1.m3203b(tag) != 2) {
                return interfaceC0370e1.mo2632G();
            }
            Object mo3143b = abstractC0404q.mo3143b(c0401p, this.f2940a, C0409r1.m3202a(tag));
            if (mo3143b == null) {
                return abstractC0391l1.m3010m(ub, interfaceC0370e1);
            }
            abstractC0404q.mo3149h(interfaceC0370e1, mo3143b, c0401p, c0415u);
            return true;
        }
        int i2 = 0;
        Object obj = null;
        AbstractC0377h abstractC0377h = null;
        while (interfaceC0370e1.mo2626A() != Integer.MAX_VALUE) {
            int tag2 = interfaceC0370e1.getTag();
            if (tag2 == C0409r1.f2876c) {
                i2 = interfaceC0370e1.mo2659p();
                obj = abstractC0404q.mo3143b(c0401p, this.f2940a, i2);
            } else if (tag2 == C0409r1.f2877d) {
                if (obj != null) {
                    abstractC0404q.mo3149h(interfaceC0370e1, obj, c0401p, c0415u);
                } else {
                    abstractC0377h = interfaceC0370e1.mo2628C();
                }
            } else if (!interfaceC0370e1.mo2632G()) {
                break;
            }
        }
        if (interfaceC0370e1.getTag() != C0409r1.f2875b) {
            throw InvalidProtocolBufferException.m2530a();
        }
        if (abstractC0377h != null) {
            if (obj != null) {
                abstractC0404q.mo3150i(abstractC0377h, obj, c0401p, c0415u);
            } else {
                abstractC0391l1.mo3001d(ub, i2, abstractC0377h);
            }
        }
        return true;
    }

    /* renamed from: n */
    private <UT, UB> void m3310n(AbstractC0391l1<UT, UB> abstractC0391l1, T t, InterfaceC0412s1 interfaceC0412s1) throws IOException {
        abstractC0391l1.mo3016s(abstractC0391l1.mo3004g(t), interfaceC0412s1);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: a */
    public void mo2692a(T t, T t2) {
        C0379h1.m2760G(this.f2941b, t, t2);
        if (this.f2942c) {
            C0379h1.m2758E(this.f2943d, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: b */
    public boolean mo2693b(T t, T t2) {
        if (!this.f2941b.mo3004g(t).equals(this.f2941b.mo3004g(t2))) {
            return false;
        }
        if (this.f2942c) {
            return this.f2943d.mo3144c(t).equals(this.f2943d.mo3144c(t2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: c */
    public T mo2694c() {
        return (T) this.f2940a.mo3154f().mo3157J0();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: d */
    public int mo2695d(T t) {
        int hashCode = this.f2941b.mo3004g(t).hashCode();
        return this.f2942c ? (hashCode * 53) + this.f2943d.mo3144c(t).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: e */
    public void mo2696e(T t, InterfaceC0370e1 interfaceC0370e1, C0401p c0401p) throws IOException {
        m3307k(this.f2941b, this.f2943d, t, interfaceC0370e1, c0401p);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: f */
    public void mo2697f(T t) {
        this.f2941b.mo3007j(t);
        this.f2943d.mo3147f(t);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: g */
    public final boolean mo2698g(T t) {
        return this.f2943d.mo3144c(t).m3295p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: h */
    public void mo2699h(T t, InterfaceC0412s1 interfaceC0412s1) throws IOException {
        Iterator<Map.Entry<?, Object>> m3296s = this.f2943d.mo3144c(t).m3296s();
        while (m3296s.hasNext()) {
            Map.Entry<?, Object> next = m3296s.next();
            C0415u.b bVar = (C0415u.b) next.getKey();
            if (bVar.mo3304l() != C0409r1.c.MESSAGE || bVar.mo3302h() || bVar.mo3305m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof C0363c0.b) {
                interfaceC0412s1.mo2966c(bVar.mo3301f(), ((C0363c0.b) next).m2585a().m2599e());
            } else {
                interfaceC0412s1.mo2966c(bVar.mo3301f(), next.getValue());
            }
        }
        m3310n(this.f2941b, t, interfaceC0412s1);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0373f1
    /* renamed from: i */
    public int mo2700i(T t) {
        int m3306j = m3306j(this.f2941b, t) + 0;
        return this.f2942c ? m3306j + this.f2943d.mo3144c(t).m3291j() : m3306j;
    }
}
