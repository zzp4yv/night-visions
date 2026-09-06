package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xu */
/* loaded from: classes2.dex */
final class C7319xu {

    /* renamed from: a */
    private static final AbstractC7245vu<?> f20983a = new C7282wu();

    /* renamed from: b */
    private static final AbstractC7245vu<?> f20984b = m16046a();

    /* renamed from: a */
    private static AbstractC7245vu<?> m16046a() {
        try {
            return (AbstractC7245vu) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static AbstractC7245vu<?> m16047b() {
        return f20983a;
    }

    /* renamed from: c */
    static AbstractC7245vu<?> m16048c() {
        AbstractC7245vu<?> abstractC7245vu = f20984b;
        if (abstractC7245vu != null) {
            return abstractC7245vu;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
