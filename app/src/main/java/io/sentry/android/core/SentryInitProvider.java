package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.C9214a4;
import io.sentry.C9540q4;
import io.sentry.EnumC9554s4;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class SentryInitProvider extends AbstractC9321x0 {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C9254i0 c9254i0 = new C9254i0();
        Context context = getContext();
        if (context == null) {
            c9254i0.mo30214c(EnumC9554s4.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        if (!C9240d1.m30166c(context, c9254i0)) {
            return true;
        }
        C9249g1.m30205b(context, c9254i0);
        C9540q4.m31555c().m31556a("AutoInit");
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        C9214a4.m30035e();
    }
}
