package io.sentry.android.ndk;

import io.sentry.C9211a1;
import io.sentry.C9403f5;
import io.sentry.C9624v0;
import io.sentry.C9647x4;
import io.sentry.C9650y1;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9656z1;
import io.sentry.protocol.C9510c;
import io.sentry.util.C9613q;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: NdkScopeObserver.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.ndk.c */
/* loaded from: classes2.dex */
public final class C9328c implements InterfaceC9656z1 {

    /* renamed from: a */
    private final C9647x4 f36142a;

    /* renamed from: b */
    private final InterfaceC9327b f36143b;

    public C9328c(C9647x4 c9647x4) {
        this(c9647x4, new NativeScope());
    }

    @Override // io.sentry.InterfaceC9656z1
    /* renamed from: a */
    public /* synthetic */ void mo30480a(Collection collection) {
        C9650y1.m31953b(this, collection);
    }

    @Override // io.sentry.InterfaceC9656z1
    /* renamed from: b */
    public /* synthetic */ void mo30481b(C9510c c9510c) {
        C9650y1.m31954c(this, c9510c);
    }

    @Override // io.sentry.InterfaceC9656z1
    /* renamed from: c */
    public /* synthetic */ void mo30482c(C9403f5 c9403f5) {
        C9650y1.m31955d(this, c9403f5);
    }

    @Override // io.sentry.InterfaceC9656z1
    /* renamed from: d */
    public /* synthetic */ void mo30483d(String str) {
        C9650y1.m31956e(this, str);
    }

    @Override // io.sentry.InterfaceC9656z1
    /* renamed from: i */
    public void mo30484i(C9624v0 c9624v0) {
        try {
            String str = null;
            String lowerCase = c9624v0.m31836h() != null ? c9624v0.m31836h().name().toLowerCase(Locale.ROOT) : null;
            String m30012g = C9211a1.m30012g(c9624v0.m31838j());
            try {
                Map<String, Object> m31835g = c9624v0.m31835g();
                if (!m31835g.isEmpty()) {
                    str = this.f36142a.getSerializer().mo30492f(m31835g);
                }
            } catch (Throwable th) {
                this.f36142a.getLogger().mo30212a(EnumC9554s4.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
            }
            this.f36143b.mo30479a(lowerCase, c9624v0.m31837i(), c9624v0.m31834f(), c9624v0.m31839k(), m30012g, str);
        } catch (Throwable th2) {
            this.f36142a.getLogger().mo30212a(EnumC9554s4.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    C9328c(C9647x4 c9647x4, InterfaceC9327b interfaceC9327b) {
        this.f36142a = (C9647x4) C9613q.m31802c(c9647x4, "The SentryOptions object is required.");
        this.f36143b = (InterfaceC9327b) C9613q.m31802c(interfaceC9327b, "The NativeScope object is required.");
    }
}
