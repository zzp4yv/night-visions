package io.sentry;

import java.io.StringReader;
import java.nio.charset.Charset;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EnvelopeReader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.h1 */
/* loaded from: classes2.dex */
public final class C9413h1 implements InterfaceC9551s1 {

    /* renamed from: a */
    private static final Charset f36340a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final InterfaceC9340c2 f36341b;

    public C9413h1(InterfaceC9340c2 interfaceC9340c2) {
        this.f36341b = interfaceC9340c2;
    }

    /* renamed from: b */
    private C9440i4 m30815b(byte[] bArr, int i2, int i3) {
        StringReader stringReader = new StringReader(new String(bArr, i2, i3, f36340a));
        try {
            C9440i4 c9440i4 = (C9440i4) this.f36341b.mo30489c(stringReader, C9440i4.class);
            stringReader.close();
            return c9440i4;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: c */
    private C9466k4 m30816c(byte[] bArr, int i2, int i3) {
        StringReader stringReader = new StringReader(new String(bArr, i2, i3, f36340a));
        try {
            C9466k4 c9466k4 = (C9466k4) this.f36341b.mo30489c(stringReader, C9466k4.class);
            stringReader.close();
            return c9466k4;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        r11 = new io.sentry.C9416h4(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e2, code lost:
    
        throw new java.lang.IllegalArgumentException("Item header at index '" + r2.size() + "' is null or empty.");
     */
    @Override // io.sentry.InterfaceC9551s1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.sentry.C9416h4 mo30817a(java.io.InputStream r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C9413h1.mo30817a(java.io.InputStream):io.sentry.h4");
    }
}
