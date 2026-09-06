package kotlin.reflect.p371y.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a.C10661k;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;
import okhttp3.HttpUrl;

/* compiled from: moduleByClassLoader.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\bH\u0000\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m32267d2 = {"moduleByClassLoader", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "Ljava/lang/ref/WeakReference;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "clearModuleByClassLoaderCache", HttpUrl.FRAGMENT_ENCODE_SET, "getOrCreateModule", "Ljava/lang/Class;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.z */
/* loaded from: classes2.dex */
public final class C10474z {

    /* renamed from: a */
    private static final ConcurrentMap<WeakClassLoaderBox, WeakReference<C10661k>> f40607a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C10661k m37330a(Class<?> cls) {
        C9768m.m32346f(cls, "<this>");
        ClassLoader m38073e = C10670d.m38073e(cls);
        WeakClassLoaderBox weakClassLoaderBox = new WeakClassLoaderBox(m38073e);
        ConcurrentMap<WeakClassLoaderBox, WeakReference<C10661k>> concurrentMap = f40607a;
        WeakReference<C10661k> weakReference = concurrentMap.get(weakClassLoaderBox);
        if (weakReference != null) {
            C10661k c10661k = weakReference.get();
            if (c10661k != null) {
                return c10661k;
            }
            concurrentMap.remove(weakClassLoaderBox, weakReference);
        }
        C10661k m38034a = C10661k.f41150a.m38034a(m38073e);
        while (true) {
            try {
                ConcurrentMap<WeakClassLoaderBox, WeakReference<C10661k>> concurrentMap2 = f40607a;
                WeakReference<C10661k> putIfAbsent = concurrentMap2.putIfAbsent(weakClassLoaderBox, new WeakReference<>(m38034a));
                if (putIfAbsent == null) {
                    return m38034a;
                }
                C10661k c10661k2 = putIfAbsent.get();
                if (c10661k2 != null) {
                    return c10661k2;
                }
                concurrentMap2.remove(weakClassLoaderBox, putIfAbsent);
            } finally {
                weakClassLoaderBox.m32610a(null);
            }
        }
    }
}
