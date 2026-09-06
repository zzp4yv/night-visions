package cm.aptoide.p092pt.aab;

import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DynamicSplitsManager.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "cm.aptoide.pt.aab.DynamicSplitsManager$getAppSplitsByMd5$1", m39050f = "DynamicSplitsManager.kt", m39051l = {9}, m39052m = "invokeSuspend")
/* loaded from: classes.dex */
final class DynamicSplitsManager$getAppSplitsByMd5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DynamicSplitsModel>, Object> {
    final /* synthetic */ String $apkMd5Sum;
    int label;
    final /* synthetic */ DynamicSplitsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicSplitsManager$getAppSplitsByMd5$1(DynamicSplitsManager dynamicSplitsManager, String str, Continuation<? super DynamicSplitsManager$getAppSplitsByMd5$1> continuation) {
        super(2, continuation);
        this.this$0 = dynamicSplitsManager;
        this.$apkMd5Sum = str;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
        return new DynamicSplitsManager$getAppSplitsByMd5$1(this.this$0, this.$apkMd5Sum, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DynamicSplitsModel> continuation) {
        return ((DynamicSplitsManager$getAppSplitsByMd5$1) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m39045c;
        DynamicSplitsService dynamicSplitsService;
        m39045c = C10822d.m39045c();
        int i2 = this.label;
        if (i2 == 0) {
            C10535o.m37655b(obj);
            dynamicSplitsService = this.this$0.dynamicSplitsService;
            String str = this.$apkMd5Sum;
            this.label = 1;
            obj = dynamicSplitsService.getDynamicSplitsByMd5(str, this);
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
