package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m32267d2 = {"runBlocking", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m32268k = 5, m32269mv = {1, 6, 0}, m32271xi = 48, m32272xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: kotlinx.coroutines.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10932i {
    /* renamed from: a */
    public static final <T> T m39423a(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        EventLoop m39696a;
        CoroutineContext m39417e;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.f41528b);
        if (continuationInterceptor == null) {
            m39696a = ThreadLocalEventLoop.f41888a.m39697b();
            m39417e = C10929h0.m39417e(GlobalScope.f41877f, coroutineContext.plus(m39696a));
        } else {
            EventLoop eventLoop = continuationInterceptor instanceof EventLoop ? (EventLoop) continuationInterceptor : null;
            if (eventLoop != null) {
                EventLoop eventLoop2 = eventLoop.m39438q0() ? eventLoop : null;
                if (eventLoop2 != null) {
                    m39696a = eventLoop2;
                    m39417e = C10929h0.m39417e(GlobalScope.f41877f, coroutineContext);
                }
            }
            m39696a = ThreadLocalEventLoop.f41888a.m39696a();
            m39417e = C10929h0.m39417e(GlobalScope.f41877f, coroutineContext);
        }
        BlockingCoroutine blockingCoroutine = new BlockingCoroutine(m39417e, currentThread, m39696a);
        blockingCoroutine.m39080F0(CoroutineStart.DEFAULT, blockingCoroutine, function2);
        return (T) blockingCoroutine.m39309G0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m39424b(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) throws InterruptedException {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f41531f;
        }
        return C10928h.m39410c(coroutineContext, function2);
    }
}
