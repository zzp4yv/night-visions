package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import android.util.Log;
import cm.aptoide.p092pt.utils.MultiDexHelper;
import com.airbnb.lottie.p112s.C5210g;
import com.airbnb.lottie.p116t.C5253c;
import com.airbnb.lottie.p117u.C5283t;
import com.airbnb.lottie.p118v.C5295f;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: LottieCompositionFactory.java */
/* renamed from: com.airbnb.lottie.e */
/* loaded from: classes.dex */
public class C5156e {

    /* renamed from: a */
    private static final Map<String, C5163l<C5155d>> f12344a = new HashMap();

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$a */
    static class a implements InterfaceC5159h<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f12345a;

        a(String str) {
            this.f12345a = str;
        }

        @Override // com.airbnb.lottie.InterfaceC5159h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9387a(Throwable th) {
            C5156e.f12344a.remove(this.f12345a);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$b */
    static class b implements Callable<C5162k<C5155d>> {

        /* renamed from: f */
        final /* synthetic */ Context f12346f;

        /* renamed from: g */
        final /* synthetic */ String f12347g;

        b(Context context, String str) {
            this.f12346f = context;
            this.f12347g = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5162k<C5155d> call() {
            return C5156e.m9415e(this.f12346f, this.f12347g);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$c */
    static class c implements Callable<C5162k<C5155d>> {

        /* renamed from: f */
        final /* synthetic */ Context f12348f;

        /* renamed from: g */
        final /* synthetic */ int f12349g;

        c(Context context, int i2) {
            this.f12348f = context;
            this.f12349g = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5162k<C5155d> call() {
            return C5156e.m9421k(this.f12348f, this.f12349g);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$d */
    static class d implements Callable<C5162k<C5155d>> {

        /* renamed from: f */
        final /* synthetic */ JsonReader f12350f;

        /* renamed from: g */
        final /* synthetic */ String f12351g;

        d(JsonReader jsonReader, String str) {
            this.f12350f = jsonReader;
            this.f12351g = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5162k<C5155d> call() {
            return C5156e.m9419i(this.f12350f, this.f12351g);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$e */
    static class e implements Callable<C5162k<C5155d>> {

        /* renamed from: f */
        final /* synthetic */ C5155d f12352f;

        e(C5155d c5155d) {
            this.f12352f = c5155d;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5162k<C5155d> call() {
            Log.d("Gabe", "call\treturning from cache");
            return new C5162k<>(this.f12352f);
        }
    }

    /* compiled from: LottieCompositionFactory.java */
    /* renamed from: com.airbnb.lottie.e$f */
    static class f implements InterfaceC5159h<C5155d> {

        /* renamed from: a */
        final /* synthetic */ String f12353a;

        f(String str) {
            this.f12353a = str;
        }

        @Override // com.airbnb.lottie.InterfaceC5159h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9387a(C5155d c5155d) {
            if (this.f12353a != null) {
                C5210g.m9612b().m9614c(this.f12353a, c5155d);
            }
            C5156e.f12344a.remove(this.f12353a);
        }
    }

    /* renamed from: b */
    private static C5163l<C5155d> m9412b(String str, Callable<C5162k<C5155d>> callable) {
        C5155d m9613a = C5210g.m9612b().m9613a(str);
        if (m9613a != null) {
            return new C5163l<>(new e(m9613a));
        }
        Map<String, C5163l<C5155d>> map = f12344a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        C5163l<C5155d> c5163l = new C5163l<>(callable);
        c5163l.m9503h(new f(str));
        c5163l.m9502g(new a(str));
        map.put(str, c5163l);
        return c5163l;
    }

    /* renamed from: c */
    private static C5158g m9413c(C5155d c5155d, String str) {
        for (C5158g c5158g : c5155d.m9403i().values()) {
            if (c5158g.m9483b().equals(str)) {
                return c5158g;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C5163l<C5155d> m9414d(Context context, String str) {
        return m9412b(str, new b(context.getApplicationContext(), str));
    }

    /* renamed from: e */
    public static C5162k<C5155d> m9415e(Context context, String str) {
        try {
            String str2 = "asset_" + str;
            return str.endsWith(MultiDexHelper.EXTRACTED_SUFFIX) ? m9423m(new ZipInputStream(context.getAssets().open(str)), str2) : m9416f(context.getAssets().open(str), str2);
        } catch (IOException e2) {
            return new C5162k<>((Throwable) e2);
        }
    }

    /* renamed from: f */
    public static C5162k<C5155d> m9416f(InputStream inputStream, String str) {
        return m9417g(inputStream, str, true);
    }

    /* renamed from: g */
    private static C5162k<C5155d> m9417g(InputStream inputStream, String str, boolean z) {
        try {
            return m9419i(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                C5295f.m9885c(inputStream);
            }
        }
    }

    /* renamed from: h */
    public static C5163l<C5155d> m9418h(JsonReader jsonReader, String str) {
        return m9412b(str, new d(jsonReader, str));
    }

    /* renamed from: i */
    public static C5162k<C5155d> m9419i(JsonReader jsonReader, String str) {
        try {
            C5155d m9830a = C5283t.m9830a(jsonReader);
            C5210g.m9612b().m9614c(str, m9830a);
            return new C5162k<>(m9830a);
        } catch (Exception e2) {
            return new C5162k<>((Throwable) e2);
        }
    }

    /* renamed from: j */
    public static C5163l<C5155d> m9420j(Context context, int i2) {
        return m9412b(m9425o(i2), new c(context.getApplicationContext(), i2));
    }

    /* renamed from: k */
    public static C5162k<C5155d> m9421k(Context context, int i2) {
        try {
            return m9416f(context.getResources().openRawResource(i2), m9425o(i2));
        } catch (Resources.NotFoundException e2) {
            return new C5162k<>((Throwable) e2);
        }
    }

    /* renamed from: l */
    public static C5163l<C5155d> m9422l(Context context, String str) {
        return C5253c.m9768b(context, str);
    }

    /* renamed from: m */
    public static C5162k<C5155d> m9423m(ZipInputStream zipInputStream, String str) {
        try {
            return m9424n(zipInputStream, str);
        } finally {
            C5295f.m9885c(zipInputStream);
        }
    }

    /* renamed from: n */
    private static C5162k<C5155d> m9424n(ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C5155d c5155d = null;
            while (nextEntry != null) {
                if (nextEntry.getName().contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c5155d = m9417g(zipInputStream, str, false).m9488b();
                } else if (nextEntry.getName().contains(".png")) {
                    hashMap.put(nextEntry.getName().split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c5155d == null) {
                return new C5162k<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C5158g m9413c = m9413c(c5155d, (String) entry.getKey());
                if (m9413c != null) {
                    m9413c.m9485d((Bitmap) entry.getValue());
                }
            }
            for (Map.Entry<String, C5158g> entry2 : c5155d.m9403i().entrySet()) {
                if (entry2.getValue().m9482a() == null) {
                    return new C5162k<>((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().m9483b()));
                }
            }
            C5210g.m9612b().m9614c(str, c5155d);
            return new C5162k<>(c5155d);
        } catch (IOException e2) {
            return new C5162k<>((Throwable) e2);
        }
    }

    /* renamed from: o */
    private static String m9425o(int i2) {
        return "rawRes_" + i2;
    }
}
