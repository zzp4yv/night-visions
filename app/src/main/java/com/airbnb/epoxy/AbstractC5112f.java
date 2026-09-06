package com.airbnb.epoxy;

import com.airbnb.epoxy.AbstractC5128n;
import java.util.List;

/* compiled from: ControllerHelper.java */
/* renamed from: com.airbnb.epoxy.f */
/* loaded from: classes.dex */
public abstract class AbstractC5112f<T extends AbstractC5128n> {
    public abstract void resetAutoModels();

    protected void setControllerToStageTo(AbstractC5141s<?> abstractC5141s, T t) {
        abstractC5141s.controllerToStageTo = t;
    }

    protected void validateModelHashCodesHaveNotChanged(T t) {
        List<AbstractC5141s<?>> m9319D = t.getAdapter().m9319D();
        for (int i2 = 0; i2 < m9319D.size(); i2++) {
            m9319D.get(i2).validateStateHasNotChangedSinceAdded("Model has changed since it was added to the controller.", i2);
        }
    }
}
