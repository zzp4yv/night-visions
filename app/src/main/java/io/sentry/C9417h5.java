package io.sentry;

import io.sentry.util.C9613q;
import io.sentry.util.C9621u;
import java.io.IOException;
import java.util.UUID;
import okhttp3.HttpUrl;

/* compiled from: SpanId.java */
/* renamed from: io.sentry.h5 */
/* loaded from: classes2.dex */
public final class C9417h5 implements InterfaceC9545r2 {

    /* renamed from: f */
    public static final C9417h5 f36344f = new C9417h5(new UUID(0, 0));

    /* renamed from: g */
    private final String f36345g;

    /* compiled from: SpanId.java */
    /* renamed from: io.sentry.h5$a */
    public static final class a implements InterfaceC9471l2<C9417h5> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9417h5 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            return new C9417h5(c9485n2.m31881J());
        }
    }

    public C9417h5(String str) {
        this.f36345g = (String) C9613q.m31802c(str, "value is required");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9417h5.class != obj.getClass()) {
            return false;
        }
        return this.f36345g.equals(((C9417h5) obj).f36345g);
    }

    public int hashCode() {
        return this.f36345g.hashCode();
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30819b(this.f36345g);
    }

    public String toString() {
        return this.f36345g;
    }

    public C9417h5() {
        this(UUID.randomUUID());
    }

    private C9417h5(UUID uuid) {
        this(C9621u.m31820d(uuid.toString()).replace("-", HttpUrl.FRAGMENT_ENCODE_SET).substring(0, 16));
    }
}
