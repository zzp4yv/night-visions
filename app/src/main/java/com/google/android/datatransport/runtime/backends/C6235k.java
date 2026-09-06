package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: MetadataBackendRegistry.java */
@Singleton
/* renamed from: com.google.android.datatransport.runtime.backends.k */
/* loaded from: classes2.dex */
class C6235k implements InterfaceC6229e {

    /* renamed from: a */
    private final a f16780a;

    /* renamed from: b */
    private final C6233i f16781b;

    /* renamed from: c */
    private final Map<String, InterfaceC6237m> f16782c;

    /* compiled from: MetadataBackendRegistry.java */
    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    static class a {

        /* renamed from: a */
        private final Context f16783a;

        /* renamed from: b */
        private Map<String, String> f16784b = null;

        a(Context context) {
            this.f16783a = context;
        }

        /* renamed from: a */
        private Map<String, String> m13530a(Context context) {
            Bundle m13532d = m13532d(context);
            if (m13532d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m13532d.keySet()) {
                Object obj = m13532d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m13531c() {
            if (this.f16784b == null) {
                this.f16784b = m13530a(this.f16783a);
            }
            return this.f16784b;
        }

        /* renamed from: d */
        private static Bundle m13532d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: b */
        InterfaceC6228d m13533b(String str) {
            String str2 = m13531c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC6228d) Class.forName(str2).asSubclass(InterfaceC6228d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e2);
                return null;
            } catch (IllegalAccessException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (InstantiationException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e6);
                return null;
            }
        }
    }

    @Inject
    C6235k(Context context, C6233i c6233i) {
        this(new a(context), c6233i);
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6229e
    public synchronized InterfaceC6237m get(String str) {
        if (this.f16782c.containsKey(str)) {
            return this.f16782c.get(str);
        }
        InterfaceC6228d m13533b = this.f16780a.m13533b(str);
        if (m13533b == null) {
            return null;
        }
        InterfaceC6237m create = m13533b.create(this.f16781b.m13526a(str));
        this.f16782c.put(str, create);
        return create;
    }

    C6235k(a aVar, C6233i c6233i) {
        this.f16782c = new HashMap();
        this.f16780a = aVar;
        this.f16781b = c6233i;
    }
}
