package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.AbstractC9402f4;
import io.sentry.C9211a1;
import io.sentry.C9595u4;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AppStartState.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.q0 */
/* loaded from: classes2.dex */
public final class C9307q0 {

    /* renamed from: a */
    private static C9307q0 f36091a = new C9307q0();

    /* renamed from: b */
    private Long f36092b;

    /* renamed from: c */
    private Long f36093c;

    /* renamed from: d */
    private Boolean f36094d = null;

    /* renamed from: e */
    private AbstractC9402f4 f36095e;

    private C9307q0() {
    }

    /* renamed from: e */
    public static C9307q0 m30389e() {
        return f36091a;
    }

    /* renamed from: a */
    public AbstractC9402f4 m30390a() {
        Long m30391b;
        AbstractC9402f4 m30393d = m30393d();
        if (m30393d == null || (m30391b = m30391b()) == null) {
            return null;
        }
        return new C9595u4(m30393d.mo30792x() + C9211a1.m30013h(m30391b.longValue()));
    }

    /* renamed from: b */
    public synchronized Long m30391b() {
        Long l;
        if (this.f36092b != null && (l = this.f36093c) != null && this.f36094d != null) {
            long longValue = l.longValue() - this.f36092b.longValue();
            if (longValue >= 60000) {
                return null;
            }
            return Long.valueOf(longValue);
        }
        return null;
    }

    /* renamed from: c */
    public Long m30392c() {
        return this.f36092b;
    }

    /* renamed from: d */
    public AbstractC9402f4 m30393d() {
        return this.f36095e;
    }

    /* renamed from: f */
    public Boolean m30394f() {
        return this.f36094d;
    }

    /* renamed from: g */
    synchronized void m30395g() {
        m30396h(SystemClock.uptimeMillis());
    }

    /* renamed from: h */
    void m30396h(long j2) {
        this.f36093c = Long.valueOf(j2);
    }

    /* renamed from: i */
    synchronized void m30397i(long j2, AbstractC9402f4 abstractC9402f4) {
        if (this.f36095e == null || this.f36092b == null) {
            this.f36095e = abstractC9402f4;
            this.f36092b = Long.valueOf(j2);
        }
    }

    /* renamed from: j */
    synchronized void m30398j(boolean z) {
        if (this.f36094d != null) {
            return;
        }
        this.f36094d = Boolean.valueOf(z);
    }
}
