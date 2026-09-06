package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;
import p024c.p041e.C0873g;

/* loaded from: classes2.dex */
public final class zzccd extends zzaff {

    /* renamed from: f */
    private final Context f24046f;

    /* renamed from: g */
    private final zzbyt f24047g;

    /* renamed from: h */
    private final zzbzl f24048h;

    /* renamed from: i */
    private final zzbyn f24049i;

    public zzccd(Context context, zzbyt zzbytVar, zzbzl zzbzlVar, zzbyn zzbynVar) {
        this.f24046f = context;
        this.f24047g = zzbytVar;
        this.f24048h = zzbzlVar;
        this.f24049i = zzbynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: F3 */
    public final boolean mo16506F3(IObjectWrapper iObjectWrapper) {
        Object m14709k0 = ObjectWrapper.m14709k0(iObjectWrapper);
        if (!(m14709k0 instanceof ViewGroup) || !this.f24048h.m18596b((ViewGroup) m14709k0)) {
            return false;
        }
        this.f24047g.m18513A().mo14939x0(new C6751ih(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: N1 */
    public final zzaei mo16507N1(String str) {
        return this.f24047g.m18516D().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: U4 */
    public final IObjectWrapper mo16508U4() {
        return ObjectWrapper.m14708E0(this.f24046f);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: Y0 */
    public final String mo16509Y0(String str) {
        return this.f24047g.m18517E().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void destroy() {
        this.f24049i.mo18226a();
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final List<String> getAvailableAssetNames() {
        C0873g<String, zzadw> m18516D = this.f24047g.m18516D();
        C0873g<String, String> m18517E = this.f24047g.m18517E();
        String[] strArr = new String[m18516D.size() + m18517E.size()];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < m18516D.size()) {
            strArr[i4] = m18516D.m5473j(i3);
            i3++;
            i4++;
        }
        while (i2 < m18517E.size()) {
            strArr[i4] = m18517E.m5473j(i2);
            i2++;
            i4++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final String getCustomTemplateId() {
        return this.f24047g.m18537e();
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final zzaar getVideoController() {
        return this.f24047g.m18545m();
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void performClick(String str) {
        this.f24049i.m18501x(str);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    /* renamed from: r */
    public final IObjectWrapper mo16510r() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final void recordImpression() {
        this.f24049i.m18493p();
    }
}
