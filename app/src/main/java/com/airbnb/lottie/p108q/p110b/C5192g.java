package com.airbnb.lottie.p108q.p110b;

import android.graphics.Path;
import com.airbnb.lottie.p112s.p114j.C5232g;
import com.airbnb.lottie.p112s.p114j.C5237l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* renamed from: com.airbnb.lottie.q.b.g */
/* loaded from: classes.dex */
public class C5192g {

    /* renamed from: a */
    private final List<AbstractC5186a<C5237l, Path>> f12614a;

    /* renamed from: b */
    private final List<AbstractC5186a<Integer, Integer>> f12615b;

    /* renamed from: c */
    private final List<C5232g> f12616c;

    public C5192g(List<C5232g> list) {
        this.f12616c = list;
        this.f12614a = new ArrayList(list.size());
        this.f12615b = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f12614a.add(list.get(i2).m9656b().mo9617a());
            this.f12615b.add(list.get(i2).m9657c().mo9617a());
        }
    }

    /* renamed from: a */
    public List<AbstractC5186a<C5237l, Path>> m9562a() {
        return this.f12614a;
    }

    /* renamed from: b */
    public List<C5232g> m9563b() {
        return this.f12616c;
    }

    /* renamed from: c */
    public List<AbstractC5186a<Integer, Integer>> m9564c() {
        return this.f12615b;
    }
}
