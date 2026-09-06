package cm.aptoide.p092pt;

import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.bonus.BonusAppcService;
import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppCoinsManager.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "cm.aptoide.pt.AppCoinsManager$getBonusAppc$1", m39050f = "AppCoinsManager.kt", m39051l = {13}, m39052m = "invokeSuspend")
/* loaded from: classes.dex */
final class AppCoinsManager$getBonusAppc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BonusAppcModel>, Object> {
    int label;
    final /* synthetic */ AppCoinsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppCoinsManager$getBonusAppc$1(AppCoinsManager appCoinsManager, Continuation<? super AppCoinsManager$getBonusAppc$1> continuation) {
        super(2, continuation);
        this.this$0 = appCoinsManager;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
        return new AppCoinsManager$getBonusAppc$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BonusAppcModel> continuation) {
        return ((AppCoinsManager$getBonusAppc$1) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m39045c;
        BonusAppcService bonusAppcService;
        m39045c = C10822d.m39045c();
        int i2 = this.label;
        if (i2 == 0) {
            C10535o.m37655b(obj);
            bonusAppcService = this.this$0.bonusAppcService;
            this.label = 1;
            obj = bonusAppcService.getBonusAppc(this);
            if (obj == m39045c) {
                return m39045c;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10535o.m37655b(obj);
        }
        return obj;
    }
}
