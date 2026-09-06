package cm.aptoide.accountmanager;

import java.net.SocketTimeoutException;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.C0955e;
import p456rx.C11183b;
import p456rx.Single;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class AptoideSignUpAdapter implements SignUpAdapter<AptoideCredentials> {
    private final CredentialsValidator credentialsValidator;

    public AptoideSignUpAdapter(CredentialsValidator credentialsValidator) {
        this.credentialsValidator = credentialsValidator;
    }

    static /* synthetic */ Account lambda$signUp$0(C0955e c0955e) {
        return (Account) c0955e.f6405a;
    }

    static /* synthetic */ Single lambda$signUp$1(AccountService accountService, AptoideCredentials aptoideCredentials, Throwable th) {
        return th instanceof SocketTimeoutException ? accountService.getAccount(aptoideCredentials.getEmail(), aptoideCredentials.getCode(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET).m39923n(new InterfaceC11208e() { // from class: cm.aptoide.accountmanager.v
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AptoideSignUpAdapter.lambda$signUp$0((C0955e) obj);
            }
        }) : Single.m39911h(th);
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public boolean isEnabled() {
        return true;
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public C11183b logout() {
        return C11183b.m39946e();
    }

    @Override // cm.aptoide.accountmanager.SignUpAdapter
    public Single<Account> signUp(final AptoideCredentials aptoideCredentials, final AccountService accountService) {
        return this.credentialsValidator.validate(aptoideCredentials).m39975c(accountService.createAccount(aptoideCredentials.getEmail(), aptoideCredentials.getCode())).m39925q(new InterfaceC11208e() { // from class: cm.aptoide.accountmanager.u
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AptoideSignUpAdapter.lambda$signUp$1(AccountService.this, aptoideCredentials, (Throwable) obj);
            }
        });
    }
}
