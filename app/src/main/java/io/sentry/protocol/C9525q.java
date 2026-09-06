package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9621u;
import java.io.IOException;
import java.util.UUID;
import okhttp3.HttpUrl;

/* compiled from: SentryId.java */
/* renamed from: io.sentry.protocol.q */
/* loaded from: classes2.dex */
public final class C9525q implements InterfaceC9545r2 {

    /* renamed from: f */
    public static final C9525q f36725f = new C9525q(new UUID(0, 0));

    /* renamed from: g */
    private final UUID f36726g;

    /* compiled from: SentryId.java */
    /* renamed from: io.sentry.protocol.q$a */
    public static final class a implements InterfaceC9471l2<C9525q> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9525q mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            return new C9525q(c9485n2.m31881J());
        }
    }

    public C9525q() {
        this((UUID) null);
    }

    /* renamed from: a */
    private UUID m31452a(String str) {
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() == 36) {
            return UUID.fromString(str);
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9525q.class == obj.getClass() && this.f36726g.compareTo(((C9525q) obj).f36726g) == 0;
    }

    public int hashCode() {
        return this.f36726g.hashCode();
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30819b(toString());
    }

    public String toString() {
        return C9621u.m31820d(this.f36726g.toString()).replace("-", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public C9525q(UUID uuid) {
        this.f36726g = uuid == null ? UUID.randomUUID() : uuid;
    }

    public C9525q(String str) {
        this.f36726g = m31452a(C9621u.m31820d(str));
    }
}
