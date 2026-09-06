package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p317f.p318b.C9022b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDefaultSharedPerefencesFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDefaultSharedPerefencesFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDefaultSharedPerefencesFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDefaultSharedPerefencesFactory(applicationModule);
    }

    public static SharedPreferences providesDefaultSharedPerefences(ApplicationModule applicationModule) {
        return (SharedPreferences) C9022b.m29112c(applicationModule.providesDefaultSharedPerefences());
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return providesDefaultSharedPerefences(this.module);
    }
}
