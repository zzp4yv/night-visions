package cm.aptoide.p092pt.notification.sync;

import cm.aptoide.p092pt.notification.AptoideNotification;
import cm.aptoide.p092pt.notification.NotificationProvider;
import cm.aptoide.p092pt.notification.NotificationService;
import cm.aptoide.p092pt.sync.Sync;
import java.util.List;
import p456rx.C11183b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class CampaignNotificationSync extends Sync {
    private final NotificationService networkService;
    private final NotificationProvider provider;

    public CampaignNotificationSync(String str, NotificationService notificationService, NotificationProvider notificationProvider, boolean z, boolean z2, long j2, long j3) {
        super(str, z, z2, j3, j2);
        this.networkService = notificationService;
        this.provider = notificationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$execute$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8379a(List list) {
        return this.provider.save((List<AptoideNotification>) list);
    }

    @Override // cm.aptoide.p092pt.sync.Sync
    public C11183b execute() {
        return this.networkService.getCampaignNotifications().m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.sync.a
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return CampaignNotificationSync.this.m8379a((List) obj);
            }
        });
    }
}
