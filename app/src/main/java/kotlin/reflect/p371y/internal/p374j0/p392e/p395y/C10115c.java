package kotlin.reflect.p371y.internal.p374j0.p392e.p395y;

import java.io.InputStream;
import kotlin.C10740s;
import kotlin.Pair;
import kotlin.jvm.internal.C9768m;
import kotlin.p429io.C10523a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10714f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10101m;

/* compiled from: readPackageFragment.kt */
/* renamed from: kotlin.f0.y.e.j0.e.y.c */
/* loaded from: classes3.dex */
public final class C10115c {
    /* renamed from: a */
    public static final Pair<C10101m, C10113a> m35357a(InputStream inputStream) {
        C10101m c10101m;
        C9768m.m32346f(inputStream, "<this>");
        try {
            C10113a m35355a = C10113a.f39168g.m35355a(inputStream);
            if (m35355a.m35354h()) {
                C10714f m38348d = C10714f.m38348d();
                C10114b.m35356a(m38348d);
                c10101m = C10101m.m34828X(inputStream, m38348d);
            } else {
                c10101m = null;
            }
            Pair<C10101m, C10113a> m38547a = C10740s.m38547a(c10101m, m35355a);
            C10523a.m37638a(inputStream, null);
            return m38547a;
        } finally {
        }
    }
}
