package cm.aptoide.p092pt.permission;

import android.R;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Bundle;
import androidx.core.app.C0237a;
import androidx.core.content.C0255a;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.utils.SimpleSubscriber;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import com.facebook.C5608a0;
import okhttp3.HttpUrl;
import p456rx.p460m.InterfaceC11204a;

@Deprecated
/* loaded from: classes.dex */
public abstract class PermissionServiceActivity extends ActivityResultNavigator implements PermissionService {
    private static final int ACCESS_TO_ACCOUNTS_REQUEST_ID = 62;
    private static final int ACCESS_TO_EXTERNAL_FS_REQUEST_ID = 61;
    private static final int PERMISSIONS_REQUEST_ACCESS_CAMERA = 101;
    private static final String TAG = PermissionServiceActivity.class.getName();
    private ConnectivityManager connectivityManager;
    private SharedPreferences sharedPreferences;
    private InterfaceC11204a toRunWhenAccessToAccountsIsDenied;
    private InterfaceC11204a toRunWhenAccessToAccountsIsGranted;
    private InterfaceC11204a toRunWhenAccessToFileSystemIsDenied;
    private InterfaceC11204a toRunWhenAccessToFileSystemIsGranted;

    private void showBypassWifiMessage(long j2, SimpleSubscriber<GenericDialogs.EResponse> simpleSubscriber) {
        GenericDialogs.createGenericOkCancelMessageWithColorButton(this, HttpUrl.FRAGMENT_ENCODE_SET, getString(C1138R.string.general_downloads_dialog_only_wifi_message), getString(C1138R.string.general_downloads_dialog_only_wifi_install_button, new Object[]{AptoideUtils.StringU.formatBytes(j2, false)}), getString(C1138R.string.cancel)).m40058E0(simpleSubscriber);
    }

    private void showMessageOKCancel(int i2, SimpleSubscriber<GenericDialogs.EResponse> simpleSubscriber) {
        showMessageOKCancel(getString(i2), simpleSubscriber);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void hasDownloadAccess(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        if (C0255a.m1672a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0 || (AptoideUtils.SystemU.getConnectionType(this.connectivityManager).equals("mobile") && !ManagerPreferences.getDownloadsWifiOnly(this.sharedPreferences))) {
            if (interfaceC11204a2 != null) {
                interfaceC11204a2.call();
            }
        } else if (interfaceC11204a != null) {
            interfaceC11204a.call();
        }
    }

    @Override // cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8731a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        this.sharedPreferences = ((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences();
        if (C5608a0.m11304w()) {
            return;
        }
        C5608a0.m11273M(getApplicationContext());
    }

