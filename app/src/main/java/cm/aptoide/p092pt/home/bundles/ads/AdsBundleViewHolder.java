package cm.aptoide.p092pt.home.bundles.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.Translator;
import java.text.DecimalFormat;
import java.util.ArrayList;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
class AdsBundleViewHolder extends AppBundleViewHolder {
    private final AdsInBundleAdapter appsInBundleAdapter;
    private final RecyclerView appsList;
    private final TextView bundleTitle;
    private final String marketName;
    private final Button moreButton;
    private final Skeleton skeleton;
    private final C11370b<HomeEvent> uiEventsListener;

    public AdsBundleViewHolder(View view, C11370b<HomeEvent> c11370b, DecimalFormat decimalFormat, C11370b<AdHomeEvent> c11370b2, String str) {
        super(view);
        this.marketName = str;
        this.uiEventsListener = c11370b;
        this.bundleTitle = (TextView) view.findViewById(C1138R.id.bundle_title);
        this.moreButton = (Button) view.findViewById(C1138R.id.bundle_more);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1138R.id.apps_list);
        this.appsList = recyclerView;
        AdsInBundleAdapter adsInBundleAdapter = new AdsInBundleAdapter(new ArrayList(), decimalFormat, c11370b2);
        this.appsInBundleAdapter = adsInBundleAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        recyclerView.addItemDecoration(new RecyclerView.AbstractC0601n() { // from class: cm.aptoide.pt.home.bundles.ads.AdsBundleViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView2, RecyclerView.C0613z c0613z) {
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view2.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, pixelsForDip);
            }
        });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adsInBundleAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        this.skeleton = SkeletonUtils.applySkeleton(recyclerView, C1138R.layout.app_home_item_skeleton, Type.ADS.getPerLineCount(view.getContext().getResources(), (WindowManager) view.getContext().getSystemService("window")) * 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setBundle$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8068a(HomeBundle homeBundle, View view) {
        this.uiEventsListener.onNext(new HomeEvent(homeBundle, getAdapterPosition(), HomeEvent.Type.MORE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, int i2) {
        if (!(homeBundle instanceof AdBundle)) {
            throw new IllegalStateException(getClass().getName() + " is getting non AdBundle instance!");
        }
        this.bundleTitle.setText(Translator.translate(homeBundle.getTitle(), this.itemView.getContext(), this.marketName));
        if (homeBundle.getContent() == null) {
            this.skeleton.showSkeleton();
            return;
        }
        this.skeleton.showOriginal();
        this.appsInBundleAdapter.updateBundle(homeBundle, i2);
        this.appsInBundleAdapter.update(homeBundle.getContent());
        this.appsList.addOnScrollListener(new RecyclerView.AbstractC0607t() { // from class: cm.aptoide.pt.home.bundles.ads.AdsBundleViewHolder.2
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                super.onScrolled(recyclerView, i3, i4);
                if (i3 > 0) {
                    AdsBundleViewHolder.this.uiEventsListener.onNext(new HomeEvent(homeBundle, AdsBundleViewHolder.this.getAdapterPosition(), HomeEvent.Type.SCROLL_RIGHT));
                }
            }
        });
        this.moreButton.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.ads.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdsBundleViewHolder.this.m8068a(homeBundle, view);
            }
        });
    }
}
