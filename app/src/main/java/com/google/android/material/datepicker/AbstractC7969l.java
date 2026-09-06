package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes2.dex */
abstract class AbstractC7969l<S> extends Fragment {

    /* renamed from: f */
    protected final LinkedHashSet<AbstractC7968k<S>> f30179f = new LinkedHashSet<>();

    AbstractC7969l() {
    }

    /* renamed from: d */
    boolean m24418d(AbstractC7968k<S> abstractC7968k) {
        return this.f30179f.add(abstractC7968k);
    }

    /* renamed from: e */
    void m24419e() {
        this.f30179f.clear();
    }
}
