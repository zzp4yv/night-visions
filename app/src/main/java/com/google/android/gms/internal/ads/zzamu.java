package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzamu extends zzfm implements zzams {
    zzamu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: G4 */
    public final void mo16698G4(IObjectWrapper iObjectWrapper, zzaiq zzaiqVar, List<zzaiw> list) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19949c(m19944H, zzaiqVar);
        m19944H.writeTypedList(list);
        m19946k0(31, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: H4 */
    public final void mo16699H4(IObjectWrapper iObjectWrapper, zzatk zzatkVar, List<String> list) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19949c(m19944H, zzatkVar);
        m19944H.writeStringList(list);
        m19946k0(23, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: M3 */
    public final void mo16700M3(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar, zzady zzadyVar, List<String> list) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzxzVar);
        m19944H.writeString(str);
        m19944H.writeString(str2);
        zzfo.m19949c(m19944H, zzamvVar);
        zzfo.m19950d(m19944H, zzadyVar);
        m19944H.writeStringList(list);
        m19946k0(14, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: P1 */
    public final zzang mo16701P1() throws RemoteException {
        zzang zzaniVar;
        Parcel m19945P = m19945P(27, m19944H());
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzaniVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzaniVar = queryLocalInterface instanceof zzang ? (zzang) queryLocalInterface : new zzani(readStrongBinder);
        }
        m19945P.recycle();
        return zzaniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: Y2 */
    public final void mo16703Y2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzxzVar);
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzamvVar);
        m19946k0(3, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: a4 */
    public final void mo16704a4(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(30, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: b7 */
    public final zzana mo16705b7() throws RemoteException {
        zzana zzancVar;
        Parcel m19945P = m19945P(15, m19944H());
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzancVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzancVar = queryLocalInterface instanceof zzana ? (zzana) queryLocalInterface : new zzanc(readStrongBinder);
        }
        m19945P.recycle();
        return zzancVar;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: c6 */
    public final void mo16706c6(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzxzVar);
        m19944H.writeString(str);
        m19944H.writeString(str2);
        zzfo.m19949c(m19944H, zzamvVar);
        m19946k0(7, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void destroy() throws RemoteException {
        m19946k0(5, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: e6 */
    public final zzand mo16707e6() throws RemoteException {
        zzand zzanfVar;
        Parcel m19945P = m19945P(16, m19944H());
        IBinder readStrongBinder = m19945P.readStrongBinder();
        if (readStrongBinder == null) {
            zzanfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzanfVar = queryLocalInterface instanceof zzand ? (zzand) queryLocalInterface : new zzanf(readStrongBinder);
        }
        m19945P.recycle();
        return zzanfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: f2 */
    public final void mo16708f2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzxzVar);
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzamvVar);
        m19946k0(28, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzaar getVideoController() throws RemoteException {
        Parcel m19945P = m19945P(26, m19944H());
        zzaar m16201h7 = zzaas.m16201h7(m19945P.readStrongBinder());
        m19945P.recycle();
        return m16201h7;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: h4 */
    public final void mo16709h4(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzatk zzatkVar, String str2) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzxzVar);
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzatkVar);
        m19944H.writeString(str2);
        m19946k0(10, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final boolean isInitialized() throws RemoteException {
        Parcel m19945P = m19945P(13, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: o6 */
    public final void mo16710o6(zzxz zzxzVar, String str) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19950d(m19944H, zzxzVar);
        m19944H.writeString(str);
        m19946k0(11, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void pause() throws RemoteException {
        m19946k0(8, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void resume() throws RemoteException {
        m19946k0(9, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: s4 */
    public final void mo16712s4(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzydVar);
        zzfo.m19950d(m19944H, zzxzVar);
        m19944H.writeString(str);
        m19944H.writeString(str2);
        zzfo.m19949c(m19944H, zzamvVar);
        m19946k0(6, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19947a(m19944H, z);
        m19946k0(25, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showInterstitial() throws RemoteException {
        m19946k0(4, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showVideo() throws RemoteException {
        m19946k0(12, m19944H());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: w0 */
    public final void mo16713w0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        m19946k0(21, m19944H);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: x1 */
    public final IObjectWrapper mo16714x1() throws RemoteException {
        Parcel m19945P = m19945P(2, m19944H());
        IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(m19945P.readStrongBinder());
        m19945P.recycle();
        return m14707P;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: x3 */
    public final boolean mo16715x3() throws RemoteException {
        Parcel m19945P = m19945P(22, m19944H());
        boolean m19951e = zzfo.m19951e(m19945P);
        m19945P.recycle();
        return m19951e;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: y2 */
    public final void mo16716y2(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        Parcel m19944H = m19944H();
        zzfo.m19949c(m19944H, iObjectWrapper);
        zzfo.m19950d(m19944H, zzydVar);
        zzfo.m19950d(m19944H, zzxzVar);
        m19944H.writeString(str);
        zzfo.m19949c(m19944H, zzamvVar);
        m19946k0(1, m19944H);
    }
}
