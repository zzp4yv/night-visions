package com.facebook.p157o0.p160m0;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.C5608a0;
import com.facebook.FacebookException;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5647h0;
import com.facebook.internal.C5663p0;
import com.facebook.p157o0.p160m0.C5830h;
import com.facebook.p157o0.p160m0.C5833k;
import com.facebook.p157o0.p160m0.p161n.C5836a;
import com.facebook.p157o0.p160m0.p161n.C5837b;
import com.facebook.p157o0.p160m0.p161n.C5838c;
import com.facebook.p157o0.p160m0.p161n.C5841f;
import com.facebook.p157o0.p165q0.C5869g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;

/* compiled from: CodelessMatcher.kt */
/* renamed from: com.facebook.o0.m0.j */
/* loaded from: classes.dex */
public final class C5832j {

    /* renamed from: a */
    public static final a f15182a = new a(null);

    /* renamed from: b */
    private static final String f15183b = C5832j.class.getCanonicalName();

    /* renamed from: c */
    private static C5832j f15184c;

    /* renamed from: d */
    private final Handler f15185d;

    /* renamed from: e */
    private final Set<Activity> f15186e;

    /* renamed from: f */
    private final Set<c> f15187f;

    /* renamed from: g */
    private HashSet<String> f15188g;

    /* renamed from: h */
    private final HashMap<Integer, HashSet<String>> f15189h;

