package p241e.p316i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C10742u;
import kotlin.collections.C10749c0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10780s;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;

/* compiled from: StateMachine.kt */
/* renamed from: e.i.a */
/* loaded from: classes2.dex */
public final class C9019a<STATE, EVENT, SIDE_EFFECT> {

    /* renamed from: a */
    public static final a f34854a = new a(null);

    /* renamed from: b */
    private final AtomicReference<STATE> f34855b;

    /* renamed from: c */
    private final b<STATE, EVENT, SIDE_EFFECT> f34856c;

    /* compiled from: StateMachine.kt */
    /* renamed from: e.i.a$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        private final <STATE, EVENT, SIDE_EFFECT> C9019a<STATE, EVENT, SIDE_EFFECT> m29077a(b<STATE, EVENT, SIDE_EFFECT> bVar, Function1<? super c<STATE, EVENT, SIDE_EFFECT>, C10742u> function1) {
            c cVar = new c(bVar);
            function1.invoke(cVar);
            return new C9019a<>(cVar.m29087a(), null);
        }

        /* renamed from: b */
        public final <STATE, EVENT, SIDE_EFFECT> C9019a<STATE, EVENT, SIDE_EFFECT> m29078b(Function1<? super c<STATE, EVENT, SIDE_EFFECT>, C10742u> function1) {
            C9768m.m32347g(function1, "init");
            return m29077a(null, function1);
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: StateMachine.kt */
    /* renamed from: e.i.a$b */
    public static final class b<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a */
        private final STATE f34857a;

        /* renamed from: b */
        private final Map<d<STATE, STATE>, a<STATE, EVENT, SIDE_EFFECT>> f34858b;

        /* renamed from: c */
        private final List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10742u>> f34859c;

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$b$a */
        public static final class a<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            private final List<Function2<STATE, EVENT, C10742u>> f34860a = new ArrayList();

            /* renamed from: b */
            private final List<Function2<STATE, EVENT, C10742u>> f34861b = new ArrayList();

            /* renamed from: c */
            private final LinkedHashMap<d<EVENT, EVENT>, Function2<STATE, EVENT, C11477a<STATE, SIDE_EFFECT>>> f34862c = new LinkedHashMap<>();

            /* compiled from: StateMachine.kt */
            /* renamed from: e.i.a$b$a$a, reason: collision with other inner class name */
            public static final class C11477a<STATE, SIDE_EFFECT> {

                /* renamed from: a */
                private final STATE f34863a;

                /* renamed from: b */
                private final SIDE_EFFECT f34864b;

                public C11477a(STATE state, SIDE_EFFECT side_effect) {
                    C9768m.m32347g(state, "toState");
                    this.f34863a = state;
                    this.f34864b = side_effect;
                }

                /* renamed from: a */
                public final STATE m29085a() {
                    return this.f34863a;
                }

                /* renamed from: b */
                public final SIDE_EFFECT m29086b() {
                    return this.f34864b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C11477a)) {
                        return false;
                    }
                    C11477a c11477a = (C11477a) obj;
                    return C9768m.m32341a(this.f34863a, c11477a.f34863a) && C9768m.m32341a(this.f34864b, c11477a.f34864b);
                }

                public int hashCode() {
                    STATE state = this.f34863a;
                    int hashCode = (state != null ? state.hashCode() : 0) * 31;
                    SIDE_EFFECT side_effect = this.f34864b;
                    return hashCode + (side_effect != null ? side_effect.hashCode() : 0);
                }

