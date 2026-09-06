package cm.aptoide.p092pt.bonus;

import cm.aptoide.p092pt.bonus.BonusAppcRemoteService;
import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: BonusAppcRemoteService.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "cm.aptoide.pt.bonus.BonusAppcRemoteService$getBonusAppc$2", m39050f = "BonusAppcRemoteService.kt", m39051l = {14}, m39052m = "invokeSuspend")
/* loaded from: classes.dex */
final class BonusAppcRemoteService$getBonusAppc$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BonusAppcModel>, Object> {
    int label;
    final /* synthetic */ BonusAppcRemoteService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BonusAppcRemoteService$getBonusAppc$2(BonusAppcRemoteService bonusAppcRemoteService, Continuation<? super BonusAppcRemoteService$getBonusAppc$2> continuation) {
        super(2, continuation);
        this.this$0 = bonusAppcRemoteService;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
        return new BonusAppcRemoteService$getBonusAppc$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BonusAppcModel> continuation) {
        return ((BonusAppcRemoteService$getBonusAppc$2) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m39045c;
        BonusAppcRemoteService.ServiceApi serviceApi;
        BonusAppcModel mapErrorResponse;
        BonusAppcModel mapResponse;
        m39045c = C10822d.m39045c();
        int i2 = this.label;
        if (i2 == 0) {
            C10535o.m37655b(obj);
            serviceApi = this.this$0.serviceApi;
            this.label = 1;
            obj = serviceApi.getAppcBonus(this);
            if (obj == m39045c) {
                return m39045c;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10535o.m37655b(obj);
        }
        Response response = (Response) obj;
        BonusAppcResponse bonusAppcResponse = (BonusAppcResponse) response.body();
        if (!response.isSuccessful() || bonusAppcResponse == null) {
            mapErrorResponse = this.this$0.mapErrorResponse();
            return mapErrorResponse;
        }
        mapResponse = this.this$0.mapResponse(bonusAppcResponse);
        return mapResponse;
    }
}
