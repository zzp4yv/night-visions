package com.airbnb.lottie.p117u;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5212a;
import com.airbnb.lottie.p112s.p113i.C5215d;
import com.airbnb.lottie.p112s.p114j.C5238m;
import java.io.IOException;

/* compiled from: ShapeFillParser.java */
/* renamed from: com.airbnb.lottie.u.e0 */
/* loaded from: classes.dex */
class C5263e0 {
    /* renamed from: a */
    static C5238m m9796a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        String str = null;
        C5212a c5212a = null;
        C5215d c5215d = null;
        int i2 = 1;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "fillEnabled":
                    z = jsonReader.nextBoolean();
                    break;
                case "c":
                    c5212a = C5260d.m9785c(jsonReader, c5155d);
                    break;
                case "o":
                    c5215d = C5260d.m9790h(jsonReader, c5155d);
                    break;
                case "r":
                    i2 = jsonReader.nextInt();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5238m(str, z, i2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c5212a, c5215d);
    }
}
