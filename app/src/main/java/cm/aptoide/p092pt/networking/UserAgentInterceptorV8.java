package cm.aptoide.p092pt.networking;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.preferences.AptoideMd5Manager;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class UserAgentInterceptorV8 implements Interceptor {
    private final String androidVersion;
    private final int apiLevel;
    private final AptoideMd5Manager aptoideMd5Manager;
    private final String aptoidePackage;
    private final int aptoideVersionCode;
    private final String architecture;
    private final AuthenticationPersistence authenticationPersistence;
    private final DisplayMetrics displayMetrics;
    private final IdsRepository idsRepository;
    private final String model;
    private final String productCode;
    private final String versionName;

    public UserAgentInterceptorV8(IdsRepository idsRepository, String str, int i2, String str2, String str3, String str4, DisplayMetrics displayMetrics, String str5, String str6, AptoideMd5Manager aptoideMd5Manager, int i3, AuthenticationPersistence authenticationPersistence) {
        this.idsRepository = idsRepository;
        this.androidVersion = str;
        this.apiLevel = i2;
        this.model = str2;
        this.productCode = str3;
        this.architecture = str4;
        this.displayMetrics = displayMetrics;
        this.versionName = str5;
        this.aptoidePackage = str6;
        this.aptoideMd5Manager = aptoideMd5Manager;
        this.aptoideVersionCode = i3;
        this.authenticationPersistence = authenticationPersistence;
    }

    public String getDefaultUserAgent() {
        StringBuilder sb = new StringBuilder("Aptoide/" + this.versionName + " (Linux; Android " + this.androidVersion + "; " + this.apiLevel + "; " + this.model + " Build/" + this.productCode + "; " + this.architecture + "; " + this.aptoidePackage + "; " + this.aptoideVersionCode + "; " + this.aptoideMd5Manager.getAptoideMd5() + "; " + (this.displayMetrics.widthPixels + "x" + this.displayMetrics.heightPixels) + "; ");
        String m40633b = this.idsRepository.getUniqueIdentifier().m39933y().m40633b();
        if (m40633b != null) {
            sb.append(m40633b);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        Request request = chain.request();
        try {
            str = getDefaultUserAgent();
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
            str = null;
        }
        try {
            Authentication m40633b = this.authenticationPersistence.getAuthentication().m39933y().m40633b();
            Request.Builder newBuilder = request.newBuilder();
            if (!m40633b.isAuthenticated() && TextUtils.isEmpty(str)) {
                return chain.proceed(request);
            }
            if (m40633b.isAuthenticated()) {
                newBuilder.header("AUTHORIZATION", m40633b.getAccessToken());
            }
            if (!TextUtils.isEmpty(str)) {
                newBuilder.header("User-Agent", str);
            }
            return chain.proceed(newBuilder.build());
        } catch (IOException e3) {
            CrashReport.getInstance().log(e3);
            throw e3;
        }
    }
}
