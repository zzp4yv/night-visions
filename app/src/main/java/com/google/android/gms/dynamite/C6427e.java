package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.dynamite.e */
/* loaded from: classes2.dex */
final class C6427e implements DynamiteModule.VersionPolicy {
    C6427e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.SelectionResult mo14724a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int mo14725a = iVersions.mo14725a(context, str, true);
        selectionResult.f18057b = mo14725a;
        if (mo14725a != 0) {
            selectionResult.f18058c = 1;
        } else {
            int mo14726b = iVersions.mo14726b(context, str);
            selectionResult.f18056a = mo14726b;
            if (mo14726b != 0) {
                selectionResult.f18058c = -1;
            }
        }
        return selectionResult;
    }
}
