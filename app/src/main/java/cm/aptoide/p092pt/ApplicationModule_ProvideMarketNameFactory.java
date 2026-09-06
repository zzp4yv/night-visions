package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9022b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideMarketNameFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideMarketNameFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideMarketNameFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideMarketNameFactory(applicationModule);
    }

    public static String provideMarketName(ApplicationModule applicationModule) {
        return (String) C9022b.m29112c(applicationModule.provideMarketName());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideMarketName(this.module);
    }
}
