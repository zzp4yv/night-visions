package com.bumptech.glide.p141p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.file.CacheHelper;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.C5391g;
import com.bumptech.glide.load.C5392h;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5333b;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.load.engine.AbstractC5360j;
import com.bumptech.glide.load.p131o.p132c.AbstractC5457k;
import com.bumptech.glide.load.p131o.p132c.C5453g;
import com.bumptech.glide.load.p131o.p132c.C5454h;
import com.bumptech.glide.load.p131o.p132c.C5458l;
import com.bumptech.glide.load.p131o.p132c.C5460n;
import com.bumptech.glide.load.p131o.p132c.C5462p;
import com.bumptech.glide.load.p131o.p136g.C5484c;
import com.bumptech.glide.load.p131o.p136g.C5487f;
import com.bumptech.glide.load.p131o.p136g.C5490i;
import com.bumptech.glide.p141p.AbstractC5525a;
import com.bumptech.glide.p144q.C5552b;
import com.bumptech.glide.p145r.C5555b;
import com.bumptech.glide.p145r.C5563j;
import com.bumptech.glide.p145r.C5564k;
import com.google.android.gms.ads.AdRequest;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* compiled from: BaseRequestOptions.java */
/* renamed from: com.bumptech.glide.p.a */
/* loaded from: classes.dex */
public abstract class AbstractC5525a<T extends AbstractC5525a<T>> implements Cloneable {

    /* renamed from: A */
    private boolean f13909A;

    /* renamed from: B */
    private boolean f13910B;

    /* renamed from: C */
    private boolean f13911C;

    /* renamed from: E */
    private boolean f13913E;

    /* renamed from: f */
    private int f13914f;

    /* renamed from: j */
    private Drawable f13918j;

    /* renamed from: k */
    private int f13919k;

    /* renamed from: l */
    private Drawable f13920l;

    /* renamed from: m */
    private int f13921m;

    /* renamed from: r */
    private boolean f13926r;

    /* renamed from: t */
    private Drawable f13928t;

    /* renamed from: u */
    private int f13929u;

    /* renamed from: y */
    private boolean f13933y;

    /* renamed from: z */
    private Resources.Theme f13934z;

    /* renamed from: g */
    private float f13915g = 1.0f;

    /* renamed from: h */
    private AbstractC5360j f13916h = AbstractC5360j.f13398e;

    /* renamed from: i */
    private EnumC5320g f13917i = EnumC5320g.NORMAL;

    /* renamed from: n */
    private boolean f13922n = true;

    /* renamed from: o */
    private int f13923o = -1;

    /* renamed from: p */
    private int f13924p = -1;

    /* renamed from: q */
    private InterfaceC5390f f13925q = C5552b.m11013a();

    /* renamed from: s */
    private boolean f13927s = true;

    /* renamed from: v */
    private C5393i f13930v = new C5393i();

    /* renamed from: w */
    private Map<Class<?>, InterfaceC5396l<?>> f13931w = new C5555b();

    /* renamed from: x */
    private Class<?> f13932x = Object.class;

    /* renamed from: D */
    private boolean f13912D = true;

    /* renamed from: K */
    private boolean m10863K(int i2) {
        return m10864L(this.f13914f, i2);
    }

