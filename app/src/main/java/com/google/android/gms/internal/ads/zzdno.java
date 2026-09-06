package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public class zzdno {

    /* renamed from: b */
    private static volatile zzdno f25690b;

    /* renamed from: d */
    private final Map<C7408a, zzdob.zzd<?, ?>> f25692d;

    /* renamed from: a */
    private static final Class<?> f25689a = m19701c();

    /* renamed from: c */
    static final zzdno f25691c = new zzdno(true);

    /* renamed from: com.google.android.gms.internal.ads.zzdno$a */
    static final class C7408a {

        /* renamed from: a */
        private final Object f25693a;

        /* renamed from: b */
        private final int f25694b;

        C7408a(Object obj, int i2) {
            this.f25693a = obj;
            this.f25694b = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C7408a)) {
                return false;
            }
            C7408a c7408a = (C7408a) obj;
            return this.f25693a == c7408a.f25693a && this.f25694b == c7408a.f25694b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f25693a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f25694b;
        }
    }

    zzdno() {
        this.f25692d = new HashMap();
    }

    /* renamed from: b */
    static zzdno m19700b() {
        return AbstractC6580dv.m15080b(zzdno.class);
    }

    /* renamed from: c */
    private static Class<?> m19701c() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static zzdno m19702d() {
        return C7208uu.m15933b();
    }

    /* renamed from: e */
    public static zzdno m19703e() {
        zzdno zzdnoVar = f25690b;
        if (zzdnoVar == null) {
            synchronized (zzdno.class) {
                zzdnoVar = f25690b;
                if (zzdnoVar == null) {
                    zzdnoVar = C7208uu.m15934c();
                    f25690b = zzdnoVar;
                }
            }
        }
        return zzdnoVar;
    }

    /* renamed from: a */
    public final <ContainingType extends zzdpk> zzdob.zzd<ContainingType, ?> m19704a(ContainingType containingtype, int i2) {
        return (zzdob.zzd) this.f25692d.get(new C7408a(containingtype, i2));
    }

    private zzdno(boolean z) {
        this.f25692d = Collections.emptyMap();
    }
}
