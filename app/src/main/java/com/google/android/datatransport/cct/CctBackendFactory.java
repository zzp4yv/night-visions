package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.AbstractC6232h;
import com.google.android.datatransport.runtime.backends.InterfaceC6228d;
import com.google.android.datatransport.runtime.backends.InterfaceC6237m;

@Keep
/* loaded from: classes2.dex */
public class CctBackendFactory implements InterfaceC6228d {
    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6228d
    public InterfaceC6237m create(AbstractC6232h abstractC6232h) {
        return new C6207d(abstractC6232h.mo13516b(), abstractC6232h.mo13519e(), abstractC6232h.mo13518d());
    }
}
