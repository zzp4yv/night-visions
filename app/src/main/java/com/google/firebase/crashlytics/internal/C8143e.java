package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8227g0;
import com.google.firebase.p205s.InterfaceC8462a;
import com.google.firebase.p205s.InterfaceC8463b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* renamed from: com.google.firebase.crashlytics.h.e */
/* loaded from: classes2.dex */
public final class C8143e implements InterfaceC8142d {

    /* renamed from: a */
    private static final InterfaceC8147i f30851a = new b();

    /* renamed from: b */
    private final InterfaceC8462a<InterfaceC8142d> f30852b;

    /* renamed from: c */
    private final AtomicReference<InterfaceC8142d> f30853c = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* renamed from: com.google.firebase.crashlytics.h.e$b */
    private static final class b implements InterfaceC8147i {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8147i
        /* renamed from: a */
        public File mo25160a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8147i
        /* renamed from: b */
        public File mo25161b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8147i
        /* renamed from: c */
        public File mo25162c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8147i
        /* renamed from: d */
        public AbstractC8225f0.a mo25163d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8147i
        /* renamed from: e */
        public File mo25164e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8147i
        /* renamed from: f */
        public File mo25165f() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8147i
        /* renamed from: g */
        public File mo25166g() {
            return null;
        }
    }

    public C8143e(InterfaceC8462a<InterfaceC8142d> interfaceC8462a) {
        this.f30852b = interfaceC8462a;
        interfaceC8462a.mo25084a(new InterfaceC8462a.a() { // from class: com.google.firebase.crashlytics.h.a
            @Override // com.google.firebase.p205s.InterfaceC8462a.a
            /* renamed from: a */
            public final void mo24982a(InterfaceC8463b interfaceC8463b) {
                C8143e.this.m25159f(interfaceC8463b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25159f(InterfaceC8463b interfaceC8463b) {
        C8146h.m25176f().m25177b("Crashlytics native component now available.");
        this.f30853c.set((InterfaceC8142d) interfaceC8463b.get());
    }

    @Override // com.google.firebase.crashlytics.internal.InterfaceC8142d
    /* renamed from: a */
    public InterfaceC8147i mo25153a(String str) {
        InterfaceC8142d interfaceC8142d = this.f30853c.get();
        return interfaceC8142d == null ? f30851a : interfaceC8142d.mo25153a(str);
    }

    @Override // com.google.firebase.crashlytics.internal.InterfaceC8142d
    /* renamed from: b */
    public boolean mo25154b() {
        InterfaceC8142d interfaceC8142d = this.f30853c.get();
        return interfaceC8142d != null && interfaceC8142d.mo25154b();
    }

    @Override // com.google.firebase.crashlytics.internal.InterfaceC8142d
    /* renamed from: c */
    public void mo25155c(final String str, final String str2, final long j2, final AbstractC8227g0 abstractC8227g0) {
        C8146h.m25176f().m25183i("Deferring native open session: " + str);
        this.f30852b.mo25084a(new InterfaceC8462a.a() { // from class: com.google.firebase.crashlytics.h.b
            @Override // com.google.firebase.p205s.InterfaceC8462a.a
            /* renamed from: a */
            public final void mo24982a(InterfaceC8463b interfaceC8463b) {
                ((InterfaceC8142d) interfaceC8463b.get()).mo25155c(str, str2, j2, abstractC8227g0);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.internal.InterfaceC8142d
    /* renamed from: d */
    public boolean mo25156d(String str) {
        InterfaceC8142d interfaceC8142d = this.f30853c.get();
        return interfaceC8142d != null && interfaceC8142d.mo25156d(str);
    }
}
