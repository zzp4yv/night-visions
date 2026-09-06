package cm.aptoide.accountmanager;

import java.util.Map;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class SignUpAdapterRegistry {
    private final AccountService accountService;
    private final Map<String, SignUpAdapter> adapters;

    public SignUpAdapterRegistry(Map<String, SignUpAdapter> map, AccountService accountService) {
        this.adapters = map;
        this.accountService = accountService;
    }

    static /* synthetic */ C11183b lambda$logoutAll$2(C11183b c11183b) {
        return c11183b;
    }

    public boolean isEnabled(String str) {
        return this.adapters.get(str).isEnabled();
    }

    public C11183b logoutAll() {
        return C11186e.m40020N(this.adapters.values()).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.accountmanager.z
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((SignUpAdapter) obj).isEnabled());
                return valueOf;
            }
        }).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.accountmanager.y
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b logout;
                logout = ((SignUpAdapter) obj).logout();
                return logout;
            }
        }).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.accountmanager.x
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b c11183b = (C11183b) obj;
                SignUpAdapterRegistry.lambda$logoutAll$2(c11183b);
                return c11183b;
            }
        }).m40083X0();
    }

    public void register(String str, SignUpAdapter signUpAdapter) {
        this.adapters.put(str, signUpAdapter);
    }

    public <T> Single<Account> signUp(String str, T t) {
        return this.adapters.get(str).signUp(t, this.accountService);
    }
}
