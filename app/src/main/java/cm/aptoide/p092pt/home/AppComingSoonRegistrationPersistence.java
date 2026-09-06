package cm.aptoide.p092pt.home;

import cm.aptoide.p092pt.database.room.RoomAppComingSoonRegistration;
import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface AppComingSoonRegistrationPersistence {
    C11186e<Boolean> isRegisteredForApp(String str);

    C11183b registerForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration);

    C11183b unregisterForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration);
}
