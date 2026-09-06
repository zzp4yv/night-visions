package cm.aptoide.p092pt.account.view;

import android.R;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.widget.C0324e;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.login.SendMagicLinkView;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.magiclink.MagicLinkView;
import cm.aptoide.p092pt.account.view.magiclink.SendMagicLinkPresenter;
import cm.aptoide.p092pt.orientation.ScreenOrientationManager;
import cm.aptoide.p092pt.presenter.CompositePresenter;
import cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView;
import cm.aptoide.p092pt.presenter.LoginSignupCredentialsFlavorPresenter;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.NotBottomNavigationView;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import java.util.Arrays;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8942a;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public class LoginSignUpCredentialsFragment extends GooglePlayServicesFragment implements LoginSignUpCredentialsView, MagicLinkView, NotBottomNavigationView {
    public static final String CLEAN_BACK_STACK = "clean_back_stack";
    public static final String DISMISS_TO_NAVIGATE_TO_MAIN_VIEW = "dismiss_to_navigate_to_main_view";
    public static final String HAS_MAGIC_LINK_ERROR = "has_magic_link_error";
    public static final String MAGIC_LINK_ERROR_MESSAGE = "magic_link_error_message";
    private static final String USERNAME_KEY = "username_key";

    @Inject
    AccountAnalytics accountAnalytics;
    private BottomSheetBehavior<View> bottomSheetBehavior;
    private Drawable checkboxDrawable;
    private Button connectWithEmailButton;
    private RxAlertDialog facebookEmailRequiredDialog;
    private Button googleLoginButton;
    private View loginSignupSelectionArea;

    @Inject
    @Named
    String marketName;

    @Inject
    ScreenOrientationManager orientationManager;

    @Inject
    LoginSignupCredentialsFlavorPresenter presenter;
    private C11370b<Void> privacyPolicySubject;
    private ProgressDialog progressDialog;
    private View rootView;

    @Inject
    SendMagicLinkPresenter sendMagicLinkPresenter;
    private SendMagicLinkView sendMagicLinkView;
    private View socialLoginArea;
    private TextView termsAndConditions;
    private C11370b<Void> termsAndConditionsSubject;
    private CheckBox termsConditionsCheckBox;

    @Inject
    ThemeManager themeManager;

    /* JADX INFO: Access modifiers changed from: private */
    public void changeBottomSheetHeight(int i2) {
        if (this.bottomSheetBehavior == null || getContext() == null) {
            return;
        }
        this.bottomSheetBehavior.m24006l0(5);
        this.bottomSheetBehavior.m24002h0((int) (i2 * getResources().getDisplayMetrics().density));
        this.bottomSheetBehavior.m24006l0(4);
    }

    private AccountAnalytics.StartupClickOrigin getStartupClickOrigin() {
        return AccountAnalytics.StartupClickOrigin.MAIN;
    }

    private void hideSocialLoginArea() {
        this.socialLoginArea.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$googleSignUpEvent$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m6894e(Void r1) {
        return Boolean.valueOf(this.termsConditionsCheckBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$googleSignUpEvent$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6895f(Boolean bool) {
        this.accountAnalytics.clickIn(AccountAnalytics.StartupClick.CONNECT_GOOGLE, getStartupClickOrigin());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showAptoideLoginAreaClick$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m6896g(Void r1) {
        return Boolean.valueOf(this.termsConditionsCheckBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showTermsConditionError$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6897h(CompoundButton compoundButton, boolean z) {
        this.termsConditionsCheckBox.setButtonDrawable(this.checkboxDrawable);
    }

    public static LoginSignUpCredentialsFragment newInstance(boolean z, boolean z2) {
        return newInstance(z, z2, false, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private void setAptoideLoginAreaVisible() {
        this.sendMagicLinkView.setVisibility(0);
        this.termsAndConditions.setVisibility(8);
        this.termsConditionsCheckBox.setVisibility(8);
        this.loginSignupSelectionArea.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void dismiss() {
        getActivity().finish();
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public Context getApplicationContext() {
        return getActivity().getApplicationContext();
    }

    @Override // cm.aptoide.p092pt.account.view.magiclink.MagicLinkView
    public C11186e<String> getEmailTextChangeEvent() {
        return this.sendMagicLinkView.getEmailChangeEvent();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.account.view.magiclink.MagicLinkView
    public C11186e<String> getMagicLinkClick() {
        return this.sendMagicLinkView.getMagicLinkSubmit().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.account.view.b1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ((String) obj).toLowerCase();
            }
        });
    }

    @Override // cm.aptoide.p092pt.account.view.magiclink.MagicLinkView
    public C11186e<Void> getSecureLoginTextClick() {
        return this.sendMagicLinkView.getSecureLoginTextClick();
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public C11186e<Boolean> googleSignUpEvent() {
        return C8942a.m28573a(this.googleLoginButton).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.account.view.v0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsFragment.this.m6894e((Void) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.account.view.x0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                LoginSignUpCredentialsFragment.this.m6895f((Boolean) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void hideGoogleLogin() {
        this.googleLoginButton.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void hideKeyboard() {
        super.hideKeyboard();
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void hideLoading() {
        this.progressDialog.dismiss();
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void lockScreenRotation() {
        this.orientationManager.lock();
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        getActivity().getWindow().setSoftInputMode(16);
        this.privacyPolicySubject = C11370b.m40637g1();
        this.termsAndConditionsSubject = C11370b.m40637g1();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1138R.layout.fragment_login_sign_up_credentials, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.privacyPolicySubject = null;
        this.termsAndConditionsSubject = null;
        super.onDestroy();
    }

    @Override // cm.aptoide.p092pt.account.view.GooglePlayServicesFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getActivity().getWindow().setSoftInputMode(32);
        unregisterClickHandler(this.presenter);
        unlockScreenRotation();
        this.termsAndConditions = null;
        this.sendMagicLinkView = null;
        this.termsConditionsCheckBox = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // cm.aptoide.p092pt.account.view.GooglePlayServicesFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.rootView = getActivity().findViewById(R.id.content);
        this.googleLoginButton = (Button) view.findViewById(C1138R.id.google_login_button);
        this.loginSignupSelectionArea = view.findViewById(C1138R.id.login_signup_selection_layout);
        this.sendMagicLinkView = (SendMagicLinkView) view.findViewById(C1138R.id.send_magic_link_view);
        this.socialLoginArea = view.findViewById(C1138R.id.social_login_area);
        this.connectWithEmailButton = (Button) view.findViewById(C1138R.id.show_login_with_aptoide_area);
        this.facebookEmailRequiredDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setMessage(C1138R.string.facebook_email_permission_regected_message).setPositiveButton(C1138R.string.facebook_grant_permission_button).setNegativeButton(R.string.cancel).build();
        this.termsConditionsCheckBox = (CheckBox) view.findViewById(C1138R.id.tc_checkbox);
        this.termsAndConditions = (TextView) view.findViewById(C1138R.id.terms_and_conditions);
        this.progressDialog = GenericDialogs.createGenericPleaseWaitDialog(getContext(), this.themeManager.getAttributeForTheme(C1138R.attr.dialogsTheme).resourceId);
        try {
            this.bottomSheetBehavior = BottomSheetBehavior.m23980T(view.getRootView().findViewById(C1138R.id.login_signup_layout));
        } catch (IllegalArgumentException unused) {
        }
        attachPresenter(new CompositePresenter(Arrays.asList(this.presenter, this.sendMagicLinkPresenter)));
        registerClickHandler(this.presenter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public C11186e<Void> privacyPolicyClickEvent() {
        return this.privacyPolicySubject;
    }

    @Override // cm.aptoide.p092pt.account.view.magiclink.MagicLinkView
    public void removeLoadingScreen() {
        hideKeyboard();
        hideLoading();
    }

    @Override // cm.aptoide.p092pt.account.view.magiclink.MagicLinkView
    public void removeTextFieldError() {
        this.sendMagicLinkView.resetTextFieldError();
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void setCobrandText() {
    }

    @Override // cm.aptoide.p092pt.account.view.magiclink.MagicLinkView
    public void setEmailInvalidError() {
        this.sendMagicLinkView.setState(new SendMagicLinkView.State.Error(getString(C1138R.string.login_error_invalid_email), true));
    }

    @Override // cm.aptoide.p092pt.account.view.magiclink.MagicLinkView
    public void setInitialState() {
        this.sendMagicLinkView.setState(SendMagicLinkView.State.Initial.INSTANCE);
    }

    @Override // cm.aptoide.p092pt.account.view.magiclink.MagicLinkView
    public void setLoadingScreen() {
        showLoading();
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void showAptoideLoginArea() {
        setAptoideLoginAreaVisible();
        hideSocialLoginArea();
        this.termsConditionsCheckBox.setVisibility(8);
        this.termsAndConditions.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public C11186e<Boolean> showAptoideLoginAreaClick() {
        return C8942a.m28573a(this.connectWithEmailButton).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.account.view.y0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsFragment.this.m6896g((Void) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void showError(String str) {
        Snackbar.m24764a0(this.rootView, str, 0).mo24744P();
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void showGoogleLogin() {
        this.googleLoginButton.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void showLoading() {
        this.progressDialog.show();
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void showMagicLinkError(String str) {
        this.sendMagicLinkView.setState(new SendMagicLinkView.State.Error(str, false));
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void showTCandPP() {
        this.checkboxDrawable = C0324e.m2306a(this.termsConditionsCheckBox);
        this.termsConditionsCheckBox.setVisibility(0);
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: cm.aptoide.pt.account.view.LoginSignUpCredentialsFragment.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (LoginSignUpCredentialsFragment.this.termsAndConditionsSubject != null) {
                    LoginSignUpCredentialsFragment.this.termsAndConditionsSubject.onNext(null);
                }
            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() { // from class: cm.aptoide.pt.account.view.LoginSignUpCredentialsFragment.3
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (LoginSignUpCredentialsFragment.this.privacyPolicySubject != null) {
                    LoginSignUpCredentialsFragment.this.privacyPolicySubject.onNext(null);
                }
            }
        };
        String string = getString(C1138R.string.terms_and_conditions_privacy_sign_up_message);
        String string2 = getString(C1138R.string.settings_terms_conditions);
        String string3 = getString(C1138R.string.settings_privacy_policy);
        String format = String.format(string, string2, string3);
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(clickableSpan, format.indexOf(string2), format.indexOf(string2) + string2.length(), 33);
        spannableString.setSpan(clickableSpan2, format.indexOf(string3), format.indexOf(string3) + string3.length(), 33);
        this.termsAndConditions.setText(spannableString);
        this.termsAndConditions.setMovementMethod(LinkMovementMethod.getInstance());
        this.termsAndConditions.setVisibility(0);
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void showTermsConditionError() {
        Snackbar m24764a0 = Snackbar.m24764a0(this.rootView, getString(C1138R.string.signup_message_no_tandc_error), -1);
        if (getResources().getConfiguration().orientation == 1) {
            m24764a0.m24746p(new Snackbar.C8025b() { // from class: cm.aptoide.pt.account.view.LoginSignUpCredentialsFragment.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.android.material.snackbar.Snackbar.C8025b, com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC8019r
                public void onDismissed(Snackbar snackbar, int i2) {
                    LoginSignUpCredentialsFragment.this.changeBottomSheetHeight(298);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.android.material.snackbar.Snackbar.C8025b, com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC8019r
                public void onShown(Snackbar snackbar) {
                    LoginSignUpCredentialsFragment.this.changeBottomSheetHeight(330);
                }
            });
        }
        m24764a0.mo24744P();
        Drawable.ConstantState constantState = this.checkboxDrawable.getConstantState();
        if (constantState != null) {
            Drawable mutate = constantState.newDrawable().mutate();
            mutate.setColorFilter(getResources().getColor(C1138R.color.red), PorterDuff.Mode.SRC_ATOP);
            this.termsConditionsCheckBox.setButtonDrawable(mutate);
        }
        this.termsConditionsCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cm.aptoide.pt.account.view.w0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LoginSignUpCredentialsFragment.this.m6897h(compoundButton, z);
            }
        });
    }

    @Override // cm.aptoide.p092pt.account.view.magiclink.MagicLinkView
    public void showUnknownError() {
        showMagicLinkError(getString(C1138R.string.all_message_general_error));
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public C11186e<Void> termsAndConditionsClickEvent() {
        return this.termsAndConditionsSubject;
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public boolean tryCloseLoginBottomSheet(boolean z) {
        if (this.sendMagicLinkView.getVisibility() != 0) {
            return false;
        }
        this.sendMagicLinkView.setVisibility(8);
        this.loginSignupSelectionArea.setVisibility(0);
        this.socialLoginArea.setVisibility(0);
        if (!z) {
            return true;
        }
        this.termsConditionsCheckBox.setVisibility(0);
        this.termsAndConditions.setVisibility(0);
        return true;
    }

    @Override // cm.aptoide.p092pt.presenter.LoginSignUpCredentialsView
    public void unlockScreenRotation() {
        this.orientationManager.unlock();
    }

    public static LoginSignUpCredentialsFragment newInstance(boolean z, boolean z2, boolean z3, String str) {
        LoginSignUpCredentialsFragment loginSignUpCredentialsFragment = new LoginSignUpCredentialsFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(DISMISS_TO_NAVIGATE_TO_MAIN_VIEW, z);
        bundle.putBoolean(CLEAN_BACK_STACK, z2);
        bundle.putBoolean("has_magic_link_error", z3);
        bundle.putString("magic_link_error_message", str);
        loginSignUpCredentialsFragment.setArguments(bundle);
        return loginSignUpCredentialsFragment;
    }
}
