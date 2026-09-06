package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.DownloadDAO;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.downloadmanager.DownloadPersistence;
import java.util.ArrayList;
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
public class RoomDownloadPersistence implements DownloadPersistence {
    private final DownloadDAO downloadDAO;

    public RoomDownloadPersistence(DownloadDAO downloadDAO) {
        this.downloadDAO = downloadDAO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$delete$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7389a(String str) {
        this.downloadDAO.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$delete$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7390b(String str, int i2) {
        this.downloadDAO.remove(str, i2);
    }

    static /* synthetic */ List lambda$getAsList$6(Throwable th) {
        return new ArrayList();
    }

    static /* synthetic */ RoomDownload lambda$getAsObservable$1(Throwable th) {
        return null;
    }

    static /* synthetic */ RoomDownload lambda$getAsSingle$0(Throwable th) {
        return null;
    }

    static /* synthetic */ List lambda$getInQueueSortedDownloads$5(Throwable th) {
        return new ArrayList();
    }

    static /* synthetic */ List lambda$getOutOfSpaceDownloads$8(Throwable th) {
        return new ArrayList();
    }

    static /* synthetic */ List lambda$getRunningDownloads$4(Throwable th) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7391c(RoomDownload roomDownload) {
        this.downloadDAO.insert(roomDownload);
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public C11183b delete(final String str) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.i
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomDownloadPersistence.this.m7389a(str);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public C11186e<List<RoomDownload>> getAll() {
        return C9026d.m29124b(this.downloadDAO.getAll(), EnumC9029a.BUFFER).m40103o(new ArrayList()).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public C11186e<List<RoomDownload>> getAsList(String str) {
        return C9026d.m29124b(this.downloadDAO.getAsList(str), EnumC9029a.BUFFER).m40103o(new ArrayList()).m40105p0(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.l
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomDownloadPersistence.lambda$getAsList$6((Throwable) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public C11186e<RoomDownload> getAsObservable(String str) {
        return C9026d.m29124b(this.downloadDAO.getAsObservable(str), EnumC9029a.BUFFER).m40105p0(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.o
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RoomDownloadPersistence.lambda$getAsObservable$1((Throwable) obj);
                return null;
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public Single<RoomDownload> getAsSingle(String str) {
        return C9026d.m29126d(this.downloadDAO.getAsSingle(str)).m39926r(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.j
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RoomDownloadPersistence.lambda$getAsSingle$0((Throwable) obj);
                return null;
            }
        }).m39930v(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public C11186e<List<RoomDownload>> getInQueueSortedDownloads() {
        return C9026d.m29124b(this.downloadDAO.getInQueueSortedDownloads(), EnumC9029a.BUFFER).m40105p0(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.q
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomDownloadPersistence.lambda$getInQueueSortedDownloads$5((Throwable) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public C11186e<List<RoomDownload>> getOutOfSpaceDownloads() {
        return C9026d.m29124b(this.downloadDAO.getOutOfSpaceDownloads(), EnumC9029a.BUFFER).m40105p0(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.k
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomDownloadPersistence.lambda$getOutOfSpaceDownloads$8((Throwable) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public C11186e<List<RoomDownload>> getRunningDownloads() {
        return C9026d.m29124b(this.downloadDAO.getRunningDownloads(), EnumC9029a.BUFFER).m40105p0(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.p
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomDownloadPersistence.lambda$getRunningDownloads$4((Throwable) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public C11183b save(final RoomDownload roomDownload) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.m
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomDownloadPersistence.this.m7391c(roomDownload);
            }
        }).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.downloadmanager.DownloadPersistence
    public C11183b delete(final String str, final int i2) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.n
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomDownloadPersistence.this.m7390b(str, i2);
            }
        });
    }
}
