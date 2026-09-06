package com.aptoide.authentication.network;

import com.aptoide.authentication.AuthenticationException;
import com.aptoide.authentication.model.CodeAuth;
import com.aptoide.authentication.network.RemoteAuthenticationService;
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

/* compiled from: RemoteAuthenticationService.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcom/aptoide/authentication/model/CodeAuth;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "com.aptoide.authentication.network.RemoteAuthenticationService$sendMagicLink$2", m39050f = "RemoteAuthenticationService.kt", m39051l = {37}, m39052m = "invokeSuspend")
/* loaded from: classes.dex */
final class RemoteAuthenticationService$sendMagicLink$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CodeAuth>, Object> {
    final /* synthetic */ String $email;
    int label;
    final /* synthetic */ RemoteAuthenticationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteAuthenticationService$sendMagicLink$2(RemoteAuthenticationService remoteAuthenticationService, String str, Continuation<? super RemoteAuthenticationService$sendMagicLink$2> continuation) {
        super(2, continuation);
        this.this$0 = remoteAuthenticationService;
        this.$email = str;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
        return new RemoteAuthenticationService$sendMagicLink$2(this.this$0, this.$email, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CodeAuth> continuation) {
        return ((RemoteAuthenticationService$sendMagicLink$2) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m39045c;
        RemoteAuthenticationService.AuthorizationV7 authorizationV7;
        m39045c = C10822d.m39045c();
        int i2 = this.label;
        if (i2 == 0) {
            C10535o.m37655b(obj);
            authorizationV7 = this.this$0.authorizationV7;
            RemoteAuthenticationService.Credentials credentials = new RemoteAuthenticationService.Credentials(this.$email, new String[]{"CODE:TOKEN:EMAIL"});
            this.label = 1;
            obj = authorizationV7.sendMagicLink(Type.EMAIL, new String[]{"TOS", "PRIVACY", "DISTRIBUTION"}, credentials, this);
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
        CodeAuth codeAuth = (CodeAuth) response.body();
        if (response.isSuccessful() && codeAuth != null) {
            codeAuth.setEmail(this.$email);
            return codeAuth;
        }
        String message = response.message();
        C9768m.m32345e(message, "sendMagicLinkResponse.message()");
        throw new AuthenticationException(message, response.code());
    }
}
