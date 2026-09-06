package com.flurry.sdk;

import com.flurry.sdk.AbstractC6017g2;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.flurry.sdk.c1 */
/* loaded from: classes2.dex */
public class C5979c1<T extends AbstractC6017g2> {

    /* renamed from: a */
    private final C6178z0<Object, T> f15709a = new C6178z0<>();

    /* renamed from: b */
    private final HashMap<T, Object> f15710b = new HashMap<>();

    /* renamed from: c */
    final HashMap<T, Future<?>> f15711c = new HashMap<>();

    /* renamed from: d */
    private final ThreadPoolExecutor f15712d;

    /* renamed from: com.flurry.sdk.c1$b */
    final class b extends ThreadPoolExecutor.DiscardPolicy {

        /* renamed from: com.flurry.sdk.c1$b$a */
        final class a extends AbstractRunnableC6008f2 {

            /* renamed from: h */
            final /* synthetic */ AbstractC6017g2 f15719h;

            a(AbstractC6017g2 abstractC6017g2) {
                this.f15719h = abstractC6017g2;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6008f2
            /* renamed from: a */
            public final void mo12950a() {
            }
        }

        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.ThreadPoolExecutor.DiscardPolicy, java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            super.rejectedExecution(runnable, threadPoolExecutor);
            AbstractC6017g2 m12980a = C5979c1.m12980a(runnable);
            if (m12980a == null) {
                return;
            }
            synchronized (C5979c1.this.f15711c) {
                C5979c1.this.f15711c.remove(m12980a);
            }
            C5979c1.this.m12983b(m12980a);
            new a(m12980a).run();
        }
    }

    public C5979c1(String str, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        a aVar = new a(timeUnit, blockingQueue);
        this.f15712d = aVar;
        aVar.setRejectedExecutionHandler(new b());
        aVar.setThreadFactory(new ThreadFactoryC6179z1(str));
    }

    /* renamed from: a */
    static /* synthetic */ AbstractC6017g2 m12980a(Runnable runnable) {
        if (runnable instanceof C5970b1) {
            return (AbstractC6017g2) ((C5970b1) runnable).m12966a();
        }
        if (runnable instanceof AbstractC6017g2) {
            return (AbstractC6017g2) runnable;
        }
        C5988d1.m13030c(6, "TrackedThreadPoolExecutor", "Unknown runnable class: " + runnable.getClass().getName());
        return null;
    }

    /* renamed from: d */
    private synchronized void m12981d(Object obj, T t) {
        List<T> m13381b;
        C6178z0<Object, T> c6178z0 = this.f15709a;
        if (obj != null && (m13381b = c6178z0.m13381b(obj, false)) != null) {
            m13381b.remove(t);
            if (m13381b.size() == 0) {
                c6178z0.f16533a.remove(obj);
            }
        }
        this.f15710b.remove(t);
    }

    /* renamed from: e */
    private synchronized void m12982e(Object obj, T t) {
        this.f15709a.m13382c(obj, t);
        this.f15710b.put(t, obj);
    }

    /* renamed from: b */
    final synchronized void m12983b(T t) {
        m12981d(this.f15710b.get(t), t);
    }

    /* renamed from: c */
    public final synchronized void m12984c(Object obj, T t) {
        if (obj == null) {
            return;
        }
        m12982e(obj, t);
        this.f15712d.submit(t);
    }

    /* renamed from: com.flurry.sdk.c1$a */
    final class a extends ThreadPoolExecutor {

        /* renamed from: com.flurry.sdk.c1$a$a, reason: collision with other inner class name */
        final class C11417a extends AbstractRunnableC6008f2 {

            /* renamed from: h */
            final /* synthetic */ AbstractC6017g2 f15714h;

            C11417a(AbstractC6017g2 abstractC6017g2) {
                this.f15714h = abstractC6017g2;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6008f2
            /* renamed from: a */
            public final void mo12950a() {
            }
        }

        /* renamed from: com.flurry.sdk.c1$a$b */
        final class b extends AbstractRunnableC6008f2 {

            /* renamed from: h */
            final /* synthetic */ AbstractC6017g2 f15716h;

            b(AbstractC6017g2 abstractC6017g2) {
                this.f15716h = abstractC6017g2;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6008f2
            /* renamed from: a */
            public final void mo12950a() {
            }
        }

        a(TimeUnit timeUnit, BlockingQueue blockingQueue) {
            super(0, 5, 5000L, timeUnit, blockingQueue);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.ThreadPoolExecutor
        protected final void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            AbstractC6017g2 m12980a = C5979c1.m12980a(runnable);
            if (m12980a == null) {
                return;
            }
            synchronized (C5979c1.this.f15711c) {
                C5979c1.this.f15711c.remove(m12980a);
            }
            C5979c1.this.m12983b(m12980a);
            new b(m12980a).run();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected final void beforeExecute(Thread thread, Runnable runnable) {
            super.beforeExecute(thread, runnable);
            AbstractC6017g2 m12980a = C5979c1.m12980a(runnable);
            if (m12980a == null) {
                return;
            }
            new C11417a(m12980a).run();
        }

        @Override // java.util.concurrent.AbstractExecutorService
        protected final <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
            C5970b1 c5970b1 = new C5970b1(runnable, v);
            synchronized (C5979c1.this.f15711c) {
                C5979c1.this.f15711c.put((AbstractC6017g2) runnable, c5970b1);
            }
            return c5970b1;
        }

        @Override // java.util.concurrent.AbstractExecutorService
        protected final <V> RunnableFuture<V> newTaskFor(Callable<V> callable) {
            throw new UnsupportedOperationException("Callable not supported");
        }
    }
}
