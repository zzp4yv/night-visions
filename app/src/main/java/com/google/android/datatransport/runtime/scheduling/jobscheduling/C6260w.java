package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.InterfaceC6263a;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;

/* compiled from: WorkInitializer.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.w */
/* loaded from: classes2.dex */
public class C6260w {

    /* renamed from: a */
    private final Executor f16857a;

    /* renamed from: b */
    private final InterfaceC8792j0 f16858b;

    /* renamed from: c */
    private final InterfaceC6262y f16859c;

    /* renamed from: d */
    private final InterfaceC6263a f16860d;

    @Inject
    C6260w(Executor executor, InterfaceC8792j0 interfaceC8792j0, InterfaceC6262y interfaceC6262y, InterfaceC6263a interfaceC6263a) {
        this.f16857a = executor;
        this.f16858b = interfaceC8792j0;
        this.f16859c = interfaceC6262y;
        this.f16860d = interfaceC6263a;
    }

    /* renamed from: b */
    private /* synthetic */ Object m13591b() {
        Iterator<AbstractC8841q> it = this.f16858b.mo27997U().iterator();
        while (it.hasNext()) {
            this.f16859c.mo13540a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m13595e() {
        this.f16860d.mo13599b(new InterfaceC6263a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
            @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
            public final Object execute() {
                C6260w.this.m13594c();
                return null;
            }
        });
    }

    /* renamed from: a */
    public void m13593a() {
        this.f16857a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
            @Override // java.lang.Runnable
            public final void run() {
                C6260w.this.m13595e();
            }
        });
    }

    /* renamed from: c */
    public /* synthetic */ Object m13594c() {
        m13591b();
        return null;
    }
}
