package cm.aptoide.p092pt.actions;

import android.annotation.TargetApi;
import p456rx.p460m.InterfaceC11204a;

/* loaded from: classes.dex */
public interface PermissionService {
    @TargetApi(23)
    void hasDownloadAccess(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2);

    @TargetApi(23)
    void requestAccessToAccounts(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2);

    @TargetApi(23)
    void requestAccessToAccounts(boolean z, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2);

    @TargetApi(23)
    void requestAccessToCamera(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(boolean z, int i2, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(boolean z, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2);

    @TargetApi(23)
    void requestDownloadAccess(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2, boolean z, boolean z2, long j2);
}
