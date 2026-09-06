package com.airbnb.epoxy.preload;

import android.content.Context;
import android.view.View;
import androidx.core.view.C0311u;
import com.airbnb.epoxy.AbstractC5108d;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.C5103a0;
import com.airbnb.epoxy.C5110e;
import com.airbnb.epoxy.C5143u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10742u;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9757g0;
import kotlin.jvm.internal.C9768m;

/* compiled from: PreloadableViewDataProvider.kt */
/* renamed from: com.airbnb.epoxy.preload.f */
/* loaded from: classes.dex */
public final class C5136f {

    /* renamed from: a */
    private final Map<a, List<C5137g<?>>> f12276a;

    /* renamed from: b */
    private final AbstractC5108d f12277b;

    /* renamed from: c */
    private final Function2<Context, RuntimeException, C10742u> f12278c;

    /* compiled from: PreloadableViewDataProvider.kt */
    /* renamed from: com.airbnb.epoxy.preload.f$a */
    private static final class a {

        /* renamed from: a */
        private final Class<? extends AbstractC5141s<?>> f12279a;

        /* renamed from: b */
        private final int f12280b;

        /* renamed from: c */
        private final int f12281c;

        /* renamed from: d */
        private final Object f12282d;

        public a(Class<? extends AbstractC5141s<?>> cls, int i2, int i3, Object obj) {
            C9768m.m32347g(cls, "epoxyModelClass");
            this.f12279a = cls;
            this.f12280b = i2;
            this.f12281c = i3;
            this.f12282d = obj;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C9768m.m32341a(this.f12279a, aVar.f12279a)) {
                        if (this.f12280b == aVar.f12280b) {
                            if (!(this.f12281c == aVar.f12281c) || !C9768m.m32341a(this.f12282d, aVar.f12282d)) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Class<? extends AbstractC5141s<?>> cls = this.f12279a;
            int hashCode = (((((cls != null ? cls.hashCode() : 0) * 31) + this.f12280b) * 31) + this.f12281c) * 31;
            Object obj = this.f12282d;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            return "CacheKey(epoxyModelClass=" + this.f12279a + ", spanSize=" + this.f12280b + ", viewType=" + this.f12281c + ", signature=" + this.f12282d + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5136f(AbstractC5108d abstractC5108d, Function2<? super Context, ? super RuntimeException, C10742u> function2) {
        C9768m.m32347g(abstractC5108d, "adapter");
        C9768m.m32347g(function2, "errorHandler");
        this.f12277b = abstractC5108d;
        this.f12278c = function2;
        this.f12276a = new LinkedHashMap();
    }

    /* renamed from: a */
    private final <T extends AbstractC5141s<?>, U extends InterfaceC5138h, P extends InterfaceC5133c> C5137g<U> m9344a(View view, AbstractC5131a<T, U, P> abstractC5131a, T t) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (width > 0 && height > 0) {
            return new C5137g<>(view.getId(), width, height, abstractC5131a.m9328a(view));
        }
        Function2<Context, RuntimeException, C10742u> function2 = this.f12278c;
        Context context = view.getContext();
        C9768m.m32342b(context, "context");
        function2.invoke(context, new EpoxyPreloadException(view.getClass().getSimpleName() + " in " + t.getClass().getSimpleName() + " has zero size. A size must be set to allow preloading."));
        return null;
    }

    /* renamed from: b */
    private final <T extends AbstractC5141s<?>> a m9345b(AbstractC5131a<T, ?, ?> abstractC5131a, T t, int i2) {
        return new a(t.getClass(), this.f12277b.m9271n() ? t.spanSize(this.f12277b.m9269l(), i2, this.f12277b.getItemCount()) : 1, C5103a0.m9200d(t), abstractC5131a.m9332e(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private final <T extends AbstractC5141s<?>, U extends InterfaceC5138h, P extends InterfaceC5133c> List<C5137g<U>> m9346d(AbstractC5131a<T, U, P> abstractC5131a, T t, a aVar) {
        C5143u c5143u;
        View view;
        C5110e m9197a = C5103a0.m9197a(this.f12277b);
        C9768m.m32342b(m9197a, "adapter.boundViewHoldersInternal()");
        Iterator<C5143u> it = m9197a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c5143u = null;
                break;
            }
            c5143u = it.next();
            C5143u c5143u2 = c5143u;
            C9768m.m32342b(c5143u2, "it");
            AbstractC5141s<?> m9364c = c5143u2.m9364c();
            boolean z = false;
            if (C9768m.m32341a(C9757g0.m32298b(m9364c.getClass()), C9757g0.m32298b(t.getClass())) && C0311u.m2101N(c5143u2.itemView) && C0311u.m2102O(c5143u2.itemView) && C9768m.m32341a(m9345b(abstractC5131a, m9364c, c5143u2.getAdapterPosition()), aVar)) {
                z = true;
            }
        }
        C5143u c5143u3 = c5143u;
        if (c5143u3 == null || (view = c5143u3.itemView) == 0) {
            return null;
        }
        C9768m.m32342b(view, "holderMatch?.itemView ?: return null");
        Object m9199c = C5103a0.m9199c(c5143u3);
        List<View> m9347e = abstractC5131a.m9330c().isEmpty() ^ true ? m9347e(view, abstractC5131a.m9330c(), t) : view instanceof InterfaceC5135e ? ((InterfaceC5135e) view).m9343a() : m9199c instanceof InterfaceC5135e ? ((InterfaceC5135e) m9199c).m9343a() : C10784u.m38888j();
        if (m9347e.isEmpty()) {
            Function2<Context, RuntimeException, C10742u> function2 = this.f12278c;
            Context context = view.getContext();
            C9768m.m32342b(context, "rootView.context");
            function2.invoke(context, new EpoxyPreloadException("No preloadable views were found in " + t.getClass().getSimpleName()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = m9347e.iterator();
        while (it2.hasNext()) {
            C10794z.m38933z(arrayList, m9348f((View) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C5137g m9344a = m9344a((View) it3.next(), abstractC5131a, t);
            if (m9344a != null) {
                arrayList2.add(m9344a);
            }
        }
        return arrayList2;
    }

    /* renamed from: e */
    private final <T extends AbstractC5141s<?>> List<View> m9347e(View view, List<Integer> list, T t) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            View findViewById = view.findViewById(intValue);
            if (findViewById == null) {
                Function2<Context, RuntimeException, C10742u> function2 = this.f12278c;
                Context context = view.getContext();
                C9768m.m32342b(context, "context");
                function2.invoke(context, new EpoxyPreloadException("View with id " + intValue + " in " + t.getClass().getSimpleName() + " could not be found."));
            }
            if (findViewById != null) {
                arrayList.add(findViewById);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private final <T extends View> List<View> m9348f(T t) {
        if (!(t instanceof InterfaceC5135e)) {
            return C10782t.m38883e(t);
        }
        List<View> m9343a = ((InterfaceC5135e) t).m9343a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m9343a.iterator();
        while (it.hasNext()) {
            C10794z.m38933z(arrayList, m9348f((View) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <T extends AbstractC5141s<?>, U extends InterfaceC5138h, P extends InterfaceC5133c> List<C5137g<U>> m9349c(AbstractC5131a<T, U, P> abstractC5131a, T t, int i2) {
        C9768m.m32347g(abstractC5131a, "preloader");
        C9768m.m32347g(t, "epoxyModel");
        a m9345b = m9345b(abstractC5131a, t, i2);
        Map<a, List<C5137g<?>>> map = this.f12276a;
        Object obj = map.get(m9345b);
        if (obj == null) {
            obj = m9346d(abstractC5131a, t, m9345b);
            map.put(m9345b, obj);
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<C5137g<U>> list = (List) obj;
        return list != null ? list : C10784u.m38888j();
    }
}
