package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.KClass;

/* compiled from: AttributeArrayOwner.kt */
/* renamed from: kotlin.f0.y.e.j0.m.e */
/* loaded from: classes3.dex */
public abstract class AbstractC10436e<K, T> extends AbstractC10432a<K, T> {

    /* renamed from: f */
    private AbstractC10434c<T> f40405f;

    protected AbstractC10436e(AbstractC10434c<T> abstractC10434c) {
        C9768m.m32346f(abstractC10434c, "arrayMap");
        this.f40405f = abstractC10434c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10432a
    /* renamed from: c */
    protected final AbstractC10434c<T> mo37184c() {
        return this.f40405f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    protected final void m37193h(KClass<? extends K> kClass, T t) {
        C9768m.m32346f(kClass, "tClass");
        C9768m.m32346f(t, "value");
        int m37221d = mo36568f().m37221d(kClass);
        int mo37188c = this.f40405f.mo37188c();
        if (mo37188c == 0) {
            this.f40405f = new C10446o(t, m37221d);
            return;
        }
        if (mo37188c == 1) {
            AbstractC10434c<T> abstractC10434c = this.f40405f;
            C9768m.m32344d(abstractC10434c, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            C10446o c10446o = (C10446o) abstractC10434c;
            if (c10446o.m37208h() == m37221d) {
                this.f40405f = new C10446o(t, m37221d);
                return;
            } else {
                C10435d c10435d = new C10435d();
                this.f40405f = c10435d;
                c10435d.mo37189f(c10446o.m37208h(), c10446o.m37209i());
            }
        }
        this.f40405f.mo37189f(m37221d, t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC10436e() {
        /*
            r2 = this;
            kotlin.f0.y.e.j0.m.i r0 = kotlin.reflect.p371y.internal.p374j0.p422m.C10440i.f40418f
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.C9768m.m32344d(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10436e.<init>():void");
    }
}
