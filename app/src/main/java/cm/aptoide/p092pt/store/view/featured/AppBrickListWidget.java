package cm.aptoide.p092pt.store.view.featured;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import java.text.DecimalFormat;
import p241e.p294g.p295a.p304c.C8942a;
import p456rx.p460m.InterfaceC11205b;

/* loaded from: classes.dex */
public class AppBrickListWidget extends Widget<AppBrickListDisplayable> {
    private ImageView appIcon;
    private ImageView graphic;
    private TextView name;
    private DecimalFormat oneDecimalFormatter;
    private TextView rating;

    public AppBrickListWidget(View view) {
        super(view);
        this.oneDecimalFormatter = new DecimalFormat("0.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8828a(App app, AppBrickListDisplayable appBrickListDisplayable, Void r11) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(app.getId(), app.getPackageName(), app.getStore().getAppearance().getTheme(), app.getStore().getName(), appBrickListDisplayable.getTag(), String.valueOf(getAdapterPosition())), true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.appIcon = (ImageView) view.findViewById(C1138R.id.app_icon);
        this.name = (TextView) view.findViewById(C1138R.id.app_name);
        this.graphic = (ImageView) view.findViewById(C1138R.id.featured_graphic);
        this.rating = (TextView) view.findViewById(C1138R.id.rating_label);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final AppBrickListDisplayable appBrickListDisplayable, int i2) {
        final App pojo = appBrickListDisplayable.getPojo();
        ImageLoader.with(getContext()).load(pojo.getIcon(), C1138R.attr.placeholder_square, this.appIcon);
        ImageLoader.with(getContext()).load(pojo.getGraphic(), C1138R.attr.placeholder_brick, this.graphic);
        this.name.setText(pojo.getName());
        float avg = pojo.getStats().getRating().getAvg();
        if (avg == 0.0f) {
            this.rating.setText(C1138R.string.appcardview_title_no_stars);
        } else {
            this.rating.setText(this.oneDecimalFormatter.format(avg));
        }
        this.compositeSubscription.m40667a(C8942a.m28573a(this.itemView).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.featured.a
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppBrickListWidget.this.m8828a(pojo, appBrickListDisplayable, (Void) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.featured.b
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
