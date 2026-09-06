package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.InterfaceC9020a;

/* loaded from: classes.dex */
public final class AptoideFirebaseNotificationService_MembersInjector implements InterfaceC9020a<AptoideFirebaseNotificationService> {
    private final Provider<FirebaseNotificationAnalytics> firebaseNotificationAnalyticsProvider;

    public AptoideFirebaseNotificationService_MembersInjector(Provider<FirebaseNotificationAnalytics> provider) {
        this.firebaseNotificationAnalyticsProvider = provider;
    }

    public static InterfaceC9020a<AptoideFirebaseNotificationService> create(Provider<FirebaseNotificationAnalytics> provider) {
        return new AptoideFirebaseNotificationService_MembersInjector(provider);
    }

    public static void injectFirebaseNotificationAnalytics(AptoideFirebaseNotificationService aptoideFirebaseNotificationService, FirebaseNotificationAnalytics firebaseNotificationAnalytics) {
        aptoideFirebaseNotificationService.firebaseNotificationAnalytics = firebaseNotificationAnalytics;
    }

    public void injectMembers(AptoideFirebaseNotificationService aptoideFirebaseNotificationService) {
        injectFirebaseNotificationAnalytics(aptoideFirebaseNotificationService, this.firebaseNotificationAnalyticsProvider.get());
    }
}
