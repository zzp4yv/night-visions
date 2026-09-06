package com.flurry.sdk;

import android.os.SystemClock;
import com.flurry.sdk.C6102p6;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.flurry.sdk.o6 */
/* loaded from: classes2.dex */
public final class C6093o6 extends AbstractC6120r6 {

    /* renamed from: e */
    private static String f16206e = "UserPropertiesFrame";

    /* renamed from: f */
    private static final AtomicInteger f16207f = new AtomicInteger(0);

    private C6093o6(InterfaceC6136t6 interfaceC6136t6) {
        super(interfaceC6136t6);
    }

    /* renamed from: h */
    private static void m13227h(String str, String str2, C6102p6.a aVar) {
        m13228i(str, str2 == null ? Collections.emptyList() : Collections.singletonList(str2), aVar);
    }

    /* renamed from: i */
    private static void m13228i(String str, List<String> list, C6102p6.a aVar) {
        C6071m2.m13180a().m13181b(new C6093o6(new C6102p6(f16207f.incrementAndGet(), SystemClock.elapsedRealtime(), str, list, aVar)));
    }

    /* renamed from: j */
    public static void m13229j(String str, String str2) {
        if (str2 == null) {
            C5988d1.m13030c(2, f16206e, "User Property is null, do not send the frame.");
        } else {
            m13227h(str, str2, C6102p6.a.Add);
        }
    }

    @Override // com.flurry.sdk.InterfaceC6144u6
    /* renamed from: a */
    public final EnumC6128s6 mo12961a() {
        return EnumC6128s6.USER_PROPERTY;
    }
}
