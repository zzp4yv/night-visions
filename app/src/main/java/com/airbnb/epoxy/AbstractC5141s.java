package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.AbstractC5128n;
import java.util.List;

/* compiled from: EpoxyModel.java */
/* renamed from: com.airbnb.epoxy.s */
/* loaded from: classes.dex */
public abstract class AbstractC5141s<T> {
    private static long idCounter = -1;
    boolean addedToAdapter;
    AbstractC5128n controllerToStageTo;
    private boolean currentlyInInterceptors;
    private AbstractC5128n firstControllerAddedTo;
    private boolean hasDefaultId;
    private int hashCodeWhenAdded;

    /* renamed from: id */
    private long f12297id;
    private int layout;
    private boolean shown;
    private c spanSizeOverride;

    /* compiled from: EpoxyModel.java */
    /* renamed from: com.airbnb.epoxy.s$a */
    class a implements AbstractC5128n.f {
        a() {
        }

        @Override // com.airbnb.epoxy.AbstractC5128n.f
        /* renamed from: a */
        public void mo9316a(AbstractC5128n abstractC5128n) {
            AbstractC5141s.this.currentlyInInterceptors = true;
        }

        @Override // com.airbnb.epoxy.AbstractC5128n.f
        /* renamed from: b */
        public void mo9317b(AbstractC5128n abstractC5128n) {
            AbstractC5141s abstractC5141s = AbstractC5141s.this;
            abstractC5141s.hashCodeWhenAdded = abstractC5141s.hashCode();
            AbstractC5141s.this.currentlyInInterceptors = false;
        }
    }

    /* compiled from: EpoxyModel.java */
    /* renamed from: com.airbnb.epoxy.s$b */
    public interface b {
        /* renamed from: a */
        boolean m9360a();
    }

    /* compiled from: EpoxyModel.java */
    /* renamed from: com.airbnb.epoxy.s$c */
    public interface c {
        /* renamed from: a */
        int m9361a(int i2, int i3, int i4);
    }

    protected AbstractC5141s(long j2) {
        this.shown = true;
        mo6787id(j2);
    }

    private static int getPosition(AbstractC5128n abstractC5128n, AbstractC5141s<?> abstractC5141s) {
        return abstractC5128n.isBuildingModels() ? abstractC5128n.getFirstIndexOfModelInBuildingList(abstractC5141s) : abstractC5128n.getAdapter().m9320E(abstractC5141s);
    }

    public void addIf(boolean z, AbstractC5128n abstractC5128n) {
        if (z) {
            addTo(abstractC5128n);
            return;
        }
        AbstractC5128n abstractC5128n2 = this.controllerToStageTo;
        if (abstractC5128n2 != null) {
            abstractC5128n2.clearModelFromStaging(this);
            this.controllerToStageTo = null;
        }
    }

    public void addTo(AbstractC5128n abstractC5128n) {
        abstractC5128n.addInternal(this);
    }

    protected final void addWithDebugValidation(AbstractC5128n abstractC5128n) {
        if (abstractC5128n == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        }
        if (abstractC5128n.isModelAddedMultipleTimes(this)) {
            throw new IllegalEpoxyUsage("This model was already added to the controller at position " + abstractC5128n.getFirstIndexOfModelInBuildingList(this));
        }
        if (this.firstControllerAddedTo == null) {
            this.firstControllerAddedTo = abstractC5128n;
            this.hashCodeWhenAdded = hashCode();
            abstractC5128n.addAfterInterceptorCallback(new a());
        }
    }

    public void bind(T t) {
    }

    public void bind(T t, List<Object> list) {
        bind(t);
    }

