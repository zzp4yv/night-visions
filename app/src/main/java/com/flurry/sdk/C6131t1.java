package com.flurry.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.flurry.sdk.t1 */
/* loaded from: classes2.dex */
public final class C6131t1<ObjectType> extends C6123s1<ObjectType> {
    public C6131t1(InterfaceC6147v1<ObjectType> interfaceC6147v1) {
        super(interfaceC6147v1);
    }

    @Override // com.flurry.sdk.C6123s1, com.flurry.sdk.InterfaceC6147v1
    /* renamed from: a */
    public final void mo13095a(OutputStream outputStream, ObjectType objecttype) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream2 = null;
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
            } catch (Throwable th) {
                th = th;
            }
            try {
                super.mo13095a(gZIPOutputStream, objecttype);
                C5980c2.m12990f(gZIPOutputStream);
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                C5980c2.m12990f(gZIPOutputStream2);
                throw th;
            }
        }
    }

    @Override // com.flurry.sdk.C6123s1, com.flurry.sdk.InterfaceC6147v1
    /* renamed from: b */
    public final ObjectType mo13096b(InputStream inputStream) throws IOException {
        GZIPInputStream gZIPInputStream = null;
        if (inputStream == null) {
            return null;
        }
        try {
            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
            try {
                ObjectType objecttype = (ObjectType) super.mo13096b(gZIPInputStream2);
                C5980c2.m12990f(gZIPInputStream2);
                return objecttype;
            } catch (Throwable th) {
                th = th;
                gZIPInputStream = gZIPInputStream2;
                C5980c2.m12990f(gZIPInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
