package cm.aptoide.p092pt.view.fragment;

import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import com.trello.rxlifecycle.C8724c;
import com.trello.rxlifecycle.InterfaceC8723b;
import com.trello.rxlifecycle.p234g.EnumC8729b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class BaseDialogView extends BaseDialogFragment implements View {

    /* renamed from: cm.aptoide.pt.view.fragment.BaseDialogView$1 */
    static /* synthetic */ class C47881 {
        static final /* synthetic */ int[] $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent;

        static {
            int[] iArr = new int[EnumC8729b.values().length];
            $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent = iArr;
            try {
                iArr[EnumC8729b.ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8729b.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8729b.CREATE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8729b.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8729b.RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8729b.PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8729b.STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8729b.DESTROY_VIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8729b.DETACH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[EnumC8729b.DESTROY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToEvent, reason: merged with bridge method [inline-methods] */
    public C11186e<View.LifecycleEvent> m8991d(EnumC8729b enumC8729b) {
        switch (C47881.$SwitchMap$com$trello$rxlifecycle$android$FragmentEvent[enumC8729b.ordinal()]) {
            case 1:
            case 2:
                return C11186e.m40016B();
            case 3:
                return C11186e.m40025S(View.LifecycleEvent.CREATE);
            case 4:
                return C11186e.m40025S(View.LifecycleEvent.START);
            case 5:
                return C11186e.m40025S(View.LifecycleEvent.RESUME);
            case 6:
                return C11186e.m40025S(View.LifecycleEvent.PAUSE);
            case 7:
                return C11186e.m40025S(View.LifecycleEvent.STOP);
            case 8:
                return C11186e.m40025S(View.LifecycleEvent.DESTROY);
            case 9:
            case 10:
                return C11186e.m40016B();
            default:
                throw new IllegalStateException("Unrecognized event: " + enumC8729b.name());
        }
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public void attachPresenter(Presenter presenter) {
        presenter.present();
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public final <T> InterfaceC8723b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return C8724c.m27898b(getLifecycleEvent(), lifecycleEvent);
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public C11186e<View.LifecycleEvent> getLifecycleEvent() {
        return lifecycle().m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.fragment.b
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return BaseDialogView.this.m8991d((EnumC8729b) obj);
            }
        });
    }
}
