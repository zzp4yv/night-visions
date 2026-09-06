package com.airbnb.epoxy;

import java.util.List;

/* loaded from: classes.dex */
public class SimpleEpoxyController extends AbstractC5128n {
    private List<? extends AbstractC5141s<?>> currentModels;
    private boolean insideSetModels;

    @Override // com.airbnb.epoxy.AbstractC5128n
    protected final void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("You cannot call `buildModels` directly. Call `setModels` instead.");
        }
        add(this.currentModels);
    }

    @Override // com.airbnb.epoxy.AbstractC5128n
    public final void requestModelBuild() {
        if (!this.insideSetModels) {
            throw new IllegalEpoxyUsage("You cannot call `requestModelBuild` directly. Call `setModels` instead.");
        }
        super.requestModelBuild();
    }

    public void setModels(List<? extends AbstractC5141s<?>> list) {
        this.currentModels = list;
        this.insideSetModels = true;
        requestModelBuild();
        this.insideSetModels = false;
    }
}
