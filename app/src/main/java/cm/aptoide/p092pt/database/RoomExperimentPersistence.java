package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.abtesting.Experiment;
import cm.aptoide.p092pt.abtesting.ExperimentModel;
import cm.aptoide.p092pt.abtesting.ExperimentPersistence;
import cm.aptoide.p092pt.database.room.ExperimentDAO;
import cm.aptoide.p092pt.database.room.RoomExperiment;
import p319g.p320a.p321a.p322a.C9026d;
import p323h.p324a.AbstractC9031b;
import p323h.p324a.AbstractC9049s;
import p323h.p324a.InterfaceC9033c;
import p323h.p324a.InterfaceC9035e;
import p323h.p324a.InterfaceC9053w;
import p323h.p324a.p326b0.C9032a;
import p323h.p324a.p328y.InterfaceC9065f;
import p456rx.C11183b;
import p456rx.Single;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class RoomExperimentPersistence implements ExperimentPersistence {
    private final ExperimentDAO experimentDAO;
    private final RoomExperimentMapper mapper;

    public RoomExperimentPersistence(ExperimentDAO experimentDAO, RoomExperimentMapper roomExperimentMapper) {
        this.experimentDAO = experimentDAO;
        this.mapper = roomExperimentMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$get$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ InterfaceC9053w m7397a(RoomExperiment roomExperiment) throws Exception {
        return AbstractC9049s.m29227f(new ExperimentModel(this.mapper.map(roomExperiment), false));
    }

    static /* synthetic */ ExperimentModel lambda$get$2(Throwable th) {
        return new ExperimentModel(new Experiment(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7398b(String str, Experiment experiment, InterfaceC9033c interfaceC9033c) throws Exception {
        this.experimentDAO.save(this.mapper.map(str, experiment));
        interfaceC9033c.mo29169a();
    }

    @Override // cm.aptoide.p092pt.abtesting.ExperimentPersistence
    public Single<ExperimentModel> get(String str) {
        return C9026d.m29126d(this.experimentDAO.get(str).m29232i(C9032a.m29163b()).m29229d(new InterfaceC9065f() { // from class: cm.aptoide.pt.database.z
            @Override // p323h.p324a.p328y.InterfaceC9065f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return RoomExperimentPersistence.this.m7397a((RoomExperiment) obj);
            }
        })).m39926r(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.x
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomExperimentPersistence.lambda$get$2((Throwable) obj);
            }
        }).m39917e(new InterfaceC11205b() { // from class: cm.aptoide.pt.database.o1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    @Override // cm.aptoide.p092pt.abtesting.ExperimentPersistence
    public C11183b save(final String str, final Experiment experiment) {
        return C9026d.m29123a(AbstractC9031b.m29157c(new InterfaceC9035e() { // from class: cm.aptoide.pt.database.y
            @Override // p323h.p324a.InterfaceC9035e
            /* renamed from: a */
            public final void mo7421a(InterfaceC9033c interfaceC9033c) {
                RoomExperimentPersistence.this.m7398b(str, experiment, interfaceC9033c);
            }
        }).m29161f(C9032a.m29163b()));
    }
}
