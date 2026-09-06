package cm.aptoide.p092pt.dataprovider.cache;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.io.IOException;
import okhttp3.Request;
import p353j.C9670f;

/* loaded from: classes.dex */
public class Sha1KeyAlgorithm implements KeyAlgorithm<Request, String> {
    private static final String TAG = "cm.aptoide.pt.dataprovider.cache.Sha1KeyAlgorithm";

    @Override // cm.aptoide.p092pt.dataprovider.cache.KeyAlgorithm
    public String getKeyFrom(Request request) {
        String url;
        try {
            C9670f c9670f = new C9670f();
            Request build = request.newBuilder().build();
            if (build.body() == null || build.body().contentLength() <= 0) {
                url = build.url().getUrl();
            } else {
                build.body().writeTo(c9670f);
                url = build.url().getUrl() + c9670f.m32021T();
            }
            return AptoideUtils.AlgorithmU.computeSha1(url);
        } catch (IOException e2) {
            CrashReport.getInstance().log(e2);
            return null;
        }
    }
}
