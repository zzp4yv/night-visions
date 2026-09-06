package kotlin.reflect.p371y.internal.p374j0.p399h;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.C10749c0;
import kotlin.collections.C10770n;
import kotlin.jvm.internal.C9756g;

/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.f0.y.e.j0.h.e */
/* loaded from: classes3.dex */
public enum EnumC10141e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* renamed from: f */
    public static final a f39407f = new a(null);

    /* renamed from: g */
    public static final Set<EnumC10141e> f39408g;

    /* renamed from: h */
    public static final Set<EnumC10141e> f39409h;

    /* renamed from: x */
    private final boolean f39425x;

    /* compiled from: DescriptorRenderer.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    static {
        Set<EnumC10141e> m38574I0;
        Set<EnumC10141e> m38758l0;
        EnumC10141e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC10141e enumC10141e : values) {
            if (enumC10141e.f39425x) {
                arrayList.add(enumC10141e);
            }
        }
        m38574I0 = C10749c0.m38574I0(arrayList);
        f39408g = m38574I0;
        m38758l0 = C10770n.m38758l0(values());
        f39409h = m38758l0;
    }

    EnumC10141e(boolean z) {
        this.f39425x = z;
    }
}
