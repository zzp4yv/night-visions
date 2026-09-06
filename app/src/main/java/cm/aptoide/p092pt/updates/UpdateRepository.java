package cm.aptoide.p092pt.updates;

import android.content.SharedPreferences;
import android.util.Pair;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.ListAppsUpdates;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.listapps.ListAppsUpdatesRequest;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class UpdateRepository {
    private static final long SYNC_MIN_INTERVAL_MS = 82800000;
    private static final String TAG = "cm.aptoide.pt.updates.UpdateRepository";
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final IdsRepository idsRepository;
    private long lastSyncTimestamp = 0;
    private final SharedPreferences sharedPreferences;
    private final RoomStoreRepository storeRepository;
    private final TokenInvalidator tokenInvalidator;
    private final UpdateMapper updateMapper;
    private final UpdatePersistence updatePersistence;

    public UpdateRepository(UpdatePersistence updatePersistence, RoomStoreRepository roomStoreRepository, IdsRepository idsRepository, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, UpdateMapper updateMapper, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        this.updatePersistence = updatePersistence;
        this.storeRepository = roomStoreRepository;
        this.idsRepository = idsRepository;
        this.bodyInterceptor = bodyInterceptor;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.updateMapper = updateMapper;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
    }

    private Single<List<ListAppsUpdatesRequest.ApksData>> getInstalledApks() {
        return this.aptoideInstalledAppsRepository.getAllSyncedInstalled().m39915A().m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.l
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                List list = (List) obj;
                UpdateRepository.lambda$getInstalledApks$7(list);
                return list;
            }
        }).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.d
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.lambda$getInstalledApks$8((RoomInstalled) obj);
            }
        }).m40084Y0().m40085Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getNetworkUpdates, reason: merged with bridge method [inline-methods] */
    public C11186e<List<App>> m8873f(final List<Long> list, final boolean z, final boolean z2) {
        Logger.getInstance().m8273d(TAG, String.format("getNetworkUpdates() -> using %d stores", Integer.valueOf(list.size())));
        return Single.m39907C(getInstalledApks(), this.idsRepository.getUniqueIdentifier(), new InterfaceC11209f() { // from class: cm.aptoide.pt.updates.q
            @Override // p456rx.p460m.InterfaceC11209f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return new Pair((List) obj, (String) obj2);
            }
        }).m39922k(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.p
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.this.m8868a(list, z, z2, (Pair) obj);
            }
        }).m40065I0(Schedulers.m40658io()).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.i
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.lambda$getNetworkUpdates$6((ListAppsUpdates) obj);
            }
        });
    }

    static /* synthetic */ Iterable lambda$getInstalledApks$7(List list) {
        return list;
    }

    static /* synthetic */ ListAppsUpdatesRequest.ApksData lambda$getInstalledApks$8(RoomInstalled roomInstalled) {
        return new ListAppsUpdatesRequest.ApksData(roomInstalled.getPackageName(), roomInstalled.getVersionCode(), roomInstalled.getSignature(), roomInstalled.isEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getNetworkUpdates$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8868a(List list, boolean z, boolean z2, Pair pair) {
        return ListAppsUpdatesRequest.m7478of((List) pair.first, list, (String) pair.second, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(z, z2);
    }

    static /* synthetic */ List lambda$getNetworkUpdates$6(ListAppsUpdates listAppsUpdates) {
        return (listAppsUpdates == null || !listAppsUpdates.isOk()) ? Collections.emptyList() : listAppsUpdates.getList();
    }

    static /* synthetic */ RoomUpdate lambda$saveNonExcludedUpdates$11(RoomUpdate roomUpdate, Boolean bool) {
        return roomUpdate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveNonExcludedUpdates$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8870c(final RoomUpdate roomUpdate) {
        return this.updatePersistence.isExcluded(roomUpdate.getPackageName()).m39915A().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.m
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                Boolean bool = (Boolean) obj;
                valueOf = Boolean.valueOf(!bool.booleanValue());
                return valueOf;
            }
        }).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.h
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RoomUpdate roomUpdate2 = RoomUpdate.this;
                UpdateRepository.lambda$saveNonExcludedUpdates$11(roomUpdate2, (Boolean) obj);
                return roomUpdate2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$saveNonExcludedUpdates$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8871d(List list) {
        return (list == null || list.isEmpty()) ? C11183b.m39946e() : this.updatePersistence.saveAll(list);
    }

    static /* synthetic */ Single lambda$setExcluded$14(RoomUpdate roomUpdate) {
        roomUpdate.setExcluded(true);
        return Single.m39913m(roomUpdate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setExcluded$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8872e(RoomUpdate roomUpdate) {
        return this.updatePersistence.save(roomUpdate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sync$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8874g(List list) {
        return removeAllNonExcluded().m39973a(saveNewUpdates(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sync$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8875h(long j2) {
        this.lastSyncTimestamp = j2;
    }

    private C11183b saveNewUpdates(List<App> list) {
        return saveNonExcludedUpdates(this.updateMapper.mapAppUpdateList(list));
    }

    private C11183b saveNonExcludedUpdates(List<RoomUpdate> list) {
        return C11186e.m40020N(list).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.g
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.this.m8870c((RoomUpdate) obj);
            }
        }).m40084Y0().m40085Z0().m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.f
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.this.m8871d((List) obj);
            }
        });
    }

    public Single<Boolean> contains(String str, boolean z) {
        return this.updatePersistence.contains(str, z);
    }

    public Single<RoomUpdate> get(String str) {
        return this.updatePersistence.get(str);
    }

    public C11186e<List<RoomUpdate>> getAll(boolean z) {
        return this.updatePersistence.getAllSorted(z);
    }

    public C11183b remove(List<RoomUpdate> list) {
        return this.updatePersistence.removeAll(list);
    }

    /* renamed from: removeAll, reason: merged with bridge method [inline-methods] */
    public C11183b m8869b(List<RoomUpdate> list) {
        return this.updatePersistence.removeAll(list);
    }

    public C11183b removeAllNonExcluded() {
        return this.updatePersistence.getAll(false).m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.c
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.this.m8869b((List) obj);
            }
        });
    }

    public C11183b setExcluded(String str) {
        return this.updatePersistence.get(str).m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.j
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.lambda$setExcluded$14((RoomUpdate) obj);
            }
        }).m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.k
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.this.m8872e((RoomUpdate) obj);
            }
        });
    }

    public C11183b sync(final boolean z, final boolean z2, boolean z3) {
        final long currentTimeMillis = System.currentTimeMillis();
        return (z3 || currentTimeMillis - this.lastSyncTimestamp >= SYNC_MIN_INTERVAL_MS) ? this.storeRepository.getAll().m40057E().m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.b
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m40084Y0;
                m40084Y0 = C11186e.m40020N((List) obj).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.o
                    @Override // p456rx.p460m.InterfaceC11208e
                    public final Object call(Object obj2) {
                        Long valueOf;
                        valueOf = Long.valueOf(((RoomStore) obj2).getStoreId());
                        return valueOf;
                    }
                }).m40084Y0();
                return m40084Y0;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.a
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.this.m8873f(z, z2, (List) obj);
            }
        }).m40085Z0().m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.updates.n
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdateRepository.this.m8874g((List) obj);
            }
        }).m39980m(new InterfaceC11204a() { // from class: cm.aptoide.pt.updates.e
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                UpdateRepository.this.m8875h(currentTimeMillis);
            }
        }) : C11183b.m39946e();
    }

    public C11183b remove(RoomUpdate roomUpdate) {
        return this.updatePersistence.remove(roomUpdate.getPackageName());
    }

    public C11183b remove(String str) {
        return this.updatePersistence.remove(str);
    }
}
