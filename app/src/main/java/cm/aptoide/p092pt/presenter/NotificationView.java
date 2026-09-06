package cm.aptoide.p092pt.presenter;

import cm.aptoide.p092pt.notification.NotificationInfo;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface NotificationView extends View {
    C11186e<NotificationInfo> getActionBootCompleted();

    C11186e<NotificationInfo> getNotificationClick();

    C11186e<NotificationInfo> getNotificationDismissed();
}
