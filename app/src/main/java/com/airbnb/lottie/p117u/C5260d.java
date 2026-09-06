package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5212a;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5214c;
import com.airbnb.lottie.p112s.p113i.C5215d;
import com.airbnb.lottie.p112s.p113i.C5217f;
import com.airbnb.lottie.p112s.p113i.C5218g;
import com.airbnb.lottie.p112s.p113i.C5219h;
import com.airbnb.lottie.p112s.p113i.C5221j;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5296a;
import com.airbnb.lottie.p119w.C5299d;
import java.io.IOException;
import java.util.List;

/* compiled from: AnimatableValueParser.java */
/* renamed from: com.airbnb.lottie.u.d */
/* loaded from: classes.dex */
public class C5260d {
    /* renamed from: a */
    private static <T> List<C5296a<T>> m9783a(JsonReader jsonReader, float f2, C5155d c5155d, InterfaceC5273j0<T> interfaceC5273j0) throws IOException {
        return C5281r.m9826a(jsonReader, c5155d, f2, interfaceC5273j0);
    }

    /* renamed from: b */
    private static <T> List<C5296a<T>> m9784b(JsonReader jsonReader, C5155d c5155d, InterfaceC5273j0<T> interfaceC5273j0) throws IOException {
        return C5281r.m9826a(jsonReader, c5155d, 1.0f, interfaceC5273j0);
    }

    /* renamed from: c */
    static C5212a m9785c(JsonReader jsonReader, C5155d c5155d) throws IOException {
        return new C5212a(m9784b(jsonReader, c5155d, C5264f.f12902a));
    }

    /* renamed from: d */
    static C5221j m9786d(JsonReader jsonReader, C5155d c5155d) throws IOException {
        return new C5221j(m9784b(jsonReader, c5155d, C5268h.f12903a));
    }

    /* renamed from: e */
    public static C5213b m9787e(JsonReader jsonReader, C5155d c5155d) throws IOException {
        return m9788f(jsonReader, c5155d, true);
    }

    /* renamed from: f */
    public static C5213b m9788f(JsonReader jsonReader, C5155d c5155d, boolean z) throws IOException {
        return new C5213b(m9783a(jsonReader, z ? C5295f.m9887e() : 1.0f, c5155d, C5270i.f12904a));
    }

    /* renamed from: g */
    static C5214c m9789g(JsonReader jsonReader, C5155d c5155d, int i2) throws IOException {
        return new C5214c(m9784b(jsonReader, c5155d, new C5275l(i2)));
    }

    /* renamed from: h */
    static C5215d m9790h(JsonReader jsonReader, C5155d c5155d) throws IOException {
        return new C5215d(m9784b(jsonReader, c5155d, C5278o.f12906a));
    }

    /* renamed from: i */
    static C5217f m9791i(JsonReader jsonReader, C5155d c5155d) throws IOException {
        return new C5217f(m9783a(jsonReader, C5295f.m9887e(), c5155d, C5288y.f12911a));
    }

    /* renamed from: j */
    static C5218g m9792j(JsonReader jsonReader, C5155d c5155d) throws IOException {
        return new C5218g((List<C5296a<C5299d>>) m9784b(jsonReader, c5155d, C5259c0.f12900a));
    }

    /* renamed from: k */
    static C5219h m9793k(JsonReader jsonReader, C5155d c5155d) throws IOException {
        return new C5219h(m9783a(jsonReader, C5295f.m9887e(), c5155d, C5261d0.f12901a));
    }
}
