package cm.aptoide.p092pt.app.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import java.util.Date;
import p241e.p294g.p295a.p304c.C8942a;
import p456rx.p460m.InterfaceC11205b;

/* loaded from: classes.dex */
public class GridAppListWidget extends Widget<GridAppListDisplayable> {
    public ImageView icon;
    public TextView name;
    private TextView tvStoreName;
    private TextView tvTimeSinceModified;

    public GridAppListWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7276a(App app, GridAppListDisplayable gridAppListDisplayable, Void r6) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(app.getId(), app.getPackageName(), gridAppListDisplayable.getTag()), true);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.name = (TextView) view.findViewById(C1138R.id.name);
        this.icon = (ImageView) view.findViewById(C1138R.id.icon);
        this.tvTimeSinceModified = (TextView) view.findViewById(C1138R.id.timeSinceModified);
        this.tvStoreName = (TextView) view.findViewById(C1138R.id.storeName);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final GridAppListDisplayable gridAppListDisplayable, int i2) {
        final App pojo = gridAppListDisplayable.getPojo();
        this.name.setText(pojo.getName());
        Date updated = pojo.getUpdated();
        if (updated != null) {
            this.tvTimeSinceModified.setText(AptoideUtils.DateTimeU.getInstance(this.itemView.getContext()).getTimeDiffString(this.itemView.getContext(), updated.getTime(), getContext().getResources()));
        }
        this.name.setText(pojo.getName());
        this.name.setTypeface(null, 1);
        this.tvStoreName.setText(pojo.getStore().getName());
        this.tvStoreName.setTypeface(null, 1);
        ActivityC0468d context = getContext();
        this.compositeSubscription.m40667a(C8942a.m28573a(this.itemView).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.app.view.kd
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                GridAppListWidget.this.m7276a(pojo, gridAppListDisplayable, (Void) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.app.view.ld
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
        ImageLoader.with(context).load(pojo.getIcon(), this.icon);
    }
}