    @Override // androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, android.app.Activity
    @TargetApi(23)
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
        if (i2 == 61) {
            if (iArr[0] != 0) {
                InterfaceC11204a interfaceC11204a = this.toRunWhenAccessToFileSystemIsDenied;
                if (interfaceC11204a != null) {
                    interfaceC11204a.call();
                }
                ShowMessage.asSnack(findViewById(R.id.content), "access to read and write to external storage was denied");
                return;
            }
            Logger.getInstance().m8283v(TAG, "access to read and write to external storage was granted");
            InterfaceC11204a interfaceC11204a2 = this.toRunWhenAccessToFileSystemIsGranted;
            if (interfaceC11204a2 != null) {
                interfaceC11204a2.call();
                return;
            }
            return;
        }
        if (i2 != 62) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
            return;
        }
        if (iArr[0] != 0) {
            InterfaceC11204a interfaceC11204a3 = this.toRunWhenAccessToAccountsIsDenied;
            if (interfaceC11204a3 != null) {
                interfaceC11204a3.call();
            }
            ShowMessage.asSnack(findViewById(R.id.content), "access to get accounts was denied");
            return;
        }
        Logger.getInstance().m8283v(TAG, "access to get accounts was granted");
        InterfaceC11204a interfaceC11204a4 = this.toRunWhenAccessToAccountsIsGranted;
        if (interfaceC11204a4 != null) {
            interfaceC11204a4.call();
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToAccounts(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        requestAccessToAccounts(true, interfaceC11204a, interfaceC11204a2);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    public void requestAccessToCamera(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        if (C0255a.m1672a(this, "android.permission.CAMERA") == 0) {
            Logger.getInstance().m8283v(TAG, "already has permission to access camera");
            if (interfaceC11204a != null) {
                interfaceC11204a.call();
                return;
            }
            return;
        }
        this.toRunWhenAccessToFileSystemIsGranted = interfaceC11204a;
        this.toRunWhenAccessToFileSystemIsDenied = interfaceC11204a2;
        if (C0237a.m1528t(this, "android.permission.CAMERA")) {
            Logger.getInstance().m8283v(TAG, "showing rationale and requesting permission to access camera");
            showMessageOKCancel(C1138R.string.camera_access_permission_request_message, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.4
                @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11193f
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext((C37374) eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        C0237a.m1525q(PermissionServiceActivity.this, new String[]{"android.permission.CAMERA"}, 101);
                    } else if (PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied != null) {
                        PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied.call();
                    }
                }
            });
        } else {
            C0237a.m1525q(this, new String[]{"android.permission.CAMERA"}, 101);
            Logger.getInstance().m8283v(TAG, "requesting permission to access camera");
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        requestAccessToExternalFileSystem(true, interfaceC11204a, interfaceC11204a2);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    public void requestDownloadAccess(final InterfaceC11204a interfaceC11204a, final InterfaceC11204a interfaceC11204a2, boolean z, boolean z2, long j2) {
        if (z || !AptoideUtils.SystemU.getConnectionType(this.connectivityManager).equals("mobile") || ManagerPreferences.getDownloadsWifiOnly(this.sharedPreferences)) {
            if (interfaceC11204a != null) {
                interfaceC11204a.call();
            }
        } else if (z2) {
            showBypassWifiMessage(j2, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.2
                @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11193f
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext((C37352) eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        InterfaceC11204a interfaceC11204a3 = interfaceC11204a;
                        if (interfaceC11204a3 != null) {
                            interfaceC11204a3.call();
                            return;
                        }
                        return;
                    }
                    InterfaceC11204a interfaceC11204a4 = interfaceC11204a2;
                    if (interfaceC11204a4 != null) {
                        interfaceC11204a4.call();
                    }
                }
            });
        } else {
            showMessageOKCancel(C1138R.string.general_downloads_dialog_only_wifi_message, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.3
                @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11193f
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext((C37363) eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        PermissionServiceActivity.this.getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newSettingsFragment(), true);
                        return;
                    }
                    InterfaceC11204a interfaceC11204a3 = interfaceC11204a2;
                    if (interfaceC11204a3 != null) {
                        interfaceC11204a3.call();
                    }
                }
            });
        }
    }

    private void showMessageOKCancel(String str, SimpleSubscriber<GenericDialogs.EResponse> simpleSubscriber) {
        GenericDialogs.createGenericOkCancelMessage(this, HttpUrl.FRAGMENT_ENCODE_SET, str, this.themeManager.getAttributeForTheme(C1138R.attr.dialogsTheme).resourceId).m40058E0(simpleSubscriber);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToAccounts(boolean z, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        if (C0255a.m1672a(this, "android.permission.GET_ACCOUNTS") == 0) {
            Logger.getInstance().m8283v(TAG, "already has permission to access accounts");
            if (interfaceC11204a != null) {
                interfaceC11204a.call();
                return;
            }
            return;
        }
        this.toRunWhenAccessToAccountsIsGranted = interfaceC11204a;
        this.toRunWhenAccessToAccountsIsDenied = interfaceC11204a2;
        if (z || C0237a.m1528t(this, "android.permission.GET_ACCOUNTS")) {
            Logger.getInstance().m8283v(TAG, "showing rationale and requesting permission to access accounts");
            showMessageOKCancel(C1138R.string.access_to_get_accounts_rationale, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.1
                @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11193f
                public void onNext(GenericDialogs.EResponse eResponse) {
                    super.onNext((C37341) eResponse);
                    if (eResponse == GenericDialogs.EResponse.YES) {
                        C0237a.m1525q(PermissionServiceActivity.this, new String[]{"android.permission.GET_ACCOUNTS"}, 62);
                    } else if (PermissionServiceActivity.this.toRunWhenAccessToAccountsIsDenied != null) {
                        PermissionServiceActivity.this.toRunWhenAccessToAccountsIsDenied.call();
                    }
                }
            });
        } else {
            C0237a.m1525q(this, new String[]{"android.permission.GET_ACCOUNTS"}, 62);
            Logger.getInstance().m8283v(TAG, "requesting permission to access accounts");
        }
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        requestAccessToExternalFileSystem(z, C1138R.string.storage_access_permission_request_message, interfaceC11204a, interfaceC11204a2);
    }

    @Override // cm.aptoide.p092pt.actions.PermissionService
    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, int i2, InterfaceC11204a interfaceC11204a, InterfaceC11204a interfaceC11204a2) {
        if (C0255a.m1672a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.toRunWhenAccessToFileSystemIsGranted = interfaceC11204a;
            this.toRunWhenAccessToFileSystemIsDenied = interfaceC11204a2;
            if (!z && !C0237a.m1528t(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C0237a.m1525q(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 61);
                Logger.getInstance().m8283v(TAG, "requesting permission to access external storage");
                return;
            } else {
                Logger.getInstance().m8283v(TAG, "showing rationale and requesting permission to access external storage");
                showMessageOKCancel(i2, new SimpleSubscriber<GenericDialogs.EResponse>() { // from class: cm.aptoide.pt.permission.PermissionServiceActivity.5
                    @Override // cm.aptoide.p092pt.utils.SimpleSubscriber, p456rx.InterfaceC11193f
                    public void onNext(GenericDialogs.EResponse eResponse) {
                        super.onNext((C37385) eResponse);
                        if (eResponse == GenericDialogs.EResponse.YES) {
                            C0237a.m1525q(PermissionServiceActivity.this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 61);
                        } else if (PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied != null) {
                            PermissionServiceActivity.this.toRunWhenAccessToFileSystemIsDenied.call();
                        }
                    }
                });
                return;
            }
        }
        Logger.getInstance().m8283v(TAG, "already has permission to access external storage");
        if (interfaceC11204a != null) {
            interfaceC11204a.call();
        }
    }
}
