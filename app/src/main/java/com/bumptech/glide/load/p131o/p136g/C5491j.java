package com.bumptech.glide.load.p131o.p136g;

import android.util.Log;
import com.bumptech.glide.load.C5336e;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* compiled from: StreamGifDecoder.java */
/* renamed from: com.bumptech.glide.load.o.g.j */
/* loaded from: classes.dex */
public class C5491j implements InterfaceC5394j<InputStream, C5484c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f13841a;

    /* renamed from: b */
    private final InterfaceC5394j<ByteBuffer, C5484c> f13842b;

    /* renamed from: c */
    private final InterfaceC5377b f13843c;

    public C5491j(List<ImageHeaderParser> list, InterfaceC5394j<ByteBuffer, C5484c> interfaceC5394j, InterfaceC5377b interfaceC5377b) {
        this.f13841a = list;
        this.f13842b = interfaceC5394j;
        this.f13843c = interfaceC5377b;
    }

    /* renamed from: e */
    private static byte[] m10773e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e2) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5371u<C5484c> mo10453b(InputStream inputStream, int i2, int i3, C5393i c5393i) throws IOException {
        byte[] m10773e = m10773e(inputStream);
        if (m10773e == null) {
            return null;
        }
        return this.f13842b.mo10453b(ByteBuffer.wrap(m10773e), i2, i3, c5393i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5394j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(InputStream inputStream, C5393i c5393i) throws IOException {
        return !((Boolean) c5393i.m10449a(C5490i.f13840b)).booleanValue() && C5336e.m10157b(this.f13841a, inputStream, this.f13843c) == ImageHeaderParser.ImageType.GIF;
    }
}
