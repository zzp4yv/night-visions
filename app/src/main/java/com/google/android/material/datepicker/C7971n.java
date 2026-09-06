package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: TimeSource.java */
/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes2.dex */
class C7971n {

    /* renamed from: a */
    private static final C7971n f30181a = new C7971n(null, null);

    /* renamed from: b */
    private final Long f30182b;

    /* renamed from: c */
    private final TimeZone f30183c;

    private C7971n(Long l, TimeZone timeZone) {
        this.f30182b = l;
        this.f30183c = timeZone;
    }

    /* renamed from: c */
    static C7971n m24420c() {
        return f30181a;
    }

    /* renamed from: a */
    Calendar m24421a() {
        return m24422b(this.f30183c);
    }

    /* renamed from: b */
    Calendar m24422b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f30182b;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
