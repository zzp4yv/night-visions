package cm.aptoide.p092pt.dataprovider.cache;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import p353j.C9670f;

/* loaded from: classes.dex */
public class POSTCacheKeyAlgorithm implements KeyAlgorithm<Request, String> {
    @Override // cm.aptoide.p092pt.dataprovider.cache.KeyAlgorithm
    public String getKeyFrom(Request request) {
        Request build = request.newBuilder().build();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("URL:%s\n", build.url().getUrl()));
        Headers headers = build.headers();
        if (headers.size() > 0) {
            sb.append("Headers:\n");
            for (String str : headers.names()) {
                sb.append(String.format("\t%s: %s\n", str, AptoideUtils.StringU.join(headers.values(str), ", ")));
            }
        }
        try {
            if (build.body() != null && build.body().contentLength() > 0) {
                sb.append("Body:\n");
                C9670f c9670f = new C9670f();
                build.body().writeTo(c9670f);
                sb.append(c9670f.m32021T());
            }
            return AptoideUtils.AlgorithmU.computeSha1(sb.toString());
        } catch (IOException e2) {
            CrashReport.getInstance().log(e2);
            return null;
        }
    }
}
