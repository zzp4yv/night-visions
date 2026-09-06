package cm.aptoide.p092pt.home.bundles;

import cm.aptoide.p092pt.ads.WalletAdsOfferCardManager;
import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.dataprovider.model.p096v7.AppCoinsCampaign;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Layout;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.AppCoinsInfo;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AppPromoItem;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.ActionItemData;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home.ActionItemResponse;
import cm.aptoide.p092pt.home.AppComingSoonRegistrationManager;
import cm.aptoide.p092pt.home.bundles.apps.RewardApp;
import cm.aptoide.p092pt.home.bundles.base.ActionItem;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.view.app.Application;
import cm.aptoide.p092pt.view.app.ApplicationGraphic;
import cm.aptoide.p092pt.view.app.FeatureGraphicApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class BundlesResponseMapper {
    private final AppComingSoonRegistrationManager appComingSoonRegistrationManager;
    private final BlacklistManager blacklistManager;
    private final DownloadStateParser downloadStateParser;
    private final InstallManager installManager;
    private final WalletAdsOfferCardManager walletAdsOfferCardManager;

    /* renamed from: cm.aptoide.pt.home.bundles.BundlesResponseMapper$1 */
    static /* synthetic */ class C29601 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type = iArr;
            try {
                iArr[Type.APPS_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.APPCOINS_ADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.APPCOINS_FEATURED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.ADS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.APPS_TOP_GROUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.NEW_APP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[Type.NEW_APP_VERSION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[Layout.values().length];
            $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout = iArr2;
            try {
                iArr2[Layout.APPC_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout[Layout.CURATION_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout[Layout.WALLET_ADS_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout[Layout.PROMO_GRAPHIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public BundlesResponseMapper(InstallManager installManager, WalletAdsOfferCardManager walletAdsOfferCardManager, BlacklistManager blacklistManager, DownloadStateParser downloadStateParser, AppComingSoonRegistrationManager appComingSoonRegistrationManager) {
        this.installManager = installManager;
        this.walletAdsOfferCardManager = walletAdsOfferCardManager;
        this.blacklistManager = blacklistManager;
        this.downloadStateParser = downloadStateParser;
        this.appComingSoonRegistrationManager = appComingSoonRegistrationManager;
    }

    private HomeBundle.BundleType actionItemTypeMapper(GetStoreWidgets.WSWidget wSWidget) {
        if (wSWidget.getData() != null) {
            int i2 = C29601.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Layout[wSWidget.getData().getLayout().ordinal()];
            if (i2 == 1) {
                return HomeBundle.BundleType.INFO_BUNDLE;
            }
            if (i2 == 2) {
                return HomeBundle.BundleType.EDITORIAL;
            }
            if (i2 == 3) {
                return HomeBundle.BundleType.WALLET_ADS_OFFER;
            }
            if (i2 == 4) {
                if (wSWidget.getType().equals(Type.NEWS_ITEM)) {
                    return HomeBundle.BundleType.NEWS_ITEM;
                }
                if (wSWidget.getType().equals(Type.IN_GAME_EVENT)) {
                    return HomeBundle.BundleType.IN_GAME_EVENT;
                }
                if (wSWidget.getType().equals(Type.APP_COMING_SOON)) {
                    return HomeBundle.BundleType.APP_COMING_SOON;
                }
            }
        }
        return HomeBundle.BundleType.UNKNOWN;
    }

    private HomeBundle.BundleType bundleTypeMapper(Type type, GetStoreWidgets.WSWidget.Data data) {
        if (type == null) {
            return HomeBundle.BundleType.UNKNOWN;
        }
        switch (C29601.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Type[type.ordinal()]) {
            case 1:
                return data == null ? HomeBundle.BundleType.UNKNOWN : data.getLayout().equals(Layout.BRICK) ? HomeBundle.BundleType.EDITORS : HomeBundle.BundleType.APPS;
            case 2:
                return HomeBundle.BundleType.APPCOINS_ADS;
            case 3:
                return HomeBundle.BundleType.FEATURED_BONUS_APPC;
            case 4:
                return HomeBundle.BundleType.ADS;
            case 5:
                return HomeBundle.BundleType.TOP;
            case 6:
                return HomeBundle.BundleType.NEW_APP;
            case 7:
                return HomeBundle.BundleType.NEW_APP_VERSION;
            default:
                return HomeBundle.BundleType.APPS;
        }
    }

    private Event getEvent(GetStoreWidgets.WSWidget wSWidget) {
        if (wSWidget.getActions() == null || wSWidget.getActions().size() <= 0) {
            return null;
        }
        return wSWidget.getActions().get(0).getEvent();
    }

    private Install getInstall(AppPromoItem appPromoItem, ApplicationGraphic applicationGraphic) {
        return this.installManager.getInstall(appPromoItem.getGetApp().getNodes().getMeta().getData().getMd5(), applicationGraphic.getPackageName(), appPromoItem.getGetApp().getNodes().getMeta().getData().getFile().getVercode()).m40081W0().m40551b();
    }

    private String getWidgetActionTag(GetStoreWidgets.WSWidget wSWidget) {
        return wSWidget.hasActions() ? wSWidget.getActions().get(0).getTag() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    private ApplicationGraphic map(GetAppMeta.App app, String str) {
        return new ApplicationGraphic(app.getName(), app.getIcon(), app.getStats().getGlobalRating().getAvg(), app.getStats().getPdownloads(), app.getPackageName(), app.getId(), str, app.hasBilling(), app.getGraphic());
    }

    private RewardApp.Reward mapReward(AppCoinsCampaign.Reward reward) {
        AppCoinsCampaign.Fiat fiat = reward.getFiat();
        return new RewardApp.Reward(reward.getAppc(), new RewardApp.Fiat(fiat.getAmount(), fiat.getCurrency(), fiat.getSymbol()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0343, code lost:
    
        r7 = map(((cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps) r5).getDataList().getList(), r8, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<cm.aptoide.p092pt.home.bundles.base.HomeBundle> fromWidgetsToBundles(java.util.List<cm.aptoide.pt.dataprovider.model.v7.GetStoreWidgets.WSWidget> r23) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.home.bundles.BundlesResponseMapper.fromWidgetsToBundles(java.util.List):java.util.List");
    }

    private ActionItem map(ActionItemResponse actionItemResponse) {
        if (actionItemResponse == null) {
            return null;
        }
        ActionItemData actionItemData = actionItemResponse.getDataList().getList().get(0);
        return new ActionItem(actionItemData.getId(), actionItemData.getType() != null ? actionItemData.getType() : HttpUrl.FRAGMENT_ENCODE_SET, actionItemData.getTitle(), actionItemData.getCaption(), actionItemData.getIcon(), actionItemData.getUrl(), actionItemData.getDate(), actionItemData.getAppearance() != null ? actionItemData.getAppearance().getCaption().getTheme() : HttpUrl.FRAGMENT_ENCODE_SET, actionItemData.getFlair() != null ? actionItemData.getFlair() : HttpUrl.FRAGMENT_ENCODE_SET, actionItemData.getSummary(), actionItemData.getPackageName(), actionItemData.getGraphic());
    }

    private List<Application> map(List<App> list, HomeBundle.BundleType bundleType, String str) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (App app : list) {
                try {
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    if (bundleType.equals(HomeBundle.BundleType.EDITORS)) {
                        AppCoinsInfo appcoins = app.getAppcoins();
                        arrayList.add(new FeatureGraphicApplication(app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getStats().getPdownloads(), app.getPackageName(), app.getId(), app.getGraphic(), str, appcoins != null && appcoins.hasBilling(), appcoins != null && appcoins.hasAdvertising()));
                    } else {
                        AppCoinsInfo appcoins2 = app.getAppcoins();
                        arrayList.add(new Application(app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getStats().getPdownloads(), app.getPackageName(), app.getId(), str, appcoins2 != null && appcoins2.hasBilling()));
                    }
                } catch (Exception e3) {
                    e = e3;
                    Logger.getInstance().m8273d(getClass().getName(), "Something went wrong while parsing apps to applications: " + e.getMessage());
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private List<Application> map(List<AppCoinsCampaign> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (AppCoinsCampaign appCoinsCampaign : list) {
            AppCoinsCampaign.CampaignApp app = appCoinsCampaign.getApp();
            if (!this.installManager.wasAppEverInstalled(app.getPackageName())) {
                arrayList.add(new RewardApp(app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getStats().getPdownloads(), app.getPackageName(), app.getId(), str, app.getAppcoins() != null, app.getAppcoins().getClicks().getClick(), app.getAppcoins().getClicks().getInstall(), mapReward(appCoinsCampaign.getReward()), app.getGraphic()));
            }
        }
        return arrayList;
    }
}
