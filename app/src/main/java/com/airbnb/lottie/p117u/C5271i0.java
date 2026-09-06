package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p114j.C5242q;
import java.io.IOException;

/* compiled from: ShapeTrimPathParser.java */
/* renamed from: com.airbnb.lottie.u.i0 */
/* loaded from: classes.dex */
class C5271i0 {
    /* renamed from: a */
    static C5242q m9804a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        String str = null;
        C5242q.a aVar = null;
        C5213b c5213b = null;
        C5213b c5213b2 = null;
        C5213b c5213b3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "e":
                    c5213b2 = C5260d.m9788f(jsonReader, c5155d, false);
                    break;
                case "m":
                    aVar = C5242q.a.m9708g(jsonReader.nextInt());
                    break;
                case "o":
                    c5213b3 = C5260d.m9788f(jsonReader, c5155d, false);
                    break;
                case "s":
                    c5213b = C5260d.m9788f(jsonReader, c5155d, false);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5242q(str, aVar, c5213b, c5213b2, c5213b3);
    }
}
