package io.sentry.clientreport;

import io.sentry.EnumC9655z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AtomicClientReportStorage.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.a */
/* loaded from: classes2.dex */
final class C9364a implements InterfaceC9371h {

    /* renamed from: a */
    private final Map<C9366c, AtomicLong> f36239a;

    public C9364a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (EnumC9368e enumC9368e : EnumC9368e.values()) {
            for (EnumC9655z0 enumC9655z0 : EnumC9655z0.values()) {
                concurrentHashMap.put(new C9366c(enumC9368e.getReason(), enumC9655z0.getCategory()), new AtomicLong(0L));
            }
        }
        this.f36239a = Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.InterfaceC9371h
    /* renamed from: a */
    public List<C9369f> mo30678a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C9366c, AtomicLong> entry : this.f36239a.entrySet()) {
            Long valueOf = Long.valueOf(entry.getValue().getAndSet(0L));
            if (valueOf.longValue() > 0) {
                arrayList.add(new C9369f(entry.getKey().m30686b(), entry.getKey().m30685a(), valueOf));
            }
        }
        return arrayList;
    }

    @Override // io.sentry.clientreport.InterfaceC9371h
    /* renamed from: b */
    public void mo30679b(C9366c c9366c, Long l) {
        AtomicLong atomicLong = this.f36239a.get(c9366c);
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }
}
