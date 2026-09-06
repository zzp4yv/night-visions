package com.bumptech.glide.load.p131o.p132c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C5336e;
import com.bumptech.glide.load.C5392h;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5333b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.load.p131o.p132c.AbstractC5457k;
import com.bumptech.glide.p145r.C5559f;
import com.bumptech.glide.p145r.C5563j;
import com.bumptech.glide.p145r.C5564k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import okhttp3.HttpUrl;

/* compiled from: Downsampler.java */
/* renamed from: com.bumptech.glide.load.o.c.l */
/* loaded from: classes.dex */
public final class C5458l {

    /* renamed from: a */
    public static final C5392h<EnumC5333b> f13738a = C5392h.m10444f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC5333b.f13225h);

    /* renamed from: b */
    @Deprecated
    public static final C5392h<AbstractC5457k> f13739b = AbstractC5457k.f13734h;

    /* renamed from: c */
    public static final C5392h<Boolean> f13740c;

    /* renamed from: d */
    public static final C5392h<Boolean> f13741d;

    /* renamed from: e */
    private static final Set<String> f13742e;

    /* renamed from: f */
    private static final b f13743f;

    /* renamed from: g */
    private static final Set<ImageHeaderParser.ImageType> f13744g;

    /* renamed from: h */
    private static final Queue<BitmapFactory.Options> f13745h;

    /* renamed from: i */
    private final InterfaceC5380e f13746i;

    /* renamed from: j */
    private final DisplayMetrics f13747j;

    /* renamed from: k */
    private final InterfaceC5377b f13748k;

    /* renamed from: l */
    private final List<ImageHeaderParser> f13749l;

    /* renamed from: m */
    private final C5463q f13750m = C5463q.m10658a();

    /* compiled from: Downsampler.java */
    /* renamed from: com.bumptech.glide.load.o.c.l$a */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5458l.b
        /* renamed from: a */
        public void mo10652a(InterfaceC5380e interfaceC5380e, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5458l.b
        /* renamed from: b */
        public void mo10653b() {
        }
    }

    /* compiled from: Downsampler.java */
    /* renamed from: com.bumptech.glide.load.o.c.l$b */
    public interface b {
        /* renamed from: a */
        void mo10652a(InterfaceC5380e interfaceC5380e, Bitmap bitmap) throws IOException;

        /* renamed from: b */
        void mo10653b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f13740c = C5392h.m10444f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f13741d = C5392h.m10444f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f13742e = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f13743f = new a();
        f13744g = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f13745h = C5564k.m11049f(0);
    }

    public C5458l(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC5380e interfaceC5380e, InterfaceC5377b interfaceC5377b) {
        this.f13749l = list;
        this.f13747j = (DisplayMetrics) C5563j.m11042d(displayMetrics);
        this.f13746i = (InterfaceC5380e) C5563j.m11042d(interfaceC5380e);
        this.f13748k = (InterfaceC5377b) C5563j.m11042d(interfaceC5377b);
    }

    /* renamed from: a */
    private static int m10630a(double d2) {
        int m10637j = m10637j(d2);
        double d3 = m10637j;
        Double.isNaN(d3);
        int m10645t = m10645t(d3 * d2);
        double d4 = m10645t / m10637j;
        Double.isNaN(d4);
        double d5 = m10645t;
        Double.isNaN(d5);
        return m10645t((d2 / d4) * d5);
    }

    /* renamed from: b */
    private void m10631b(InputStream inputStream, EnumC5333b enumC5333b, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        if (this.f13750m.m10660c(i2, i3, options, enumC5333b, z, z2)) {
            return;
        }
        if (enumC5333b == EnumC5333b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        boolean z3 = false;
        try {
            z3 = C5336e.m10157b(this.f13749l, inputStream, this.f13748k).hasAlpha();
        } catch (IOException e2) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + enumC5333b, e2);
            }
        }
        Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    /* renamed from: c */
    private static void m10632c(ImageHeaderParser.ImageType imageType, InputStream inputStream, b bVar, InterfaceC5380e interfaceC5380e, AbstractC5457k abstractC5457k, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int floor;
        double floor2;
        int i9;
        if (i3 <= 0 || i4 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i5 + "x" + i6 + "]");
                return;
            }
            return;
        }
        float mo10629b = (i2 == 90 || i2 == 270) ? abstractC5457k.mo10629b(i4, i3, i5, i6) : abstractC5457k.mo10629b(i3, i4, i5, i6);
        if (mo10629b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + mo10629b + " from: " + abstractC5457k + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "]");
        }
        AbstractC5457k.g mo10628a = abstractC5457k.mo10628a(i3, i4, i5, i6);
        if (mo10628a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f2 = i3;
        float f3 = i4;
        int m10645t = i3 / m10645t(mo10629b * f2);
        int m10645t2 = i4 / m10645t(mo10629b * f3);
        AbstractC5457k.g gVar = AbstractC5457k.g.MEMORY;
        int max = mo10628a == gVar ? Math.max(m10645t, m10645t2) : Math.min(m10645t, m10645t2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 23 || !f13742e.contains(options.outMimeType)) {
            int max2 = Math.max(1, Integer.highestOneBit(max));
            i7 = (mo10628a != gVar || ((float) max2) >= 1.0f / mo10629b) ? max2 : max2 << 1;
        } else {
            i7 = 1;
        }
        options.inSampleSize = i7;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(i7, 8);
            i8 = i10;
            floor = (int) Math.ceil(f2 / min);
            i9 = (int) Math.ceil(f3 / min);
            int i11 = i7 / 8;
            if (i11 > 0) {
                floor /= i11;
                i9 /= i11;
            }
        } else {
            i8 = i10;
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f4 = i7;
                floor = (int) Math.floor(f2 / f4);
                floor2 = Math.floor(f3 / f4);
            } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                if (i8 >= 24) {
                    float f5 = i7;
                    floor = Math.round(f2 / f5);
                    i9 = Math.round(f3 / f5);
                } else {
                    float f6 = i7;
                    floor = (int) Math.floor(f2 / f6);
                    floor2 = Math.floor(f3 / f6);
                }
            } else if (i3 % i7 == 0 && i4 % i7 == 0) {
                floor = i3 / i7;
                i9 = i4 / i7;
            } else {
                int[] m10638k = m10638k(inputStream, options, bVar, interfaceC5380e);
                int i12 = m10638k[0];
                i9 = m10638k[1];
                floor = i12;
            }
            i9 = (int) floor2;
        }
        double mo10629b2 = abstractC5457k.mo10629b(floor, i9, i5, i6);
        if (i8 >= 19) {
            options.inTargetDensity = m10630a(mo10629b2);
            options.inDensity = m10637j(mo10629b2);
        }
        if (m10640o(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "], power of two scaled: [" + floor + "x" + i9 + "], exact scale factor: " + mo10629b + ", power of 2 sample size: " + i7 + ", adjusted scale factor: " + mo10629b2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    /* renamed from: f */
    private Bitmap m10633f(InputStream inputStream, BitmapFactory.Options options, AbstractC5457k abstractC5457k, EnumC5333b enumC5333b, boolean z, int i2, int i3, boolean z2, b bVar) throws IOException {
        C5458l c5458l;
        int round;
        int round2;
        int i4;
        long m11028b = C5559f.m11028b();
        int[] m10638k = m10638k(inputStream, options, bVar, this.f13746i);
        int i5 = m10638k[0];
        int i6 = m10638k[1];
        String str = options.outMimeType;
        boolean z3 = (i5 == -1 || i6 == -1) ? false : z;
        int m10156a = C5336e.m10156a(this.f13749l, inputStream, this.f13748k);
        int m10680j = C5469w.m10680j(m10156a);
        boolean m10683m = C5469w.m10683m(m10156a);
        int i7 = i2 == Integer.MIN_VALUE ? i5 : i2;
        int i8 = i3 == Integer.MIN_VALUE ? i6 : i3;
        ImageHeaderParser.ImageType m10157b = C5336e.m10157b(this.f13749l, inputStream, this.f13748k);
        m10632c(m10157b, inputStream, bVar, this.f13746i, abstractC5457k, m10680j, i5, i6, i7, i8, options);
        m10631b(inputStream, enumC5333b, z3, m10683m, options, i7, i8);
        boolean z4 = Build.VERSION.SDK_INT >= 19;
        if (options.inSampleSize == 1 || z4) {
            c5458l = this;
            if (c5458l.m10647v(m10157b)) {
                if (i5 < 0 || i6 < 0 || !z2 || !z4) {
                    float f2 = m10640o(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i9 = options.inSampleSize;
                    float f3 = i9;
                    int ceil = (int) Math.ceil(i5 / f3);
                    int ceil2 = (int) Math.ceil(i6 / f3);
                    round = Math.round(ceil * f2);
                    round2 = Math.round(ceil2 * f2);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + round + "x" + round2 + "] for source [" + i5 + "x" + i6 + "], sampleSize: " + i9 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f2);
                    }
                } else {
                    round = i7;
                    round2 = i8;
                }
                if (round > 0 && round2 > 0) {
                    m10646u(options, c5458l.f13746i, round, round2);
                }
            }
        } else {
            c5458l = this;
        }
        Bitmap m10634g = m10634g(inputStream, options, bVar, c5458l.f13746i);
        bVar.mo10652a(c5458l.f13746i, m10634g);
        if (Log.isLoggable("Downsampler", 2)) {
            i4 = m10156a;
            m10641p(i5, i6, str, options, m10634g, i2, i3, m11028b);
        } else {
            i4 = m10156a;
        }
        Bitmap bitmap = null;
        if (m10634g != null) {
            m10634g.setDensity(c5458l.f13747j.densityDpi);
            bitmap = C5469w.m10684n(c5458l.f13746i, m10634g, i4);
            if (!m10634g.equals(bitmap)) {
                c5458l.f13746i.mo10387c(m10634g);
            }
        }
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r1;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap m10634g(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, com.bumptech.glide.load.p131o.p132c.C5458l.b r8, com.bumptech.glide.load.engine.p126z.InterfaceC5380e r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto Lc
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r6.mark(r1)
            goto Lf
        Lc:
            r8.mo10653b()
        Lf:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.p131o.p132c.C5469w.m10679i()
            r4.lock()
            r4 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r6, r4, r7)     // Catch: java.lang.Throwable -> L30 java.lang.IllegalArgumentException -> L32
            java.util.concurrent.locks.Lock r9 = com.bumptech.glide.load.p131o.p132c.C5469w.m10679i()
            r9.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L2f
            r6.reset()
        L2f:
            return r8
        L30:
            r6 = move-exception
            goto L5f
        L32:
            r5 = move-exception
            java.io.IOException r1 = m10642q(r5, r1, r2, r3, r7)     // Catch: java.lang.Throwable -> L30
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L43
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L30
        L43:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L5e
            r6.reset()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L5d
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L5d
            r9.mo10387c(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L5d
            r7.inBitmap = r4     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L5d
            android.graphics.Bitmap r6 = m10634g(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L5d
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.p131o.p132c.C5469w.m10679i()
            r7.unlock()
            return r6
        L5d:
            throw r1     // Catch: java.lang.Throwable -> L30
        L5e:
            throw r1     // Catch: java.lang.Throwable -> L30
        L5f:
            java.util.concurrent.locks.Lock r7 = com.bumptech.glide.load.p131o.p132c.C5469w.m10679i()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p131o.p132c.C5458l.m10634g(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.o.c.l$b, com.bumptech.glide.load.engine.z.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* renamed from: h */
    private static String m10635h(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    /* renamed from: i */
    private static synchronized BitmapFactory.Options m10636i() {
        BitmapFactory.Options poll;
        synchronized (C5458l.class) {
            Queue<BitmapFactory.Options> queue = f13745h;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m10644s(poll);
            }
        }
        return poll;
    }

    /* renamed from: j */
    private static int m10637j(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    /* renamed from: k */
    private static int[] m10638k(InputStream inputStream, BitmapFactory.Options options, b bVar, InterfaceC5380e interfaceC5380e) throws IOException {
        options.inJustDecodeBounds = true;
        m10634g(inputStream, options, bVar, interfaceC5380e);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: l */
    private static String m10639l(BitmapFactory.Options options) {
        return m10635h(options.inBitmap);
    }

    /* renamed from: o */
    private static boolean m10640o(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    /* renamed from: p */
    private static void m10641p(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        Log.v("Downsampler", "Decoded " + m10635h(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + m10639l(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C5559f.m11027a(j2));
    }

    /* renamed from: q */
    private static IOException m10642q(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + m10639l(options), illegalArgumentException);
    }

    /* renamed from: r */
    private static void m10643r(BitmapFactory.Options options) {
        m10644s(options);
        Queue<BitmapFactory.Options> queue = f13745h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: s */
    private static void m10644s(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: t */
    private static int m10645t(double d2) {
        return (int) (d2 + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: u */
    private static void m10646u(BitmapFactory.Options options, InterfaceC5380e interfaceC5380e, int i2, int i3) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = interfaceC5380e.mo10389e(i2, i3, config);
    }

    /* renamed from: v */
    private boolean m10647v(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f13744g.contains(imageType);
    }

    /* renamed from: d */
    public InterfaceC5371u<Bitmap> m10648d(InputStream inputStream, int i2, int i3, C5393i c5393i) throws IOException {
        return m10649e(inputStream, i2, i3, c5393i, f13743f);
    }

    /* renamed from: e */
    public InterfaceC5371u<Bitmap> m10649e(InputStream inputStream, int i2, int i3, C5393i c5393i, b bVar) throws IOException {
        C5563j.m11039a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.f13748k.mo10369e(65536, byte[].class);
        BitmapFactory.Options m10636i = m10636i();
        m10636i.inTempStorage = bArr;
        EnumC5333b enumC5333b = (EnumC5333b) c5393i.m10449a(f13738a);
        AbstractC5457k abstractC5457k = (AbstractC5457k) c5393i.m10449a(AbstractC5457k.f13734h);
        boolean booleanValue = ((Boolean) c5393i.m10449a(f13740c)).booleanValue();
        C5392h<Boolean> c5392h = f13741d;
        try {
            return C5450d.m10607f(m10633f(inputStream, m10636i, abstractC5457k, enumC5333b, c5393i.m10449a(c5392h) != null && ((Boolean) c5393i.m10449a(c5392h)).booleanValue(), i2, i3, booleanValue, bVar), this.f13746i);
        } finally {
            m10643r(m10636i);
            this.f13748k.mo10368d(bArr);
        }
    }

    /* renamed from: m */
    public boolean m10650m(InputStream inputStream) {
        return true;
    }

    /* renamed from: n */
    public boolean m10651n(ByteBuffer byteBuffer) {
        return true;
    }
}
