package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class n40 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ m40 f19985f;

    n40(m40 m40Var) {
        this.f19985f = m40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.f19985f.f19874h;
        synchronized (obj) {
            z = this.f19985f.f19875i;
            if (z) {
                z2 = this.f19985f.f19876j;
                if (z2) {
                    m40.m15532g(this.f19985f, false);
                    zzbad.m17349e("App went background");
                    list = this.f19985f.f19877k;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzut) it.next()).mo15953a(false);
                        } catch (Exception e2) {
                            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                        }
                    }
                }
            }
            zzbad.m17349e("App is still foreground");
        }
    }
}
