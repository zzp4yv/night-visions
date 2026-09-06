package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.C10742u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.utils.C10739f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10404d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10411k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10416p;

/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.f0.y.e.j0.l.d1 */
/* loaded from: classes3.dex */
public class C10309d1 {

    /* renamed from: a */
    private final boolean f40055a;

    /* renamed from: b */
    private final boolean f40056b;

    /* renamed from: c */
    private final boolean f40057c;

    /* renamed from: d */
    private final InterfaceC10416p f40058d;

    /* renamed from: e */
    private final AbstractC10319h f40059e;

    /* renamed from: f */
    private final AbstractC10322i f40060f;

    /* renamed from: g */
    private int f40061g;

    /* renamed from: h */
    private boolean f40062h;

    /* renamed from: i */
    private ArrayDeque<InterfaceC10411k> f40063i;

    /* renamed from: j */
    private Set<InterfaceC10411k> f40064j;

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d1$a */
    public interface a {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.d1$a$a, reason: collision with other inner class name */
        public static final class C11521a implements a {

            /* renamed from: a */
            private boolean f40065a;

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1.a
            /* renamed from: a */
            public void mo36626a(Function0<Boolean> function0) {
                C9768m.m32346f(function0, "block");
                if (this.f40065a) {
                    return;
                }
                this.f40065a = function0.invoke().booleanValue();
            }

            /* renamed from: b */
            public final boolean m36627b() {
                return this.f40065a;
            }
        }

        /* renamed from: a */
        void mo36626a(Function0<Boolean> function0);
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d1$b */
    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.d1$c */
    public static abstract class c {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.d1$c$a */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.d1$c$b */
        public static final class b extends c {

            /* renamed from: a */
            public static final b f40070a = new b();

            private b() {
                super(null);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1.c
            /* renamed from: a */
            public InterfaceC10411k mo36629a(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i) {
                C9768m.m32346f(c10309d1, "state");
                C9768m.m32346f(interfaceC10409i, "type");
                return c10309d1.m36618j().mo35948h0(interfaceC10409i);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.d1$c$c, reason: collision with other inner class name */
        public static final class C11522c extends c {

            /* renamed from: a */
            public static final C11522c f40071a = new C11522c();

            private C11522c() {
                super(null);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1.c
            /* renamed from: a */
            public /* bridge */ /* synthetic */ InterfaceC10411k mo36629a(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i) {
                return (InterfaceC10411k) m36630b(c10309d1, interfaceC10409i);
            }

            /* renamed from: b */
            public Void m36630b(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i) {
                C9768m.m32346f(c10309d1, "state");
                C9768m.m32346f(interfaceC10409i, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.d1$c$d */
        public static final class d extends c {

            /* renamed from: a */
            public static final d f40072a = new d();

            private d() {
                super(null);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1.c
            /* renamed from: a */
            public InterfaceC10411k mo36629a(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i) {
                C9768m.m32346f(c10309d1, "state");
                C9768m.m32346f(interfaceC10409i, "type");
                return c10309d1.m36618j().mo35926T(interfaceC10409i);
            }
        }

        private c() {
        }

        public /* synthetic */ c(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public abstract InterfaceC10411k mo36629a(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i);
    }

    public C10309d1(boolean z, boolean z2, boolean z3, InterfaceC10416p interfaceC10416p, AbstractC10319h abstractC10319h, AbstractC10322i abstractC10322i) {
        C9768m.m32346f(interfaceC10416p, "typeSystemContext");
        C9768m.m32346f(abstractC10319h, "kotlinTypePreparator");
        C9768m.m32346f(abstractC10322i, "kotlinTypeRefiner");
        this.f40055a = z;
        this.f40056b = z2;
        this.f40057c = z3;
        this.f40058d = interfaceC10416p;
        this.f40059e = abstractC10319h;
        this.f40060f = abstractC10322i;
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m36612d(C10309d1 c10309d1, InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c10309d1.m36613c(interfaceC10409i, interfaceC10409i2, z);
    }

    /* renamed from: c */
    public Boolean m36613c(InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2, boolean z) {
        C9768m.m32346f(interfaceC10409i, "subType");
        C9768m.m32346f(interfaceC10409i2, "superType");
        return null;
    }

    /* renamed from: e */
    public final void m36614e() {
        ArrayDeque<InterfaceC10411k> arrayDeque = this.f40063i;
        C9768m.m32343c(arrayDeque);
        arrayDeque.clear();
        Set<InterfaceC10411k> set = this.f40064j;
        C9768m.m32343c(set);
        set.clear();
        this.f40062h = false;
    }

    /* renamed from: f */
    public boolean mo35985f(InterfaceC10409i interfaceC10409i, InterfaceC10409i interfaceC10409i2) {
        C9768m.m32346f(interfaceC10409i, "subType");
        C9768m.m32346f(interfaceC10409i2, "superType");
        return true;
    }

    /* renamed from: g */
    public b m36615g(InterfaceC10411k interfaceC10411k, InterfaceC10404d interfaceC10404d) {
        C9768m.m32346f(interfaceC10411k, "subType");
        C9768m.m32346f(interfaceC10404d, "superType");
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    /* renamed from: h */
    public final ArrayDeque<InterfaceC10411k> m36616h() {
        return this.f40063i;
    }

    /* renamed from: i */
    public final Set<InterfaceC10411k> m36617i() {
        return this.f40064j;
    }

    /* renamed from: j */
    public final InterfaceC10416p m36618j() {
        return this.f40058d;
    }

    /* renamed from: k */
    public final void m36619k() {
        this.f40062h = true;
        if (this.f40063i == null) {
            this.f40063i = new ArrayDeque<>(4);
        }
        if (this.f40064j == null) {
            this.f40064j = C10739f.f41432f.m38544a();
        }
    }

    /* renamed from: l */
    public final boolean m36620l(InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10409i, "type");
        return this.f40057c && this.f40058d.mo35984z0(interfaceC10409i);
    }

    /* renamed from: m */
    public final boolean m36621m() {
        return this.f40055a;
    }

    /* renamed from: n */
    public final boolean m36622n() {
        return this.f40056b;
    }

    /* renamed from: o */
    public final InterfaceC10409i m36623o(InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10409i, "type");
        return this.f40059e.mo36711a(interfaceC10409i);
    }

    /* renamed from: p */
    public final InterfaceC10409i m36624p(InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10409i, "type");
        return this.f40060f.mo36717a(interfaceC10409i);
    }

    /* renamed from: q */
    public boolean m36625q(Function1<? super a, C10742u> function1) {
        C9768m.m32346f(function1, "block");
        a.C11521a c11521a = new a.C11521a();
        function1.invoke(c11521a);
        return c11521a.m36627b();
    }
}
