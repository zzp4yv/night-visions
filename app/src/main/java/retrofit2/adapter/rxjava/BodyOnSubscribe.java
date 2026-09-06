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
final class BodyOnSubscribe<T> implements C11186e.a<T> {
    private final C11186e.a<Response<T>> upstream;

    private static class BodySubscriber<R> extends AbstractC11197j<Response<R>> {
        private final AbstractC11197j<? super R> subscriber;
        private boolean subscriberTerminated;

        BodySubscriber(AbstractC11197j<? super R> abstractC11197j) {
            super(abstractC11197j);
            this.subscriber = abstractC11197j;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.subscriberTerminated) {
                return;
            }
            this.subscriber.onCompleted();
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (!this.subscriberTerminated) {
                this.subscriber.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a Retrofit bug with the full stacktrace.");
            assertionError.initCause(th);
            C11364f.m40607c().m40611b().m40566a(assertionError);
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.subscriber.onNext(response.body());
                return;
            }
            this.subscriberTerminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.subscriber.onError(httpException);
            } catch (OnCompletedFailedException e2) {
                e = e2;
                C11364f.m40607c().m40611b().m40566a(e);
            } catch (OnErrorFailedException e3) {
                e = e3;
                C11364f.m40607c().m40611b().m40566a(e);
            } catch (OnErrorNotImplementedException e4) {
                e = e4;
                C11364f.m40607c().m40611b().m40566a(e);
            } catch (Throwable th) {
                C11192a.m40140e(th);
                C11364f.m40607c().m40611b().m40566a(new CompositeException(httpException, th));
            }
        }
    }

    BodyOnSubscribe(C11186e.a<Response<T>> aVar) {
        this.upstream = aVar;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(AbstractC11197j<? super T> abstractC11197j) {
        this.upstream.call(new BodySubscriber(abstractC11197j));
    }
}
