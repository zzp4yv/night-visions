package com.bumptech.glide.load.p131o.p136g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C5336e;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5333b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.load.p131o.C5446b;
import com.bumptech.glide.p122l.C5329c;
import com.bumptech.glide.p122l.C5330d;
import com.bumptech.glide.p122l.C5331e;
import com.bumptech.glide.p122l.InterfaceC5327a;
import com.bumptech.glide.p145r.C5559f;
import com.bumptech.glide.p145r.C5564k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder.java */
/* renamed from: com.bumptech.glide.load.o.g.a */
/* loaded from: classes.dex */
public class C5482a implements InterfaceC5394j<ByteBuffer, C5484c> {

    /* renamed from: a */
    private static final a f13794a = new a();

    /* renamed from: b */
    private static final b f13795b = new b();

    /* renamed from: c */
    private final Context f13796c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f13797d;

    /* renamed from: e */
    private final b f13798e;

    /* renamed from: f */
    private final a f13799f;

    /* renamed from: g */
    private final C5483b f13800g;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.g.a$a */
    static class a {
        a() {
        }

        /* renamed from: a */
        InterfaceC5327a m10729a(InterfaceC5327a.a aVar, C5329c c5329c, ByteBuffer byteBuffer, int i2) {
            return new C5331e(aVar, c5329c, byteBuffer, i2);
        }
    }

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.g.a$b */
    static class b {

        /* renamed from: a */
        private final Queue<C5330d> f13801a = C5564k.m11049f(0);

        b() {
        }

        /* renamed from: a */
        synchronized C5330d m10730a(ByteBuffer byteBuffer) {
            C5330d poll;
            poll = this.f13801a.poll();
            if (poll == null) {
                poll = new C5330d();
            }
            return poll.m10141p(byteBuffer);
        }

        /* renamed from: b */
        synchronized void m10731b(C5330d c5330d) {
            c5330d.m10139a();
            this.f13801a.offer(c5330d);
        }
    }

    public C5482a(Context context, List<ImageHeaderParser> list, InterfaceC5380e interfaceC5380e, InterfaceC5377b interfaceC5377b) {
        this(context, list, interfaceC5380e, interfaceC5377b, f13795b, f13794a);
    }

    /* renamed from: c */
    private C5486e m10725c(ByteBuffer byteBuffer, int i2, int i3, C5330d c5330d, C5393i c5393i) {
        long m11028b = C5559f.m11028b();
        try {
            C5329c m10140c = c5330d.m10140c();
            if (m10140c.m10121b() > 0 && m10140c.m10122c() == 0) {
                Bitmap.Config config = c5393i.m10449a(C5490i.f13839a) == EnumC5333b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC5327a m10729a = this.f13799f.m10729a(this.f13800g, m10140c, byteBuffer, m10726e(m10140c, i2, i3));
                m10729a.mo10110f(config);
                m10729a.mo10107c();
                Bitmap mo10105a = m10729a.mo10105a();
                if (mo10105a == null) {
                    return null;
                }
                C5486e c5486e = new C5486e(new C5484c(this.f13796c, m10729a, C5446b.m10603a(), i2, i3, mo10105a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C5559f.m11027a(m11028b));
                }
                return c5486e;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C5559f.m11027a(m11028b));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C5559f.m11027a(m11028b));
            }
        }
    }

    /* renamed from: e */
    private static int m10726e(C5329c c5329c, int i2, int i3) {
        int min = Math.min(c5329c.m10120a() / i3, c5329c.m10123d() / i2);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i2 + "x" + i3 + "], actual dimens: [" + c5329c.m10123d() + "x" + c5329c.m10120a() + "]");
        }
        return max;
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C5486e mo10453b(ByteBuffer byteBuffer, int i2, int i3, C5393i c5393i) {
        C5330d m10730a = this.f13798e.m10730a(byteBuffer);
        try {
            return m10725c(byteBuffer, i2, i3, m10730a, c5393i);
        } finally {
            this.f13798e.m10731b(m10730a);
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(ByteBuffer byteBuffer, C5393i c5393i) throws IOException {
        return !((Boolean) c5393i.m10449a(C5490i.f13840b)).booleanValue() && C5336e.m10158c(this.f13797d, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    C5482a(Context context, List<ImageHeaderParser> list, InterfaceC5380e interfaceC5380e, InterfaceC5377b interfaceC5377b, b bVar, a aVar) {
        this.f13796c = context.getApplicationContext();
        this.f13797d = list;
        this.f13799f = aVar;
        this.f13800g = new C5483b(interfaceC5380e, interfaceC5377b);
        this.f13798e = bVar;
    }
}
