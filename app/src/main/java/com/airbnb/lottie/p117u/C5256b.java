package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5212a;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5222k;
import java.io.IOException;

/* compiled from: AnimatableTextPropertiesParser.java */
/* renamed from: com.airbnb.lottie.u.b */
/* loaded from: classes.dex */
public class C5256b {
    /* renamed from: a */
    public static C5222k m9777a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        jsonReader.beginObject();
        C5222k c5222k = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("a")) {
                c5222k = m9778b(jsonReader, c5155d);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return c5222k == null ? new C5222k(null, null, null, null) : c5222k;
    }

    /* renamed from: b */
    private static C5222k m9778b(JsonReader jsonReader, C5155d c5155d) throws IOException {
        jsonReader.beginObject();
        C5212a c5212a = null;
        C5212a c5212a2 = null;
        C5213b c5213b = null;
        C5213b c5213b2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "t":
                    c5213b2 = C5260d.m9787e(jsonReader, c5155d);
                    break;
                case "fc":
                    c5212a = C5260d.m9785c(jsonReader, c5155d);
                    break;
                case "sc":
                    c5212a2 = C5260d.m9785c(jsonReader, c5155d);
                    break;
                case "sw":
                    c5213b = C5260d.m9787e(jsonReader, c5155d);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C5222k(c5212a, c5212a2, c5213b, c5213b2);
    }
}
