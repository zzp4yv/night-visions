package kotlinx.coroutines;

import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.C9788b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.p442j.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.internal.C10943d0;
import kotlinx.coroutines.internal.C10953i0;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;
import okhttp3.HttpUrl;

/* compiled from: DispatchedTask.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001b\u001a\u00020\fJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001dR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m32267d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", HttpUrl.FRAGMENT_ENCODE_SET, "takenState", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.b1, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class DispatchedTask<T> extends Task {

    /* renamed from: h */
    public int f41578h;

    public DispatchedTask(int i2) {
        this.f41578h = i2;
    }

    /* renamed from: a */
    public void mo39114a(Object obj, Throwable th) {
    }

    /* renamed from: c */
    public abstract Continuation<T> mo39115c();

    /* renamed from: d */
    public Throwable mo39116d(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.f41577b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public <T> T mo39117f(Object obj) {
        return obj;
    }

    /* renamed from: i */
    public final void m39118i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C9788b.m32367a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C9768m.m32343c(th);
        C10984l0.m39620a(mo39115c().getF41861l(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: j */
    public abstract Object mo39119j();

    @Override // java.lang.Runnable
    public final void run() {
        Object m37650a;
        Object m37650a2;
        if (C11012s0.m39681a()) {
            if (!(this.f41578h != -1)) {
                throw new AssertionError();
            }
        }
        TaskContext taskContext = this.f41628g;
        try {
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) mo39115c();
            Continuation<T> continuation = dispatchedContinuation.f41779k;
            Object obj = dispatchedContinuation.f41781m;
            CoroutineContext f41861l = continuation.getF41861l();
            Object m39492c = C10953i0.m39492c(f41861l, obj);
            UndispatchedCoroutine<?> m39419g = m39492c != C10953i0.f41784a ? C10929h0.m39419g(continuation, f41861l, m39492c) : null;
            try {
                CoroutineContext f41861l2 = continuation.getF41861l();
                Object mo39119j = mo39119j();
                Throwable mo39116d = mo39116d(mo39119j);
                Job job = (mo39116d == null && C10862c1.m39140b(this.f41578h)) ? (Job) f41861l2.get(Job.f41899e) : null;
                if (job != null && !job.mo39083b()) {
                    Throwable mo39357j = job.mo39357j();
                    mo39114a(mo39119j, mo39357j);
                    Result.a aVar = Result.f40714f;
                    if (C11012s0.m39684d() && (continuation instanceof CoroutineStackFrame)) {
                        mo39357j = C10943d0.m39462j(mo39357j, (CoroutineStackFrame) continuation);
                    }
                    continuation.resumeWith(Result.m37650a(C10535o.m37654a(mo39357j)));
                } else if (mo39116d != null) {
                    Result.a aVar2 = Result.f40714f;
                    continuation.resumeWith(Result.m37650a(C10535o.m37654a(mo39116d)));
                } else {
                    Result.a aVar3 = Result.f40714f;
                    continuation.resumeWith(Result.m37650a(mo39117f(mo39119j)));
                }
                C10742u c10742u = C10742u.f41439a;
                try {
                    Result.a aVar4 = Result.f40714f;
                    taskContext.mo39188a();
                    m37650a2 = Result.m37650a(c10742u);
                } catch (Throwable th) {
                    Result.a aVar5 = Result.f40714f;
                    m37650a2 = Result.m37650a(C10535o.m37654a(th));
                }
                m39118i(null, Result.m37651b(m37650a2));
            } finally {
                if (m39419g == null || m39419g.m39705H0()) {
                    C10953i0.m39490a(f41861l, m39492c);
                }
            }
        } catch (Throwable th2) {
            try {
                Result.a aVar6 = Result.f40714f;
                taskContext.mo39188a();
                m37650a = Result.m37650a(C10742u.f41439a);
            } catch (Throwable th3) {
                Result.a aVar7 = Result.f40714f;
                m37650a = Result.m37650a(C10535o.m37654a(th3));
            }
            m39118i(th2, Result.m37651b(m37650a));
        }
    }
}
