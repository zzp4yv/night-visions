package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0311u;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p241e.p254e.p256b.p271c.C8860a;
import p241e.p254e.p256b.p271c.p273m.C8893h;
import p241e.p254e.p256b.p271c.p273m.C8895j;

@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f30633i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m24936g0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f30633i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0229f) && (((CoordinatorLayout.C0229f) childAt.getLayoutParams()).m1481f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f30633i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C0311u.m2153t0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f30633i;
                        if (map != null && map.containsKey(childAt)) {
                            C0311u.m2153t0(childAt, this.f30633i.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            this.f30633i = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    protected boolean mo24910H(View view, View view2, boolean z, boolean z2) {
        m24936g0(view2, z);
        return super.mo24910H(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    protected FabTransformationBehavior.C8053e mo24934e0(Context context, boolean z) {
        int i2 = z ? C8860a.f33677d : C8860a.f33676c;
        FabTransformationBehavior.C8053e c8053e = new FabTransformationBehavior.C8053e();
        c8053e.f30626a = C8893h.m28442c(context, i2);
        c8053e.f30627b = new C8895j(17, 0.0f, 0.0f);
        return c8053e;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
