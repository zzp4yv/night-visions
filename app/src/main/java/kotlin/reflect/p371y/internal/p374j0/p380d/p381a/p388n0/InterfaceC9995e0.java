package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0;

import java.util.Iterator;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: javaElements.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.n0.e0 */
/* loaded from: classes2.dex */
public interface InterfaceC9995e0 extends InterfaceC9992d {

    /* compiled from: javaElements.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.n0.e0$a */
    public static final class a {
        /* renamed from: a */
        public static InterfaceC9986a m33586a(InterfaceC9995e0 interfaceC9995e0, C10127c c10127c) {
            Object obj;
            C9768m.m32346f(c10127c, "fqName");
            Iterator<T> it = interfaceC9995e0.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C10126b mo33571e = ((InterfaceC9986a) next).mo33571e();
                if (C9768m.m32341a(mo33571e != null ? mo33571e.m35409b() : null, c10127c)) {
                    obj = next;
                    break;
                }
            }
            return (InterfaceC9986a) obj;
        }
    }
}
