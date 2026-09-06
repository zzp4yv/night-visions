package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p024c.p025a.C0832j;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: f */
    private int f1016f;

    /* renamed from: g */
    private int f1017g;

    /* renamed from: h */
    private WeakReference<View> f1018h;

    /* renamed from: i */
    private LayoutInflater f1019i;

    /* renamed from: j */
    private InterfaceC0151a f1020j;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface InterfaceC0151a {
        /* renamed from: a */
        void m884a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View m883a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1016f == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1019i;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1016f, viewGroup, false);
        int i2 = this.f1017g;
        if (i2 != -1) {
            inflate.setId(i2);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1018h = new WeakReference<>(inflate);
        InterfaceC0151a interfaceC0151a = this.f1020j;
        if (interfaceC0151a != null) {
            interfaceC0151a.m884a(this, inflate);
        }
        return inflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1017g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1019i;
    }

    public int getLayoutResource() {
        return this.f1016f;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f1017g = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1019i = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f1016f = i2;
    }

    public void setOnInflateListener(InterfaceC0151a interfaceC0151a) {
        this.f1020j = interfaceC0151a;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f1018h;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            m883a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1016f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0832j.f5308V3, i2, 0);
        this.f1017g = obtainStyledAttributes.getResourceId(C0832j.f5323Y3, -1);
        this.f1016f = obtainStyledAttributes.getResourceId(C0832j.f5318X3, 0);
        setId(obtainStyledAttributes.getResourceId(C0832j.f5313W3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
