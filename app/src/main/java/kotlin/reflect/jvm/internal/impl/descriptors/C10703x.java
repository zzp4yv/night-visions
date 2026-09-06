package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9760i;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.sequences.C10487l;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: findClassInModule.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x */
/* loaded from: classes2.dex */
public final class C10703x {

    /* compiled from: findClassInModule.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x$a */
    /* synthetic */ class a extends C9760i implements Function1<C10126b, C10126b> {

        /* renamed from: h */
        public static final a f41234h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final KDeclarationContainer getOwner() {
            return C9757g0.m32298b(C10126b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC9748c
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final C10126b invoke(C10126b c10126b) {
            C9768m.m32346f(c10126b, "p0");
            return c10126b.m35412g();
        }
    }

    /* compiled from: findClassInModule.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x$b */
    static final class b extends Lambda implements Function1<C10126b, Integer> {

        /* renamed from: f */
        public static final b f41235f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C10126b c10126b) {
            C9768m.m32346f(c10126b, "it");
            return 0;
        }
    }

    /* renamed from: a */
    public static final InterfaceC10552e m38149a(InterfaceC10559g0 interfaceC10559g0, C10126b c10126b) {
        C9768m.m32346f(interfaceC10559g0, "<this>");
        C9768m.m32346f(c10126b, "classId");
        InterfaceC10561h m38150b = m38150b(interfaceC10559g0, c10126b);
        if (m38150b instanceof InterfaceC10552e) {
            return (InterfaceC10552e) m38150b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h m38150b(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0 r10, kotlin.reflect.p371y.internal.p374j0.p397f.C10126b r11) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C10703x.m38150b(kotlin.reflect.jvm.internal.impl.descriptors.g0, kotlin.f0.y.e.j0.f.b):kotlin.reflect.jvm.internal.impl.descriptors.h");
    }

    /* renamed from: c */
    public static final InterfaceC10552e m38151c(InterfaceC10559g0 interfaceC10559g0, C10126b c10126b, C10568j0 c10568j0) {
        Sequence m37373f;
        Sequence m37391u;
        List<Integer> m37377A;
        C9768m.m32346f(interfaceC10559g0, "<this>");
        C9768m.m32346f(c10126b, "classId");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        InterfaceC10552e m38149a = m38149a(interfaceC10559g0, c10126b);
        if (m38149a != null) {
            return m38149a;
        }
        m37373f = C10487l.m37373f(c10126b, a.f41234h);
        m37391u = C10489n.m37391u(m37373f, b.f41235f);
        m37377A = C10489n.m37377A(m37391u);
        return c10568j0.m37703d(c10126b, m37377A);
    }

    /* renamed from: d */
    public static final InterfaceC10551d1 m38152d(InterfaceC10559g0 interfaceC10559g0, C10126b c10126b) {
        C9768m.m32346f(interfaceC10559g0, "<this>");
        C9768m.m32346f(c10126b, "classId");
        InterfaceC10561h m38150b = m38150b(interfaceC10559g0, c10126b);
        if (m38150b instanceof InterfaceC10551d1) {
            return (InterfaceC10551d1) m38150b;
        }
        return null;
    }
}
