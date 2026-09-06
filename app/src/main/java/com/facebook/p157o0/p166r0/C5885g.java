package com.facebook.p157o0.p166r0;

import com.facebook.p157o0.p166r0.C5886h;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C10740s;
import kotlin.collections.C10777q0;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: Model.kt */
/* renamed from: com.facebook.o0.r0.g */
/* loaded from: classes2.dex */
public final class C5885g {

    /* renamed from: a */
    public static final a f15417a = new a(null);

    /* renamed from: b */
    private static final Map<String, String> f15418b;

    /* renamed from: c */
    private final C5884f f15419c;

    /* renamed from: d */
    private final C5884f f15420d;

    /* renamed from: e */
    private final C5884f f15421e;

    /* renamed from: f */
    private final C5884f f15422f;

    /* renamed from: g */
    private final C5884f f15423g;

    /* renamed from: h */
    private final C5884f f15424h;

    /* renamed from: i */
    private final C5884f f15425i;

    /* renamed from: j */
    private final C5884f f15426j;

    /* renamed from: k */
    private final C5884f f15427k;

    /* renamed from: l */
    private final C5884f f15428l;

    /* renamed from: m */
    private final C5884f f15429m;

    /* renamed from: n */
    private final Map<String, C5884f> f15430n;

    /* compiled from: Model.kt */
    /* renamed from: com.facebook.o0.r0.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: b */
        private final Map<String, C5884f> m12681b(File file) {
            C5888j c5888j = C5888j.f15450a;
            Map<String, C5884f> m12737c = C5888j.m12737c(file);
            if (m12737c == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map map = C5885g.f15418b;
            for (Map.Entry<String, C5884f> entry : m12737c.entrySet()) {
                String key = entry.getKey();
                if (map.containsKey(entry.getKey()) && (key = (String) map.get(entry.getKey())) == null) {
                    return null;
                }
                hashMap.put(key, entry.getValue());
            }
            return hashMap;
        }

        /* renamed from: a */
        public final C5885g m12682a(File file) {
            C9768m.m32346f(file, "file");
            Map<String, C5884f> m12681b = m12681b(file);
            C9756g c9756g = null;
            if (m12681b == null) {
                return null;
            }
            try {
                return new C5885g(m12681b, c9756g);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        HashMap m38799k;
        m38799k = C10777q0.m38799k(C10740s.m38547a("embedding.weight", "embed.weight"), C10740s.m38547a("dense1.weight", "fc1.weight"), C10740s.m38547a("dense2.weight", "fc2.weight"), C10740s.m38547a("dense3.weight", "fc3.weight"), C10740s.m38547a("dense1.bias", "fc1.bias"), C10740s.m38547a("dense2.bias", "fc2.bias"), C10740s.m38547a("dense3.bias", "fc3.bias"));
        f15418b = m38799k;
    }

    private C5885g(Map<String, C5884f> map) {
        Set<String> m38922i;
        C5884f c5884f = map.get("embed.weight");
        if (c5884f == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15419c = c5884f;
        C5887i c5887i = C5887i.f15449a;
        C5884f c5884f2 = map.get("convs.0.weight");
        if (c5884f2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15420d = C5887i.m12735l(c5884f2);
        C5884f c5884f3 = map.get("convs.1.weight");
        if (c5884f3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15421e = C5887i.m12735l(c5884f3);
        C5884f c5884f4 = map.get("convs.2.weight");
        if (c5884f4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15422f = C5887i.m12735l(c5884f4);
        C5884f c5884f5 = map.get("convs.0.bias");
        if (c5884f5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15423g = c5884f5;
        C5884f c5884f6 = map.get("convs.1.bias");
        if (c5884f6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15424h = c5884f6;
        C5884f c5884f7 = map.get("convs.2.bias");
        if (c5884f7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15425i = c5884f7;
        C5884f c5884f8 = map.get("fc1.weight");
        if (c5884f8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15426j = C5887i.m12734k(c5884f8);
        C5884f c5884f9 = map.get("fc2.weight");
        if (c5884f9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15427k = C5887i.m12734k(c5884f9);
        C5884f c5884f10 = map.get("fc1.bias");
        if (c5884f10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15428l = c5884f10;
        C5884f c5884f11 = map.get("fc2.bias");
        if (c5884f11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f15429m = c5884f11;
        this.f15430n = new HashMap();
        m38922i = C10789w0.m38922i(C5886h.a.MTML_INTEGRITY_DETECT.m12703k(), C5886h.a.MTML_APP_EVENT_PREDICTION.m12703k());
        for (String str : m38922i) {
            String m32354n = C9768m.m32354n(str, ".weight");
            String m32354n2 = C9768m.m32354n(str, ".bias");
            C5884f c5884f12 = map.get(m32354n);
            C5884f c5884f13 = map.get(m32354n2);
            if (c5884f12 != null) {
                C5887i c5887i2 = C5887i.f15449a;
                this.f15430n.put(m32354n, C5887i.m12734k(c5884f12));
            }
            if (c5884f13 != null) {
                this.f15430n.put(m32354n2, c5884f13);
            }
        }
    }

    public /* synthetic */ C5885g(Map map, C9756g c9756g) {
        this(map);
    }

    /* renamed from: b */
    public final C5884f m12680b(C5884f c5884f, String[] strArr, String str) {
        C9768m.m32346f(c5884f, "dense");
        C9768m.m32346f(strArr, "texts");
        C9768m.m32346f(str, "task");
        C5887i c5887i = C5887i.f15449a;
        C5884f m12726c = C5887i.m12726c(C5887i.m12728e(strArr, 128, this.f15419c), this.f15420d);
        C5887i.m12724a(m12726c, this.f15423g);
        C5887i.m12732i(m12726c);
        C5884f m12726c2 = C5887i.m12726c(m12726c, this.f15421e);
        C5887i.m12724a(m12726c2, this.f15424h);
        C5887i.m12732i(m12726c2);
        C5884f m12730g = C5887i.m12730g(m12726c2, 2);
        C5884f m12726c3 = C5887i.m12726c(m12730g, this.f15422f);
        C5887i.m12724a(m12726c3, this.f15425i);
        C5887i.m12732i(m12726c3);
        C5884f m12730g2 = C5887i.m12730g(m12726c, m12726c.m12674b(1));
        C5884f m12730g3 = C5887i.m12730g(m12730g, m12730g.m12674b(1));
        C5884f m12730g4 = C5887i.m12730g(m12726c3, m12726c3.m12674b(1));
        C5887i.m12729f(m12730g2, 1);
        C5887i.m12729f(m12730g3, 1);
        C5887i.m12729f(m12730g4, 1);
        C5884f m12727d = C5887i.m12727d(C5887i.m12725b(new C5884f[]{m12730g2, m12730g3, m12730g4, c5884f}), this.f15426j, this.f15428l);
        C5887i.m12732i(m12727d);
        C5884f m12727d2 = C5887i.m12727d(m12727d, this.f15427k, this.f15429m);
        C5887i.m12732i(m12727d2);
        C5884f c5884f2 = this.f15430n.get(C9768m.m32354n(str, ".weight"));
        C5884f c5884f3 = this.f15430n.get(C9768m.m32354n(str, ".bias"));
        if (c5884f2 == null || c5884f3 == null) {
            return null;
        }
        C5884f m12727d3 = C5887i.m12727d(m12727d2, c5884f2, c5884f3);
        C5887i.m12733j(m12727d3);
        return m12727d3;
    }
}
