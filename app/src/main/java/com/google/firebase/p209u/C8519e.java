package com.google.firebase.p209u;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: GlobalLibraryVersionRegistrar.java */
/* renamed from: com.google.firebase.u.e */
/* loaded from: classes2.dex */
public class C8519e {

    /* renamed from: a */
    private static volatile C8519e f32409a;

    /* renamed from: b */
    private final Set<AbstractC8521g> f32410b = new HashSet();

    C8519e() {
    }

    /* renamed from: a */
    public static C8519e m26899a() {
        C8519e c8519e = f32409a;
        if (c8519e == null) {
            synchronized (C8519e.class) {
                c8519e = f32409a;
                if (c8519e == null) {
                    c8519e = new C8519e();
                    f32409a = c8519e;
                }
            }
        }
        return c8519e;
    }

    /* renamed from: b */
    Set<AbstractC8521g> m26900b() {
        Set<AbstractC8521g> unmodifiableSet;
        synchronized (this.f32410b) {
            unmodifiableSet = Collections.unmodifiableSet(this.f32410b);
        }
        return unmodifiableSet;
    }
}
