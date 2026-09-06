package cm.aptoide.p092pt.database;

import cm.aptoide.analytics.implementation.EventsPersistence;
import cm.aptoide.analytics.implementation.data.Event;
import cm.aptoide.p092pt.database.room.EventDAO;
import cm.aptoide.p092pt.database.room.RoomEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.List;
import p319g.p320a.p321a.p322a.C9026d;
import p323h.p324a.AbstractC9031b;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.EnumC9029a;
import p323h.p324a.InterfaceC9033c;
import p323h.p324a.InterfaceC9035e;
import p323h.p324a.InterfaceC9036f;
import p323h.p324a.InterfaceC9046p;
import p323h.p324a.p326b0.C9032a;
import p323h.p324a.p328y.InterfaceC9064e;
import p323h.p324a.p328y.InterfaceC9065f;
import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public class RoomEventPersistence implements EventsPersistence {
    private final EventDAO eventDAO;
    private final RoomEventMapper mapper;

    public RoomEventPersistence(EventDAO eventDAO, RoomEventMapper roomEventMapper) {
        this.eventDAO = eventDAO;
        this.mapper = roomEventMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAll$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ InterfaceC9046p m7392a(List list) throws Exception {
        try {
            return AbstractC9043m.m29195t(this.mapper.map((List<RoomEvent>) list));
        } catch (IOException e2) {
            return AbstractC9043m.m29192h(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ InterfaceC9046p m7393b(Event event) throws Exception {
        try {
            return AbstractC9043m.m29195t(this.mapper.map(event));
        } catch (JsonProcessingException e2) {
            return AbstractC9043m.m29192h(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7394c(RoomEvent roomEvent) throws Exception {
        this.eventDAO.delete(roomEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7395d(Event event, InterfaceC9033c interfaceC9033c) throws Exception {
        try {
            this.eventDAO.insert(this.mapper.map(event));
            interfaceC9033c.mo29169a();
        } catch (JsonProcessingException e2) {
            interfaceC9033c.onError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ InterfaceC9036f m7396e(Event event) throws Exception {
        return C9026d.m29127e(save(event));
    }

    @Override // cm.aptoide.analytics.implementation.EventsPersistence
    public C11186e<List<Event>> getAll() {
        return C9026d.m29124b(this.eventDAO.getAll().m29215y(C9032a.m29163b()).m29202j(new InterfaceC9065f() { // from class: cm.aptoide.pt.database.s
            @Override // p323h.p324a.p328y.InterfaceC9065f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return RoomEventPersistence.this.m7392a((List) obj);
            }
        }), EnumC9029a.BUFFER);
    }

    @Override // cm.aptoide.analytics.implementation.EventsPersistence
    public C11183b remove(List<Event> list) {
        return C9026d.m29123a(AbstractC9043m.m29194s(list).m29202j(new InterfaceC9065f() { // from class: cm.aptoide.pt.database.v
            @Override // p323h.p324a.p328y.InterfaceC9065f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return RoomEventPersistence.this.m7393b((Event) obj);
            }
        }).m29215y(C9032a.m29163b()).m29201f(new InterfaceC9064e() { // from class: cm.aptoide.pt.database.t
            @Override // p323h.p324a.p328y.InterfaceC9064e
            /* renamed from: a */
            public final void mo7420a(Object obj) {
                RoomEventPersistence.this.m7394c((RoomEvent) obj);
            }
        }).m29196A().m29230e());
    }

    @Override // cm.aptoide.analytics.implementation.EventsPersistence
    public C11183b save(final Event event) {
        return C9026d.m29123a(AbstractC9031b.m29157c(new InterfaceC9035e() { // from class: cm.aptoide.pt.database.u
            @Override // p323h.p324a.InterfaceC9035e
            /* renamed from: a */
            public final void mo7421a(InterfaceC9033c interfaceC9033c) {
                RoomEventPersistence.this.m7395d(event, interfaceC9033c);
            }
        }).m29161f(C9032a.m29163b()));
    }

    @Override // cm.aptoide.analytics.implementation.EventsPersistence
    public C11183b save(List<Event> list) {
        return C9026d.m29123a(AbstractC9043m.m29194s(list).m29206n(new InterfaceC9065f() { // from class: cm.aptoide.pt.database.w
            @Override // p323h.p324a.p328y.InterfaceC9065f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return RoomEventPersistence.this.m7396e((Event) obj);
            }
        }));
    }
}
