package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.C0380i;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.eu */
/* loaded from: classes2.dex */
final class C6616eu implements Comparator<zzdmr> {
    C6616eu() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdmr zzdmrVar, zzdmr zzdmrVar2) {
        int m19598s;
        int m19598s2;
        zzdmr zzdmrVar3 = zzdmrVar;
        zzdmr zzdmrVar4 = zzdmrVar2;
        zzdmy zzdmyVar = (zzdmy) zzdmrVar3.iterator();
        zzdmy zzdmyVar2 = (zzdmy) zzdmrVar4.iterator();
        while (zzdmyVar.hasNext() && zzdmyVar2.hasNext()) {
            m19598s = zzdmr.m19598s(zzdmyVar.mo15079f());
            m19598s2 = zzdmr.m19598s(zzdmyVar2.mo15079f());
            int m2811a = C0380i.m2811a(m19598s, m19598s2);
            if (m2811a != 0) {
                return m2811a;
            }
        }
        return C0380i.m2811a(zzdmrVar3.size(), zzdmrVar4.size());
    }
}
