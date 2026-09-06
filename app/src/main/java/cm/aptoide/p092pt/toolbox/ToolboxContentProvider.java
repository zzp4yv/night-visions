package cm.aptoide.p092pt.toolbox;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.account.AndroidAccountManagerPersistence;
import cm.aptoide.p092pt.account.FacebookSignUpAdapter;
import cm.aptoide.p092pt.account.GoogleSignUpAdapter;
import cm.aptoide.p092pt.networking.Authentication;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Named;

/* loaded from: classes.dex */
public class ToolboxContentProvider extends ContentProvider {
    private static final String BACKUP_PACKAGE = "pt.aptoide.backupapps";
    private static final int CHANGE_PREFERENCE = 6;
    private static final int LOGIN_AVATAR = 9;
    private static final int LOGIN_NAME = 5;
    private static final int LOGIN_NICKNAME = 8;
    private static final int LOGIN_TYPE = 4;
    private static final int PASSHASH = 3;
    private static final int REFRESH_TOKEN = 7;
    private static final int REPO = 2;
    private static final int TOKEN = 1;
    private static final String UPLOADER_PACKAGE = "pt.caixamagica.aptoide.uploader";

    @Inject
    AptoideAccountManager accountManager;

    @Inject
    AuthenticationPersistence authenticationPersistence;
    private ToolboxSecurityManager securityManager;

    @Inject
    @Named
    SharedPreferences sharedPreferences;
    private UriMatcher uriMatcher;

    private MatrixCursor create(String str, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{str}, 1);
        matrixCursor.addRow(new String[]{str2});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.securityManager = new ToolboxSecurityManager(getContext().getPackageManager());
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.uriMatcher = uriMatcher;
        uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "token", 1);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "refreshToken", 7);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "repo", 2);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "loginType", 4);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "passHash", 3);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "loginName", 5);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "changePreference", 6);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "loginNickname", 8);
        this.uriMatcher.addURI(BuildConfig.CONTENT_AUTHORITY, "loginAvatar", 9);
        ((AptoideApplication) getContext().getApplicationContext()).getApplicationComponent().inject(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!this.securityManager.checkSignature(Binder.getCallingUid(), BuildConfig.SIGNATURE_BACKUP, BACKUP_PACKAGE) && !this.securityManager.checkSignature(Binder.getCallingUid(), BuildConfig.SIGNATURE_UPLOADER, UPLOADER_PACKAGE)) {
            throw new SecurityException("Package not authorized to access provider.");
        }
        Authentication m40633b = this.authenticationPersistence.getAuthentication().m39926r(null).m39933y().m40633b();
        Account m40551b = this.accountManager.accountStatus().m40081W0().m40551b();
        if (m40633b == null || m40551b == null) {
            throw new IllegalStateException("User not logged in.");
        }
        switch (this.uriMatcher.match(uri)) {
            case 1:
                return create("userToken", m40633b.getAccessToken());
            case 2:
                return create(AndroidAccountManagerPersistence.ACCOUNT_STORE_NAME, m40551b.getStore().getName());
            case 3:
                if (AptoideAccountManager.APTOIDE_SIGN_UP_TYPE.equals(m40633b.getType())) {
                    return create("userPass", AptoideUtils.AlgorithmU.computeSha1(m40633b.getPassword()));
                }
                if (FacebookSignUpAdapter.TYPE.equals(m40633b.getType()) || GoogleSignUpAdapter.TYPE.equals(m40633b.getType())) {
                    return create("userPass", m40633b.getPassword());
                }
                break;
            case 4:
                break;
            case 5:
                return create("loginName", m40633b.getEmail());
            case 6:
            default:
                throw new IllegalArgumentException("Only /token, /refreshToken, /repo, /passHash, /loginType, /loginName, loginNickname and loginAvatar supported.");
            case 7:
                return create("userRefreshToken", m40633b.getRefreshToken());
            case 8:
                return create("loginNickname", m40551b.getNickname());
            case 9:
                return create("loginAvatar", m40551b.getAvatar());
        }
        return create("loginType", m40633b.getType().toLowerCase(Locale.US));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int update(android.net.Uri r5, android.content.ContentValues r6, java.lang.String r7, java.lang.String[] r8) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.toolbox.ToolboxContentProvider.update(android.net.Uri, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }
}
