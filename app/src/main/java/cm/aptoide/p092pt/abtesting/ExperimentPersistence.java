package cm.aptoide.p092pt.abtesting;

import p456rx.C11183b;
import p456rx.Single;

/* loaded from: classes.dex */
public interface ExperimentPersistence {
    Single<ExperimentModel> get(String str);

    C11183b save(String str, Experiment experiment);
}
