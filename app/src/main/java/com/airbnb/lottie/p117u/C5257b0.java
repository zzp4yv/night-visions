package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5223l;
import com.airbnb.lottie.p112s.p114j.C5236k;
import java.io.IOException;

/* compiled from: RepeaterParser.java */
/* renamed from: com.airbnb.lottie.u.b0 */
/* loaded from: classes.dex */
class C5257b0 {
    /* renamed from: a */
    static C5236k m9779a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        String str = null;
        C5213b c5213b = null;
        C5213b c5213b2 = null;
        C5223l c5223l = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "c":
                    c5213b = C5260d.m9788f(jsonReader, c5155d, false);
                    break;
                case "o":
                    c5213b2 = C5260d.m9788f(jsonReader, c5155d, false);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "tr":
                    c5223l = C5258c.m9780a(jsonReader, c5155d);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5236k(str, c5213b, c5213b2, c5223l);
    }
}
