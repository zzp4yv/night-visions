package io.sentry.android.core.internal.debugmeta;

import android.content.Context;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import io.sentry.internal.debugmeta.InterfaceC9442a;
import io.sentry.util.C9606j;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AssetsDebugMetaLoader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.debugmeta.a */
/* loaded from: classes2.dex */
public final class C9255a implements InterfaceC9442a {

    /* renamed from: a */
    private final Context f35929a;

    /* renamed from: b */
    private final InterfaceC9637w1 f35930b;

    public C9255a(Context context, InterfaceC9637w1 interfaceC9637w1) {
        this.f35929a = context;
        this.f35930b = interfaceC9637w1;
    }

    @Override // io.sentry.internal.debugmeta.InterfaceC9442a
    /* renamed from: a */
    public Properties mo30216a() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f35929a.getAssets().open(C9606j.f36929a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (FileNotFoundException e2) {
            this.f35930b.mo30212a(EnumC9554s4.INFO, e2, "%s file was not found.", C9606j.f36929a);
            return null;
        } catch (IOException e3) {
            this.f35930b.mo30213b(EnumC9554s4.ERROR, "Error getting Proguard UUIDs.", e3);
            return null;
        } catch (RuntimeException e4) {
            this.f35930b.mo30212a(EnumC9554s4.ERROR, e4, "%s file is malformed.", C9606j.f36929a);
            return null;
        }
    }
}
