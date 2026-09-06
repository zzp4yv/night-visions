package cm.aptoide.p092pt.download.view.outofspace;

import cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModel;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public interface InstalledAppCardModelBuilder {
    InstalledAppCardModelBuilder application(InstalledApp installedApp);

    InstalledAppCardModelBuilder eventSubject(C11370b<String> c11370b);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7544id(long j2);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7545id(long j2, long j3);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7546id(CharSequence charSequence);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7547id(CharSequence charSequence, long j2);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7548id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo7549id(Number... numberArr);

    InstalledAppCardModelBuilder layout(int i2);

    InstalledAppCardModelBuilder onBind(InterfaceC5113f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5113f0);

    InstalledAppCardModelBuilder onUnbind(InterfaceC5117h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5117h0);

    InstalledAppCardModelBuilder onVisibilityChanged(InterfaceC5119i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5119i0);

    InstalledAppCardModelBuilder onVisibilityStateChanged(InterfaceC5121j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5121j0);

    InstalledAppCardModelBuilder spanSizeOverride(AbstractC5141s.c cVar);
}
