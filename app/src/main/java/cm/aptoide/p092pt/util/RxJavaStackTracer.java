package cm.aptoide.p092pt.util;

import cm.aptoide.p092pt.utils.BaseException;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p471q.AbstractC11362d;

/* loaded from: classes.dex */
public class RxJavaStackTracer extends AbstractC11362d {

    static class OperatorTraceOnError<T> implements C11186e.b<T, T> {
        private final StackTraceElement[] trace = new Throwable().getStackTrace();

        private static class TracedException extends RuntimeException {
            public TracedException(Throwable th, StackTraceElement[] stackTraceElementArr) {
                super(th);
                setStackTrace(stackTraceElementArr);
            }
        }

        OperatorTraceOnError() {
        }

        public static <T> OperatorTraceOnError<T> traceOnError() {
            return new OperatorTraceOnError<>();
        }

        @Override // p456rx.p460m.InterfaceC11208e
        public AbstractC11197j<? super T> call(final AbstractC11197j<? super T> abstractC11197j) {
            AbstractC11197j<T> abstractC11197j2 = new AbstractC11197j<T>() { // from class: cm.aptoide.pt.util.RxJavaStackTracer.OperatorTraceOnError.1
                @Override // p456rx.InterfaceC11193f
                public void onCompleted() {
                    abstractC11197j.onCompleted();
                }

                @Override // p456rx.InterfaceC11193f
                public void onError(Throwable th) {
                    if (BaseException.class.isAssignableFrom(th.getClass())) {
                        abstractC11197j.onError(th);
                    } else {
                        abstractC11197j.onError(new TracedException(th, OperatorTraceOnError.this.trace));
                    }
                }

                @Override // p456rx.InterfaceC11193f
                public void onNext(T t) {
                    abstractC11197j.onNext(t);
                }
            };
            abstractC11197j.add(abstractC11197j2);
            return abstractC11197j2;
        }
    }

    @Override // p456rx.p471q.AbstractC11362d
    public <T> C11186e.a<T> onSubscribeStart(C11186e<? extends T> c11186e, final C11186e.a<T> aVar) {
        return new C11186e.a<T>() { // from class: cm.aptoide.pt.util.RxJavaStackTracer.1
            @Override // p456rx.p460m.InterfaceC11205b
            public void call(AbstractC11197j<? super T> abstractC11197j) {
                try {
                    AbstractC11197j<? super T> call = RxJavaStackTracer.this.onLift(OperatorTraceOnError.traceOnError()).call(abstractC11197j);
                    try {
                        call.onStart();
                        aVar.call(call);
                    } catch (Throwable th) {
                        C11192a.m40140e(th);
                        call.onError(th);
                    }
                } catch (Throwable th2) {
                    C11192a.m40140e(th2);
                    abstractC11197j.onError(th2);
                }
            }
        };
    }
}
