package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* loaded from: classes2.dex */
final /* synthetic */ class C6282a implements Comparator {

    /* renamed from: f */
    static final Comparator f17071f = new C6282a();

    private C6282a() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((Scope) obj).m13912y().compareTo(((Scope) obj2).m13912y());
        return compareTo;
    }
}
