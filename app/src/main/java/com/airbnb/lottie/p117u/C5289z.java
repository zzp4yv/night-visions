package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.InterfaceC5224m;
import com.airbnb.lottie.p112s.p114j.C5234i;
import java.io.IOException;

/* compiled from: PolystarShapeParser.java */
/* renamed from: com.airbnb.lottie.u.z */
/* loaded from: classes.dex */
class C5289z {
    /* renamed from: a */
    static C5234i m9840a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        String str = null;
        C5234i.a aVar = null;
        C5213b c5213b = null;
        InterfaceC5224m<PointF, PointF> interfaceC5224m = null;
        C5213b c5213b2 = null;
        C5213b c5213b3 = null;
        C5213b c5213b4 = null;
        C5213b c5213b5 = null;
        C5213b c5213b6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "p":
                    interfaceC5224m = C5254a.m9775b(jsonReader, c5155d);
                    break;
                case "r":
                    c5213b2 = C5260d.m9788f(jsonReader, c5155d, false);
                    break;
                case "ir":
                    c5213b3 = C5260d.m9787e(jsonReader, c5155d);
                    break;
                case "is":
                    c5213b5 = C5260d.m9788f(jsonReader, c5155d, false);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "or":
                    c5213b4 = C5260d.m9787e(jsonReader, c5155d);
                    break;
                case "os":
                    c5213b6 = C5260d.m9788f(jsonReader, c5155d, false);
                    break;
                case "pt":
                    c5213b = C5260d.m9788f(jsonReader, c5155d, false);
                    break;
                case "sy":
                    aVar = C5234i.a.m9670g(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5234i(str, aVar, c5213b, interfaceC5224m, c5213b2, c5213b3, c5213b4, c5213b5, c5213b6);
    }
}
