package io.sentry;

import io.sentry.protocol.C9525q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: PropagationContext.java */
@ApiStatus.Internal
/* renamed from: io.sentry.o3 */
/* loaded from: classes2.dex */
public final class C9493o3 {

    /* renamed from: a */
    private C9525q f36533a;

    /* renamed from: b */
    private C9417h5 f36534b;

    /* renamed from: c */
    private C9417h5 f36535c;

    /* renamed from: d */
    private Boolean f36536d;

    /* renamed from: e */
    private C9591u0 f36537e;

    public C9493o3() {
        this(new C9525q(), new C9417h5(), null, null, null);
    }

    /* renamed from: a */
    private static C9591u0 m31123a(C9591u0 c9591u0) {
        if (c9591u0 != null) {
            return new C9591u0(c9591u0);
        }
        return null;
    }

    /* renamed from: b */
    public C9591u0 m31124b() {
        return this.f36537e;
    }

    /* renamed from: c */
    public C9417h5 m31125c() {
        return this.f36535c;
    }

    /* renamed from: d */
    public C9417h5 m31126d() {
        return this.f36534b;
    }

    /* renamed from: e */
    public C9525q m31127e() {
        return this.f36533a;
    }

    /* renamed from: f */
    public Boolean m31128f() {
        return this.f36536d;
    }

    /* renamed from: g */
    public void m31129g(C9591u0 c9591u0) {
        this.f36537e = c9591u0;
    }

    /* renamed from: h */
    public C9495o5 m31130h() {
        C9591u0 c9591u0 = this.f36537e;
        if (c9591u0 != null) {
            return c9591u0.m31739F();
        }
        return null;
    }

    public C9493o3(C9493o3 c9493o3) {
        this(c9493o3.m31127e(), c9493o3.m31126d(), c9493o3.m31125c(), m31123a(c9493o3.m31124b()), c9493o3.m31128f());
    }

    public C9493o3(C9525q c9525q, C9417h5 c9417h5, C9417h5 c9417h52, C9591u0 c9591u0, Boolean bool) {
        this.f36533a = c9525q;
        this.f36534b = c9417h5;
        this.f36535c = c9417h52;
        this.f36537e = c9591u0;
        this.f36536d = bool;
    }
}
