package cm.aptoide.accountmanager;

import p456rx.C11183b;
import p456rx.Single;

/* loaded from: classes.dex */
public interface AccountPersistence {
    Single<Account> getAccount();

    C11183b removeAccount();

    C11183b saveAccount(Account account);
}
