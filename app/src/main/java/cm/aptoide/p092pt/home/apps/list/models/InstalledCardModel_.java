package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.home.apps.list.models.InstalledCardModel;
import cm.aptoide.p092pt.home.apps.model.InstalledApp;
import com.airbnb.epoxy.AbstractC5128n;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.C5143u;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;
import com.airbnb.epoxy.InterfaceC5144v;

/* loaded from: classes.dex */
public class InstalledCardModel_ extends InstalledCardModel implements InterfaceC5144v<InstalledCardModel.CardHolder>, InstalledCardModelBuilder {
    private InterfaceC5113f0<InstalledCardModel_, InstalledCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5117h0<InstalledCardModel_, InstalledCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5119i0<InstalledCardModel_, InstalledCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5121j0<InstalledCardModel_, InstalledCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof InstalledCardModel_) || !super.equals(obj)) {
            return false;
        }
        InstalledCardModel_ installedCardModel_ = (InstalledCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (installedCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (installedCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (installedCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (installedCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        return getApplication() == null ? installedCardModel_.getApplication() == null : getApplication().equals(installedCardModel_.getApplication());
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    protected int getDefaultLayout() {
        return C1138R.layout.apps_installed_app_item;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public int hashCode() {
        return (((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel == null ? 0 : 1)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.InstalledCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledCardModelBuilder onBind(InterfaceC5113f0 interfaceC5113f0) {
        return onBind((InterfaceC5113f0<InstalledCardModel_, InstalledCardModel.CardHolder>) interfaceC5113f0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.InstalledCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledCardModelBuilder onUnbind(InterfaceC5117h0 interfaceC5117h0) {
        return onUnbind((InterfaceC5117h0<InstalledCardModel_, InstalledCardModel.CardHolder>) interfaceC5117h0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.InstalledCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledCardModelBuilder onVisibilityChanged(InterfaceC5119i0 interfaceC5119i0) {
        return onVisibilityChanged((InterfaceC5119i0<InstalledCardModel_, InstalledCardModel.CardHolder>) interfaceC5119i0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.InstalledCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledCardModelBuilder onVisibilityStateChanged(InterfaceC5121j0 interfaceC5121j0) {
        return onVisibilityStateChanged((InterfaceC5121j0<InstalledCardModel_, InstalledCardModel.CardHolder>) interfaceC5121j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public String toString() {
        return "InstalledCardModel_{application=" + getApplication() + "}" + super.toString();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.InstalledCardModelBuilder
    public InstalledCardModel_ application(InstalledApp installedApp) {
        onMutation();
        super.setApplication(installedApp);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.AbstractC5142t
    public InstalledCardModel.CardHolder createNewHolder() {
        return new InstalledCardModel.CardHolder();
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePostBind(InstalledCardModel.CardHolder cardHolder, int i2) {
        InterfaceC5113f0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5113f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5113f0 != null) {
            interfaceC5113f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePreBind(C5143u c5143u, InstalledCardModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public InstalledCardModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.InstalledCardModelBuilder
    public InstalledCardModel_ onBind(InterfaceC5113f0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5113f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5113f0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.InstalledCardModelBuilder
    public InstalledCardModel_ onUnbind(InterfaceC5117h0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5117h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5117h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public InstalledCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication(null);
        super.reset();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public InstalledCardModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public InstalledCardModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public InstalledCardModel_ spanSizeOverride(AbstractC5141s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void unbind(InstalledCardModel.CardHolder cardHolder) {
        super.unbind((InstalledCardModel_) cardHolder);
        InterfaceC5117h0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5117h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5117h0 != null) {
            interfaceC5117h0.m9296a(this, cardHolder);
        }
    }

    public InstalledApp application() {
        return super.getApplication();
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, InstalledCardModel.CardHolder cardHolder) {
        InterfaceC5119i0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5119i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5119i0 != null) {
            interfaceC5119i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityStateChanged(int i2, InstalledCardModel.CardHolder cardHolder) {
        InterfaceC5121j0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5121j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5121j0 != null) {
            interfaceC5121j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public InstalledCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.InstalledCardModelBuilder
    public InstalledCardModel_ onVisibilityChanged(InterfaceC5119i0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5119i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5119i0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.InstalledCardModelBuilder
    public InstalledCardModel_ onVisibilityStateChanged(InterfaceC5121j0<InstalledCardModel_, InstalledCardModel.CardHolder> interfaceC5121j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5121j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledCardModel_ mo8024id(long j2) {
        super.mo8024id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledCardModel_ mo8029id(Number... numberArr) {
        super.mo8029id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledCardModel_ mo8025id(long j2, long j3) {
        super.mo8025id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledCardModel_ mo8026id(CharSequence charSequence) {
        super.mo8026id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledCardModel_ mo8028id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo8028id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledCardModel_ mo8027id(CharSequence charSequence, long j2) {
        super.mo8027id(charSequence, j2);
        return this;
    }
}
