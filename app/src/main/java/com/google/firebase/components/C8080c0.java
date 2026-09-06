package com.google.firebase.components;

import com.google.firebase.p203q.InterfaceC8448c;
import com.google.firebase.p205s.InterfaceC8462a;
import com.google.firebase.p205s.InterfaceC8463b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* renamed from: com.google.firebase.components.c0 */
/* loaded from: classes2.dex */
final class C8080c0 implements InterfaceC8093p {

    /* renamed from: a */
    private final Set<C8078b0<?>> f30677a;

    /* renamed from: b */
    private final Set<C8078b0<?>> f30678b;

    /* renamed from: c */
    private final Set<C8078b0<?>> f30679c;

    /* renamed from: d */
    private final Set<C8078b0<?>> f30680d;

    /* renamed from: e */
    private final Set<C8078b0<?>> f30681e;

    /* renamed from: f */
    private final Set<Class<?>> f30682f;

    /* renamed from: g */
    private final InterfaceC8093p f30683g;

    /* compiled from: RestrictedComponentContainer.java */
    /* renamed from: com.google.firebase.components.c0$a */
    private static class a implements InterfaceC8448c {

        /* renamed from: a */
        private final Set<Class<?>> f30684a;

        /* renamed from: b */
        private final InterfaceC8448c f30685b;

        public a(Set<Class<?>> set, InterfaceC8448c interfaceC8448c) {
            this.f30684a = set;
            this.f30685b = interfaceC8448c;
        }
    }

    C8080c0(C8091n<?> c8091n, InterfaceC8093p interfaceC8093p) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C8099v c8099v : c8091n.m24993e()) {
            if (c8099v.m25066e()) {
                if (c8099v.m25068g()) {
                    hashSet4.add(c8099v.m25064c());
                } else {
                    hashSet.add(c8099v.m25064c());
                }
            } else if (c8099v.m25065d()) {
                hashSet3.add(c8099v.m25064c());
            } else if (c8099v.m25068g()) {
                hashSet5.add(c8099v.m25064c());
            } else {
                hashSet2.add(c8099v.m25064c());
            }
        }
        if (!c8091n.m24997i().isEmpty()) {
            hashSet.add(C8078b0.m24972b(InterfaceC8448c.class));
        }
        this.f30677a = Collections.unmodifiableSet(hashSet);
        this.f30678b = Collections.unmodifiableSet(hashSet2);
        this.f30679c = Collections.unmodifiableSet(hashSet3);
        this.f30680d = Collections.unmodifiableSet(hashSet4);
        this.f30681e = Collections.unmodifiableSet(hashSet5);
        this.f30682f = c8091n.m24997i();
        this.f30683g = interfaceC8093p;
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: a */
    public <T> T mo24973a(Class<T> cls) {
        if (!this.f30677a.contains(C8078b0.m24972b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f30683g.mo24973a(cls);
        return !cls.equals(InterfaceC8448c.class) ? t : (T) new a(this.f30682f, (InterfaceC8448c) t);
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: b */
    public <T> InterfaceC8463b<T> mo24974b(C8078b0<T> c8078b0) {
        if (this.f30678b.contains(c8078b0)) {
            return this.f30683g.mo24974b(c8078b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", c8078b0));
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: c */
    public <T> InterfaceC8463b<T> mo24975c(Class<T> cls) {
        return mo24974b(C8078b0.m24972b(cls));
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: d */
    public <T> Set<T> mo24976d(C8078b0<T> c8078b0) {
        if (this.f30680d.contains(c8078b0)) {
            return this.f30683g.mo24976d(c8078b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", c8078b0));
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: e */
    public <T> InterfaceC8463b<Set<T>> mo24977e(C8078b0<T> c8078b0) {
        if (this.f30681e.contains(c8078b0)) {
            return this.f30683g.mo24977e(c8078b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c8078b0));
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: f */
    public <T> T mo24978f(C8078b0<T> c8078b0) {
        if (this.f30677a.contains(c8078b0)) {
            return (T) this.f30683g.mo24978f(c8078b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", c8078b0));
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: g */
    public /* synthetic */ Set mo24979g(Class cls) {
        return C8092o.m25017f(this, cls);
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: h */
    public <T> InterfaceC8462a<T> mo24980h(C8078b0<T> c8078b0) {
        if (this.f30679c.contains(c8078b0)) {
            return this.f30683g.mo24980h(c8078b0);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c8078b0));
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: i */
    public <T> InterfaceC8462a<T> mo24981i(Class<T> cls) {
        return mo24980h(C8078b0.m24972b(cls));
    }
}
