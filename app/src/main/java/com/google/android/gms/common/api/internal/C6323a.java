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

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: classes2.dex */
final class C6323a implements OnCompleteListener<Map<zai<?>, String>> {

    /* renamed from: a */
    private SignInConnectionListener f17390a;

    /* renamed from: b */
    private final /* synthetic */ zax f17391b;

    C6323a(zax zaxVar, SignInConnectionListener signInConnectionListener) {
        this.f17391b = zaxVar;
        this.f17390a = signInConnectionListener;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    /* renamed from: a */
    public final void mo7019a(Task<Map<zai<?>, String>> task) {
        Lock lock;
        Lock lock2;
        boolean z;
        boolean z2;
        Map map;
        Map map2;
        boolean m14232l;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        ConnectionResult m14238r;
        Condition condition;
        Map map7;
        Map map8;
        Map map9;
        lock = this.f17391b.f17616k;
        lock.lock();
        try {
            z = this.f17391b.f17624s;
            if (!z) {
                this.f17390a.mo13725a();
                return;
            }
            if (task.mo23651n()) {
                zax zaxVar = this.f17391b;
                map7 = zaxVar.f17612g;
                zaxVar.f17626u = new C0867a(map7.size());
                map8 = this.f17391b.f17612g;
                for (zaw zawVar : map8.values()) {
                    map9 = this.f17391b.f17626u;
                    map9.put(zawVar.m13861l(), ConnectionResult.f17198f);
                }
            } else if (task.mo23646i() instanceof AvailabilityException) {
                AvailabilityException availabilityException = (AvailabilityException) task.mo23646i();
                z2 = this.f17391b.f17622q;
                if (z2) {
                    zax zaxVar2 = this.f17391b;
                    map = zaxVar2.f17612g;
                    zaxVar2.f17626u = new C0867a(map.size());
                    map2 = this.f17391b.f17612g;
                    for (zaw zawVar2 : map2.values()) {
                        Object m13861l = zawVar2.m13861l();
                        ConnectionResult m13844a = availabilityException.m13844a(zawVar2);
                        m14232l = this.f17391b.m14232l(zawVar2, m13844a);
                        if (m14232l) {
                            map3 = this.f17391b.f17626u;
                            map3.put(m13861l, new ConnectionResult(16));
                        } else {
                            map4 = this.f17391b.f17626u;
                            map4.put(m13861l, m13844a);
                        }
                    }
                } else {
                    this.f17391b.f17626u = availabilityException.m13845b();
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", task.mo23646i());
                this.f17391b.f17626u = Collections.emptyMap();
            }
            if (this.f17391b.isConnected()) {
                map5 = this.f17391b.f17625t;
                map6 = this.f17391b.f17626u;
                map5.putAll(map6);
                m14238r = this.f17391b.m14238r();
                if (m14238r == null) {
                    this.f17391b.m14236p();
                    this.f17391b.m14237q();
                    condition = this.f17391b.f17619n;
                    condition.signalAll();
                }
            }
            this.f17390a.mo13725a();
        } finally {
            lock2 = this.f17391b.f17616k;
            lock2.unlock();
        }
    }

    /* renamed from: b */
    final void m14056b() {
        this.f17390a.mo13725a();
    }
}
