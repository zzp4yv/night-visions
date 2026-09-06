package cm.aptoide.p092pt.home.bundles.ads;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import java.text.DecimalFormat;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public class AdsBundlesViewHolderFactory {
    private static final int ADS = 2131492898;
    private final C11370b<AdHomeEvent> adClickedEvents;
    private final String marketName;
    private final DecimalFormat oneDecimalFormatter;
    private final C11370b<HomeEvent> uiEventsListener;

    public AdsBundlesViewHolderFactory(C11370b<HomeEvent> c11370b, C11370b<AdHomeEvent> c11370b2, DecimalFormat decimalFormat, String str) {
        this.uiEventsListener = c11370b;
        this.adClickedEvents = c11370b2;
        this.oneDecimalFormatter = decimalFormat;
        this.marketName = str;
    }

    public AppBundleViewHolder createViewHolder(ViewGroup viewGroup) {
        return new AdsBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1138R.layout.ads_bundle_item, viewGroup, false), this.uiEventsListener, this.oneDecimalFormatter, this.adClickedEvents, this.marketName);
    }
}
