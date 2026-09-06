package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5215d;
import com.airbnb.lottie.p112s.p113i.C5216e;
import com.airbnb.lottie.p112s.p113i.C5218g;
import com.airbnb.lottie.p112s.p113i.C5223l;
import com.airbnb.lottie.p112s.p113i.InterfaceC5224m;
import com.airbnb.lottie.p119w.C5299d;
import java.io.IOException;

/* compiled from: AnimatableTransformParser.java */
/* renamed from: com.airbnb.lottie.u.c */
/* loaded from: classes.dex */
public class C5258c {
    /* renamed from: a */
    public static C5223l m9780a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        C5216e c5216e = null;
        C5218g c5218g = null;
        C5215d c5215d = null;
        InterfaceC5224m<PointF, PointF> interfaceC5224m = null;
        C5213b c5213b = null;
        C5213b c5213b2 = null;
        C5213b c5213b3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("k")) {
                            c5216e = C5254a.m9774a(jsonReader, c5155d);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case "o":
                    c5215d = C5260d.m9790h(jsonReader, c5155d);
                    continue;
                case "p":
                    interfaceC5224m = C5254a.m9775b(jsonReader, c5155d);
                    continue;
                case "r":
                    break;
                case "s":
                    c5218g = C5260d.m9792j(jsonReader, c5155d);
                    continue;
                case "eo":
                    c5213b3 = C5260d.m9788f(jsonReader, c5155d, false);
                    continue;
                case "rz":
                    c5155d.m9395a("Lottie doesn't support 3D layers.");
                    break;
                case "so":
                    c5213b2 = C5260d.m9788f(jsonReader, c5155d, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            c5213b = C5260d.m9788f(jsonReader, c5155d, false);
        }
        if (z) {
            jsonReader.endObject();
        }
        if (c5216e == null) {
            Log.w("LOTTIE", "Layer has no transform property. You may be using an unsupported layer type such as a camera.");
            c5216e = new C5216e();
        }
        C5216e c5216e2 = c5216e;
        if (c5218g == null) {
            c5218g = new C5218g(new C5299d(1.0f, 1.0f));
        }
        C5218g c5218g2 = c5218g;
        if (c5215d == null) {
            c5215d = new C5215d();
        }
        return new C5223l(c5216e2, interfaceC5224m, c5218g2, c5213b, c5215d, c5213b2, c5213b3);
    }
}
