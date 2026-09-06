package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: LazyScopeAdapter.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.g */
/* loaded from: classes3.dex */
public final class C10217g extends AbstractC10211a {

    /* renamed from: b */
    private final InterfaceC10292i<InterfaceC10218h> f39665b;

    /* compiled from: LazyScopeAdapter.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.g$a */
    static final class a extends Lambda implements Function0<InterfaceC10218h> {

        /* renamed from: f */
        final /* synthetic */ Function0<InterfaceC10218h> f39666f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends InterfaceC10218h> function0) {
            super(0);
            this.f39666f = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10218h invoke() {
            InterfaceC10218h invoke = this.f39666f.invoke();
            return invoke instanceof AbstractC10211a ? ((AbstractC10211a) invoke).m36121h() : invoke;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10217g(Function0<? extends InterfaceC10218h> function0) {
        this(null, function0, 1, 0 == true ? 1 : 0);
        C9768m.m32346f(function0, "getScope");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C10217g(kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n r1, kotlin.jvm.functions.Function0 r2, int r3, kotlin.jvm.internal.C9756g r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto Lb
            kotlin.f0.y.e.j0.k.n r1 = kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.f40008b
            java.lang.String r3 = "NO_LOCKS"
            kotlin.jvm.internal.C9768m.m32345e(r1, r3)
        Lb:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10217g.<init>(kotlin.f0.y.e.j0.k.n, kotlin.a0.c.a, int, kotlin.a0.d.g):void");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10211a
    /* renamed from: i */
    protected InterfaceC10218h mo36122i() {
        return this.f39665b.invoke();
    }

    public C10217g(InterfaceC10297n interfaceC10297n, Function0<? extends InterfaceC10218h> function0) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(function0, "getScope");
        this.f39665b = interfaceC10297n.mo36516d(new a(function0));
    }
}
