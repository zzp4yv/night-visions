package com.airbnb.epoxy;

import com.airbnb.epoxy.AbstractC5139q;
import java.util.List;

/* compiled from: EpoxyModelWithHolder.java */
/* renamed from: com.airbnb.epoxy.t */
/* loaded from: classes.dex */
public abstract class AbstractC5142t<T extends AbstractC5139q> extends AbstractC5141s<T> {
    public AbstractC5142t() {
    }

    protected abstract T createNewHolder();

    public AbstractC5142t(long j2) {
        super(j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.epoxy.AbstractC5141s
    public /* bridge */ /* synthetic */ void bind(Object obj, AbstractC5141s abstractC5141s) {
        bind((AbstractC5142t<T>) obj, (AbstractC5141s<?>) abstractC5141s);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public boolean onFailedToRecycleView(T t) {
        return super.onFailedToRecycleView((AbstractC5142t<T>) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public void onViewAttachedToWindow(T t) {
        super.onViewAttachedToWindow((AbstractC5142t<T>) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public void onViewDetachedFromWindow(T t) {
        super.onViewDetachedFromWindow((AbstractC5142t<T>) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, T t) {
        super.onVisibilityChanged(f2, f3, i2, i3, (int) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityStateChanged(int i2, T t) {
        super.onVisibilityStateChanged(i2, (int) t);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public void unbind(T t) {
        super.unbind((AbstractC5142t<T>) t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.epoxy.AbstractC5141s
    public /* bridge */ /* synthetic */ void bind(Object obj, List list) {
        bind((AbstractC5142t<T>) obj, (List<Object>) list);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public void bind(T t) {
        super.bind((AbstractC5142t<T>) t);
    }

    public void bind(T t, List<Object> list) {
        super.bind((AbstractC5142t<T>) t, list);
    }

    public void bind(T t, AbstractC5141s<?> abstractC5141s) {
        super.bind((AbstractC5142t<T>) t, abstractC5141s);
    }
}
