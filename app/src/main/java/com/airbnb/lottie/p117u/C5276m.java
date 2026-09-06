package com.airbnb.lottie.p117u;

import android.graphics.Path;
import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5214c;
import com.airbnb.lottie.p112s.p113i.C5215d;
import com.airbnb.lottie.p112s.p113i.C5217f;
import com.airbnb.lottie.p112s.p114j.C5229d;
import com.airbnb.lottie.p112s.p114j.EnumC5231f;
import java.io.IOException;

/* compiled from: GradientFillParser.java */
/* renamed from: com.airbnb.lottie.u.m */
/* loaded from: classes.dex */
class C5276m {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static C5229d m9810a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        char c2;
        String str = null;
        EnumC5231f enumC5231f = null;
        Path.FillType fillType = null;
        C5214c c5214c = null;
        C5215d c5215d = null;
        C5217f c5217f = null;
        C5217f c5217f2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            int i2 = -1;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    c5217f2 = C5260d.m9791i(jsonReader, c5155d);
                    break;
                case 1:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals("k")) {
                            c5214c = C5260d.m9789g(jsonReader, c5155d, i2);
                        } else if (nextName2.equals("p")) {
                            i2 = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    c5215d = C5260d.m9790h(jsonReader, c5155d);
                    break;
                case 3:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 4:
                    c5217f = C5260d.m9791i(jsonReader, c5155d);
                    break;
                case 5:
                    enumC5231f = jsonReader.nextInt() == 1 ? EnumC5231f.Linear : EnumC5231f.Radial;
                    break;
                case 6:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5229d(str, enumC5231f, fillType, c5214c, c5215d, c5217f, c5217f2, null, null);
    }
}
