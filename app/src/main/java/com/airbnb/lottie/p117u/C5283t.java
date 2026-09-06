package com.airbnb.lottie.p117u;

import android.graphics.Rect;
import android.util.JsonReader;
import com.airbnb.lottie.C5154c;
import com.airbnb.lottie.C5155d;
import com.airbnb.lottie.C5158g;
import com.airbnb.lottie.p112s.C5206c;
import com.airbnb.lottie.p112s.C5207d;
import com.airbnb.lottie.p112s.p115k.C5246d;
import com.airbnb.lottie.p118v.C5295f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0870d;
import p024c.p041e.C0874h;

/* compiled from: LottieCompositionParser.java */
/* renamed from: com.airbnb.lottie.u.t */
/* loaded from: classes.dex */
public class C5283t {
    /* renamed from: a */
    public static C5155d m9830a(JsonReader jsonReader) throws IOException {
        C0874h<C5207d> c0874h;
        HashMap hashMap;
        float m9887e = C5295f.m9887e();
        C0870d<C5246d> c0870d = new C0870d<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        C0874h<C5207d> c0874h2 = new C0874h<>();
        C5155d c5155d = new C5155d();
        jsonReader.beginObject();
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "assets":
                    c0874h = c0874h2;
                    hashMap = hashMap4;
                    m9831b(jsonReader, c5155d, hashMap2, hashMap3);
                    continue;
                case "layers":
                    c0874h = c0874h2;
                    hashMap = hashMap4;
                    m9834e(jsonReader, c5155d, arrayList, c0870d);
                    continue;
                case "h":
                    c0874h = c0874h2;
                    hashMap = hashMap4;
                    i3 = jsonReader.nextInt();
                    continue;
                case "v":
                    c0874h = c0874h2;
                    hashMap = hashMap4;
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!C5295f.m9890h(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        c5155d.m9395a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    } else {
                        continue;
                    }
                case "w":
                    c0874h = c0874h2;
                    hashMap = hashMap4;
                    i2 = jsonReader.nextInt();
                    continue;
                case "fr":
                    c0874h = c0874h2;
                    hashMap = hashMap4;
                    f4 = (float) jsonReader.nextDouble();
                    continue;
                case "ip":
                    c0874h = c0874h2;
                    hashMap = hashMap4;
                    f2 = (float) jsonReader.nextDouble();
                    continue;
                case "op":
                    c0874h = c0874h2;
                    hashMap = hashMap4;
                    f3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    continue;
                case "chars":
                    m9832c(jsonReader, c5155d, c0874h2);
                    break;
                case "fonts":
                    m9833d(jsonReader, hashMap4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            c0874h = c0874h2;
            hashMap = hashMap4;
            hashMap4 = hashMap;
            c0874h2 = c0874h;
        }
        jsonReader.endObject();
        c5155d.m9408n(new Rect(0, 0, (int) (i2 * m9887e), (int) (i3 * m9887e)), f2, f3, f4, arrayList, c0870d, hashMap2, hashMap3, c0874h2, hashMap4);
        return c5155d;
    }

    /* renamed from: b */
    private static void m9831b(JsonReader jsonReader, C5155d c5155d, Map<String, List<C5246d>> map, Map<String, C5158g> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            C0870d c0870d = new C0870d();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i2 = 0;
            int i3 = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            C5246d m9828a = C5282s.m9828a(jsonReader, c5155d);
                            c0870d.m5442k(m9828a.m9733b(), m9828a);
                            arrayList.add(m9828a);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        i3 = jsonReader.nextInt();
                        break;
                    case "p":
                        str2 = jsonReader.nextString();
                        break;
                    case "u":
                        str3 = jsonReader.nextString();
                        break;
                    case "w":
                        i2 = jsonReader.nextInt();
                        break;
                    case "id":
                        str = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                C5158g c5158g = new C5158g(i2, i3, str, str2, str3);
                map2.put(c5158g.m9484c(), c5158g);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: c */
    private static void m9832c(JsonReader jsonReader, C5155d c5155d, C0874h<C5207d> c0874h) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            C5207d m9805a = C5272j.m9805a(jsonReader, c5155d);
            c0874h.m5486k(m9805a.hashCode(), m9805a);
        }
        jsonReader.endArray();
    }

    /* renamed from: d */
    private static void m9833d(JsonReader jsonReader, Map<String, C5206c> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C5206c m9806a = C5274k.m9806a(jsonReader);
                    map.put(m9806a.m9598b(), m9806a);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* renamed from: e */
    private static void m9834e(JsonReader jsonReader, C5155d c5155d, List<C5246d> list, C0870d<C5246d> c0870d) throws IOException {
        jsonReader.beginArray();
        int i2 = 0;
        while (jsonReader.hasNext()) {
            C5246d m9828a = C5282s.m9828a(jsonReader, c5155d);
            if (m9828a.m9735d() == C5246d.a.Image) {
                i2++;
            }
            list.add(m9828a);
            c0870d.m5442k(m9828a.m9733b(), m9828a);
            if (i2 > 4) {
                C5154c.m9394d("You have " + i2 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }
}
