package com.airbnb.epoxy;

import androidx.recyclerview.widget.C0621b;
import androidx.recyclerview.widget.C0625f;
import androidx.recyclerview.widget.InterfaceC0631l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* compiled from: DiffResult.java */
/* renamed from: com.airbnb.epoxy.k */
/* loaded from: classes.dex */
public class C5122k {

    /* renamed from: a */
    final List<? extends AbstractC5141s<?>> f12242a;

    /* renamed from: b */
    final List<? extends AbstractC5141s<?>> f12243b;

    /* renamed from: c */
    final C0625f.c f12244c;

    private C5122k(List<? extends AbstractC5141s<?>> list, List<? extends AbstractC5141s<?>> list2, C0625f.c cVar) {
        this.f12242a = list;
        this.f12243b = list2;
        this.f12244c = cVar;
    }

    /* renamed from: a */
    static C5122k m9301a(List<? extends AbstractC5141s<?>> list) {
        return new C5122k(list, Collections.EMPTY_LIST, null);
    }

    /* renamed from: b */
    static C5122k m9302b(List<? extends AbstractC5141s<?>> list, List<? extends AbstractC5141s<?>> list2, C0625f.c cVar) {
        return new C5122k(list, list2, cVar);
    }

    /* renamed from: e */
    static C5122k m9303e(List<? extends AbstractC5141s<?>> list) {
        return new C5122k(Collections.EMPTY_LIST, list, null);
    }

    /* renamed from: f */
    static C5122k m9304f(List<? extends AbstractC5141s<?>> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C5122k(list, list, null);
    }

    /* renamed from: c */
    public void m9305c(InterfaceC0631l interfaceC0631l) {
        C0625f.c cVar = this.f12244c;
        if (cVar != null) {
            cVar.m4481d(interfaceC0631l);
            return;
        }
        if (this.f12243b.isEmpty() && !this.f12242a.isEmpty()) {
            interfaceC0631l.mo4438c(0, this.f12242a.size());
        } else {
            if (this.f12243b.isEmpty() || !this.f12242a.isEmpty()) {
                return;
            }
            interfaceC0631l.mo4437b(0, this.f12243b.size());
        }
    }

    /* renamed from: d */
    public void m9306d(RecyclerView.AbstractC0594g abstractC0594g) {
        m9305c(new C0621b(abstractC0594g));
    }
}
