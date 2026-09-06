package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.util.Arrays;
import java.util.HashMap;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.InterfaceC0895h;

/* compiled from: ConstraintHelper.java */
/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC0214b extends View {

    /* renamed from: f */
    protected int[] f1509f;

    /* renamed from: g */
    protected int f1510g;

    /* renamed from: h */
    protected Context f1511h;

    /* renamed from: i */
    protected InterfaceC0895h f1512i;

    /* renamed from: j */
    protected boolean f1513j;

    /* renamed from: k */
    protected String f1514k;

    /* renamed from: l */
    protected String f1515l;

    /* renamed from: m */
    private View[] f1516m;

    /* renamed from: n */
    private HashMap<Integer, String> f1517n;

    public AbstractC0214b(Context context) {
        super(context);
        this.f1509f = new int[32];
        this.f1513j = false;
        this.f1516m = null;
        this.f1517n = new HashMap<>();
        this.f1511h = context;
        mo1311h(null);
    }

    /* renamed from: a */
    private void m1343a(String str) {
        if (str == null || str.length() == 0 || this.f1511h == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int m1347g = m1347g(trim);
        if (m1347g != 0) {
            this.f1517n.put(Integer.valueOf(m1347g), trim);
            m1344b(m1347g);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    /* renamed from: b */
    private void m1344b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f1510g + 1;
        int[] iArr = this.f1509f;
        if (i3 > iArr.length) {
            this.f1509f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1509f;
        int i4 = this.f1510g;
        iArr2[i4] = i2;
        this.f1510g = i4 + 1;
    }

    /* renamed from: c */
    private void m1345c(String str) {
        if (str == null || str.length() == 0 || this.f1511h == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C0211b) && trim.equals(((ConstraintLayout.C0211b) layoutParams).f1438V)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m1344b(childAt.getId());
                }
            }
        }
    }

    /* renamed from: f */
    private int m1346f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1511h.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    private int m1347g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m1324f = constraintLayout.m1324f(0, str);
            if (m1324f instanceof Integer) {
                i2 = ((Integer) m1324f).intValue();
            }
        }
        if (i2 == 0 && constraintLayout != null) {
            i2 = m1346f(constraintLayout, str);
        }
        if (i2 == 0) {
            try {
                i2 = C0220h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i2 == 0 ? this.f1511h.getResources().getIdentifier(str, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, this.f1511h.getPackageName()) : i2;
    }

    /* renamed from: d */
    protected void m1348d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m1349e((ConstraintLayout) parent);
    }

    /* renamed from: e */
    protected void m1349e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.f1510g; i2++) {
            View m1325h = constraintLayout.m1325h(this.f1509f[i2]);
            if (m1325h != null) {
                m1325h.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    m1325h.setTranslationZ(m1325h.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1509f, this.f1510g);
    }

    /* renamed from: h */
    protected void mo1311h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0221i.f1809a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == C0221i.f1891m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1514k = string;
                    setIds(string);
                } else if (index == C0221i.f1897n1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1515l = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    public void mo1312i(C0892e c0892e, boolean z) {
    }

    /* renamed from: j */
    public void mo1338j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void m1350k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void m1351l(ConstraintLayout constraintLayout) {
    }

    /* renamed from: m */
    public void m1352m(ConstraintLayout constraintLayout) {
        String str;
        int m1346f;
        if (isInEditMode()) {
            setIds(this.f1514k);
        }
        InterfaceC0895h interfaceC0895h = this.f1512i;
        if (interfaceC0895h == null) {
            return;
        }
        interfaceC0895h.mo5788b();
        for (int i2 = 0; i2 < this.f1510g; i2++) {
            int i3 = this.f1509f[i2];
            View m1325h = constraintLayout.m1325h(i3);
            if (m1325h == null && (m1346f = m1346f(constraintLayout, (str = this.f1517n.get(Integer.valueOf(i3))))) != 0) {
                this.f1509f[i2] = m1346f;
                this.f1517n.put(Integer.valueOf(m1346f), str);
                m1325h = constraintLayout.m1325h(m1346f);
            }
            if (m1325h != null) {
                this.f1512i.mo5787a(constraintLayout.m1326i(m1325h));
            }
        }
        this.f1512i.mo5789c(constraintLayout.f1397h);
    }

    /* renamed from: n */
    public void m1353n() {
        if (this.f1512i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0211b) {
            ((ConstraintLayout.C0211b) layoutParams).f1470n0 = (C0892e) this.f1512i;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1514k;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1515l;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f1513j) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f1514k = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f1510g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                m1343a(str.substring(i2));
                return;
            } else {
                m1343a(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f1515l = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f1510g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                m1345c(str.substring(i2));
                return;
            } else {
                m1345c(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1514k = null;
        this.f1510g = 0;
        for (int i2 : iArr) {
            m1344b(i2);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f1514k == null) {
            m1344b(i2);
        }
    }

    public AbstractC0214b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1509f = new int[32];
        this.f1513j = false;
        this.f1516m = null;
        this.f1517n = new HashMap<>();
        this.f1511h = context;
        mo1311h(attributeSet);
    }
}
