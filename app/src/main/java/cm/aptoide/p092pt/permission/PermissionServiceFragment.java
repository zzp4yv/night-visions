package cm.aptoide.p092pt.permission;

import android.annotation.TargetApi;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.view.BackButtonFragment;
import p456rx.p460m.InterfaceC11204a;

/* loaded from: classes.dex */
public abstract class PermissionServiceFragment extends BackButtonFragment implements PermissionService {
    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void hasDownloadAccess(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        try {
            ((PermissionService) getActivity()).hasDownloadAccess(interfaceC11204a, interfaceC11204a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToAccounts(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToAccounts(interfaceC11204a, interfaceC11204a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToCamera(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToCamera(interfaceC11204a, interfaceC11204a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToExternalFileSystem(interfaceC11204a, interfaceC11204a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestDownloadAccess(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2, boolean z, boolean z2, long j2) {
        try {
            ((PermissionService) getActivity()).requestDownloadAccess(interfaceC11204a, interfaceC11204a2, z, z2, j2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToAccounts(boolean z, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToAccounts(z, interfaceC11204a, interfaceC11204a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToExternalFileSystem(z, interfaceC11204a, interfaceC11204a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, int i2, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        try {
            ((PermissionService) getActivity()).requestAccessToExternalFileSystem(z, i2, interfaceC11204a, interfaceC11204a2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }
}
