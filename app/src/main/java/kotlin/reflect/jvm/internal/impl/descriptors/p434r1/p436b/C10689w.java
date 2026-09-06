package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10011u;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ReflectJavaPackage.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.w */
/* loaded from: classes2.dex */
public final class C10689w extends AbstractC10682p implements InterfaceC10011u {

    /* renamed from: a */
    private final C10127c f41210a;

    public C10689w(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        this.f41210a = c10127c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10011u
    /* renamed from: A */
    public Collection<InterfaceC10011u> mo33624A() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC9986a> getAnnotations() {
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10011u
    /* renamed from: d */
    public C10127c mo33625d() {
        return this.f41210a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10689w) && C9768m.m32341a(mo33625d(), ((C10689w) obj).mo33625d());
    }

    public int hashCode() {
        return mo33625d().hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: l */
    public InterfaceC9986a mo33582l(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: m */
    public boolean mo33583m() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10011u
    /* renamed from: q */
    public Collection<InterfaceC9997g> mo33626q(Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(function1, "nameFilter");
        return C10784u.m38888j();
    }

    public String toString() {
        return C10689w.class.getName() + ": " + mo33625d();
    }
}
