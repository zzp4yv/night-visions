package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper.java */
/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C0630k extends AbstractC0637r {
    private static final float INVALID_DISTANCE = 1.0f;
    private AbstractC0633n mHorizontalHelper;
    private AbstractC0633n mVerticalHelper;

    private float computeDistancePerChild(RecyclerView.AbstractC0602o abstractC0602o, AbstractC0633n abstractC0633n) {
        int childCount = abstractC0602o.getChildCount();
        if (childCount == 0) {
            return INVALID_DISTANCE;
        }
        View view = null;
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = abstractC0602o.getChildAt(i4);
            int position = abstractC0602o.getPosition(childAt);
            if (position != -1) {
                if (position < i2) {
                    view = childAt;
                    i2 = position;
                }
                if (position > i3) {
                    view2 = childAt;
                    i3 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return INVALID_DISTANCE;
        }
        int max = Math.max(abstractC0633n.mo4533d(view), abstractC0633n.mo4533d(view2)) - Math.min(abstractC0633n.mo4536g(view), abstractC0633n.mo4536g(view2));
        return max == 0 ? INVALID_DISTANCE : (max * INVALID_DISTANCE) / ((i3 - i2) + 1);
    }

    private int distanceToCenter(RecyclerView.AbstractC0602o abstractC0602o, View view, AbstractC0633n abstractC0633n) {
        return (abstractC0633n.mo4536g(view) + (abstractC0633n.mo4534e(view) / 2)) - (abstractC0633n.mo4542m() + (abstractC0633n.mo4543n() / 2));
    }

    private int estimateNextPositionDiffForFling(RecyclerView.AbstractC0602o abstractC0602o, AbstractC0633n abstractC0633n, int i2, int i3) {
        int[] calculateScrollDistance = calculateScrollDistance(i2, i3);
        float computeDistancePerChild = computeDistancePerChild(abstractC0602o, abstractC0633n);
        if (computeDistancePerChild <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(calculateScrollDistance[0]) > Math.abs(calculateScrollDistance[1]) ? calculateScrollDistance[0] : calculateScrollDistance[1]) / computeDistancePerChild);
    }

    private View findCenterView(RecyclerView.AbstractC0602o abstractC0602o, AbstractC0633n abstractC0633n) {
        int childCount = abstractC0602o.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int mo4542m = abstractC0633n.mo4542m() + (abstractC0633n.mo4543n() / 2);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = abstractC0602o.getChildAt(i3);
            int abs = Math.abs((abstractC0633n.mo4536g(childAt) + (abstractC0633n.mo4534e(childAt) / 2)) - mo4542m);
            if (abs < i2) {
                view = childAt;
                i2 = abs;
            }
        }
        return view;
    }

    private AbstractC0633n getHorizontalHelper(RecyclerView.AbstractC0602o abstractC0602o) {
        AbstractC0633n abstractC0633n = this.mHorizontalHelper;
        if (abstractC0633n == null || abstractC0633n.f4207a != abstractC0602o) {
            this.mHorizontalHelper = AbstractC0633n.m4530a(abstractC0602o);
        }
        return this.mHorizontalHelper;
    }

    private AbstractC0633n getVerticalHelper(RecyclerView.AbstractC0602o abstractC0602o) {
        AbstractC0633n abstractC0633n = this.mVerticalHelper;
        if (abstractC0633n == null || abstractC0633n.f4207a != abstractC0602o) {
            this.mVerticalHelper = AbstractC0633n.m4532c(abstractC0602o);
        }
        return this.mVerticalHelper;
    }

    @Override // androidx.recyclerview.widget.AbstractC0637r
    public int[] calculateDistanceToFinalSnap(RecyclerView.AbstractC0602o abstractC0602o, View view) {
        int[] iArr = new int[2];
        if (abstractC0602o.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(abstractC0602o, view, getHorizontalHelper(abstractC0602o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0602o.canScrollVertically()) {
            iArr[1] = distanceToCenter(abstractC0602o, view, getVerticalHelper(abstractC0602o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0637r
    public View findSnapView(RecyclerView.AbstractC0602o abstractC0602o) {
        if (abstractC0602o.canScrollVertically()) {
            return findCenterView(abstractC0602o, getVerticalHelper(abstractC0602o));
        }
        if (abstractC0602o.canScrollHorizontally()) {
            return findCenterView(abstractC0602o, getHorizontalHelper(abstractC0602o));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC0637r
    public int findTargetSnapPosition(RecyclerView.AbstractC0602o abstractC0602o, int i2, int i3) {
        int itemCount;
        View findSnapView;
        int position;
        int i4;
        PointF computeScrollVectorForPosition;
        int i5;
        int i6;
        if (!(abstractC0602o instanceof RecyclerView.AbstractC0612y.b) || (itemCount = abstractC0602o.getItemCount()) == 0 || (findSnapView = findSnapView(abstractC0602o)) == null || (position = abstractC0602o.getPosition(findSnapView)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.AbstractC0612y.b) abstractC0602o).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (abstractC0602o.canScrollHorizontally()) {
            i5 = estimateNextPositionDiffForFling(abstractC0602o, getHorizontalHelper(abstractC0602o), i2, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (abstractC0602o.canScrollVertically()) {
            i6 = estimateNextPositionDiffForFling(abstractC0602o, getVerticalHelper(abstractC0602o), 0, i3);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i6 = -i6;
            }
        } else {
            i6 = 0;
        }
        if (abstractC0602o.canScrollVertically()) {
            i5 = i6;
        }
        if (i5 == 0) {
            return -1;
        }
        int i7 = position + i5;
        int i8 = i7 >= 0 ? i7 : 0;
        return i8 >= itemCount ? i4 : i8;
    }
}
