package cm.aptoide.p092pt.home.apps.list.models;

import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.home.apps.list.models.TitleModel;
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
public class TitleModel_ extends TitleModel implements InterfaceC5144v<TitleModel.Holder>, TitleModelBuilder {
    private InterfaceC5113f0<TitleModel_, TitleModel.Holder> onModelBoundListener_epoxyGeneratedModel;
    private InterfaceC5117h0<TitleModel_, TitleModel.Holder> onModelUnboundListener_epoxyGeneratedModel;
    private InterfaceC5119i0<TitleModel_, TitleModel.Holder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private InterfaceC5121j0<TitleModel_, TitleModel.Holder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

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
        if (!(obj instanceof TitleModel_) || !super.equals(obj)) {
            return false;
        }
        TitleModel_ titleModel_ = (TitleModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (titleModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (titleModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (titleModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (titleModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if (getTitle() == null ? titleModel_.getTitle() != null : !getTitle().equals(titleModel_.getTitle())) {
            return false;
        }
        if (getShouldShowButton() != titleModel_.getShouldShowButton()) {
            return false;
        }
        return (getEventSubject() == null) == (titleModel_.getEventSubject() == null);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder eventSubject(C11370b c11370b) {
        return eventSubject((C11370b<Void>) c11370b);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    protected int getDefaultLayout() {
        return C1138R.layout.apps_header_item;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public int hashCode() {
        return (((((((((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (getTitle() != null ? getTitle().hashCode() : 0)) * 31) + (getShouldShowButton() ? 1 : 0)) * 31) + (getEventSubject() == null ? 0 : 1);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder onBind(InterfaceC5113f0 interfaceC5113f0) {
        return onBind((InterfaceC5113f0<TitleModel_, TitleModel.Holder>) interfaceC5113f0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder onUnbind(InterfaceC5117h0 interfaceC5117h0) {
        return onUnbind((InterfaceC5117h0<TitleModel_, TitleModel.Holder>) interfaceC5117h0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder onVisibilityChanged(InterfaceC5119i0 interfaceC5119i0) {
        return onVisibilityChanged((InterfaceC5119i0<TitleModel_, TitleModel.Holder>) interfaceC5119i0);
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public /* bridge */ /* synthetic */ TitleModelBuilder onVisibilityStateChanged(InterfaceC5121j0 interfaceC5121j0) {
        return onVisibilityStateChanged((InterfaceC5121j0<TitleModel_, TitleModel.Holder>) interfaceC5121j0);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public String toString() {
        return "TitleModel_{title=" + getTitle() + ", shouldShowButton=" + getShouldShowButton() + ", eventSubject=" + getEventSubject() + "}" + super.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.AbstractC5142t
    public TitleModel.Holder createNewHolder() {
        return new TitleModel.Holder();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ eventSubject(C11370b<Void> c11370b) {
        onMutation();
        super.setEventSubject(c11370b);
        return this;
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePostBind(TitleModel.Holder holder, int i2) {
        InterfaceC5113f0<TitleModel_, TitleModel.Holder> interfaceC5113f0 = this.onModelBoundListener_epoxyGeneratedModel;
        if (interfaceC5113f0 != null) {
            interfaceC5113f0.m9291a(this, holder, i2);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.InterfaceC5144v
    public void handlePreBind(C5143u c5143u, TitleModel.Holder holder, int i2) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public TitleModel_ hide() {
        super.hide();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ onBind(InterfaceC5113f0<TitleModel_, TitleModel.Holder> interfaceC5113f0) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = interfaceC5113f0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ onUnbind(InterfaceC5117h0<TitleModel_, TitleModel.Holder> interfaceC5117h0) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = interfaceC5117h0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public TitleModel_ reset() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.setTitle(null);
        super.setShouldShowButton(false);
        super.setEventSubject(null);
        super.reset();
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ shouldShowButton(boolean z) {
        onMutation();
        super.setShouldShowButton(z);
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ title(Integer num) {
        onMutation();
        super.setTitle(num);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public TitleModel_ layout(int i2) {
        super.layout(i2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public TitleModel_ show() {
        super.show();
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    public TitleModel_ spanSizeOverride(AbstractC5141s.c cVar) {
        super.spanSizeOverride(cVar);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void unbind(TitleModel.Holder holder) {
        super.unbind((TitleModel_) holder);
        InterfaceC5117h0<TitleModel_, TitleModel.Holder> interfaceC5117h0 = this.onModelUnboundListener_epoxyGeneratedModel;
        if (interfaceC5117h0 != null) {
            interfaceC5117h0.m9296a(this, holder);
        }
    }

    public C11370b<Void> eventSubject() {
        return super.getEventSubject();
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityChanged(float f2, float f3, int i2, int i3, TitleModel.Holder holder) {
        InterfaceC5119i0<TitleModel_, TitleModel.Holder> interfaceC5119i0 = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (interfaceC5119i0 != null) {
            interfaceC5119i0.m9298a(this, holder, f2, f3, i2, i3);
        }
        super.onVisibilityChanged(f2, f3, i2, i3, (int) holder);
    }

    @Override // com.airbnb.epoxy.AbstractC5142t, com.airbnb.epoxy.AbstractC5141s
    public void onVisibilityStateChanged(int i2, TitleModel.Holder holder) {
        InterfaceC5121j0<TitleModel_, TitleModel.Holder> interfaceC5121j0 = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (interfaceC5121j0 != null) {
            interfaceC5121j0.m9300a(this, holder, i2);
        }
        super.onVisibilityStateChanged(i2, (int) holder);
    }

    public boolean shouldShowButton() {
        return super.getShouldShowButton();
    }

    @Override // com.airbnb.epoxy.AbstractC5141s
    public TitleModel_ show(boolean z) {
        super.show(z);
        return this;
    }

    public Integer title() {
        return super.getTitle();
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ onVisibilityChanged(InterfaceC5119i0<TitleModel_, TitleModel.Holder> interfaceC5119i0) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = interfaceC5119i0;
        return this;
    }

    @Override // cm.aptoide.p092pt.home.apps.list.models.TitleModelBuilder
    public TitleModel_ onVisibilityStateChanged(InterfaceC5121j0<TitleModel_, TitleModel.Holder> interfaceC5121j0) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = interfaceC5121j0;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8031id(long j2) {
        super.mo8031id(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8036id(Number... numberArr) {
        super.mo8036id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8032id(long j2, long j3) {
        super.mo8032id(j2, j3);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8033id(CharSequence charSequence) {
        super.mo8033id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8035id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo8035id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC5141s, cm.aptoide.aptoideviews.filters.ClearFiltersModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public TitleModel_ mo8034id(CharSequence charSequence, long j2) {
        super.mo8034id(charSequence, j2);
        return this;
    }
}
