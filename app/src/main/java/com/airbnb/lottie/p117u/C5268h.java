package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.p112s.C5205b;
import java.io.IOException;

/* compiled from: DocumentDataParser.java */
/* renamed from: com.airbnb.lottie.u.h */
/* loaded from: classes.dex */
public class C5268h implements InterfaceC5273j0<C5205b> {

    /* renamed from: a */
    public static final C5268h f12903a = new C5268h();

    private C5268h() {
    }

    @Override // com.airbnb.lottie.p117u.InterfaceC5273j0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5205b mo9781a(JsonReader jsonReader, float f2) throws IOException {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "f":
                    str2 = jsonReader.nextString();
                    break;
                case "j":
                    i2 = jsonReader.nextInt();
                    break;
                case "s":
                    d2 = jsonReader.nextDouble();
                    break;
                case "t":
                    str = jsonReader.nextString();
                    break;
                case "fc":
                    i4 = C5279p.m9816d(jsonReader);
                    break;
                case "lh":
                    d3 = jsonReader.nextDouble();
                    break;
                case "ls":
                    d4 = jsonReader.nextDouble();
                    break;
                case "of":
                    z = jsonReader.nextBoolean();
                    break;
                case "sc":
                    i5 = C5279p.m9816d(jsonReader);
                    break;
                case "sw":
                    d5 = jsonReader.nextDouble();
                    break;
                case "tr":
                    i3 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C5205b(str, str2, d2, i2, i3, d3, d4, i4, i5, d5, z);
    }
}
