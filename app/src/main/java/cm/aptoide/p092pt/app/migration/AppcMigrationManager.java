package cm.aptoide.p092pt.app.migration;

import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class AppcMigrationManager {
    private static final long BDS_STORE_ID = 1966380;
    private AppcMigrationRepository appcMigrationRepository;
    private AptoideInstalledAppsRepository repository;

    public AppcMigrationManager(AptoideInstalledAppsRepository aptoideInstalledAppsRepository, AppcMigrationRepository appcMigrationRepository) {
        this.repository = aptoideInstalledAppsRepository;
        this.appcMigrationRepository = appcMigrationRepository;
    }

    public void addMigrationCandidate(String str) {
        this.appcMigrationRepository.addMigrationCandidate(str);
    }

    public C11186e<Boolean> isAppMigrated(String str) {
        return this.appcMigrationRepository.isAppMigrated(str);
    }

    public C11186e<Boolean> isMigrationApp(String str, final String str2, final int i2, final long j2, final boolean z) {
        return this.repository.getInstalled(str).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.app.migration.a
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                String str3 = str2;
                int i3 = i2;
                long j3 = j2;
                boolean z2 = z;
                valueOf = Boolean.valueOf((r6 == null || r1 == null || r6.getSignature() == null || r1.equals(r6.getSignature()) || r6.getVersionCode() > r2 || r3 != AppcMigrationManager.BDS_STORE_ID || !r5) ? false : true);
                return valueOf;
            }
        });
    }

    public void persistCandidate(String str) {
        this.appcMigrationRepository.persistCandidate(str);
    }
}