    /* compiled from: CodelessMatcher.kt */
    /* renamed from: com.facebook.o0.m0.j$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final synchronized C5832j m12403a() {
            C5832j c5832j;
            if (C5832j.f15184c == null) {
                C5832j.f15184c = new C5832j(null);
            }
            c5832j = C5832j.f15184c;
            if (c5832j == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return c5832j;
        }

        /* renamed from: b */
        public final Bundle m12404b(C5836a c5836a, View view, View view2) {
            List<C5837b> m12437c;
            List<b> m12415a;
            C9768m.m32346f(view, "rootView");
            C9768m.m32346f(view2, "hostView");
            Bundle bundle = new Bundle();
            if (c5836a != null && (m12437c = c5836a.m12437c()) != null) {
                for (C5837b c5837b : m12437c) {
                    if (c5837b.m12446d() != null) {
                        if (c5837b.m12446d().length() > 0) {
                            bundle.putString(c5837b.m12443a(), c5837b.m12446d());
                        }
                    }
                    if (c5837b.m12444b().size() > 0) {
                        if (C9768m.m32341a(c5837b.m12445c(), "relative")) {
                            c.a aVar = c.f15192f;
                            List<C5838c> m12444b = c5837b.m12444b();
                            String simpleName = view2.getClass().getSimpleName();
                            C9768m.m32345e(simpleName, "hostView.javaClass.simpleName");
                            m12415a = aVar.m12415a(c5836a, view2, m12444b, 0, -1, simpleName);
                        } else {
                            c.a aVar2 = c.f15192f;
                            List<C5838c> m12444b2 = c5837b.m12444b();
                            String simpleName2 = view.getClass().getSimpleName();
                            C9768m.m32345e(simpleName2, "rootView.javaClass.simpleName");
                            m12415a = aVar2.m12415a(c5836a, view, m12444b2, 0, -1, simpleName2);
                        }
                        Iterator<b> it = m12415a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                b next = it.next();
                                if (next.m12405a() != null) {
                                    C5841f c5841f = C5841f.f15257a;
                                    String m12478k = C5841f.m12478k(next.m12405a());
                                    if (m12478k.length() > 0) {
                                        bundle.putString(c5837b.m12443a(), m12478k);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    /* compiled from: CodelessMatcher.kt */
    /* renamed from: com.facebook.o0.m0.j$b */
    public static final class b {

        /* renamed from: a */
        private final WeakReference<View> f15190a;

        /* renamed from: b */
        private final String f15191b;

        public b(View view, String str) {
            C9768m.m32346f(view, "view");
            C9768m.m32346f(str, "viewMapKey");
            this.f15190a = new WeakReference<>(view);
            this.f15191b = str;
        }

        /* renamed from: a */
        public final View m12405a() {
            WeakReference<View> weakReference = this.f15190a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        /* renamed from: b */
        public final String m12406b() {
            return this.f15191b;
        }
    }

    /* compiled from: CodelessMatcher.kt */
    /* renamed from: com.facebook.o0.m0.j$c */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: f */
        public static final a f15192f = new a(null);

        /* renamed from: g */
        private final WeakReference<View> f15193g;

        /* renamed from: h */
        private List<C5836a> f15194h;

        /* renamed from: i */
        private final Handler f15195i;

        /* renamed from: j */
        private final HashSet<String> f15196j;

        /* renamed from: k */
        private final String f15197k;

        /* compiled from: CodelessMatcher.kt */
        /* renamed from: com.facebook.o0.m0.j$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9756g c9756g) {
                this();
            }

            /* renamed from: b */
            private final List<View> m12413b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt.getVisibility() == 0) {
                            C9768m.m32345e(childAt, "child");
                            arrayList.add(childAt);
                        }
                        if (i3 >= childCount) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
            
                if (kotlin.jvm.internal.C9768m.m32341a(r9.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) != false) goto L16;
             */
            /* renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final boolean m12414c(android.view.View r9, com.facebook.p157o0.p160m0.p161n.C5838c r10, int r11) {
                /*
                    Method dump skipped, instructions count: 333
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p160m0.C5832j.c.a.m12414c(android.view.View, com.facebook.o0.m0.n.c, int):boolean");
            }

            /* renamed from: a */
            public final List<b> m12415a(C5836a c5836a, View view, List<C5838c> list, int i2, int i3, String str) {
                List<View> m12413b;
                int size;
                List<View> m12413b2;
                int size2;
                C9768m.m32346f(list, "path");
                C9768m.m32346f(str, "mapKey");
                String str2 = str + '.' + i3;
                ArrayList arrayList = new ArrayList();
                if (view == null) {
                    return arrayList;
                }
                if (i2 >= list.size()) {
                    arrayList.add(new b(view, str2));
                } else {
                    C5838c c5838c = list.get(i2);
                    if (C9768m.m32341a(c5838c.m12447a(), "..")) {
                        ViewParent parent = view.getParent();
                        if ((parent instanceof ViewGroup) && (size = (m12413b = m12413b((ViewGroup) parent)).size()) > 0) {
                            int i4 = 0;
                            while (true) {
                                int i5 = i4 + 1;
                                arrayList.addAll(m12415a(c5836a, m12413b.get(i4), list, i2 + 1, i4, str2));
                                if (i5 >= size) {
                                    break;
                                }
                                i4 = i5;
                            }
                        }
                        return arrayList;
                    }
                    if (C9768m.m32341a(c5838c.m12447a(), ".")) {
                        arrayList.add(new b(view, str2));
                        return arrayList;
                    }
                    if (!m12414c(view, c5838c, i3)) {
                        return arrayList;
                    }
                    if (i2 == list.size() - 1) {
                        arrayList.add(new b(view, str2));
                    }
                }
                if ((view instanceof ViewGroup) && (size2 = (m12413b2 = m12413b((ViewGroup) view)).size()) > 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        arrayList.addAll(m12415a(c5836a, m12413b2.get(i6), list, i2 + 1, i6, str2));
                        if (i7 >= size2) {
                            break;
                        }
                        i6 = i7;
                    }
                }
                return arrayList;
            }
        }

        public c(View view, Handler handler, HashSet<String> hashSet, String str) {
            C9768m.m32346f(handler, "handler");
            C9768m.m32346f(hashSet, "listenerSet");
            C9768m.m32346f(str, "activityName");
            this.f15193g = new WeakReference<>(view);
            this.f15195i = handler;
            this.f15196j = hashSet;
            this.f15197k = str;
            handler.postDelayed(this, 200L);
        }

        /* renamed from: a */
        private final void m12407a(b bVar, View view, C5836a c5836a) {
            if (c5836a == null) {
                return;
            }
            try {
                View m12405a = bVar.m12405a();
                if (m12405a == null) {
                    return;
                }
                C5841f c5841f = C5841f.f15257a;
                View m12468a = C5841f.m12468a(m12405a);
                if (m12468a != null && c5841f.m12486p(m12405a, m12468a)) {
                    m12410d(bVar, view, c5836a);
                    return;
                }
                String name = m12405a.getClass().getName();
                C9768m.m32345e(name, "view.javaClass.name");
                if (C10513u.m37511E(name, "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(m12405a instanceof AdapterView)) {
                    m12408b(bVar, view, c5836a);
                } else if (m12405a instanceof ListView) {
                    m12409c(bVar, view, c5836a);
                }
            } catch (Exception e2) {
                C5663p0 c5663p0 = C5663p0.f14478a;
                C5663p0.m11573i0(C5832j.f15183b, e2);
            }
        }

        /* renamed from: b */
        private final void m12408b(b bVar, View view, C5836a c5836a) {
            boolean z;
            View m12405a = bVar.m12405a();
            if (m12405a == null) {
                return;
            }
            String m12406b = bVar.m12406b();
            C5841f c5841f = C5841f.f15257a;
            View.OnClickListener m12474g = C5841f.m12474g(m12405a);
            if (m12474g instanceof C5830h.a) {
                if (m12474g == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((C5830h.a) m12474g).m12377a()) {
                    z = true;
                    if (!this.f15196j.contains(m12406b) || z) {
                    }
                    C5830h c5830h = C5830h.f15163a;
                    m12405a.setOnClickListener(C5830h.m12371a(c5836a, view, m12405a));
                    this.f15196j.add(m12406b);
                    return;
                }
            }
            z = false;
            if (this.f15196j.contains(m12406b)) {
            }
        }

        /* renamed from: c */
        private final void m12409c(b bVar, View view, C5836a c5836a) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.m12405a();
            if (adapterView == null) {
                return;
            }
            String m12406b = bVar.m12406b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof C5830h.b) {
                if (onItemClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((C5830h.b) onItemClickListener).m12378a()) {
                    z = true;
                    if (!this.f15196j.contains(m12406b) || z) {
                    }
                    C5830h c5830h = C5830h.f15163a;
                    adapterView.setOnItemClickListener(C5830h.m12372b(c5836a, view, adapterView));
                    this.f15196j.add(m12406b);
                    return;
                }
            }
            z = false;
            if (this.f15196j.contains(m12406b)) {
            }
        }

        /* renamed from: d */
        private final void m12410d(b bVar, View view, C5836a c5836a) {
            boolean z;
            View m12405a = bVar.m12405a();
            if (m12405a == null) {
                return;
            }
            String m12406b = bVar.m12406b();
            C5841f c5841f = C5841f.f15257a;
            View.OnTouchListener m12475h = C5841f.m12475h(m12405a);
            if (m12475h instanceof C5833k.a) {
                if (m12475h == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((C5833k.a) m12475h).m12417a()) {
                    z = true;
                    if (!this.f15196j.contains(m12406b) || z) {
                    }
                    C5833k c5833k = C5833k.f15198a;
                    m12405a.setOnTouchListener(C5833k.m12416a(c5836a, view, m12405a));
                    this.f15196j.add(m12406b);
                    return;
                }
            }
            z = false;
            if (this.f15196j.contains(m12406b)) {
            }
        }

        /* renamed from: e */
        private final void m12411e(C5836a c5836a, View view) {
            if (c5836a == null || view == null) {
                return;
            }
            String m12435a = c5836a.m12435a();
            if ((m12435a == null || m12435a.length() == 0) || C9768m.m32341a(c5836a.m12435a(), this.f15197k)) {
                List<C5838c> m12438d = c5836a.m12438d();
                if (m12438d.size() > 25) {
                    return;
                }
                Iterator<b> it = f15192f.m12415a(c5836a, view, m12438d, 0, -1, this.f15197k).iterator();
                while (it.hasNext()) {
                    m12407a(it.next(), view, c5836a);
                }
            }
        }

        /* renamed from: f */
        private final void m12412f() {
            List<C5836a> list = this.f15194h;
            if (list == null || this.f15193g.get() == null) {
                return;
            }
            int i2 = 0;
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i3 = i2 + 1;
                m12411e(list.get(i2), this.f15193g.get());
                if (i3 > size) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m12412f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m12412f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            C5608a0 c5608a0 = C5608a0.f14199a;
            String m11285d = C5608a0.m11285d();
            C5639d0 c5639d0 = C5639d0.f14392a;
            C5637c0 m11417c = C5639d0.m11417c(m11285d);
            if (m11417c == null || !m11417c.m11398b()) {
                return;
            }
            List<C5836a> m12441b = C5836a.f15215a.m12441b(m11417c.m11400d());
            this.f15194h = m12441b;
            if (m12441b == null || (view = this.f15193g.get()) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                viewTreeObserver.addOnScrollChangedListener(this);
            }
            m12412f();
        }
    }

    private C5832j() {
        this.f15185d = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C9768m.m32345e(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f15186e = newSetFromMap;
        this.f15187f = new LinkedHashSet();
        this.f15188g = new HashSet<>();
        this.f15189h = new HashMap<>();
    }

    public /* synthetic */ C5832j(C9756g c9756g) {
        this();
    }

    /* renamed from: g */
    private final void m12397g() {
        for (Activity activity : this.f15186e) {
            if (activity != null) {
                C5869g c5869g = C5869g.f15370a;
                View m12628e = C5869g.m12628e(activity);
                String simpleName = activity.getClass().getSimpleName();
                Handler handler = this.f15185d;
                HashSet<String> hashSet = this.f15188g;
                C9768m.m32345e(simpleName, "activityName");
                this.f15187f.add(new c(m12628e, handler, hashSet, simpleName));
            }
        }
    }

    /* renamed from: i */
    private final void m12398i() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m12397g();
        } else {
            this.f15185d.post(new Runnable() { // from class: com.facebook.o0.m0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5832j.m12399j(C5832j.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m12399j(C5832j c5832j) {
        C9768m.m32346f(c5832j, "this$0");
        c5832j.m12397g();
    }

    /* renamed from: d */
    public final void m12400d(Activity activity) {
        C9768m.m32346f(activity, "activity");
        C5647h0 c5647h0 = C5647h0.f14422a;
        if (C5647h0.m11442b()) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        }
        this.f15186e.add(activity);
        this.f15188g.clear();
        HashSet<String> hashSet = this.f15189h.get(Integer.valueOf(activity.hashCode()));
        if (hashSet != null) {
            this.f15188g = hashSet;
        }
        m12398i();
    }

    /* renamed from: e */
    public final void m12401e(Activity activity) {
        C9768m.m32346f(activity, "activity");
        this.f15189h.remove(Integer.valueOf(activity.hashCode()));
    }

    /* renamed from: h */
    public final void m12402h(Activity activity) {
        C9768m.m32346f(activity, "activity");
        C5647h0 c5647h0 = C5647h0.f14422a;
        if (C5647h0.m11442b()) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        }
        this.f15186e.remove(activity);
        this.f15187f.clear();
        this.f15189h.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f15188g.clone());
        this.f15188g.clear();
    }
}
