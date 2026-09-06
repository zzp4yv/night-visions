package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzyc {

    /* renamed from: a */
    public static final zzyc f27446a = new zzyc();

    @VisibleForTesting
    protected zzyc() {
    }

    /* renamed from: a */
    public static zzxz m20820a(Context context, zzaaz zzaazVar) {
        Context context2;
        List list;
        String str;
        Date m16204a = zzaazVar.m16204a();
        long time = m16204a != null ? m16204a.getTime() : -1L;
        String m16205b = zzaazVar.m16205b();
        int m16208e = zzaazVar.m16208e();
        Set<String> m16209f = zzaazVar.m16209f();
        if (m16209f.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(m16209f));
            context2 = context;
        }
        boolean m16217n = zzaazVar.m16217n(context2);
        int m16222s = zzaazVar.m16222s();
        Location m16210g = zzaazVar.m16210g();
        Bundle m16214k = zzaazVar.m16214k(AdMobAdapter.class);
        boolean m16211h = zzaazVar.m16211h();
        String m16215l = zzaazVar.m16215l();
        SearchAdRequest m16219p = zzaazVar.m16219p();
        zzaca zzacaVar = m16219p != null ? new zzaca(m16219p) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzyt.m20844a();
            str = zzazt.m17302c(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        return new zzxz(8, time, m16214k, m16208e, list, m16217n, m16222s, m16211h, m16215l, zzacaVar, m16210g, m16205b, zzaazVar.m16221r(), zzaazVar.m16207d(), Collections.unmodifiableList(new ArrayList(zzaazVar.m16223t())), zzaazVar.m16218o(), str, zzaazVar.m16216m(), null, zzaazVar.m16224u(), zzaazVar.m16212i());
    }
}
