package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.C10749c0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10103o;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10104p;

/* compiled from: NameResolverImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.e.z.d */
/* loaded from: classes3.dex */
public final class C10119d implements InterfaceC10118c {

    /* renamed from: a */
    private final C10104p f39233a;

    /* renamed from: b */
    private final C10103o f39234b;

    /* compiled from: NameResolverImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.z.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39235a;

        static {
            int[] iArr = new int[C10103o.c.EnumC11509c.values().length];
            iArr[C10103o.c.EnumC11509c.CLASS.ordinal()] = 1;
            iArr[C10103o.c.EnumC11509c.PACKAGE.ordinal()] = 2;
            iArr[C10103o.c.EnumC11509c.LOCAL.ordinal()] = 3;
            f39235a = iArr;
        }
    }

    public C10119d(C10104p c10104p, C10103o c10103o) {
        C9768m.m32346f(c10104p, "strings");
        C9768m.m32346f(c10103o, "qualifiedNames");
        this.f39233a = c10104p;
        this.f39234b = c10103o;
    }

    /* renamed from: c */
    private final Triple<List<String>, List<String>, Boolean> m35379c(int i2) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i2 != -1) {
            C10103o.c m34941v = this.f39234b.m34941v(i2);
            String m34993v = this.f39233a.m34993v(m34941v.m34969z());
            C10103o.c.EnumC11509c m34967x = m34941v.m34967x();
            C9768m.m32343c(m34967x);
            int i3 = a.f39235a[m34967x.ordinal()];
            if (i3 == 1) {
                linkedList2.addFirst(m34993v);
            } else if (i3 == 2) {
                linkedList.addFirst(m34993v);
            } else if (i3 == 3) {
                linkedList2.addFirst(m34993v);
                z = true;
            }
            i2 = m34941v.m34968y();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c
    /* renamed from: a */
    public String mo34253a(int i2) {
        String m38599e0;
        String m38599e02;
        Triple<List<String>, List<String>, Boolean> m35379c = m35379c(i2);
        List<String> m37658a = m35379c.m37658a();
        m38599e0 = C10749c0.m38599e0(m35379c.m37659b(), ".", null, null, 0, null, null, 62, null);
        if (m37658a.isEmpty()) {
            return m38599e0;
        }
        StringBuilder sb = new StringBuilder();
        m38599e02 = C10749c0.m38599e0(m37658a, "/", null, null, 0, null, null, 62, null);
        sb.append(m38599e02);
        sb.append('/');
        sb.append(m38599e0);
        return sb.toString();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c
    /* renamed from: b */
    public boolean mo34254b(int i2) {
        return m35379c(i2).m37661d().booleanValue();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c
    public String getString(int i2) {
        String m34993v = this.f39233a.m34993v(i2);
        C9768m.m32345e(m34993v, "strings.getString(index)");
        return m34993v;
    }
}
