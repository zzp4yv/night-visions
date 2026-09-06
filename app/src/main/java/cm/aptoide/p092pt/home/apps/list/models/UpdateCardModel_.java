package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.home.apps.AppClick;
import cm.aptoide.p092pt.home.apps.list.models.UpdateCardModel;
import cm.aptoide.p092pt.home.apps.model.UpdateApp;
import cm.aptoide.p092pt.themes.ThemeManager;
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
public class UpdateCardModel_ extends UpdateCardModel implements InterfaceC5144v<UpdateCardModel.CardHolder>, UpdateCardModelBuilder {
    private InterfaceC5113f0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5117h0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5119i0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5121j0<UpdateCardModel_, UpdateCardModel.CardHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof UpdateCardModel_) || !super.equals(obj)) {
            return false;
        }
        UpdateCardModel_ updateCardModel_ = (UpdateCardModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (updateCardModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getApplication() == null ? updateCardModel_.getApplication() != null : !getApplication().equals(updateCardModel_.getApplication())) {
            return false;
        }
        if ((getEventSubject() == null) != (updateCardModel_.getEventSubject() == null)) {
            return false;
        }
        return (getThemeManager() == null) == (updateCardModel_.getThemeManager() == null);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder eventSubject(C11370b c11370b) {
        return eventSubject((C11370b<AppClick>) c11370b);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    protected int getDefaultLayout() {
        return C1138R.layout.apps_update_app_item;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public int hashCode() {
        return (((((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getApplication() != null ? getApplication().hashCode() : 0)) * 31) + (getEventSubject() != null ? 1 : 0)) * 31) + (getThemeManager() == null ? 0 : 1);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder onBind(InterfaceC5113f0 interfaceC5113f0) {
        return onBind((InterfaceC5113f0<UpdateCardModel_, UpdateCardModel.CardHolder>) interfaceC5113f0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder onUnbind(InterfaceC5117h0 interfaceC5117h0) {
        return onUnbind((InterfaceC5117h0<UpdateCardModel_, UpdateCardModel.CardHolder>) interfaceC5117h0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder onVisibilityChanged(InterfaceC5119i0 interfaceC5119i0) {
        return onVisibilityChanged((InterfaceC5119i0<UpdateCardModel_, UpdateCardModel.CardHolder>) interfaceC5119i0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public /* bridge */ /* synthetic */ UpdateCardModelBuilder onVisibilityStateChanged(InterfaceC5121j0 interfaceC5121j0) {
        return onVisibilityStateChanged((InterfaceC5121j0<UpdateCardModel_, UpdateCardModel.CardHolder>) interfaceC5121j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public String toString() {
        return "UpdateCardModel_{application=" + getApplication() + ", eventSubject=" + getEventSubject() + ", themeManager=" + getThemeManager() + "}" + super.toString();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ application(UpdateApp updateApp) {
        onMutation();
        super.setApplication(updateApp);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.AbstractC5142t
    public UpdateCardModel.CardHolder createNewHolder() {
        return new UpdateCardModel.CardHolder();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ eventSubject(C11370b<AppClick> c11370b) {
        onMutation();
        super.setEventSubject(c11370b);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePostBind(UpdateCardModel.CardHolder cardHolder, int i2) {
        InterfaceC5113f0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5113f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5113f0 != null) {
            interfaceC5113f0.m9291a(this, cardHolder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePreBind(C5143u c5143u, UpdateCardModel.CardHolder cardHolder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public UpdateCardModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ onBind(InterfaceC5113f0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5113f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5113f0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ onUnbind(InterfaceC5117h0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5117h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5117h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public UpdateCardModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setApplication(null);
        super.setEventSubject(null);
        super.setThemeManager(null);
        super.reset();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ themeManager(ThemeManager themeManager) {
        onMutation();
        super.setThemeManager(themeManager);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public UpdateCardModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public UpdateCardModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public UpdateCardModel_ spanSizeOverride(AbstractC5141s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void unbind(UpdateCardModel.CardHolder cardHolder) {
        super.unbind((UpdateCardModel_) cardHolder);
        InterfaceC5117h0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5117h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5117h0 != null) {
            interfaceC5117h0.m9296a(this, cardHolder);
        }
    }

    public UpdateApp application() {
        return super.getApplication();
    }

    public C11370b<AppClick> eventSubject() {
        return super.getEventSubject();
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, UpdateCardModel.CardHolder cardHolder) {
        InterfaceC5119i0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5119i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5119i0 != null) {
            interfaceC5119i0.m9298a(this, cardHolder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityStateChanged(int i2, UpdateCardModel.CardHolder cardHolder) {
        InterfaceC5121j0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5121j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5121j0 != null) {
            interfaceC5121j0.m9300a(this, cardHolder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) cardHolder);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public UpdateCardModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public ThemeManager themeManager() {
        return super.getThemeManager();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ onVisibilityChanged(InterfaceC5119i0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5119i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5119i0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.UpdateCardModelBuilder
    public UpdateCardModel_ onVisibilityStateChanged(InterfaceC5121j0<UpdateCardModel_, UpdateCardModel.CardHolder> interfaceC5121j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5121j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8040id(long j2) {
        super.mo8040id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8045id(Number... numberArr) {
        super.mo8045id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8041id(long j2, long j3) {
        super.mo8041id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8042id(CharSequence charSequence) {
        super.mo8042id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8044id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo8044id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public UpdateCardModel_ mo8043id(CharSequence charSequence, long j2) {
        super.mo8043id(charSequence, j2);
        return this;
    }
}
