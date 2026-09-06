package cm.aptoide.p092pt.store.view;

import android.view.View;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.account.view.LoginDisplayable;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import p241e.p294g.p295a.p304c.C8942a;
import p456rx.p460m.InterfaceC11205b;

/* loaded from: classes.dex */
public class LoginWidget extends Widget<LoginDisplayable> {
    private View loginButton;

    public LoginWidget(View view) {
        super(view);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.loginButton = view.findViewById(C1138R.id.login_button);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(LoginDisplayable loginDisplayable, int i2) {
        final AccountNavigator accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        this.compositeSubscription.m40667a(C8942a.m28573a(this.loginButton).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.a1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AccountNavigator.this.navigateToAccountView(AccountAnalytics.AccountOrigins.STORE);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.z0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
