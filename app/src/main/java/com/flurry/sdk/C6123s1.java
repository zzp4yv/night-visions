package com.flurry.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.s1 */
/* loaded from: classes2.dex */
public class C6123s1<ObjectType> implements InterfaceC6147v1<ObjectType> {

    /* renamed from: a */
    protected final InterfaceC6147v1<ObjectType> f16318a;

    public C6123s1(InterfaceC6147v1<ObjectType> interfaceC6147v1) {
        this.f16318a = interfaceC6147v1;
    }

    @Override // com.flurry.sdk.InterfaceC6147v1
    /* renamed from: a */
    public void mo13095a(OutputStream outputStream, ObjectType objecttype) throws IOException {
        InterfaceC6147v1<ObjectType> interfaceC6147v1 = this.f16318a;
        if (interfaceC6147v1 == null || outputStream == null || objecttype == null) {
            return;
        }
        interfaceC6147v1.mo13095a(outputStream, objecttype);
    }

    @Override // com.flurry.sdk.InterfaceC6147v1
    /* renamed from: b */
    public ObjectType mo13096b(InputStream inputStream) throws IOException {
        InterfaceC6147v1<ObjectType> interfaceC6147v1 = this.f16318a;
        if (interfaceC6147v1 == null || inputStream == null) {
            return null;
        }
        return interfaceC6147v1.mo13096b(inputStream);
    }
}
