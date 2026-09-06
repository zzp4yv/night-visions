package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p024c.p067m.C0986c;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
class LayoutInflaterFactory2C0475k implements LayoutInflater.Factory2 {

    /* renamed from: f */
    private final FragmentManager f3292f;

    LayoutInflaterFactory2C0475k(FragmentManager fragmentManager) {
        this.f3292f = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0482r m3511w;
        if (C0471g.class.getName().equals(str)) {
            return new C0471g(context, attributeSet, this.f3292f);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0986c.f6512d);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C0986c.f6513e);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C0986c.f6514f, -1);
        String string = obtainStyledAttributes.getString(C0986c.f6515g);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0473i.m3650b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment m3485i0 = resourceId != -1 ? this.f3292f.m3485i0(resourceId) : null;
        if (m3485i0 == null && string != null) {
            m3485i0 = this.f3292f.m3488j0(string);
        }
        if (m3485i0 == null && id != -1) {
            m3485i0 = this.f3292f.m3485i0(id);
        }
        if (m3485i0 == null) {
            m3485i0 = this.f3292f.m3506t0().mo3524a(context.getClassLoader(), attributeValue);
            m3485i0.mFromLayout = true;
            m3485i0.mFragmentId = resourceId != 0 ? resourceId : id;
            m3485i0.mContainerId = id;
            m3485i0.mTag = string;
            m3485i0.mInLayout = true;
            FragmentManager fragmentManager = this.f3292f;
            m3485i0.mFragmentManager = fragmentManager;
            m3485i0.mHost = fragmentManager.m3512w0();
            m3485i0.onInflate(this.f3292f.m3512w0().m3654f(), attributeSet, m3485i0.mSavedFragmentState);
            m3511w = this.f3292f.m3511w(m3485i0);
            this.f3292f.m3480g(m3485i0);
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Fragment " + m3485i0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (m3485i0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            m3485i0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f3292f;
            m3485i0.mFragmentManager = fragmentManager2;
            m3485i0.mHost = fragmentManager2.m3512w0();
            m3485i0.onInflate(this.f3292f.m3512w0().m3654f(), attributeSet, m3485i0.mSavedFragmentState);
            m3511w = this.f3292f.m3511w(m3485i0);
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + m3485i0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        m3485i0.mContainer = (ViewGroup) view;
        m3511w.m3700m();
        m3511w.m3698j();
        View view2 = m3485i0.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (m3485i0.mView.getTag() == null) {
                m3485i0.mView.setTag(string);
            }
            return m3485i0.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