    /* renamed from: L */
    private static boolean m10864L(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    /* renamed from: U */
    private T m10865U(AbstractC5457k abstractC5457k, InterfaceC5396l<Bitmap> interfaceC5396l) {
        return m10866c0(abstractC5457k, interfaceC5396l, false);
    }

    /* renamed from: c0 */
    private T m10866c0(AbstractC5457k abstractC5457k, InterfaceC5396l<Bitmap> interfaceC5396l, boolean z) {
        T m10908n0 = z ? m10908n0(abstractC5457k, interfaceC5396l) : m10887V(abstractC5457k, interfaceC5396l);
        m10908n0.f13912D = true;
        return m10908n0;
    }

    /* renamed from: d0 */
    private T m10867d0() {
        return this;
    }

    /* renamed from: f0 */
    private T m10868f0() {
        if (this.f13933y) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return m10867d0();
    }

    /* renamed from: A */
    public final Class<?> m10869A() {
        return this.f13932x;
    }

    /* renamed from: B */
    public final InterfaceC5390f m10870B() {
        return this.f13925q;
    }

    /* renamed from: C */
    public final float m10871C() {
        return this.f13915g;
    }

    /* renamed from: D */
    public final Resources.Theme m10872D() {
        return this.f13934z;
    }

    /* renamed from: E */
    public final Map<Class<?>, InterfaceC5396l<?>> m10873E() {
        return this.f13931w;
    }

    /* renamed from: F */
    public final boolean m10874F() {
        return this.f13913E;
    }

    /* renamed from: G */
    public final boolean m10875G() {
        return this.f13910B;
    }

    /* renamed from: H */
    public final boolean m10876H() {
        return this.f13922n;
    }

    /* renamed from: I */
    public final boolean m10877I() {
        return m10863K(8);
    }

    /* renamed from: J */
    boolean m10878J() {
        return this.f13912D;
    }

    /* renamed from: M */
    public final boolean m10879M() {
        return this.f13927s;
    }

    /* renamed from: N */
    public final boolean m10880N() {
        return this.f13926r;
    }

    /* renamed from: O */
    public final boolean m10881O() {
        return m10863K(RecyclerView.AbstractC0599l.FLAG_MOVED);
    }

    /* renamed from: P */
    public final boolean m10882P() {
        return C5564k.m11063t(this.f13924p, this.f13923o);
    }

    /* renamed from: Q */
    public T m10883Q() {
        this.f13933y = true;
        return m10867d0();
    }

    /* renamed from: R */
    public T m10884R() {
        return m10887V(AbstractC5457k.f13728b, new C5453g());
    }

    /* renamed from: S */
    public T m10885S() {
        return m10865U(AbstractC5457k.f13731e, new C5454h());
    }

    /* renamed from: T */
    public T m10886T() {
        return m10865U(AbstractC5457k.f13727a, new C5462p());
    }

    /* renamed from: V */
    final T m10887V(AbstractC5457k abstractC5457k, InterfaceC5396l<Bitmap> interfaceC5396l) {
        if (this.f13909A) {
            return (T) clone().m10887V(abstractC5457k, interfaceC5396l);
        }
        m10899j(abstractC5457k);
        return m10906m0(interfaceC5396l, false);
    }

    /* renamed from: X */
    public T m10888X(int i2, int i3) {
        if (this.f13909A) {
            return (T) clone().m10888X(i2, i3);
        }
        this.f13924p = i2;
        this.f13923o = i3;
        this.f13914f |= AdRequest.MAX_CONTENT_URL_LENGTH;
        return m10868f0();
    }

    /* renamed from: Z */
    public T m10889Z(int i2) {
        if (this.f13909A) {
            return (T) clone().m10889Z(i2);
        }
        this.f13921m = i2;
        int i3 = this.f13914f | 128;
        this.f13914f = i3;
        this.f13920l = null;
        this.f13914f = i3 & (-65);
        return m10868f0();
    }

    /* renamed from: a0 */
    public T m10890a0(Drawable drawable) {
        if (this.f13909A) {
            return (T) clone().m10890a0(drawable);
        }
        this.f13920l = drawable;
        int i2 = this.f13914f | 64;
        this.f13914f = i2;
        this.f13921m = 0;
        this.f13914f = i2 & (-129);
        return m10868f0();
    }

    /* renamed from: b */
    public T mo10026b(AbstractC5525a<?> abstractC5525a) {
        if (this.f13909A) {
            return (T) clone().mo10026b(abstractC5525a);
        }
        if (m10864L(abstractC5525a.f13914f, 2)) {
            this.f13915g = abstractC5525a.f13915g;
        }
        if (m10864L(abstractC5525a.f13914f, 262144)) {
            this.f13910B = abstractC5525a.f13910B;
        }
        if (m10864L(abstractC5525a.f13914f, CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES)) {
            this.f13913E = abstractC5525a.f13913E;
        }
        if (m10864L(abstractC5525a.f13914f, 4)) {
            this.f13916h = abstractC5525a.f13916h;
        }
        if (m10864L(abstractC5525a.f13914f, 8)) {
            this.f13917i = abstractC5525a.f13917i;
        }
        if (m10864L(abstractC5525a.f13914f, 16)) {
            this.f13918j = abstractC5525a.f13918j;
            this.f13919k = 0;
            this.f13914f &= -33;
        }
        if (m10864L(abstractC5525a.f13914f, 32)) {
            this.f13919k = abstractC5525a.f13919k;
            this.f13918j = null;
            this.f13914f &= -17;
        }
        if (m10864L(abstractC5525a.f13914f, 64)) {
            this.f13920l = abstractC5525a.f13920l;
            this.f13921m = 0;
            this.f13914f &= -129;
        }
        if (m10864L(abstractC5525a.f13914f, 128)) {
            this.f13921m = abstractC5525a.f13921m;
            this.f13920l = null;
            this.f13914f &= -65;
        }
        if (m10864L(abstractC5525a.f13914f, 256)) {
            this.f13922n = abstractC5525a.f13922n;
        }
        if (m10864L(abstractC5525a.f13914f, AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.f13924p = abstractC5525a.f13924p;
            this.f13923o = abstractC5525a.f13923o;
        }
        if (m10864L(abstractC5525a.f13914f, 1024)) {
            this.f13925q = abstractC5525a.f13925q;
        }
        if (m10864L(abstractC5525a.f13914f, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.f13932x = abstractC5525a.f13932x;
        }
        if (m10864L(abstractC5525a.f13914f, 8192)) {
            this.f13928t = abstractC5525a.f13928t;
            this.f13929u = 0;
            this.f13914f &= -16385;
        }
        if (m10864L(abstractC5525a.f13914f, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f13929u = abstractC5525a.f13929u;
            this.f13928t = null;
            this.f13914f &= -8193;
        }
        if (m10864L(abstractC5525a.f13914f, 32768)) {
            this.f13934z = abstractC5525a.f13934z;
        }
        if (m10864L(abstractC5525a.f13914f, 65536)) {
            this.f13927s = abstractC5525a.f13927s;
        }
        if (m10864L(abstractC5525a.f13914f, 131072)) {
            this.f13926r = abstractC5525a.f13926r;
        }
        if (m10864L(abstractC5525a.f13914f, RecyclerView.AbstractC0599l.FLAG_MOVED)) {
            this.f13931w.putAll(abstractC5525a.f13931w);
            this.f13912D = abstractC5525a.f13912D;
        }
        if (m10864L(abstractC5525a.f13914f, 524288)) {
            this.f13911C = abstractC5525a.f13911C;
        }
        if (!this.f13927s) {
            this.f13931w.clear();
            int i2 = this.f13914f & (-2049);
            this.f13914f = i2;
            this.f13926r = false;
            this.f13914f = i2 & (-131073);
            this.f13912D = true;
        }
        this.f13914f |= abstractC5525a.f13914f;
        this.f13930v.m10450b(abstractC5525a.f13930v);
        return m10868f0();
    }

    /* renamed from: b0 */
    public T m10891b0(EnumC5320g enumC5320g) {
        if (this.f13909A) {
            return (T) clone().m10891b0(enumC5320g);
        }
        this.f13917i = (EnumC5320g) C5563j.m11042d(enumC5320g);
        this.f13914f |= 8;
        return m10868f0();
    }

    /* renamed from: d */
    public T m10892d() {
        if (this.f13933y && !this.f13909A) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f13909A = true;
        return m10883Q();
    }

    /* renamed from: e */
    public T m10893e() {
        return m10908n0(AbstractC5457k.f13728b, new C5453g());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5525a)) {
            return false;
        }
        AbstractC5525a abstractC5525a = (AbstractC5525a) obj;
        return Float.compare(abstractC5525a.f13915g, this.f13915g) == 0 && this.f13919k == abstractC5525a.f13919k && C5564k.m11047d(this.f13918j, abstractC5525a.f13918j) && this.f13921m == abstractC5525a.f13921m && C5564k.m11047d(this.f13920l, abstractC5525a.f13920l) && this.f13929u == abstractC5525a.f13929u && C5564k.m11047d(this.f13928t, abstractC5525a.f13928t) && this.f13922n == abstractC5525a.f13922n && this.f13923o == abstractC5525a.f13923o && this.f13924p == abstractC5525a.f13924p && this.f13926r == abstractC5525a.f13926r && this.f13927s == abstractC5525a.f13927s && this.f13910B == abstractC5525a.f13910B && this.f13911C == abstractC5525a.f13911C && this.f13916h.equals(abstractC5525a.f13916h) && this.f13917i == abstractC5525a.f13917i && this.f13930v.equals(abstractC5525a.f13930v) && this.f13931w.equals(abstractC5525a.f13931w) && this.f13932x.equals(abstractC5525a.f13932x) && C5564k.m11047d(this.f13925q, abstractC5525a.f13925q) && C5564k.m11047d(this.f13934z, abstractC5525a.f13934z);
    }

    @Override // 
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            C5393i c5393i = new C5393i();
            t.f13930v = c5393i;
            c5393i.m10450b(this.f13930v);
            C5555b c5555b = new C5555b();
            t.f13931w = c5555b;
            c5555b.putAll(this.f13931w);
            t.f13933y = false;
            t.f13909A = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: g */
    public T m10894g(Class<?> cls) {
        if (this.f13909A) {
            return (T) clone().m10894g(cls);
        }
        this.f13932x = (Class) C5563j.m11042d(cls);
        this.f13914f |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
        return m10868f0();
    }

    /* renamed from: g0 */
    public <Y> T m10895g0(C5392h<Y> c5392h, Y y) {
        if (this.f13909A) {
            return (T) clone().m10895g0(c5392h, y);
        }
        C5563j.m11042d(c5392h);
        C5563j.m11042d(y);
        this.f13930v.m10451c(c5392h, y);
        return m10868f0();
    }

    /* renamed from: h */
    public T m10896h() {
        return m10895g0(C5458l.f13741d, Boolean.FALSE);
    }

    /* renamed from: h0 */
    public T m10897h0(InterfaceC5390f interfaceC5390f) {
        if (this.f13909A) {
            return (T) clone().m10897h0(interfaceC5390f);
        }
        this.f13925q = (InterfaceC5390f) C5563j.m11042d(interfaceC5390f);
        this.f13914f |= 1024;
        return m10868f0();
    }

    public int hashCode() {
        return C5564k.m11058o(this.f13934z, C5564k.m11058o(this.f13925q, C5564k.m11058o(this.f13932x, C5564k.m11058o(this.f13931w, C5564k.m11058o(this.f13930v, C5564k.m11058o(this.f13917i, C5564k.m11058o(this.f13916h, C5564k.m11059p(this.f13911C, C5564k.m11059p(this.f13910B, C5564k.m11059p(this.f13927s, C5564k.m11059p(this.f13926r, C5564k.m11057n(this.f13924p, C5564k.m11057n(this.f13923o, C5564k.m11059p(this.f13922n, C5564k.m11058o(this.f13928t, C5564k.m11057n(this.f13929u, C5564k.m11058o(this.f13920l, C5564k.m11057n(this.f13921m, C5564k.m11058o(this.f13918j, C5564k.m11057n(this.f13919k, C5564k.m11054k(this.f13915g)))))))))))))))))))));
    }

    /* renamed from: i */
    public T m10898i(AbstractC5360j abstractC5360j) {
        if (this.f13909A) {
            return (T) clone().m10898i(abstractC5360j);
        }
        this.f13916h = (AbstractC5360j) C5563j.m11042d(abstractC5360j);
        this.f13914f |= 4;
        return m10868f0();
    }

    /* renamed from: j */
    public T m10899j(AbstractC5457k abstractC5457k) {
        return m10895g0(AbstractC5457k.f13734h, C5563j.m11042d(abstractC5457k));
    }

    /* renamed from: j0 */
    public T m10900j0(float f2) {
        if (this.f13909A) {
            return (T) clone().m10900j0(f2);
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f13915g = f2;
        this.f13914f |= 2;
        return m10868f0();
    }

    /* renamed from: k */
    public T m10901k(EnumC5333b enumC5333b) {
        C5563j.m11042d(enumC5333b);
        return (T) m10895g0(C5458l.f13738a, enumC5333b).m10895g0(C5490i.f13839a, enumC5333b);
    }

    /* renamed from: k0 */
    public T m10902k0(boolean z) {
        if (this.f13909A) {
            return (T) clone().m10902k0(true);
        }
        this.f13922n = !z;
        this.f13914f |= 256;
        return m10868f0();
    }

    /* renamed from: l */
    public final AbstractC5360j m10903l() {
        return this.f13916h;
    }

    /* renamed from: l0 */
    public T m10904l0(InterfaceC5396l<Bitmap> interfaceC5396l) {
        return m10906m0(interfaceC5396l, true);
    }

    /* renamed from: m */
    public final int m10905m() {
        return this.f13919k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m0 */
    T m10906m0(InterfaceC5396l<Bitmap> interfaceC5396l, boolean z) {
        if (this.f13909A) {
            return (T) clone().m10906m0(interfaceC5396l, z);
        }
        C5460n c5460n = new C5460n(interfaceC5396l, z);
        m10910o0(Bitmap.class, interfaceC5396l, z);
        m10910o0(Drawable.class, c5460n, z);
        m10910o0(BitmapDrawable.class, c5460n.m10657a(), z);
        m10910o0(C5484c.class, new C5487f(interfaceC5396l), z);
        return m10868f0();
    }

    /* renamed from: n */
    public final Drawable m10907n() {
        return this.f13918j;
    }

    /* renamed from: n0 */
    final T m10908n0(AbstractC5457k abstractC5457k, InterfaceC5396l<Bitmap> interfaceC5396l) {
        if (this.f13909A) {
            return (T) clone().m10908n0(abstractC5457k, interfaceC5396l);
        }
        m10899j(abstractC5457k);
        return m10904l0(interfaceC5396l);
    }

    /* renamed from: o */
    public final Drawable m10909o() {
        return this.f13928t;
    }

    /* renamed from: o0 */
    <Y> T m10910o0(Class<Y> cls, InterfaceC5396l<Y> interfaceC5396l, boolean z) {
        if (this.f13909A) {
            return (T) clone().m10910o0(cls, interfaceC5396l, z);
        }
        C5563j.m11042d(cls);
        C5563j.m11042d(interfaceC5396l);
        this.f13931w.put(cls, interfaceC5396l);
        int i2 = this.f13914f | RecyclerView.AbstractC0599l.FLAG_MOVED;
        this.f13914f = i2;
        this.f13927s = true;
        int i3 = i2 | 65536;
        this.f13914f = i3;
        this.f13912D = false;
        if (z) {
            this.f13914f = i3 | 131072;
            this.f13926r = true;
        }
        return m10868f0();
    }

    /* renamed from: p */
    public final int m10911p() {
        return this.f13929u;
    }

    /* renamed from: q */
    public final boolean m10912q() {
        return this.f13911C;
    }

    @Deprecated
    /* renamed from: q0 */
    public T m10913q0(InterfaceC5396l<Bitmap>... interfaceC5396lArr) {
        return m10906m0(new C5391g(interfaceC5396lArr), true);
    }

    /* renamed from: r */
    public final C5393i m10914r() {
        return this.f13930v;
    }

    /* renamed from: r0 */
    public T m10915r0(boolean z) {
        if (this.f13909A) {
            return (T) clone().m10915r0(z);
        }
        this.f13913E = z;
        this.f13914f |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
        return m10868f0();
    }

    /* renamed from: s */
    public final int m10916s() {
        return this.f13923o;
    }

    /* renamed from: t */
    public final int m10917t() {
        return this.f13924p;
    }

    /* renamed from: u */
    public final Drawable m10918u() {
        return this.f13920l;
    }

    /* renamed from: v */
    public final int m10919v() {
        return this.f13921m;
    }

    /* renamed from: w */
    public final EnumC5320g m10920w() {
        return this.f13917i;
    }
}
