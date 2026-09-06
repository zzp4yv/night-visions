package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wt */
/* loaded from: classes2.dex */
final class C7281wt extends AbstractC7170tt {

    /* renamed from: b */
    private final C7207ut f20870b = new C7207ut();

    C7281wt() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7170tt
    /* renamed from: a */
    public final void mo15905a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> m15931a = this.f20870b.m15931a(th, false);
        if (m15931a == null) {
            return;
        }
        synchronized (m15931a) {
            for (Throwable th2 : m15931a) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7170tt
    /* renamed from: b */
    public final void mo15906b(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.f20870b.m15931a(th, true).add(th2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7170tt
    /* renamed from: c */
    public final void mo15907c(Throwable th) {
        th.printStackTrace();
        List<Throwable> m15931a = this.f20870b.m15931a(th, false);
        if (m15931a == null) {
            return;
        }
        synchronized (m15931a) {
            for (Throwable th2 : m15931a) {
                System.err.print("Suppressed: ");
                th2.printStackTrace();
            }
        }
    }
}
