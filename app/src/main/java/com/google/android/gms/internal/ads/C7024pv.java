package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* renamed from: com.google.android.gms.internal.ads.pv */
/* loaded from: classes2.dex */
final class C7024pv implements InterfaceC6914mw {

    /* renamed from: a */
    private static final InterfaceC7357yv f20331a = new C7098rv();

    /* renamed from: b */
    private final InterfaceC7357yv f20332b;

    public C7024pv() {
        this(new C7135sv(C6654fv.m15150c(), m15785c()));
    }

    /* renamed from: b */
    private static boolean m15784b(InterfaceC7320xv interfaceC7320xv) {
        return interfaceC7320xv.mo15355c() == zzdob.zze.f25766i;
    }

    /* renamed from: c */
    private static InterfaceC7357yv m15785c() {
        try {
            return (InterfaceC7357yv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f20331a;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6914mw
    /* renamed from: a */
    public final <T> InterfaceC6877lw<T> mo15574a(Class<T> cls) {
        C6951nw.m15612L(cls);
        InterfaceC7320xv mo15151a = this.f20332b.mo15151a(cls);
        return mo15151a.mo15353a() ? zzdob.class.isAssignableFrom(cls) ? C6507bw.m14953k(C6951nw.m15649s(), C7319xu.m16047b(), mo15151a.mo15354b()) : C6507bw.m14953k(C6951nw.m15647q(), C7319xu.m16048c(), mo15151a.mo15354b()) : zzdob.class.isAssignableFrom(cls) ? m15784b(mo15151a) ? C6470aw.m14810p(cls, mo15151a, C6618ew.m15115b(), AbstractC6839kv.m15440d(), C6951nw.m15649s(), C7319xu.m16047b(), C7283wv.m15982b()) : C6470aw.m14810p(cls, mo15151a, C6618ew.m15115b(), AbstractC6839kv.m15440d(), C6951nw.m15649s(), null, C7283wv.m15982b()) : m15784b(mo15151a) ? C6470aw.m14810p(cls, mo15151a, C6618ew.m15114a(), AbstractC6839kv.m15439c(), C6951nw.m15647q(), C7319xu.m16048c(), C7283wv.m15981a()) : C6470aw.m14810p(cls, mo15151a, C6618ew.m15114a(), AbstractC6839kv.m15439c(), C6951nw.m15648r(), null, C7283wv.m15981a());
    }

    private C7024pv(InterfaceC7357yv interfaceC7357yv) {
        this.f20332b = (InterfaceC7357yv) zzdod.m19743d(interfaceC7357yv, "messageInfoFactory");
    }
}
