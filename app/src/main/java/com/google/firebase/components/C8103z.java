package com.google.firebase.components;

import com.google.firebase.p205s.InterfaceC8462a;
import com.google.firebase.p205s.InterfaceC8463b;

/* compiled from: OptionalProvider.java */
/* renamed from: com.google.firebase.components.z */
/* loaded from: classes2.dex */
class C8103z<T> implements InterfaceC8463b<T>, InterfaceC8462a<T> {

    /* renamed from: a */
    private static final InterfaceC8462a.a<Object> f30748a = new InterfaceC8462a.a() { // from class: com.google.firebase.components.k
        @Override // com.google.firebase.p205s.InterfaceC8462a.a
        /* renamed from: a */
        public final void mo24982a(InterfaceC8463b interfaceC8463b) {
            C8103z.m25080c(interfaceC8463b);
        }
    };

    /* renamed from: b */
    private static final InterfaceC8463b<Object> f30749b = new InterfaceC8463b() { // from class: com.google.firebase.components.j
        @Override // com.google.firebase.p205s.InterfaceC8463b
        public final Object get() {
            C8103z.m25081d();
            return null;
        }
    };

    /* renamed from: c */
    private InterfaceC8462a.a<T> f30750c;

    /* renamed from: d */
    private volatile InterfaceC8463b<T> f30751d;

    private C8103z(InterfaceC8462a.a<T> aVar, InterfaceC8463b<T> interfaceC8463b) {
        this.f30750c = aVar;
        this.f30751d = interfaceC8463b;
    }

    /* renamed from: b */
    static <T> C8103z<T> m25079b() {
        return new C8103z<>(f30748a, f30749b);
    }

    /* renamed from: c */
    static /* synthetic */ void m25080c(InterfaceC8463b interfaceC8463b) {
    }

    /* renamed from: d */
    static /* synthetic */ Object m25081d() {
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ void m25082e(InterfaceC8462a.a aVar, InterfaceC8462a.a aVar2, InterfaceC8463b interfaceC8463b) {
        aVar.mo24982a(interfaceC8463b);
        aVar2.mo24982a(interfaceC8463b);
    }

    /* renamed from: f */
    static <T> C8103z<T> m25083f(InterfaceC8463b<T> interfaceC8463b) {
        return new C8103z<>(null, interfaceC8463b);
    }

    @Override // com.google.firebase.p205s.InterfaceC8462a
    /* renamed from: a */
    public void mo25084a(final InterfaceC8462a.a<T> aVar) {
        InterfaceC8463b<T> interfaceC8463b;
        InterfaceC8463b<T> interfaceC8463b2 = this.f30751d;
        InterfaceC8463b<Object> interfaceC8463b3 = f30749b;
        if (interfaceC8463b2 != interfaceC8463b3) {
            aVar.mo24982a(interfaceC8463b2);
            return;
        }
        InterfaceC8463b<T> interfaceC8463b4 = null;
        synchronized (this) {
            interfaceC8463b = this.f30751d;
            if (interfaceC8463b != interfaceC8463b3) {
                interfaceC8463b4 = interfaceC8463b;
            } else {
                final InterfaceC8462a.a<T> aVar2 = this.f30750c;
                this.f30750c = new InterfaceC8462a.a() { // from class: com.google.firebase.components.l
                    @Override // com.google.firebase.p205s.InterfaceC8462a.a
                    /* renamed from: a */
                    public final void mo24982a(InterfaceC8463b interfaceC8463b5) {
                        C8103z.m25082e(InterfaceC8462a.a.this, aVar, interfaceC8463b5);
                    }
                };
            }
        }
        if (interfaceC8463b4 != null) {
            aVar.mo24982a(interfaceC8463b);
        }
    }

    /* renamed from: g */
    void m25085g(InterfaceC8463b<T> interfaceC8463b) {
        InterfaceC8462a.a<T> aVar;
        if (this.f30751d != f30749b) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f30750c;
            this.f30750c = null;
            this.f30751d = interfaceC8463b;
        }
        aVar.mo24982a(interfaceC8463b);
    }

    @Override // com.google.firebase.p205s.InterfaceC8463b
    public T get() {
        return this.f30751d.get();
    }
}
