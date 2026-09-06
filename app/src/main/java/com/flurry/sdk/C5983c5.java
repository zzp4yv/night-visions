package com.flurry.sdk;

import com.flurry.sdk.AbstractC6019g4;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.c5 */
/* loaded from: classes2.dex */
public class C5983c5 extends AbstractC6019g4 {

    /* renamed from: k */
    private final Deque<AbstractC6019g4.b> f15735k;

    /* renamed from: l */
    private AbstractC6019g4.b f15736l;

    /* renamed from: com.flurry.sdk.c5$a */
    final class a extends AbstractC6019g4.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5983c5 c5983c5, AbstractC6019g4 abstractC6019g4, Runnable runnable) {
            super(abstractC6019g4, runnable);
            c5983c5.getClass();
        }

        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            this.f15919f.mo13006k(this);
        }
    }

    C5983c5(String str, AbstractC6019g4 abstractC6019g4, boolean z) {
        super(str, abstractC6019g4, z);
        this.f15735k = new LinkedList();
    }

    /* renamed from: a */
    private synchronized void m13005a() {
        if (this.f15917i) {
            while (this.f15735k.size() > 0) {
                AbstractC6019g4.b remove = this.f15735k.remove();
                if (!remove.isDone()) {
                    this.f15736l = remove;
                    if (!mo13010q(remove)) {
                        this.f15736l = null;
                        this.f15735k.addFirst(remove);
                        return;
                    }
                }
            }
        } else if (this.f15736l == null && this.f15735k.size() > 0) {
            AbstractC6019g4.b remove2 = this.f15735k.remove();
            if (!remove2.isDone()) {
                this.f15736l = remove2;
                if (!mo13010q(remove2)) {
                    this.f15736l = null;
                    this.f15735k.addFirst(remove2);
                }
            }
        }
    }

    @Override // com.flurry.sdk.AbstractC6019g4
    /* renamed from: k */
    protected void mo13006k(Runnable runnable) {
        synchronized (this) {
            if (this.f15736l == runnable) {
                this.f15736l = null;
            }
        }
        m13005a();
    }

    @Override // com.flurry.sdk.AbstractC6019g4
    /* renamed from: m */
    protected Future<Void> mo13007m(Runnable runnable) {
        AbstractC6019g4.b aVar = runnable instanceof AbstractC6019g4.b ? (AbstractC6019g4.b) runnable : new a(this, this, runnable);
        synchronized (this) {
            this.f15735k.add(aVar);
            m13005a();
        }
        return aVar;
    }

    @Override // com.flurry.sdk.AbstractC6019g4
    /* renamed from: n */
    protected void mo13008n(Runnable runnable) throws CancellationException {
        AbstractC6019g4.b bVar = new AbstractC6019g4.b(this, AbstractC6019g4.f15914f);
        synchronized (this) {
            this.f15735k.add(bVar);
            m13005a();
        }
        if (this.f15918j) {
            for (AbstractC6019g4 abstractC6019g4 = this.f15916h; abstractC6019g4 != null; abstractC6019g4 = abstractC6019g4.f15916h) {
                abstractC6019g4.mo13079l(bVar);
            }
        }
        while (!bVar.isDone()) {
            try {
                bVar.get();
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
        if (!mo13009p(runnable)) {
            m13080o(runnable);
        }
        mo13006k(bVar);
    }

    @Override // com.flurry.sdk.AbstractC6019g4
    /* renamed from: p */
    protected boolean mo13009p(Runnable runnable) {
        return false;
    }

    /* renamed from: q */
    protected boolean mo13010q(AbstractC6019g4.b bVar) {
        AbstractC6019g4 abstractC6019g4 = this.f15916h;
        if (abstractC6019g4 == null) {
            return true;
        }
        abstractC6019g4.mo13007m(bVar);
        return true;
    }
}
