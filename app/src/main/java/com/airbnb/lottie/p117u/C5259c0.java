package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p119w.C5299d;
import java.io.IOException;

/* compiled from: ScaleXYParser.java */
/* renamed from: com.airbnb.lottie.u.c0 */
/* loaded from: classes.dex */
public class C5259c0 implements InterfaceC5273j0<C5299d> {

    /* renamed from: a */
    public static final C5259c0 f12900a = new C5259c0();

    private C5259c0() {
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5273j0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5299d mo9781a(JsonReader jsonReader, float f2) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C5299d((nextDouble / 100.0f) * f2, (nextDouble2 / 100.0f) * f2);
    }
}
