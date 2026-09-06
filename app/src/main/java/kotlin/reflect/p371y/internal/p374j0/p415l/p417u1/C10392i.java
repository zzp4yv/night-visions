package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9878e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g;

/* compiled from: ErrorTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.i */
/* loaded from: classes3.dex */
public final class C10392i implements InterfaceC10312e1 {

    /* renamed from: a */
    private final EnumC10393j f40265a;

    /* renamed from: b */
    private final String[] f40266b;

    /* renamed from: c */
    private final String f40267c;

    public C10392i(EnumC10393j enumC10393j, String... strArr) {
        C9768m.m32346f(enumC10393j, "kind");
        C9768m.m32346f(strArr, "formatParams");
        this.f40265a = enumC10393j;
        this.f40266b = strArr;
        String m36988k = EnumC10385b.ERROR_TYPE.m36988k();
        String m37049k = enumC10393j.m37049k();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(m37049k, Arrays.copyOf(copyOf, copyOf.length));
        C9768m.m32345e(format, "format(this, *args)");
        String format2 = String.format(m36988k, Arrays.copyOf(new Object[]{format}, 1));
        C9768m.m32345e(format2, "format(this, *args)");
        this.f40267c = format2;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: a */
    public Collection<AbstractC10311e0> mo35998a() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: b */
    public InterfaceC10312e1 mo35999b(AbstractC10363g abstractC10363g) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: c */
    public InterfaceC10561h mo32891w() {
        return C10394k.f40355a.m37061h();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    /* renamed from: g */
    public final EnumC10393j m37046g() {
        return this.f40265a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    public List<InterfaceC10554e1> getParameters() {
        return C10784u.m38888j();
    }

    /* renamed from: h */
    public final String m37047h(int i2) {
        return this.f40266b[i2];
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1
    /* renamed from: o */
    public AbstractC9881h mo36004o() {
        return C9878e.f37452h.m32704a();
    }

    public String toString() {
        return this.f40267c;
    }
}
