package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p024c.p041e.C0867a;

/* renamed from: com.google.android.gms.common.api.internal.w0 */
/* loaded from: classes2.dex */
final class C6368w0 implements OnCompleteListener<Map<zai<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ zax f17468a;

    private C6368w0(zax zaxVar) {
        this.f17468a = zaxVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    /* renamed from: a */
    public final void mo7019a(Task<Map<zai<?>, String>> task) {
        Lock lock;
        Lock lock2;
        boolean z;
        boolean z2;
        ConnectionResult m14238r;
        Map map;
        Map map2;
        boolean m14232l;
        Map map3;
        Map map4;
        Map map5;
        ConnectionResult connectionResult;
        zaaw zaawVar;
        ConnectionResult connectionResult2;
        Condition condition;
        Map map6;
        Map map7;
        ConnectionResult m14238r2;
        Map map8;
        Map map9;
        Map map10;
        lock = this.f17468a.f17616k;
        lock.lock();
        try {
            z = this.f17468a.f17624s;
            if (z) {
                if (task.mo23651n()) {
                    zax zaxVar = this.f17468a;
                    map8 = zaxVar.f17611f;
                    zaxVar.f17625t = new C0867a(map8.size());
                    map9 = this.f17468a.f17611f;
                    for (zaw zawVar : map9.values()) {
                        map10 = this.f17468a.f17625t;
                        map10.put(zawVar.m13861l(), ConnectionResult.f17198f);
                    }
                } else if (task.mo23646i() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.mo23646i();
                    z2 = this.f17468a.f17622q;
                    if (z2) {
                        zax zaxVar2 = this.f17468a;
                        map = zaxVar2.f17611f;
                        zaxVar2.f17625t = new C0867a(map.size());
                        map2 = this.f17468a.f17611f;
                        for (zaw zawVar2 : map2.values()) {
                            Object m13861l = zawVar2.m13861l();
                            ConnectionResult m13844a = availabilityException.m13844a(zawVar2);
                            m14232l = this.f17468a.m14232l(zawVar2, m13844a);
                            if (m14232l) {
                                map3 = this.f17468a.f17625t;
                                map3.put(m13861l, new ConnectionResult(16));
                            } else {
                                map4 = this.f17468a.f17625t;
                                map4.put(m13861l, m13844a);
                            }
                        }
                    } else {
                        this.f17468a.f17625t = availabilityException.m13845b();
                    }
                    zax zaxVar3 = this.f17468a;
                    m14238r = zaxVar3.m14238r();
                    zaxVar3.f17628w = m14238r;
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.mo23646i());
                    this.f17468a.f17625t = Collections.emptyMap();
                    this.f17468a.f17628w = new ConnectionResult(8);
                }
                map5 = this.f17468a.f17626u;
                if (map5 != null) {
                    map6 = this.f17468a.f17625t;
                    map7 = this.f17468a.f17626u;
                    map6.putAll(map7);
                    zax zaxVar4 = this.f17468a;
                    m14238r2 = zaxVar4.m14238r();
                    zaxVar4.f17628w = m14238r2;
                }
                connectionResult = this.f17468a.f17628w;
                if (connectionResult == null) {
                    this.f17468a.m14236p();
                    this.f17468a.m14237q();
                } else {
                    zax.m14234n(this.f17468a, false);
                    zaawVar = this.f17468a.f17615j;
                    connectionResult2 = this.f17468a.f17628w;
                    zaawVar.mo14102a(connectionResult2);
                }
                condition = this.f17468a.f17619n;
                condition.signalAll();
            }
        } finally {
            lock2 = this.f17468a.f17616k;
            lock2.unlock();
        }
    }
}
