package com.airbnb.epoxy.preload;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.AbstractC5108d;
import com.airbnb.epoxy.AbstractC5124l;
import com.airbnb.epoxy.AbstractC5128n;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.C5103a0;
import com.airbnb.epoxy.preload.InterfaceC5133c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10742u;
import kotlin.TypeCastException;
import kotlin.collections.C10749c0;
import kotlin.collections.C10775p0;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;

/* compiled from: EpoxyPreloader.kt */
/* renamed from: com.airbnb.epoxy.preload.b */
/* loaded from: classes.dex */
public final class C5132b<P extends InterfaceC5133c> extends RecyclerView.AbstractC0607t {

    /* renamed from: a */
    public static final a f12265a = new a(null);

    /* renamed from: b */
    private IntRange f12266b;

    /* renamed from: c */
    private IntProgression f12267c;

    /* renamed from: d */
    private int f12268d;

    /* renamed from: e */
    private int f12269e;

    /* renamed from: f */
    private final Map<Class<? extends AbstractC5141s<?>>, AbstractC5131a<?, ?, ? extends P>> f12270f;

    /* renamed from: g */
    private final C5134d<P> f12271g;

    /* renamed from: h */
    private final C5136f f12272h;

    /* renamed from: i */
    private final AbstractC5108d f12273i;

    /* renamed from: j */
    private final int f12274j;

