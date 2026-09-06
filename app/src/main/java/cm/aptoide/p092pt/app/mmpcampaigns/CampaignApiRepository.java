package cm.aptoide.p092pt.app.mmpcampaigns;

import javax.inject.Inject;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.C10928h;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* compiled from: CampaignApiRepository.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m32267d2 = {"Lcm/aptoide/pt/app/mmpcampaigns/CampaignApiRepository;", "Lcm/aptoide/pt/app/mmpcampaigns/CampaignRepository;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "knock", HttpUrl.FRAGMENT_ENCODE_SET, "url", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CampaignApiRepository implements CampaignRepository {
    private final OkHttpClient client;

    @Inject
    public CampaignApiRepository(OkHttpClient okHttpClient) {
        C9768m.m32346f(okHttpClient, "client");
        this.client = okHttpClient;
    }

    @Override // cm.aptoide.p092pt.app.mmpcampaigns.CampaignRepository
    public Object knock(String str, Continuation<? super C10742u> continuation) {
        Object m39045c;
        Object m39412e = C10928h.m39412e(Dispatchers.m39301b(), new CampaignApiRepository$knock$2(this, str, null), continuation);
        m39045c = C10822d.m39045c();
        return m39412e == m39045c ? m39412e : C10742u.f41439a;
    }
}
