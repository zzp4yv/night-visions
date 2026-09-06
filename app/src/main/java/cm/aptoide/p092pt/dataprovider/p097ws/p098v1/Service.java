package cm.aptoide.p092pt.dataprovider.p097ws.p098v1;

import cm.aptoide.p092pt.dataprovider.model.p093v1.GetPullNotificationsResponse;
import java.util.List;
import java.util.Map;
import p456rx.C11186e;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* loaded from: classes.dex */
public interface Service {
    @GET("notifications/{id}/campaigns")
    C11186e<List<GetPullNotificationsResponse>> getPullCampaignNotifications(@Path("id") String str, @QueryMap Map<String, String> map, @Header("X-Bypass-Cache") boolean z);
}
