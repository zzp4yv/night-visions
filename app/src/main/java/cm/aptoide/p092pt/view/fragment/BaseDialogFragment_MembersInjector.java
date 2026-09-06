package cm.aptoide.p092pt.view.fragment;

import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.InterfaceC9020a;

/* loaded from: classes.dex */
public final class BaseDialogFragment_MembersInjector implements InterfaceC9020a<BaseDialogFragment> {
    private final Provider<ThemeManager> themeManagerProvider;

    public BaseDialogFragment_MembersInjector(Provider<ThemeManager> provider) {
        this.themeManagerProvider = provider;
    }

    public static InterfaceC9020a<BaseDialogFragment> create(Provider<ThemeManager> provider) {
        return new BaseDialogFragment_MembersInjector(provider);
    }

    public static void injectThemeManager(BaseDialogFragment baseDialogFragment, ThemeManager themeManager) {
        baseDialogFragment.themeManager = themeManager;
    }

    public void injectMembers(BaseDialogFragment baseDialogFragment) {
        injectThemeManager(baseDialogFragment, this.themeManagerProvider.get());
    }
}
