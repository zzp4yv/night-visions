package cm.aptoide.p092pt.home.bundles.apps;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.app.AppViewHolder;
import cm.aptoide.p092pt.view.app.Application;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public class RewardAppInBundleViewHolder extends AppViewHolder {
    private final C11370b<HomeEvent> appClicks;
    private final ImageView appIcon;
    private final TextView appName;
    private final TextView appReward;

    public RewardAppInBundleViewHolder(View view, C11370b<HomeEvent> c11370b) {
        super(view);
        this.appIcon = (ImageView) view.findViewById(C1138R.id.icon);
        this.appName = (TextView) view.findViewById(C1138R.id.name);
        this.appReward = (TextView) view.findViewById(C1138R.id.appc_text);
        this.appClicks = c11370b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setApp$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8078a(Application application, HomeBundle homeBundle, int i2, View view) {
        this.appClicks.onNext(new AppHomeEvent(application, getAdapterPosition(), homeBundle, i2, HomeEvent.Type.REWARD_APP));
    }

    @Override // cm.aptoide.p092pt.view.app.AppViewHolder
    public void setApp(final Application application, final HomeBundle homeBundle, final int i2) {
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(application.getIcon(), 8, this.appIcon, C1138R.attr.placeholder_square);
        this.appName.setText(application.getName());
        this.appReward.setText(this.itemView.getResources().getString(C1138R.string.appc_card_short));
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.apps.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RewardAppInBundleViewHolder.this.m8078a(application, homeBundle, i2, view);
            }
        });
    }
}
