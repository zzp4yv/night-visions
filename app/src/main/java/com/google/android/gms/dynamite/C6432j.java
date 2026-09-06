package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.dynamite.j */
/* loaded from: classes2.dex */
final class C6432j implements DynamiteModule.VersionPolicy {
    C6432j() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo14724a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.f18056a = iVersions.mo14726b(context, str);
        int mo14725a = iVersions.mo14725a(context, str, true);
        selectionResult.f18057b = mo14725a;
        int i2 = selectionResult.f18056a;
        if (i2 == 0) {
            if (mo14725a == 0) {
                selectionResult.f18058c = 0;
                return selectionResult;
            }
            i2 = 0;
        }
        if (mo14725a >= i2) {
            selectionResult.f18058c = 1;
        } else {
            selectionResult.f18058c = -1;
        }
        return selectionResult;
    }
}
