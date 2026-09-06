package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class zzen extends zzfk {

    /* renamed from: n */
    private static final zzfl<zzch> f26060n = new zzfl<>();

    /* renamed from: o */
    private final Context f26061o;

    /* renamed from: p */
    private zzbk.zza f26062p;

    public zzen(zzdy zzdyVar, String str, String str2, zzbp.zza.C11431zza c11431zza, int i2, int i3, Context context, zzbk.zza zzaVar) {
        super(zzdyVar, str, str2, c11431zza, i2, 27);
        this.f26062p = null;
        this.f26061o = context;
        this.f26062p = zzaVar;
    }

    /* renamed from: c */
    private static String m19933c(zzbk.zza zzaVar) {
        if (zzaVar == null || !zzaVar.m17804A() || zzef.m19922f(zzaVar.m17805B().m17813x())) {
            return null;
        }
        return zzaVar.m17805B().m17813x();
    }

    /* renamed from: d */
    private final String m19934d() {
        try {
            if (this.f26089g.m19899A() != null) {
                this.f26089g.m19899A().get();
            }
            zzbp.zza m19916z = this.f26089g.m19916z();
            if (m19916z == null || !m19916z.m18048d0()) {
                return null;
            }
            return m19916z.m18047U();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: all -> 0x011e, TryCatch #1 {, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001f, B:10:0x0029, B:15:0x0039, B:17:0x0045, B:18:0x0082, B:21:0x0091, B:23:0x00b7, B:25:0x00e7, B:26:0x00c1, B:30:0x00ce, B:32:0x00d8, B:33:0x00db, B:34:0x0048, B:37:0x0056, B:39:0x005c, B:42:0x006b, B:44:0x0075, B:46:0x007d, B:47:0x0080, B:49:0x00ea, B:50:0x00f0), top: B:3:0x000d }] */
    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void mo19932a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.mo19932a():void");
    }
}
