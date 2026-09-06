package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.p112s.C5206c;
import java.io.IOException;

/* compiled from: FontParser.java */
/* renamed from: com.airbnb.lottie.u.k */
/* loaded from: classes.dex */
class C5274k {
    /* renamed from: a */
    static C5206c m9806a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f2 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "fFamily":
                    str = jsonReader.nextString();
                    break;
                case "ascent":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "fStyle":
                    str3 = jsonReader.nextString();
                    break;
                case "fName":
                    str2 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C5206c(str, str2, str3, f2);
    }
}
