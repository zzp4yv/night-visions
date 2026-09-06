package cm.aptoide.p092pt.view.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.PostReviewRequest;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import okhttp3.OkHttpClient;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p474t.C11381e;
import retrofit2.Converter;

@Deprecated
/* loaded from: classes.dex */
public class DialogUtils {
    private static final String TAG = "DialogUtils";
    private final Locale LOCALE = Locale.getDefault();
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final MarketResourceFormatter marketResourceFormatter;
    private final SharedPreferences sharedPreferences;
    private final ThemeManager themeManager;
    private final TokenInvalidator tokenInvalidator;
    private final UserFeedbackAnalytics userFeedbackAnalytics;

    public DialogUtils(AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, MarketResourceFormatter marketResourceFormatter, ThemeManager themeManager, UserFeedbackAnalytics userFeedbackAnalytics) {
        this.accountManager = aptoideAccountManager;
        this.accountNavigator = accountNavigator;
        this.bodyInterceptor = bodyInterceptor;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.marketResourceFormatter = marketResourceFormatter;
        this.themeManager = themeManager;
        this.userFeedbackAnalytics = userFeedbackAnalytics;
    }

    private boolean isAppInstalled(String str) {
        return this.aptoideInstalledAppsRepository.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8976a(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.RATE_DIALOG);
    }

