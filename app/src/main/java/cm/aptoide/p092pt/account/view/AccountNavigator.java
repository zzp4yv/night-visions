package cm.aptoide.p092pt.account.view;

import android.net.Uri;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.FacebookLoginResult;
import cm.aptoide.p092pt.account.view.store.ManageStoreFragment;
import cm.aptoide.p092pt.account.view.store.ManageStoreViewModel;
import cm.aptoide.p092pt.account.view.user.ManageUserFragment;
import cm.aptoide.p092pt.account.view.user.ProfileStepTwoFragment;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.p092pt.link.CustomTabsHelper;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.settings.MyAccountFragment;
import com.facebook.FacebookException;
import com.facebook.InterfaceC5925y;
import com.facebook.InterfaceC5926z;
import com.facebook.login.C5771x;
import com.facebook.login.C5772y;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Collection;
import java.util.concurrent.Callable;
import p241e.p294g.p306b.C8955c;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class AccountNavigator {
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final ActivityNavigator activityNavigator;
    private final BottomNavigationNavigator bottomNavigationNavigator;
    private final InterfaceC5925y callbackManager;
    private final GoogleApiClient client;
    private final C5771x facebookLoginManager;
    private final C8955c<FacebookLoginResult> facebookLoginSubject;
    private final FragmentNavigator fragmentNavigator;
    private final String recoverPasswordUrl;
    private final ThemeManager themeManager;

    public AccountNavigator(BottomNavigationNavigator bottomNavigationNavigator, FragmentNavigator fragmentNavigator, AptoideAccountManager aptoideAccountManager, ActivityNavigator activityNavigator, C5771x c5771x, InterfaceC5925y interfaceC5925y, GoogleApiClient googleApiClient, C8955c<FacebookLoginResult> c8955c, String str, AccountAnalytics accountAnalytics, ThemeManager themeManager) {
        this.bottomNavigationNavigator = bottomNavigationNavigator;
        this.fragmentNavigator = fragmentNavigator;
        this.accountManager = aptoideAccountManager;
        this.activityNavigator = activityNavigator;
        this.facebookLoginManager = c5771x;
        this.callbackManager = interfaceC5925y;
        this.client = googleApiClient;
        this.facebookLoginSubject = c8955c;
        this.recoverPasswordUrl = str;
        this.accountAnalytics = accountAnalytics;
        this.themeManager = themeManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$facebookSignUpResults$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m6866a(Result result) {
        return Boolean.valueOf(this.callbackManager.onActivityResult(result.getRequestCode(), result.getResultCode(), result.getData()));
    }

    static /* synthetic */ FacebookLoginResult lambda$facebookSignUpResults$4(Result result, FacebookLoginResult facebookLoginResult) {
        return facebookLoginResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$googleSignUpResults$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6867b(GoogleSignInResult googleSignInResult) {
        this.client.mo13872h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$navigateToGoogleSignUpForResult$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ConnectionResult m6868c(int i2) throws Exception {
        ConnectionResult mo13868d = this.client.mo13868d();
        if (mo13868d.m13795e0()) {
            this.activityNavigator.navigateForResult(Auth.f16906j.mo13660a(this.client), i2);
        }
        return mo13868d;
    }

    public void clearBackStackUntilLogin() {
        for (int i2 = 0; i2 < this.fragmentNavigator.getBackStackEntryCount(); i2++) {
            String tagByBackStackEntry = this.fragmentNavigator.getTagByBackStackEntry(i2);
            if (this.fragmentNavigator.getFragment(tagByBackStackEntry) instanceof LoginSignUpFragment) {
                this.fragmentNavigator.popBackStackUntil(tagByBackStackEntry);
                return;
            }
        }
    }

    public C11186e<FacebookLoginResult> facebookSignUpResults() {
        return C11186e.m40041e(this.activityNavigator.results().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.account.view.e
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AccountNavigator.this.m6866a((Result) obj);
            }
        }), this.facebookLoginSubject, new InterfaceC11209f() { // from class: cm.aptoide.pt.account.view.a
            @Override // p456rx.p460m.InterfaceC11209f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                FacebookLoginResult facebookLoginResult = (FacebookLoginResult) obj2;
                AccountNavigator.lambda$facebookSignUpResults$4((Result) obj, facebookLoginResult);
                return facebookLoginResult;
            }
        });
    }

    public C11186e<GoogleSignInResult> googleSignUpResults(int i2) {
        return this.activityNavigator.results(i2).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.account.view.c
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                GoogleSignInResult mo13661b;
                mo13661b = Auth.f16906j.mo13661b(((Result) obj).getData());
                return mo13661b;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.account.view.b
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AccountNavigator.this.m6867b((GoogleSignInResult) obj);
            }
        });
    }

    public void navigateToAccountView(AccountAnalytics.AccountOrigins accountOrigins) {
        if (this.accountManager.isLoggedIn()) {
            this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
        } else {
            this.accountAnalytics.enterAccountScreen(accountOrigins);
            this.fragmentNavigator.navigateTo(LoginSignUpFragment.newInstance(false, false, false, false), true);
        }
    }

    public void navigateToCreateProfileView() {
        this.fragmentNavigator.navigateTo(ManageUserFragment.newInstanceToCreate(), true);
    }

    public void navigateToCreateStoreView() {
        this.fragmentNavigator.navigateTo(ManageStoreFragment.newInstance(new ManageStoreViewModel(), true), true);
    }

    public void navigateToFacebookSignUpForResult(Collection<String> collection) {
        this.facebookLoginManager.m12122q(this.callbackManager, new InterfaceC5926z<C5772y>() { // from class: cm.aptoide.pt.account.view.AccountNavigator.1
            @Override // com.facebook.InterfaceC5926z
            public void onCancel() {
                AccountNavigator.this.facebookLoginSubject.call(new FacebookLoginResult(null, 1, null));
            }

            @Override // com.facebook.InterfaceC5926z
            public void onError(FacebookException facebookException) {
                AccountNavigator.this.facebookLoginSubject.call(new FacebookLoginResult(null, 99, facebookException));
            }

            @Override // com.facebook.InterfaceC5926z
            public void onSuccess(C5772y c5772y) {
                AccountNavigator.this.facebookLoginSubject.call(new FacebookLoginResult(c5772y, 0, null));
            }
        });
        this.facebookLoginManager.m12119l(this.activityNavigator.getActivity(), collection);
    }

    public Single<ConnectionResult> navigateToGoogleSignUpForResult(final int i2) {
        return Single.m39912l(new Callable() { // from class: cm.aptoide.pt.account.view.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AccountNavigator.this.m6868c(i2);
            }
        }).m39930v(Schedulers.m40658io());
    }

    public void navigateToHomeView() {
        this.bottomNavigationNavigator.navigateToHome();
    }

    public void navigateToLoginError() {
        this.fragmentNavigator.navigateTo(LoginSignUpFragment.newInstance(false, false, false, false, true, this.activityNavigator.getActivity().getString(C1138R.string.login_error_magic_link_expired)), true);
    }

    public void navigateToPrivacyPolicy() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(C1138R.string.all_url_privacy_policy), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(C1138R.attr.colorPrimary).resourceId);
    }

    public void navigateToProfileStepTwoView() {
        this.fragmentNavigator.navigateTo(ProfileStepTwoFragment.newInstance(), true);
    }

    public void navigateToRecoverPasswordView() {
        this.activityNavigator.navigateTo(Uri.parse(this.recoverPasswordUrl));
    }

    public void navigateToTermsAndConditions() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(C1138R.string.all_url_terms_conditions), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(C1138R.attr.colorPrimary).resourceId);
    }

    public void popView() {
        this.fragmentNavigator.popBackStack();
    }

    public void popViewWithResult(int i2, boolean z) {
        this.fragmentNavigator.popWithResult(new Result(i2, z ? -1 : 0, null));
    }
}
