package cm.aptoide.p092pt.aab;

import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.rx2.C10859h;
import okhttp3.HttpUrl;
import p323h.p324a.AbstractC9049s;

/* compiled from: DynamicSplitsManager.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m32267d2 = {"Lcm/aptoide/pt/aab/DynamicSplitsManager;", HttpUrl.FRAGMENT_ENCODE_SET, "dynamicSplitsService", "Lcm/aptoide/pt/aab/DynamicSplitsService;", "(Lcm/aptoide/pt/aab/DynamicSplitsService;)V", "getAppSplitsByMd5", "Lio/reactivex/Single;", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "apkMd5Sum", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class DynamicSplitsManager {
    private final DynamicSplitsService dynamicSplitsService;

    public DynamicSplitsManager(DynamicSplitsService dynamicSplitsService) {
        C9768m.m32346f(dynamicSplitsService, "dynamicSplitsService");
        this.dynamicSplitsService = dynamicSplitsService;
    }

    public AbstractC9049s<DynamicSplitsModel> getAppSplitsByMd5(String str) {
        C9768m.m32346f(str, "apkMd5Sum");
        return C10859h.m39135c(null, new DynamicSplitsManager$getAppSplitsByMd5$1(this, str, null), 1, null);
    }
}
