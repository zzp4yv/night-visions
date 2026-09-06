package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p108q.p110b.C5193h;
import com.airbnb.lottie.p118v.C5295f;
import java.io.IOException;

/* compiled from: PathKeyframeParser.java */
/* renamed from: com.airbnb.lottie.u.w */
/* loaded from: classes.dex */
class C5286w {
    /* renamed from: a */
    static C5193h m9837a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        return new C5193h(c5155d, C5280q.m9821b(jsonReader, c5155d, C5295f.m9887e(), C5287x.f12910a, jsonReader.peek() == JsonToken.BEGIN_OBJECT));
    }
}
