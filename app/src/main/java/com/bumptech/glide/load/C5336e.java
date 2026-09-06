package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.load.p131o.p132c.C5465s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils.java */
/* renamed from: com.bumptech.glide.load.e */
/* loaded from: classes.dex */
public final class C5336e {
    /* renamed from: a */
    public static int m10156a(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC5377b interfaceC5377b) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C5465s(inputStream, interfaceC5377b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                int mo10154c = list.get(i2).mo10154c(inputStream, interfaceC5377b);
                if (mo10154c != -1) {
                    return mo10154c;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static ImageHeaderParser.ImageType m10157b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC5377b interfaceC5377b) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C5465s(inputStream, interfaceC5377b);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ImageHeaderParser.ImageType mo10153b = list.get(i2).mo10153b(inputStream);
                if (mo10153b != ImageHeaderParser.ImageType.UNKNOWN) {
                    return mo10153b;
                }
                inputStream.reset();
            } finally {
                inputStream.reset();
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public static ImageHeaderParser.ImageType m10158c(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType mo10152a = list.get(i2).mo10152a(byteBuffer);
            if (mo10152a != ImageHeaderParser.ImageType.UNKNOWN) {
                return mo10152a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
