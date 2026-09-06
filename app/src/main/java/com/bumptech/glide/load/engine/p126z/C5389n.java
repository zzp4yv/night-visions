package com.bumptech.glide.load.engine.p126z;

import android.graphics.Bitmap;
import android.os.Build;
import com.bumptech.glide.p145r.C5564k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* compiled from: SizeConfigStrategy.java */
/* renamed from: com.bumptech.glide.load.engine.z.n */
/* loaded from: classes.dex */
public class C5389n implements InterfaceC5387l {

    /* renamed from: a */
    private static final Bitmap.Config[] f13543a;

    /* renamed from: b */
    private static final Bitmap.Config[] f13544b;

    /* renamed from: c */
    private static final Bitmap.Config[] f13545c;

    /* renamed from: d */
    private static final Bitmap.Config[] f13546d;

    /* renamed from: e */
    private static final Bitmap.Config[] f13547e;

    /* renamed from: f */
    private final c f13548f = new c();

    /* renamed from: g */
    private final C5383h<b, Bitmap> f13549g = new C5383h<>();

    /* renamed from: h */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f13550h = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.n$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13551a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f13551a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13551a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13551a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13551a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.n$b */
    static final class b implements InterfaceC5388m {

        /* renamed from: a */
        private final c f13552a;

        /* renamed from: b */
        int f13553b;

        /* renamed from: c */
        private Bitmap.Config f13554c;

        public b(c cVar) {
            this.f13552a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5388m
        /* renamed from: a */
        public void mo10378a() {
            this.f13552a.m10384c(this);
        }

        /* renamed from: b */
        public void m10437b(int i2, Bitmap.Config config) {
            this.f13553b = i2;
            this.f13554c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f13553b == bVar.f13553b && C5564k.m11047d(this.f13554c, bVar.f13554c);
        }

        public int hashCode() {
            int i2 = this.f13553b * 31;
            Bitmap.Config config = this.f13554c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C5389n.m10434i(this.f13553b, this.f13554c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.n$c */
    static class c extends AbstractC5379d<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.p126z.AbstractC5379d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo10380a() {
            return new b(this);
        }

        /* renamed from: e */
        public b m10439e(int i2, Bitmap.Config config) {
            b m10383b = m10383b();
            m10383b.m10437b(i2, config);
            return m10383b;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f13543a = configArr;
        f13544b = configArr;
        f13545c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f13546d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f13547e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: g */
    private void m10432g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> m10436k = m10436k(bitmap.getConfig());
        Integer num2 = (Integer) m10436k.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m10436k.remove(num);
                return;
            } else {
                m10436k.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo10377f(bitmap) + ", this: " + this);
    }

    /* renamed from: h */
    private b m10433h(int i2, Bitmap.Config config) {
        b m10439e = this.f13548f.m10439e(i2, config);
        for (Bitmap.Config config2 : m10435j(config)) {
            Integer ceilingKey = m10436k(config2).ceilingKey(Integer.valueOf(i2));
            if (ceilingKey != null && ceilingKey.intValue() <= i2 * 8) {
                if (ceilingKey.intValue() == i2) {
                    if (config2 == null) {
                        if (config == null) {
                            return m10439e;
                        }
                    } else if (config2.equals(config)) {
                        return m10439e;
                    }
                }
                this.f13548f.m10384c(m10439e);
                return this.f13548f.m10439e(ceilingKey.intValue(), config2);
            }
        }
        return m10439e;
    }

    /* renamed from: i */
    static String m10434i(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    /* renamed from: j */
    private static Bitmap.Config[] m10435j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f13544b;
        }
        int i2 = a.f13551a[config.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new Bitmap.Config[]{config} : f13547e : f13546d : f13545c : f13543a;
    }

    /* renamed from: k */
    private NavigableMap<Integer, Integer> m10436k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f13550h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f13550h.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5387l
    /* renamed from: a */
    public Bitmap mo10372a() {
        Bitmap m10398f = this.f13549g.m10398f();
        if (m10398f != null) {
            m10432g(Integer.valueOf(C5564k.m11051h(m10398f)), m10398f);
        }
        return m10398f;
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5387l
    /* renamed from: b */
    public String mo10373b(int i2, int i3, Bitmap.Config config) {
        return m10434i(C5564k.m11050g(i2, i3, config), config);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5387l
    /* renamed from: c */
    public void mo10374c(Bitmap bitmap) {
        b m10439e = this.f13548f.m10439e(C5564k.m11051h(bitmap), bitmap.getConfig());
        this.f13549g.m10397d(m10439e, bitmap);
        NavigableMap<Integer, Integer> m10436k = m10436k(bitmap.getConfig());
        Integer num = (Integer) m10436k.get(Integer.valueOf(m10439e.f13553b));
        m10436k.put(Integer.valueOf(m10439e.f13553b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5387l
    /* renamed from: d */
    public Bitmap mo10375d(int i2, int i3, Bitmap.Config config) {
        b m10433h = m10433h(C5564k.m11050g(i2, i3, config), config);
        Bitmap m10396a = this.f13549g.m10396a(m10433h);
        if (m10396a != null) {
            m10432g(Integer.valueOf(m10433h.f13553b), m10396a);
            m10396a.reconfigure(i2, i3, config);
        }
        return m10396a;
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5387l
    /* renamed from: e */
    public int mo10376e(Bitmap bitmap) {
        return C5564k.m11051h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5387l
    /* renamed from: f */
    public String mo10377f(Bitmap bitmap) {
        return m10434i(C5564k.m11051h(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f13549g);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f13550h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f13550h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), HttpUrl.FRAGMENT_ENCODE_SET);
        }
        sb.append(")}");
        return sb.toString();
    }
}
