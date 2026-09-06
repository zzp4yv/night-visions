package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: ReflectJavaAnnotationOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.h */
/* loaded from: classes2.dex */
public interface InterfaceC10674h extends InterfaceC9992d {

    /* compiled from: ReflectJavaAnnotationOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.h$a */
    public static final class a {
        /* renamed from: a */
        public static C10671e m38081a(InterfaceC10674h interfaceC10674h, C10127c c10127c) {
            Annotation[] declaredAnnotations;
            C9768m.m32346f(c10127c, "fqName");
            AnnotatedElement mo38048w = interfaceC10674h.mo38048w();
            if (mo38048w == null || (declaredAnnotations = mo38048w.getDeclaredAnnotations()) == null) {
                return null;
            }
            return C10675i.m38084a(declaredAnnotations, c10127c);
        }

        /* renamed from: b */
        public static List<C10671e> m38082b(InterfaceC10674h interfaceC10674h) {
            Annotation[] declaredAnnotations;
            List<C10671e> m38085b;
            AnnotatedElement mo38048w = interfaceC10674h.mo38048w();
            return (mo38048w == null || (declaredAnnotations = mo38048w.getDeclaredAnnotations()) == null || (m38085b = C10675i.m38085b(declaredAnnotations)) == null) ? C10784u.m38888j() : m38085b;
        }

        /* renamed from: c */
        public static boolean m38083c(InterfaceC10674h interfaceC10674h) {
            return false;
        }
    }

    /* renamed from: w */
    AnnotatedElement mo38048w();
}
