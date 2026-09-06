package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;
import kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.t */
/* loaded from: classes3.dex */
public abstract class AbstractC10451t implements InterfaceC10437f {

    /* renamed from: a */
    private final String f40494a;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.t$a */
    public static final class a extends AbstractC10451t {

        /* renamed from: b */
        private final int f40495b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L18
                java.lang.String r1 = "s"
                goto L1a
            L18:
                java.lang.String r1 = ""
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f40495b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10451t.a.<init>(int):void");
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "functionDescriptor");
            return interfaceC10705y.mo37028f().size() >= this.f40495b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.t$b */
    public static final class b extends AbstractC10451t {

        /* renamed from: b */
        private final int f40496b;

        public b(int i2) {
            super("must have exactly " + i2 + " value parameters", null);
            this.f40496b = i2;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "functionDescriptor");
            return interfaceC10705y.mo37028f().size() == this.f40496b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.t$c */
    public static final class c extends AbstractC10451t {

        /* renamed from: b */
        public static final c f40497b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "functionDescriptor");
            return interfaceC10705y.mo37028f().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.t$d */
    public static final class d extends AbstractC10451t {

        /* renamed from: b */
        public static final d f40498b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
        /* renamed from: b */
        public boolean mo37195b(InterfaceC10705y interfaceC10705y) {
            C9768m.m32346f(interfaceC10705y, "functionDescriptor");
            return interfaceC10705y.mo37028f().size() == 1;
        }
    }

    private AbstractC10451t(String str) {
        this.f40494a = str;
    }

    public /* synthetic */ AbstractC10451t(String str, C9756g c9756g) {
        this(str);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    /* renamed from: a */
    public String mo37194a(InterfaceC10705y interfaceC10705y) {
        return InterfaceC10437f.a.m37196a(this, interfaceC10705y);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.InterfaceC10437f
    public String getDescription() {
        return this.f40494a;
    }
}
