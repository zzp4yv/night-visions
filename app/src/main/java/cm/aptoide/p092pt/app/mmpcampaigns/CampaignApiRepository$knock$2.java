package cm.aptoide.p092pt.app.mmpcampaigns;

import java.io.IOException;
import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10821c;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.C10830h;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: CampaignApiRepository.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "cm.aptoide.pt.app.mmpcampaigns.CampaignApiRepository$knock$2", m39050f = "CampaignApiRepository.kt", m39051l = {33}, m39052m = "invokeSuspend")
/* loaded from: classes.dex */
final class CampaignApiRepository$knock$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10742u>, Object> {
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CampaignApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CampaignApiRepository$knock$2(CampaignApiRepository campaignApiRepository, String str, Continuation<? super CampaignApiRepository$knock$2> continuation) {
        super(2, continuation);
        this.this$0 = campaignApiRepository;
        this.$url = str;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
        return new CampaignApiRepository$knock$2(this.this$0, this.$url, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10742u> continuation) {
        return ((CampaignApiRepository$knock$2) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m39045c;
        Continuation m39044b;
        OkHttpClient okHttpClient;
        Object m39045c2;
        m39045c = C10822d.m39045c();
        int i2 = this.label;
        if (i2 == 0) {
            C10535o.m37655b(obj);
            CampaignApiRepository campaignApiRepository = this.this$0;
            String str = this.$url;
            this.L$0 = campaignApiRepository;
            this.L$1 = str;
            this.label = 1;
            m39044b = C10821c.m39044b(this);
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m39044b, 1);
            cancellableContinuationImpl.m39666z();
            okHttpClient = campaignApiRepository.client;
            okHttpClient.newCall(new Request.Builder().url(str).build()).enqueue(new Callback() { // from class: cm.aptoide.pt.app.mmpcampaigns.CampaignApiRepository$knock$2$1$1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e2) {
                    C9768m.m32346f(call, "call");
                    C9768m.m32346f(e2, "e");
                    if (cancellableContinuationImpl.mo39631b()) {
                        CancellableContinuation<C10742u> cancellableContinuation = cancellableContinuationImpl;
                        Result.a aVar = Result.f40714f;
                        cancellableContinuation.resumeWith(Result.m37650a(C10742u.f41439a));
                    }
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    C9768m.m32346f(call, "call");
                    C9768m.m32346f(response, "response");
                    if (cancellableContinuationImpl.mo39631b()) {
                        CancellableContinuation<C10742u> cancellableContinuation = cancellableContinuationImpl;
                        Result.a aVar = Result.f40714f;
                        cancellableContinuation.resumeWith(Result.m37650a(C10742u.f41439a));
                    }
                    ResponseBody body = response.body();
                    if (body != null) {
                        body.close();
                    }
                }
            });
            Object m39664w = cancellableContinuationImpl.m39664w();
            m39045c2 = C10822d.m39045c();
            if (m39664w == m39045c2) {
                C10830h.m39060c(this);
            }
            if (m39664w == m39045c) {
                return m39045c;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10535o.m37655b(obj);
        }
        return C10742u.f41439a;
    }
}
