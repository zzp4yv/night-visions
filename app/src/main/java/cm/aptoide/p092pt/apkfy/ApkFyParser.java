package cm.aptoide.p092pt.apkfy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.C10975j;
import kotlinx.coroutines.C11000p0;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;

/* compiled from: ApkFyParser.kt */
@Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m32267d2 = {"Lcm/aptoide/pt/apkfy/ApkFyParser;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "securePreferences", "Landroid/content/SharedPreferences;", "apkfyManager", "Lcm/aptoide/pt/apkfy/ApkfyManager;", "firstLaunchAnalytics", "Lcm/aptoide/pt/analytics/FirstLaunchAnalytics;", "(Landroid/content/Context;Landroid/content/Intent;Landroid/content/SharedPreferences;Lcm/aptoide/pt/apkfy/ApkfyManager;Lcm/aptoide/pt/analytics/FirstLaunchAnalytics;)V", "run", HttpUrl.FRAGMENT_ENCODE_SET, "saveGuestUID", "guestUid", HttpUrl.FRAGMENT_ENCODE_SET, "setApkfyUtmProperties", "apkfyModel", "Lcm/aptoide/pt/apkfy/ApkfyModel;", "updateApkfy", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class ApkFyParser {
    public static final String APKFY_PACKAGE_APKFY_NO_UTM = "APKFY_BUT_NO_UTM";
    public static final String APKFY_PACKAGE_NO_APKFY = "NO_APKFY";
    public static final String APKFY_PACKAGE_NO_APP = "APKFY_BUT_NO_APP";
    public static final String MMP_GUEST_UID = "MMP_GUEST_UID";
    private final ApkfyManager apkfyManager;
    private final Context context;
    private final FirstLaunchAnalytics firstLaunchAnalytics;
    private final Intent intent;
    private final SharedPreferences securePreferences;

    public ApkFyParser(Context context, Intent intent, SharedPreferences sharedPreferences, ApkfyManager apkfyManager, FirstLaunchAnalytics firstLaunchAnalytics) {
        C9768m.m32346f(context, "context");
        C9768m.m32346f(intent, "intent");
        C9768m.m32346f(sharedPreferences, "securePreferences");
        C9768m.m32346f(apkfyManager, "apkfyManager");
        C9768m.m32346f(firstLaunchAnalytics, "firstLaunchAnalytics");
        this.context = context;
        this.intent = intent;
        this.securePreferences = sharedPreferences;
        this.apkfyManager = apkfyManager;
        this.firstLaunchAnalytics = firstLaunchAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveGuestUID(String guestUid) {
        this.securePreferences.edit().putString(MMP_GUEST_UID, guestUid).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r1 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r1 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setApkfyUtmProperties(cm.aptoide.p092pt.apkfy.ApkfyModel r17) {
        /*
            r16 = this;
            r0 = r16
            boolean r1 = r17.hasUTMs()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L5a
            java.lang.String r1 = r17.getPackageName()
            if (r1 == 0) goto L16
            boolean r1 = kotlin.text.C10504l.m37486t(r1)
            if (r1 == 0) goto L17
        L16:
            r2 = 1
        L17:
            if (r2 == 0) goto L3c
            java.lang.Long r1 = r17.getAppId()
            if (r1 == 0) goto L20
            goto L3c
        L20:
            cm.aptoide.pt.analytics.FirstLaunchAnalytics r2 = r0.firstLaunchAnalytics
            java.lang.String r3 = r17.getUtmContent()
            java.lang.String r4 = r17.getUtmSource()
            java.lang.String r5 = r17.getUtmCampaign()
            java.lang.String r6 = r17.getUtmMedium()
            java.lang.String r7 = r17.getUtmTerm()
            java.lang.String r8 = "APKFY_BUT_NO_APP"
            r2.sendIndicativeFirstLaunchSourceUserProperties(r3, r4, r5, r6, r7, r8)
            goto L9d
        L3c:
            cm.aptoide.pt.analytics.FirstLaunchAnalytics r9 = r0.firstLaunchAnalytics
            java.lang.String r10 = r17.getUtmContent()
            java.lang.String r11 = r17.getUtmSource()
            java.lang.String r12 = r17.getUtmCampaign()
            java.lang.String r13 = r17.getUtmMedium()
            java.lang.String r14 = r17.getUtmTerm()
            java.lang.String r15 = r17.getPackageName()
            r9.sendIndicativeFirstLaunchSourceUserProperties(r10, r11, r12, r13, r14, r15)
            goto L9d
        L5a:
            java.lang.String r1 = r17.getPackageName()
            if (r1 == 0) goto L66
            boolean r1 = kotlin.text.C10504l.m37486t(r1)
            if (r1 == 0) goto L67
        L66:
            r2 = 1
        L67:
            if (r2 == 0) goto L82
            java.lang.Long r1 = r17.getAppId()
            if (r1 == 0) goto L70
            goto L82
        L70:
            cm.aptoide.pt.analytics.FirstLaunchAnalytics r2 = r0.firstLaunchAnalytics
            java.lang.String r3 = "NO_APKFY"
            java.lang.String r4 = "NO_APKFY"
            java.lang.String r5 = "NO_APKFY"
            java.lang.String r6 = "NO_APKFY"
            java.lang.String r7 = "NO_APKFY"
            java.lang.String r8 = "NO_APKFY"
            r2.sendIndicativeFirstLaunchSourceUserProperties(r3, r4, r5, r6, r7, r8)
            goto L9d
        L82:
            cm.aptoide.pt.analytics.FirstLaunchAnalytics r9 = r0.firstLaunchAnalytics
            java.lang.String r10 = r17.getUtmContent()
            java.lang.String r11 = r17.getUtmSource()
            java.lang.String r12 = r17.getUtmCampaign()
            java.lang.String r13 = r17.getUtmMedium()
            java.lang.String r14 = r17.getUtmTerm()
            java.lang.String r15 = "APKFY_BUT_NO_UTM"
            r9.sendIndicativeFirstLaunchSourceUserProperties(r10, r11, r12, r13, r14, r15)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.apkfy.ApkFyParser.setApkfyUtmProperties(cm.aptoide.pt.apkfy.ApkfyModel):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (r0 != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateApkfy(cm.aptoide.p092pt.apkfy.ApkfyModel r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getPackageName()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            boolean r0 = kotlin.text.C10504l.m37486t(r0)
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            if (r0 != 0) goto Lb7
            java.lang.String r0 = r9.getPackageName()
            r3 = 2
            r4 = 0
            java.lang.String r5 = "cm.aptoide.pt"
            boolean r0 = kotlin.text.C10504l.m37457J(r0, r5, r1, r3, r4)
            if (r0 != 0) goto Lb7
            java.lang.Long r0 = r9.getAppId()
            java.lang.String r3 = "oemId"
            java.lang.String r4 = "APK_FY"
            java.lang.String r5 = "appViewFragment"
            if (r0 == 0) goto L6c
            android.content.Intent r0 = r8.intent
            r0.putExtra(r5, r2)
            android.content.Intent r0 = r8.intent
            java.lang.Long r5 = r9.getAppId()
            long r5 = r5.longValue()
            java.lang.String r7 = "appId"
            r0.putExtra(r7, r5)
            java.lang.String r0 = r9.getOemId()
            if (r0 == 0) goto L4e
            boolean r0 = kotlin.text.C10504l.m37486t(r0)
            if (r0 == 0) goto L4f
        L4e:
            r1 = 1
        L4f:
            if (r1 != 0) goto L5a
            android.content.Intent r0 = r8.intent
            java.lang.String r9 = r9.getOemId()
            r0.putExtra(r3, r9)
        L5a:
            android.content.Intent r9 = r8.intent
            r9.putExtra(r4, r2)
            android.content.SharedPreferences r9 = r8.securePreferences
            cm.aptoide.p092pt.preferences.secure.SecurePreferences.setApkFyRun(r9)
            android.content.Context r9 = r8.context
            android.content.Intent r0 = r8.intent
            r9.startActivity(r0)
            goto Lb7
        L6c:
            java.lang.String r0 = r9.getPackageName()
            if (r0 == 0) goto L7b
            boolean r0 = kotlin.text.C10504l.m37486t(r0)
            if (r0 == 0) goto L79
            goto L7b
        L79:
            r0 = 0
            goto L7c
        L7b:
            r0 = 1
        L7c:
            if (r0 != 0) goto Lb7
            android.content.Intent r0 = r8.intent
            r0.putExtra(r5, r2)
            android.content.Intent r0 = r8.intent
            java.lang.String r5 = r9.getPackageName()
            java.lang.String r6 = "packageName"
            r0.putExtra(r6, r5)
            java.lang.String r0 = r9.getOemId()
            if (r0 == 0) goto L9a
            boolean r0 = kotlin.text.C10504l.m37486t(r0)
            if (r0 == 0) goto L9b
        L9a:
            r1 = 1
        L9b:
            if (r1 != 0) goto La6
            android.content.Intent r0 = r8.intent
            java.lang.String r9 = r9.getOemId()
            r0.putExtra(r3, r9)
        La6:
            android.content.Intent r9 = r8.intent
            r9.putExtra(r4, r2)
            android.content.SharedPreferences r9 = r8.securePreferences
            cm.aptoide.p092pt.preferences.secure.SecurePreferences.setApkFyRun(r9)
            android.content.Context r9 = r8.context
            android.content.Intent r0 = r8.intent
            r9.startActivity(r0)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.apkfy.ApkFyParser.updateApkfy(cm.aptoide.pt.apkfy.ApkfyModel):void");
    }

    public final void run() {
        C10975j.m39597b(C11000p0.m39668a(Dispatchers.m39302c()), null, null, new ApkFyParser$run$1(this, null), 3, null);
    }
}
