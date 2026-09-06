package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: FloatParser.java */
/* renamed from: com.airbnb.lottie.u.i */
/* loaded from: classes.dex */
public class C5270i implements InterfaceC5273j0<Float> {

    /* renamed from: a */
    public static final C5270i f12904a = new C5270i();

    private C5270i() {
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5273j0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float mo9781a(JsonReader jsonReader, float f2) throws IOException {
        return Float.valueOf(C5279p.m9819g(jsonReader) * f2);
    }
}
