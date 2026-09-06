package retrofit2.adapter.rxjava;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.exceptions.CompositeException;
import p456rx.exceptions.OnCompletedFailedException;
import p456rx.exceptions.OnErrorFailedException;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p471q.C11364f;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class ResultOnSubscribe<T> implements C11186e.a<Result<T>> {
    private final C11186e.a<Response<T>> upstream;

    private static class ResultSubscriber<R> extends AbstractC11197j<Response<R>> {
        private final AbstractC11197j<? super Result<R>> subscriber;

        ResultSubscriber(AbstractC11197j<? super Result<R>> abstractC11197j) {
            super(abstractC11197j);
            this.subscriber = abstractC11197j;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            this.subscriber.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            try {
                this.subscriber.onNext(Result.error(th));
                this.subscriber.onCompleted();
            } catch (Throwable th2) {
                try {
                    this.subscriber.onError(th2);
                } catch (OnCompletedFailedException e2) {
                    e = e2;
                    C11364f.m40607c().m40611b().m40566a(e);
                } catch (OnErrorFailedException e3) {
                    e = e3;
                    C11364f.m40607c().m40611b().m40566a(e);
                } catch (OnErrorNotImplementedException e4) {
                    e = e4;
                    C11364f.m40607c().m40611b().m40566a(e);
                } catch (Throwable th3) {
                    C11192a.m40140e(th3);
                    C11364f.m40607c().m40611b().m40566a(new CompositeException(th2, th3));
                }
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(Response<R> response) {
            this.subscriber.onNext(Result.response(response));
        }
    }

    ResultOnSubscribe(C11186e.a<Response<T>> aVar) {
        this.upstream = aVar;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(AbstractC11197j<? super Result<T>> abstractC11197j) {
        this.upstream.call(new ResultSubscriber(abstractC11197j));
    }
}
