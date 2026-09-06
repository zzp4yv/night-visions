package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.RoomStoredMinimalAd;
import cm.aptoide.p092pt.database.room.StoredMinimalAdDAO;
import p319g.p320a.p321a.p322a.C9026d;
import p323h.p324a.EnumC9029a;
import p323h.p324a.p326b0.C9032a;
import p323h.p324a.p328y.InterfaceC9064e;
import p323h.p324a.p328y.InterfaceC9065f;
import p456rx.C11186e;

/* loaded from: classes.dex */
public class RoomStoredMinimalAdPersistence implements StoredMinimalAdPersistence {
    private final StoredMinimalAdDAO storedMinimalAdDAO;

    public RoomStoredMinimalAdPersistence(StoredMinimalAdDAO storedMinimalAdDAO) {
        this.storedMinimalAdDAO = storedMinimalAdDAO;
    }

    static /* synthetic */ RoomStoredMinimalAd lambda$get$0(Throwable th) throws Exception {
        return null;
    }

    @Override // cm.aptoide.p092pt.database.StoredMinimalAdPersistence
    public C11186e<RoomStoredMinimalAd> get(String str) {
        return C9026d.m29124b(this.storedMinimalAdDAO.get(str).m29215y(C9032a.m29163b()).m29213w(new InterfaceC9065f() { // from class: cm.aptoide.pt.database.d1
            @Override // p323h.p324a.p328y.InterfaceC9065f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                RoomStoredMinimalAdPersistence.lambda$get$0((Throwable) obj);
                return null;
            }
        }).m29200e(new InterfaceC9064e() { // from class: cm.aptoide.pt.database.p1
            @Override // p323h.p324a.p328y.InterfaceC9064e
            /* renamed from: a */
            public final void mo7420a(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }), EnumC9029a.BUFFER);
    }

    @Override // cm.aptoide.p092pt.database.StoredMinimalAdPersistence
    public void insert(RoomStoredMinimalAd roomStoredMinimalAd) {
        this.storedMinimalAdDAO.insert(roomStoredMinimalAd);
    }

    @Override // cm.aptoide.p092pt.database.StoredMinimalAdPersistence
    public void remove(RoomStoredMinimalAd roomStoredMinimalAd) {
        this.storedMinimalAdDAO.delete(roomStoredMinimalAd);
    }
}
