package io.sentry;

import java.time.Instant;

/* compiled from: SentryInstantDate.java */
/* renamed from: io.sentry.o4 */
/* loaded from: classes2.dex */
public final class C9494o4 extends AbstractC9402f4 {

    /* renamed from: f */
    private final Instant f36538f;

    public C9494o4() {
        this(Instant.now());
    }

    @Override // io.sentry.AbstractC9402f4
    /* renamed from: x */
    public long mo30792x() {
        return C9211a1.m30018m(this.f36538f.getEpochSecond()) + this.f36538f.getNano();
    }

    public C9494o4(Instant instant) {
        this.f36538f = instant;
    }
}
