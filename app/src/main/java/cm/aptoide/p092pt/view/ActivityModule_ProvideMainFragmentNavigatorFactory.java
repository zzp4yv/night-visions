package cm.aptoide.p092pt.view;

import androidx.fragment.app.FragmentManager;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import java.util.Map;
import javax.inject.Provider;
import p241e.p294g.p306b.C8953a;
import p317f.p318b.C9022b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvideMainFragmentNavigatorFactory implements Provider {
    private final Provider<FragmentManager> fragmentManagerProvider;
    private final Provider<Map<Integer, Result>> fragmentResultMapProvider;
    private final Provider<C8953a<Map<Integer, Result>>> fragmentResultRelayProvider;
    private final ActivityModule module;

    public ActivityModule_ProvideMainFragmentNavigatorFactory(ActivityModule activityModule, Provider<Map<Integer, Result>> provider, Provider<C8953a<Map<Integer, Result>>> provider2, Provider<FragmentManager> provider3) {
        this.module = activityModule;
        this.fragmentResultMapProvider = provider;
        this.fragmentResultRelayProvider = provider2;
        this.fragmentManagerProvider = provider3;
    }

    public static ActivityModule_ProvideMainFragmentNavigatorFactory create(ActivityModule activityModule, Provider<Map<Integer, Result>> provider, Provider<C8953a<Map<Integer, Result>>> provider2, Provider<FragmentManager> provider3) {
        return new ActivityModule_ProvideMainFragmentNavigatorFactory(activityModule, provider, provider2, provider3);
    }

    public static FragmentNavigator provideMainFragmentNavigator(ActivityModule activityModule, Map<Integer, Result> map, C8953a<Map<Integer, Result>> c8953a, FragmentManager fragmentManager) {
        return (FragmentNavigator) C9022b.m29112c(activityModule.provideMainFragmentNavigator(map, c8953a, fragmentManager));
    }

    @Override // javax.inject.Provider
    public FragmentNavigator get() {
        return provideMainFragmentNavigator(this.module, this.fragmentResultMapProvider.get(), this.fragmentResultRelayProvider.get(), this.fragmentManagerProvider.get());
    }
}
