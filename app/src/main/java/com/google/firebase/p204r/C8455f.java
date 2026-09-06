package com.google.firebase.p204r;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.C0276e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8372j;
import com.google.firebase.components.C8078b0;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;
import com.google.firebase.p200o.p201a.InterfaceC8441a;
import com.google.firebase.p204r.InterfaceC8459j;
import com.google.firebase.p205s.InterfaceC8463b;
import com.google.firebase.p209u.InterfaceC8523i;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DefaultHeartBeatController.java */
/* renamed from: com.google.firebase.r.f */
/* loaded from: classes2.dex */
public class C8455f implements InterfaceC8458i, InterfaceC8459j {

    /* renamed from: a */
    private final InterfaceC8463b<C8460k> f32104a;

    /* renamed from: b */
    private final Context f32105b;

    /* renamed from: c */
    private final InterfaceC8463b<InterfaceC8523i> f32106c;

    /* renamed from: d */
    private final Set<InterfaceC8456g> f32107d;

    /* renamed from: e */
    private final Executor f32108e;

    private C8455f(final Context context, final String str, Set<InterfaceC8456g> set, InterfaceC8463b<InterfaceC8523i> interfaceC8463b, Executor executor) {
        this((InterfaceC8463b<C8460k>) new InterfaceC8463b() { // from class: com.google.firebase.r.c
            @Override // com.google.firebase.p205s.InterfaceC8463b
            public final Object get() {
                return C8455f.m26685g(context, str);
            }
        }, set, executor, interfaceC8463b, context);
    }

    /* renamed from: c */
    public static C8091n<C8455f> m26682c() {
        final C8078b0 m24971a = C8078b0.m24971a(InterfaceC8441a.class, Executor.class);
        return C8091n.m24987d(C8455f.class, InterfaceC8458i.class, InterfaceC8459j.class).m25006b(C8099v.m25060k(Context.class)).m25006b(C8099v.m25060k(C8372j.class)).m25006b(C8099v.m25063n(InterfaceC8456g.class)).m25006b(C8099v.m25062m(InterfaceC8523i.class)).m25006b(C8099v.m25059j(m24971a)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.r.d
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                return C8455f.m26683d(C8078b0.this, interfaceC8093p);
            }
        }).m25008d();
    }

    /* renamed from: d */
    static /* synthetic */ C8455f m26683d(C8078b0 c8078b0, InterfaceC8093p interfaceC8093p) {
        return new C8455f((Context) interfaceC8093p.mo24973a(Context.class), ((C8372j) interfaceC8093p.mo24973a(C8372j.class)).m26407m(), (Set<InterfaceC8456g>) interfaceC8093p.mo24979g(InterfaceC8456g.class), (InterfaceC8463b<InterfaceC8523i>) interfaceC8093p.mo24975c(InterfaceC8523i.class), (Executor) interfaceC8093p.mo24978f(c8078b0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m26689f() throws Exception {
        String byteArrayOutputStream;
        synchronized (this) {
            C8460k c8460k = this.f32104a.get();
            List<AbstractC8461l> m26700c = c8460k.m26700c();
            c8460k.m26699b();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < m26700c.size(); i2++) {
                AbstractC8461l abstractC8461l = m26700c.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", abstractC8461l.mo26681c());
                jSONObject.put("dates", new JSONArray((Collection) abstractC8461l.mo26680b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    base64OutputStream.close();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    /* renamed from: g */
    static /* synthetic */ C8460k m26685g(Context context, String str) {
        return new C8460k(context, str);
    }

    /* renamed from: h */
    private /* synthetic */ Void m26686h() throws Exception {
        synchronized (this) {
            this.f32104a.get().m26705k(System.currentTimeMillis(), this.f32106c.get().mo26898a());
        }
        return null;
    }

    @Override // com.google.firebase.p204r.InterfaceC8458i
    /* renamed from: a */
    public Task<String> mo26687a() {
        return C0276e.m1842a(this.f32105b) ^ true ? Tasks.m23663e(HttpUrl.FRAGMENT_ENCODE_SET) : Tasks.m23661c(this.f32108e, new Callable() { // from class: com.google.firebase.r.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C8455f.this.m26689f();
            }
        });
    }

    @Override // com.google.firebase.p204r.InterfaceC8459j
    /* renamed from: b */
    public synchronized InterfaceC8459j.a mo26688b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C8460k c8460k = this.f32104a.get();
        if (!c8460k.m26703i(currentTimeMillis)) {
            return InterfaceC8459j.a.NONE;
        }
        c8460k.m26702g();
        return InterfaceC8459j.a.GLOBAL;
    }

    /* renamed from: i */
    public /* synthetic */ Void m26690i() {
        m26686h();
        return null;
    }

    /* renamed from: j */
    public Task<Void> m26691j() {
        return this.f32107d.size() <= 0 ? Tasks.m23663e(null) : C0276e.m1842a(this.f32105b) ^ true ? Tasks.m23663e(null) : Tasks.m23661c(this.f32108e, new Callable() { // from class: com.google.firebase.r.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C8455f.this.m26690i();
                return null;
            }
        });
    }

    C8455f(InterfaceC8463b<C8460k> interfaceC8463b, Set<InterfaceC8456g> set, Executor executor, InterfaceC8463b<InterfaceC8523i> interfaceC8463b2, Context context) {
        this.f32104a = interfaceC8463b;
        this.f32107d = set;
        this.f32108e = executor;
        this.f32106c = interfaceC8463b2;
        this.f32105b = context;
    }
}
