package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10714f;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10092d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10097i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10100l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10102n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10109u;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10083d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10117b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10120e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10121f;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import okhttp3.HttpUrl;

/* compiled from: JvmProtoBufUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.i */
/* loaded from: classes3.dex */
public final class C10088i {

    /* renamed from: a */
    public static final C10088i f38607a = new C10088i();

    /* renamed from: b */
    private static final C10714f f38608b;

    static {
        C10714f m38348d = C10714f.m38348d();
        C10079a.m34066a(m38348d);
        C9768m.m32345e(m38348d, "newInstance().apply(JvmP…f::registerAllExtensions)");
        f38608b = m38348d;
    }

    private C10088i() {
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC10083d.a m34256d(C10088i c10088i, C10102n c10102n, InterfaceC10118c interfaceC10118c, C10122g c10122g, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return c10088i.m34267c(c10102n, interfaceC10118c, c10122g, z);
    }

    /* renamed from: f */
    public static final boolean m34257f(C10102n c10102n) {
        C9768m.m32346f(c10102n, "proto");
        C10117b.b m34246a = C10082c.f38586a.m34246a();
        Object m38401u = c10102n.m38401u(C10079a.f38495e);
        C9768m.m32345e(m38401u, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean mo35368d = m34246a.mo35368d(((Number) m38401u).intValue());
        C9768m.m32345e(mo35368d, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return mo35368d.booleanValue();
    }

    /* renamed from: g */
    private final String m34258g(C10105q c10105q, InterfaceC10118c interfaceC10118c) {
        if (c10105q.m35047m0()) {
            return C10081b.m34245b(interfaceC10118c.mo34253a(c10105q.m35033X()));
        }
        return null;
    }

    /* renamed from: h */
    public static final Pair<C10085f, C10091c> m34259h(byte[] bArr, String[] strArr) {
        C9768m.m32346f(bArr, "bytes");
        C9768m.m32346f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(f38607a.m34262k(byteArrayInputStream, strArr), C10091c.m34432x1(byteArrayInputStream, f38608b));
    }

    /* renamed from: i */
    public static final Pair<C10085f, C10091c> m34260i(String[] strArr, String[] strArr2) {
        C9768m.m32346f(strArr, "data");
        C9768m.m32346f(strArr2, "strings");
        byte[] m34242e = C10080a.m34242e(strArr);
        C9768m.m32345e(m34242e, "decodeBytes(data)");
        return m34259h(m34242e, strArr2);
    }

    /* renamed from: j */
    public static final Pair<C10085f, C10097i> m34261j(String[] strArr, String[] strArr2) {
        C9768m.m32346f(strArr, "data");
        C9768m.m32346f(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C10080a.m34242e(strArr));
        return new Pair<>(f38607a.m34262k(byteArrayInputStream, strArr2), C10097i.m34696F0(byteArrayInputStream, f38608b));
    }

    /* renamed from: k */
    private final C10085f m34262k(InputStream inputStream, String[] strArr) {
        C10079a.e m34167D = C10079a.e.m34167D(inputStream, f38608b);
        C9768m.m32345e(m34167D, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C10085f(m34167D, strArr);
    }

    /* renamed from: l */
    public static final Pair<C10085f, C10100l> m34263l(byte[] bArr, String[] strArr) {
        C9768m.m32346f(bArr, "bytes");
        C9768m.m32346f(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(f38607a.m34262k(byteArrayInputStream, strArr), C10100l.m34786e0(byteArrayInputStream, f38608b));
    }

    /* renamed from: m */
    public static final Pair<C10085f, C10100l> m34264m(String[] strArr, String[] strArr2) {
        C9768m.m32346f(strArr, "data");
        C9768m.m32346f(strArr2, "strings");
        byte[] m34242e = C10080a.m34242e(strArr);
        C9768m.m32345e(m34242e, "decodeBytes(data)");
        return m34263l(m34242e, strArr2);
    }

    /* renamed from: a */
    public final C10714f m34265a() {
        return f38608b;
    }

    /* renamed from: b */
    public final AbstractC10083d.b m34266b(C10092d c10092d, InterfaceC10118c interfaceC10118c, C10122g c10122g) {
        String m38599e0;
        C9768m.m32346f(c10092d, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        AbstractC10716h.f<C10092d, C10079a.c> fVar = C10079a.f38491a;
        C9768m.m32345e(fVar, "constructorSignature");
        C10079a.c cVar = (C10079a.c) C10120e.m35380a(c10092d, fVar);
        String string = (cVar == null || !cVar.m34116z()) ? "<init>" : interfaceC10118c.getString(cVar.m34114x());
        if (cVar == null || !cVar.m34115y()) {
            List<C10109u> m34540M = c10092d.m34540M();
            C9768m.m32345e(m34540M, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(m34540M, 10));
            for (C10109u c10109u : m34540M) {
                C10088i c10088i = f38607a;
                C9768m.m32345e(c10109u, "it");
                String m34258g = c10088i.m34258g(C10121f.m35395n(c10109u, c10122g), interfaceC10118c);
                if (m34258g == null) {
                    return null;
                }
                arrayList.add(m34258g);
            }
            m38599e0 = C10749c0.m38599e0(arrayList, HttpUrl.FRAGMENT_ENCODE_SET, "(", ")V", 0, null, null, 56, null);
        } else {
            m38599e0 = interfaceC10118c.getString(cVar.m34113w());
        }
        return new AbstractC10083d.b(string, m38599e0);
    }

    /* renamed from: c */
    public final AbstractC10083d.a m34267c(C10102n c10102n, InterfaceC10118c interfaceC10118c, C10122g c10122g, boolean z) {
        String m34258g;
        C9768m.m32346f(c10102n, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        AbstractC10716h.f<C10102n, C10079a.d> fVar = C10079a.f38494d;
        C9768m.m32345e(fVar, "propertySignature");
        C10079a.d dVar = (C10079a.d) C10120e.m35380a(c10102n, fVar);
        if (dVar == null) {
            return null;
        }
        C10079a.b m34139A = dVar.m34144F() ? dVar.m34139A() : null;
        if (m34139A == null && z) {
            return null;
        }
        int m34887d0 = (m34139A == null || !m34139A.m34085z()) ? c10102n.m34887d0() : m34139A.m34083x();
        if (m34139A == null || !m34139A.m34084y()) {
            m34258g = m34258g(C10121f.m35392k(c10102n, c10122g), interfaceC10118c);
            if (m34258g == null) {
                return null;
            }
        } else {
            m34258g = interfaceC10118c.getString(m34139A.m34082w());
        }
        return new AbstractC10083d.a(interfaceC10118c.getString(m34887d0), m34258g);
    }

    /* renamed from: e */
    public final AbstractC10083d.b m34268e(C10097i c10097i, InterfaceC10118c interfaceC10118c, C10122g c10122g) {
        List m38892n;
        String m38599e0;
        String sb;
        C9768m.m32346f(c10097i, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(c10122g, "typeTable");
        AbstractC10716h.f<C10097i, C10079a.c> fVar = C10079a.f38492b;
        C9768m.m32345e(fVar, "methodSignature");
        C10079a.c cVar = (C10079a.c) C10120e.m35380a(c10097i, fVar);
        int m34723e0 = (cVar == null || !cVar.m34116z()) ? c10097i.m34723e0() : cVar.m34114x();
        if (cVar == null || !cVar.m34115y()) {
            m38892n = C10784u.m38892n(C10121f.m35389h(c10097i, c10122g));
            List<C10109u> m34735q0 = c10097i.m34735q0();
            C9768m.m32345e(m34735q0, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(m34735q0, 10));
            for (C10109u c10109u : m34735q0) {
                C9768m.m32345e(c10109u, "it");
                arrayList.add(C10121f.m35395n(c10109u, c10122g));
            }
            List m38609o0 = C10749c0.m38609o0(m38892n, arrayList);
            ArrayList arrayList2 = new ArrayList(C10786v.m38911u(m38609o0, 10));
            Iterator it = m38609o0.iterator();
            while (it.hasNext()) {
                String m34258g = f38607a.m34258g((C10105q) it.next(), interfaceC10118c);
                if (m34258g == null) {
                    return null;
                }
                arrayList2.add(m34258g);
            }
            String m34258g2 = m34258g(C10121f.m35391j(c10097i, c10122g), interfaceC10118c);
            if (m34258g2 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            m38599e0 = C10749c0.m38599e0(arrayList2, HttpUrl.FRAGMENT_ENCODE_SET, "(", ")", 0, null, null, 56, null);
            sb2.append(m38599e0);
            sb2.append(m34258g2);
            sb = sb2.toString();
        } else {
            sb = interfaceC10118c.getString(cVar.m34113w());
        }
        return new AbstractC10083d.b(interfaceC10118c.getString(m34723e0), sb);
    }
}
