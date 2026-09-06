package cm.aptoide.p092pt.app.mmpcampaigns;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.apkfy.ApkFyParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: CampaignManager.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "cm.aptoide.pt.app.mmpcampaigns.CampaignManager$convertCampaign$1", m39050f = "CampaignManager.kt", m39051l = {14}, m39052m = "invokeSuspend")
/* loaded from: classes.dex */
final class CampaignManager$convertCampaign$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10742u>, Object> {
    final /* synthetic */ Campaign $campaign;
    final /* synthetic */ String $medium;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CampaignManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CampaignManager$convertCampaign$1(Campaign campaign, CampaignManager campaignManager, String str, Continuation<? super CampaignManager$convertCampaign$1> continuation) {
        super(2, continuation);
        this.$campaign = campaign;
        this.this$0 = campaignManager;
        this.$medium = str;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
        return new CampaignManager$convertCampaign$1(this.$campaign, this.this$0, this.$medium, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10742u> continuation) {
        return ((CampaignManager$convertCampaign$1) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m39045c;
        String str;
        Iterator it;
        CampaignManager campaignManager;
        CampaignRepository campaignRepository;
        SharedPreferences sharedPreferences;
        m39045c = C10822d.m39045c();
        int i2 = this.label;
        if (i2 == 0) {
            C10535o.m37655b(obj);
            List<CampaignUrl> download = this.$campaign.getDownload();
            if (download != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : download) {
                    if (C9768m.m32341a(((CampaignUrl) obj2).getName(), "aptoide-mmp")) {
                        arrayList.add(obj2);
                    }
                }
                CampaignManager campaignManager2 = this.this$0;
                str = this.$medium;
                it = arrayList.iterator();
                campaignManager = campaignManager2;
            }
            return C10742u.f41439a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) this.L$2;
        str = (String) this.L$1;
        campaignManager = (CampaignManager) this.L$0;
        C10535o.m37655b(obj);
        while (it.hasNext()) {
            CampaignUrl campaignUrl = (CampaignUrl) it.next();
            campaignRepository = campaignManager.campaignRepository;
            String url = campaignUrl.getUrl();
            sharedPreferences = campaignManager.securePreferences;
            String injectCampaignAttributes = CampaignManagerKt.injectCampaignAttributes(url, str, sharedPreferences.getString(ApkFyParser.MMP_GUEST_UID, HttpUrl.FRAGMENT_ENCODE_SET));
            this.L$0 = campaignManager;
            this.L$1 = str;
            this.L$2 = it;
            this.label = 1;
            if (campaignRepository.knock(injectCampaignAttributes, this) == m39045c) {
                return m39045c;
            }
        }
        return C10742u.f41439a;
    }
}
