package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.p112s.p114j.C5233h;
import java.io.IOException;

/* compiled from: MergePathsParser.java */
/* renamed from: com.airbnb.lottie.u.v */
/* loaded from: classes.dex */
class C5285v {
    /* renamed from: a */
    static C5233h m9836a(JsonReader jsonReader) throws IOException {
        String str = null;
        C5233h.a aVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("mm")) {
                aVar = C5233h.a.m9660g(jsonReader.nextInt());
            } else if (nextName.equals("nm")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        return new C5233h(str, aVar);
    }
}
