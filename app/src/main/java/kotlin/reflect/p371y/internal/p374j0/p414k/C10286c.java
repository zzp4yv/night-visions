package kotlin.reflect.p371y.internal.p374j0.p414k;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C10742u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;

/* compiled from: locks.kt */
/* renamed from: kotlin.f0.y.e.j0.k.c */
/* loaded from: classes3.dex */
public final class C10286c extends C10287d {

    /* renamed from: c */
    private final Runnable f40003c;

    /* renamed from: d */
    private final Function1<InterruptedException, C10742u> f40004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C10286c(Lock lock, Runnable runnable, Function1<? super InterruptedException, C10742u> function1) {
        super(lock);
        C9768m.m32346f(lock, "lock");
        C9768m.m32346f(runnable, "checkCancelled");
        C9768m.m32346f(function1, "interruptedExceptionHandler");
        this.f40003c = runnable;
        this.f40004d = function1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p414k.C10287d, kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10294k
    public void lock() {
        while (!m36507a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f40003c.run();
            } catch (InterruptedException e2) {
                this.f40004d.invoke(e2);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10286c(Runnable runnable, Function1<? super InterruptedException, C10742u> function1) {
        this(new ReentrantLock(), runnable, function1);
        C9768m.m32346f(runnable, "checkCancelled");
        C9768m.m32346f(function1, "interruptedExceptionHandler");
    }
}
