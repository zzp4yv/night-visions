package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Modifier;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10578m1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10575l1;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10646a;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10647b;
import kotlin.reflect.jvm.internal.impl.descriptors.p433q1.C10648c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10009s;

/* compiled from: ReflectJavaModifierListOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.v */
/* loaded from: classes2.dex */
public interface InterfaceC10688v extends InterfaceC10009s {

    /* compiled from: ReflectJavaModifierListOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.v$a */
    public static final class a {
        /* renamed from: a */
        public static AbstractC10578m1 m38116a(InterfaceC10688v interfaceC10688v) {
            int mo38089E = interfaceC10688v.mo38089E();
            return Modifier.isPublic(mo38089E) ? C10575l1.h.f40780c : Modifier.isPrivate(mo38089E) ? C10575l1.e.f40777c : Modifier.isProtected(mo38089E) ? Modifier.isStatic(mo38089E) ? C10648c.f41132c : C10647b.f41131c : C10646a.f41130c;
        }

        /* renamed from: b */
        public static boolean m38117b(InterfaceC10688v interfaceC10688v) {
            return Modifier.isAbstract(interfaceC10688v.mo38089E());
        }

        /* renamed from: c */
        public static boolean m38118c(InterfaceC10688v interfaceC10688v) {
            return Modifier.isFinal(interfaceC10688v.mo38089E());
        }

        /* renamed from: d */
        public static boolean m38119d(InterfaceC10688v interfaceC10688v) {
            return Modifier.isStatic(interfaceC10688v.mo38089E());
        }
    }

    /* renamed from: E */
    int mo38089E();
}
