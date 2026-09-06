package cm.aptoide.p092pt.account.view.user;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.LoginSignupManager;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.fragment.BaseToolbarFragment;
import javax.inject.Inject;
import p241e.p294g.p295a.p304c.C8942a;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class ProfileStepTwoFragment extends BaseToolbarFragment implements ProfileStepTwoView, NotBottomNavigationView {
    private static final int LAYOUT = 2131493040;

    @Inject
    AccountAnalytics accountAnalytics;
    private AccountNavigator accountNavigator;
    private Button continueBtn;
    private TextView createProfileTitle;
    private boolean externalLogin;

    @Inject
    LoginSignupManager loginSignupManager;

    @Inject
    MarketResourceFormatter marketResourceFormatter;
    private Button privateProfileBtn;

    @Inject
    ThemeManager themeManager;
    private ProgressDialog waitDialog;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$continueButtonClick$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m6981e(Void r1) {
        return Boolean.valueOf(this.externalLogin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$makePrivateProfileButtonClick$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m6982f(Void r1) {
        return Boolean.valueOf(this.externalLogin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showGenericErrorMessage$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6983g() {
        this.waitDialog.dismiss();
    }

    public static ProfileStepTwoFragment newInstance() {
        return new ProfileStepTwoFragment();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        this.continueBtn = (Button) view.findViewById(C1138R.id.logged_in_continue);
        this.privateProfileBtn = (Button) view.findViewById(C1138R.id.logged_in_private_button);
        TextView textView = (TextView) view.findViewById(C1138R.id.create_profile_title);
        this.createProfileTitle = textView;
        textView.setText(this.marketResourceFormatter.formatString(getContext(), C1138R.string.create_profile_pub_pri, new String[0]));
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepTwoView
    public C11186e<Boolean> continueButtonClick() {
        return C8942a.m28573a(this.continueBtn).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.account.view.user.v0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ProfileStepTwoFragment.this.m6981e((Void) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepTwoView
    public void dismissWaitDialog() {
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.waitDialog.dismiss();
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1138R.layout.fragment_profile_step_two;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        if (bundle != null) {
            this.externalLogin = bundle.getBoolean(ProfileStepOneFragment.IS_EXTERNAL_LOGIN, false);
        }
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepTwoView
    public C11186e<Boolean> makePrivateProfileButtonClick() {
        return C8942a.m28573a(this.privateProfileBtn).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.account.view.user.t0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ProfileStepTwoFragment.this.m6982f((Void) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        this.waitDialog = GenericDialogs.createGenericPleaseWaitDialog(getContext(), this.themeManager.getAttributeForTheme(C1138R.attr.dialogsTheme).resourceId, getContext().getString(C1138R.string.please_wait));
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.waitDialog.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(ProfileStepOneFragment.IS_EXTERNAL_LOGIN, this.externalLogin);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        loadExtras(bundle);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment
    protected void setupToolbarDetails(Toolbar toolbar) {
        super.setupToolbarDetails(toolbar);
        toolbar.setTitle(C1138R.string.create_profile_logged_in_activity_title);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseToolbarFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() {
        super.setupViews();
        attachPresenter(new ProfileStepTwoPresenter(this, ((AptoideApplication) getContext().getApplicationContext()).getAccountManager(), CrashReport.getInstance(), this.accountNavigator, this.accountAnalytics, this.loginSignupManager));
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepTwoView
    public C11183b showGenericErrorMessage() {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.account.view.user.u0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                ProfileStepTwoFragment.this.m6983g();
            }
        }).m39973a(ShowMessage.asLongObservableSnack(this, C1138R.string.unknown_error));
    }

    @Override // cm.aptoide.p092pt.account.view.user.ProfileStepTwoView
    public void showWaitDialog() {
        ProgressDialog progressDialog = this.waitDialog;
        if (progressDialog == null || progressDialog.isShowing()) {
            return;
        }
        this.waitDialog.show();
    }
}
