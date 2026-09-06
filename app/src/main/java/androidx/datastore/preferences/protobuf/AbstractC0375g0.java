package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0357a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* renamed from: androidx.datastore.preferences.protobuf.g0 */
/* loaded from: classes.dex */
abstract class AbstractC0375g0 {

    /* renamed from: a */
    private static final AbstractC0375g0 f2731a;

    /* renamed from: b */
    private static final AbstractC0375g0 f2732b;

    /* compiled from: ListFieldSchema.java */
    /* renamed from: androidx.datastore.preferences.protobuf.g0$b */
    private static final class b extends AbstractC0375g0 {

        /* renamed from: c */
        private static final Class<?> f2733c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m2706f(Object obj, long j2) {
            return (List) C0403p1.m3081A(obj, j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        private static <L> List<L> m2707g(Object obj, long j2, int i2) {
            C0369e0 c0369e0;
            List<L> m2706f = m2706f(obj, j2);
            if (m2706f.isEmpty()) {
                List<L> c0369e02 = m2706f instanceof InterfaceC0372f0 ? new C0369e0(i2) : ((m2706f instanceof InterfaceC0426z0) && (m2706f instanceof C0357a0.i)) ? ((C0357a0.i) m2706f).mo2570J(i2) : new ArrayList<>(i2);
                C0403p1.m3095O(obj, j2, c0369e02);
                return c0369e02;
            }
            if (f2733c.isAssignableFrom(m2706f.getClass())) {
                ArrayList arrayList = new ArrayList(m2706f.size() + i2);
                arrayList.addAll(m2706f);
                C0403p1.m3095O(obj, j2, arrayList);
                c0369e0 = arrayList;
            } else {
                if (!(m2706f instanceof C0400o1)) {
                    if (!(m2706f instanceof InterfaceC0426z0) || !(m2706f instanceof C0357a0.i)) {
                        return m2706f;
                    }
                    C0357a0.i iVar = (C0357a0.i) m2706f;
                    if (iVar.mo2571l1()) {
                        return m2706f;
                    }
                    C0357a0.i mo2570J = iVar.mo2570J(m2706f.size() + i2);
                    C0403p1.m3095O(obj, j2, mo2570J);
                    return mo2570J;
                }
                C0369e0 c0369e03 = new C0369e0(m2706f.size() + i2);
                c0369e03.addAll((C0400o1) m2706f);
                C0403p1.m3095O(obj, j2, c0369e03);
                c0369e0 = c0369e03;
            }
            return c0369e0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: c */
        void mo2703c(Object obj, long j2) {
            Object unmodifiableList;
            List list = (List) C0403p1.m3081A(obj, j2);
            if (list instanceof InterfaceC0372f0) {
                unmodifiableList = ((InterfaceC0372f0) list).mo2677k();
            } else {
                if (f2733c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC0426z0) && (list instanceof C0357a0.i)) {
                    C0357a0.i iVar = (C0357a0.i) list;
                    if (iVar.mo2571l1()) {
                        iVar.mo2569B();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            C0403p1.m3095O(obj, j2, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: d */
        <E> void mo2704d(Object obj, Object obj2, long j2) {
            List m2706f = m2706f(obj2, j2);
            List m2707g = m2707g(obj, j2, m2706f.size());
            int size = m2707g.size();
            int size2 = m2706f.size();
            if (size > 0 && size2 > 0) {
                m2707g.addAll(m2706f);
            }
            if (size > 0) {
                m2706f = m2707g;
            }
            C0403p1.m3095O(obj, j2, m2706f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: e */
        <L> List<L> mo2705e(Object obj, long j2) {
            return m2707g(obj, j2, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    /* renamed from: androidx.datastore.preferences.protobuf.g0$c */
    private static final class c extends AbstractC0375g0 {
        private c() {
            super();
        }

        /* renamed from: f */
        static <E> C0357a0.i<E> m2708f(Object obj, long j2) {
            return (C0357a0.i) C0403p1.m3081A(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: c */
        void mo2703c(Object obj, long j2) {
            m2708f(obj, j2).mo2569B();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: d */
        <E> void mo2704d(Object obj, Object obj2, long j2) {
            C0357a0.i m2708f = m2708f(obj, j2);
            C0357a0.i m2708f2 = m2708f(obj2, j2);
            int size = m2708f.size();
            int size2 = m2708f2.size();
            if (size > 0 && size2 > 0) {
                if (!m2708f.mo2571l1()) {
                    m2708f = m2708f.mo2570J(size2 + size);
                }
                m2708f.addAll(m2708f2);
            }
            if (size > 0) {
                m2708f2 = m2708f;
            }
            C0403p1.m3095O(obj, j2, m2708f2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0375g0
        /* renamed from: e */
        <L> List<L> mo2705e(Object obj, long j2) {
            C0357a0.i m2708f = m2708f(obj, j2);
            if (m2708f.mo2571l1()) {
                return m2708f;
            }
            int size = m2708f.size();
            C0357a0.i mo2570J = m2708f.mo2570J(size == 0 ? 10 : size * 2);
            C0403p1.m3095O(obj, j2, mo2570J);
            return mo2570J;
        }
    }

    static {
        f2731a = new b();
        f2732b = new c();
    }

    /* renamed from: a */
    static AbstractC0375g0 m2701a() {
        return f2731a;
    }

    /* renamed from: b */
    static AbstractC0375g0 m2702b() {
        return f2732b;
    }

    /* renamed from: c */
    abstract void mo2703c(Object obj, long j2);

    /* renamed from: d */
    abstract <L> void mo2704d(Object obj, Object obj2, long j2);

    /* renamed from: e */
    abstract <L> List<L> mo2705e(Object obj, long j2);

    private AbstractC0375g0() {
    }
}
