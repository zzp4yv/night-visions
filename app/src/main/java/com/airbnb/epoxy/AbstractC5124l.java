package com.airbnb.epoxy;

import java.util.List;

/* compiled from: EpoxyAdapter.java */
/* renamed from: com.airbnb.epoxy.l */
/* loaded from: classes.dex */
public abstract class AbstractC5124l extends AbstractC5108d {

    /* renamed from: k */
    private final C5146x f12245k = new C5146x();

    /* renamed from: l */
    protected final List<AbstractC5141s<?>> f12246l = new C5107c0();

    @Override // com.airbnb.epoxy.AbstractC5108d
    /* renamed from: j */
    List<AbstractC5141s<?>> mo9267j() {
        return this.f12246l;
    }

    @Override // com.airbnb.epoxy.AbstractC5108d
    /* renamed from: k */
    AbstractC5141s<?> mo9268k(int i2) {
        AbstractC5141s<?> abstractC5141s = this.f12246l.get(i2);
        return abstractC5141s.isShown() ? abstractC5141s : this.f12245k;
    }
}
