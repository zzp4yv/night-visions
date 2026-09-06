package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.NotificationDao;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.Iterator;
import java.util.List;
import p319g.p320a.p321a.p322a.C9026d;
import p323h.p324a.EnumC9029a;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomNotificationPersistence {
    private NotificationDao notificationDao;

    public RoomNotificationPersistence(NotificationDao notificationDao) {
        this.notificationDao = notificationDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$delete$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7408a(List list) {
        this.notificationDao.deleteByKey(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deleteAllExcluding$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7409b(List list) {
        this.notificationDao.deleteAllExcluding(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deleteAllOfType$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7410c(int i2) {
        this.notificationDao.deleteAllByType(i2);
    }

    static /* synthetic */ Single lambda$getLastShowed$0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RoomNotification roomNotification = (RoomNotification) it.next();
            if (!roomNotification.isDismissed()) {
                return Single.m39913m(roomNotification);
            }
        }
        return Single.m39913m(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$insert$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7411d(RoomNotification roomNotification) {
        this.notificationDao.insert(roomNotification);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$insertAll$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7412e(List list) {
        this.notificationDao.insertAll(list);
    }

    public C11183b delete(final List<String> list) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.u0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomNotificationPersistence.this.m7408a(list);
            }
        }).m39967K(Schedulers.m40658io());
    }

    public C11183b deleteAllExcluding(final List<String> list) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.w0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomNotificationPersistence.this.m7409b(list);
            }
        }).m39967K(Schedulers.m40658io());
    }

    public C11183b deleteAllOfType(final int i2) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.r0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomNotificationPersistence.this.m7410c(i2);
            }
        }).m39967K(Schedulers.m40658io());
    }

    public C11186e<List<RoomNotification>> getAll() {
        return C9026d.m29124b(this.notificationDao.getAll(), EnumC9029a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    public C11186e<List<RoomNotification>> getAllSortedDesc() {
        return C9026d.m29124b(this.notificationDao.getAllSortedDesc(), EnumC9029a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    public Single<List<RoomNotification>> getAllSortedDescByType(Integer[] numArr) {
        return C9026d.m29126d(this.notificationDao.getAllSortedDescByType(numArr)).m39930v(Schedulers.m40658io());
    }

    public Single<List<RoomNotification>> getDismissed(Integer[] numArr, long j2, long j3) {
        return C9026d.m29126d(this.notificationDao.getDismissed(numArr, j2, j3)).m39930v(Schedulers.m40658io());
    }

    public Single<RoomNotification> getLastShowed(Integer[] numArr) {
        return getAllSortedDescByType(numArr).m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.t0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomNotificationPersistence.lambda$getLastShowed$0((List) obj);
            }
        });
    }

    public C11183b insert(final RoomNotification roomNotification) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.v0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomNotificationPersistence.this.m7411d(roomNotification);
            }
        }).m39967K(Schedulers.m40658io());
    }

    public C11183b insertAll(final List<RoomNotification> list) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.s0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomNotificationPersistence.this.m7412e(list);
            }
        }).m39967K(Schedulers.m40658io());
    }
}
