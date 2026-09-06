package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.C0893f;
import p024c.p044g.p048b.p049k.C0894g;
import p024c.p044g.p048b.p049k.C0897j;
import p024c.p044g.p048b.p049k.C0898k;
import p024c.p044g.p048b.p049k.p050m.C0901b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: A */
    private int f1393A;

    /* renamed from: B */
    private int f1394B;

    /* renamed from: f */
    SparseArray<View> f1395f;

    /* renamed from: g */
    private ArrayList<AbstractC0214b> f1396g;

    /* renamed from: h */
    protected C0893f f1397h;

    /* renamed from: i */
    private int f1398i;

    /* renamed from: j */
    private int f1399j;

    /* renamed from: k */
    private int f1400k;

    /* renamed from: l */
    private int f1401l;

    /* renamed from: m */
    protected boolean f1402m;

    /* renamed from: n */
    private int f1403n;

    /* renamed from: o */
    private C0216d f1404o;

    /* renamed from: p */
    protected C0215c f1405p;

    /* renamed from: q */
    private int f1406q;

    /* renamed from: r */
    private HashMap<String, Integer> f1407r;

    /* renamed from: s */
    private int f1408s;

    /* renamed from: t */
    private int f1409t;

    /* renamed from: u */
    int f1410u;

    /* renamed from: v */
    int f1411v;

    /* renamed from: w */
    int f1412w;

    /* renamed from: x */
    int f1413x;

    /* renamed from: y */
    private SparseArray<C0892e> f1414y;

    /* renamed from: z */
    C0212c f1415z;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0210a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1416a;

        static {
            int[] iArr = new int[C0892e.b.values().length];
            f1416a = iArr;
            try {
                iArr[C0892e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1416a[C0892e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1416a[C0892e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1416a[C0892e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0212c implements C0901b.b {

        /* renamed from: a */
        ConstraintLayout f1485a;

        /* renamed from: b */
        int f1486b;

        /* renamed from: c */
        int f1487c;

        /* renamed from: d */
        int f1488d;

        /* renamed from: e */
        int f1489e;

        /* renamed from: f */
        int f1490f;

        /* renamed from: g */
        int f1491g;

        public C0212c(ConstraintLayout constraintLayout) {
            this.f1485a = constraintLayout;
        }

        /* renamed from: d */
        private boolean m1334d(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        @Override // p024c.p044g.p048b.p049k.p050m.C0901b.b
        /* renamed from: a */
        public final void mo1335a() {
            int childCount = this.f1485a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f1485a.getChildAt(i2);
                if (childAt instanceof C0219g) {
                    ((C0219g) childAt).m1393a(this.f1485a);
                }
            }
            int size = this.f1485a.f1396g.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((AbstractC0214b) this.f1485a.f1396g.get(i3)).m1350k(this.f1485a);
                }
            }
        }

        @Override // p024c.p044g.p048b.p049k.p050m.C0901b.b
        @SuppressLint({"WrongCall"})
        /* renamed from: b */
        public final void mo1336b(C0892e c0892e, C0901b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i2;
            int i3;
            int i4;
            if (c0892e == null) {
                return;
            }
            if (c0892e.m5684Q() == 8 && !c0892e.m5703a0()) {
                aVar.f6091h = 0;
                aVar.f6092i = 0;
                aVar.f6093j = 0;
                return;
            }
            if (c0892e.m5668I() == null) {
                return;
            }
            C0892e.b bVar = aVar.f6087d;
            C0892e.b bVar2 = aVar.f6088e;
            int i5 = aVar.f6089f;
            int i6 = aVar.f6090g;
            int i7 = this.f1486b + this.f1487c;
            int i8 = this.f1488d;
            View view = (View) c0892e.m5726q();
            int[] iArr = C0210a.f1416a;
            int i9 = iArr[bVar.ordinal()];
            if (i9 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1490f, i8, -2);
            } else if (i9 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1490f, i8 + c0892e.m5744z(), -1);
            } else if (i9 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1490f, i8, -2);
                boolean z = c0892e.f6000q == 1;
                int i10 = aVar.f6096m;
                if (i10 == C0901b.a.f6085b || i10 == C0901b.a.f6086c) {
                    if (aVar.f6096m == C0901b.a.f6086c || !z || (z && (view.getMeasuredHeight() == c0892e.m5736v())) || (view instanceof C0219g) || c0892e.mo5614e0()) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0892e.m5686R(), 1073741824);
                    }
                }
            }
            int i11 = iArr[bVar2.ordinal()];
            if (i11 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i11 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1491g, i7, -2);
            } else if (i11 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1491g, i7 + c0892e.m5682P(), -1);
            } else if (i11 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1491g, i7, -2);
                boolean z2 = c0892e.f6002r == 1;
                int i12 = aVar.f6096m;
                if (i12 == C0901b.a.f6085b || i12 == C0901b.a.f6086c) {
                    if (aVar.f6096m == C0901b.a.f6086c || !z2 || (z2 && (view.getMeasuredWidth() == c0892e.m5686R())) || (view instanceof C0219g) || c0892e.mo5616f0()) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0892e.m5736v(), 1073741824);
                    }
                }
            }
            C0893f c0893f = (C0893f) c0892e.m5668I();
            if (c0893f != null && C0897j.m5793b(ConstraintLayout.this.f1403n, 256) && view.getMeasuredWidth() == c0892e.m5686R() && view.getMeasuredWidth() < c0893f.m5686R() && view.getMeasuredHeight() == c0892e.m5736v() && view.getMeasuredHeight() < c0893f.m5736v() && view.getBaseline() == c0892e.m5720n() && !c0892e.m5706d0()) {
                if (m1334d(c0892e.m5652A(), makeMeasureSpec, c0892e.m5686R()) && m1334d(c0892e.m5654B(), makeMeasureSpec2, c0892e.m5736v())) {
                    aVar.f6091h = c0892e.m5686R();
                    aVar.f6092i = c0892e.m5736v();
                    aVar.f6093j = c0892e.m5720n();
                    return;
                }
            }
            C0892e.b bVar3 = C0892e.b.MATCH_CONSTRAINT;
            boolean z3 = bVar == bVar3;
            boolean z4 = bVar2 == bVar3;
            C0892e.b bVar4 = C0892e.b.MATCH_PARENT;
            boolean z5 = bVar2 == bVar4 || bVar2 == C0892e.b.FIXED;
            boolean z6 = bVar == bVar4 || bVar == C0892e.b.FIXED;
            boolean z7 = z3 && c0892e.f5966X > 0.0f;
            boolean z8 = z4 && c0892e.f5966X > 0.0f;
            if (view == null) {
                return;
            }
            C0211b c0211b = (C0211b) view.getLayoutParams();
            int i13 = aVar.f6096m;
            if (i13 != C0901b.a.f6085b && i13 != C0901b.a.f6086c && z3 && c0892e.f6000q == 0 && z4 && c0892e.f6002r == 0) {
                i4 = -1;
                i3 = 0;
                baseline = 0;
                max = 0;
            } else {
                if ((view instanceof AbstractC0222j) && (c0892e instanceof C0898k)) {
                    ((AbstractC0222j) view).m1395o((C0898k) c0892e, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                c0892e.m5663F0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i14 = c0892e.f6006t;
                max = i14 > 0 ? Math.max(i14, measuredWidth) : measuredWidth;
                int i15 = c0892e.f6008u;
                if (i15 > 0) {
                    max = Math.min(i15, max);
                }
                int i16 = c0892e.f6012w;
                if (i16 > 0) {
                    i3 = Math.max(i16, measuredHeight);
                    i2 = makeMeasureSpec;
                } else {
                    i2 = makeMeasureSpec;
                    i3 = measuredHeight;
                }
                int i17 = c0892e.f6014x;
                if (i17 > 0) {
                    i3 = Math.min(i17, i3);
                }
                if (!C0897j.m5793b(ConstraintLayout.this.f1403n, 1)) {
                    if (z7 && z5) {
                        max = (int) ((i3 * c0892e.f5966X) + 0.5f);
                    } else if (z8 && z6) {
                        i3 = (int) ((max / c0892e.f5966X) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != i3) {
                    int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i2;
                    if (measuredHeight != i3) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    }
                    view.measure(makeMeasureSpec3, makeMeasureSpec2);
                    c0892e.m5663F0(makeMeasureSpec3, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    i3 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i4 = -1;
            }
            boolean z9 = baseline != i4;
            aVar.f6095l = (max == aVar.f6089f && i3 == aVar.f6090g) ? false : true;
            if (c0211b.f1441Y) {
                z9 = true;
            }
            if (z9 && baseline != -1 && c0892e.m5720n() != baseline) {
                aVar.f6095l = true;
            }
            aVar.f6091h = max;
            aVar.f6092i = i3;
            aVar.f6094k = z9;
            aVar.f6093j = baseline;
        }

        /* renamed from: c */
        public void m1337c(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f1486b = i4;
            this.f1487c = i5;
            this.f1488d = i6;
            this.f1489e = i7;
            this.f1490f = i2;
            this.f1491g = i3;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1395f = new SparseArray<>();
        this.f1396g = new ArrayList<>(4);
        this.f1397h = new C0893f();
        this.f1398i = 0;
        this.f1399j = 0;
        this.f1400k = Integer.MAX_VALUE;
        this.f1401l = Integer.MAX_VALUE;
        this.f1402m = true;
        this.f1403n = 257;
        this.f1404o = null;
        this.f1405p = null;
        this.f1406q = -1;
        this.f1407r = new HashMap<>();
        this.f1408s = -1;
        this.f1409t = -1;
        this.f1410u = -1;
        this.f1411v = -1;
        this.f1412w = 0;
        this.f1413x = 0;
        this.f1414y = new SparseArray<>();
        this.f1415z = new C0212c(this);
        this.f1393A = 0;
        this.f1394B = 0;
        m1317j(attributeSet, 0, 0);
    }

    /* renamed from: g */
    private final C0892e m1316g(int i2) {
        if (i2 == 0) {
            return this.f1397h;
        }
        View view = this.f1395f.get(i2);
        if (view == null && (view = findViewById(i2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1397h;
        }
        if (view == null) {
            return null;
        }
        return ((C0211b) view.getLayoutParams()).f1470n0;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart()) : 0;
        return max2 > 0 ? max2 : max;
    }

    /* renamed from: j */
    private void m1317j(AttributeSet attributeSet, int i2, int i3) {
        this.f1397h.m5717l0(this);
        this.f1397h.m5753D1(this.f1415z);
        this.f1395f.put(getId(), this);
        this.f1404o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0221i.f1809a1, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == C0221i.f1844f1) {
                    this.f1398i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1398i);
                } else if (index == C0221i.f1851g1) {
                    this.f1399j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1399j);
                } else if (index == C0221i.f1830d1) {
                    this.f1400k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1400k);
                } else if (index == C0221i.f1837e1) {
                    this.f1401l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1401l);
                } else if (index == C0221i.f1898n2) {
                    this.f1403n = obtainStyledAttributes.getInt(index, this.f1403n);
                } else if (index == C0221i.f1903o1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m1328m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1405p = null;
                        }
                    }
                } else if (index == C0221i.f1885l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0216d c0216d = new C0216d();
                        this.f1404o = c0216d;
                        c0216d.m1372l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1404o = null;
                    }
                    this.f1406q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1397h.m5754E1(this.f1403n);
    }

    /* renamed from: l */
    private void m1318l() {
        this.f1402m = true;
        this.f1408s = -1;
        this.f1409t = -1;
        this.f1410u = -1;
        this.f1411v = -1;
        this.f1412w = 0;
        this.f1413x = 0;
    }

    /* renamed from: p */
    private void m1319p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C0892e m1326i = m1326i(getChildAt(i2));
            if (m1326i != null) {
                m1326i.mo5710h0();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m1331q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m1316g(childAt.getId()).m5719m0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1406q != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                if (childAt2.getId() == this.f1406q && (childAt2 instanceof C0217e)) {
                    this.f1404o = ((C0217e) childAt2).getConstraintSet();
                }
            }
        }
        C0216d c0216d = this.f1404o;
        if (c0216d != null) {
            c0216d.m1367d(this, true);
        }
        this.f1397h.m5799d1();
        int size = this.f1396g.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f1396g.get(i5).m1352m(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt3 = getChildAt(i6);
            if (childAt3 instanceof C0219g) {
                ((C0219g) childAt3).m1394b(this);
            }
        }
        this.f1414y.clear();
        this.f1414y.put(0, this.f1397h);
        this.f1414y.put(getId(), this.f1397h);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt4 = getChildAt(i7);
            this.f1414y.put(childAt4.getId(), m1326i(childAt4));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt5 = getChildAt(i8);
            C0892e m1326i2 = m1326i(childAt5);
            if (m1326i2 != null) {
                C0211b c0211b = (C0211b) childAt5.getLayoutParams();
                this.f1397h.m5796a(m1326i2);
                m1321c(isInEditMode, childAt5, m1326i2, c0211b, this.f1414y);
            }
        }
    }

    /* renamed from: s */
    private boolean m1320s() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (getChildAt(i2).isLayoutRequested()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            m1319p();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cd  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m1321c(boolean r20, android.view.View r21, p024c.p044g.p048b.p049k.C0892e r22, androidx.constraintlayout.widget.ConstraintLayout.C0211b r23, android.util.SparseArray<p024c.p044g.p048b.p049k.C0892e> r24) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1321c(boolean, android.view.View, c.g.b.k.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0211b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0211b generateDefaultLayoutParams() {
        return new C0211b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0214b> arrayList = this.f1396g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f1396g.get(i2).m1351l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        int i5 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i4;
                        float f3 = i5;
                        float f4 = i4 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i5 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0211b generateLayoutParams(AttributeSet attributeSet) {
        return new C0211b(getContext(), attributeSet);
    }

    /* renamed from: f */
    public Object m1324f(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1407r;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1407r.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        m1318l();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f1401l;
    }

    public int getMaxWidth() {
        return this.f1400k;
    }

    public int getMinHeight() {
        return this.f1399j;
    }

    public int getMinWidth() {
        return this.f1398i;
    }

    public int getOptimizationLevel() {
        return this.f1397h.m5769s1();
    }

    /* renamed from: h */
    public View m1325h(int i2) {
        return this.f1395f.get(i2);
    }

    /* renamed from: i */
    public final C0892e m1326i(View view) {
        if (view == this) {
            return this.f1397h;
        }
        if (view == null) {
            return null;
        }
        return ((C0211b) view.getLayoutParams()).f1470n0;
    }

    /* renamed from: k */
    protected boolean m1327k() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    /* renamed from: m */
    protected void m1328m(int i2) {
        this.f1405p = new C0215c(getContext(), this, i2);
    }

    /* renamed from: n */
    protected void m1329n(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        C0212c c0212c = this.f1415z;
        int i6 = c0212c.f1489e;
        int i7 = i4 + c0212c.f1488d;
        int i8 = i5 + i6;
        if (Build.VERSION.SDK_INT < 11) {
            setMeasuredDimension(i7, i8);
            this.f1408s = i7;
            this.f1409t = i8;
            return;
        }
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i7, i2, 0);
        int resolveSizeAndState2 = ViewGroup.resolveSizeAndState(i8, i3, 0) & 16777215;
        int min = Math.min(this.f1400k, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1401l, resolveSizeAndState2);
        if (z) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.f1408s = min;
        this.f1409t = min2;
    }

    /* renamed from: o */
    protected void m1330o(C0893f c0893f, int i2, int i3, int i4) {
        int max;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i5 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        this.f1415z.m1337c(i3, i4, max2, max3, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int max4 = Math.max(0, getPaddingStart());
            int max5 = Math.max(0, getPaddingEnd());
            if (max4 <= 0 && max5 <= 0) {
                max4 = Math.max(0, getPaddingLeft());
            } else if (m1327k()) {
                max4 = max5;
            }
            max = max4;
        } else {
            max = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        m1332r(c0893f, mode, i6, mode2, i7);
        c0893f.m5776z1(i2, mode, i6, mode2, i7, this.f1408s, this.f1409t, max, max2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C0211b c0211b = (C0211b) childAt.getLayoutParams();
            C0892e c0892e = c0211b.f1470n0;
            if ((childAt.getVisibility() != 8 || c0211b.f1442Z || c0211b.f1444a0 || c0211b.f1448c0 || isInEditMode) && !c0211b.f1446b0) {
                int m5688S = c0892e.m5688S();
                int m5690T = c0892e.m5690T();
                int m5686R = c0892e.m5686R() + m5688S;
                int m5736v = c0892e.m5736v() + m5690T;
                childAt.layout(m5688S, m5690T, m5686R, m5736v);
                if ((childAt instanceof C0219g) && (content = ((C0219g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m5688S, m5690T, m5686R, m5736v);
                }
            }
        }
        int size = this.f1396g.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.f1396g.get(i7).mo1338j(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (!this.f1402m) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                if (getChildAt(i4).isLayoutRequested()) {
                    this.f1402m = true;
                    break;
                }
                i4++;
            }
        }
        if (!this.f1402m) {
            int i5 = this.f1393A;
            if (i5 == i2 && this.f1394B == i3) {
                m1329n(i2, i3, this.f1397h.m5686R(), this.f1397h.m5736v(), this.f1397h.m5775y1(), this.f1397h.m5773w1());
                return;
            }
            if (i5 == i2 && View.MeasureSpec.getMode(i2) == 1073741824 && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f1394B) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i3) >= this.f1397h.m5736v()) {
                this.f1393A = i2;
                this.f1394B = i3;
                m1329n(i2, i3, this.f1397h.m5686R(), this.f1397h.m5736v(), this.f1397h.m5775y1(), this.f1397h.m5773w1());
                return;
            }
        }
        this.f1393A = i2;
        this.f1394B = i3;
        this.f1397h.m5755F1(m1327k());
        if (this.f1402m) {
            this.f1402m = false;
            if (m1320s()) {
                this.f1397h.m5757H1();
            }
        }
        m1330o(this.f1397h, this.f1403n, i2, i3);
        m1329n(i2, i3, this.f1397h.m5686R(), this.f1397h.m5736v(), this.f1397h.m5775y1(), this.f1397h.m5773w1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0892e m1326i = m1326i(view);
        if ((view instanceof Guideline) && !(m1326i instanceof C0894g)) {
            C0211b c0211b = (C0211b) view.getLayoutParams();
            C0894g c0894g = new C0894g();
            c0211b.f1470n0 = c0894g;
            c0211b.f1442Z = true;
            c0894g.m5786j1(c0211b.f1435S);
        }
        if (view instanceof AbstractC0214b) {
            AbstractC0214b abstractC0214b = (AbstractC0214b) view;
            abstractC0214b.m1353n();
            ((C0211b) view.getLayoutParams()).f1444a0 = true;
            if (!this.f1396g.contains(abstractC0214b)) {
                this.f1396g.add(abstractC0214b);
            }
        }
        this.f1395f.put(view.getId(), view);
        this.f1402m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1395f.remove(view.getId());
        this.f1397h.m5798c1(m1326i(view));
        this.f1396g.remove(view);
        this.f1402m = true;
    }

    /* renamed from: q */
    public void m1331q(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1407r == null) {
                this.f1407r = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1407r.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: r */
    protected void m1332r(C0893f c0893f, int i2, int i3, int i4, int i5) {
        C0892e.b bVar;
        C0212c c0212c = this.f1415z;
        int i6 = c0212c.f1489e;
        int i7 = c0212c.f1488d;
        C0892e.b bVar2 = C0892e.b.FIXED;
        int childCount = getChildCount();
        if (i2 == Integer.MIN_VALUE) {
            bVar = C0892e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i3 = Math.max(0, this.f1398i);
            }
        } else if (i2 == 0) {
            bVar = C0892e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i3 = Math.max(0, this.f1398i);
            }
            i3 = 0;
        } else if (i2 != 1073741824) {
            bVar = bVar2;
            i3 = 0;
        } else {
            i3 = Math.min(this.f1400k - i7, i3);
            bVar = bVar2;
        }
        if (i4 == Integer.MIN_VALUE) {
            bVar2 = C0892e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i5 = Math.max(0, this.f1399j);
            }
        } else if (i4 != 0) {
            if (i4 == 1073741824) {
                i5 = Math.min(this.f1401l - i6, i5);
            }
            i5 = 0;
        } else {
            bVar2 = C0892e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i5 = Math.max(0, this.f1399j);
            }
            i5 = 0;
        }
        if (i3 != c0893f.m5686R() || i5 != c0893f.m5736v()) {
            c0893f.m5772v1();
        }
        c0893f.m5695V0(0);
        c0893f.m5697W0(0);
        c0893f.m5667H0(this.f1400k - i7);
        c0893f.m5665G0(this.f1401l - i6);
        c0893f.m5673K0(0);
        c0893f.m5671J0(0);
        c0893f.m5745z0(bVar);
        c0893f.m5693U0(i3);
        c0893f.m5685Q0(bVar2);
        c0893f.m5737v0(i5);
        c0893f.m5673K0(this.f1398i - i7);
        c0893f.m5671J0(this.f1399j - i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m1318l();
        super.requestLayout();
    }

    public void setConstraintSet(C0216d c0216d) {
        this.f1404o = c0216d;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f1395f.remove(getId());
        super.setId(i2);
        this.f1395f.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f1401l) {
            return;
        }
        this.f1401l = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f1400k) {
            return;
        }
        this.f1400k = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f1399j) {
            return;
        }
        this.f1399j = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f1398i) {
            return;
        }
        this.f1398i = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0218f abstractC0218f) {
        C0215c c0215c = this.f1405p;
        if (c0215c != null) {
            c0215c.m1356c(abstractC0218f);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f1403n = i2;
        this.f1397h.m5754E1(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0211b(layoutParams);
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0211b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f1417A;

        /* renamed from: B */
        public String f1418B;

        /* renamed from: C */
        float f1419C;

        /* renamed from: D */
        int f1420D;

        /* renamed from: E */
        public float f1421E;

        /* renamed from: F */
        public float f1422F;

        /* renamed from: G */
        public int f1423G;

        /* renamed from: H */
        public int f1424H;

        /* renamed from: I */
        public int f1425I;

        /* renamed from: J */
        public int f1426J;

        /* renamed from: K */
        public int f1427K;

        /* renamed from: L */
        public int f1428L;

        /* renamed from: M */
        public int f1429M;

        /* renamed from: N */
        public int f1430N;

        /* renamed from: O */
        public float f1431O;

        /* renamed from: P */
        public float f1432P;

        /* renamed from: Q */
        public int f1433Q;

        /* renamed from: R */
        public int f1434R;

        /* renamed from: S */
        public int f1435S;

        /* renamed from: T */
        public boolean f1436T;

        /* renamed from: U */
        public boolean f1437U;

        /* renamed from: V */
        public String f1438V;

        /* renamed from: W */
        boolean f1439W;

        /* renamed from: X */
        boolean f1440X;

        /* renamed from: Y */
        boolean f1441Y;

        /* renamed from: Z */
        boolean f1442Z;

        /* renamed from: a */
        public int f1443a;

        /* renamed from: a0 */
        boolean f1444a0;

        /* renamed from: b */
        public int f1445b;

        /* renamed from: b0 */
        boolean f1446b0;

        /* renamed from: c */
        public float f1447c;

        /* renamed from: c0 */
        boolean f1448c0;

        /* renamed from: d */
        public int f1449d;

        /* renamed from: d0 */
        int f1450d0;

        /* renamed from: e */
        public int f1451e;

        /* renamed from: e0 */
        int f1452e0;

        /* renamed from: f */
        public int f1453f;

        /* renamed from: f0 */
        int f1454f0;

        /* renamed from: g */
        public int f1455g;

        /* renamed from: g0 */
        int f1456g0;

        /* renamed from: h */
        public int f1457h;

        /* renamed from: h0 */
        int f1458h0;

        /* renamed from: i */
        public int f1459i;

        /* renamed from: i0 */
        int f1460i0;

        /* renamed from: j */
        public int f1461j;

        /* renamed from: j0 */
        float f1462j0;

        /* renamed from: k */
        public int f1463k;

        /* renamed from: k0 */
        int f1464k0;

        /* renamed from: l */
        public int f1465l;

        /* renamed from: l0 */
        int f1466l0;

        /* renamed from: m */
        public int f1467m;

        /* renamed from: m0 */
        float f1468m0;

        /* renamed from: n */
        public int f1469n;

        /* renamed from: n0 */
        C0892e f1470n0;

        /* renamed from: o */
        public float f1471o;

        /* renamed from: o0 */
        public boolean f1472o0;

        /* renamed from: p */
        public int f1473p;

        /* renamed from: q */
        public int f1474q;

        /* renamed from: r */
        public int f1475r;

        /* renamed from: s */
        public int f1476s;

        /* renamed from: t */
        public int f1477t;

        /* renamed from: u */
        public int f1478u;

        /* renamed from: v */
        public int f1479v;

        /* renamed from: w */
        public int f1480w;

        /* renamed from: x */
        public int f1481x;

        /* renamed from: y */
        public int f1482y;

        /* renamed from: z */
        public float f1483z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class a {

            /* renamed from: a */
            public static final SparseIntArray f1484a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1484a = sparseIntArray;
                sparseIntArray.append(C0221i.f1731N1, 8);
                sparseIntArray.append(C0221i.f1737O1, 9);
                sparseIntArray.append(C0221i.f1749Q1, 10);
                sparseIntArray.append(C0221i.f1755R1, 11);
                sparseIntArray.append(C0221i.f1791X1, 12);
                sparseIntArray.append(C0221i.f1785W1, 13);
                sparseIntArray.append(C0221i.f1945v1, 14);
                sparseIntArray.append(C0221i.f1939u1, 15);
                sparseIntArray.append(C0221i.f1927s1, 16);
                sparseIntArray.append(C0221i.f1951w1, 2);
                sparseIntArray.append(C0221i.f1963y1, 3);
                sparseIntArray.append(C0221i.f1957x1, 4);
                sparseIntArray.append(C0221i.f1845f2, 49);
                sparseIntArray.append(C0221i.f1852g2, 50);
                sparseIntArray.append(C0221i.f1665C1, 5);
                sparseIntArray.append(C0221i.f1671D1, 6);
                sparseIntArray.append(C0221i.f1677E1, 7);
                sparseIntArray.append(C0221i.f1816b1, 1);
                sparseIntArray.append(C0221i.f1761S1, 17);
                sparseIntArray.append(C0221i.f1767T1, 18);
                sparseIntArray.append(C0221i.f1659B1, 19);
                sparseIntArray.append(C0221i.f1653A1, 20);
                sparseIntArray.append(C0221i.f1873j2, 21);
                sparseIntArray.append(C0221i.f1892m2, 22);
                sparseIntArray.append(C0221i.f1880k2, 23);
                sparseIntArray.append(C0221i.f1859h2, 24);
                sparseIntArray.append(C0221i.f1886l2, 25);
                sparseIntArray.append(C0221i.f1866i2, 26);
                sparseIntArray.append(C0221i.f1707J1, 29);
                sparseIntArray.append(C0221i.f1797Y1, 30);
                sparseIntArray.append(C0221i.f1969z1, 44);
                sparseIntArray.append(C0221i.f1719L1, 45);
                sparseIntArray.append(C0221i.f1810a2, 46);
                sparseIntArray.append(C0221i.f1713K1, 47);
                sparseIntArray.append(C0221i.f1803Z1, 48);
                sparseIntArray.append(C0221i.f1915q1, 27);
                sparseIntArray.append(C0221i.f1909p1, 28);
                sparseIntArray.append(C0221i.f1817b2, 31);
                sparseIntArray.append(C0221i.f1683F1, 32);
                sparseIntArray.append(C0221i.f1831d2, 33);
                sparseIntArray.append(C0221i.f1824c2, 34);
                sparseIntArray.append(C0221i.f1838e2, 35);
                sparseIntArray.append(C0221i.f1695H1, 36);
                sparseIntArray.append(C0221i.f1689G1, 37);
                sparseIntArray.append(C0221i.f1701I1, 38);
                sparseIntArray.append(C0221i.f1725M1, 39);
                sparseIntArray.append(C0221i.f1779V1, 40);
                sparseIntArray.append(C0221i.f1743P1, 41);
                sparseIntArray.append(C0221i.f1933t1, 42);
                sparseIntArray.append(C0221i.f1921r1, 43);
                f1484a.append(C0221i.f1773U1, 51);
            }
        }

        public C0211b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i2;
            this.f1443a = -1;
            this.f1445b = -1;
            this.f1447c = -1.0f;
            this.f1449d = -1;
            this.f1451e = -1;
            this.f1453f = -1;
            this.f1455g = -1;
            this.f1457h = -1;
            this.f1459i = -1;
            this.f1461j = -1;
            this.f1463k = -1;
            this.f1465l = -1;
            this.f1467m = -1;
            this.f1469n = 0;
            this.f1471o = 0.0f;
            this.f1473p = -1;
            this.f1474q = -1;
            this.f1475r = -1;
            this.f1476s = -1;
            this.f1477t = -1;
            this.f1478u = -1;
            this.f1479v = -1;
            this.f1480w = -1;
            this.f1481x = -1;
            this.f1482y = -1;
            this.f1483z = 0.5f;
            this.f1417A = 0.5f;
            this.f1418B = null;
            this.f1419C = 0.0f;
            this.f1420D = 1;
            this.f1421E = -1.0f;
            this.f1422F = -1.0f;
            this.f1423G = 0;
            this.f1424H = 0;
            this.f1425I = 0;
            this.f1426J = 0;
            this.f1427K = 0;
            this.f1428L = 0;
            this.f1429M = 0;
            this.f1430N = 0;
            this.f1431O = 1.0f;
            this.f1432P = 1.0f;
            this.f1433Q = -1;
            this.f1434R = -1;
            this.f1435S = -1;
            this.f1436T = false;
            this.f1437U = false;
            this.f1438V = null;
            this.f1439W = true;
            this.f1440X = true;
            this.f1441Y = false;
            this.f1442Z = false;
            this.f1444a0 = false;
            this.f1446b0 = false;
            this.f1448c0 = false;
            this.f1450d0 = -1;
            this.f1452e0 = -1;
            this.f1454f0 = -1;
            this.f1456g0 = -1;
            this.f1458h0 = -1;
            this.f1460i0 = -1;
            this.f1462j0 = 0.5f;
            this.f1470n0 = new C0892e();
            this.f1472o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221i.f1809a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = a.f1484a.get(index);
                switch (i4) {
                    case 1:
                        this.f1435S = obtainStyledAttributes.getInt(index, this.f1435S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1467m);
                        this.f1467m = resourceId;
                        if (resourceId == -1) {
                            this.f1467m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f1469n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1469n);
                        break;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.f1471o) % 360.0f;
                        this.f1471o = f2;
                        if (f2 < 0.0f) {
                            this.f1471o = (360.0f - f2) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f1443a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1443a);
                        break;
                    case 6:
                        this.f1445b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1445b);
                        break;
                    case 7:
                        this.f1447c = obtainStyledAttributes.getFloat(index, this.f1447c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1449d);
                        this.f1449d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1449d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1451e);
                        this.f1451e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1451e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1453f);
                        this.f1453f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1453f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1455g);
                        this.f1455g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1455g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1457h);
                        this.f1457h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1457h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1459i);
                        this.f1459i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1459i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1461j);
                        this.f1461j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1461j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1463k);
                        this.f1463k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1463k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1465l);
                        this.f1465l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1465l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1473p);
                        this.f1473p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1473p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1474q);
                        this.f1474q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1474q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1475r);
                        this.f1475r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1475r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1476s);
                        this.f1476s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1476s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f1477t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1477t);
                        break;
                    case 22:
                        this.f1478u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1478u);
                        break;
                    case 23:
                        this.f1479v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1479v);
                        break;
                    case 24:
                        this.f1480w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1480w);
                        break;
                    case 25:
                        this.f1481x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1481x);
                        break;
                    case 26:
                        this.f1482y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1482y);
                        break;
                    case 27:
                        this.f1436T = obtainStyledAttributes.getBoolean(index, this.f1436T);
                        break;
                    case 28:
                        this.f1437U = obtainStyledAttributes.getBoolean(index, this.f1437U);
                        break;
                    case 29:
                        this.f1483z = obtainStyledAttributes.getFloat(index, this.f1483z);
                        break;
                    case 30:
                        this.f1417A = obtainStyledAttributes.getFloat(index, this.f1417A);
                        break;
                    case 31:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f1425I = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.f1426J = i6;
                        if (i6 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f1427K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1427K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1427K) == -2) {
                                this.f1427K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f1429M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1429M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1429M) == -2) {
                                this.f1429M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f1431O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1431O));
                        this.f1425I = 2;
                        break;
                    case 36:
                        try {
                            this.f1428L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1428L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1428L) == -2) {
                                this.f1428L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f1430N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1430N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1430N) == -2) {
                                this.f1430N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f1432P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1432P));
                        this.f1426J = 2;
                        break;
                    default:
                        switch (i4) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f1418B = string;
                                this.f1419C = Float.NaN;
                                this.f1420D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f1418B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.f1418B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f1420D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f1420D = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.f1418B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.f1418B.substring(i2);
                                        if (substring2.length() > 0) {
                                            this.f1419C = Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.f1418B.substring(i2, indexOf2);
                                        String substring4 = this.f1418B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f1420D == 1) {
                                                        this.f1419C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.f1419C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.f1421E = obtainStyledAttributes.getFloat(index, this.f1421E);
                                break;
                            case 46:
                                this.f1422F = obtainStyledAttributes.getFloat(index, this.f1422F);
                                break;
                            case 47:
                                this.f1423G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f1424H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f1433Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1433Q);
                                break;
                            case 50:
                                this.f1434R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1434R);
                                break;
                            case 51:
                                this.f1438V = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m1333a();
        }

        /* renamed from: a */
        public void m1333a() {
            this.f1442Z = false;
            this.f1439W = true;
            this.f1440X = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.f1436T) {
                this.f1439W = false;
                if (this.f1425I == 0) {
                    this.f1425I = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.f1437U) {
                this.f1440X = false;
                if (this.f1426J == 0) {
                    this.f1426J = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f1439W = false;
                if (i2 == 0 && this.f1425I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1436T = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.f1440X = false;
                if (i3 == 0 && this.f1426J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1437U = true;
                }
            }
            if (this.f1447c == -1.0f && this.f1443a == -1 && this.f1445b == -1) {
                return;
            }
            this.f1442Z = true;
            this.f1439W = true;
            this.f1440X = true;
            if (!(this.f1470n0 instanceof C0894g)) {
                this.f1470n0 = new C0894g();
            }
            ((C0894g) this.f1470n0).m5786j1(this.f1435S);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0211b.resolveLayoutDirection(int):void");
        }

        public C0211b(int i2, int i3) {
            super(i2, i3);
            this.f1443a = -1;
            this.f1445b = -1;
            this.f1447c = -1.0f;
            this.f1449d = -1;
            this.f1451e = -1;
            this.f1453f = -1;
            this.f1455g = -1;
            this.f1457h = -1;
            this.f1459i = -1;
            this.f1461j = -1;
            this.f1463k = -1;
            this.f1465l = -1;
            this.f1467m = -1;
            this.f1469n = 0;
            this.f1471o = 0.0f;
            this.f1473p = -1;
            this.f1474q = -1;
            this.f1475r = -1;
            this.f1476s = -1;
            this.f1477t = -1;
            this.f1478u = -1;
            this.f1479v = -1;
            this.f1480w = -1;
            this.f1481x = -1;
            this.f1482y = -1;
            this.f1483z = 0.5f;
            this.f1417A = 0.5f;
            this.f1418B = null;
            this.f1419C = 0.0f;
            this.f1420D = 1;
            this.f1421E = -1.0f;
            this.f1422F = -1.0f;
            this.f1423G = 0;
            this.f1424H = 0;
            this.f1425I = 0;
            this.f1426J = 0;
            this.f1427K = 0;
            this.f1428L = 0;
            this.f1429M = 0;
            this.f1430N = 0;
            this.f1431O = 1.0f;
            this.f1432P = 1.0f;
            this.f1433Q = -1;
            this.f1434R = -1;
            this.f1435S = -1;
            this.f1436T = false;
            this.f1437U = false;
            this.f1438V = null;
            this.f1439W = true;
            this.f1440X = true;
            this.f1441Y = false;
            this.f1442Z = false;
            this.f1444a0 = false;
            this.f1446b0 = false;
            this.f1448c0 = false;
            this.f1450d0 = -1;
            this.f1452e0 = -1;
            this.f1454f0 = -1;
            this.f1456g0 = -1;
            this.f1458h0 = -1;
            this.f1460i0 = -1;
            this.f1462j0 = 0.5f;
            this.f1470n0 = new C0892e();
            this.f1472o0 = false;
        }

        public C0211b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1443a = -1;
            this.f1445b = -1;
            this.f1447c = -1.0f;
            this.f1449d = -1;
            this.f1451e = -1;
            this.f1453f = -1;
            this.f1455g = -1;
            this.f1457h = -1;
            this.f1459i = -1;
            this.f1461j = -1;
            this.f1463k = -1;
            this.f1465l = -1;
            this.f1467m = -1;
            this.f1469n = 0;
            this.f1471o = 0.0f;
            this.f1473p = -1;
            this.f1474q = -1;
            this.f1475r = -1;
            this.f1476s = -1;
            this.f1477t = -1;
            this.f1478u = -1;
            this.f1479v = -1;
            this.f1480w = -1;
            this.f1481x = -1;
            this.f1482y = -1;
            this.f1483z = 0.5f;
            this.f1417A = 0.5f;
            this.f1418B = null;
            this.f1419C = 0.0f;
            this.f1420D = 1;
            this.f1421E = -1.0f;
            this.f1422F = -1.0f;
            this.f1423G = 0;
            this.f1424H = 0;
            this.f1425I = 0;
            this.f1426J = 0;
            this.f1427K = 0;
            this.f1428L = 0;
            this.f1429M = 0;
            this.f1430N = 0;
            this.f1431O = 1.0f;
            this.f1432P = 1.0f;
            this.f1433Q = -1;
            this.f1434R = -1;
            this.f1435S = -1;
            this.f1436T = false;
            this.f1437U = false;
            this.f1438V = null;
            this.f1439W = true;
            this.f1440X = true;
            this.f1441Y = false;
            this.f1442Z = false;
            this.f1444a0 = false;
            this.f1446b0 = false;
            this.f1448c0 = false;
            this.f1450d0 = -1;
            this.f1452e0 = -1;
            this.f1454f0 = -1;
            this.f1456g0 = -1;
            this.f1458h0 = -1;
            this.f1460i0 = -1;
            this.f1462j0 = 0.5f;
            this.f1470n0 = new C0892e();
            this.f1472o0 = false;
        }
    }
}
