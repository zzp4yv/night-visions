package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdha;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class zzdcf {

    /* renamed from: a */
    private static final Logger f25473a = Logger.getLogger(zzdcf.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, zzdbs> f25474b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f25475c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, zzdbk> f25476d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<Class<?>, zzdcc<?>> f25477e = new ConcurrentHashMap();

    /* renamed from: a */
    private static <T> T m19206a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    private static <P> zzdbs<P> m19207b(String str, Class<P> cls) throws GeneralSecurityException {
        zzdbs<P> zzdbsVar = f25474b.get(str);
        if (zzdbsVar == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("No key manager found for key type: ");
            sb.append(str);
            sb.append(".  Check the configuration of the registry.");
            throw new GeneralSecurityException(sb.toString());
        }
        if (cls == null || zzdbsVar.mo19178a().equals(cls)) {
            return zzdbsVar;
        }
        String name = zzdbsVar.mo19178a().getName();
        String name2 = cls.getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 80 + String.valueOf(str).length() + name2.length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" of keymanager for type ");
        sb2.append(str);
        sb2.append(" does not match requested primitive type ");
        sb2.append(name2);
        throw new GeneralSecurityException(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <P> zzdca<P> m19208c(zzdbu zzdbuVar, zzdbs<P> zzdbsVar, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) m19206a(cls);
        C6539cr.m14985b(zzdbuVar.m19189b());
        zzdca<P> zzdcaVar = (zzdca<P>) zzdca.m19196a(cls2);
        for (zzdha.zzb zzbVar : zzdbuVar.m19189b().m19460y()) {
            if (zzbVar.m19463A() == zzdgu.ENABLED) {
                zzdcb m19197b = zzdcaVar.m19197b(m19212g(zzbVar.m19467z().m19416B(), zzbVar.m19467z().m19417C(), cls2), zzbVar);
                if (zzbVar.m19464B() == zzdbuVar.m19189b().m19459x()) {
                    zzdcaVar.m19198c(m19197b);
                }
            }
        }
        return zzdcaVar;
    }

    /* renamed from: d */
    public static synchronized zzdgr m19209d(zzdgw zzdgwVar) throws GeneralSecurityException {
        zzdgr mo19182e;
        synchronized (zzdcf.class) {
            zzdbs m19207b = m19207b(zzdgwVar.m19426x(), null);
            if (!f25475c.get(zzdgwVar.m19426x()).booleanValue()) {
                String valueOf = String.valueOf(zzdgwVar.m19426x());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
            mo19182e = m19207b.mo19182e(zzdgwVar.m19427y());
        }
        return mo19182e;
    }

    /* renamed from: e */
    public static synchronized zzdpk m19210e(String str, zzdpk zzdpkVar) throws GeneralSecurityException {
        zzdpk mo19180c;
        synchronized (zzdcf.class) {
            zzdbs m19207b = m19207b(str, null);
            if (!f25475c.get(str).booleanValue()) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
            mo19180c = m19207b.mo19180c(zzdpkVar);
        }
        return mo19180c;
    }

    /* renamed from: f */
    public static <P> P m19211f(zzdca<P> zzdcaVar) throws GeneralSecurityException {
        zzdcc<?> zzdccVar = f25477e.get(zzdcaVar.m19199d());
        if (zzdccVar != null) {
            return (P) zzdccVar.mo19205b(zzdcaVar);
        }
        String name = zzdcaVar.m19199d().getName();
        throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
    }

    /* renamed from: g */
    private static <P> P m19212g(String str, zzdmr zzdmrVar, Class<P> cls) throws GeneralSecurityException {
        return (P) m19207b(str, cls).mo19184g(zzdmrVar);
    }

    /* renamed from: h */
    public static <P> P m19213h(String str, zzdpk zzdpkVar, Class<P> cls) throws GeneralSecurityException {
        return (P) m19207b(str, (Class) m19206a(cls)).mo19181d(zzdpkVar);
    }

    /* renamed from: i */
    public static <P> P m19214i(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) m19212g(str, zzdmr.m19596D(bArr), (Class) m19206a(cls));
    }

    /* renamed from: j */
    public static synchronized <P> void m19215j(zzdbs<P> zzdbsVar) throws GeneralSecurityException {
        synchronized (zzdcf.class) {
            m19216k(zzdbsVar, true);
        }
    }

    /* renamed from: k */
    public static synchronized <P> void m19216k(zzdbs<P> zzdbsVar, boolean z) throws GeneralSecurityException {
        synchronized (zzdcf.class) {
            if (zzdbsVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String mo19179b = zzdbsVar.mo19179b();
            ConcurrentMap<String, zzdbs> concurrentMap = f25474b;
            if (concurrentMap.containsKey(mo19179b)) {
                zzdbs m19207b = m19207b(mo19179b, null);
                boolean booleanValue = f25475c.get(mo19179b).booleanValue();
                if (!zzdbsVar.getClass().equals(m19207b.getClass()) || (!booleanValue && z)) {
                    Logger logger = f25473a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(mo19179b);
                    logger.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", mo19179b, m19207b.getClass().getName(), zzdbsVar.getClass().getName()));
                }
            }
            concurrentMap.put(mo19179b, zzdbsVar);
            f25475c.put(mo19179b, Boolean.valueOf(z));
        }
    }

    /* renamed from: l */
    public static synchronized <P> void m19217l(zzdcc<P> zzdccVar) throws GeneralSecurityException {
        synchronized (zzdcf.class) {
            if (zzdccVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> mo19204a = zzdccVar.mo19204a();
            ConcurrentMap<Class<?>, zzdcc<?>> concurrentMap = f25477e;
            if (concurrentMap.containsKey(mo19204a)) {
                zzdcc<?> zzdccVar2 = concurrentMap.get(mo19204a);
                if (!zzdccVar.getClass().equals(zzdccVar2.getClass())) {
                    Logger logger = f25473a;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(mo19204a.toString());
                    logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", mo19204a.getName(), zzdccVar2.getClass().getName(), zzdccVar.getClass().getName()));
                }
            }
            concurrentMap.put(mo19204a, zzdccVar);
        }
    }

    /* renamed from: m */
    public static synchronized void m19218m(String str, zzdbk<?> zzdbkVar) throws GeneralSecurityException {
        synchronized (zzdcf.class) {
            ConcurrentMap<String, zzdbk> concurrentMap = f25476d;
            if (concurrentMap.containsKey(str.toLowerCase())) {
                if (!zzdbkVar.getClass().equals(concurrentMap.get(str.toLowerCase()).getClass())) {
                    f25473a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "addCatalogue", str.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(str) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                    StringBuilder sb = new StringBuilder(str.length() + 47);
                    sb.append("catalogue for name ");
                    sb.append(str);
                    sb.append(" has been already registered");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            concurrentMap.put(str.toLowerCase(), zzdbkVar);
        }
    }

    /* renamed from: n */
    public static synchronized zzdpk m19219n(zzdgw zzdgwVar) throws GeneralSecurityException {
        zzdpk mo19183f;
        synchronized (zzdcf.class) {
            zzdbs m19207b = m19207b(zzdgwVar.m19426x(), null);
            if (!f25475c.get(zzdgwVar.m19426x()).booleanValue()) {
                String valueOf = String.valueOf(zzdgwVar.m19426x());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
            mo19183f = m19207b.mo19183f(zzdgwVar.m19427y());
        }
        return mo19183f;
    }

    /* renamed from: o */
    public static zzdbk<?> m19220o(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzdbk<?> zzdbkVar = f25476d.get(str.toLowerCase());
        if (zzdbkVar != null) {
            return zzdbkVar;
        }
        String format = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase().startsWith("tinkaead")) {
            format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
            format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
            format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkmac")) {
            format = String.valueOf(format).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
            format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase().startsWith("tink")) {
            format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(format);
    }
}
