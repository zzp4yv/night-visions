package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: SmartLoginOption.kt */
/* renamed from: com.facebook.internal.o0 */
/* loaded from: classes2.dex */
public enum EnumC5661o0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* renamed from: f */
    public static final a f14470f = new a(null);

    /* renamed from: g */
    private static final EnumSet<EnumC5661o0> f14471g;

    /* renamed from: l */
    private final long f14476l;

    /* compiled from: SmartLoginOption.kt */
    /* renamed from: com.facebook.internal.o0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final EnumSet<EnumC5661o0> m11524a(long j2) {
            EnumSet<EnumC5661o0> noneOf = EnumSet.noneOf(EnumC5661o0.class);
            Iterator it = EnumC5661o0.f14471g.iterator();
            while (it.hasNext()) {
                EnumC5661o0 enumC5661o0 = (EnumC5661o0) it.next();
                if ((enumC5661o0.m11523q() & j2) != 0) {
                    noneOf.add(enumC5661o0);
                }
            }
            C9768m.m32345e(noneOf, "result");
            return noneOf;
        }
    }

    static {
        EnumSet<EnumC5661o0> allOf = EnumSet.allOf(EnumC5661o0.class);
        C9768m.m32345e(allOf, "allOf(SmartLoginOption::class.java)");
        f14471g = allOf;
    }

    EnumC5661o0(long j2) {
        this.f14476l = j2;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5661o0[] valuesCustom() {
        EnumC5661o0[] valuesCustom = values();
        return (EnumC5661o0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* renamed from: q */
    public final long m11523q() {
        return this.f14476l;
    }
}
