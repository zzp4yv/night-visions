package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* renamed from: com.google.gson.p */
/* loaded from: classes2.dex */
public abstract class EnumC8544p {

    /* renamed from: f */
    public static final EnumC8544p f32453f;

    /* renamed from: g */
    public static final EnumC8544p f32454g;

    /* renamed from: h */
    private static final /* synthetic */ EnumC8544p[] f32455h;

    /* compiled from: LongSerializationPolicy.java */
    /* renamed from: com.google.gson.p$a */
    enum a extends EnumC8544p {
        a(String str, int i2) {
            super(str, i2, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f32453f = aVar;
        EnumC8544p enumC8544p = new EnumC8544p("STRING", 1) { // from class: com.google.gson.p.b
            {
                a aVar2 = null;
            }
        };
        f32454g = enumC8544p;
        f32455h = new EnumC8544p[]{aVar, enumC8544p};
    }

    private EnumC8544p(String str, int i2) {
    }

    public static EnumC8544p valueOf(String str) {
        return (EnumC8544p) Enum.valueOf(EnumC8544p.class, str);
    }

    public static EnumC8544p[] values() {
        return (EnumC8544p[]) f32455h.clone();
    }

    /* synthetic */ EnumC8544p(String str, int i2, a aVar) {
        this(str, i2);
    }
}
