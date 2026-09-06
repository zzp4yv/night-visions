package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.AbstractC5360j;
import com.bumptech.glide.p141p.AbstractC5525a;
import com.bumptech.glide.p141p.C5526b;
import com.bumptech.glide.p141p.C5530f;
import com.bumptech.glide.p141p.C5532h;
import com.bumptech.glide.p141p.C5534j;
import com.bumptech.glide.p141p.C5535k;
import com.bumptech.glide.p141p.InterfaceC5528d;
import com.bumptech.glide.p141p.InterfaceC5529e;
import com.bumptech.glide.p141p.InterfaceC5531g;
import com.bumptech.glide.p141p.InterfaceFutureC5527c;
import com.bumptech.glide.p141p.p142l.AbstractC5545j;
import com.bumptech.glide.p141p.p142l.InterfaceC5544i;
import com.bumptech.glide.p144q.C5551a;
import com.bumptech.glide.p145r.C5558e;
import com.bumptech.glide.p145r.C5563j;
import com.bumptech.glide.p145r.C5564k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* renamed from: com.bumptech.glide.h */
/* loaded from: classes.dex */
public class C5321h<TranscodeType> extends AbstractC5525a<C5321h<TranscodeType>> implements Cloneable {

    /* renamed from: F */
    protected static final C5532h f13091F = new C5532h().m10898i(AbstractC5360j.f13396c).m10891b0(EnumC5320g.LOW).m10902k0(true);

    /* renamed from: G */
    private final Context f13092G;

    /* renamed from: H */
    private final C5322i f13093H;

    /* renamed from: I */
    private final Class<TranscodeType> f13094I;

    /* renamed from: J */
    private final ComponentCallbacks2C5316c f13095J;

    /* renamed from: K */
    private final C5318e f13096K;

    /* renamed from: L */
    private AbstractC5323j<?, ? super TranscodeType> f13097L;

    /* renamed from: M */
    private Object f13098M;

    /* renamed from: N */
    private List<InterfaceC5531g<TranscodeType>> f13099N;

    /* renamed from: O */
    private C5321h<TranscodeType> f13100O;

    /* renamed from: P */
    private C5321h<TranscodeType> f13101P;

    /* renamed from: Q */
    private Float f13102Q;

    /* renamed from: R */
    private boolean f13103R = true;

    /* renamed from: S */
    private boolean f13104S;

    /* renamed from: T */
    private boolean f13105T;

    /* compiled from: RequestBuilder.java */
    /* renamed from: com.bumptech.glide.h$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13106a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13107b;

        static {
            int[] iArr = new int[EnumC5320g.values().length];
            f13107b = iArr;
            try {
                iArr[EnumC5320g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13107b[EnumC5320g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13107b[EnumC5320g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13107b[EnumC5320g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f13106a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13106a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13106a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13106a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13106a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13106a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13106a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13106a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected C5321h(ComponentCallbacks2C5316c componentCallbacks2C5316c, C5322i c5322i, Class<TranscodeType> cls, Context context) {
        this.f13095J = componentCallbacks2C5316c;
        this.f13093H = c5322i;
        this.f13094I = cls;
        this.f13092G = context;
        this.f13097L = c5322i.m10039h(cls);
        this.f13096K = componentCallbacks2C5316c.m9985i();
        m10014z0(c5322i.m10037f());
        mo10026b(c5322i.m10038g());
    }

    /* renamed from: B0 */
    private <Y extends InterfaceC5544i<TranscodeType>> Y m10006B0(Y y, InterfaceC5531g<TranscodeType> interfaceC5531g, AbstractC5525a<?> abstractC5525a, Executor executor) {
        C5563j.m11042d(y);
        if (!this.f13104S) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC5528d m10010u0 = m10010u0(y, interfaceC5531g, abstractC5525a, executor);
        InterfaceC5528d request = y.getRequest();
        if (!m10010u0.mo10930e(request) || m10007E0(abstractC5525a, request)) {
            this.f13093H.m10036e(y);
            y.setRequest(m10010u0);
            this.f13093H.m10046o(y, m10010u0);
            return y;
        }
        m10010u0.mo10928c();
        if (!((InterfaceC5528d) C5563j.m11042d(request)).isRunning()) {
            request.mo10929d();
        }
        return y;
    }

    /* renamed from: E0 */
    private boolean m10007E0(AbstractC5525a<?> abstractC5525a, InterfaceC5528d interfaceC5528d) {
        return !abstractC5525a.m10876H() && interfaceC5528d.mo10937l();
    }

    /* renamed from: L0 */
    private C5321h<TranscodeType> m10008L0(Object obj) {
        this.f13098M = obj;
        this.f13104S = true;
        return this;
    }

