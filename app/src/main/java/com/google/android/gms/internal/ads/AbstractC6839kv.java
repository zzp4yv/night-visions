package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kv */
/* loaded from: classes2.dex */
abstract class AbstractC6839kv {

    /* renamed from: a */
    private static final AbstractC6839kv f19726a;

    /* renamed from: b */
    private static final AbstractC6839kv f19727b;

    static {
        C6876lv c6876lv = null;
        f19726a = new C6913mv();
        f19727b = new C6950nv();
    }

    private AbstractC6839kv() {
    }

    /* renamed from: c */
    static AbstractC6839kv m15439c() {
        return f19726a;
    }

    /* renamed from: d */
    static AbstractC6839kv m15440d() {
        return f19727b;
    }

    /* renamed from: a */
    abstract <L> List<L> mo15441a(Object obj, long j2);

    /* renamed from: b */
    abstract <L> void mo15442b(Object obj, Object obj2, long j2);

    /* renamed from: e */
    abstract void mo15443e(Object obj, long j2);
}
