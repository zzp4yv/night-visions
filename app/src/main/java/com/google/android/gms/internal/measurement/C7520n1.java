package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0380i;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.n1 */
/* loaded from: classes2.dex */
final class C7520n1 implements Comparator<zzdu> {
    C7520n1() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdu zzduVar, zzdu zzduVar2) {
        int m22153u;
        int m22153u2;
        zzdu zzduVar3 = zzduVar;
        zzdu zzduVar4 = zzduVar2;
        zzed zzedVar = (zzed) zzduVar3.iterator();
        zzed zzedVar2 = (zzed) zzduVar4.iterator();
        while (zzedVar.hasNext() && zzedVar2.hasNext()) {
            m22153u = zzdu.m22153u(zzedVar.mo21264a());
            m22153u2 = zzdu.m22153u(zzedVar2.mo21264a());
            int m2811a = C0380i.m2811a(m22153u, m22153u2);
            if (m2811a != 0) {
                return m2811a;
            }
        }
        return C0380i.m2811a(zzduVar3.mo21396f(), zzduVar4.mo21396f());
    }
}
