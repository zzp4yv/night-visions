package cm.aptoide.p092pt.store.view.top;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.home.AppSecondaryInfoViewHolder;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import java.text.DecimalFormat;
import p241e.p294g.p295a.p304c.C8942a;
import p456rx.p460m.InterfaceC11205b;

/* loaded from: classes.dex */
public class TopAppListWidget extends Widget<TopAppListDisplayable> {
    private ImageView appIcon;
    private AppSecondaryInfoViewHolder appInfoViewHolder;
    private TextView downloadNumber;
    private TextView name;
    private DecimalFormat oneDecimalFormatter;
    private TextView topNumber;

    public TopAppListWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8856a(App app, TopAppListDisplayable topAppListDisplayable, Void r11) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(app.getId(), app.getPackageName(), app.getStore().getAppearance().getTheme(), app.getStore().getName(), topAppListDisplayable.getTag(), String.valueOf(getAdapterPosition())), true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.topNumber = (TextView) view.findViewById(C1138R.id.top_number);
        this.appIcon = (ImageView) view.findViewById(C1138R.id.icon);
        this.name = (TextView) view.findViewById(C1138R.id.name_label);
        this.downloadNumber = (TextView) view.findViewById(C1138R.id.download_number_label);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        this.oneDecimalFormatter = decimalFormat;
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(view, decimalFormat);
        ((TextView) view.findViewById(C1138R.id.rating_label)).setTextAppearance(view.getContext(), C1138R.style.Aptoide_TextView_Medium_XXS_Black);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final TopAppListDisplayable topAppListDisplayable, int i2) {
        final App pojo = topAppListDisplayable.getPojo();
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(pojo.getIcon(), 8, this.appIcon, C1138R.attr.placeholder_square);
        this.name.setText(pojo.getName());
        this.topNumber.setText(String.valueOf(i2 + 1));
        this.appInfoViewHolder.setInfo(pojo.getAppcoins().hasBilling(), pojo.getStats().getRating().getAvg(), true, true);
        this.downloadNumber.setText(String.format("%s %s", AptoideUtils.StringU.withSuffix(pojo.getStats().getDownloads()), this.itemView.getContext().getResources().getString(C1138R.string.downloads)));
        this.compositeSubscription.m40667a(C8942a.m28573a(this.itemView).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.top.a
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                TopAppListWidget.this.m8856a(pojo, topAppListDisplayable, (Void) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.top.b
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
