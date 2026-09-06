package cm.aptoide.p092pt;

import java.util.List;
import javax.inject.Provider;
import p317f.p318b.C9022b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideDefaultFollowedStoresFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideDefaultFollowedStoresFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideDefaultFollowedStoresFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideDefaultFollowedStoresFactory(applicationModule);
    }

    public static List<String> provideDefaultFollowedStores(ApplicationModule applicationModule) {
        return (List) C9022b.m29112c(applicationModule.provideDefaultFollowedStores());
    }

    @Override // javax.inject.Provider
    public List<String> get() {
        return provideDefaultFollowedStores(this.module);
    }
}
