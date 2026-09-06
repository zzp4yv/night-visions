package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.AbstractServiceConnectionC5655l0;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.C9768m;

/* compiled from: GetTokenClient.kt */
/* renamed from: com.facebook.login.s */
/* loaded from: classes2.dex */
public final class C5766s extends AbstractServiceConnectionC5655l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5766s(Context context, LoginClient.Request request) {
        super(context, 65536, 65537, 20121101, request.m11954a(), request.m11966m());
        C9768m.m32346f(context, "context");
        C9768m.m32346f(request, "request");
    }

    @Override // com.facebook.internal.AbstractServiceConnectionC5655l0
    /* renamed from: e */
    protected void mo11504e(Bundle bundle) {
        C9768m.m32346f(bundle, "data");
    }
}
