package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vv */
/* loaded from: classes2.dex */
final class C7246vv implements InterfaceC7209uv {
    C7246vv() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7209uv
    /* renamed from: a */
    public final Object mo15936a(Object obj, Object obj2) {
        zzdpe zzdpeVar = (zzdpe) obj;
        zzdpe zzdpeVar2 = (zzdpe) obj2;
        if (!zzdpeVar2.isEmpty()) {
            if (!zzdpeVar.m19775b()) {
                zzdpeVar = zzdpeVar.m19778i();
            }
            zzdpeVar.m19776d(zzdpeVar2);
        }
        return zzdpeVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7209uv
    /* renamed from: b */
    public final Map<?, ?> mo15937b(Object obj) {
        return (zzdpe) obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7209uv
    /* renamed from: c */
    public final boolean mo15938c(Object obj) {
        return !((zzdpe) obj).m19775b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7209uv
    /* renamed from: d */
    public final Object mo15939d(Object obj) {
        ((zzdpe) obj).m19777f();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7209uv
    /* renamed from: e */
    public final Object mo15940e(Object obj) {
        return zzdpe.m19773h().m19778i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7209uv
    /* renamed from: f */
    public final int mo15941f(int i2, Object obj, Object obj2) {
        zzdpe zzdpeVar = (zzdpe) obj;
        if (zzdpeVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzdpeVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7209uv
    /* renamed from: g */
    public final C7172tv<?, ?> mo15942g(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7209uv
    /* renamed from: h */
    public final Map<?, ?> mo15943h(Object obj) {
        return (zzdpe) obj;
    }
}
