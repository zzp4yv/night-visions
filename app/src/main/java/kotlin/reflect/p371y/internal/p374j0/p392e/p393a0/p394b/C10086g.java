package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10749c0;
import kotlin.collections.C10775p0;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.text.C10513u;
import okhttp3.HttpUrl;

/* compiled from: JvmNameResolverBase.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.g */
/* loaded from: classes3.dex */
public class C10086g implements InterfaceC10118c {

    /* renamed from: a */
    public static final a f38599a = new a(null);

    /* renamed from: b */
    private static final String f38600b;

    /* renamed from: c */
    private static final List<String> f38601c;

    /* renamed from: d */
    private static final Map<String, Integer> f38602d;

    /* renamed from: e */
    private final String[] f38603e;

    /* renamed from: f */
    private final Set<Integer> f38604f;

    /* renamed from: g */
    private final List<C10079a.e.c> f38605g;

    /* compiled from: JvmNameResolverBase.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.b.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: JvmNameResolverBase.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.b.g$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38606a;

        static {
            int[] iArr = new int[C10079a.e.c.EnumC11505c.values().length];
            iArr[C10079a.e.c.EnumC11505c.NONE.ordinal()] = 1;
            iArr[C10079a.e.c.EnumC11505c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[C10079a.e.c.EnumC11505c.DESC_TO_CLASS_ID.ordinal()] = 3;
            f38606a = iArr;
        }
    }

    static {
        List m38891m;
        String m38599e0;
        List<String> m38891m2;
        Iterable<IndexedValue> m38578K0;
        int m38793e;
        int m32419b;
        m38891m = C10784u.m38891m('k', 'o', 't', 'l', 'i', 'n');
        m38599e0 = C10749c0.m38599e0(m38891m, HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0, null, null, 62, null);
        f38600b = m38599e0;
        m38891m2 = C10784u.m38891m(m38599e0 + "/Any", m38599e0 + "/Nothing", m38599e0 + "/Unit", m38599e0 + "/Throwable", m38599e0 + "/Number", m38599e0 + "/Byte", m38599e0 + "/Double", m38599e0 + "/Float", m38599e0 + "/Int", m38599e0 + "/Long", m38599e0 + "/Short", m38599e0 + "/Boolean", m38599e0 + "/Char", m38599e0 + "/CharSequence", m38599e0 + "/String", m38599e0 + "/Comparable", m38599e0 + "/Enum", m38599e0 + "/Array", m38599e0 + "/ByteArray", m38599e0 + "/DoubleArray", m38599e0 + "/FloatArray", m38599e0 + "/IntArray", m38599e0 + "/LongArray", m38599e0 + "/ShortArray", m38599e0 + "/BooleanArray", m38599e0 + "/CharArray", m38599e0 + "/Cloneable", m38599e0 + "/Annotation", m38599e0 + "/collections/Iterable", m38599e0 + "/collections/MutableIterable", m38599e0 + "/collections/Collection", m38599e0 + "/collections/MutableCollection", m38599e0 + "/collections/List", m38599e0 + "/collections/MutableList", m38599e0 + "/collections/Set", m38599e0 + "/collections/MutableSet", m38599e0 + "/collections/Map", m38599e0 + "/collections/MutableMap", m38599e0 + "/collections/Map.Entry", m38599e0 + "/collections/MutableMap.MutableEntry", m38599e0 + "/collections/Iterator", m38599e0 + "/collections/MutableIterator", m38599e0 + "/collections/ListIterator", m38599e0 + "/collections/MutableListIterator");
        f38601c = m38891m2;
        m38578K0 = C10749c0.m38578K0(m38891m2);
        m38793e = C10775p0.m38793e(C10786v.m38911u(m38578K0, 10));
        m32419b = C9815l.m32419b(m38793e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
        for (IndexedValue indexedValue : m38578K0) {
            linkedHashMap.put((String) indexedValue.m38650d(), Integer.valueOf(indexedValue.m38649c()));
        }
        f38602d = linkedHashMap;
    }

    public C10086g(String[] strArr, Set<Integer> set, List<C10079a.e.c> list) {
        C9768m.m32346f(strArr, "strings");
        C9768m.m32346f(set, "localNameIndices");
        C9768m.m32346f(list, "records");
        this.f38603e = strArr;
        this.f38604f = set;
        this.f38605g = list;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c
    /* renamed from: a */
    public String mo34253a(int i2) {
        return getString(i2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c
    /* renamed from: b */
    public boolean mo34254b(int i2) {
        return this.f38604f.contains(Integer.valueOf(i2));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c
    public String getString(int i2) {
        String str;
        C10079a.e.c cVar = this.f38605g.get(i2);
        if (cVar.m34217P()) {
            str = cVar.m34210I();
        } else {
            if (cVar.m34215N()) {
                List<String> list = f38601c;
                int size = list.size();
                int m34206E = cVar.m34206E();
                if (m34206E >= 0 && m34206E < size) {
                    str = list.get(cVar.m34206E());
                }
            }
            str = this.f38603e[i2];
        }
        if (cVar.m34212K() >= 2) {
            List<Integer> m34213L = cVar.m34213L();
            C9768m.m32345e(m34213L, "substringIndexList");
            Integer num = m34213L.get(0);
            Integer num2 = m34213L.get(1);
            C9768m.m32345e(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                C9768m.m32345e(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    C9768m.m32345e(str, "string");
                    str = str.substring(num.intValue(), num2.intValue());
                    C9768m.m32345e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String str2 = str;
        if (cVar.m34208G() >= 2) {
            List<Integer> m34209H = cVar.m34209H();
            C9768m.m32345e(m34209H, "replaceCharList");
            Integer num3 = m34209H.get(0);
            Integer num4 = m34209H.get(1);
            C9768m.m32345e(str2, "string");
            str2 = C10513u.m37524z(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String str3 = str2;
        C10079a.e.c.EnumC11505c m34205D = cVar.m34205D();
        if (m34205D == null) {
            m34205D = C10079a.e.c.EnumC11505c.NONE;
        }
        int i3 = b.f38606a[m34205D.ordinal()];
        if (i3 == 2) {
            C9768m.m32345e(str3, "string");
            str3 = C10513u.m37524z(str3, '$', '.', false, 4, null);
        } else if (i3 == 3) {
            if (str3.length() >= 2) {
                C9768m.m32345e(str3, "string");
                str3 = str3.substring(1, str3.length() - 1);
                C9768m.m32345e(str3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String str4 = str3;
            C9768m.m32345e(str4, "string");
            str3 = C10513u.m37524z(str4, '$', '.', false, 4, null);
        }
        C9768m.m32345e(str3, "string");
        return str3;
    }
}
