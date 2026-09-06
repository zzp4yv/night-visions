package cm.aptoide.p092pt.abtesting;

import cm.aptoide.p092pt.abtesting.BaseExperiment;
import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface AbTestRepository {
    C11183b cacheExperiment(ExperimentModel experimentModel, String str);

    C11186e<Experiment> getExperiment(String str, BaseExperiment.ExperimentType experimentType);

    C11186e<String> getExperimentId(String str);

    C11186e<Boolean> recordAction(String str, int i2, BaseExperiment.ExperimentType experimentType);

    C11186e<Boolean> recordAction(String str, BaseExperiment.ExperimentType experimentType);

    C11186e<Boolean> recordImpression(String str, BaseExperiment.ExperimentType experimentType);
}
