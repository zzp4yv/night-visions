package kotlin.reflect.p371y.internal.p374j0.p414k;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.C10742u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.C10736c;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.C10514v;
import okhttp3.HttpUrl;

/* compiled from: LockBasedStorageManager.java */
/* renamed from: kotlin.f0.y.e.j0.k.f */
/* loaded from: classes3.dex */
public class C10289f implements InterfaceC10297n {

    /* renamed from: a */
    private static final String f40007a;

    /* renamed from: b */
    public static final InterfaceC10297n f40008b;

    /* renamed from: c */
    protected final InterfaceC10294k f40009c;

    /* renamed from: d */
    private final f f40010d;

    /* renamed from: e */
    private final String f40011e;

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$a */
    static class a extends C10289f {
        a(String str, f fVar, InterfaceC10294k interfaceC10294k) {
            super(str, fVar, interfaceC10294k, null);
        }

        /* renamed from: j */
        private static /* synthetic */ void m36525j(int i2) {
            String str = i2 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 1 ? 3 : 2];
            if (i2 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i2 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i2 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String format = String.format(str, objArr);
            if (i2 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f
        /* renamed from: p */
        protected <K, V> o<V> mo36524p(String str, K k2) {
            if (str == null) {
                m36525j(0);
            }
            o<V> m36547a = o.m36547a();
            if (m36547a == null) {
                m36525j(1);
            }
            return m36547a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$b */
    class b<T> extends j<T> {

        /* renamed from: i */
        final /* synthetic */ Object f40012i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C10289f c10289f, Function0 function0, Object obj) {
            super(c10289f, function0);
            this.f40012i = obj;
        }

        /* renamed from: b */
        private static /* synthetic */ void m36526b(int i2) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.h
        /* renamed from: e */
        protected o<T> mo36527e(boolean z) {
            o<T> m36548d = o.m36548d(this.f40012i);
            if (m36548d == null) {
                m36526b(0);
            }
            return m36548d;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$c */
    class c<T> extends k<T> {

        /* renamed from: j */
        final /* synthetic */ Function1 f40014j;

        /* renamed from: k */
        final /* synthetic */ Function1 f40015k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C10289f c10289f, Function0 function0, Function1 function1, Function1 function12) {
            super(c10289f, function0);
            this.f40014j = function1;
            this.f40015k = function12;
        }

        /* renamed from: b */
        private static /* synthetic */ void m36528b(int i2) {
            String str = i2 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i2 != 2 ? 2 : 3];
            if (i2 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i2 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i2 == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalArgumentException(format);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.h
        /* renamed from: e */
        protected o<T> mo36527e(boolean z) {
            Function1 function1 = this.f40014j;
            if (function1 == null) {
                o<T> mo36527e = super.mo36527e(z);
                if (mo36527e == null) {
                    m36528b(0);
                }
                return mo36527e;
            }
            o<T> m36548d = o.m36548d(function1.invoke(Boolean.valueOf(z)));
            if (m36548d == null) {
                m36528b(1);
            }
            return m36548d;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.i
        /* renamed from: g */
        protected void mo36529g(T t) {
            if (t == null) {
                m36528b(2);
            }
            this.f40015k.invoke(t);
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$d */
    private static class d<K, V> extends e<K, V> implements InterfaceC10284a<K, V> {
        /* synthetic */ d(C10289f c10289f, ConcurrentMap concurrentMap, a aVar) {
            this(c10289f, concurrentMap);
        }

        /* renamed from: c */
        private static /* synthetic */ void m36530c(int i2) {
            String str = i2 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 3 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "computation";
            } else if (i2 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i2 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i2 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.e, kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10284a
        /* renamed from: b */
        public V mo36506b(K k2, Function0<? extends V> function0) {
            if (function0 == null) {
                m36530c(2);
            }
            V v = (V) super.mo36506b(k2, function0);
            if (v == null) {
                m36530c(3);
            }
            return v;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(C10289f c10289f, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(c10289f, concurrentMap, null);
            if (c10289f == null) {
                m36530c(0);
            }
            if (concurrentMap == null) {
                m36530c(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$e */
    private static class e<K, V> extends l<g<K, V>, V> implements InterfaceC10285b<K, V> {

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: kotlin.f0.y.e.j0.k.f$e$a */
        class a implements Function1<g<K, V>, V> {
            a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public V invoke(g<K, V> gVar) {
                return (V) ((g) gVar).f40019b.invoke();
            }
        }

        /* synthetic */ e(C10289f c10289f, ConcurrentMap concurrentMap, a aVar) {
            this(c10289f, concurrentMap);
        }

        /* renamed from: c */
        private static /* synthetic */ void m36531c(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i2 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public V mo36506b(K k2, Function0<? extends V> function0) {
            if (function0 == null) {
                m36531c(2);
            }
            return invoke(new g(k2, function0));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(C10289f c10289f, ConcurrentMap<g<K, V>, Object> concurrentMap) {
            super(c10289f, concurrentMap, new a());
            if (c10289f == null) {
                m36531c(0);
            }
            if (concurrentMap == null) {
                m36531c(1);
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$f */
    public interface f {

        /* renamed from: a */
        public static final f f40017a = new a();

        /* compiled from: LockBasedStorageManager.java */
        /* renamed from: kotlin.f0.y.e.j0.k.f$f$a */
        static class a implements f {
            a() {
            }

            /* renamed from: b */
            private static /* synthetic */ void m36534b(int i2) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.f
            /* renamed from: a */
            public RuntimeException mo36533a(Throwable th) {
                if (th == null) {
                    m36534b(0);
                }
                throw C10736c.m38524b(th);
            }
        }

        /* renamed from: a */
        RuntimeException mo36533a(Throwable th);
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$g */
    private static class g<K, V> {

        /* renamed from: a */
        private final K f40018a;

        /* renamed from: b */
        private final Function0<? extends V> f40019b;

        public g(K k2, Function0<? extends V> function0) {
            this.f40018a = k2;
            this.f40019b = function0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && g.class == obj.getClass() && this.f40018a.equals(((g) obj).f40018a);
        }

        public int hashCode() {
            return this.f40018a.hashCode();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$h */
    private static class h<T> implements InterfaceC10293j<T> {

        /* renamed from: f */
        private final C10289f f40020f;

        /* renamed from: g */
        private final Function0<? extends T> f40021g;

        /* renamed from: h */
        private volatile Object f40022h;

        public h(C10289f c10289f, Function0<? extends T> function0) {
            if (c10289f == null) {
                m36536b(0);
            }
            if (function0 == null) {
                m36536b(1);
            }
            this.f40022h = n.NOT_COMPUTED;
            this.f40020f = c10289f;
            this.f40021g = function0;
        }

        /* renamed from: b */
        private static /* synthetic */ void m36536b(int i2) {
            String str = (i2 == 2 || i2 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 2 || i2 == 3) ? 2 : 3];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 == 2 || i2 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i2 != 2 && i2 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 != 2 && i2 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: a */
        public boolean m36537a() {
            return (this.f40022h == n.NOT_COMPUTED || this.f40022h == n.COMPUTING) ? false : true;
        }

        /* renamed from: c */
        protected void mo36538c(T t) {
        }

        /* renamed from: e */
        protected o<T> mo36527e(boolean z) {
            o<T> mo36524p = this.f40020f.mo36524p("in a lazy value", null);
            if (mo36524p == null) {
                m36536b(2);
            }
            return mo36524p;
        }

        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T invoke;
            Object obj = this.f40022h;
            if (!(obj instanceof n)) {
                return (T) WrappedValues.m38505f(obj);
            }
            this.f40020f.f40009c.lock();
            try {
                Object obj2 = this.f40022h;
                if (obj2 instanceof n) {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f40022h = n.RECURSION_WAS_DETECTED;
                        o<T> mo36527e = mo36527e(true);
                        if (!mo36527e.m36550c()) {
                            invoke = mo36527e.m36549b();
                        }
                    }
                    if (obj2 == n.RECURSION_WAS_DETECTED) {
                        o<T> mo36527e2 = mo36527e(false);
                        if (!mo36527e2.m36550c()) {
                            invoke = mo36527e2.m36549b();
                        }
                    }
                    this.f40022h = nVar;
                    try {
                        invoke = this.f40021g.invoke();
                        mo36538c(invoke);
                        this.f40022h = invoke;
                    } catch (Throwable th) {
                        if (C10736c.m38523a(th)) {
                            this.f40022h = n.NOT_COMPUTED;
                            throw th;
                        }
                        if (this.f40022h == n.COMPUTING) {
                            this.f40022h = WrappedValues.m38502c(th);
                        }
                        throw this.f40020f.f40010d.mo36533a(th);
                    }
                } else {
                    invoke = (T) WrappedValues.m38505f(obj2);
                }
                return invoke;
            } finally {
                this.f40020f.f40009c.unlock();
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$i */
    private static abstract class i<T> extends h<T> {

        /* renamed from: i */
        private volatile C10295l<T> f40023i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C10289f c10289f, Function0<? extends T> function0) {
            super(c10289f, function0);
            if (c10289f == null) {
                m36539b(0);
            }
            if (function0 == null) {
                m36539b(1);
            }
            this.f40023i = null;
        }

        /* renamed from: b */
        private static /* synthetic */ void m36539b(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.h
        /* renamed from: c */
        protected final void mo36538c(T t) {
            this.f40023i = new C10295l<>(t);
            try {
                mo36529g(t);
            } finally {
                this.f40023i = null;
            }
        }

        /* renamed from: g */
        protected abstract void mo36529g(T t);

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.h, kotlin.jvm.functions.Function0
        public T invoke() {
            C10295l<T> c10295l = this.f40023i;
            return (c10295l == null || !c10295l.m36554b()) ? (T) super.invoke() : c10295l.m36553a();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$j */
    private static class j<T> extends h<T> implements InterfaceC10292i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C10289f c10289f, Function0<? extends T> function0) {
            super(c10289f, function0);
            if (c10289f == null) {
                m36540b(0);
            }
            if (function0 == null) {
                m36540b(1);
            }
        }

        /* renamed from: b */
        private static /* synthetic */ void m36540b(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 2 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m36540b(2);
            }
            return t;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$k */
    private static abstract class k<T> extends i<T> implements InterfaceC10292i<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C10289f c10289f, Function0<? extends T> function0) {
            super(c10289f, function0);
            if (c10289f == null) {
                m36541b(0);
            }
            if (function0 == null) {
                m36541b(1);
            }
        }

        /* renamed from: b */
        private static /* synthetic */ void m36541b(int i2) {
            String str = i2 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 2 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "computable";
            } else if (i2 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i2 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.i, kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.h, kotlin.jvm.functions.Function0
        public T invoke() {
            T t = (T) super.invoke();
            if (t == null) {
                m36541b(2);
            }
            return t;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$l */
    private static class l<K, V> implements InterfaceC10291h<K, V> {

        /* renamed from: f */
        private final C10289f f40024f;

        /* renamed from: g */
        private final ConcurrentMap<K, Object> f40025g;

        /* renamed from: h */
        private final Function1<? super K, ? extends V> f40026h;

        public l(C10289f c10289f, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            if (c10289f == null) {
                m36542c(0);
            }
            if (concurrentMap == null) {
                m36542c(1);
            }
            if (function1 == null) {
                m36542c(2);
            }
            this.f40024f = c10289f;
            this.f40025g = concurrentMap;
            this.f40026h = function1;
        }

        /* renamed from: c */
        private static /* synthetic */ void m36542c(int i2) {
            String str = (i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i2 == 3 || i2 == 4) ? 2 : 3];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "compute";
            } else if (i2 == 3 || i2 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i2 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i2 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i2 != 3 && i2 != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 != 3 && i2 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: e */
        private AssertionError m36543e(K k2, Object obj) {
            AssertionError assertionError = (AssertionError) C10289f.m36512q(new AssertionError("Race condition detected on input " + k2 + ". Old value is " + obj + " under " + this.f40024f));
            if (assertionError == null) {
                m36542c(4);
            }
            return assertionError;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10291h
        /* renamed from: f */
        public boolean mo36544f(K k2) {
            Object obj = this.f40025g.get(k2);
            return (obj == null || obj == n.COMPUTING) ? false : true;
        }

        /* renamed from: g */
        protected o<V> m36545g(K k2, boolean z) {
            o<V> mo36524p = this.f40024f.mo36524p(HttpUrl.FRAGMENT_ENCODE_SET, k2);
            if (mo36524p == null) {
                m36542c(3);
            }
            return mo36524p;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(K k2) {
            V v;
            Object obj = this.f40025g.get(k2);
            if (obj != null && obj != n.COMPUTING) {
                return (V) WrappedValues.m38503d(obj);
            }
            this.f40024f.f40009c.lock();
            try {
                Object obj2 = this.f40025g.get(k2);
                n nVar = n.COMPUTING;
                if (obj2 == nVar) {
                    obj2 = n.RECURSION_WAS_DETECTED;
                    o<V> m36545g = m36545g(k2, true);
                    if (!m36545g.m36550c()) {
                        v = m36545g.m36549b();
                        return v;
                    }
                }
                if (obj2 == n.RECURSION_WAS_DETECTED) {
                    o<V> m36545g2 = m36545g(k2, false);
                    if (!m36545g2.m36550c()) {
                        v = m36545g2.m36549b();
                        return v;
                    }
                }
                if (obj2 != null) {
                    v = (V) WrappedValues.m38503d(obj2);
                    return v;
                }
                AssertionError assertionError = null;
                try {
                    this.f40025g.put(k2, nVar);
                    V invoke = this.f40026h.invoke(k2);
                    Object put = this.f40025g.put(k2, WrappedValues.m38501b(invoke));
                    if (put == nVar) {
                        return invoke;
                    }
                    assertionError = m36543e(k2, put);
                    throw assertionError;
                } catch (Throwable th) {
                    if (C10736c.m38523a(th)) {
                        this.f40025g.remove(k2);
                        throw th;
                    }
                    if (th == assertionError) {
                        throw this.f40024f.f40010d.mo36533a(th);
                    }
                    Object put2 = this.f40025g.put(k2, WrappedValues.m38502c(th));
                    if (put2 != n.COMPUTING) {
                        throw m36543e(k2, put2);
                    }
                    throw this.f40024f.f40010d.mo36533a(th);
                }
            } finally {
                this.f40024f.f40009c.unlock();
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$m */
    private static class m<K, V> extends l<K, V> implements InterfaceC10290g<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C10289f c10289f, ConcurrentMap<K, Object> concurrentMap, Function1<? super K, ? extends V> function1) {
            super(c10289f, concurrentMap, function1);
            if (c10289f == null) {
                m36546c(0);
            }
            if (concurrentMap == null) {
                m36546c(1);
            }
            if (function1 == null) {
                m36546c(2);
            }
        }

        /* renamed from: c */
        private static /* synthetic */ void m36546c(int i2) {
            String str = i2 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i2 != 3 ? 3 : 2];
            if (i2 == 1) {
                objArr[0] = "map";
            } else if (i2 == 2) {
                objArr[0] = "compute";
            } else if (i2 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i2 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i2 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i2 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.l, kotlin.jvm.functions.Function1
        public V invoke(K k2) {
            V v = (V) super.invoke(k2);
            if (v == null) {
                m36546c(3);
            }
            return v;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$n */
    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.f0.y.e.j0.k.f$o */
    private static class o<T> {

        /* renamed from: a */
        private final T f40031a;

        /* renamed from: b */
        private final boolean f40032b;

        private o(T t, boolean z) {
            this.f40031a = t;
            this.f40032b = z;
        }

        /* renamed from: a */
        public static <T> o<T> m36547a() {
            return new o<>(null, true);
        }

        /* renamed from: d */
        public static <T> o<T> m36548d(T t) {
            return new o<>(t, false);
        }

        /* renamed from: b */
        public T m36549b() {
            return this.f40031a;
        }

        /* renamed from: c */
        public boolean m36550c() {
            return this.f40032b;
        }

        public String toString() {
            return m36550c() ? "FALL_THROUGH" : String.valueOf(this.f40031a);
        }
    }

    static {
        String m37547N0;
        m37547N0 = C10514v.m37547N0(C10289f.class.getCanonicalName(), ".", HttpUrl.FRAGMENT_ENCODE_SET);
        f40007a = m37547N0;
        f40008b = new a("NO_LOCKS", f.f40017a, C10288e.f40006b);
    }

    /* synthetic */ C10289f(String str, f fVar, InterfaceC10294k interfaceC10294k, a aVar) {
        this(str, fVar, interfaceC10294k);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m36508j(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p414k.C10289f.m36508j(int):void");
    }

    /* renamed from: m */
    private static <K> ConcurrentMap<K, Object> m36511m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static <T extends Throwable> T m36512q(T t) {
        if (t == null) {
            m36508j(36);
        }
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (!stackTrace[i3].getClassName().startsWith(f40007a)) {
                i2 = i3;
                break;
            }
            i3++;
        }
        List subList = Arrays.asList(stackTrace).subList(i2, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n
    /* renamed from: a */
    public <K, V> InterfaceC10285b<K, V> mo36513a() {
        return new e(this, m36511m(), null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n
    /* renamed from: b */
    public <K, V> InterfaceC10284a<K, V> mo36514b() {
        return new d(this, m36511m(), null);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n
    /* renamed from: c */
    public <T> InterfaceC10292i<T> mo36515c(Function0<? extends T> function0, T t) {
        if (function0 == null) {
            m36508j(26);
        }
        if (t == null) {
            m36508j(27);
        }
        return new b(this, function0, t);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n
    /* renamed from: d */
    public <T> InterfaceC10292i<T> mo36516d(Function0<? extends T> function0) {
        if (function0 == null) {
            m36508j(23);
        }
        return new j(this, function0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n
    /* renamed from: e */
    public <T> T mo36517e(Function0<? extends T> function0) {
        if (function0 == null) {
            m36508j(34);
        }
        this.f40009c.lock();
        try {
            return function0.invoke();
        } finally {
        }
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n
    /* renamed from: f */
    public <T> InterfaceC10293j<T> mo36518f(Function0<? extends T> function0) {
        if (function0 == null) {
            m36508j(30);
        }
        return new h(this, function0);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n
    /* renamed from: g */
    public <T> InterfaceC10292i<T> mo36519g(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, C10742u> function12) {
        if (function0 == null) {
            m36508j(28);
        }
        if (function12 == null) {
            m36508j(29);
        }
        return new c(this, function0, function1, function12);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n
    /* renamed from: h */
    public <K, V> InterfaceC10290g<K, V> mo36520h(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m36508j(9);
        }
        InterfaceC10290g<K, V> m36522n = m36522n(function1, m36511m());
        if (m36522n == null) {
            m36508j(10);
        }
        return m36522n;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n
    /* renamed from: i */
    public <K, V> InterfaceC10291h<K, V> mo36521i(Function1<? super K, ? extends V> function1) {
        if (function1 == null) {
            m36508j(19);
        }
        InterfaceC10291h<K, V> m36523o = m36523o(function1, m36511m());
        if (m36523o == null) {
            m36508j(20);
        }
        return m36523o;
    }

    /* renamed from: n */
    public <K, V> InterfaceC10290g<K, V> m36522n(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m36508j(14);
        }
        if (concurrentMap == null) {
            m36508j(15);
        }
        return new m(this, concurrentMap, function1);
    }

    /* renamed from: o */
    public <K, V> InterfaceC10291h<K, V> m36523o(Function1<? super K, ? extends V> function1, ConcurrentMap<K, Object> concurrentMap) {
        if (function1 == null) {
            m36508j(21);
        }
        if (concurrentMap == null) {
            m36508j(22);
        }
        return new l(this, concurrentMap, function1);
    }

    /* renamed from: p */
    protected <K, V> o<V> mo36524p(String str, K k2) {
        String str2;
        if (str == null) {
            m36508j(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (k2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = "on input: " + k2;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) m36512q(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f40011e + ")";
    }

    private C10289f(String str, f fVar, InterfaceC10294k interfaceC10294k) {
        if (str == null) {
            m36508j(4);
        }
        if (fVar == null) {
            m36508j(5);
        }
        if (interfaceC10294k == null) {
            m36508j(6);
        }
        this.f40009c = interfaceC10294k;
        this.f40010d = fVar;
        this.f40011e = str;
    }

    public C10289f(String str) {
        this(str, (Runnable) null, (Function1<InterruptedException, C10742u>) null);
    }

    public C10289f(String str, Runnable runnable, Function1<InterruptedException, C10742u> function1) {
        this(str, f.f40017a, InterfaceC10294k.f40033a.m36552a(runnable, function1));
    }
}
