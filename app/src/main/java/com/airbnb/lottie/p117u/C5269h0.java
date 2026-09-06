package com.airbnb.lottie.p117u;

import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5212a;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5215d;
import com.airbnb.lottie.p112s.p114j.C5241p;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ShapeStrokeParser.java */
/* renamed from: com.airbnb.lottie.u.h0 */
/* loaded from: classes.dex */
class C5269h0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static C5241p m9802a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        char c2;
        char c3;
        ArrayList arrayList = new ArrayList();
        String str = null;
        C5213b c5213b = null;
        C5212a c5212a = null;
        C5215d c5215d = null;
        C5213b c5213b2 = null;
        C5241p.b bVar = null;
        C5241p.c cVar = null;
        float f2 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100:
                    if (nextName.equals("d")) {
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
                case 119:
                    if (nextName.equals("w")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c2 = 7;
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
                    c5212a = C5260d.m9785c(jsonReader, c5155d);
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        C5213b c5213b3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("n")) {
                                str2 = jsonReader.nextString();
                            } else if (nextName2.equals("v")) {
                                c5213b3 = C5260d.m9787e(jsonReader, c5155d);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                            case 1:
                                arrayList.add(c5213b3);
                                break;
                            case 2:
                                c5213b = c5213b3;
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                case 2:
                    c5215d = C5260d.m9790h(jsonReader, c5155d);
                    break;
                case 3:
                    c5213b2 = C5260d.m9787e(jsonReader, c5155d);
                    break;
                case 4:
                    bVar = C5241p.b.values()[jsonReader.nextInt() - 1];
                    break;
                case 5:
                    cVar = C5241p.c.values()[jsonReader.nextInt() - 1];
                    break;
                case 6:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C5241p(str, c5213b, arrayList, c5212a, c5215d, c5213b2, bVar, cVar, f2);
    }
}
