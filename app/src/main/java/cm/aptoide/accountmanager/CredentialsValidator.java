package cm.aptoide.accountmanager;

import android.util.Patterns;
import p456rx.C11183b;
import p456rx.Single;
import p456rx.p460m.InterfaceCallableC11207d;

/* loaded from: classes.dex */
public class CredentialsValidator {
    private boolean checkIsEmailValid(String str) {
        return !isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    private boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$validate$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m6781a(AptoideCredentials aptoideCredentials) {
        int validateFields = validateFields(aptoideCredentials);
        return validateFields != -1 ? C11183b.m39951s(new AccountValidationException(validateFields)) : C11183b.m39946e();
    }

    public Single<Boolean> isEmailValid(String str) {
        return Single.m39913m(Boolean.valueOf(checkIsEmailValid(str)));
    }

    public C11183b validate(final AptoideCredentials aptoideCredentials) {
        return C11183b.m39949i(new InterfaceCallableC11207d() { // from class: cm.aptoide.accountmanager.w
            @Override // p456rx.p460m.InterfaceCallableC11207d, java.util.concurrent.Callable
            public final Object call() {
                return CredentialsValidator.this.m6781a(aptoideCredentials);
            }
        });
    }

    protected int validateFields(AptoideCredentials aptoideCredentials) {
        if (isEmpty(aptoideCredentials.getEmail()) && isEmpty(aptoideCredentials.getCode())) {
            return 3;
        }
        if (isEmpty(aptoideCredentials.getCode())) {
            return 2;
        }
        return isEmpty(aptoideCredentials.getEmail()) ? 1 : -1;
    }
}