    /* compiled from: EpoxyPreloader.kt */
    /* renamed from: com.airbnb.epoxy.preload.b$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final <P extends InterfaceC5133c> C5132b<P> m9339a(AbstractC5124l abstractC5124l, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, C10742u> function2, int i2, List<? extends AbstractC5131a<? extends AbstractC5141s<?>, ? extends InterfaceC5138h, ? extends P>> list) {
            C9768m.m32347g(abstractC5124l, "epoxyAdapter");
            C9768m.m32347g(function0, "requestHolderFactory");
            C9768m.m32347g(function2, "errorHandler");
            C9768m.m32347g(list, "modelPreloaders");
            return new C5132b<>(abstractC5124l, (Function0) function0, function2, i2, (List) list);
        }

        /* renamed from: b */
        public final <P extends InterfaceC5133c> C5132b<P> m9340b(AbstractC5128n abstractC5128n, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, C10742u> function2, int i2, List<? extends AbstractC5131a<? extends AbstractC5141s<?>, ? extends InterfaceC5138h, ? extends P>> list) {
            C9768m.m32347g(abstractC5128n, "epoxyController");
            C9768m.m32347g(function0, "requestHolderFactory");
            C9768m.m32347g(function2, "errorHandler");
            C9768m.m32347g(list, "modelPreloaders");
            return new C5132b<>(abstractC5128n, function0, function2, i2, list);
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    private C5132b(AbstractC5108d abstractC5108d, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, C10742u> function2, int i2, List<? extends AbstractC5131a<?, ?, ? extends P>> list) {
        int m38793e;
        int m32419b;
        this.f12273i = abstractC5108d;
        this.f12274j = i2;
        IntRange.a aVar = IntRange.f37222j;
        this.f12266b = aVar.m32402a();
        this.f12267c = aVar.m32402a();
        this.f12268d = -1;
        m38793e = C10775p0.m38793e(C10786v.m38911u(list, 10));
        m32419b = C9815l.m32419b(m38793e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
        for (Object obj : list) {
            linkedHashMap.put(((AbstractC5131a) obj).m9329b(), obj);
        }
        this.f12270f = linkedHashMap;
        this.f12271g = new C5134d<>(this.f12274j, function0);
        this.f12272h = new C5136f(this.f12273i, function2);
        if (this.f12274j > 0) {
            return;
        }
        throw new IllegalArgumentException(("maxItemsToPreload must be greater than 0. Was " + this.f12274j).toString());
    }

    /* renamed from: a */
    private final IntProgression m9333a(int i2, int i3, boolean z) {
        int i4 = z ? i3 + 1 : i2 - 1;
        int i5 = this.f12274j;
        return IntProgression.f37214f.m32396a(m9334c(i4), m9334c((z ? i5 - 1 : 1 - i5) + i4), z ? 1 : -1);
    }

    /* renamed from: c */
    private final int m9334c(int i2) {
        return Math.min(this.f12268d - 1, Math.max(i2, 0));
    }

    /* renamed from: d */
    private final boolean m9335d(int i2) {
        return Math.abs(i2) > 75;
    }

    /* renamed from: e */
    private final boolean m9336e(int i2) {
        return i2 == -1 || i2 >= this.f12268d;
    }

    /* renamed from: f */
    private final void m9337f(int i2) {
        AbstractC5141s<?> m9198b = C5103a0.m9198b(this.f12273i, i2);
        if (!(m9198b instanceof AbstractC5141s)) {
            m9198b = null;
        }
        if (m9198b != null) {
            AbstractC5131a<?, ?, ? extends P> abstractC5131a = this.f12270f.get(m9198b.getClass());
            AbstractC5131a<?, ?, ? extends P> abstractC5131a2 = abstractC5131a instanceof AbstractC5131a ? abstractC5131a : null;
            if (abstractC5131a2 != null) {
                Iterator it = this.f12272h.m9349c(abstractC5131a2, m9198b, i2).iterator();
                while (it.hasNext()) {
                    abstractC5131a2.m9331d(m9198b, this.f12271g.m9342b(), (C5137g) it.next());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m9338b() {
        this.f12271g.m9341a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
    public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        C9768m.m32347g(recyclerView, "recyclerView");
        this.f12269e = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
    public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        Set m38619y0;
        C9768m.m32347g(recyclerView, "recyclerView");
        if ((i2 == 0 && i3 == 0) || m9335d(i2) || m9335d(i3)) {
            return;
        }
        RecyclerView.AbstractC0594g adapter = recyclerView.getAdapter();
        this.f12268d = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.AbstractC0602o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (m9336e(findFirstVisibleItemPosition) || m9336e(findLastVisibleItemPosition)) {
            IntRange.a aVar = IntRange.f37222j;
            this.f12266b = aVar.m32402a();
            this.f12267c = aVar.m32402a();
            return;
        }
        IntRange intRange = new IntRange(findFirstVisibleItemPosition, findLastVisibleItemPosition);
        if (C9768m.m32341a(intRange, this.f12266b)) {
            return;
        }
        IntProgression m9333a = m9333a(findFirstVisibleItemPosition, findLastVisibleItemPosition, intRange.getF37215g() > this.f12266b.getF37215g() || intRange.getF37216h() > this.f12266b.getF37216h());
        m38619y0 = C10749c0.m38619y0(m9333a, this.f12267c);
        Iterator it = m38619y0.iterator();
        while (it.hasNext()) {
            m9337f(((Number) it.next()).intValue());
        }
        this.f12266b = intRange;
        this.f12267c = m9333a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5132b(com.airbnb.epoxy.AbstractC5128n r8, kotlin.jvm.functions.Function0<? extends P> r9, kotlin.jvm.functions.Function2<? super android.content.Context, ? super java.lang.RuntimeException, kotlin.C10742u> r10, int r11, java.util.List<? extends com.airbnb.epoxy.preload.AbstractC5131a<?, ?, ? extends P>> r12) {
        /*
            r7 = this;
            java.lang.String r0 = "epoxyController"
            kotlin.jvm.internal.C9768m.m32347g(r8, r0)
            java.lang.String r0 = "requestHolderFactory"
            kotlin.jvm.internal.C9768m.m32347g(r9, r0)
            java.lang.String r0 = "errorHandler"
            kotlin.jvm.internal.C9768m.m32347g(r10, r0)
            java.lang.String r0 = "modelPreloaders"
            kotlin.jvm.internal.C9768m.m32347g(r12, r0)
            com.airbnb.epoxy.o r2 = r8.getAdapter()
            java.lang.String r8 = "epoxyController.adapter"
            kotlin.jvm.internal.C9768m.m32342b(r2, r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.preload.C5132b.<init>(com.airbnb.epoxy.n, kotlin.a0.c.a, kotlin.a0.c.p, int, java.util.List):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5132b(AbstractC5124l abstractC5124l, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, C10742u> function2, int i2, List<? extends AbstractC5131a<?, ?, ? extends P>> list) {
        this((AbstractC5108d) abstractC5124l, (Function0) function0, function2, i2, (List) list);
        C9768m.m32347g(abstractC5124l, "adapter");
        C9768m.m32347g(function0, "requestHolderFactory");
        C9768m.m32347g(function2, "errorHandler");
        C9768m.m32347g(list, "modelPreloaders");
    }
}
