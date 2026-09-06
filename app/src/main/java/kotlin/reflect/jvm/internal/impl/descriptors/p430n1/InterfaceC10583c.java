package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;

/* compiled from: AnnotationDescriptor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.c */
/* loaded from: classes2.dex */
public interface InterfaceC10583c {

    /* compiled from: AnnotationDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.c$a */
    public static final class a {
        /* renamed from: a */
        public static C10127c m37727a(InterfaceC10583c interfaceC10583c) {
            InterfaceC10552e m36071e = C10202a.m36071e(interfaceC10583c);
            if (m36071e == null) {
                return null;
            }
            if (C10394k.m37054m(m36071e)) {
                m36071e = null;
            }
            if (m36071e != null) {
                return C10202a.m36070d(m36071e);
            }
            return null;
        }
    }

    /* renamed from: a */
    Map<C10130f, AbstractC10178g<?>> mo33159a();

    /* renamed from: d */
    C10127c mo33162d();

    AbstractC10311e0 getType();

    /* renamed from: t */
    InterfaceC10708z0 mo33164t();
}
