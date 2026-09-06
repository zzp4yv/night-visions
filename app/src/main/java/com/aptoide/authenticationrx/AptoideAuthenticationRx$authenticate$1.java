package com.aptoide.authenticationrx;

import com.aptoide.authentication.AptoideAuthentication;
import com.aptoide.authentication.model.OAuth2;
import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AptoideAuthenticationRx.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", "Lcom/aptoide/authentication/model/OAuth2;", "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "com.aptoide.authenticationrx.AptoideAuthenticationRx$authenticate$1", m39050f = "AptoideAuthenticationRx.kt", m39051l = {15}, m39052m = "invokeSuspend")
/* loaded from: classes.dex */
final class AptoideAuthenticationRx$authenticate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OAuth2>, Object> {
    final /* synthetic */ String $agent;
    final /* synthetic */ String $magicCode;
    final /* synthetic */ String $state;
    int label;
    final /* synthetic */ AptoideAuthenticationRx this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AptoideAuthenticationRx$authenticate$1(AptoideAuthenticationRx aptoideAuthenticationRx, String str, String str2, String str3, Continuation<? super AptoideAuthenticationRx$authenticate$1> continuation) {
        super(2, continuation);
        this.this$0 = aptoideAuthenticationRx;
        this.$magicCode = str;
        this.$state = str2;
        this.$agent = str3;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
        return new AptoideAuthenticationRx$authenticate$1(this.this$0, this.$magicCode, this.$state, this.$agent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OAuth2> continuation) {
        return ((AptoideAuthenticationRx$authenticate$1) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m39045c;
        AptoideAuthentication aptoideAuthentication;
        m39045c = C10822d.m39045c();
        int i2 = this.label;
        if (i2 == 0) {
            C10535o.m37655b(obj);
            aptoideAuthentication = this.this$0.aptoideAuthentication;
            String str = this.$magicCode;
            String str2 = this.$state;
            String str3 = this.$agent;
            this.label = 1;
            obj = aptoideAuthentication.authenticate(str, str2, str3, this);
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
