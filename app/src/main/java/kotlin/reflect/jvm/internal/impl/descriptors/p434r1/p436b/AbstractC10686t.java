package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10770n;
import kotlin.collections.C10780s;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10674h;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10688v;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10007q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9989b0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10132h;

/* compiled from: ReflectJavaMember.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.t */
/* loaded from: classes2.dex */
public abstract class AbstractC10686t extends AbstractC10682p implements InterfaceC10674h, InterfaceC10688v, InterfaceC10007q {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10688v
    /* renamed from: E */
    public int mo38089E() {
        return mo38106U().getModifiers();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10009s
    /* renamed from: Q */
    public boolean mo33623Q() {
        return InterfaceC10688v.a.m38119d(this);
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

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10007q
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public C10678l mo33618P() {
        Class<?> declaringClass = mo38106U().getDeclaringClass();
        C9768m.m32345e(declaringClass, "member.declaringClass");
        return new C10678l(declaringClass);
    }

    /* renamed from: U */
    public abstract Member mo38106U();

    /* renamed from: V */
    protected final List<InterfaceC9989b0> m38113V(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
        String str;
        C9768m.m32346f(typeArr, "parameterTypes");
        C9768m.m32346f(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> m38063b = C10668c.f41171a.m38063b(mo38106U());
        int size = m38063b != null ? m38063b.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i2 = 0;
        while (i2 < length) {
            AbstractC10692z m38122a = AbstractC10692z.f41215a.m38122a(typeArr[i2]);
            if (m38063b != null) {
                str = (String) C10780s.m38833X(m38063b, i2 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + size + " (name=" + getName() + " type=" + m38122a + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new C10667b0(m38122a, annotationArr[i2], str, z && i2 == C10770n.m38721A(typeArr)));
            i2++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC10686t) && C9768m.m32341a(mo38106U(), ((AbstractC10686t) obj).mo38106U());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10010t
    public C10130f getName() {
        String name = mo38106U().getName();
        C10130f m35454x = name != null ? C10130f.m35454x(name) : null;
        return m35454x == null ? C10132h.f39266b : m35454x;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10009s
    public AbstractC10578m1 getVisibility() {
        return InterfaceC10688v.a.m38116a(this);
    }

    public int hashCode() {
        return mo38106U().hashCode();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10009s
    public boolean isAbstract() {
        return InterfaceC10688v.a.m38117b(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10009s
    public boolean isFinal() {
        return InterfaceC10688v.a.m38118c(this);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: m */
    public boolean mo33583m() {
        return InterfaceC10674h.a.m38083c(this);
    }

    public String toString() {
        return getClass().getName() + ": " + mo38106U();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.InterfaceC10674h
    /* renamed from: w */
    public AnnotatedElement mo38048w() {
        Member mo38106U = mo38106U();
        C9768m.m32344d(mo38106U, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) mo38106U;
    }
}
