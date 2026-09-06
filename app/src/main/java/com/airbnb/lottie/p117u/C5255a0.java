package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5217f;
import com.airbnb.lottie.p112s.p113i.InterfaceC5224m;
import com.airbnb.lottie.p112s.p114j.C5235j;
import java.io.IOException;

/* compiled from: RectangleShapeParser.java */
/* renamed from: com.airbnb.lottie.u.a0 */
/* loaded from: classes.dex */
class C5255a0 {
    /* renamed from: a */
    static C5235j m9776a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        String str = null;
        InterfaceC5224m<PointF, PointF> interfaceC5224m = null;
        C5217f c5217f = null;
        C5213b c5213b = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "p":
                    interfaceC5224m = C5254a.m9775b(jsonReader, c5155d);
                    break;
                case "r":
                    c5213b = C5260d.m9787e(jsonReader, c5155d);
                    break;
                case "s":
                    c5217f = C5260d.m9791i(jsonReader, c5155d);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5235j(str, interfaceC5224m, c5217f, c5213b);
    }
}
