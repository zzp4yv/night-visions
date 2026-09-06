package cm.aptoide.accountmanager;

import p456rx.C11183b;
import p456rx.Single;

/* loaded from: classes.dex */
public interface SignUpAdapter<T> {
    boolean isEnabled();

    C11183b logout();

    Single<Account> signUp(T t, AccountService accountService);
}
