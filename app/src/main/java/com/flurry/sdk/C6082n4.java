package com.flurry.sdk;

import com.flurry.sdk.C6049j7;

/* renamed from: com.flurry.sdk.n4 */
/* loaded from: classes2.dex */
public final class C6082n4 implements InterfaceC6013f7<C6049j7> {

    /* renamed from: com.flurry.sdk.n4$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16176a;

        static {
            int[] iArr = new int[C6049j7.a.m13139g().length];
            f16176a = iArr;
            try {
                iArr[C6049j7.a.f16037h - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16176a[C6049j7.a.f16036g - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16176a[C6049j7.a.f16035f - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6049j7 c6049j7) {
        int i2 = a.f16176a[c6049j7.f16034a - 1];
        if (i2 == 1) {
            C6071m2.m13180a().m13181b(new C6108q3(new C6117r3()));
        } else if (i2 == 2) {
            C6047j5.m13138h(true);
        } else {
            if (i2 != 3) {
                return;
            }
            C6047j5.m13138h(false);
        }
    }
}
