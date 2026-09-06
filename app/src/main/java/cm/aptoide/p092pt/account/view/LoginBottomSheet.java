package cm.aptoide.p092pt.account.view;

import p456rx.C11186e;

/* loaded from: classes.dex */
public interface LoginBottomSheet {

    public enum State {
        EXPANDED,
        COLLAPSED
    }

    void collapse();

    void expand();

    C11186e<State> state();
}
