package cm.aptoide.p092pt.view.app;

import cm.aptoide.p092pt.presenter.View;
import java.util.List;
import p456rx.C11186e;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public interface ListStoreAppsView extends View {
    void addApps(List<Application> list);

    C11186e<Application> getAppClick();

    C11370b<Void> getRefreshEvent();

    C11186e<Void> getRetryEvent();

    void hideLoading();

    void hideRefreshLoading();

    C11186e<Object> reachesBottom();

    void setApps(List<Application> list);

    void showGenericError();

    void showLoading();

    void showNetworkError();

    void showStartingLoading();
}
