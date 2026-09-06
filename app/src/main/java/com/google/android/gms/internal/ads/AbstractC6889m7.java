package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@zzard
/* renamed from: com.google.android.gms.internal.ads.m7 */
/* loaded from: classes2.dex */
abstract class AbstractC6889m7 {

    /* renamed from: f */
    private final WeakReference<View> f19884f;

    public AbstractC6889m7(View view) {
        this.f19884f = new WeakReference<>(view);
    }

    /* renamed from: c */
    private final ViewTreeObserver m15540c() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f19884f.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: a */
    public final void m15541a() {
        ViewTreeObserver m15540c = m15540c();
        if (m15540c != null) {
            mo15391d(m15540c);
        }
    }

    /* renamed from: b */
    public final void m15542b() {
        ViewTreeObserver m15540c = m15540c();
        if (m15540c != null) {
            mo15392e(m15540c);
        }
    }

    /* renamed from: d */
    protected abstract void mo15391d(ViewTreeObserver viewTreeObserver);

    /* renamed from: e */
    protected abstract void mo15392e(ViewTreeObserver viewTreeObserver);
}
