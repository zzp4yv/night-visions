package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.p205s.InterfaceC8463b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ComponentDiscovery.java */
/* renamed from: com.google.firebase.components.q */
/* loaded from: classes2.dex */
public final class C8094q<T> {

    /* renamed from: a */
    private final T f30715a;

    /* renamed from: b */
    private final c<T> f30716b;

    /* compiled from: ComponentDiscovery.java */
    /* renamed from: com.google.firebase.components.q$b */
    private static class b implements c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f30717a;

        /* renamed from: b */
        private Bundle m25022b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f30717a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f30717a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.C8094q.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> mo25023a(Context context) {
            Bundle m25022b = m25022b(context);
            if (m25022b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m25022b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m25022b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f30717a = cls;
        }
    }

    /* compiled from: ComponentDiscovery.java */
    /* renamed from: com.google.firebase.components.q$c */
    interface c<T> {
        /* renamed from: a */
        List<String> mo25023a(T t);
    }

    C8094q(T t, c<T> cVar) {
        this.f30715a = t;
        this.f30716b = cVar;
    }

    /* renamed from: b */
    public static C8094q<Context> m25018b(Context context, Class<? extends Service> cls) {
        return new C8094q<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static ComponentRegistrar m25019c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e5);
        }
    }

    /* renamed from: a */
    public List<InterfaceC8463b<ComponentRegistrar>> m25021a() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f30716b.mo25023a(this.f30715a)) {
            arrayList.add(new InterfaceC8463b() { // from class: com.google.firebase.components.c
                @Override // com.google.firebase.p205s.InterfaceC8463b
                public final Object get() {
                    ComponentRegistrar m25019c;
                    m25019c = C8094q.m25019c(str);
                    return m25019c;
                }
            });
        }
        return arrayList;
    }
}
