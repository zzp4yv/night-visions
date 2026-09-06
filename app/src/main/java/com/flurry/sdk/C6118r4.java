package com.flurry.sdk;

import android.os.Bundle;
import com.flurry.sdk.C6095p;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.r4 */
/* loaded from: classes2.dex */
public final class C6118r4 implements InterfaceC6013f7<C6095p> {
    C6118r4() {
    }

    /* renamed from: b */
    private static void m13292b(C6095p c6095p) {
        Bundle bundle;
        Bundle bundle2 = c6095p.f16209b;
        if (bundle2 == null || (bundle = bundle2.getBundle("launch_options")) == null) {
            return;
        }
        C5988d1.m13030c(3, "LifecycleObserver", "Launch Options Bundle is present " + bundle.toString());
        for (String str : bundle.keySet()) {
            if (str != null) {
                Object obj = bundle.get(str);
                String obj2 = obj != null ? obj.toString() : "null";
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj2);
                if (str.isEmpty()) {
                    C5988d1.m13030c(2, "LaunchOptionsFrame", "Launch option key is empty, do not send the frame.");
                } else if (arrayList.size() == 0) {
                    C5988d1.m13030c(2, "LaunchOptionsFrame", "Launch option values is empty, do not send the frame.");
                } else {
                    C6071m2.m13180a().m13181b(new C6151v5(new C6159w5(str, arrayList)));
                }
                C5988d1.m13030c(3, "LifecycleObserver", "Launch options Key: " + str + ". Its value: " + obj2);
            }
        }
    }

    @Override // com.flurry.sdk.InterfaceC6013f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6095p c6095p) {
        Bundle bundle;
        C6095p c6095p2 = c6095p;
        if (C6095p.a.APP_ORIENTATION_CHANGE.equals(c6095p2.f16208a) && (bundle = c6095p2.f16209b) != null && bundle.containsKey("orientation_name")) {
            int i2 = bundle.getInt("orientation_name");
            C6011f5.m13061h(i2);
            C5988d1.m13030c(5, "LifecycleObserver", c6095p2.f16208a.name() + " orientation: " + i2);
        }
        if (C6095p.a.CREATED.equals(c6095p2.f16208a)) {
            m13292b(c6095p2);
        }
    }
}
