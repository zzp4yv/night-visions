package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.AbstractC6230f;
import com.google.android.datatransport.runtime.backends.AbstractC6231g;
import com.google.android.datatransport.runtime.backends.InterfaceC6229e;
import com.google.android.datatransport.runtime.backends.InterfaceC6237m;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6263a;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.p258i.AbstractC8834j;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;
import p241e.p254e.p256b.p257a.p258i.C8833i;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8806q0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8790i0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8852a;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8854c;
import p241e.p254e.p256b.p257a.p258i.p268z.C8858a;

/* compiled from: Uploader.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.u */
/* loaded from: classes2.dex */
public class C6258u {

    /* renamed from: a */
    private final Context f16839a;

    /* renamed from: b */
    private final InterfaceC6229e f16840b;

    /* renamed from: c */
    private final InterfaceC8792j0 f16841c;

    /* renamed from: d */
    private final InterfaceC6262y f16842d;

    /* renamed from: e */
    private final Executor f16843e;

    /* renamed from: f */
    private final InterfaceC6263a f16844f;

    /* renamed from: g */
    private final InterfaceC8821a f16845g;

    /* renamed from: h */
    private final InterfaceC8821a f16846h;

    /* renamed from: i */
    private final InterfaceC8790i0 f16847i;

    @Inject
    public C6258u(Context context, InterfaceC6229e interfaceC6229e, InterfaceC8792j0 interfaceC8792j0, InterfaceC6262y interfaceC6262y, Executor executor, InterfaceC6263a interfaceC6263a, InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2, InterfaceC8790i0 interfaceC8790i0) {
        this.f16839a = context;
        this.f16840b = interfaceC6229e;
        this.f16841c = interfaceC8792j0;
        this.f16842d = interfaceC6262y;
        this.f16843e = executor;
        this.f16844f = interfaceC6263a;
        this.f16845g = interfaceC8821a;
        this.f16846h = interfaceC8821a2;
        this.f16847i = interfaceC8790i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m13577d(AbstractC8841q abstractC8841q) {
        return Boolean.valueOf(this.f16841c.mo27999b1(abstractC8841q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Iterable m13578f(AbstractC8841q abstractC8841q) {
        return this.f16841c.mo27994G(abstractC8841q);
    }

    /* renamed from: g */
    private /* synthetic */ Object m13568g(Iterable iterable, AbstractC8841q abstractC8841q, long j2) {
        this.f16841c.mo28000e1(iterable);
        this.f16841c.mo27995O(abstractC8841q, this.f16845g.mo28110a() + j2);
        return null;
    }

    /* renamed from: i */
    private /* synthetic */ Object m13569i(Iterable iterable) {
        this.f16841c.mo28002q(iterable);
        return null;
    }

    /* renamed from: k */
    private /* synthetic */ Object m13570k() {
        this.f16847i.mo27991a();
        return null;
    }

    /* renamed from: m */
    private /* synthetic */ Object m13571m(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f16847i.mo27993d(((Integer) r0.getValue()).intValue(), C8854c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* renamed from: o */
    private /* synthetic */ Object m13572o(AbstractC8841q abstractC8841q, long j2) {
        this.f16841c.mo27995O(abstractC8841q, this.f16845g.mo28110a() + j2);
        return null;
    }

    /* renamed from: q */
    private /* synthetic */ Object m13573q(AbstractC8841q abstractC8841q, int i2) {
        this.f16842d.mo13540a(abstractC8841q, i2 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m13585t(final AbstractC8841q abstractC8841q, final int i2, Runnable runnable) {
        try {
            try {
                InterfaceC6263a interfaceC6263a = this.f16844f;
                final InterfaceC8792j0 interfaceC8792j0 = this.f16841c;
                interfaceC8792j0.getClass();
                interfaceC6263a.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC8792j0.this.mo28001o());
                    }
                });
                if (m13576b()) {
                    m13586u(abstractC8841q, i2);
                } else {
                    this.f16844f.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                        public final Object execute() {
                            C6258u.this.m13584r(abstractC8841q, i2);
                            return null;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.f16842d.mo13540a(abstractC8841q, i2 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: a */
    public AbstractC8834j m13575a(InterfaceC6237m interfaceC6237m) {
        InterfaceC6263a interfaceC6263a = this.f16844f;
        final InterfaceC8790i0 interfaceC8790i0 = this.f16847i;
        interfaceC8790i0.getClass();
        return interfaceC6237m.mo13414b(AbstractC8834j.m28150a().mo28107i(this.f16845g.mo28110a()).mo28109k(this.f16846h.mo28110a()).mo28108j("GDT_CLIENT_METRICS").mo28106h(new C8833i(C8752b.m27945b("proto"), ((C8852a) interfaceC6263a.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
            @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
            public final Object execute() {
                return InterfaceC8790i0.this.mo27992c();
            }
        })).m28195f())).mo28102d());
    }

    /* renamed from: b */
    boolean m13576b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f16839a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: h */
    public /* synthetic */ Object m13579h(Iterable iterable, AbstractC8841q abstractC8841q, long j2) {
        m13568g(iterable, abstractC8841q, j2);
        return null;
    }

    /* renamed from: j */
    public /* synthetic */ Object m13580j(Iterable iterable) {
        m13569i(iterable);
        return null;
    }

    /* renamed from: l */
    public /* synthetic */ Object m13581l() {
        m13570k();
        return null;
    }

    /* renamed from: n */
    public /* synthetic */ Object m13582n(Map map) {
        m13571m(map);
        return null;
    }

    /* renamed from: p */
    public /* synthetic */ Object m13583p(AbstractC8841q abstractC8841q, long j2) {
        m13572o(abstractC8841q, j2);
        return null;
    }

    /* renamed from: r */
    public /* synthetic */ Object m13584r(AbstractC8841q abstractC8841q, int i2) {
        m13573q(abstractC8841q, i2);
        return null;
    }

    /* renamed from: u */
    public AbstractC6231g m13586u(final AbstractC8841q abstractC8841q, int i2) {
        AbstractC6231g mo13413a;
        InterfaceC6237m interfaceC6237m = this.f16840b.get(abstractC8841q.mo28134b());
        long j2 = 0;
        AbstractC6231g m13523e = AbstractC6231g.m13523e(0L);
        while (true) {
            final long j3 = j2;
            while (((Boolean) this.f16844f.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.e
                @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                public final Object execute() {
                    return C6258u.this.m13577d(abstractC8841q);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f16844f.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                    public final Object execute() {
                        return C6258u.this.m13578f(abstractC8841q);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m13523e;
                }
                if (interfaceC6237m == null) {
                    C8858a.m28230b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC8841q);
                    mo13413a = AbstractC6231g.m13521a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC8806q0) it.next()).mo27988b());
                    }
                    if (abstractC8841q.m28170e()) {
                        arrayList.add(m13575a(interfaceC6237m));
                    }
                    mo13413a = interfaceC6237m.mo13413a(AbstractC6230f.m13520a().mo13512b(arrayList).mo13513c(abstractC8841q.mo28135c()).mo13511a());
                }
                m13523e = mo13413a;
                if (m13523e.mo13515c() == AbstractC6231g.a.TRANSIENT_ERROR) {
                    this.f16844f.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                        public final Object execute() {
                            C6258u.this.m13579h(iterable, abstractC8841q, j3);
                            return null;
                        }
                    });
                    this.f16842d.mo13541b(abstractC8841q, i2 + 1, true);
                    return m13523e;
                }
                this.f16844f.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                    public final Object execute() {
                        C6258u.this.m13580j(iterable);
                        return null;
                    }
                });
                if (m13523e.mo13515c() == AbstractC6231g.a.OK) {
                    j2 = Math.max(j3, m13523e.mo13514b());
                    if (abstractC8841q.m28170e()) {
                        this.f16844f.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
                            @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                            public final Object execute() {
                                C6258u.this.m13581l();
                                return null;
                            }
                        });
                    }
                } else if (m13523e.mo13515c() == AbstractC6231g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String mo28100j = ((AbstractC8806q0) it2.next()).mo27988b().mo28100j();
                        if (hashMap.containsKey(mo28100j)) {
                            hashMap.put(mo28100j, Integer.valueOf(((Integer) hashMap.get(mo28100j)).intValue() + 1));
                        } else {
                            hashMap.put(mo28100j, 1);
                        }
                    }
                    this.f16844f.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                        public final Object execute() {
                            C6258u.this.m13582n(hashMap);
                            return null;
                        }
                    });
                }
            }
            this.f16844f.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                public final Object execute() {
                    C6258u.this.m13583p(abstractC8841q, j3);
                    return null;
                }
            });
            return m13523e;
        }
    }

    /* renamed from: v */
    public void m13587v(final AbstractC8841q abstractC8841q, final int i2, final Runnable runnable) {
        this.f16843e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.d
            @Override // java.lang.Runnable
            public final void run() {
                C6258u.this.m13585t(abstractC8841q, i2, runnable);
            }
        });
    }
}
