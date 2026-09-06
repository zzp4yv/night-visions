package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.ClearFiltersModel;
import com.airbnb.epoxy.AbstractC5128n;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.C5143u;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;
import com.airbnb.epoxy.InterfaceC5144v;

/* loaded from: classes.dex */
public class ClearFiltersModel_ extends ClearFiltersModel implements InterfaceC5144v<ClearFiltersModel.CardHolder>, ClearFiltersModelBuilder {
    private InterfaceC5113f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5117h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5119i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5121j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof ClearFiltersModel_) || !super.equals(obj)) {
            return false;
        }
        ClearFiltersModel_ clearFiltersModel_ = (ClearFiltersModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (clearFiltersModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((getEventListener() == null) != (clearFiltersModel_.getEventListener() == null)) {
            return false;
        }
        return (getTextColorStateList() == null) == (clearFiltersModel_.getTextColorStateList() == null);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getEventListener() != null ? 1 : 0)) * 31) + (getTextColorStateList() == null ? 0 : 1);
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public /* bridge */ /* synthetic */ ClearFiltersModelBuilder onBind(InterfaceC5113f0 interfaceC5113f0) {
        return onBind((InterfaceC5113f0<ClearFiltersModel_, ClearFiltersModel.CardHolder>) interfaceC5113f0);
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public /* bridge */ /* synthetic */ ClearFiltersModelBuilder onUnbind(InterfaceC5117h0 interfaceC5117h0) {
        return onUnbind((InterfaceC5117h0<ClearFiltersModel_, ClearFiltersModel.CardHolder>) interfaceC5117h0);
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public /* bridge */ /* synthetic */ ClearFiltersModelBuilder onVisibilityChanged(InterfaceC5119i0 interfaceC5119i0) {
        return onVisibilityChanged((InterfaceC5119i0<ClearFiltersModel_, ClearFiltersModel.CardHolder>) interfaceC5119i0);
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public /* bridge */ /* synthetic */ ClearFiltersModelBuilder onVisibilityStateChanged(InterfaceC5121j0 interfaceC5121j0) {
        return onVisibilityStateChanged((InterfaceC5121j0<ClearFiltersModel_, ClearFiltersModel.CardHolder>) interfaceC5121j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public String toString() {
        return "ClearFiltersModel_{eventListener=" + getEventListener() + ", textColorStateList=" + getTextColorStateList() + "}" + super.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.AbstractC5142t
    public ClearFiltersModel.CardHolder createNewHolder() {
        return new ClearFiltersModel.CardHolder();
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ eventListener(FilterEventListener filterEventListener) {
        onMutation();
        super.setEventListener(filterEventListener);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePostBind(ClearFiltersModel.CardHolder cardHolder, int i2) {
        InterfaceC5113f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5113f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5113f0 != null) {
            interfaceC5113f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePreBind(C5143u c5143u, ClearFiltersModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public ClearFiltersModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ onBind(InterfaceC5113f0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5113f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5113f0;
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ onUnbind(InterfaceC5117h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5117h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5117h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public ClearFiltersModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setEventListener(null);
        super.setTextColorStateList(null);
        super.reset();
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ textColorStateList(Integer num) {
        onMutation();
        super.setTextColorStateList(num);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public ClearFiltersModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ spanSizeOverride(AbstractC5141s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void unbind(ClearFiltersModel.CardHolder cardHolder) {
        super.unbind((ClearFiltersModel_) cardHolder);
        InterfaceC5117h0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5117h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5117h0 != null) {
            interfaceC5117h0.m9296a(this, cardHolder);
        }
    }

    public FilterEventListener eventListener() {
        return super.getEventListener();
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, ClearFiltersModel.CardHolder cardHolder) {
        InterfaceC5119i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5119i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5119i0 != null) {
            interfaceC5119i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityStateChanged(int i2, ClearFiltersModel.CardHolder cardHolder) {
        InterfaceC5121j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5121j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5121j0 != null) {
            interfaceC5121j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public ClearFiltersModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public Integer textColorStateList() {
        return super.getTextColorStateList();
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ onVisibilityChanged(InterfaceC5119i0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5119i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5119i0;
        return this;
    }

    @Override // cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public ClearFiltersModel_ onVisibilityStateChanged(InterfaceC5121j0<ClearFiltersModel_, ClearFiltersModel.CardHolder> interfaceC5121j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5121j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo7544id(long j2) {
        super.mo7544id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo7549id(Number... numberArr) {
        super.mo7549id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo7545id(long j2, long j3) {
        super.mo7545id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo7546id(CharSequence charSequence) {
        super.mo7546id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo7548id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo7548id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id */
    public ClearFiltersModel_ mo7547id(CharSequence charSequence, long j2) {
        super.mo7547id(charSequence, j2);
        return this;
    }
}
