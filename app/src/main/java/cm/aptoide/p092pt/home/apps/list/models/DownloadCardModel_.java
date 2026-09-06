package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.list.models.DownloadCardModel;
import cm.aptoide.p092pt.home.apps.model.DownloadApp;
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
public class DownloadCardModel_ extends DownloadCardModel implements InterfaceC5144v<DownloadCardModel.CardHolder>, DownloadCardModelBuilder {
    private InterfaceC5113f0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5117h0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5119i0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5121j0<DownloadCardModel_, DownloadCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof DownloadCardModel_) || !super.equals(obj)) {
            return false;
        }
        DownloadCardModel_ downloadCardModel_ = (DownloadCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (downloadCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? downloadCardModel_.getApplication() == null : getApplication().equals(downloadCardModel_.getApplication())) {
            return (getEventSubject() == null) == (downloadCardModel_.getEventSubject() == null);
        }
        return false;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder eventSubject(C11370b c11370b) {
        return eventSubject((C11370b<AppClick>) c11370b);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    protected int getDefaultLayout() {
        return C1138R.layout.apps_download_app_item;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public int hashCode() {
        return (((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0)) * 31) + (getEventSubject() == null ? 0 : 1);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onBind(InterfaceC5113f0 interfaceC5113f0) {
        return onBind((InterfaceC5113f0<DownloadCardModel_, DownloadCardModel.CardHolder>) interfaceC5113f0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onUnbind(InterfaceC5117h0 interfaceC5117h0) {
        return onUnbind((InterfaceC5117h0<DownloadCardModel_, DownloadCardModel.CardHolder>) interfaceC5117h0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onVisibilityChanged(InterfaceC5119i0 interfaceC5119i0) {
        return onVisibilityChanged((InterfaceC5119i0<DownloadCardModel_, DownloadCardModel.CardHolder>) interfaceC5119i0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public /* bridge */ /* synthetic */ DownloadCardModelBuilder onVisibilityStateChanged(InterfaceC5121j0 interfaceC5121j0) {
        return onVisibilityStateChanged((InterfaceC5121j0<DownloadCardModel_, DownloadCardModel.CardHolder>) interfaceC5121j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public String toString() {
        return "DownloadCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ application(DownloadApp downloadApp) {
        onMutation();
        super.setApplication(downloadApp);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.AbstractC5142t
    public DownloadCardModel.CardHolder createNewHolder() {
        return new DownloadCardModel.CardHolder();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ eventSubject(C11370b<AppClick> c11370b) {
        onMutation();
        super.setEventSubject(c11370b);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePostBind(DownloadCardModel.CardHolder cardHolder, int i2) {
        InterfaceC5113f0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5113f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5113f0 != null) {
            interfaceC5113f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePreBind(C5143u c5143u, DownloadCardModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public DownloadCardModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onBind(InterfaceC5113f0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5113f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5113f0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onUnbind(InterfaceC5117h0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5117h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5117h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public DownloadCardModel_ reset() {
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
    public DownloadCardModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public DownloadCardModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public DownloadCardModel_ spanSizeOverride(AbstractC5141s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void unbind(DownloadCardModel.CardHolder cardHolder) {
        super.unbind((DownloadCardModel_) cardHolder);
        InterfaceC5117h0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5117h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5117h0 != null) {
            interfaceC5117h0.m9296a(this, cardHolder);
        }
    }

    public DownloadApp application() {
        return super.getApplication();
    }

    public C11370b<AppClick> eventSubject() {
        return super.getEventSubject();
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, DownloadCardModel.CardHolder cardHolder) {
        InterfaceC5119i0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5119i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5119i0 != null) {
            interfaceC5119i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityStateChanged(int i2, DownloadCardModel.CardHolder cardHolder) {
        InterfaceC5121j0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5121j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5121j0 != null) {
            interfaceC5121j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public DownloadCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onVisibilityChanged(InterfaceC5119i0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5119i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5119i0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.DownloadCardModelBuilder
    public DownloadCardModel_ onVisibilityStateChanged(InterfaceC5121j0<DownloadCardModel_, DownloadCardModel.CardHolder> interfaceC5121j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5121j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8018id(long j2) {
        super.mo8018id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8023id(Number... numberArr) {
        super.mo8023id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8019id(long j2, long j3) {
        super.mo8019id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8020id(CharSequence charSequence) {
        super.mo8020id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8022id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo8022id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public DownloadCardModel_ mo8021id(CharSequence charSequence, long j2) {
        super.mo8021id(charSequence, j2);
        return this;
    }
}
