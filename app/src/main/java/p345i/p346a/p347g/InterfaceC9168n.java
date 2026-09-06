package p345i.p346a.p347g;

import java.net.InetAddress;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: NameRegister.java */
/* renamed from: i.a.g.n */
/* loaded from: classes2.dex */
public interface InterfaceC9168n {

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35434a;

        static {
            int[] iArr = new int[d.values().length];
            f35434a = iArr;
            try {
                iArr[d.HOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35434a[d.SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$b */
    public static abstract class b implements InterfaceC9168n {
        /* renamed from: b */
        protected String m29707b(String str) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            int indexOf = str.indexOf(".local.");
            int lastIndexOf = str.lastIndexOf(45);
            int i2 = 1;
            if (lastIndexOf < 0) {
                sb.append(str.substring(0, indexOf));
            } else {
                try {
                    int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1, indexOf)) + 1;
                    sb.append(str.substring(0, lastIndexOf));
                    i2 = parseInt;
                } catch (Exception unused) {
                    sb.append(str.substring(0, indexOf));
                }
            }
            sb.append('-');
            sb.append(i2);
            sb.append(".local.");
            return sb.toString();
        }

        /* renamed from: c */
        protected String m29708c(String str) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            int lastIndexOf = str.lastIndexOf(40);
            int lastIndexOf2 = str.lastIndexOf(41);
            if (lastIndexOf < 0 || lastIndexOf >= lastIndexOf2) {
                sb.append(str);
                sb.append(" (2)");
            } else {
                try {
                    sb.append(str.substring(0, lastIndexOf));
                    sb.append('(');
                    sb.append(Integer.parseInt(str.substring(lastIndexOf + 1, lastIndexOf2)) + 1);
                    sb.append(')');
                } catch (NumberFormatException unused) {
                    sb.setLength(0);
                    sb.append(str);
                    sb.append(" (2)");
                }
            }
            return sb.toString();
        }
    }

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$c */
    public static class c {

        /* renamed from: a */
        private static volatile InterfaceC9168n f35435a;

        /* renamed from: a */
        public static InterfaceC9168n m29709a() {
            if (f35435a == null) {
                f35435a = new e();
            }
            return f35435a;
        }
    }

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$d */
    public enum d {
        HOST,
        SERVICE
    }

    /* compiled from: NameRegister.java */
    /* renamed from: i.a.g.n$e */
    public static class e extends b {

        /* renamed from: a */
        private final ConcurrentMap<InetAddress, String> f35439a = new ConcurrentHashMap();

        /* renamed from: b */
        private final ConcurrentMap<InetAddress, Set<String>> f35440b = new ConcurrentHashMap();

        @Override // p345i.p346a.p347g.InterfaceC9168n
        /* renamed from: a */
        public String mo29706a(InetAddress inetAddress, String str, d dVar) {
            int i2 = a.f35434a[dVar.ordinal()];
            return i2 != 1 ? i2 != 2 ? str : m29708c(str) : m29707b(str);
        }
    }

    /* renamed from: a */
    String mo29706a(InetAddress inetAddress, String str, d dVar);
}
