package cm.aptoide.p092pt.presenter;

import com.trello.rxlifecycle.InterfaceC8723b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface View {

    public enum LifecycleEvent {
        CREATE,
        START,
        RESUME,
        PAUSE,
        STOP,
        DESTROY
    }

    void attachPresenter(Presenter presenter);

    <T> InterfaceC8723b<T> bindUntilEvent(LifecycleEvent lifecycleEvent);

    C11186e<LifecycleEvent> getLifecycleEvent();
}
