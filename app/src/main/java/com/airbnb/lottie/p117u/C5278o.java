package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: IntegerParser.java */
/* renamed from: com.airbnb.lottie.u.o */
/* loaded from: classes.dex */
public class C5278o implements InterfaceC5273j0<Integer> {

    /* renamed from: a */
    public static final C5278o f12906a = new C5278o();

    private C5278o() {
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5273j0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer mo9781a(JsonReader jsonReader, float f2) throws IOException {
        return Integer.valueOf(Math.round(C5279p.m9819g(jsonReader) * f2));
    }
}
