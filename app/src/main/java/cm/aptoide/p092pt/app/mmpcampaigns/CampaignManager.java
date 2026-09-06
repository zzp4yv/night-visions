package cm.aptoide.p092pt.app.mmpcampaigns;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.rx2.C10857f;
import okhttp3.HttpUrl;
import p323h.p324a.AbstractC9031b;

/* compiled from: CampaignManager.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/pt/app/mmpcampaigns/CampaignManager;", HttpUrl.FRAGMENT_ENCODE_SET, "campaignRepository", "Lcm/aptoide/pt/app/mmpcampaigns/CampaignRepository;", "securePreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/app/mmpcampaigns/CampaignRepository;Landroid/content/SharedPreferences;)V", "convertCampaign", "Lio/reactivex/Completable;", "campaign", "Lcm/aptoide/pt/app/mmpcampaigns/Campaign;", "medium", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CampaignManager {
    private final CampaignRepository campaignRepository;
    private final SharedPreferences securePreferences;

    public CampaignManager(CampaignRepository campaignRepository, SharedPreferences sharedPreferences) {
        C9768m.m32346f(campaignRepository, "campaignRepository");
        C9768m.m32346f(sharedPreferences, "securePreferences");
        this.campaignRepository = campaignRepository;
        this.securePreferences = sharedPreferences;
    }

    public final AbstractC9031b convertCampaign(Campaign campaign, String str) {
        C9768m.m32346f(campaign, "campaign");
        C9768m.m32346f(str, "medium");
        return C10857f.m39130c(null, new CampaignManager$convertCampaign$1(campaign, this, str, null), 1, null);
    }
}
