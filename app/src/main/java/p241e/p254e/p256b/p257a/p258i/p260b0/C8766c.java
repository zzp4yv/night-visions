package p241e.p254e.p256b.p257a.p258i.p260b0;

import com.google.android.datatransport.runtime.backends.InterfaceC6229e;
import com.google.android.datatransport.runtime.backends.InterfaceC6237m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6262y;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6263a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;
import p241e.p254e.p256b.p257a.InterfaceC8758h;
import p241e.p254e.p256b.p257a.p258i.AbstractC8834j;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;
import p241e.p254e.p256b.p257a.p258i.C8845u;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;

/* compiled from: DefaultScheduler.java */
/* renamed from: e.e.b.a.i.b0.c */
/* loaded from: classes2.dex */
public class C8766c implements InterfaceC8768e {

    /* renamed from: a */
    private static final Logger f33448a = Logger.getLogger(C8845u.class.getName());

    /* renamed from: b */
    private final InterfaceC6262y f33449b;

    /* renamed from: c */
    private final Executor f33450c;

    /* renamed from: d */
    private final InterfaceC6229e f33451d;

    /* renamed from: e */
    private final InterfaceC8792j0 f33452e;

    /* renamed from: f */
    private final InterfaceC6263a f33453f;

    @Inject
    public C8766c(Executor executor, InterfaceC6229e interfaceC6229e, InterfaceC6262y interfaceC6262y, InterfaceC8792j0 interfaceC8792j0, InterfaceC6263a interfaceC6263a) {
        this.f33450c = executor;
        this.f33451d = interfaceC6229e;
        this.f33449b = interfaceC6262y;
        this.f33452e = interfaceC8792j0;
        this.f33453f = interfaceC6263a;
    }

    /* renamed from: b */
    private /* synthetic */ Object m27958b(AbstractC8841q abstractC8841q, AbstractC8834j abstractC8834j) {
        this.f33452e.mo27996S0(abstractC8841q, abstractC8834j);
        this.f33449b.mo13540a(abstractC8841q, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m27962e(final AbstractC8841q abstractC8841q, InterfaceC8758h interfaceC8758h, AbstractC8834j abstractC8834j) {
        try {
            InterfaceC6237m interfaceC6237m = this.f33451d.get(abstractC8841q.mo28134b());
            if (interfaceC6237m == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC8841q.mo28134b());
                f33448a.warning(format);
                interfaceC8758h.mo26010a(new IllegalArgumentException(format));
            } else {
                final AbstractC8834j mo13414b = interfaceC6237m.mo13414b(abstractC8834j);
                this.f33453f.mo13599b(new InterfaceC6263a.a() { // from class: e.e.b.a.i.b0.b
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a.a
                    public final Object execute() {
                        C8766c.this.m27961c(abstractC8841q, mo13414b);
                        return null;
                    }
                });
                interfaceC8758h.mo26010a(null);
            }
        } catch (Exception e2) {
            f33448a.warning("Error scheduling event " + e2.getMessage());
            interfaceC8758h.mo26010a(e2);
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.InterfaceC8768e
    /* renamed from: a */
    public void mo27960a(final AbstractC8841q abstractC8841q, final AbstractC8834j abstractC8834j, final InterfaceC8758h interfaceC8758h) {
        this.f33450c.execute(new Runnable() { // from class: e.e.b.a.i.b0.a
            @Override // java.lang.Runnable
            public final void run() {
                C8766c.this.m27962e(abstractC8841q, interfaceC8758h, abstractC8834j);
            }
        });
    }

    /* renamed from: c */
    public /* synthetic */ Object m27961c(AbstractC8841q abstractC8841q, AbstractC8834j abstractC8834j) {
        m27958b(abstractC8841q, abstractC8834j);
        return null;
    }
}
