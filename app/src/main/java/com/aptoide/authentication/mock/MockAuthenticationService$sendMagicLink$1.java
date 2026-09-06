package com.aptoide.authentication.mock;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;

/* compiled from: MockAuthenticationService.kt */
@Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "com.aptoide.authentication.mock.MockAuthenticationService", m39050f = "MockAuthenticationService.kt", m39051l = {11}, m39052m = "sendMagicLink")
/* loaded from: classes.dex */
final class MockAuthenticationService$sendMagicLink$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MockAuthenticationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockAuthenticationService$sendMagicLink$1(MockAuthenticationService mockAuthenticationService, Continuation<? super MockAuthenticationService$sendMagicLink$1> continuation) {
        super(continuation);
        this.this$0 = mockAuthenticationService;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendMagicLink(null, this);
    }
}
