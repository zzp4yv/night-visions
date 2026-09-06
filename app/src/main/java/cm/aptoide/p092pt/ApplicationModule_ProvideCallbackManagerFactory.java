package cm.aptoide.p092pt;

import com.facebook.InterfaceC5925y;
import javax.inject.Provider;
import p317f.p318b.C9022b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideCallbackManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideCallbackManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideCallbackManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideCallbackManagerFactory(applicationModule);
    }

    public static InterfaceC5925y provideCallbackManager(ApplicationModule applicationModule) {
        return (InterfaceC5925y) C9022b.m29112c(applicationModule.provideCallbackManager());
    }

    @Override // javax.inject.Provider
    public InterfaceC5925y get() {
        return provideCallbackManager(this.module);
    }
}
