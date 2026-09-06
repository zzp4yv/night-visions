package com.airbnb.lottie.p112s.p115k;

import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5221j;
import com.airbnb.lottie.p112s.p113i.C5222k;
import com.airbnb.lottie.p112s.p113i.C5223l;
import com.airbnb.lottie.p112s.p114j.C5232g;
import com.airbnb.lottie.p112s.p114j.InterfaceC5227b;
import com.airbnb.lottie.p119w.C5296a;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: Layer.java */
/* renamed from: com.airbnb.lottie.s.k.d */
/* loaded from: classes.dex */
public class C5246d {

    /* renamed from: a */
    private final List<InterfaceC5227b> f12834a;

    /* renamed from: b */
    private final C5155d f12835b;

    /* renamed from: c */
    private final String f12836c;

    /* renamed from: d */
    private final long f12837d;

    /* renamed from: e */
    private final a f12838e;

    /* renamed from: f */
    private final long f12839f;

    /* renamed from: g */
    private final String f12840g;

    /* renamed from: h */
    private final List<C5232g> f12841h;

    /* renamed from: i */
    private final C5223l f12842i;

    /* renamed from: j */
    private final int f12843j;

    /* renamed from: k */
    private final int f12844k;

    /* renamed from: l */
    private final int f12845l;

    /* renamed from: m */
    private final float f12846m;

    /* renamed from: n */
    private final float f12847n;

    /* renamed from: o */
    private final int f12848o;

    /* renamed from: p */
    private final int f12849p;

    /* renamed from: q */
    private final C5221j f12850q;

    /* renamed from: r */
    private final C5222k f12851r;

    /* renamed from: s */
    private final C5213b f12852s;

    /* renamed from: t */
    private final List<C5296a<Float>> f12853t;

    /* renamed from: u */
    private final b f12854u;

    /* compiled from: Layer.java */
    /* renamed from: com.airbnb.lottie.s.k.d$a */
    public enum a {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    /* compiled from: Layer.java */
    /* renamed from: com.airbnb.lottie.s.k.d$b */
    public enum b {
        None,
        Add,
        Invert,
        Unknown
    }

    public C5246d(List<InterfaceC5227b> list, C5155d c5155d, String str, long j2, a aVar, long j3, String str2, List<C5232g> list2, C5223l c5223l, int i2, int i3, int i4, float f2, float f3, int i5, int i6, C5221j c5221j, C5222k c5222k, List<C5296a<Float>> list3, b bVar, C5213b c5213b) {
        this.f12834a = list;
        this.f12835b = c5155d;
        this.f12836c = str;
        this.f12837d = j2;
        this.f12838e = aVar;
        this.f12839f = j3;
        this.f12840g = str2;
        this.f12841h = list2;
        this.f12842i = c5223l;
        this.f12843j = i2;
        this.f12844k = i3;
        this.f12845l = i4;
        this.f12846m = f2;
        this.f12847n = f3;
        this.f12848o = i5;
        this.f12849p = i6;
        this.f12850q = c5221j;
        this.f12851r = c5222k;
        this.f12853t = list3;
        this.f12854u = bVar;
        this.f12852s = c5213b;
    }

    /* renamed from: a */
    C5155d m9732a() {
        return this.f12835b;
    }

    /* renamed from: b */
    public long m9733b() {
        return this.f12837d;
    }

    /* renamed from: c */
    List<C5296a<Float>> m9734c() {
        return this.f12853t;
    }

    /* renamed from: d */
    public a m9735d() {
        return this.f12838e;
    }

    /* renamed from: e */
    List<C5232g> m9736e() {
        return this.f12841h;
    }

    /* renamed from: f */
    b m9737f() {
        return this.f12854u;
    }

    /* renamed from: g */
    String m9738g() {
        return this.f12836c;
    }

    /* renamed from: h */
    long m9739h() {
        return this.f12839f;
    }

    /* renamed from: i */
    int m9740i() {
        return this.f12849p;
    }

    /* renamed from: j */
    int m9741j() {
        return this.f12848o;
    }

    /* renamed from: k */
    String m9742k() {
        return this.f12840g;
    }

    /* renamed from: l */
    List<InterfaceC5227b> m9743l() {
        return this.f12834a;
    }

    /* renamed from: m */
    int m9744m() {
        return this.f12845l;
    }

    /* renamed from: n */
    int m9745n() {
        return this.f12844k;
    }

    /* renamed from: o */
    int m9746o() {
        return this.f12843j;
    }

    /* renamed from: p */
    float m9747p() {
        return this.f12847n / this.f12835b.m9399e();
    }

    /* renamed from: q */
    C5221j m9748q() {
        return this.f12850q;
    }

    /* renamed from: r */
    C5222k m9749r() {
        return this.f12851r;
    }

    /* renamed from: s */
    C5213b m9750s() {
        return this.f12852s;
    }

    /* renamed from: t */
    float m9751t() {
        return this.f12846m;
    }

    public String toString() {
        return m9753v(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: u */
    C5223l m9752u() {
        return this.f12842i;
    }

    /* renamed from: v */
    public String m9753v(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(m9738g());
        sb.append("\n");
        C5246d m9409o = this.f12835b.m9409o(m9739h());
        if (m9409o != null) {
            sb.append("\t\tParents: ");
            sb.append(m9409o.m9738g());
            C5246d m9409o2 = this.f12835b.m9409o(m9409o.m9739h());
            while (m9409o2 != null) {
                sb.append("->");
                sb.append(m9409o2.m9738g());
                m9409o2 = this.f12835b.m9409o(m9409o2.m9739h());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!m9736e().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(m9736e().size());
            sb.append("\n");
        }
        if (m9746o() != 0 && m9745n() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m9746o()), Integer.valueOf(m9745n()), Integer.valueOf(m9744m())));
        }
        if (!this.f12834a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (InterfaceC5227b interfaceC5227b : this.f12834a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(interfaceC5227b);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
