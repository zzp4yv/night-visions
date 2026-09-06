package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzagj extends UnifiedNativeAd {

    /* renamed from: a */
    private final zzagg f22001a;

    /* renamed from: c */
    private final zzael f22003c;

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f22005e;

    /* renamed from: g */
    private final UnifiedNativeAd.zza f22007g;

    /* renamed from: b */
    private final List<NativeAd.Image> f22002b = new ArrayList();

    /* renamed from: d */
    private final VideoController f22004d = new VideoController();

    /* renamed from: f */
    private final List<MuteThisAdReason> f22006f = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(3:2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6)))|24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28))|41|42|(12:44|45|46|47|(7:49|50|51|52|(2:54|55)|57|58)|63|50|51|52|(0)|57|58)|67|45|46|47|(0)|63|50|51|52|(0)|57|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28))|41|42|(12:44|45|46|47|(7:49|50|51|52|(2:54|55)|57|58)|63|50|51|52|(0)|57|58)|67|45|46|47|(0)|63|50|51|52|(0)|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d7, code lost:
    
        com.google.android.gms.internal.ads.zzbad.m17347c(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ba, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bb, code lost:
    
        com.google.android.gms.internal.ads.zzbad.m17347c(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae A[Catch: RemoteException -> 0x00ba, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00ba, blocks: (B:47:0x00a6, B:49:0x00ae), top: B:46:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9 A[Catch: RemoteException -> 0x00d6, TRY_LEAVE, TryCatch #4 {RemoteException -> 0x00d6, blocks: (B:52:0x00c1, B:54:0x00c9), top: B:51:0x00c1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzagj(com.google.android.gms.internal.ads.zzagg r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f22002b = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.f22004d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f22006f = r1
            r5.f22001a = r6
            r1 = 0
            java.util.List r6 = r6.mo16548k()     // Catch: android.os.RemoteException -> L5a
            if (r6 == 0) goto L5e
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L5a
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L5a
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L5a
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L5a
            if (r3 == 0) goto L4c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L5a
            if (r2 == 0) goto L4c
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch: android.os.RemoteException -> L5a
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzaei     // Catch: android.os.RemoteException -> L5a
            if (r4 == 0) goto L46
            com.google.android.gms.internal.ads.zzaei r3 = (com.google.android.gms.internal.ads.zzaei) r3     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L46:
            com.google.android.gms.internal.ads.zzaek r3 = new com.google.android.gms.internal.ads.zzaek     // Catch: android.os.RemoteException -> L5a
            r3.<init>(r2)     // Catch: android.os.RemoteException -> L5a
            goto L4d
        L4c:
            r3 = r1
        L4d:
            if (r3 == 0) goto L27
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r2 = r5.f22002b     // Catch: android.os.RemoteException -> L5a
            com.google.android.gms.internal.ads.zzael r4 = new com.google.android.gms.internal.ads.zzael     // Catch: android.os.RemoteException -> L5a
            r4.<init>(r3)     // Catch: android.os.RemoteException -> L5a
            r2.add(r4)     // Catch: android.os.RemoteException -> L5a
            goto L27
        L5a:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m17347c(r0, r6)
        L5e:
            com.google.android.gms.internal.ads.zzagg r6 = r5.f22001a     // Catch: android.os.RemoteException -> L8d
            java.util.List r6 = r6.mo16555u4()     // Catch: android.os.RemoteException -> L8d
            if (r6 == 0) goto L91
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L8d
        L6a:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L8d
            if (r2 == 0) goto L91
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L8d
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L8d
            if (r3 == 0) goto L7f
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L8d
            com.google.android.gms.internal.ads.zzaak r2 = com.google.android.gms.internal.ads.zzaal.m16187h7(r2)     // Catch: android.os.RemoteException -> L8d
            goto L80
        L7f:
            r2 = r1
        L80:
            if (r2 == 0) goto L6a
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.f22006f     // Catch: android.os.RemoteException -> L8d
            com.google.android.gms.internal.ads.zzaan r4 = new com.google.android.gms.internal.ads.zzaan     // Catch: android.os.RemoteException -> L8d
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L8d
            r3.add(r4)     // Catch: android.os.RemoteException -> L8d
            goto L6a
        L8d:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m17347c(r0, r6)
        L91:
            com.google.android.gms.internal.ads.zzagg r6 = r5.f22001a     // Catch: android.os.RemoteException -> L9f
            com.google.android.gms.internal.ads.zzaei r6 = r6.mo16549n()     // Catch: android.os.RemoteException -> L9f
            if (r6 == 0) goto La3
            com.google.android.gms.internal.ads.zzael r2 = new com.google.android.gms.internal.ads.zzael     // Catch: android.os.RemoteException -> L9f
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L9f
            goto La4
        L9f:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m17347c(r0, r6)
        La3:
            r2 = r1
        La4:
            r5.f22003c = r2
            com.google.android.gms.internal.ads.zzagg r6 = r5.f22001a     // Catch: android.os.RemoteException -> Lba
            com.google.android.gms.internal.ads.zzaea r6 = r6.mo16542f()     // Catch: android.os.RemoteException -> Lba
            if (r6 == 0) goto Lbe
            com.google.android.gms.internal.ads.zzaed r6 = new com.google.android.gms.internal.ads.zzaed     // Catch: android.os.RemoteException -> Lba
            com.google.android.gms.internal.ads.zzagg r2 = r5.f22001a     // Catch: android.os.RemoteException -> Lba
            com.google.android.gms.internal.ads.zzaea r2 = r2.mo16542f()     // Catch: android.os.RemoteException -> Lba
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lba
            goto Lbf
        Lba:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m17347c(r0, r6)
        Lbe:
            r6 = r1
        Lbf:
            r5.f22005e = r6
            com.google.android.gms.internal.ads.zzagg r6 = r5.f22001a     // Catch: android.os.RemoteException -> Ld6
            com.google.android.gms.internal.ads.zzaee r6 = r6.mo16550n2()     // Catch: android.os.RemoteException -> Ld6
            if (r6 == 0) goto Lda
            com.google.android.gms.internal.ads.zzaeh r6 = new com.google.android.gms.internal.ads.zzaeh     // Catch: android.os.RemoteException -> Ld6
            com.google.android.gms.internal.ads.zzagg r2 = r5.f22001a     // Catch: android.os.RemoteException -> Ld6
            com.google.android.gms.internal.ads.zzaee r2 = r2.mo16550n2()     // Catch: android.os.RemoteException -> Ld6
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Ld6
            r1 = r6
            goto Lda
        Ld6:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzbad.m17347c(r0, r6)
        Lda:
            r5.f22007g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagj.<init>(com.google.android.gms.internal.ads.zzagg):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IObjectWrapper zzkq() {
        try {
            return this.f22001a.mo16552r();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.f22001a.mo16539W();
        } catch (RemoteException e2) {
            zzbad.m17347c("Failed to cancelUnconfirmedClick", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.f22001a.destroy();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.f22001a.mo16547j0();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f22005e;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.f22001a.mo16556w();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.f22001a.mo16545i();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.f22001a.mo16544h();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle extras = this.f22001a.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.f22001a.mo16543g();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.f22003c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<NativeAd.Image> getImages() {
        return this.f22002b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.f22001a.getMediationAdapterClassName();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.f22006f;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.f22001a.mo16551o();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double mo16553t = this.f22001a.mo16553t();
            if (mo16553t == -1.0d) {
                return null;
            }
            return Double.valueOf(mo16553t);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.f22001a.getStore();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.f22001a.getVideoController() != null) {
                this.f22004d.zza(this.f22001a.getVideoController());
            }
        } catch (RemoteException e2) {
            zzbad.m17347c("Exception occurred while getting video controller", e2);
        }
        return this.f22004d;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f22001a.mo16554u2();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzbad.m17351g("Ad is not custom mute enabled");
                return;
            }
            if (muteThisAdReason == null) {
                this.f22001a.mo16541e0(null);
            } else if (muteThisAdReason instanceof zzaan) {
                this.f22001a.mo16541e0(((zzaan) muteThisAdReason).m16188a());
            } else {
                zzbad.m17351g("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f22001a.mo16557z(bundle);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.f22001a.mo16535D6();
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f22001a.mo16536E(bundle);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f22001a.mo16538L(bundle);
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f22001a.mo16537G0(new zzaaj(muteThisAdListener));
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f22001a.mo16540d0(new zzagt(unconfirmedClickListener));
        } catch (RemoteException e2) {
            zzbad.m17347c("Failed to setUnconfirmedClickListener", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzkv() {
        try {
            IObjectWrapper mo16546j = this.f22001a.mo16546j();
            if (mo16546j != null) {
                return ObjectWrapper.m14709k0(mo16546j);
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            return null;
        }
    }
}
