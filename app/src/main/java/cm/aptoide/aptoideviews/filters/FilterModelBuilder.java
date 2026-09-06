package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.FilterModel;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;

/* loaded from: classes.dex */
public interface FilterModelBuilder {
    FilterModelBuilder backgroundRes(Integer num);

    FilterModelBuilder eventListener(FilterEventListener filterEventListener);

    FilterModelBuilder filter(Filter filter);

    /* renamed from: id */
    FilterModelBuilder mo6794id(long j2);

    /* renamed from: id */
    FilterModelBuilder mo6795id(long j2, long j3);

    /* renamed from: id */
    FilterModelBuilder mo6796id(CharSequence charSequence);

    /* renamed from: id */
    FilterModelBuilder mo6797id(CharSequence charSequence, long j2);

    /* renamed from: id */
    FilterModelBuilder mo6798id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    FilterModelBuilder mo6799id(Number... numberArr);

    FilterModelBuilder layout(int i2);

    FilterModelBuilder onBind(InterfaceC5113f0<FilterModel_, FilterModel.CardHolder> interfaceC5113f0);

    FilterModelBuilder onUnbind(InterfaceC5117h0<FilterModel_, FilterModel.CardHolder> interfaceC5117h0);

    FilterModelBuilder onVisibilityChanged(InterfaceC5119i0<FilterModel_, FilterModel.CardHolder> interfaceC5119i0);

    FilterModelBuilder onVisibilityStateChanged(InterfaceC5121j0<FilterModel_, FilterModel.CardHolder> interfaceC5121j0);

    FilterModelBuilder spanSizeOverride(AbstractC5141s.c cVar);

    FilterModelBuilder textColorStateList(Integer num);
}
