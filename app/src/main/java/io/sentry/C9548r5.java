package io.sentry;

import cm.aptoide.p092pt.BuildConfig;
import io.sentry.protocol.C9525q;
import io.sentry.protocol.EnumC9534z;
import io.sentry.util.C9613q;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: TransactionContext.java */
/* renamed from: io.sentry.r5 */
/* loaded from: classes2.dex */
public final class C9548r5 extends C9403f5 {

    /* renamed from: p */
    private static final EnumC9534z f36805p = EnumC9534z.CUSTOM;

    /* renamed from: q */
    private String f36806q;

    /* renamed from: r */
    private EnumC9534z f36807r;

    /* renamed from: s */
    private C9541q5 f36808s;

    /* renamed from: t */
    private C9591u0 f36809t;

    /* renamed from: u */
    private EnumC9414h2 f36810u;

    @ApiStatus.Internal
    public C9548r5(String str, EnumC9534z enumC9534z, String str2) {
        this(str, enumC9534z, str2, null);
    }

    @ApiStatus.Internal
    /* renamed from: q */
    public static C9548r5 m31565q(C9493o3 c9493o3) {
        C9541q5 c9541q5;
        Boolean m31128f = c9493o3.m31128f();
        C9541q5 c9541q52 = m31128f == null ? null : new C9541q5(m31128f);
        C9591u0 m31124b = c9493o3.m31124b();
        if (m31124b != null) {
            m31124b.m31740a();
            Double m31746h = m31124b.m31746h();
            Boolean valueOf = Boolean.valueOf(m31128f != null ? m31128f.booleanValue() : false);
            if (m31746h != null) {
                c9541q5 = new C9541q5(valueOf, m31746h);
                return new C9548r5(c9493o3.m31127e(), c9493o3.m31126d(), c9493o3.m31125c(), c9541q5, m31124b);
            }
            c9541q52 = new C9541q5(valueOf);
        }
        c9541q5 = c9541q52;
        return new C9548r5(c9493o3.m31127e(), c9493o3.m31126d(), c9493o3.m31125c(), c9541q5, m31124b);
    }

    /* renamed from: r */
    public C9591u0 m31566r() {
        return this.f36809t;
    }

    /* renamed from: s */
    public EnumC9414h2 m31567s() {
        return this.f36810u;
    }

    /* renamed from: t */
    public String m31568t() {
        return this.f36806q;
    }

    /* renamed from: u */
    public C9541q5 m31569u() {
        return this.f36808s;
    }

    /* renamed from: v */
    public EnumC9534z m31570v() {
        return this.f36807r;
    }

    @ApiStatus.Internal
    public C9548r5(String str, EnumC9534z enumC9534z, String str2, C9541q5 c9541q5) {
        super(str2);
        this.f36810u = EnumC9414h2.SENTRY;
        this.f36806q = (String) C9613q.m31802c(str, "name is required");
        this.f36807r = enumC9534z;
        m30806n(c9541q5);
    }

    @ApiStatus.Internal
    public C9548r5(C9525q c9525q, C9417h5 c9417h5, C9417h5 c9417h52, C9541q5 c9541q5, C9591u0 c9591u0) {
        super(c9525q, c9417h5, BuildConfig.APTOIDE_THEME, c9417h52, null);
        this.f36810u = EnumC9414h2.SENTRY;
        this.f36806q = "<unlabeled transaction>";
        this.f36808s = c9541q5;
        this.f36807r = f36805p;
        this.f36809t = c9591u0;
    }
}
