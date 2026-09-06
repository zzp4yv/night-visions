package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.list.models.DownloadCardModel;
import cm.aptoide.p092pt.home.apps.model.DownloadApp;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public interface DownloadCardModelBuilder {
    DownloadCardModelBuilder application(DownloadApp downloadApp);

    DownloadCardModelBuilder eventSubject(C11370b<AppClick> c11370b);

    /* renamed from: id */
    DownloadCardModelBuilder mo8018id(long j2);

    /* renamed from: id */
    DownloadCardModelBuilder mo8019id(long j2, long j3);

    /* renamed from: id */
    DownloadCardModelBuilder mo8020id(CharSequence charSequence);

    /* renamed from: id */
    DownloadCardModelBuilder mo8021id(CharSequence charSequence, long j2);

    /* renamed from: id */
    DownloadCardModelBuilder mo8022id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    DownloadCardModelBuilder mo8023id(Number... numberArr);

    DownloadCardModelBuilder layout(int i2);

    DownloadCardModelBuilder onBind(InterfaceC5113f0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5113f0);

    DownloadCardModelBuilder onUnbind(InterfaceC5117h0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5117h0);

    DownloadCardModelBuilder onVisibilityChanged(InterfaceC5119i0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5119i0);

    DownloadCardModelBuilder onVisibilityStateChanged(InterfaceC5121j0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5121j0);

    DownloadCardModelBuilder spanSizeOverride(AbstractC5141s.c cVar);
}
