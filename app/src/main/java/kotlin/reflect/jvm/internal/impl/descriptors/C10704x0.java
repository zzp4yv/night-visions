package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.C9786y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10296m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10292i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: ScopesHolderForClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0 */
/* loaded from: classes2.dex */
public final class C10704x0<T extends InterfaceC10218h> {

    /* renamed from: c */
    private final InterfaceC10552e f41238c;

    /* renamed from: d */
    private final Function1<AbstractC10363g, T> f41239d;

    /* renamed from: e */
    private final AbstractC10363g f41240e;

    /* renamed from: f */
    private final InterfaceC10292i f41241f;

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f41237b = {C9757g0.m32304h(new C9786y(C9757g0.m32298b(C10704x0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: a */
    public static final a f41236a = new a(null);

    /* compiled from: ScopesHolderForClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final <T extends InterfaceC10218h> C10704x0<T> m38159a(InterfaceC10552e interfaceC10552e, InterfaceC10297n interfaceC10297n, AbstractC10363g abstractC10363g, Function1<? super AbstractC10363g, ? extends T> function1) {
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            C9768m.m32346f(interfaceC10297n, "storageManager");
            C9768m.m32346f(abstractC10363g, "kotlinTypeRefinerForOwnerModule");
            C9768m.m32346f(function1, "scopeFactory");
            return new C10704x0<>(interfaceC10552e, interfaceC10297n, function1, abstractC10363g, null);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$b */
    static final class b extends Lambda implements Function0<T> {

        /* renamed from: f */
        final /* synthetic */ C10704x0<T> f41242f;

        /* renamed from: g */
        final /* synthetic */ AbstractC10363g f41243g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10704x0<T> c10704x0, AbstractC10363g abstractC10363g) {
            super(0);
            this.f41242f = c10704x0;
            this.f41243g = abstractC10363g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((C10704x0) this.f41242f).f41239d.invoke(this.f41243g);
        }
    }

    /* compiled from: ScopesHolderForClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$c */
    static final class c extends Lambda implements Function0<T> {

        /* renamed from: f */
        final /* synthetic */ C10704x0<T> f41244f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C10704x0<T> c10704x0) {
            super(0);
            this.f41244f = c10704x0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final T invoke() {
            return (T) ((C10704x0) this.f41244f).f41239d.invoke(((C10704x0) this.f41244f).f41240e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10704x0(InterfaceC10552e interfaceC10552e, InterfaceC10297n interfaceC10297n, Function1<? super AbstractC10363g, ? extends T> function1, AbstractC10363g abstractC10363g) {
        this.f41238c = interfaceC10552e;
        this.f41239d = function1;
        this.f41240e = abstractC10363g;
        this.f41241f = interfaceC10297n.mo36516d(new c(this));
    }

    public /* synthetic */ C10704x0(InterfaceC10552e interfaceC10552e, InterfaceC10297n interfaceC10297n, Function1 function1, AbstractC10363g abstractC10363g, C9756g c9756g) {
        this(interfaceC10552e, interfaceC10297n, function1, abstractC10363g);
    }

    /* renamed from: d */
    private final T m38157d() {
        return (T) C10296m.m36555a(this.f41241f, this, f41237b[0]);
    }

    /* renamed from: c */
    public final T m38158c(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        if (!abstractC10363g.mo36926d(C10202a.m36078l(this.f41238c))) {
            return m38157d();
        }
        InterfaceC10312e1 mo32877h = this.f41238c.mo32877h();
        C9768m.m32345e(mo32877h, "classDescriptor.typeConstructor");
        return !abstractC10363g.mo36927e(mo32877h) ? m38157d() : (T) abstractC10363g.mo36925c(this.f41238c, new b(this, abstractC10363g));
    }
}
