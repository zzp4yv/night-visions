package kotlin.reflect.p371y.internal.p374j0.p392e;

import kotlin.reflect.jvm.internal.impl.protobuf.C10717i;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.x */
/* loaded from: classes3.dex */
public enum EnumC10112x implements C10717i.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);


    /* renamed from: l */
    private static C10717i.b<EnumC10112x> f39165l = new C10717i.b<EnumC10112x>() { // from class: kotlin.f0.y.e.j0.e.x.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC10112x mo34236a(int i2) {
            return EnumC10112x.m35352g(i2);
        }
    };

    /* renamed from: n */
    private final int f39167n;

    EnumC10112x(int i2, int i3) {
        this.f39167n = i3;
    }

    /* renamed from: g */
    public static EnumC10112x m35352g(int i2) {
        if (i2 == 0) {
            return INTERNAL;
        }
        if (i2 == 1) {
            return PRIVATE;
        }
        if (i2 == 2) {
            return PROTECTED;
        }
        if (i2 == 3) {
            return PUBLIC;
        }
        if (i2 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i2 != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10717i.a
    /* renamed from: f */
    public final int mo34235f() {
        return this.f39167n;
    }
}
