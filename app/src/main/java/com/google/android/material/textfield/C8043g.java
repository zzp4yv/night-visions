package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0156c;
import androidx.appcompat.widget.C0159d0;
import com.google.android.material.internal.C7999j;
import com.google.android.material.theme.p178a.C8046a;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8884k;
import p241e.p254e.p256b.p271c.C8885l;

/* compiled from: MaterialAutoCompleteTextView.java */
/* renamed from: com.google.android.material.textfield.g */
/* loaded from: classes2.dex */
public class C8043g extends C0156c {

    /* renamed from: i */
    private final C0159d0 f30589i;

    /* renamed from: j */
    private final AccessibilityManager f30590j;

    /* renamed from: k */
    private final Rect f30591k;

    /* compiled from: MaterialAutoCompleteTextView.java */
    /* renamed from: com.google.android.material.textfield.g$a */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            C8043g.this.m24894e(i2 < 0 ? C8043g.this.f30589i.m954u() : C8043g.this.getAdapter().getItem(i2));
            AdapterView.OnItemClickListener onItemClickListener = C8043g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i2 < 0) {
                    view = C8043g.this.f30589i.m957x();
                    i2 = C8043g.this.f30589i.m956w();
                    j2 = C8043g.this.f30589i.m955v();
                }
                onItemClickListener.onItemClick(C8043g.this.f30589i.mo522j(), view, i2, j2);
            }
            C8043g.this.f30589i.dismiss();
        }
    }

    public C8043g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8875b.f33812b);
    }

    /* renamed from: c */
    private TextInputLayout m24892c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: d */
    private int m24893d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m24892c = m24892c();
        int i2 = 0;
        if (adapter == null || m24892c == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f30589i.m956w()) + 15);
        View view = null;
        int i3 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = adapter.getView(max, view, m24892c);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        Drawable m948h = this.f30589i.m948h();
        if (m948h != null) {
            m948h.getPadding(this.f30591k);
            Rect rect = this.f30591k;
            i3 += rect.left + rect.right;
        }
        return i3 + m24892c.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public <T extends ListAdapter & Filterable> void m24894e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m24892c = m24892c();
        return (m24892c == null || !m24892c.isProvidingHint()) ? super.getHint() : m24892c.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m24893d()), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f30589i.mo764o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() == 0 && (accessibilityManager = this.f30590j) != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f30589i.show();
        } else {
            super.showDropDown();
        }
    }

    public C8043g(Context context, AttributeSet attributeSet, int i2) {
        super(C8046a.m24906c(context, attributeSet, i2, 0), attributeSet, i2);
        this.f30591k = new Rect();
        Context context2 = getContext();
        TypedArray m24694h = C7999j.m24694h(context2, attributeSet, C8885l.f34310r2, i2, C8884k.f33981f, new int[0]);
        int i3 = C8885l.f34317s2;
        if (m24694h.hasValue(i3) && m24694h.getInt(i3, 0) == 0) {
            setKeyListener(null);
        }
        this.f30590j = (AccessibilityManager) context2.getSystemService("accessibility");
        C0159d0 c0159d0 = new C0159d0(context2);
        this.f30589i = c0159d0;
        c0159d0.m938I(true);
        c0159d0.m932C(this);
        c0159d0.m937H(2);
        c0159d0.mo764o(getAdapter());
        c0159d0.m940K(new a());
        m24694h.recycle();
    }
}
