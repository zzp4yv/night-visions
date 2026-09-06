package com.airbnb.lottie.p117u;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.p112s.p113i.C5213b;
import com.airbnb.lottie.p112s.p113i.C5221j;
import com.airbnb.lottie.p112s.p113i.C5222k;
import com.airbnb.lottie.p112s.p113i.C5223l;
import com.airbnb.lottie.p112s.p114j.InterfaceC5227b;
import com.airbnb.lottie.p112s.p115k.C5246d;
import com.airbnb.lottie.p118v.C5295f;
import com.airbnb.lottie.p119w.C5296a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: LayerParser.java */
/* renamed from: com.airbnb.lottie.u.s */
/* loaded from: classes.dex */
public class C5282s {
    /* renamed from: a */
    public static C5246d m9828a(JsonReader jsonReader, C5155d c5155d) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        C5246d.b bVar = C5246d.b.None;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        C5246d.b bVar2 = bVar;
        C5246d.a aVar = null;
        String str = null;
        C5223l c5223l = null;
        C5221j c5221j = null;
        C5222k c5222k = null;
        C5213b c5213b = null;
        long j2 = 0;
        long j3 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f4 = 1.0f;
        float f5 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "parent":
                    j3 = jsonReader.nextInt();
                    continue;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        InterfaceC5227b m9799a = C5266g.m9799a(jsonReader, c5155d);
                        if (m9799a != null) {
                            arrayList4.add(m9799a);
                        }
                    }
                    jsonReader.endArray();
                    continue;
                case "h":
                    i6 = (int) (jsonReader.nextInt() * C5295f.m9887e());
                    continue;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                c5222k = C5256b.m9777a(jsonReader, c5155d);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (nextName2.equals("d")) {
                            c5221j = C5260d.m9786d(jsonReader, c5155d);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case "w":
                    i5 = (int) (jsonReader.nextInt() * C5295f.m9887e());
                    continue;
                case "cl":
                    str2 = jsonReader.nextString();
                    continue;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            nextName3.hashCode();
                            if (nextName3.equals("nm")) {
                                arrayList5.add(jsonReader.nextString());
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    c5155d.m9395a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    continue;
                case "ip":
                    f2 = (float) jsonReader.nextDouble();
                    continue;
                case "ks":
                    c5223l = C5258c.m9780a(jsonReader, c5155d);
                    continue;
                case "nm":
                    str3 = jsonReader.nextString();
                    continue;
                case "op":
                    f3 = (float) jsonReader.nextDouble();
                    continue;
                case "sc":
                    i4 = Color.parseColor(jsonReader.nextString());
                    continue;
                case "sh":
                    i3 = (int) (jsonReader.nextInt() * C5295f.m9887e());
                    continue;
                case "sr":
                    f4 = (float) jsonReader.nextDouble();
                    continue;
                case "st":
                    f5 = (float) jsonReader.nextDouble();
                    continue;
                case "sw":
                    i2 = (int) (jsonReader.nextInt() * C5295f.m9887e());
                    continue;
                case "tm":
                    c5213b = C5260d.m9788f(jsonReader, c5155d, false);
                    continue;
                case "tt":
                    bVar2 = C5246d.b.values()[jsonReader.nextInt()];
                    break;
                case "ty":
                    int nextInt = jsonReader.nextInt();
                    aVar = C5246d.a.Unknown;
                    if (nextInt < aVar.ordinal()) {
                        aVar = C5246d.a.values()[nextInt];
                        break;
                    }
                    break;
                case "ind":
                    j2 = jsonReader.nextInt();
                    break;
                case "refId":
                    str = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList3.add(C5284u.m9835a(jsonReader, c5155d));
                    }
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        float f6 = f2 / f4;
        float f7 = f3 / f4;
        ArrayList arrayList6 = new ArrayList();
        if (f6 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C5296a(c5155d, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f6)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f7 <= 0.0f) {
            f7 = c5155d.m9400f();
        }
        arrayList2.add(new C5296a(c5155d, valueOf, valueOf, null, f6, Float.valueOf(f7)));
        arrayList2.add(new C5296a(c5155d, valueOf2, valueOf2, null, f7, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            c5155d.m9395a("Convert your Illustrator layers to shape layers.");
        }
        return new C5246d(arrayList4, c5155d, str3, j2, aVar, j3, str, arrayList, c5223l, i2, i3, i4, f4, f5, i5, i6, c5221j, c5222k, arrayList2, bVar2, c5213b);
    }

    /* renamed from: b */
    public static C5246d m9829b(C5155d c5155d) {
        Rect m9396b = c5155d.m9396b();
        return new C5246d(Collections.emptyList(), c5155d, "__container", -1L, C5246d.a.PreComp, -1L, null, Collections.emptyList(), new C5223l(), 0, 0, 0, 0.0f, 0.0f, m9396b.width(), m9396b.height(), null, null, Collections.emptyList(), C5246d.b.None, null);
    }
}
