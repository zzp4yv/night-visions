package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9022b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideAptoidePackageFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAptoidePackageFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAptoidePackageFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAptoidePackageFactory(applicationModule);
    }

    public static String provideAptoidePackage(ApplicationModule applicationModule) {
        return (String) C9022b.m29112c(applicationModule.provideAptoidePackage());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideAptoidePackage(this.module);
    }
}
