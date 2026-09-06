package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.InterfaceC6193b;
import com.google.ads.mediation.InterfaceC6201e;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p241e.p254e.p255a.C8750c;

@zzard
/* loaded from: classes2.dex */
public final class zzant<NETWORK_EXTRAS extends InterfaceC6201e, SERVER_PARAMETERS extends MediationServerParameters> extends zzamt {

    /* renamed from: f */
    private final InterfaceC6193b<NETWORK_EXTRAS, SERVER_PARAMETERS> f22210f;

    /* renamed from: g */
    private final NETWORK_EXTRAS f22211g;

    public zzant(InterfaceC6193b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC6193b, NETWORK_EXTRAS network_extras) {
        this.f22210f = interfaceC6193b;
        this.f22211g = network_extras;
    }

    /* renamed from: h7 */
    private static boolean m16805h7(zzxz zzxzVar) {
        if (zzxzVar.f27407k) {
            return true;
        }
        zzyt.m20844a();
        return zzazt.m17317v();
    }

    /* renamed from: i7 */
    private final SERVER_PARAMETERS m16806i7(String str) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.f22210f.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
            newInstance.m13391a(hashMap);
            return newInstance;
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: F2 */
    public final zzafe mo16697F2() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: G4 */
    public final void mo16698G4(IObjectWrapper iObjectWrapper, zzaiq zzaiqVar, List<zzaiw> list) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: H4 */
    public final void mo16699H4(IObjectWrapper iObjectWrapper, zzatk zzatkVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: M3 */
    public final void mo16700M3(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar, zzady zzadyVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: P1 */
    public final zzang mo16701P1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: Q2 */
    public final void mo16702Q2(zzxz zzxzVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: Y2 */
    public final void mo16703Y2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        mo16706c6(iObjectWrapper, zzxzVar, str, null, zzamvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: a4 */
    public final void mo16704a4(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: b7 */
    public final zzana mo16705b7() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: c6 */
    public final void mo16706c6(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        InterfaceC6193b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC6193b = this.f22210f;
        if (!(interfaceC6193b instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(interfaceC6193b.getClass().getCanonicalName());
            zzbad.m17353i(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbad.m17349e("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f22210f).requestInterstitialAd(new zzanu(zzamvVar), (Activity) ObjectWrapper.m14709k0(iObjectWrapper), m16806i7(str), zzaog.m16809b(zzxzVar, m16805h7(zzxzVar)), this.f22211g);
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void destroy() throws RemoteException {
        try {
            this.f22210f.destroy();
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: e6 */
    public final zzand mo16707e6() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: f2 */
    public final void mo16708f2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzaar getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: h4 */
    public final void mo16709h4(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzatk zzatkVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: o6 */
    public final void mo16710o6(zzxz zzxzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: r4 */
    public final Bundle mo16711r4() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: s4 */
    public final void mo16712s4(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        C8750c c8750c;
        InterfaceC6193b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC6193b = this.f22210f;
        if (!(interfaceC6193b instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(interfaceC6193b.getClass().getCanonicalName());
            zzbad.m17353i(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzbad.m17349e("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f22210f;
            zzanu zzanuVar = new zzanu(zzamvVar);
            Activity activity = (Activity) ObjectWrapper.m14709k0(iObjectWrapper);
            SERVER_PARAMETERS m16806i7 = m16806i7(str);
            int i2 = 0;
            C8750c[] c8750cArr = {C8750c.f33403a, C8750c.f33404b, C8750c.f33405c, C8750c.f33406d, C8750c.f33407e, C8750c.f33408f};
            while (true) {
                if (i2 >= 6) {
                    c8750c = new C8750c(com.google.android.gms.ads.zzb.zza(zzydVar.f27451j, zzydVar.f27448g, zzydVar.f27447f));
                    break;
                } else {
                    if (c8750cArr[i2].m27941b() == zzydVar.f27451j && c8750cArr[i2].m27940a() == zzydVar.f27448g) {
                        c8750c = c8750cArr[i2];
                        break;
                    }
                    i2++;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzanuVar, activity, m16806i7, c8750c, zzaog.m16809b(zzxzVar, m16805h7(zzxzVar)), this.f22211g);
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showInterstitial() throws RemoteException {
        InterfaceC6193b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC6193b = this.f22210f;
        if (!(interfaceC6193b instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(interfaceC6193b.getClass().getCanonicalName());
            zzbad.m17353i(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbad.m17349e("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f22210f).showInterstitial();
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: w0 */
    public final void mo16713w0(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: x1 */
    public final IObjectWrapper mo16714x1() throws RemoteException {
        InterfaceC6193b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC6193b = this.f22210f;
        if (!(interfaceC6193b instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(interfaceC6193b.getClass().getCanonicalName());
            zzbad.m17353i(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.m14708E0(((MediationBannerAdapter) interfaceC6193b).getBannerView());
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: x3 */
    public final boolean mo16715x3() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: y2 */
    public final void mo16716y2(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        mo16712s4(iObjectWrapper, zzydVar, zzxzVar, str, null, zzamvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle zzsh() {
        return new Bundle();
    }
}
