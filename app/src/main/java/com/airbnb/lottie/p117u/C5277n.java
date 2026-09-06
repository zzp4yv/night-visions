package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5214c;
import com.airbnb.lottie.p112s.p113i.C5215d;
import com.airbnb.lottie.p112s.p113i.C5217f;
import com.airbnb.lottie.p112s.p114j.C5230e;
import com.airbnb.lottie.p112s.p114j.C5241p;
import com.airbnb.lottie.p112s.p114j.EnumC5231f;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: GradientStrokeParser.java */
/* renamed from: com.airbnb.lottie.u.n */
/* loaded from: classes.dex */
class C5277n {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static C5230e m9811a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        char c2;
        ArrayList arrayList = new ArrayList();
        String str = null;
        EnumC5231f enumC5231f = null;
        C5214c c5214c = null;
        C5215d c5215d = null;
        C5217f c5217f = null;
        C5217f c5217f2 = null;
        C5213b c5213b = null;
        C5241p.b bVar = null;
        C5241p.c cVar = null;
        float f2 = 0.0f;
        C5213b c5213b2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            C5213b c5213b3 = c5213b2;
            float f3 = f2;
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 101:
                    if (nextName.equals("e")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
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
                case 119:
                    if (nextName.equals("w")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c2 = '\n';
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
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        C5213b c5213b4 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            C5241p.c cVar2 = cVar;
                            if (nextName2.equals("n")) {
                                str2 = jsonReader.nextString();
                            } else if (nextName2.equals("v")) {
                                c5213b4 = C5260d.m9787e(jsonReader, c5155d);
                            } else {
                                jsonReader.skipValue();
                            }
                            cVar = cVar2;
                        }
                        C5241p.c cVar3 = cVar;
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            c5213b3 = c5213b4;
                        } else if (str2.equals("d") || str2.equals("g")) {
                            arrayList.add(c5213b4);
                        }
                        cVar = cVar3;
                    }
                    C5241p.c cVar4 = cVar;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    c5213b2 = c5213b3;
                    f2 = f3;
                    cVar = cVar4;
                    continue;
                case 1:
                    c5217f2 = C5260d.m9791i(jsonReader, c5155d);
                    break;
                case 2:
                    jsonReader.beginObject();
                    int i2 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.hashCode();
                        if (nextName3.equals("k")) {
                            c5214c = C5260d.m9789g(jsonReader, c5155d, i2);
                        } else if (nextName3.equals("p")) {
                            i2 = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 3:
                    c5215d = C5260d.m9790h(jsonReader, c5155d);
                    break;
                case 4:
                    c5217f = C5260d.m9791i(jsonReader, c5155d);
                    break;
                case 5:
                    enumC5231f = jsonReader.nextInt() == 1 ? EnumC5231f.Linear : EnumC5231f.Radial;
                    break;
                case 6:
                    c5213b = C5260d.m9787e(jsonReader, c5155d);
                    break;
                case 7:
                    bVar = C5241p.b.values()[jsonReader.nextInt() - 1];
                    break;
                case '\b':
                    cVar = C5241p.c.values()[jsonReader.nextInt() - 1];
                    break;
                case '\t':
                    f2 = (float) jsonReader.nextDouble();
                    c5213b2 = c5213b3;
                    continue;
                case '\n':
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            c5213b2 = c5213b3;
            f2 = f3;
        }
        return new C5230e(str, enumC5231f, c5214c, c5215d, c5217f, c5217f2, c5213b, bVar, cVar, f2, arrayList, c5213b2);
    }
}
