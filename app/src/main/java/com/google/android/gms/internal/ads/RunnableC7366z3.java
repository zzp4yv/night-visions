package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.z3 */
/* loaded from: classes2.dex */
final class RunnableC7366z3 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Bitmap f21357f;

    /* renamed from: g */
    private final /* synthetic */ zzauq f21358g;

    RunnableC7366z3(zzauq zzauqVar, Bitmap bitmap) {
        this.f21358g = zzauqVar;
        this.f21357f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        zzdsj zzdsjVar;
        zzdsj zzdsjVar2;
        zzdsj zzdsjVar3;
        zzdsj zzdsjVar4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f21357f.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        obj = this.f21358g.f22539l;
        synchronized (obj) {
            zzdsjVar = this.f21358g.f22530c;
            zzdsjVar.f25904k = new zzdso();
            zzdsjVar2 = this.f21358g.f22530c;
            zzdsjVar2.f25904k.f25925e = byteArrayOutputStream.toByteArray();
            zzdsjVar3 = this.f21358g.f22530c;
            zzdsjVar3.f25904k.f25924d = "image/png";
            zzdsjVar4 = this.f21358g.f22530c;
            zzdsjVar4.f25904k.f25923c = 1;
        }
    }
}
