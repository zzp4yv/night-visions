package com.google.gson.p215t;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8530b;
import com.google.gson.C8533e;
import com.google.gson.InterfaceC8529a;
import com.google.gson.InterfaceC8546r;
import com.google.gson.p214s.InterfaceC8547a;
import com.google.gson.p214s.InterfaceC8550d;
import com.google.gson.p214s.InterfaceC8551e;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Excluder.java */
/* renamed from: com.google.gson.t.d */
/* loaded from: classes2.dex */
public final class C8558d implements InterfaceC8546r, Cloneable {

    /* renamed from: f */
    public static final C8558d f32527f = new C8558d();

    /* renamed from: j */
    private boolean f32531j;

    /* renamed from: g */
    private double f32528g = -1.0d;

    /* renamed from: h */
    private int f32529h = 136;

    /* renamed from: i */
    private boolean f32530i = true;

    /* renamed from: k */
    private List<InterfaceC8529a> f32532k = Collections.emptyList();

    /* renamed from: l */
    private List<InterfaceC8529a> f32533l = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Excluder.java */
    /* renamed from: com.google.gson.t.d$a */
    class a<T> extends AbstractC8545q<T> {

        /* renamed from: a */
        private AbstractC8545q<T> f32534a;

        /* renamed from: b */
        final /* synthetic */ boolean f32535b;

        /* renamed from: c */
        final /* synthetic */ boolean f32536c;

        /* renamed from: d */
        final /* synthetic */ C8533e f32537d;

        /* renamed from: e */
        final /* synthetic */ C8586a f32538e;

        a(boolean z, boolean z2, C8533e c8533e, C8586a c8586a) {
            this.f32535b = z;
            this.f32536c = z2;
            this.f32537d = c8533e;
            this.f32538e = c8586a;
        }

        /* renamed from: e */
        private AbstractC8545q<T> m27083e() {
            AbstractC8545q<T> abstractC8545q = this.f32534a;
            if (abstractC8545q != null) {
                return abstractC8545q;
            }
            AbstractC8545q<T> m26928l = this.f32537d.m26928l(C8558d.this, this.f32538e);
            this.f32534a = m26928l;
            return m26928l;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: b */
        public T mo26938b(C8552a c8552a) throws IOException {
            if (!this.f32535b) {
                return m27083e().mo26938b(c8552a);
            }
            c8552a.mo27011n0();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: d */
        public void mo26939d(C8554c c8554c, T t) throws IOException {
            if (this.f32536c) {
                c8554c.mo27043y();
            } else {
                m27083e().mo26939d(c8554c, t);
            }
        }
    }

    /* renamed from: f */
    private boolean m27072f(Class<?> cls) {
        if (this.f32528g == -1.0d || m27079n((InterfaceC8550d) cls.getAnnotation(InterfaceC8550d.class), (InterfaceC8551e) cls.getAnnotation(InterfaceC8551e.class))) {
            return (!this.f32530i && m27075j(cls)) || m27074i(cls);
        }
        return true;
    }

    /* renamed from: g */
    private boolean m27073g(Class<?> cls, boolean z) {
        Iterator<InterfaceC8529a> it = (z ? this.f32532k : this.f32533l).iterator();
        while (it.hasNext()) {
            if (it.next().m26911b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m27074i(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: j */
    private boolean m27075j(Class<?> cls) {
        return cls.isMemberClass() && !m27076k(cls);
    }

    /* renamed from: k */
    private boolean m27076k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: l */
    private boolean m27077l(InterfaceC8550d interfaceC8550d) {
        return interfaceC8550d == null || interfaceC8550d.value() <= this.f32528g;
    }

    /* renamed from: m */
    private boolean m27078m(InterfaceC8551e interfaceC8551e) {
        return interfaceC8551e == null || interfaceC8551e.value() > this.f32528g;
    }

    /* renamed from: n */
    private boolean m27079n(InterfaceC8550d interfaceC8550d, InterfaceC8551e interfaceC8551e) {
        return m27077l(interfaceC8550d) && m27078m(interfaceC8551e);
    }

    @Override // com.google.gson.InterfaceC8546r
    /* renamed from: b */
    public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
        Class<? super T> rawType = c8586a.getRawType();
        boolean m27072f = m27072f(rawType);
        boolean z = m27072f || m27073g(rawType, true);
        boolean z2 = m27072f || m27073g(rawType, false);
        if (z || z2) {
            return new a(z2, z, c8533e, c8586a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C8558d clone() {
        try {
            return (C8558d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: e */
    public boolean m27081e(Class<?> cls, boolean z) {
        return m27072f(cls) || m27073g(cls, z);
    }

    /* renamed from: h */
    public boolean m27082h(Field field, boolean z) {
        InterfaceC8547a interfaceC8547a;
        if ((this.f32529h & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f32528g != -1.0d && !m27079n((InterfaceC8550d) field.getAnnotation(InterfaceC8550d.class), (InterfaceC8551e) field.getAnnotation(InterfaceC8551e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f32531j && ((interfaceC8547a = (InterfaceC8547a) field.getAnnotation(InterfaceC8547a.class)) == null || (!z ? interfaceC8547a.deserialize() : interfaceC8547a.serialize()))) {
            return true;
        }
        if ((!this.f32530i && m27075j(field.getType())) || m27074i(field.getType())) {
            return true;
        }
        List<InterfaceC8529a> list = z ? this.f32532k : this.f32533l;
        if (list.isEmpty()) {
            return false;
        }
        C8530b c8530b = new C8530b(field);
        Iterator<InterfaceC8529a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m26910a(c8530b)) {
                return true;
            }
        }
        return false;
    }
}
