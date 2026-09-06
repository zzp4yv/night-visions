package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.ClearFiltersModel;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;

/* loaded from: classes.dex */
public interface ClearFiltersModelBuilder {
    ClearFiltersModelBuilder eventListener(FilterEventListener filterEventListener);

    /* renamed from: id */
    ClearFiltersModelBuilder mo6787id(long j2);

    /* renamed from: id */
    ClearFiltersModelBuilder mo6788id(long j2, long j3);

    /* renamed from: id */
    ClearFiltersModelBuilder mo6789id(CharSequence charSequence);

    /* renamed from: id */
    ClearFiltersModelBuilder mo6790id(CharSequence charSequence, long j2);

    /* renamed from: id */
    ClearFiltersModelBuilder mo6791id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    ClearFiltersModelBuilder mo6792id(Number... numberArr);

    ClearFiltersModelBuilder layout(int i2);

    ClearFiltersModelBuilder onBind(InterfaceC5113f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5113f0);

    ClearFiltersModelBuilder onUnbind(InterfaceC5117h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5117h0);

    ClearFiltersModelBuilder onVisibilityChanged(InterfaceC5119i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5119i0);

    ClearFiltersModelBuilder onVisibilityStateChanged(InterfaceC5121j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5121j0);

    ClearFiltersModelBuilder spanSizeOverride(AbstractC5141s.c cVar);

    ClearFiltersModelBuilder textColorStateList(Integer num);
}
