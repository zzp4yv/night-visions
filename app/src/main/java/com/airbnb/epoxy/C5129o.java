package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.C0625f;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.C5106c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EpoxyControllerAdapter.java */
/* renamed from: com.airbnb.epoxy.o */
/* loaded from: classes.dex */
public final class C5129o extends AbstractC5108d implements C5106c.e {

    /* renamed from: k */
    private static final C0625f.d<AbstractC5141s<?>> f12255k = new a();

    /* renamed from: l */
    private final C5111e0 f12256l;

    /* renamed from: m */
    private final C5106c f12257m;

    /* renamed from: n */
    private final AbstractC5128n f12258n;

    /* renamed from: o */
    private int f12259o;

    /* renamed from: p */
    private final List<InterfaceC5115g0> f12260p;

    /* compiled from: EpoxyControllerAdapter.java */
    /* renamed from: com.airbnb.epoxy.o$a */
    static class a extends C0625f.d<AbstractC5141s<?>> {
        a() {
        }

        @Override // androidx.recyclerview.widget.C0625f.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo4483a(AbstractC5141s<?> abstractC5141s, AbstractC5141s<?> abstractC5141s2) {
            return abstractC5141s.equals(abstractC5141s2);
        }

        @Override // androidx.recyclerview.widget.C0625f.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean mo4484b(AbstractC5141s<?> abstractC5141s, AbstractC5141s<?> abstractC5141s2) {
            return abstractC5141s.m9359id() == abstractC5141s2.m9359id();
        }

        @Override // androidx.recyclerview.widget.C0625f.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object mo4485c(AbstractC5141s<?> abstractC5141s, AbstractC5141s<?> abstractC5141s2) {
            return new C5120j(abstractC5141s);
        }
    }

    C5129o(AbstractC5128n abstractC5128n, Handler handler) {
        C5111e0 c5111e0 = new C5111e0();
        this.f12256l = c5111e0;
        this.f12260p = new ArrayList();
        this.f12258n = abstractC5128n;
        this.f12257m = new C5106c(handler, this, f12255k);
        registerAdapterDataObserver(c5111e0);
    }

    /* renamed from: C */
    public void m9318C(InterfaceC5115g0 interfaceC5115g0) {
        this.f12260p.add(interfaceC5115g0);
    }

    /* renamed from: D */
    public List<AbstractC5141s<?>> m9319D() {
        return mo9267j();
    }

    /* renamed from: E */
    public int m9320E(AbstractC5141s<?> abstractC5141s) {
        int size = mo9267j().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (mo9267j().get(i2).m9359id() == abstractC5141s.m9359id()) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: F */
    public boolean m9321F() {
        return this.f12257m.m9210g();
    }

    /* renamed from: G */
    void m9322G(int i2, int i3) {
        ArrayList arrayList = new ArrayList(mo9267j());
        arrayList.add(i3, arrayList.remove(i2));
        this.f12256l.m9289a();
        notifyItemMoved(i2, i3);
        this.f12256l.m9290b();
        if (this.f12257m.m9208e(arrayList)) {
            this.f12258n.requestModelBuild();
        }
    }

    /* renamed from: H */
    public void m9323H(InterfaceC5115g0 interfaceC5115g0) {
        this.f12260p.remove(interfaceC5115g0);
    }

    /* renamed from: I */
    void m9324I(C5116h c5116h) {
        List<? extends AbstractC5141s<?>> mo9267j = mo9267j();
        if (!mo9267j.isEmpty()) {
            if (mo9267j.get(0).isDebugValidationEnabled()) {
                for (int i2 = 0; i2 < mo9267j.size(); i2++) {
                    mo9267j.get(i2).validateStateHasNotChangedSinceAdded("The model was changed between being bound and when models were rebuilt", i2);
                }
            }
        }
        this.f12257m.m9211i(c5116h);
    }

    @Override // com.airbnb.epoxy.C5106c.e
    /* renamed from: d */
    public void mo9216d(C5122k c5122k) {
        this.f12259o = c5122k.f12243b.size();
        this.f12256l.m9289a();
        c5122k.m9306d(this);
        this.f12256l.m9290b();
        for (int size = this.f12260p.size() - 1; size >= 0; size--) {
            this.f12260p.get(size).m9294a(c5122k);
        }
    }

    @Override // com.airbnb.epoxy.AbstractC5108d, androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.f12259o;
    }

    @Override // com.airbnb.epoxy.AbstractC5108d
    /* renamed from: h */
    boolean mo9265h() {
        return true;
    }

    @Override // com.airbnb.epoxy.AbstractC5108d
    /* renamed from: i */
    public C5110e mo9266i() {
        return super.mo9266i();
    }

    @Override // com.airbnb.epoxy.AbstractC5108d
    /* renamed from: j */
    List<? extends AbstractC5141s<?>> mo9267j() {
        return this.f12257m.m9209f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f12258n.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f12258n.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    @Override // com.airbnb.epoxy.AbstractC5108d
    /* renamed from: r */
    protected void mo9275r(RuntimeException runtimeException) {
        this.f12258n.onExceptionSwallowed(runtimeException);
    }

    @Override // com.airbnb.epoxy.AbstractC5108d
    /* renamed from: u */
    protected void mo9278u(C5143u c5143u, AbstractC5141s<?> abstractC5141s, int i2, AbstractC5141s<?> abstractC5141s2) {
        this.f12258n.onModelBound(c5143u, abstractC5141s, i2, abstractC5141s2);
    }

    @Override // com.airbnb.epoxy.AbstractC5108d
    /* renamed from: w */
    protected void mo9280w(C5143u c5143u, AbstractC5141s<?> abstractC5141s) {
        this.f12258n.onModelUnbound(c5143u, abstractC5141s);
    }

    @Override // com.airbnb.epoxy.AbstractC5108d, androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(C5143u c5143u) {
        super.onViewAttachedToWindow(c5143u);
        this.f12258n.onViewAttachedToWindow(c5143u, c5143u.m9364c());
    }

    @Override // com.airbnb.epoxy.AbstractC5108d, androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(C5143u c5143u) {
        super.onViewDetachedFromWindow(c5143u);
        this.f12258n.onViewDetachedFromWindow(c5143u, c5143u.m9364c());
    }
}
