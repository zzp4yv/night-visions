package cm.aptoide.p092pt;

import cm.aptoide.p092pt.account.view.user.NewsletterManager;
import javax.inject.Provider;
import p317f.p318b.C9022b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesNewsletterManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesNewsletterManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesNewsletterManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesNewsletterManagerFactory(applicationModule);
    }

    public static NewsletterManager providesNewsletterManager(ApplicationModule applicationModule) {
        return (NewsletterManager) C9022b.m29112c(applicationModule.providesNewsletterManager());
    }

    @Override // javax.inject.Provider
    public NewsletterManager get() {
        return providesNewsletterManager(this.module);
    }
}
