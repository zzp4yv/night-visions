package com.airbnb.epoxy;

import android.os.Handler;

/* loaded from: classes.dex */
public abstract class AsyncEpoxyController extends AbstractC5128n {
    public AsyncEpoxyController() {
        this(true);
    }

    private static Handler getHandler(boolean z) {
        return z ? C5126m.m9310c() : C5126m.f12248a;
    }

    public AsyncEpoxyController(boolean z) {
        this(z, z);
    }

    public AsyncEpoxyController(boolean z, boolean z2) {
        super(getHandler(z), getHandler(z2));
    }
}
