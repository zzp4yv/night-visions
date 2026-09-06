package com.facebook.login;

import java.util.Arrays;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: LoginTargetApp.kt */
/* renamed from: com.facebook.login.z */
/* loaded from: classes2.dex */
public enum EnumC5773z {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* renamed from: f */
    public static final a f14878f = new a(null);

    /* renamed from: j */
    private final String f14882j;

    /* compiled from: LoginTargetApp.kt */
    /* renamed from: com.facebook.login.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final EnumC5773z m12132a(String str) {
            EnumC5773z[] valuesCustom = EnumC5773z.valuesCustom();
            int length = valuesCustom.length;
            int i2 = 0;
            while (i2 < length) {
                EnumC5773z enumC5773z = valuesCustom[i2];
                i2++;
                if (C9768m.m32341a(enumC5773z.toString(), str)) {
                    return enumC5773z;
                }
            }
            return EnumC5773z.FACEBOOK;
        }
    }

    EnumC5773z(String str) {
        this.f14882j = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5773z[] valuesCustom() {
        EnumC5773z[] valuesCustom = values();
        return (EnumC5773z[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14882j;
    }
}
