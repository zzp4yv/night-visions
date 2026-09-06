package com.airbnb.lottie.p117u;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: ColorParser.java */
/* renamed from: com.airbnb.lottie.u.f */
/* loaded from: classes.dex */
public class C5264f implements InterfaceC5273j0<Integer> {

    /* renamed from: a */
    public static final C5264f f12902a = new C5264f();

    private C5264f() {
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5273j0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer mo9781a(JsonReader jsonReader, float f2) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        double nextDouble4 = jsonReader.nextDouble();
        if (z) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d && nextDouble4 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            nextDouble4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
