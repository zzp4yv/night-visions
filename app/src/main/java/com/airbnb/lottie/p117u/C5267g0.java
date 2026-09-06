package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5219h;
import com.airbnb.lottie.p112s.p114j.C5240o;
import java.io.IOException;

/* compiled from: ShapePathParser.java */
/* renamed from: com.airbnb.lottie.u.g0 */
/* loaded from: classes.dex */
class C5267g0 {
    /* renamed from: a */
    static C5240o m9800a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        String str = null;
        C5219h c5219h = null;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "ks":
                    c5219h = C5260d.m9793k(jsonReader, c5155d);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "ind":
                    i2 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5240o(str, i2, c5219h);
    }
}
