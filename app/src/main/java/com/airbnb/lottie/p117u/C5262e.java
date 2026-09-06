package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5217f;
import com.airbnb.lottie.p112s.p113i.InterfaceC5224m;
import com.airbnb.lottie.p112s.p114j.C5226a;
import java.io.IOException;

/* compiled from: CircleShapeParser.java */
/* renamed from: com.airbnb.lottie.u.e */
/* loaded from: classes.dex */
class C5262e {
    /* renamed from: a */
    static C5226a m9795a(JsonReader jsonReader, C5155d c5155d, int i2) throws IOException {
        boolean z = i2 == 3;
        String str = null;
        InterfaceC5224m<PointF, PointF> interfaceC5224m = null;
        C5217f c5217f = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "p":
                    interfaceC5224m = C5254a.m9775b(jsonReader, c5155d);
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
        return new C5226a(str, interfaceC5224m, c5217f, z);
    }
}
