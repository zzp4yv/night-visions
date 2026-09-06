package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcxn {

    /* renamed from: a */
    public final int f25269a;

    /* renamed from: b */
    public final int f25270b;

    /* renamed from: c */
    public final boolean f25271c;

    public zzcxn(int i2, int i3, boolean z) {
        this.f25269a = i2;
        this.f25270b = i3;
        this.f25271c = z;
    }

    /* renamed from: a */
    static List<zzcxn> m19022a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i3 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzcxn(i2, i3, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
