package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.dj */
/* loaded from: classes2.dex */
final class C6568dj implements zzban<zzcxu> {

    /* renamed from: a */
    private final /* synthetic */ zzchl f18691a;

    C6568dj(zzchl zzchlVar) {
        this.f18691a = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: a */
    public final void mo14742a(Throwable th) {
        Pattern pattern;
        zzcji zzcjiVar;
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue()) {
            pattern = zzchl.f24322b;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzcjiVar = this.f18691a.f24327g;
                zzcjiVar.m18824e(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    /* renamed from: b */
    public final /* synthetic */ void mo14743b(zzcxu zzcxuVar) {
        zzcji zzcjiVar;
        zzcji zzcjiVar2;
        zzcxu zzcxuVar2 = zzcxuVar;
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21754a5)).booleanValue()) {
            zzcjiVar = this.f18691a.f24327g;
            zzcjiVar.m18824e(zzcxuVar2.f25289b.f25284b.f25276e);
            zzcjiVar2 = this.f18691a.f24327g;
            zzcjiVar2.m18825f(zzcxuVar2.f25289b.f25284b.f25277f);
        }
    }
}
