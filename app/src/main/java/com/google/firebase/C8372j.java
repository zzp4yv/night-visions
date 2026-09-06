package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.os.C0276e;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8094q;
import com.google.firebase.components.C8097t;
import com.google.firebase.components.C8101x;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.EnumC8105a0;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.p203q.InterfaceC8448c;
import com.google.firebase.p204r.C8455f;
import com.google.firebase.p205s.InterfaceC8463b;
import com.google.firebase.p208t.C8514a;
import com.google.firebase.p213w.C8527b;
import com.google.firebase.p213w.C8528c;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p024c.p041e.C0867a;

/* compiled from: FirebaseApp.java */
/* renamed from: com.google.firebase.j */
/* loaded from: classes.dex */
public class C8372j {

    /* renamed from: a */
    private static final Object f31879a = new Object();

    /* renamed from: b */
    static final Map<String, C8372j> f31880b = new C0867a();

    /* renamed from: c */
    private final Context f31881c;

    /* renamed from: d */
    private final String f31882d;

    /* renamed from: e */
    private final C8379m f31883e;

    /* renamed from: f */
    private final C8097t f31884f;

    /* renamed from: i */
    private final C8101x<C8514a> f31887i;

    /* renamed from: j */
    private final InterfaceC8463b<C8455f> f31888j;

    /* renamed from: g */
    private final AtomicBoolean f31885g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f31886h = new AtomicBoolean();

    /* renamed from: k */
    private final List<a> f31889k = new CopyOnWriteArrayList();

