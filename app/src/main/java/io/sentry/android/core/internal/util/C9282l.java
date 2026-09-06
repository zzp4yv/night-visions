package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import io.sentry.C9657z2;
import io.sentry.android.core.C9311s0;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ContentProviderSecurityChecker.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.util.l */
/* loaded from: classes2.dex */
public final class C9282l {

    /* renamed from: a */
    private final C9311s0 f35996a;

    public C9282l() {
        this(new C9311s0(C9657z2.m31959e()));
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m30287a(ContentProvider contentProvider) {
        int m30406d = this.f35996a.m30406d();
        if (m30406d < 26 || m30406d > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public C9282l(C9311s0 c9311s0) {
        this.f35996a = c9311s0;
    }
}
