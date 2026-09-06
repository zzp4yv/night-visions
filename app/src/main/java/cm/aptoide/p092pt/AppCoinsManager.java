package cm.aptoide.p092pt;

import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.bonus.BonusAppcService;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.rx2.C10859h;
import okhttp3.HttpUrl;
import p323h.p324a.AbstractC9049s;

/* compiled from: AppCoinsManager.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/AppCoinsManager;", HttpUrl.FRAGMENT_ENCODE_SET, "bonusAppcService", "Lcm/aptoide/pt/bonus/BonusAppcService;", "(Lcm/aptoide/pt/bonus/BonusAppcService;)V", "getBonusAppc", "Lio/reactivex/Single;", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "appcoins"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class AppCoinsManager {
    private final BonusAppcService bonusAppcService;

    public AppCoinsManager(BonusAppcService bonusAppcService) {
        C9768m.m32346f(bonusAppcService, "bonusAppcService");
        this.bonusAppcService = bonusAppcService;
    }

    public final AbstractC9049s<BonusAppcModel> getBonusAppc() {
        return C10859h.m39135c(null, new AppCoinsManager$getBonusAppc$1(this, null), 1, null);
    }
}
