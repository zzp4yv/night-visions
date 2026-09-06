package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzcfk implements zzczz {

    /* renamed from: g */
    private final zzcfi f24222g;

    /* renamed from: h */
    private final Clock f24223h;

    /* renamed from: f */
    private final Map<zzczs, Long> f24221f = new HashMap();

    /* renamed from: i */
    private final Map<zzczs, C6752ii> f24224i = new HashMap();

    public zzcfk(zzcfi zzcfiVar, Set<C6752ii> set, Clock clock) {
        zzczs zzczsVar;
        this.f24222g = zzcfiVar;
        for (C6752ii c6752ii : set) {
            Map<zzczs, C6752ii> map = this.f24224i;
            zzczsVar = c6752ii.f19381c;
            map.put(zzczsVar, c6752ii);
        }
        this.f24223h = clock;
    }

    /* renamed from: a */
    private final void m18732a(zzczs zzczsVar, boolean z) {
        zzczs zzczsVar2;
        String str;
        zzczsVar2 = this.f24224i.get(zzczsVar).f19380b;
        String str2 = z ? "s." : "f.";
        if (this.f24221f.containsKey(zzczsVar2)) {
            long mo14609b = this.f24223h.mo14609b() - this.f24221f.get(zzczsVar2).longValue();
            Map<String, String> m18730c = this.f24222g.m18730c();
            str = this.f24224i.get(zzczsVar).f19379a;
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(mo14609b));
            m18730c.put(concat, valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: b */
    public final void mo18713b(zzczs zzczsVar, String str, Throwable th) {
        if (this.f24221f.containsKey(zzczsVar)) {
            long mo14609b = this.f24223h.mo14609b() - this.f24221f.get(zzczsVar).longValue();
            Map<String, String> m18730c = this.f24222g.m18730c();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(mo14609b));
            m18730c.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f24224i.containsKey(zzczsVar)) {
            m18732a(zzczsVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: c */
    public final void mo18714c(zzczs zzczsVar, String str) {
        if (this.f24221f.containsKey(zzczsVar)) {
            long mo14609b = this.f24223h.mo14609b() - this.f24221f.get(zzczsVar).longValue();
            Map<String, String> m18730c = this.f24222g.m18730c();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(mo14609b));
            m18730c.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f24224i.containsKey(zzczsVar)) {
            m18732a(zzczsVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: d */
    public final void mo18715d(zzczs zzczsVar, String str) {
        this.f24221f.put(zzczsVar, Long.valueOf(this.f24223h.mo14609b()));
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: e */
    public final void mo18716e(zzczs zzczsVar, String str) {
    }
}
