package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.home.apps.list.models.TitleModel;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public interface TitleModelBuilder {
    TitleModelBuilder eventSubject(C11370b<Void> c11370b);

    /* renamed from: id */
    TitleModelBuilder mo8031id(long j2);

    /* renamed from: id */
    TitleModelBuilder mo8032id(long j2, long j3);

    /* renamed from: id */
    TitleModelBuilder mo8033id(CharSequence charSequence);

    /* renamed from: id */
    TitleModelBuilder mo8034id(CharSequence charSequence, long j2);

    /* renamed from: id */
    TitleModelBuilder mo8035id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    TitleModelBuilder mo8036id(Number... numberArr);

    TitleModelBuilder layout(int i2);

    TitleModelBuilder onBind(InterfaceC5113f0<TitleModel_, TitleModel.Holder> interfaceC5113f0);

    TitleModelBuilder onUnbind(InterfaceC5117h0<TitleModel_, TitleModel.Holder> interfaceC5117h0);

    TitleModelBuilder onVisibilityChanged(InterfaceC5119i0<TitleModel_, TitleModel.Holder> interfaceC5119i0);

    TitleModelBuilder onVisibilityStateChanged(InterfaceC5121j0<TitleModel_, TitleModel.Holder> interfaceC5121j0);

    TitleModelBuilder shouldShowButton(boolean z);

    TitleModelBuilder spanSizeOverride(AbstractC5141s.c cVar);

    TitleModelBuilder title(Integer num);
}
