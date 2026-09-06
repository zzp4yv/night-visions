package com.aptoide.aptoide_ab_testing.network;

import com.aptoide.aptoide_ab_testing.FlagrException;
import com.aptoide.aptoide_ab_testing.model.Flag;
import com.aptoide.aptoide_ab_testing.network.FlagrApiService;
import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: FlagrApiService.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcom/aptoide/aptoide_ab_testing/model/Flag;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "com.aptoide.aptoide_ab_testing.network.FlagrApiService$getFlag$2", m39050f = "FlagrApiService.kt", m39051l = {33}, m39052m = "invokeSuspend")
/* loaded from: classes.dex */
final class FlagrApiService$getFlag$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Flag>, Object> {
    final /* synthetic */ String $flagID;
    int label;
    final /* synthetic */ FlagrApiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlagrApiService$getFlag$2(FlagrApiService flagrApiService, String str, Continuation<? super FlagrApiService$getFlag$2> continuation) {
        super(2, continuation);
        this.this$0 = flagrApiService;
        this.$flagID = str;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
        return new FlagrApiService$getFlag$2(this.this$0, this.$flagID, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Flag> continuation) {
        return ((FlagrApiService$getFlag$2) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m39045c;
        FlagrApiService.Flagr flagr;
        m39045c = C10822d.m39045c();
        int i2 = this.label;
        if (i2 == 0) {
            C10535o.m37655b(obj);
            flagr = this.this$0.flagr;
            String str = this.$flagID;
            this.label = 1;
            obj = flagr.getFlag(str, this);
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
        Flag flag = (Flag) response.body();
        if (response.isSuccessful() && flag != null) {
            return flag;
        }
        String message = response.message();
        C9768m.m32345e(message, "getFlagResponse.message()");
        throw new FlagrException(message, response.code());
    }
}
