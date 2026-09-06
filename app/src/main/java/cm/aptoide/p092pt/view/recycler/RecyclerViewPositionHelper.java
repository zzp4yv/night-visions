package cm.aptoide.p092pt.view.recycler;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0633n;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class RecyclerViewPositionHelper {
    final RecyclerView.AbstractC0602o layoutManager;
    final RecyclerView recyclerView;

    RecyclerViewPositionHelper(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
        this.layoutManager = recyclerView.getLayoutManager();
    }

    public static RecyclerViewPositionHelper createHelper(RecyclerView recyclerView) {
        if (recyclerView != null) {
            return new RecyclerViewPositionHelper(recyclerView);
        }
        throw new NullPointerException("Recycler View is null");
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, this.layoutManager.getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(findOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, this.layoutManager.getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(this.layoutManager.getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(this.layoutManager.getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return this.recyclerView.getChildAdapterPosition(findOneVisibleChild);
    }

    View findOneVisibleChild(int i2, int i3, boolean z, boolean z2) {
        AbstractC0633n m4532c = this.layoutManager.canScrollVertically() ? AbstractC0633n.m4532c(this.layoutManager) : AbstractC0633n.m4530a(this.layoutManager);
        int mo4542m = m4532c.mo4542m();
        int mo4538i = m4532c.mo4538i();
        int i4 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View childAt = this.layoutManager.getChildAt(i2);
            int mo4536g = m4532c.mo4536g(childAt);
            int mo4533d = m4532c.mo4533d(childAt);
            if (mo4536g < mo4538i && mo4533d > mo4542m) {
                if (!z) {
                    return childAt;
                }
                if (mo4536g >= mo4542m && mo4533d <= mo4538i) {
                    return childAt;
                }
                if (z2 && view == null) {
                    view = childAt;
                }
            }
            i2 += i4;
        }
        return view;
    }

    public int getChildCount() {
        RecyclerView.AbstractC0602o abstractC0602o = this.layoutManager;
        if (abstractC0602o == null) {
            return 0;
        }
        return abstractC0602o.getChildCount();
    }

    public int getItemCount() {
        RecyclerView.AbstractC0602o abstractC0602o = this.layoutManager;
        if (abstractC0602o == null) {
            return 0;
        }
        return abstractC0602o.getItemCount();
    }
}
