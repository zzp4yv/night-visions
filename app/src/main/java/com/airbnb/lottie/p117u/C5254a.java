package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5216e;
import com.airbnb.lottie.p112s.p113i.C5220i;
import com.airbnb.lottie.p112s.p113i.InterfaceC5224m;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5296a;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* renamed from: com.airbnb.lottie.u.a */
/* loaded from: classes.dex */
public class C5254a {
    /* renamed from: a */
    public static C5216e m9774a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(C5286w.m9837a(jsonReader, c5155d));
            }
            jsonReader.endArray();
            C5281r.m9827b(arrayList);
        } else {
            arrayList.add(new C5296a(C5279p.m9817e(jsonReader, C5295f.m9887e())));
        }
        return new C5216e(arrayList);
    }

    /* renamed from: b */
    static InterfaceC5224m<PointF, PointF> m9775b(JsonReader jsonReader, C5155d c5155d) throws IOException {
        jsonReader.beginObject();
        C5216e c5216e = null;
        C5213b c5213b = null;
        C5213b c5213b2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "k":
                    c5216e = m9774a(jsonReader, c5155d);
                    continue;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        c5213b = C5260d.m9787e(jsonReader, c5155d);
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        c5213b2 = C5260d.m9787e(jsonReader, c5155d);
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    continue;
            }
            z = true;
        }
        jsonReader.endObject();
        if (z) {
            c5155d.m9395a("Lottie doesn't support expressions.");
        }
        return c5216e != null ? c5216e : new C5220i(c5213b, c5213b2);
    }
}
