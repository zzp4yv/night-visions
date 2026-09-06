package io.sentry;

import io.sentry.util.C9613q;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: Stack.java */
/* renamed from: io.sentry.k5 */
/* loaded from: classes2.dex */
final class C9467k5 {

    /* renamed from: a */
    private final Deque<a> f36409a;

    /* renamed from: b */
    private final InterfaceC9637w1 f36410b;

    public C9467k5(InterfaceC9637w1 interfaceC9637w1, a aVar) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f36409a = linkedBlockingDeque;
        this.f36410b = (InterfaceC9637w1) C9613q.m31802c(interfaceC9637w1, "logger is required");
        linkedBlockingDeque.push((a) C9613q.m31802c(aVar, "rootStackItem is required"));
    }

    /* renamed from: a */
    a m30923a() {
        return this.f36409a.peek();
    }

    /* renamed from: b */
    void m30924b(a aVar) {
        this.f36409a.push(aVar);
    }

    /* compiled from: Stack.java */
    /* renamed from: io.sentry.k5$a */
    static final class a {

        /* renamed from: a */
        private final C9647x4 f36411a;

        /* renamed from: b */
        private volatile InterfaceC9212a2 f36412b;

        /* renamed from: c */
        private volatile C9553s3 f36413c;

        a(C9647x4 c9647x4, InterfaceC9212a2 interfaceC9212a2, C9553s3 c9553s3) {
            this.f36412b = (InterfaceC9212a2) C9613q.m31802c(interfaceC9212a2, "ISentryClient is required.");
            this.f36413c = (C9553s3) C9613q.m31802c(c9553s3, "Scope is required.");
            this.f36411a = (C9647x4) C9613q.m31802c(c9647x4, "Options is required");
        }

        /* renamed from: a */
        public InterfaceC9212a2 m30925a() {
            return this.f36412b;
        }

        /* renamed from: b */
        public C9647x4 m30926b() {
            return this.f36411a;
        }

        /* renamed from: c */
        public C9553s3 m30927c() {
            return this.f36413c;
        }

        a(a aVar) {
            this.f36411a = aVar.f36411a;
            this.f36412b = aVar.f36412b;
            this.f36413c = new C9553s3(aVar.f36413c);
        }
    }

    public C9467k5(C9467k5 c9467k5) {
        this(c9467k5.f36410b, new a(c9467k5.f36409a.getLast()));
        Iterator<a> descendingIterator = c9467k5.f36409a.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            m30924b(new a(descendingIterator.next()));
        }
    }
}