    static /* synthetic */ void lambda$showRateDialog$1(AlertDialog alertDialog) {
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8977b(Activity activity, InterfaceC11204a interfaceC11204a, BaseV7Response baseV7Response) {
        if (!baseV7Response.isOk()) {
            ShowMessage.asSnack(activity, C1138R.string.error_occured);
            return;
        }
        Logger.getInstance().m8273d(TAG, "review added");
        ShowMessage.asSnack(activity, C1138R.string.review_success);
        ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
        if (interfaceC11204a != null) {
            interfaceC11204a.call();
        }
    }

    static /* synthetic */ void lambda$showRateDialog$11(Activity activity, Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack(activity, C1138R.string.error_occured);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8978c(final Activity activity, TextInputLayout textInputLayout, AppCompatRatingBar appCompatRatingBar, AlertDialog alertDialog, final InterfaceC11204a interfaceC11204a, String str, String str2, View view) {
        AptoideUtils.SystemU.hideKeyboard(activity);
        String obj = textInputLayout.getEditText().getText().toString();
        int round = Math.round(appCompatRatingBar.getRating());
        alertDialog.dismiss();
        SuccessRequestListener successRequestListener = new SuccessRequestListener() { // from class: cm.aptoide.pt.view.dialog.e
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11205b
            public final void call(Object obj2) {
                DialogUtils.this.m8977b(activity, interfaceC11204a, (BaseV7Response) obj2);
            }
        };
        ErrorRequestListener errorRequestListener = new ErrorRequestListener() { // from class: cm.aptoide.pt.view.dialog.h
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                DialogUtils.lambda$showRateDialog$11(activity, th);
            }
        };
        if (str != null) {
            PostReviewRequest.m7459of(str, str2, obj, Integer.valueOf(round), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str2), this.tokenInvalidator, this.sharedPreferences).execute(successRequestListener, errorRequestListener);
        } else {
            PostReviewRequest.m7458of(str2, obj, Integer.valueOf(round), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str2), this.tokenInvalidator, this.sharedPreferences).execute(successRequestListener, errorRequestListener);
        }
    }

    static /* synthetic */ void lambda$showRateDialog$2(AbstractC11197j abstractC11197j, View view) {
        abstractC11197j.onNext(GenericDialogs.EResponse.CANCEL);
        abstractC11197j.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8979d(Activity activity, AbstractC11197j abstractC11197j, BaseV7Response baseV7Response) {
        if (!baseV7Response.isOk()) {
            ShowMessage.asSnack(activity, C1138R.string.error_occured);
            abstractC11197j.onNext(GenericDialogs.EResponse.CANCEL);
            abstractC11197j.onCompleted();
        } else {
            Logger.getInstance().m8273d(TAG, "review added");
            ShowMessage.asSnack(activity, C1138R.string.review_success);
            ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
            abstractC11197j.onNext(GenericDialogs.EResponse.YES);
            abstractC11197j.onCompleted();
        }
    }

    static /* synthetic */ void lambda$showRateDialog$5(Activity activity, AbstractC11197j abstractC11197j, Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack(activity, C1138R.string.error_occured);
        abstractC11197j.onNext(GenericDialogs.EResponse.CANCEL);
        abstractC11197j.onCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8980e(final Activity activity, TextInputLayout textInputLayout, AppCompatRatingBar appCompatRatingBar, View view, AlertDialog alertDialog, final AbstractC11197j abstractC11197j, String str, String str2, View view2) {
        AptoideUtils.SystemU.hideKeyboard(activity);
        String obj = textInputLayout.getEditText().getText().toString();
        int round = Math.round(appCompatRatingBar.getRating());
        if (round == 0) {
            ((TextView) view.findViewById(C1138R.id.tap_to_rate)).setTextColor(activity.getResources().getColor(C1138R.color.red));
            ShowMessage.asSnack(activity, "Please choose a rating");
            return;
        }
        alertDialog.dismiss();
        this.userFeedbackAnalytics.sendSubmitAppRateEvent(!obj.isEmpty());
        SuccessRequestListener successRequestListener = new SuccessRequestListener() { // from class: cm.aptoide.pt.view.dialog.d
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener, p456rx.p460m.InterfaceC11205b
            public final void call(Object obj2) {
                DialogUtils.this.m8979d(activity, abstractC11197j, (BaseV7Response) obj2);
            }
        };
        ErrorRequestListener errorRequestListener = new ErrorRequestListener() { // from class: cm.aptoide.pt.view.dialog.b
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                DialogUtils.lambda$showRateDialog$5(activity, abstractC11197j, th);
            }
        };
        if (str != null) {
            PostReviewRequest.m7459of(str, str2, obj, Integer.valueOf(round), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str2), this.tokenInvalidator, this.sharedPreferences).execute(successRequestListener, errorRequestListener);
        } else {
            PostReviewRequest.m7458of(str2, obj, Integer.valueOf(round), this.bodyInterceptor, this.httpClient, this.converterFactory, isAppInstalled(str2), this.tokenInvalidator, this.sharedPreferences).execute(successRequestListener, errorRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8981f(final Activity activity, String str, final String str2, final String str3, final AbstractC11197j abstractC11197j) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, this.themeManager.getAttributeForTheme(C1138R.attr.dialogsTheme).resourceId);
        if (!this.accountManager.isLoggedIn()) {
            ShowMessage.asSnack(activity, C1138R.string.you_need_to_be_logged_in, C1138R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogUtils.this.m8976a(view);
                }
            }, -1);
            abstractC11197j.onNext(GenericDialogs.EResponse.CANCEL);
            abstractC11197j.onCompleted();
            return;
        }
        final View inflate = LayoutInflater.from(contextThemeWrapper).inflate(C1138R.layout.dialog_rate_app, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C1138R.id.title);
        final AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) inflate.findViewById(C1138R.id.rating_bar);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C1138R.id.input_layout_review);
        Button button = (Button) inflate.findViewById(C1138R.id.cancel_button);
        Button button2 = (Button) inflate.findViewById(C1138R.id.rate_button);
        TextView textView2 = (TextView) inflate.findViewById(C1138R.id.highlighted_reviews_explanation_1);
        TextView textView3 = (TextView) inflate.findViewById(C1138R.id.highlighted_reviews_explanation_2);
        TextView textView4 = (TextView) inflate.findViewById(C1138R.id.highlighted_reviews_explanation_3);
        TextView textView5 = (TextView) inflate.findViewById(C1138R.id.highlighted_reviews_explanation_4);
        textView.setText(String.format(this.LOCALE, activity.getString(C1138R.string.rate_app), str));
        final AlertDialog create = new AlertDialog.Builder(contextThemeWrapper).setView(inflate).create();
        abstractC11197j.add(C11381e.m40674a(new InterfaceC11204a() { // from class: cm.aptoide.pt.view.dialog.n
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                DialogUtils.lambda$showRateDialog$1(create);
            }
        }));
        button.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogUtils.lambda$showRateDialog$2(AbstractC11197j.this, view);
            }
        });
        appCompatRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: cm.aptoide.pt.view.dialog.k
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f2, boolean z) {
                ((TextView) inflate.findViewById(C1138R.id.tap_to_rate)).setTextColor(activity.getResources().getColor(C1138R.color.grey_fog_dark));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogUtils.this.m8980e(activity, textInputLayout, appCompatRatingBar, inflate, create, abstractC11197j, str2, str3, view);
            }
        });
        textView2.setText(activity.getResources().getString(C1138R.string.reviewappview_highlighted_reviews_explanation_1));
        setBulletText(textView3, activity.getResources().getString(C1138R.string.reviewappview_highlighted_reviews_explanation_2));
        setBulletText(textView4, activity.getResources().getString(C1138R.string.reviewappview_highlighted_reviews_explanation_3));
        setBulletText(textView5, this.marketResourceFormatter.formatString(inflate.getContext(), C1138R.string.reviewappview_highlighted_reviews_explanation_4, new String[0]));
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showRateDialog$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8982g(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.RATE_DIALOG);
    }

    public void setBulletText(TextView textView, String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new BulletSpan(16, this.themeManager.getAttributeForTheme(C1138R.attr.colorPrimaryDark).data), 0, str.length(), 0);
        textView.setText(spannableString);
    }

    public C11186e<GenericDialogs.EResponse> showRateDialog(final Activity activity, final String str, final String str2, final String str3) {
        return C11186e.m40048l(new C11186e.a() { // from class: cm.aptoide.pt.view.dialog.m
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                DialogUtils.this.m8981f(activity, str, str3, str2, (AbstractC11197j) obj);
            }
        });
    }

    public void showRateDialog(final Activity activity, String str, final String str2, final String str3, final InterfaceC11204a interfaceC11204a) {
        if (!this.accountManager.isLoggedIn()) {
            ShowMessage.asSnack(activity, C1138R.string.you_need_to_be_logged_in, C1138R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogUtils.this.m8982g(view);
                }
            }, -1);
            return;
        }
        View inflate = LayoutInflater.from(activity).inflate(C1138R.layout.dialog_rate_app, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C1138R.id.title);
        final AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) inflate.findViewById(C1138R.id.rating_bar);
        final TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C1138R.id.input_layout_review);
        Button button = (Button) inflate.findViewById(C1138R.id.cancel_button);
        Button button2 = (Button) inflate.findViewById(C1138R.id.rate_button);
        textView.setText(String.format(this.LOCALE, activity.getString(C1138R.string.rate_app), str));
        final AlertDialog create = new AlertDialog.Builder(activity).setView(inflate).create();
        button.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                create.dismiss();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.view.dialog.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogUtils.this.m8978c(activity, textInputLayout, appCompatRatingBar, create, interfaceC11204a, str3, str2, view);
            }
        });
        create.show();
    }
}
