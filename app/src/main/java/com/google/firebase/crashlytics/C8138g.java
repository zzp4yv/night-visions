package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.C8372j;
import com.google.firebase.analytics.p179a.InterfaceC8062a;
import com.google.firebase.crashlytics.internal.C8143e;
import com.google.firebase.crashlytics.internal.C8145g;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.C8149k;
import com.google.firebase.crashlytics.internal.InterfaceC8142d;
import com.google.firebase.crashlytics.internal.p183n.C8168e0;
import com.google.firebase.crashlytics.internal.p183n.C8172g0;
import com.google.firebase.crashlytics.internal.p183n.C8176i0;
import com.google.firebase.crashlytics.internal.p183n.C8181l;
import com.google.firebase.crashlytics.internal.p183n.C8191q;
import com.google.firebase.crashlytics.internal.p183n.C8195t;
import com.google.firebase.crashlytics.internal.p183n.C8197v;
import com.google.firebase.crashlytics.internal.p183n.C8200y;
import com.google.firebase.crashlytics.internal.p187q.C8258b;
import com.google.firebase.crashlytics.internal.p188r.C8265f;
import com.google.firebase.crashlytics.internal.p190t.C8276f;
import com.google.firebase.installations.InterfaceC8352i;
import com.google.firebase.p205s.InterfaceC8462a;
import com.google.firebase.p210v.p211a.InterfaceC8524a;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: FirebaseCrashlytics.java */
/* renamed from: com.google.firebase.crashlytics.g */
/* loaded from: classes2.dex */
public class C8138g {

    /* renamed from: a */
    final C8200y f30841a;

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.g$a */
    class a implements Continuation<Void, Object> {
        a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a */
        public Object mo13777a(Task<Void> task) throws Exception {
            if (task.mo23651n()) {
                return null;
            }
            C8146h.m25176f().m25180e("Error fetching settings.", task.mo23646i());
            return null;
        }
    }

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.g$b */
    class b implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ boolean f30842f;

        /* renamed from: g */
        final /* synthetic */ C8200y f30843g;

        /* renamed from: h */
        final /* synthetic */ C8276f f30844h;

        b(boolean z, C8200y c8200y, C8276f c8276f) {
            this.f30842f = z;
            this.f30843g = c8200y;
            this.f30844h = c8276f;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            if (!this.f30842f) {
                return null;
            }
            this.f30843g.m25445g(this.f30844h);
            return null;
        }
    }

    private C8138g(C8200y c8200y) {
        this.f30841a = c8200y;
    }

    /* renamed from: a */
    static C8138g m25151a(C8372j c8372j, InterfaceC8352i interfaceC8352i, InterfaceC8462a<InterfaceC8142d> interfaceC8462a, InterfaceC8462a<InterfaceC8062a> interfaceC8462a2, InterfaceC8462a<InterfaceC8524a> interfaceC8462a3) {
        Context m26404i = c8372j.m26404i();
        String packageName = m26404i.getPackageName();
        C8146h.m25176f().m25181g("Initializing Firebase Crashlytics " + C8200y.m25442i() + " for " + packageName);
        C8265f c8265f = new C8265f(m26404i);
        C8168e0 c8168e0 = new C8168e0(c8372j);
        C8176i0 c8176i0 = new C8176i0(m26404i, packageName, interfaceC8352i, c8168e0);
        C8143e c8143e = new C8143e(interfaceC8462a);
        C8136e c8136e = new C8136e(interfaceC8462a2);
        ExecutorService m25246c = C8172g0.m25246c("Crashlytics Exception Handler");
        C8197v c8197v = new C8197v(c8168e0, c8265f);
        FirebaseSessionsDependencies.m26791e(c8197v);
        C8200y c8200y = new C8200y(c8372j, c8176i0, c8143e, c8168e0, c8136e.m25143b(), c8136e.m25142a(), c8265f, m25246c, c8197v, new C8149k(interfaceC8462a3));
        String m26424c = c8372j.m26406l().m26424c();
        String m25342m = C8195t.m25342m(m26404i);
        List<C8191q> m25339j = C8195t.m25339j(m26404i);
        C8146h.m25176f().m25177b("Mapping file ID is: " + m25342m);
        for (C8191q c8191q : m25339j) {
            C8146h.m25176f().m25177b(String.format("Build id for %s on %s: %s", c8191q.m25311c(), c8191q.m25309a(), c8191q.m25310b()));
        }
        try {
            C8181l m25274a = C8181l.m25274a(m26404i, c8176i0, m26424c, m25342m, m25339j, new C8145g(m26404i));
            C8146h.m25176f().m25183i("Installer package name is: " + m25274a.f30936d);
            ExecutorService m25246c2 = C8172g0.m25246c("com.google.firebase.crashlytics.startup");
            C8276f m26054l = C8276f.m26054l(m26404i, m26424c, c8176i0, new C8258b(), m25274a.f30938f, m25274a.f30939g, c8265f, c8168e0);
            m26054l.m26063p(m25246c2).mo23644g(m25246c2, new a());
            Tasks.m23661c(m25246c2, new b(c8200y.m25449n(m25274a, m26054l), c8200y, m26054l));
            return new C8138g(c8200y);
        } catch (PackageManager.NameNotFoundException e2) {
            C8146h.m25176f().m25180e("Error retrieving app package info.", e2);
            return null;
        }
    }
}
