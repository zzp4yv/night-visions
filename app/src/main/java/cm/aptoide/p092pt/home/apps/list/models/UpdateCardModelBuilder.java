package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.list.models.UpdateCardModel;
import cm.aptoide.p092pt.home.apps.model.UpdateApp;
import cm.aptoide.p092pt.themes.ThemeManager;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public interface UpdateCardModelBuilder {
    UpdateCardModelBuilder application(UpdateApp updateApp);

    UpdateCardModelBuilder eventSubject(C11370b<AppClick> c11370b);

    /* renamed from: id */
    UpdateCardModelBuilder mo8040id(long j2);

    /* renamed from: id */
    UpdateCardModelBuilder mo8041id(long j2, long j3);

    /* renamed from: id */
    UpdateCardModelBuilder mo8042id(CharSequence charSequence);

    /* renamed from: id */
    UpdateCardModelBuilder mo8043id(CharSequence charSequence, long j2);

    /* renamed from: id */
    UpdateCardModelBuilder mo8044id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    UpdateCardModelBuilder mo8045id(Number... numberArr);

    UpdateCardModelBuilder layout(int i2);

    UpdateCardModelBuilder onBind(InterfaceC5113f0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5113f0);

    UpdateCardModelBuilder onUnbind(InterfaceC5117h0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5117h0);

    UpdateCardModelBuilder onVisibilityChanged(InterfaceC5119i0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5119i0);

    UpdateCardModelBuilder onVisibilityStateChanged(InterfaceC5121j0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5121j0);

    UpdateCardModelBuilder spanSizeOverride(AbstractC5141s.c cVar);

    UpdateCardModelBuilder themeManager(ThemeManager themeManager);
}
