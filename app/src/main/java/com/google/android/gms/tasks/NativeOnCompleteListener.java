package com.google.android.gms.tasks;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
@KeepForSdk
/* loaded from: classes2.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {

    /* renamed from: a */
    private final long f29513a;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    /* renamed from: a */
    public void mo7019a(Task<Object> task) {
        Object obj;
        String str;
        Exception mo23646i;
        if (task.mo23651n()) {
            obj = task.mo23647j();
            str = null;
        } else if (task.mo23649l() || (mo23646i = task.mo23646i()) == null) {
            obj = null;
            str = null;
        } else {
            str = mo23646i.getMessage();
            obj = null;
        }
        nativeOnComplete(this.f29513a, obj, task.mo23651n(), task.mo23649l(), str);
    }

    @KeepForSdk
    public native void nativeOnComplete(long j2, Object obj, boolean z, boolean z2, String str);
}
