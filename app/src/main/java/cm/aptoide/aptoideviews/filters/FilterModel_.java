package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.FilterModel;
import com.airbnb.epoxy.AbstractC5128n;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.C5143u;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;
import com.airbnb.epoxy.InterfaceC5144v;

/* loaded from: classes.dex */
public class FilterModel_ extends FilterModel implements InterfaceC5144v<FilterModel.CardHolder>, FilterModelBuilder {
    private InterfaceC5113f0<FilterModel_, FilterModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5117h0<FilterModel_, FilterModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5119i0<FilterModel_, FilterModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5121j0<FilterModel_, FilterModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    @Override // com.airbnb.epoxy.AbstractC5141s
    public void addTo(AbstractC5128n abstractC5128n) {
        super.addTo(abstractC5128n);
        addWithDebugValidation(abstractC5128n);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilterModel_) || !super.equals(obj)) {
            return false;
        }
        FilterModel_ filterModel_ = (FilterModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (filterModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (filterModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (filterModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (filterModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getFilter() == null ? filterModel_.getFilter() != null : !getFilter().equals(filterModel_.getFilter())) {
            return false;
        }
        if ((getEventListener() == null) != (filterModel_.getEventListener() == null)) {
            return false;
        }
        if ((getTextColorStateList() == null) != (filterModel_.getTextColorStateList() == null)) {
            return false;
        }
        return (getBackgroundRes() == null) == (filterModel_.getBackgroundRes() == null);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public int hashCode() {
        return (((((((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getFilter() != null ? getFilter().hashCode() : 0)) * 31) + (getEventListener() != null ? 1 : 0)) * 31) + (getTextColorStateList() != null ? 1 : 0)) * 31) + (getBackgroundRes() == null ? 0 : 1);
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public /* bridge */ /* synthetic */ FilterModelBuilder onBind(InterfaceC5113f0 interfaceC5113f0) {
        return onBind((InterfaceC5113f0<FilterModel_, FilterModel.CardHolder>) interfaceC5113f0);
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public /* bridge */ /* synthetic */ FilterModelBuilder onUnbind(InterfaceC5117h0 interfaceC5117h0) {
        return onUnbind((InterfaceC5117h0<FilterModel_, FilterModel.CardHolder>) interfaceC5117h0);
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public /* bridge */ /* synthetic */ FilterModelBuilder onVisibilityChanged(InterfaceC5119i0 interfaceC5119i0) {
        return onVisibilityChanged((InterfaceC5119i0<FilterModel_, FilterModel.CardHolder>) interfaceC5119i0);
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public /* bridge */ /* synthetic */ FilterModelBuilder onVisibilityStateChanged(InterfaceC5121j0 interfaceC5121j0) {
        return onVisibilityStateChanged((InterfaceC5121j0<FilterModel_, FilterModel.CardHolder>) interfaceC5121j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public String toString() {
        return "FilterModel_{filter=" + getFilter() + ", eventListener=" + getEventListener() + ", textColorStateList=" + getTextColorStateList() + ", backgroundRes=" + getBackgroundRes() + "}" + super.toString();
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ backgroundRes(Integer num) {
        onMutation();
        super.setBackgroundRes(num);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.AbstractC5142t
    public FilterModel.CardHolder createNewHolder() {
        return new FilterModel.CardHolder();
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ eventListener(FilterEventListener filterEventListener) {
        onMutation();
        super.setEventListener(filterEventListener);
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ filter(Filter filter) {
        onMutation();
        super.setFilter(filter);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePostBind(FilterModel.CardHolder cardHolder, int i2) {
        InterfaceC5113f0<FilterModel_, FilterModel.CardHolder> interfaceC5113f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5113f0 != null) {
            interfaceC5113f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePreBind(C5143u c5143u, FilterModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public FilterModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ onBind(InterfaceC5113f0<FilterModel_, FilterModel.CardHolder> interfaceC5113f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5113f0;
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ onUnbind(InterfaceC5117h0<FilterModel_, FilterModel.CardHolder> interfaceC5117h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5117h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public FilterModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setFilter(null);
        super.setEventListener(null);
        super.setTextColorStateList(null);
        super.setBackgroundRes(null);
        super.reset();
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ textColorStateList(Integer num) {
        onMutation();
        super.setTextColorStateList(num);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public FilterModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public FilterModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public FilterModel_ spanSizeOverride(AbstractC5141s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void unbind(FilterModel.CardHolder cardHolder) {
        super.unbind((FilterModel_) cardHolder);
        InterfaceC5117h0<FilterModel_, FilterModel.CardHolder> interfaceC5117h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5117h0 != null) {
            interfaceC5117h0.m9296a(this, cardHolder);
        }
    }

    public Integer backgroundRes() {
        return super.getBackgroundRes();
    }

    public FilterEventListener eventListener() {
        return super.getEventListener();
    }

    public Filter filter() {
        return super.getFilter();
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, FilterModel.CardHolder cardHolder) {
        InterfaceC5119i0<FilterModel_, FilterModel.CardHolder> interfaceC5119i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5119i0 != null) {
            interfaceC5119i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityStateChanged(int i2, FilterModel.CardHolder cardHolder) {
        InterfaceC5121j0<FilterModel_, FilterModel.CardHolder> interfaceC5121j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5121j0 != null) {
            interfaceC5121j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public FilterModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public Integer textColorStateList() {
        return super.getTextColorStateList();
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ onVisibilityChanged(InterfaceC5119i0<FilterModel_, FilterModel.CardHolder> interfaceC5119i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5119i0;
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.FilterModelBuilder
    public FilterModel_ onVisibilityStateChanged(InterfaceC5121j0<FilterModel_, FilterModel.CardHolder> interfaceC5121j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5121j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6794id(long j2) {
        super.mo6794id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6799id(Number... numberArr) {
        super.mo6799id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6795id(long j2, long j3) {
        super.mo6795id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6796id(CharSequence charSequence) {
        super.mo6796id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6798id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo6798id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public FilterModel_ mo6797id(CharSequence charSequence, long j2) {
        super.mo6797id(charSequence, j2);
        return this;
    }
}
