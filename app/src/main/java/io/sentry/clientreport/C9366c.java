package io.sentry.clientreport;

import io.sentry.util.C9613q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ClientReportKey.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.c */
/* loaded from: classes2.dex */
final class C9366c {

    /* renamed from: a */
    private final String f36243a;

    /* renamed from: b */
    private final String f36244b;

    C9366c(String str, String str2) {
        this.f36243a = str;
        this.f36244b = str2;
    }

    /* renamed from: a */
    public String m30685a() {
        return this.f36244b;
    }

    /* renamed from: b */
    public String m30686b() {
        return this.f36243a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9366c)) {
            return false;
        }
        C9366c c9366c = (C9366c) obj;
        return C9613q.m31800a(m30686b(), c9366c.m30686b()) && C9613q.m31800a(m30685a(), c9366c.m30685a());
    }

    public int hashCode() {
        return C9613q.m31801b(m30686b(), m30685a());
    }
}
