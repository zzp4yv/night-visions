package io.sentry;

import io.sentry.protocol.C9529u;
import io.sentry.protocol.C9530v;
import io.sentry.protocol.C9531w;
import io.sentry.util.C9613q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryThreadFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.a5 */
/* loaded from: classes2.dex */
public final class C9215a5 {

    /* renamed from: a */
    private final C9659z4 f35749a;

    /* renamed from: b */
    private final C9647x4 f35750b;

    public C9215a5(C9659z4 c9659z4, C9647x4 c9647x4) {
        this.f35749a = (C9659z4) C9613q.m31802c(c9659z4, "The SentryStackTraceFactory is required.");
        this.f35750b = (C9647x4) C9613q.m31802c(c9647x4, "The SentryOptions is required");
    }

    /* renamed from: d */
    private C9531w m30052d(boolean z, StackTraceElement[] stackTraceElementArr, Thread thread) {
        C9531w c9531w = new C9531w();
        c9531w.m31527w(thread.getName());
        c9531w.m31528x(Integer.valueOf(thread.getPriority()));
        c9531w.m31525u(Long.valueOf(thread.getId()));
        c9531w.m31523s(Boolean.valueOf(thread.isDaemon()));
        c9531w.m31530z(thread.getState().name());
        c9531w.m31521q(Boolean.valueOf(z));
        List<C9529u> m31960a = this.f35749a.m31960a(stackTraceElementArr);
        if (this.f35750b.isAttachStacktrace() && m31960a != null && !m31960a.isEmpty()) {
            C9530v c9530v = new C9530v(m31960a);
            c9530v.m31501e(Boolean.TRUE);
            c9531w.m31529y(c9530v);
        }
        return c9531w;
    }

    /* renamed from: a */
    List<C9531w> m30053a() {
        HashMap hashMap = new HashMap();
        Thread currentThread = Thread.currentThread();
        hashMap.put(currentThread, currentThread.getStackTrace());
        return m30055c(hashMap, null, false);
    }

    /* renamed from: b */
    List<C9531w> m30054b(List<Long> list, boolean z) {
        return m30055c(Thread.getAllStackTraces(), list, z);
    }

    /* renamed from: c */
    List<C9531w> m30055c(Map<Thread, StackTraceElement[]> map, List<Long> list, boolean z) {
        Thread currentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(currentThread)) {
            map.put(currentThread, currentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(m30052d((key == currentThread && !z) || (list != null && list.contains(Long.valueOf(key.getId()))), entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }
}