                public String toString() {
                    return "TransitionTo(toState=" + this.f34863a + ", sideEffect=" + this.f34864b + ")";
                }
            }

            /* renamed from: a */
            public final List<Function2<STATE, EVENT, C10742u>> m29082a() {
                return this.f34860a;
            }

            /* renamed from: b */
            public final List<Function2<STATE, EVENT, C10742u>> m29083b() {
                return this.f34861b;
            }

            /* renamed from: c */
            public final LinkedHashMap<d<EVENT, EVENT>, Function2<STATE, EVENT, C11477a<STATE, SIDE_EFFECT>>> m29084c() {
                return this.f34862c;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(STATE state, Map<d<STATE, STATE>, a<STATE, EVENT, SIDE_EFFECT>> map, List<? extends Function1<? super e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10742u>> list) {
            C9768m.m32347g(state, "initialState");
            C9768m.m32347g(map, "stateDefinitions");
            C9768m.m32347g(list, "onTransitionListeners");
            this.f34857a = state;
            this.f34858b = map;
            this.f34859c = list;
        }

        /* renamed from: a */
        public final STATE m29079a() {
            return this.f34857a;
        }

        /* renamed from: b */
        public final List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10742u>> m29080b() {
            return this.f34859c;
        }

        /* renamed from: c */
        public final Map<d<STATE, STATE>, a<STATE, EVENT, SIDE_EFFECT>> m29081c() {
            return this.f34858b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C9768m.m32341a(this.f34857a, bVar.f34857a) && C9768m.m32341a(this.f34858b, bVar.f34858b) && C9768m.m32341a(this.f34859c, bVar.f34859c);
        }

        public int hashCode() {
            STATE state = this.f34857a;
            int hashCode = (state != null ? state.hashCode() : 0) * 31;
            Map<d<STATE, STATE>, a<STATE, EVENT, SIDE_EFFECT>> map = this.f34858b;
            int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
            List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10742u>> list = this.f34859c;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Graph(initialState=" + this.f34857a + ", stateDefinitions=" + this.f34858b + ", onTransitionListeners=" + this.f34859c + ")";
        }
    }

    /* compiled from: StateMachine.kt */
    /* renamed from: e.i.a$e */
    public static abstract class e<STATE, EVENT, SIDE_EFFECT> {

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$e$a */
        public static final class a<STATE, EVENT, SIDE_EFFECT> extends e<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            private final STATE f34876a;

            /* renamed from: b */
            private final EVENT f34877b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(STATE state, EVENT event) {
                super(null);
                C9768m.m32347g(state, "fromState");
                C9768m.m32347g(event, "event");
                this.f34876a = state;
                this.f34877b = event;
            }

            /* renamed from: a */
            public EVENT m29103a() {
                return this.f34877b;
            }

            /* renamed from: b */
            public STATE m29104b() {
                return this.f34876a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C9768m.m32341a(m29104b(), aVar.m29104b()) && C9768m.m32341a(m29103a(), aVar.m29103a());
            }

            public int hashCode() {
                STATE m29104b = m29104b();
                int hashCode = (m29104b != null ? m29104b.hashCode() : 0) * 31;
                EVENT m29103a = m29103a();
                return hashCode + (m29103a != null ? m29103a.hashCode() : 0);
            }

            public String toString() {
                return "Invalid(fromState=" + m29104b() + ", event=" + m29103a() + ")";
            }
        }

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$e$b */
        public static final class b<STATE, EVENT, SIDE_EFFECT> extends e<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            private final STATE f34878a;

            /* renamed from: b */
            private final EVENT f34879b;

            /* renamed from: c */
            private final STATE f34880c;

            /* renamed from: d */
            private final SIDE_EFFECT f34881d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(STATE state, EVENT event, STATE state2, SIDE_EFFECT side_effect) {
                super(null);
                C9768m.m32347g(state, "fromState");
                C9768m.m32347g(event, "event");
                C9768m.m32347g(state2, "toState");
                this.f34878a = state;
                this.f34879b = event;
                this.f34880c = state2;
                this.f34881d = side_effect;
            }

            /* renamed from: a */
            public EVENT m29105a() {
                return this.f34879b;
            }

            /* renamed from: b */
            public STATE m29106b() {
                return this.f34878a;
            }

            /* renamed from: c */
            public final STATE m29107c() {
                return this.f34880c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C9768m.m32341a(m29106b(), bVar.m29106b()) && C9768m.m32341a(m29105a(), bVar.m29105a()) && C9768m.m32341a(this.f34880c, bVar.f34880c) && C9768m.m32341a(this.f34881d, bVar.f34881d);
            }

            public int hashCode() {
                STATE m29106b = m29106b();
                int hashCode = (m29106b != null ? m29106b.hashCode() : 0) * 31;
                EVENT m29105a = m29105a();
                int hashCode2 = (hashCode + (m29105a != null ? m29105a.hashCode() : 0)) * 31;
                STATE state = this.f34880c;
                int hashCode3 = (hashCode2 + (state != null ? state.hashCode() : 0)) * 31;
                SIDE_EFFECT side_effect = this.f34881d;
                return hashCode3 + (side_effect != null ? side_effect.hashCode() : 0);
            }

            public String toString() {
                return "Valid(fromState=" + m29106b() + ", event=" + m29105a() + ", toState=" + this.f34880c + ", sideEffect=" + this.f34881d + ")";
            }
        }

        private e() {
        }

        public /* synthetic */ e(C9756g c9756g) {
            this();
        }
    }

    private C9019a(b<STATE, EVENT, SIDE_EFFECT> bVar) {
        this.f34856c = bVar;
        this.f34855b = new AtomicReference<>(bVar.m29079a());
    }

    /* renamed from: a */
    private final b.a<STATE, EVENT, SIDE_EFFECT> m29070a(STATE state) {
        Map<d<STATE, STATE>, b.a<STATE, EVENT, SIDE_EFFECT>> m29081c = this.f34856c.m29081c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<d<STATE, STATE>, b.a<STATE, EVENT, SIDE_EFFECT>> entry : m29081c.entrySet()) {
            if (entry.getKey().m29100b(state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((b.a) ((Map.Entry) it.next()).getValue());
        }
        b.a<STATE, EVENT, SIDE_EFFECT> aVar = (b.a) C10780s.m38832W(arrayList);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: c */
    private final e<STATE, EVENT, SIDE_EFFECT> m29071c(STATE state, EVENT event) {
        for (Map.Entry<d<EVENT, EVENT>, Function2<STATE, EVENT, b.a.C11477a<STATE, SIDE_EFFECT>>> entry : m29070a(state).m29084c().entrySet()) {
            d<EVENT, EVENT> key = entry.getKey();
            Function2<STATE, EVENT, b.a.C11477a<STATE, SIDE_EFFECT>> value = entry.getValue();
            if (key.m29100b(event)) {
                b.a.C11477a<STATE, SIDE_EFFECT> invoke = value.invoke(state, event);
                return new e.b(state, event, invoke.m29085a(), invoke.m29086b());
            }
        }
        return new e.a(state, event);
    }

    /* renamed from: d */
    private final void m29072d(STATE state, EVENT event) {
        Iterator<T> it = m29070a(state).m29082a().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    /* renamed from: e */
    private final void m29073e(STATE state, EVENT event) {
        Iterator<T> it = m29070a(state).m29083b().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    /* renamed from: f */
    private final void m29074f(e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT> eVar) {
        Iterator<T> it = this.f34856c.m29080b().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(eVar);
        }
    }

    /* renamed from: b */
    public final STATE m29075b() {
        STATE state = this.f34855b.get();
        C9768m.m32342b(state, "stateRef.get()");
        return state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public final e<STATE, EVENT, SIDE_EFFECT> m29076g(EVENT event) {
        e<STATE, EVENT, SIDE_EFFECT> m29071c;
        C9768m.m32347g(event, "event");
        synchronized (this) {
            STATE state = this.f34855b.get();
            C9768m.m32342b(state, "fromState");
            m29071c = m29071c(state, event);
            if (m29071c instanceof e.b) {
                this.f34855b.set(((e.b) m29071c).m29107c());
            }
        }
        m29074f(m29071c);
        if (m29071c instanceof e.b) {
            e.b bVar = (e.b) m29071c;
            m29073e(bVar.m29106b(), event);
            m29072d(bVar.m29107c(), event);
        }
        return m29071c;
    }

    /* compiled from: StateMachine.kt */
    /* renamed from: e.i.a$d */
    public static final class d<T, R extends T> {

        /* renamed from: a */
        public static final a f34872a = new a(null);

        /* renamed from: b */
        private final List<Function1<T, Boolean>> f34873b;

        /* renamed from: c */
        private final Class<R> f34874c;

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$d$a */
        public static final class a {
            private a() {
            }

            /* renamed from: a */
            public final <T, R extends T> d<T, R> m29101a(Class<R> cls) {
                C9768m.m32347g(cls, "clazz");
                return new d<>(cls, null);
            }

            public /* synthetic */ a(C9756g c9756g) {
                this();
            }
        }

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$d$b */
        static final class b extends Lambda implements Function1<T, Boolean> {
            b() {
                super(1);
            }

            /* renamed from: b */
            public final boolean m29102b(T t) {
                C9768m.m32347g(t, "it");
                return d.this.f34874c.isInstance(t);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return Boolean.valueOf(m29102b(obj));
            }
        }

        private d(Class<R> cls) {
            List<Function1<T, Boolean>> m38894p;
            this.f34874c = cls;
            m38894p = C10784u.m38894p(new b());
            this.f34873b = m38894p;
        }

        /* renamed from: b */
        public final boolean m29100b(T t) {
            C9768m.m32347g(t, "value");
            List<Function1<T, Boolean>> list = this.f34873b;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((Function1) it.next()).invoke(t)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ d(Class cls, C9756g c9756g) {
            this(cls);
        }
    }

    public /* synthetic */ C9019a(b bVar, C9756g c9756g) {
        this(bVar);
    }

    /* compiled from: StateMachine.kt */
    /* renamed from: e.i.a$c */
    public static final class c<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a */
        private STATE f34865a;

        /* renamed from: b */
        private final LinkedHashMap<d<STATE, STATE>, b.a<STATE, EVENT, SIDE_EFFECT>> f34866b;

        /* renamed from: c */
        private final ArrayList<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10742u>> f34867c;

        /* compiled from: StateMachine.kt */
        /* renamed from: e.i.a$c$a */
        public final class a<S extends STATE> {

            /* renamed from: a */
            private final b.a<STATE, EVENT, SIDE_EFFECT> f34868a = new b.a<>();

            /* compiled from: StateMachine.kt */
            /* renamed from: e.i.a$c$a$a, reason: collision with other inner class name */
            static final class C11478a extends Lambda implements Function2<STATE, EVENT, b.a.C11477a<? extends STATE, ? extends SIDE_EFFECT>> {

                /* renamed from: f */
                final /* synthetic */ Function2 f34870f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11478a(Function2 function2) {
                    super(2);
                    this.f34870f = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b.a.C11477a<STATE, SIDE_EFFECT> invoke(STATE state, EVENT event) {
                    C9768m.m32347g(state, "state");
                    C9768m.m32347g(event, "event");
                    return (b.a.C11477a) this.f34870f.invoke(state, event);
                }
            }

            /* compiled from: StateMachine.kt */
            /* renamed from: e.i.a$c$a$b */
            static final class b extends Lambda implements Function2<STATE, EVENT, C10742u> {

                /* renamed from: f */
                final /* synthetic */ Function2 f34871f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(Function2 function2) {
                    super(2);
                    this.f34871f = function2;
                }

                /* renamed from: b */
                public final void m29098b(STATE state, EVENT event) {
                    C9768m.m32347g(state, "state");
                    C9768m.m32347g(event, "cause");
                    this.f34871f.invoke(state, event);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ C10742u invoke(Object obj, Object obj2) {
                    m29098b(obj, obj2);
                    return C10742u.f41439a;
                }
            }

            public a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: c */
            public static /* bridge */ /* synthetic */ b.a.C11477a m29090c(a aVar, Object obj, Object obj2, int i2, Object obj3) {
                if ((i2 & 1) != 0) {
                    obj2 = null;
                }
                return aVar.m29093b(obj, obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: g */
            public static /* bridge */ /* synthetic */ b.a.C11477a m29091g(a aVar, Object obj, Object obj2, Object obj3, int i2, Object obj4) {
                if ((i2 & 2) != 0) {
                    obj3 = null;
                }
                return aVar.m29096f(obj, obj2, obj3);
            }

            /* renamed from: a */
            public final b.a<STATE, EVENT, SIDE_EFFECT> m29092a() {
                return this.f34868a;
            }

            /* renamed from: b */
            public final b.a.C11477a<STATE, SIDE_EFFECT> m29093b(S s, SIDE_EFFECT side_effect) {
                C9768m.m32347g(s, "$receiver");
                return m29096f(s, s, side_effect);
            }

            /* renamed from: d */
            public final <E extends EVENT> void m29094d(d<EVENT, ? extends E> dVar, Function2<? super S, ? super E, ? extends b.a.C11477a<? extends STATE, ? extends SIDE_EFFECT>> function2) {
                C9768m.m32347g(dVar, "eventMatcher");
                C9768m.m32347g(function2, "createTransitionTo");
                this.f34868a.m29084c().put(dVar, new C11478a(function2));
            }

            /* renamed from: e */
            public final boolean m29095e(Function2<? super S, ? super EVENT, C10742u> function2) {
                C9768m.m32347g(function2, "listener");
                return this.f34868a.m29082a().add(new b(function2));
            }

            /* renamed from: f */
            public final b.a.C11477a<STATE, SIDE_EFFECT> m29096f(S s, STATE state, SIDE_EFFECT side_effect) {
                C9768m.m32347g(s, "$receiver");
                C9768m.m32347g(state, "state");
                return new b.a.C11477a<>(state, side_effect);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public c(b<STATE, EVENT, SIDE_EFFECT> bVar) {
            List<Function1<e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10742u>> m29080b;
            Map<d<STATE, STATE>, b.a<STATE, EVENT, SIDE_EFFECT>> m29081c;
            this.f34865a = bVar != null ? bVar.m29079a() : null;
            this.f34866b = new LinkedHashMap<>((bVar == null || (m29081c = bVar.m29081c()) == null) ? C10777q0.m38797i() : m29081c);
            this.f34867c = new ArrayList<>((bVar == null || (m29080b = bVar.m29080b()) == null) ? C10784u.m38888j() : m29080b);
        }

        /* renamed from: a */
        public final b<STATE, EVENT, SIDE_EFFECT> m29087a() {
            Map m38807s;
            STATE state = this.f34865a;
            if (state == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            m38807s = C10777q0.m38807s(this.f34866b);
            return new b<>(state, m38807s, C10749c0.m38569E0(this.f34867c));
        }

        /* renamed from: b */
        public final void m29088b(STATE state) {
            C9768m.m32347g(state, "initialState");
            this.f34865a = state;
        }

        /* renamed from: c */
        public final <S extends STATE> void m29089c(d<STATE, ? extends S> dVar, Function1<? super c<STATE, EVENT, SIDE_EFFECT>.a<S>, C10742u> function1) {
            C9768m.m32347g(dVar, "stateMatcher");
            C9768m.m32347g(function1, "init");
            LinkedHashMap<d<STATE, STATE>, b.a<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.f34866b;
            a aVar = new a();
            function1.invoke(aVar);
            linkedHashMap.put(dVar, aVar.m29092a());
        }

        public /* synthetic */ c(b bVar, int i2, C9756g c9756g) {
            this((i2 & 1) != 0 ? null : bVar);
        }
    }
}