    /* renamed from: N0 */
    private InterfaceC5528d m10009N0(InterfaceC5544i<TranscodeType> interfaceC5544i, InterfaceC5531g<TranscodeType> interfaceC5531g, AbstractC5525a<?> abstractC5525a, InterfaceC5529e interfaceC5529e, AbstractC5323j<?, ? super TranscodeType> abstractC5323j, EnumC5320g enumC5320g, int i2, int i3, Executor executor) {
        Context context = this.f13092G;
        C5318e c5318e = this.f13096K;
        return C5534j.m10950B(context, c5318e, this.f13098M, this.f13094I, abstractC5525a, i2, i3, enumC5320g, interfaceC5544i, interfaceC5531g, this.f13099N, interfaceC5529e, c5318e.m10002f(), abstractC5323j.m10051d(), executor);
    }

    /* renamed from: u0 */
    private InterfaceC5528d m10010u0(InterfaceC5544i<TranscodeType> interfaceC5544i, InterfaceC5531g<TranscodeType> interfaceC5531g, AbstractC5525a<?> abstractC5525a, Executor executor) {
        return m10011v0(interfaceC5544i, interfaceC5531g, null, this.f13097L, abstractC5525a.m10920w(), abstractC5525a.m10917t(), abstractC5525a.m10916s(), abstractC5525a, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v0 */
    private InterfaceC5528d m10011v0(InterfaceC5544i<TranscodeType> interfaceC5544i, InterfaceC5531g<TranscodeType> interfaceC5531g, InterfaceC5529e interfaceC5529e, AbstractC5323j<?, ? super TranscodeType> abstractC5323j, EnumC5320g enumC5320g, int i2, int i3, AbstractC5525a<?> abstractC5525a, Executor executor) {
        InterfaceC5529e interfaceC5529e2;
        InterfaceC5529e interfaceC5529e3;
        if (this.f13101P != null) {
            interfaceC5529e3 = new C5526b(interfaceC5529e);
            interfaceC5529e2 = interfaceC5529e3;
        } else {
            interfaceC5529e2 = null;
            interfaceC5529e3 = interfaceC5529e;
        }
        InterfaceC5528d m10012w0 = m10012w0(interfaceC5544i, interfaceC5531g, interfaceC5529e3, abstractC5323j, enumC5320g, i2, i3, abstractC5525a, executor);
        if (interfaceC5529e2 == null) {
            return m10012w0;
        }
        int m10917t = this.f13101P.m10917t();
        int m10916s = this.f13101P.m10916s();
        if (C5564k.m11063t(i2, i3) && !this.f13101P.m10882P()) {
            m10917t = abstractC5525a.m10917t();
            m10916s = abstractC5525a.m10916s();
        }
        C5321h<TranscodeType> c5321h = this.f13101P;
        C5526b c5526b = interfaceC5529e2;
        c5526b.m10939s(m10012w0, c5321h.m10011v0(interfaceC5544i, interfaceC5531g, interfaceC5529e2, c5321h.f13097L, c5321h.m10920w(), m10917t, m10916s, this.f13101P, executor));
        return c5526b;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bumptech.glide.p.a] */
    /* renamed from: w0 */
    private InterfaceC5528d m10012w0(InterfaceC5544i<TranscodeType> interfaceC5544i, InterfaceC5531g<TranscodeType> interfaceC5531g, InterfaceC5529e interfaceC5529e, AbstractC5323j<?, ? super TranscodeType> abstractC5323j, EnumC5320g enumC5320g, int i2, int i3, AbstractC5525a<?> abstractC5525a, Executor executor) {
        C5321h<TranscodeType> c5321h = this.f13100O;
        if (c5321h == null) {
            if (this.f13102Q == null) {
                return m10009N0(interfaceC5544i, interfaceC5531g, abstractC5525a, interfaceC5529e, abstractC5323j, enumC5320g, i2, i3, executor);
            }
            C5535k c5535k = new C5535k(interfaceC5529e);
            c5535k.m10976r(m10009N0(interfaceC5544i, interfaceC5531g, abstractC5525a, c5535k, abstractC5323j, enumC5320g, i2, i3, executor), m10009N0(interfaceC5544i, interfaceC5531g, abstractC5525a.clone().m10900j0(this.f13102Q.floatValue()), c5535k, abstractC5323j, m10013y0(enumC5320g), i2, i3, executor));
            return c5535k;
        }
        if (this.f13105T) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC5323j<?, ? super TranscodeType> abstractC5323j2 = c5321h.f13103R ? abstractC5323j : c5321h.f13097L;
        EnumC5320g m10920w = c5321h.m10877I() ? this.f13100O.m10920w() : m10013y0(enumC5320g);
        int m10917t = this.f13100O.m10917t();
        int m10916s = this.f13100O.m10916s();
        if (C5564k.m11063t(i2, i3) && !this.f13100O.m10882P()) {
            m10917t = abstractC5525a.m10917t();
            m10916s = abstractC5525a.m10916s();
        }
        int i4 = m10917t;
        int i5 = m10916s;
        C5535k c5535k2 = new C5535k(interfaceC5529e);
        InterfaceC5528d m10009N0 = m10009N0(interfaceC5544i, interfaceC5531g, abstractC5525a, c5535k2, abstractC5323j, enumC5320g, i2, i3, executor);
        this.f13105T = true;
        C5321h c5321h2 = (C5321h<TranscodeType>) this.f13100O;
        InterfaceC5528d m10011v0 = c5321h2.m10011v0(interfaceC5544i, interfaceC5531g, c5535k2, abstractC5323j2, m10920w, i4, i5, c5321h2, executor);
        this.f13105T = false;
        c5535k2.m10976r(m10009N0, m10011v0);
        return c5535k2;
    }

    /* renamed from: y0 */
    private EnumC5320g m10013y0(EnumC5320g enumC5320g) {
        int i2 = a.f13107b[enumC5320g.ordinal()];
        if (i2 == 1) {
            return EnumC5320g.NORMAL;
        }
        if (i2 == 2) {
            return EnumC5320g.HIGH;
        }
        if (i2 == 3 || i2 == 4) {
            return EnumC5320g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m10920w());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: z0 */
    private void m10014z0(List<InterfaceC5531g<Object>> list) {
        Iterator<InterfaceC5531g<Object>> it = list.iterator();
        while (it.hasNext()) {
            m10028s0((InterfaceC5531g) it.next());
        }
    }

    /* renamed from: A0 */
    public <Y extends InterfaceC5544i<TranscodeType>> Y m10015A0(Y y) {
        return (Y) m10016C0(y, null, C5558e.m11026b());
    }

    /* renamed from: C0 */
    <Y extends InterfaceC5544i<TranscodeType>> Y m10016C0(Y y, InterfaceC5531g<TranscodeType> interfaceC5531g, Executor executor) {
        return (Y) m10006B0(y, interfaceC5531g, this, executor);
    }

    /* renamed from: D0 */
    public AbstractC5545j<ImageView, TranscodeType> m10017D0(ImageView imageView) {
        C5321h<TranscodeType> c5321h;
        C5564k.m11045b();
        C5563j.m11042d(imageView);
        if (!m10881O() && m10879M() && imageView.getScaleType() != null) {
            switch (a.f13106a[imageView.getScaleType().ordinal()]) {
                case 1:
                    c5321h = clone().m10884R();
                    break;
                case 2:
                    c5321h = clone().m10885S();
                    break;
                case 3:
                case 4:
                case 5:
                    c5321h = clone().m10886T();
                    break;
                case 6:
                    c5321h = clone().m10885S();
                    break;
            }
            return (AbstractC5545j) m10006B0(this.f13096K.m9997a(imageView, this.f13094I), null, c5321h, C5558e.m11026b());
        }
        c5321h = this;
        return (AbstractC5545j) m10006B0(this.f13096K.m9997a(imageView, this.f13094I), null, c5321h, C5558e.m11026b());
    }

    /* renamed from: F0 */
    public C5321h<TranscodeType> m10018F0(InterfaceC5531g<TranscodeType> interfaceC5531g) {
        this.f13099N = null;
        return m10028s0(interfaceC5531g);
    }

    /* renamed from: G0 */
    public C5321h<TranscodeType> m10019G0(Uri uri) {
        return m10008L0(uri);
    }

    /* renamed from: H0 */
    public C5321h<TranscodeType> m10020H0(Integer num) {
        return m10008L0(num).mo10026b(C5532h.m10946v0(C5551a.m11011c(this.f13092G)));
    }

    /* renamed from: I0 */
    public C5321h<TranscodeType> m10021I0(Object obj) {
        return m10008L0(obj);
    }

    /* renamed from: K0 */
    public C5321h<TranscodeType> m10022K0(String str) {
        return m10008L0(str);
    }

    /* renamed from: O0 */
    public InterfaceFutureC5527c<TranscodeType> m10023O0() {
        return m10024P0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: P0 */
    public InterfaceFutureC5527c<TranscodeType> m10024P0(int i2, int i3) {
        C5530f c5530f = new C5530f(i2, i3);
        return (InterfaceFutureC5527c) m10016C0(c5530f, c5530f, C5558e.m11025a());
    }

    /* renamed from: Q0 */
    public C5321h<TranscodeType> m10025Q0(AbstractC5323j<?, ? super TranscodeType> abstractC5323j) {
        this.f13097L = (AbstractC5323j) C5563j.m11042d(abstractC5323j);
        this.f13103R = false;
        return this;
    }

    /* renamed from: s0 */
    public C5321h<TranscodeType> m10028s0(InterfaceC5531g<TranscodeType> interfaceC5531g) {
        if (interfaceC5531g != null) {
            if (this.f13099N == null) {
                this.f13099N = new ArrayList();
            }
            this.f13099N.add(interfaceC5531g);
        }
        return this;
    }

    @Override // com.bumptech.glide.p141p.AbstractC5525a
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C5321h<TranscodeType> mo10026b(AbstractC5525a<?> abstractC5525a) {
        C5563j.m11042d(abstractC5525a);
        return (C5321h) super.mo10026b(abstractC5525a);
    }

    @Override // com.bumptech.glide.p141p.AbstractC5525a
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C5321h<TranscodeType> clone() {
        C5321h<TranscodeType> c5321h = (C5321h) super.clone();
        c5321h.f13097L = (AbstractC5323j<?, ? super TranscodeType>) c5321h.f13097L.clone();
        return c5321h;
    }
}
