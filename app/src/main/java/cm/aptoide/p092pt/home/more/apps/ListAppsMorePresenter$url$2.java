package cm.aptoide.p092pt.home.more.apps;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2213V7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C10513u;
import okhttp3.HttpUrl;

/* compiled from: ListAppsMorePresenter.kt */
@Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
final class ListAppsMorePresenter$url$2 extends Lambda implements Function0<String> {
    final /* synthetic */ ListAppsMorePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListAppsMorePresenter$url$2(ListAppsMorePresenter listAppsMorePresenter) {
        super(0);
        this.this$0 = listAppsMorePresenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        ListAppsConfiguration listAppsConfiguration;
        ListAppsConfiguration listAppsConfiguration2;
        ListAppsConfiguration listAppsConfiguration3;
        SharedPreferences sharedPreferences;
        String m37507A;
        ListAppsConfiguration listAppsConfiguration4;
        SharedPreferences sharedPreferences2;
        String m37507A2;
        listAppsConfiguration = this.this$0.listAppsConfiguration;
        if (listAppsConfiguration.getAction() == null) {
            return null;
        }
        ListAppsMorePresenter listAppsMorePresenter = this.this$0;
        listAppsConfiguration2 = listAppsMorePresenter.listAppsConfiguration;
        if (AbstractC2213V7.isUrlBaseCache(listAppsConfiguration2.getAction())) {
            listAppsConfiguration4 = listAppsMorePresenter.listAppsConfiguration;
            String action = listAppsConfiguration4.getAction();
            sharedPreferences2 = listAppsMorePresenter.sharedPreferences;
            String cacheHost = AbstractC2213V7.getCacheHost(sharedPreferences2);
            C9768m.m32345e(cacheHost, "getCacheHost(sharedPreferences)");
            m37507A2 = C10513u.m37507A(action, cacheHost, HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
            return m37507A2;
        }
        listAppsConfiguration3 = listAppsMorePresenter.listAppsConfiguration;
        String action2 = listAppsConfiguration3.getAction();
        sharedPreferences = listAppsMorePresenter.sharedPreferences;
        String host = AbstractC2213V7.getHost(sharedPreferences);
        C9768m.m32345e(host, "getHost(sharedPreferences)");
        m37507A = C10513u.m37507A(action2, host, HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        return m37507A;
    }
}
