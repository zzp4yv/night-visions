package com.flurry.sdk;

import com.flurry.sdk.AbstractC6019g4;
import java.util.Timer;
import java.util.concurrent.Executor;

/* renamed from: com.flurry.sdk.d2 */
/* loaded from: classes2.dex */
public final class C5989d2 extends C6063l3 {

    /* renamed from: m */
    private static Timer f15788m = new Timer("ExecutorQueue Global Timer", true);

    /* renamed from: n */
    Executor f15789n;

    public C5989d2(Executor executor, String str) {
        super(str);
        this.f15789n = executor;
    }

    @Override // com.flurry.sdk.C5983c5
    /* renamed from: q */
    protected final synchronized boolean mo13010q(AbstractC6019g4.b bVar) {
        try {
            if (bVar.m13081a()) {
                bVar.run();
            } else {
                this.f15789n.execute(bVar);
            }
        } catch (Exception unused) {
            return false;
        }
        return true;
    }
}
