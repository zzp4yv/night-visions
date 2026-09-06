package retrofit2.adapter.rxjava;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes3.dex */
final class CallExecuteOnSubscribe<T> implements C11186e.a<Response<T>> {
    private final Call<T> originalCall;

    CallExecuteOnSubscribe(Call<T> call) {
        this.originalCall = call;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(AbstractC11197j<? super Response<T>> abstractC11197j) {
        Call<T> clone = this.originalCall.clone();
        CallArbiter callArbiter = new CallArbiter(clone, abstractC11197j);
        abstractC11197j.add(callArbiter);
        abstractC11197j.setProducer(callArbiter);
        try {
            callArbiter.emitResponse(clone.execute());
        } catch (Throwable th) {
            C11192a.m40140e(th);
            callArbiter.emitError(th);
        }
    }
}
