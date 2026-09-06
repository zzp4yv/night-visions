package cm.aptoide.p092pt.install;

import cm.aptoide.p092pt.install.installer.InstallationState;
import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface Installer {
    void dispatchInstallations();

    C11183b downgrade(String str, boolean z, boolean z2);

    C11186e<InstallationState> getState(String str, int i2);

    C11183b install(String str, boolean z, boolean z2);

    void stopDispatching();

    C11183b uninstall(String str);

    C11183b update(String str, boolean z, boolean z2);
}