    /* renamed from: l */
    private final List<InterfaceC8373k> f31890l = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    /* renamed from: com.google.firebase.j$a */
    /* loaded from: classes2.dex */
    public interface a {
        @KeepForSdk
        /* renamed from: a */
        void mo24947a(boolean z);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* renamed from: com.google.firebase.j$b */
    /* loaded from: classes2.dex */
    private static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        private static AtomicReference<b> f31891a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m26413c(Context context) {
            if (PlatformVersion.m14637a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f31891a.get() == null) {
                    b bVar = new b();
                    if (f31891a.compareAndSet(null, bVar)) {
                        BackgroundDetector.m13922c(application);
                        BackgroundDetector.m13921b().m13924a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        /* renamed from: a */
        public void mo13927a(boolean z) {
            synchronized (C8372j.f31879a) {
                Iterator it = new ArrayList(C8372j.f31880b.values()).iterator();
                while (it.hasNext()) {
                    C8372j c8372j = (C8372j) it.next();
                    if (c8372j.f31885g.get()) {
                        c8372j.m26400y(z);
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* renamed from: com.google.firebase.j$c */
    /* loaded from: classes2.dex */
    private static class c extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<c> f31892a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f31893b;

        public c(Context context) {
            this.f31893b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m26415b(Context context) {
            if (f31892a.get() == null) {
                c cVar = new c(context);
                if (f31892a.compareAndSet(null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m26416c() {
            this.f31893b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C8372j.f31879a) {
                Iterator<C8372j> it = C8372j.f31880b.values().iterator();
                while (it.hasNext()) {
                    it.next().m26393n();
                }
            }
            m26416c();
        }
    }

    protected C8372j(final Context context, String str, C8379m c8379m) {
        this.f31881c = (Context) Preconditions.m14372k(context);
        this.f31882d = Preconditions.m14368g(str);
        this.f31883e = (C8379m) Preconditions.m14372k(c8379m);
        AbstractC8440n m26676b = FirebaseInitProvider.m26676b();
        C8528c.m26909b("Firebase");
        C8528c.m26909b("ComponentDiscovery");
        List<InterfaceC8463b<ComponentRegistrar>> m25021a = C8094q.m25018b(context, ComponentDiscoveryService.class).m25021a();
        C8528c.m26908a();
        C8528c.m26909b("Runtime");
        C8097t.b m25043f = C8097t.m25025j(EnumC8105a0.INSTANCE).m25041c(m25021a).m25040b(new FirebaseCommonRegistrar()).m25040b(new ExecutorsRegistrar()).m25039a(C8091n.m24992q(context, Context.class, new Class[0])).m25039a(C8091n.m24992q(this, C8372j.class, new Class[0])).m25039a(C8091n.m24992q(c8379m, C8379m.class, new Class[0])).m25043f(new C8527b());
        if (C0276e.m1842a(context) && FirebaseInitProvider.m26677c()) {
            m25043f.m25039a(C8091n.m24992q(m26676b, AbstractC8440n.class, new Class[0]));
        }
        C8097t m25042d = m25043f.m25042d();
        this.f31884f = m25042d;
        C8528c.m26908a();
        this.f31887i = new C8101x<>(new InterfaceC8463b() { // from class: com.google.firebase.b
            @Override // com.google.firebase.p205s.InterfaceC8463b
            public final Object get() {
                return C8372j.this.m26410u(context);
            }
        });
        this.f31888j = m25042d.mo24975c(C8455f.class);
        m26401e(new a() { // from class: com.google.firebase.a
            @Override // com.google.firebase.C8372j.a
            /* renamed from: a */
            public final void mo24947a(boolean z) {
                C8372j.this.m26411w(z);
            }
        });
        C8528c.m26908a();
    }

    /* renamed from: g */
    private void m26391g() {
        Preconditions.m14376o(!this.f31886h.get(), "FirebaseApp was deleted");
    }

    /* renamed from: j */
    public static C8372j m26392j() {
        C8372j c8372j;
        synchronized (f31879a) {
            c8372j = f31880b.get("[DEFAULT]");
            if (c8372j == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.m14653a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            c8372j.f31888j.get().m26691j();
        }
        return c8372j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m26393n() {
        if (!C0276e.m1842a(this.f31881c)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m26405k());
            c.m26415b(this.f31881c);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m26405k());
        this.f31884f.m25036m(m26409s());
        this.f31888j.get().m26691j();
    }

    /* renamed from: o */
    public static C8372j m26394o(Context context) {
        synchronized (f31879a) {
            if (f31880b.containsKey("[DEFAULT]")) {
                return m26392j();
            }
            C8379m m26422a = C8379m.m26422a(context);
            if (m26422a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m26395p(context, m26422a);
        }
    }

    /* renamed from: p */
    public static C8372j m26395p(Context context, C8379m c8379m) {
        return m26396q(context, c8379m, "[DEFAULT]");
    }

    /* renamed from: q */
    public static C8372j m26396q(Context context, C8379m c8379m, String str) {
        C8372j c8372j;
        b.m26413c(context);
        String m26399x = m26399x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f31879a) {
            Map<String, C8372j> map = f31880b;
            Preconditions.m14376o(!map.containsKey(m26399x), "FirebaseApp name " + m26399x + " already exists!");
            Preconditions.m14373l(context, "Application context cannot be null.");
            c8372j = new C8372j(context, m26399x, c8379m);
            map.put(m26399x, c8372j);
        }
        c8372j.m26393n();
        return c8372j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C8514a m26410u(Context context) {
        return new C8514a(context, m26407m(), (InterfaceC8448c) this.f31884f.mo24973a(InterfaceC8448c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m26411w(boolean z) {
        if (z) {
            return;
        }
        this.f31888j.get().m26691j();
    }

    /* renamed from: x */
    private static String m26399x(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m26400y(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f31889k.iterator();
        while (it.hasNext()) {
            it.next().mo24947a(z);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m26401e(a aVar) {
        m26391g();
        if (this.f31885g.get() && BackgroundDetector.m13921b().m13925d()) {
            aVar.mo24947a(true);
        }
        this.f31889k.add(aVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8372j) {
            return this.f31882d.equals(((C8372j) obj).m26405k());
        }
        return false;
    }

    @KeepForSdk
    /* renamed from: f */
    public void m26402f(InterfaceC8373k interfaceC8373k) {
        m26391g();
        Preconditions.m14372k(interfaceC8373k);
        this.f31890l.add(interfaceC8373k);
    }

    @KeepForSdk
    /* renamed from: h */
    public <T> T m26403h(Class<T> cls) {
        m26391g();
        return (T) this.f31884f.mo24973a(cls);
    }

    public int hashCode() {
        return this.f31882d.hashCode();
    }

    /* renamed from: i */
    public Context m26404i() {
        m26391g();
        return this.f31881c;
    }

    /* renamed from: k */
    public String m26405k() {
        m26391g();
        return this.f31882d;
    }

    /* renamed from: l */
    public C8379m m26406l() {
        m26391g();
        return this.f31883e;
    }

    @KeepForSdk
    /* renamed from: m */
    public String m26407m() {
        return Base64Utils.m14604c(m26405k().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.m14604c(m26406l().m26424c().getBytes(Charset.defaultCharset()));
    }

    @KeepForSdk
    /* renamed from: r */
    public boolean m26408r() {
        m26391g();
        return this.f31887i.get().m26892b();
    }

    @KeepForSdk
    /* renamed from: s */
    public boolean m26409s() {
        return "[DEFAULT]".equals(m26405k());
    }

    public String toString() {
        return Objects.m14357c(this).m14358a("name", this.f31882d).m14358a("options", this.f31883e).toString();
    }
}
