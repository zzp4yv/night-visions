package io.sentry;

import java.util.Date;

/* compiled from: SentryNanotimeDate.java */
/* renamed from: io.sentry.v4 */
/* loaded from: classes2.dex */
public final class C9628v4 extends AbstractC9402f4 {

    /* renamed from: f */
    private final Date f36949f;

    /* renamed from: g */
    private final long f36950g;

    public C9628v4() {
        this(C9211a1.m30008c(), System.nanoTime());
    }

    /* renamed from: y */
    private long m31847y(C9628v4 c9628v4, C9628v4 c9628v42) {
        return c9628v4.mo30792x() + (c9628v42.f36950g - c9628v4.f36950g);
    }

    @Override // io.sentry.AbstractC9402f4, java.lang.Comparable
    /* renamed from: g */
    public int compareTo(AbstractC9402f4 abstractC9402f4) {
        if (!(abstractC9402f4 instanceof C9628v4)) {
            return super.compareTo(abstractC9402f4);
        }
        C9628v4 c9628v4 = (C9628v4) abstractC9402f4;
        long time = this.f36949f.getTime();
        long time2 = c9628v4.f36949f.getTime();
        return time == time2 ? Long.valueOf(this.f36950g).compareTo(Long.valueOf(c9628v4.f36950g)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC9402f4
    /* renamed from: k */
    public long mo30788k(AbstractC9402f4 abstractC9402f4) {
        return abstractC9402f4 instanceof C9628v4 ? this.f36950g - ((C9628v4) abstractC9402f4).f36950g : super.mo30788k(abstractC9402f4);
    }

    @Override // io.sentry.AbstractC9402f4
    /* renamed from: v */
    public long mo30791v(AbstractC9402f4 abstractC9402f4) {
        if (abstractC9402f4 == null || !(abstractC9402f4 instanceof C9628v4)) {
            return super.mo30791v(abstractC9402f4);
        }
        C9628v4 c9628v4 = (C9628v4) abstractC9402f4;
        return compareTo(abstractC9402f4) < 0 ? m31847y(this, c9628v4) : m31847y(c9628v4, this);
    }

    @Override // io.sentry.AbstractC9402f4
    /* renamed from: x */
    public long mo30792x() {
        return C9211a1.m30006a(this.f36949f);
    }

    public C9628v4(Date date, long j2) {
        this.f36949f = date;
        this.f36950g = j2;
    }
}
