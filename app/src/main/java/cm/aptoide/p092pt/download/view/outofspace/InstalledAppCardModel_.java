package cm.aptoide.p092pt.download.view.outofspace;

import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModel;
import com.airbnb.epoxy.AbstractC5128n;
import com.airbnb.epoxy.AbstractC5141s;
import com.airbnb.epoxy.C5143u;
import com.airbnb.epoxy.InterfaceC5113f0;
import com.airbnb.epoxy.InterfaceC5117h0;
import com.airbnb.epoxy.InterfaceC5119i0;
import com.airbnb.epoxy.InterfaceC5121j0;
import com.airbnb.epoxy.InterfaceC5144v;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public class InstalledAppCardModel_ extends InstalledAppCardModel implements InterfaceC5144v<InstalledAppCardModel.CardHolder>, InstalledAppCardModelBuilder {
    private InterfaceC5113f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5117h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5119i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5121j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof InstalledAppCardModel_) || !super.equals(obj)) {
            return false;
        }
        InstalledAppCardModel_ installedAppCardModel_ = (InstalledAppCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (installedAppCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? installedAppCardModel_.getApplication() == null : getApplication().equals(installedAppCardModel_.getApplication())) {
            return (getEventSubject() == null) == (installedAppCardModel_.getEventSubject() == null);
        }
        return false;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder eventSubject(C11370b c11370b) {
        return eventSubject((C11370b<String>) c11370b);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    protected int getDefaultLayout() {
        return C1138R.layout.out_of_space_installed_app_card;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0)) * 31) + (getEventSubject() == null ? 0 : 1);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder onBind(InterfaceC5113f0 interfaceC5113f0) {
        return onBind((InterfaceC5113f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder>) interfaceC5113f0);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder onUnbind(InterfaceC5117h0 interfaceC5117h0) {
        return onUnbind((InterfaceC5117h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder>) interfaceC5117h0);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder onVisibilityChanged(InterfaceC5119i0 interfaceC5119i0) {
        return onVisibilityChanged((InterfaceC5119i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder>) interfaceC5119i0);
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public /* bridge */ /* synthetic */ InstalledAppCardModelBuilder onVisibilityStateChanged(InterfaceC5121j0 interfaceC5121j0) {
        return onVisibilityStateChanged((InterfaceC5121j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder>) interfaceC5121j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public String toString() {
        return "InstalledAppCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ application(InstalledApp installedApp) {
        onMutation();
        super.setApplication(installedApp);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.AbstractC5142t
    public InstalledAppCardModel.CardHolder createNewHolder() {
        return new InstalledAppCardModel.CardHolder();
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ eventSubject(C11370b<String> c11370b) {
        onMutation();
        super.setEventSubject(c11370b);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePostBind(InstalledAppCardModel.CardHolder cardHolder, int i2) {
        InterfaceC5113f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5113f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5113f0 != null) {
            interfaceC5113f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePreBind(C5143u c5143u, InstalledAppCardModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public InstalledAppCardModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ onBind(InterfaceC5113f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5113f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5113f0;
        return this;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ onUnbind(InterfaceC5117h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5117h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5117h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public InstalledAppCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication(null);
        super.setEventSubject(null);
        super.reset();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public InstalledAppCardModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public InstalledAppCardModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public InstalledAppCardModel_ spanSizeOverride(AbstractC5141s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void unbind(InstalledAppCardModel.CardHolder cardHolder) {
        super.unbind((InstalledAppCardModel_) cardHolder);
        InterfaceC5117h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5117h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5117h0 != null) {
            interfaceC5117h0.m9296a(this, cardHolder);
        }
    }

    public InstalledApp application() {
        return super.getApplication();
    }

    public C11370b<String> eventSubject() {
        return super.getEventSubject();
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, InstalledAppCardModel.CardHolder cardHolder) {
        InterfaceC5119i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5119i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5119i0 != null) {
            interfaceC5119i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityStateChanged(int i2, InstalledAppCardModel.CardHolder cardHolder) {
        InterfaceC5121j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5121j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5121j0 != null) {
            interfaceC5121j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public InstalledAppCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ onVisibilityChanged(InterfaceC5119i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5119i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5119i0;
        return this;
    }

    @Override // cm.aptoide.p092pt.download.view.outofspace.InstalledAppCardModelBuilder
    public InstalledAppCardModel_ onVisibilityStateChanged(InterfaceC5121j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> interfaceC5121j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5121j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo7544id(long j2) {
        super.mo7544id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo7549id(Number... numberArr) {
        super.mo7549id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo7545id(long j2, long j3) {
        super.mo7545id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo7546id(CharSequence charSequence) {
        super.mo7546id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo7548id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo7548id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public InstalledAppCardModel_ mo7547id(CharSequence charSequence, long j2) {
        super.mo7547id(charSequence, j2);
        return this;
    }
}
