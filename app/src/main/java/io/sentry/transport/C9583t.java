package io.sentry.transport;

import io.sentry.C9416h4;
import io.sentry.C9484n1;
import io.sentry.cache.InterfaceC9361r;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NoOpEnvelopeCache.java */
/* renamed from: io.sentry.transport.t */
/* loaded from: classes2.dex */
public final class C9583t implements InterfaceC9361r {

    /* renamed from: f */
    private static final C9583t f36900f = new C9583t();

    /* renamed from: c */
    public static C9583t m31704c() {
        return f36900f;
    }

    @Override // io.sentry.cache.InterfaceC9361r
    /* renamed from: Z */
    public void mo30163Z(C9416h4 c9416h4, C9484n1 c9484n1) {
    }

    @Override // java.lang.Iterable
    public Iterator<C9416h4> iterator() {
        return new ArrayList(0).iterator();
    }

    @Override // io.sentry.cache.InterfaceC9361r
    /* renamed from: p */
    public void mo30636p(C9416h4 c9416h4) {
    }
}
