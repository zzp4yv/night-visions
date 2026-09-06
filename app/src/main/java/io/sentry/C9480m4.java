package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.C9517i;
import io.sentry.protocol.C9524p;
import io.sentry.protocol.C9529u;
import io.sentry.protocol.C9530v;
import io.sentry.protocol.C9531w;
import io.sentry.util.C9613q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryExceptionFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.m4 */
/* loaded from: classes2.dex */
public final class C9480m4 {

    /* renamed from: a */
    private final C9659z4 f36501a;

    public C9480m4(C9659z4 c9659z4) {
        this.f36501a = (C9659z4) C9613q.m31802c(c9659z4, "The SentryStackTraceFactory is required.");
    }

    /* renamed from: b */
    private C9524p m31063b(Throwable th, C9517i c9517i, Long l, List<C9529u> list, boolean z) {
        Package r0 = th.getClass().getPackage();
        String name = th.getClass().getName();
        C9524p c9524p = new C9524p();
        String message = th.getMessage();
        if (r0 != null) {
            name = name.replace(r0.getName() + ".", HttpUrl.FRAGMENT_ENCODE_SET);
        }
        String name2 = r0 != null ? r0.getName() : null;
        if (list != null && !list.isEmpty()) {
            C9530v c9530v = new C9530v(list);
            if (z) {
                c9530v.m31501e(Boolean.TRUE);
            }
            c9524p.m31446l(c9530v);
        }
        c9524p.m31447m(l);
        c9524p.m31448n(name);
        c9524p.m31444j(c9517i);
        c9524p.m31445k(name2);
        c9524p.m31450p(message);
        return c9524p;
    }

    /* renamed from: d */
    private List<C9524p> m31064d(Deque<C9524p> deque) {
        return new ArrayList(deque);
    }

    /* renamed from: a */
    Deque<C9524p> m31065a(Throwable th) {
        Thread currentThread;
        C9517i c9517i;
        boolean z;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th != null && hashSet.add(th)) {
            if (th instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th;
                C9517i m30779a = exceptionMechanismException.m30779a();
                Throwable m30781c = exceptionMechanismException.m30781c();
                currentThread = exceptionMechanismException.m30780b();
                z = exceptionMechanismException.m30782d();
                c9517i = m30779a;
                th = m30781c;
            } else {
                currentThread = Thread.currentThread();
                c9517i = null;
                z = false;
            }
            arrayDeque.addFirst(m31063b(th, c9517i, Long.valueOf(currentThread.getId()), this.f36501a.m31960a(th.getStackTrace()), z));
            th = th.getCause();
        }
        return arrayDeque;
    }

    /* renamed from: c */
    public List<C9524p> m31066c(Throwable th) {
        return m31064d(m31065a(th));
    }

    /* renamed from: e */
    public List<C9524p> m31067e(C9531w c9531w, C9517i c9517i, Throwable th) {
        C9530v m31518n = c9531w.m31518n();
        if (m31518n == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(m31063b(th, c9517i, c9531w.m31516l(), m31518n.m31500d(), true));
        return arrayList;
    }
}
