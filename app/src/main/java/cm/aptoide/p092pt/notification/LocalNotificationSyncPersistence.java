package cm.aptoide.p092pt.notification;

import cm.aptoide.p092pt.notification.sync.LocalNotificationSync;
import cm.aptoide.p092pt.sync.Sync;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface LocalNotificationSyncPersistence {
    C11186e<Sync> get(String str);

    void remove(String str);

    void save(LocalNotificationSync localNotificationSync);
}
