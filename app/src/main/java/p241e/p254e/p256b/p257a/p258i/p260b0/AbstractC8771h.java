package p241e.p254e.p256b.p257a.p258i.p260b0;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6257t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6253p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6256s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6262y;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;

/* compiled from: SchedulingModule.java */
/* renamed from: e.e.b.a.i.b0.h */
/* loaded from: classes2.dex */
public abstract class AbstractC8771h {
    /* renamed from: a */
    static InterfaceC6262y m27970a(Context context, InterfaceC8792j0 interfaceC8792j0, AbstractC6257t abstractC6257t, InterfaceC8821a interfaceC8821a) {
        return Build.VERSION.SDK_INT >= 21 ? new C6256s(context, interfaceC8792j0, abstractC6257t) : new C6253p(context, interfaceC8792j0, interfaceC8821a, abstractC6257t);
    }
}
