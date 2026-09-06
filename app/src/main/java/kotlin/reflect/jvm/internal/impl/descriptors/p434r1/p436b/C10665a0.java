package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10780s;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10674h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10015y;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ReflectJavaTypeParameter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.a0 */
/* loaded from: classes2.dex */
public final class C10665a0 extends AbstractC10682p implements InterfaceC10674h, InterfaceC10015y {

    /* renamed from: a */
    private final TypeVariable<?> f41160a;

    public C10665a0(TypeVariable<?> typeVariable) {
        C9768m.m32346f(typeVariable, "typeVariable");
        this.f41160a = typeVariable;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public C10671e mo33582l(C10127c c10127c) {
        return InterfaceC10674h.a.m38081a(this, c10127c);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<C10671e> getAnnotations() {
        return InterfaceC10674h.a.m38082b(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10015y
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public List<C10680n> getUpperBounds() {
        Type[] bounds = this.f41160a.getBounds();
        C9768m.m32345e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C10680n(type));
        }
        C10680n c10680n = (C10680n) C10780s.m38870u0(arrayList);
        return C9768m.m32341a(c10680n != null ? c10680n.mo38066R() : null, Object.class) ? C10784u.m38888j() : arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10665a0) && C9768m.m32341a(this.f41160a, ((C10665a0) obj).f41160a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10010t
    public C10130f getName() {
        C10130f m35454x = C10130f.m35454x(this.f41160a.getName());
        C9768m.m32345e(m35454x, "identifier(typeVariable.name)");
        return m35454x;
    }

    public int hashCode() {
        return this.f41160a.hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: m */
    public boolean mo33583m() {
        return InterfaceC10674h.a.m38083c(this);
    }

    public String toString() {
        return C10665a0.class.getName() + ": " + this.f41160a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10674h
    /* renamed from: w */
    public AnnotatedElement mo38048w() {
        TypeVariable<?> typeVariable = this.f41160a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }
}
