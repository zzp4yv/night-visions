package cm.aptoide.p092pt.actions;

import p456rx.C11186e;

/* loaded from: classes.dex */
public class PermissionManager {
    public C11186e<Boolean> hasDownloadAccess(PermissionService permissionService) {
        return C11186e.m40048l(new HasDownloadAccessOnSubscribe(permissionService));
    }

    public C11186e<Void> requestDownloadAccess(PermissionService permissionService) {
        return C11186e.m40048l(new RequestDownloadAccessOnSubscribe(permissionService, false, false, -1L));
    }

    public C11186e<Void> requestDownloadAccessWithWifiBypass(PermissionService permissionService, long j2) {
        return C11186e.m40048l(new RequestDownloadAccessOnSubscribe(permissionService, false, true, j2));
    }

    public C11186e<Void> requestDownloadAllowingMobileData(PermissionService permissionService) {
        return C11186e.m40048l(new RequestDownloadAccessOnSubscribe(permissionService, true, false, -1L));
    }

    public C11186e<Void> requestExternalStoragePermission(PermissionService permissionService) {
        return C11186e.m40048l(new RequestAccessToExternalFileSystemOnSubscribe(permissionService));
    }
}
