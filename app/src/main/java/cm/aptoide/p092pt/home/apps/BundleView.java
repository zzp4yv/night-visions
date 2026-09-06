package cm.aptoide.p092pt.home.apps;

import cm.aptoide.p092pt.home.bundles.ads.AdHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.presenter.View;
import java.util.List;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface BundleView extends View {
    C11186e<AdHomeEvent> adClicked();

    C11186e<AppHomeEvent> appClicked();

    C11186e<HomeEvent> bundleScrolled();

    void hideLoading();

    void hideRefresh();

    void hideShowMore();

    C11186e<HomeEvent> moreClicked();

    C11186e<Object> reachesBottom();

    C11186e<Void> refreshes();

    C11186e<Void> retryClicked();

    void showBundles(List<HomeBundle> list);

    void showGenericError();

    void showLoadMore();

    void showLoading();

    void showMoreHomeBundles(List<HomeBundle> list);

    void showNetworkError();

    void updateEditorialCards();

    C11186e<HomeEvent> visibleBundles();
}