    protected View buildView(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(getLayout(), viewGroup, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5141s)) {
            return false;
        }
        AbstractC5141s abstractC5141s = (AbstractC5141s) obj;
        return this.f12297id == abstractC5141s.f12297id && getViewType() == abstractC5141s.getViewType() && this.shown == abstractC5141s.shown;
    }

    protected abstract int getDefaultLayout();

    public final int getLayout() {
        int i2 = this.layout;
        return i2 == 0 ? getDefaultLayout() : i2;
    }

    public int getSpanSize(int i2, int i3, int i4) {
        return 1;
    }

    protected int getViewType() {
        return getLayout();
    }

    boolean hasDefaultId() {
        return this.hasDefaultId;
    }

    public int hashCode() {
        long j2 = this.f12297id;
        return (((((int) (j2 ^ (j2 >>> 32))) * 31) + getViewType()) * 31) + (this.shown ? 1 : 0);
    }

    public AbstractC5141s<T> hide() {
        return show(false);
    }

    /* renamed from: id */
    public long m9359id() {
        return this.f12297id;
    }

    boolean isDebugValidationEnabled() {
        return this.firstControllerAddedTo != null;
    }

    public boolean isShown() {
        return this.shown;
    }

    public AbstractC5141s<T> layout(int i2) {
        onMutation();
        this.layout = i2;
        return this;
    }

    public boolean onFailedToRecycleView(T t) {
        return false;
    }

    protected final void onMutation() {
        if (isDebugValidationEnabled() && !this.currentlyInInterceptors) {
            throw new C5148z(this, getPosition(this.firstControllerAddedTo, this));
        }
        AbstractC5128n abstractC5128n = this.controllerToStageTo;
        if (abstractC5128n != null) {
            abstractC5128n.setStagedModel(this);
        }
    }

    public void onViewAttachedToWindow(T t) {
    }

    public void onViewDetachedFromWindow(T t) {
    }

    public void onVisibilityChanged(float f2, float f3, int i2, int i3, T t) {
    }

    public void onVisibilityStateChanged(int i2, T t) {
    }

    public AbstractC5141s<T> reset() {
        onMutation();
        this.layout = 0;
        this.shown = true;
        return this;
    }

    public boolean shouldSaveViewState() {
        return false;
    }

    public AbstractC5141s<T> show() {
        return show(true);
    }

    public final int spanSize(int i2, int i3, int i4) {
        c cVar = this.spanSizeOverride;
        return cVar != null ? cVar.m9361a(i2, i3, i4) : getSpanSize(i2, i3, i4);
    }

    public AbstractC5141s<T> spanSizeOverride(c cVar) {
        this.spanSizeOverride = cVar;
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + "{id=" + this.f12297id + ", viewType=" + getViewType() + ", shown=" + this.shown + ", addedToAdapter=" + this.addedToAdapter + '}';
    }

    public void unbind(T t) {
    }

    protected final void validateStateHasNotChangedSinceAdded(String str, int i2) {
        if (isDebugValidationEnabled() && !this.currentlyInInterceptors && this.hashCodeWhenAdded != hashCode()) {
            throw new C5148z(this, str, i2);
        }
    }

    public void bind(T t, AbstractC5141s<?> abstractC5141s) {
        bind(t);
    }

    /* renamed from: id */
    public AbstractC5141s<T> mo6787id(long j2) {
        if ((this.addedToAdapter || this.firstControllerAddedTo != null) && j2 != this.f12297id) {
            throw new IllegalEpoxyUsage("Cannot change a model's id after it has been added to the adapter.");
        }
        this.hasDefaultId = false;
        this.f12297id = j2;
        return this;
    }

    public AbstractC5141s<T> show(boolean z) {
        onMutation();
        this.shown = z;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC5141s() {
        /*
            r4 = this;
            long r0 = com.airbnb.epoxy.AbstractC5141s.idCounter
            r2 = 1
            long r2 = r0 - r2
            com.airbnb.epoxy.AbstractC5141s.idCounter = r2
            r4.<init>(r0)
            r0 = 1
            r4.hasDefaultId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.AbstractC5141s.<init>():void");
    }

    public void addIf(b bVar, AbstractC5128n abstractC5128n) {
        addIf(bVar.m9360a(), abstractC5128n);
    }

    /* renamed from: id */
    public AbstractC5141s<T> mo6792id(Number... numberArr) {
        long j2 = 0;
        if (numberArr != null) {
            long j3 = 0;
            for (Number number : numberArr) {
                j3 = (j3 * 31) + C5147y.m9368a(number == null ? 0L : r6.hashCode());
            }
            j2 = j3;
        }
        return mo6787id(j2);
    }

    /* renamed from: id */
    public AbstractC5141s<T> mo6788id(long j2, long j3) {
        return mo6787id((C5147y.m9368a(j2) * 31) + C5147y.m9368a(j3));
    }

    /* renamed from: id */
    public AbstractC5141s<T> mo6789id(CharSequence charSequence) {
        mo6787id(C5147y.m9369b(charSequence));
        return this;
    }

    /* renamed from: id */
    public AbstractC5141s<T> mo6791id(CharSequence charSequence, CharSequence... charSequenceArr) {
        long m9369b = C5147y.m9369b(charSequence);
        if (charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                m9369b = (m9369b * 31) + C5147y.m9369b(charSequence2);
            }
        }
        return mo6787id(m9369b);
    }

    /* renamed from: id */
    public AbstractC5141s<T> mo6790id(CharSequence charSequence, long j2) {
        mo6787id((C5147y.m9369b(charSequence) * 31) + C5147y.m9368a(j2));
        return this;
    }
}
