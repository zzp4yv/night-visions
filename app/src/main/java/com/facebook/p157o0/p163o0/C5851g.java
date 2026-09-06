package com.facebook.p157o0.p163o0;

import android.content.Context;
import com.facebook.p157o0.p163o0.C5852h;
import kotlin.jvm.internal.C9768m;

/* compiled from: InAppPurchaseAutoLogger.kt */
/* renamed from: com.facebook.o0.o0.g */
/* loaded from: classes2.dex */
public final class C5851g {

    /* renamed from: a */
    public static final C5851g f15284a = new C5851g();

    private C5851g() {
    }

    /* renamed from: c */
    private final void m12508c() {
        C5854j c5854j = C5854j.f15319a;
        C5852h.b bVar = C5852h.f15285a;
        C5854j.m12558e(bVar.m12535d(), bVar.m12536e());
        bVar.m12535d().clear();
    }

    /* renamed from: d */
    public static final void m12509d(Context context) {
        C5852h.b bVar;
        C5852h m12534c;
        C9768m.m32346f(context, "context");
        C5857m c5857m = C5857m.f15334a;
        if (C5857m.m12574a("com.android.billingclient.api.Purchase") == null || (m12534c = (bVar = C5852h.f15285a).m12534c(context)) == null || !bVar.m12537f().get()) {
            return;
        }
        C5854j c5854j = C5854j.f15319a;
        if (C5854j.m12557d()) {
            m12534c.m12531p("inapp", new Runnable() { // from class: com.facebook.o0.o0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5851g.m12510e();
                }
            });
        } else {
            m12534c.m12530o("inapp", new Runnable() { // from class: com.facebook.o0.o0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5851g.m12511f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m12510e() {
        f15284a.m12508c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12511f() {
        f15284a.m12508c();
    }
}
