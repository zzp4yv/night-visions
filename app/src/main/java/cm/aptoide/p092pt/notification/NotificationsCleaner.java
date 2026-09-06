package cm.aptoide.p092pt.notification;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.RoomNotificationPersistence;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import okhttp3.HttpUrl;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceCallableC11207d;
import p456rx.p474t.C11378b;

/* loaded from: classes.dex */
public class NotificationsCleaner {
    public static final int MAX_NUMBER_NOTIFICATIONS_SAVED = 50;
    private AptoideAccountManager accountManager;
    private final Calendar calendar;
    private CrashReport crashReport;
    private NotificationProvider notificationProvider;
    private final RoomNotificationPersistence roomNotificationPersistence;
    private final C11378b subscriptions = new C11378b();

    public NotificationsCleaner(RoomNotificationPersistence roomNotificationPersistence, Calendar calendar, AptoideAccountManager aptoideAccountManager, NotificationProvider notificationProvider, CrashReport crashReport) {
        this.roomNotificationPersistence = roomNotificationPersistence;
        this.calendar = calendar;
        this.accountManager = aptoideAccountManager;
        this.notificationProvider = notificationProvider;
        this.crashReport = crashReport;
    }

    private boolean isNotificationExpired(RoomNotification roomNotification) {
        Long expire = roomNotification.getExpire();
        return expire != null && this.calendar.getTimeInMillis() > expire.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeExceededLimitNotifications$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8329a() {
        return this.roomNotificationPersistence.getAllSortedDesc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeExceededLimitNotifications$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8330b(int i2, List list) {
        return list.size() > i2 ? lambda$removeExpiredNotifications$10(list.subList(i2, list.size())) : C11183b.m39946e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeExpiredNotifications$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8332d() {
        return this.roomNotificationPersistence.getAllSortedDesc();
    }

    static /* synthetic */ Iterable lambda$removeExpiredNotifications$8(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeExpiredNotifications$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8333e(RoomNotification roomNotification) {
        return isNotificationExpired(roomNotification) ? C11186e.m40025S(roomNotification) : C11186e.m40016B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeNotifications$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8334f(List list) {
        return this.roomNotificationPersistence.delete(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setup$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8335g(Account account) {
        return cleanOtherUsersNotifications(account.getId());
    }

    static /* synthetic */ void lambda$setup$2(Account account) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setup$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8336h(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setup$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8337i(List list) {
        return cleanLimitExceededNotifications(50);
    }

    static /* synthetic */ void lambda$setup$5(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setup$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8338j(Throwable th) {
        this.crashReport.log(th);
    }

    private C11183b removeExceededLimitNotifications(final int i2) {
        return C11186e.m40049p(new InterfaceCallableC11207d() { // from class: cm.aptoide.pt.notification.p0
            @Override // p456rx.p460m.InterfaceCallableC11207d, java.util.concurrent.Callable
            public final Object call() {
                return NotificationsCleaner.this.m8329a();
            }
        }).m40057E().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.f0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return NotificationsCleaner.this.m8330b(i2, (List) obj);
            }
        }).m40083X0();
    }

    private C11183b removeExpiredNotifications() {
        return C11186e.m40049p(new InterfaceCallableC11207d() { // from class: cm.aptoide.pt.notification.m0
            @Override // p456rx.p460m.InterfaceCallableC11207d, java.util.concurrent.Callable
            public final Object call() {
                return NotificationsCleaner.this.m8332d();
            }
        }).m40057E().m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.g0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                List list = (List) obj;
                NotificationsCleaner.lambda$removeExpiredNotifications$8(list);
                return list;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.h0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return NotificationsCleaner.this.m8333e((RoomNotification) obj);
            }
        }).m40084Y0().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.b0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return NotificationsCleaner.this.m8331c((List) obj);
            }
        }).m40083X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: removeNotifications, reason: merged with bridge method [inline-methods] */
    public C11183b m8331c(List<RoomNotification> list) {
        return C11186e.m40020N(list).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.n0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                String key;
                key = ((RoomNotification) obj).getKey();
                return key;
            }
        }).m40084Y0().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.e0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                List list2 = (List) obj;
                valueOf = Boolean.valueOf(!list2.isEmpty());
                return valueOf;
            }
        }).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.k0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return NotificationsCleaner.this.m8334f((List) obj);
            }
        }).m40083X0();
    }

    public C11183b cleanLimitExceededNotifications(int i2) {
        return removeExpiredNotifications().m39973a(removeExceededLimitNotifications(i2));
    }

    public C11183b cleanOtherUsersNotifications(String str) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(str);
        arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
        return this.roomNotificationPersistence.deleteAllExcluding(arrayList);
    }

    public void setup() {
        this.subscriptions.m40667a(this.accountManager.accountStatus().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.q0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((Account) obj).isLoggedIn());
                return valueOf;
            }
        }).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.d0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return NotificationsCleaner.this.m8335g((Account) obj);
            }
        }).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.l0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                NotificationsCleaner.lambda$setup$2((Account) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.c0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                NotificationsCleaner.this.m8336h((Throwable) obj);
            }
        }));
        this.subscriptions.m40667a(this.notificationProvider.getNotifications(1).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.j0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return NotificationsCleaner.this.m8337i((List) obj);
            }
        }).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.o0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                NotificationsCleaner.lambda$setup$5((List) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.i0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                NotificationsCleaner.this.m8338j((Throwable) obj);
            }
        }));
    }
}
