package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;

/* compiled from: ThrowingScope.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.l */
/* loaded from: classes3.dex */
public final class C10395l extends C10389f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10395l(EnumC10390g enumC10390g, String... strArr) {
        super(enumC10390g, (String[]) Arrays.copyOf(strArr, strArr.length));
        C9768m.m32346f(enumC10390g, "kind");
        C9768m.m32346f(strArr, "formatParams");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10389f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: b */
    public Set<C10130f> mo33312b() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10389f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: d */
    public Set<C10130f> mo33314d() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10389f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: e */
    public Set<C10130f> mo33315e() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10389f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        throw new IllegalStateException(m37040j() + ", required name: " + c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10389f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: g */
    public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        throw new IllegalStateException(m37040j());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10389f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: h */
    public Set<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        throw new IllegalStateException(m37040j() + ", required name: " + c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10389f, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: i */
    public Set<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        throw new IllegalStateException(m37040j() + ", required name: " + c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10389f
    public String toString() {
        return "ThrowingScope{" + m37040j() + '}';
    }
}
