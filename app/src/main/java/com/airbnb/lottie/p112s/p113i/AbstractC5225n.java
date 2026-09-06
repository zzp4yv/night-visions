package com.airbnb.lottie.p112s.p113i;

import com.airbnb.lottie.p119w.C5296a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* renamed from: com.airbnb.lottie.s.i.n */
/* loaded from: classes.dex */
abstract class AbstractC5225n<V, O> implements InterfaceC5224m<V, O> {

    /* renamed from: a */
    final List<C5296a<V>> f12692a;

    AbstractC5225n(V v) {
        this(Collections.singletonList(new C5296a(v)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f12692a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f12692a.toArray()));
        }
        return sb.toString();
    }

    AbstractC5225n(List<C5296a<V>> list) {
        this.f12692a = list;
    }
}
