package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.EnumMap;
import kotlin.jvm.internal.C9768m;

/* compiled from: JavaTypeQualifiersByElementType.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.x */
/* loaded from: classes2.dex */
public final class C10045x {

    /* renamed from: a */
    private final EnumMap<EnumC9913b, C10038q> f38322a;

    public C10045x(EnumMap<EnumC9913b, C10038q> enumMap) {
        C9768m.m32346f(enumMap, "defaultQualifiers");
        this.f38322a = enumMap;
    }

    /* renamed from: a */
    public final C10038q m33822a(EnumC9913b enumC9913b) {
        return this.f38322a.get(enumC9913b);
    }

    /* renamed from: b */
    public final EnumMap<EnumC9913b, C10038q> m33823b() {
        return this.f38322a;
    }
}
