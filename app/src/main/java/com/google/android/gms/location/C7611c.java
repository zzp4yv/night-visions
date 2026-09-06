package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.c */
/* loaded from: classes2.dex */
final class C7611c implements Comparator<ActivityTransition> {
    C7611c() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ActivityTransition activityTransition, ActivityTransition activityTransition2) {
        ActivityTransition activityTransition3 = activityTransition;
        ActivityTransition activityTransition4 = activityTransition2;
        int m22634y = activityTransition3.m22634y();
        int m22634y2 = activityTransition4.m22634y();
        if (m22634y != m22634y2) {
            return m22634y < m22634y2 ? -1 : 1;
        }
        int m22635z = activityTransition3.m22635z();
        int m22635z2 = activityTransition4.m22635z();
        if (m22635z == m22635z2) {
            return 0;
        }
        return m22635z < m22635z2 ? -1 : 1;
    }
}
