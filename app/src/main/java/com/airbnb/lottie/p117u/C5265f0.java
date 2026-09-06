package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p114j.C5239n;
import com.airbnb.lottie.p112s.p114j.InterfaceC5227b;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ShapeGroupParser.java */
/* renamed from: com.airbnb.lottie.u.f0 */
/* loaded from: classes.dex */
class C5265f0 {
    /* renamed from: a */
    static C5239n m9798a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("it")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    InterfaceC5227b m9799a = C5266g.m9799a(jsonReader, c5155d);
                    if (m9799a != null) {
                        arrayList.add(m9799a);
                    }
                }
                jsonReader.endArray();
            } else if (nextName.equals("nm")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        return new C5239n(str, arrayList);
    }
}
