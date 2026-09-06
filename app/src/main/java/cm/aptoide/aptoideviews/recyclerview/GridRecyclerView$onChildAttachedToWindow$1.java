package cm.aptoide.aptoideviews.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import cm.aptoide.aptoideviews.recyclerview.GridRecyclerView;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: GridRecyclerView.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "itemSize", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$Size;", "adaptStrategy", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
final class GridRecyclerView$onChildAttachedToWindow$1 extends Lambda implements Function2<GridRecyclerView.Size, GridRecyclerView.AdaptStrategy, C10742u> {
    final /* synthetic */ View $child;
    final /* synthetic */ GridRecyclerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GridRecyclerView$onChildAttachedToWindow$1(View view, GridRecyclerView gridRecyclerView) {
        super(2);
        this.$child = view;
        this.this$0 = gridRecyclerView;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ C10742u invoke(GridRecyclerView.Size size, GridRecyclerView.AdaptStrategy adaptStrategy) {
        invoke2(size, adaptStrategy);
        return C10742u.f41439a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GridRecyclerView.Size size, GridRecyclerView.AdaptStrategy adaptStrategy) {
        int itemMeasuredWidth;
        C9768m.m32346f(size, "itemSize");
        C9768m.m32346f(adaptStrategy, "adaptStrategy");
        ViewGroup.LayoutParams layoutParams = this.$child.getLayoutParams();
        if (adaptStrategy == GridRecyclerView.AdaptStrategy.SCALE_WIDTH_ONLY || adaptStrategy == GridRecyclerView.AdaptStrategy.SCALE_KEEP_ASPECT_RATIO || adaptStrategy == GridRecyclerView.AdaptStrategy.ADJUST_PADDING) {
            layoutParams.width = -1;
        }
        if (adaptStrategy == GridRecyclerView.AdaptStrategy.SCALE_KEEP_ASPECT_RATIO) {
            itemMeasuredWidth = this.this$0.getItemMeasuredWidth();
            double d2 = itemMeasuredWidth;
            double ratio = 1.0d / size.getRatio();
            Double.isNaN(d2);
            layoutParams.height = (int) (d2 * ratio);
        }
    }
}
