package com.airbnb.lottie.p111r;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C5152a;
import com.airbnb.lottie.p112s.C5211h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* renamed from: com.airbnb.lottie.r.a */
/* loaded from: classes.dex */
public class C5202a {

    /* renamed from: d */
    private final AssetManager f12640d;

    /* renamed from: e */
    private C5152a f12641e;

    /* renamed from: a */
    private final C5211h<String> f12637a = new C5211h<>();

    /* renamed from: b */
    private final Map<C5211h<String>, Typeface> f12638b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f12639c = new HashMap();

    /* renamed from: f */
    private String f12642f = ".ttf";

    public C5202a(Drawable.Callback callback, C5152a c5152a) {
        if (callback instanceof View) {
            this.f12640d = ((View) callback).getContext().getAssets();
        } else {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f12640d = null;
        }
    }

    /* renamed from: a */
    private Typeface m9582a(String str) {
        Typeface typeface = this.f12639c.get(str);
        if (typeface != null) {
            return typeface;
        }
        C5152a c5152a = this.f12641e;
        if (c5152a != null) {
            throw null;
        }
        if (c5152a != null) {
            throw null;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f12640d, "fonts/" + str + this.f12642f);
        this.f12639c.put(str, createFromAsset);
        return createFromAsset;
    }

    /* renamed from: d */
    private Typeface m9583d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i2 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i2 ? typeface : Typeface.create(typeface, i2);
    }

    /* renamed from: b */
    public Typeface m9584b(String str, String str2) {
        this.f12637a.m9616b(str, str2);
        Typeface typeface = this.f12638b.get(this.f12637a);
        if (typeface != null) {
            return typeface;
        }
        Typeface m9583d = m9583d(m9582a(str), str2);
        this.f12638b.put(this.f12637a, m9583d);
        return m9583d;
    }

    /* renamed from: c */
    public void m9585c(C5152a c5152a) {
    }
}
