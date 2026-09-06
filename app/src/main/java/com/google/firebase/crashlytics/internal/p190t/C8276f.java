package com.google.firebase.crashlytics.internal.p190t;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p183n.C8168e0;
import com.google.firebase.crashlytics.internal.p183n.C8176i0;
import com.google.firebase.crashlytics.internal.p183n.C8190p0;
import com.google.firebase.crashlytics.internal.p183n.C8195t;
import com.google.firebase.crashlytics.internal.p183n.EnumC8170f0;
import com.google.firebase.crashlytics.internal.p183n.InterfaceC8166d0;
import com.google.firebase.crashlytics.internal.p187q.C8258b;
import com.google.firebase.crashlytics.internal.p188r.C8265f;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* renamed from: com.google.firebase.crashlytics.h.t.f */
/* loaded from: classes2.dex */
public class C8276f implements InterfaceC8279i {

    /* renamed from: a */
    private final Context f31611a;

    /* renamed from: b */
    private final C8280j f31612b;

    /* renamed from: c */
    private final C8277g f31613c;

    /* renamed from: d */
    private final InterfaceC8166d0 f31614d;

    /* renamed from: e */
    private final C8271a f31615e;

    /* renamed from: f */
    private final InterfaceC8281k f31616f;

    /* renamed from: g */
    private final C8168e0 f31617g;

    /* renamed from: h */
    private final AtomicReference<C8274d> f31618h;

    /* renamed from: i */
    private final AtomicReference<TaskCompletionSource<C8274d>> f31619i;

    /* compiled from: SettingsController.java */
    /* renamed from: com.google.firebase.crashlytics.h.t.f$a */
    class a implements SuccessContinuation<Void, Void> {
        a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task<Void> mo13778a(Void r5) throws Exception {
            JSONObject mo26041a = C8276f.this.f31616f.mo26041a(C8276f.this.f31612b, true);
            if (mo26041a != null) {
                C8274d m26066b = C8276f.this.f31613c.m26066b(mo26041a);
                C8276f.this.f31615e.m26034c(m26066b.f31596c, mo26041a);
                C8276f.this.m26057q(mo26041a, "Loaded settings: ");
                C8276f c8276f = C8276f.this;
                c8276f.m26058r(c8276f.f31612b.f31627f);
                C8276f.this.f31618h.set(m26066b);
                ((TaskCompletionSource) C8276f.this.f31619i.get()).m23658e(m26066b);
            }
            return Tasks.m23663e(null);
        }
    }

    C8276f(Context context, C8280j c8280j, InterfaceC8166d0 interfaceC8166d0, C8277g c8277g, C8271a c8271a, InterfaceC8281k interfaceC8281k, C8168e0 c8168e0) {
        AtomicReference<C8274d> atomicReference = new AtomicReference<>();
        this.f31618h = atomicReference;
        this.f31619i = new AtomicReference<>(new TaskCompletionSource());
        this.f31611a = context;
        this.f31612b = c8280j;
        this.f31614d = interfaceC8166d0;
        this.f31613c = c8277g;
        this.f31615e = c8271a;
        this.f31616f = interfaceC8281k;
        this.f31617g = c8168e0;
        atomicReference.set(C8272b.m26035b(interfaceC8166d0));
    }

    /* renamed from: l */
    public static C8276f m26054l(Context context, String str, C8176i0 c8176i0, C8258b c8258b, String str2, String str3, C8265f c8265f, C8168e0 c8168e0) {
        String m25264g = c8176i0.m25264g();
        C8190p0 c8190p0 = new C8190p0();
        return new C8276f(context, new C8280j(str, c8176i0.m25265h(), c8176i0.m25266i(), c8176i0.m25267j(), c8176i0, C8195t.m25337h(C8195t.m25342m(context), str, str3, str2), str3, str2, EnumC8170f0.m25242g(m25264g).m25243k()), c8190p0, new C8277g(c8190p0), new C8271a(c8265f), new C8273c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), c8258b), c8168e0);
    }

    /* renamed from: m */
    private C8274d m26055m(EnumC8275e enumC8275e) {
        C8274d c8274d = null;
        try {
            if (!EnumC8275e.SKIP_CACHE_LOOKUP.equals(enumC8275e)) {
                JSONObject m26033b = this.f31615e.m26033b();
                if (m26033b != null) {
                    C8274d m26066b = this.f31613c.m26066b(m26033b);
                    if (m26066b != null) {
                        m26057q(m26033b, "Loaded cached settings: ");
                        long mo25232a = this.f31614d.mo25232a();
                        if (!EnumC8275e.IGNORE_CACHE_EXPIRATION.equals(enumC8275e) && m26066b.m26045a(mo25232a)) {
                            C8146h.m25176f().m25183i("Cached settings have expired.");
                        }
                        try {
                            C8146h.m25176f().m25183i("Returning cached settings.");
                            c8274d = m26066b;
                        } catch (Exception e2) {
                            e = e2;
                            c8274d = m26066b;
                            C8146h.m25176f().m25180e("Failed to get cached settings", e);
                            return c8274d;
                        }
                    } else {
                        C8146h.m25176f().m25180e("Failed to parse cached settings data.", null);
                    }
                } else {
                    C8146h.m25176f().m25177b("No cached settings data found.");
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        return c8274d;
    }

    /* renamed from: n */
    private String m26056n() {
        return C8195t.m25346q(this.f31611a).getString("existing_instance_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m26057q(JSONObject jSONObject, String str) throws JSONException {
        C8146h.m25176f().m25177b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public boolean m26058r(String str) {
        SharedPreferences.Editor edit = C8195t.m25346q(this.f31611a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8279i
    /* renamed from: a */
    public Task<C8274d> mo26059a() {
        return this.f31619i.get().m23654a();
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8279i
    /* renamed from: b */
    public C8274d mo26060b() {
        return this.f31618h.get();
    }

    /* renamed from: k */
    boolean m26061k() {
        return !m26056n().equals(this.f31612b.f31627f);
    }

    /* renamed from: o */
    public Task<Void> m26062o(EnumC8275e enumC8275e, Executor executor) {
        C8274d m26055m;
        if (!m26061k() && (m26055m = m26055m(enumC8275e)) != null) {
            this.f31618h.set(m26055m);
            this.f31619i.get().m23658e(m26055m);
            return Tasks.m23663e(null);
        }
        C8274d m26055m2 = m26055m(EnumC8275e.IGNORE_CACHE_EXPIRATION);
        if (m26055m2 != null) {
            this.f31618h.set(m26055m2);
            this.f31619i.get().m23658e(m26055m2);
        }
        return this.f31617g.m25241i(executor).mo23653p(executor, new a());
    }

    /* renamed from: p */
    public Task<Void> m26063p(Executor executor) {
        return m26062o(EnumC8275e.USE_CACHE, executor);
    }
}
