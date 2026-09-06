package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.dynamite.k */
/* loaded from: classes2.dex */
final class C6433k implements DynamiteModule.VersionPolicy {
    C6433k() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo14724a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int mo14725a;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int mo14726b = iVersions.mo14726b(context, str);
        selectionResult.f18056a = mo14726b;
        int i2 = 0;
        if (mo14726b != 0) {
            mo14725a = iVersions.mo14725a(context, str, false);
            selectionResult.f18057b = mo14725a;
        } else {
            mo14725a = iVersions.mo14725a(context, str, true);
            selectionResult.f18057b = mo14725a;
        }
        int i3 = selectionResult.f18056a;
        if (i3 != 0) {
            i2 = i3;
        } else if (mo14725a == 0) {
            selectionResult.f18058c = 0;
            return selectionResult;
        }
        if (mo14725a >= i2) {
            selectionResult.f18058c = 1;
        } else {
            selectionResult.f18058c = -1;
        }
        return selectionResult;
    }
}
