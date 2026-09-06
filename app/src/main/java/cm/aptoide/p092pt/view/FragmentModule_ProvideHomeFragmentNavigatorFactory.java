package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import java.util.Map;
import javax.inject.Provider;
import p241e.p294g.p306b.C8953a;
import p317f.p318b.C9022b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideHomeFragmentNavigatorFactory implements Provider {
    private final Provider<Map<Integer, Result>> fragmentResultMapProvider;
    private final Provider<C8953a<Map<Integer, Result>>> fragmentResultRelayProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideHomeFragmentNavigatorFactory(FragmentModule fragmentModule, Provider<Map<Integer, Result>> provider, Provider<C8953a<Map<Integer, Result>>> provider2) {
        this.module = fragmentModule;
        this.fragmentResultMapProvider = provider;
        this.fragmentResultRelayProvider = provider2;
    }

    public static FragmentModule_ProvideHomeFragmentNavigatorFactory create(FragmentModule fragmentModule, Provider<Map<Integer, Result>> provider, Provider<C8953a<Map<Integer, Result>>> provider2) {
        return new FragmentModule_ProvideHomeFragmentNavigatorFactory(fragmentModule, provider, provider2);
    }

    public static FragmentNavigator provideHomeFragmentNavigator(FragmentModule fragmentModule, Map<Integer, Result> map, C8953a<Map<Integer, Result>> c8953a) {
        return (FragmentNavigator) C9022b.m29112c(fragmentModule.provideHomeFragmentNavigator(map, c8953a));
    }

    @Override // javax.inject.Provider
    public FragmentNavigator get() {
        return provideHomeFragmentNavigator(this.module, this.fragmentResultMapProvider.get(), this.fragmentResultRelayProvider.get());
    }
}
