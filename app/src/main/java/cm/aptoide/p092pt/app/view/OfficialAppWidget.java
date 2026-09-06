package cm.aptoide.p092pt.app.view;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.Translator;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import p241e.p294g.p295a.p304c.C8942a;
import p456rx.p460m.InterfaceC11205b;

/* loaded from: classes.dex */
public class OfficialAppWidget extends Widget<OfficialAppDisplayable> {
    private static final String TAG = "cm.aptoide.pt.app.view.OfficialAppWidget";
    private TextView appDownloads;
    private ImageView appImage;
    private TextView appName;
    private RatingBar appRating;
    private TextView appSize;
    private TextView appVersion;
    private Button installButton;
    private TextView installMessage;
    private View verticalSeparator;

    public OfficialAppWidget(View view) {
        super(view);
    }

    private void hideOfficialAppMessage() {
        this.installMessage.setVisibility(8);
        this.verticalSeparator.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7310a(boolean z, GetAppMeta.App app, Void r3) {
        if (z) {
            AptoideUtils.SystemU.openApp(app.getPackageName(), getContext().getPackageManager(), getContext());
        } else {
            getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(app.getPackageName(), AppViewFragment.OpenType.OPEN_AND_INSTALL), true);
        }
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.appImage = (ImageView) view.findViewById(C1138R.id.app_image);
        this.installButton = (Button) view.findViewById(C1138R.id.app_install_button);
        this.installMessage = (TextView) view.findViewById(C1138R.id.install_message);
        this.appName = (TextView) view.findViewById(C1138R.id.app_name);
        this.verticalSeparator = view.findViewById(C1138R.id.vertical_separator);
        this.appRating = (RatingBar) view.findViewById(C1138R.id.app_rating);
        this.appDownloads = (TextView) view.findViewById(C1138R.id.app_downloads);
        this.appVersion = (TextView) view.findViewById(C1138R.id.app_version);
        this.appSize = (TextView) view.findViewById(C1138R.id.app_size);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(OfficialAppDisplayable officialAppDisplayable, int i2) {
        ActivityC0468d context = getContext();
        Pair<String, GetAppMeta> messageGetApp = officialAppDisplayable.getMessageGetApp();
        final boolean isAppInstalled = officialAppDisplayable.isAppInstalled();
        int primaryColor = officialAppDisplayable.getPrimaryColor();
        final GetAppMeta.App data = ((GetAppMeta) messageGetApp.second).getData();
        String name = data.getName();
        if (TextUtils.isEmpty((CharSequence) messageGetApp.first)) {
            hideOfficialAppMessage();
        } else {
            String[] translateToMultiple = Translator.translateToMultiple((String) messageGetApp.first, getContext().getApplicationContext());
            if (translateToMultiple == null || translateToMultiple.length != 4) {
                this.installMessage.setText((CharSequence) messageGetApp.first);
            } else {
                SpannableString spannableString = new SpannableString(String.format(isAppInstalled ? translateToMultiple[3] : translateToMultiple[2], name));
                spannableString.setSpan(new ForegroundColorSpan(primaryColor), 0, spannableString.length(), 17);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) translateToMultiple[0]);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) translateToMultiple[1]);
                this.installMessage.setText(spannableStringBuilder);
            }
        }
        this.appRating.setRating(data.getStats().getRating().getAvg());
        this.appName.setText(name);
        this.appDownloads.setText(String.format(context.getString(C1138R.string.downloads_count), AptoideUtils.StringU.withSuffix(data.getStats().getDownloads())));
        this.appVersion.setText(String.format(context.getString(C1138R.string.version_number), data.getFile().getVername()));
        this.appSize.setText(String.format(context.getString(C1138R.string.app_size), AptoideUtils.StringU.formatBytes(data.getFile().getFilesize(), false)));
        ImageLoader.with(context).load(data.getIcon(), this.appImage);
        this.installButton.setBackgroundResource(officialAppDisplayable.getRaisedButtonDrawable());
        this.installButton.setText(context.getString(isAppInstalled ? C1138R.string.open : C1138R.string.install));
        this.compositeSubscription.m40667a(C8942a.m28573a(this.installButton).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.app.view.zf
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                OfficialAppWidget.this.m7310a(isAppInstalled, data, (Void) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.app.view.yf
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
