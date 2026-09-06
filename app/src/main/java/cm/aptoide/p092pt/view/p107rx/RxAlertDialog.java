package cm.aptoide.p092pt.view.p107rx;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0066c;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import p241e.p294g.p306b.C8955c;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class RxAlertDialog implements DialogInterface {
    private final CancelEvent cancelEvent;
    private final DialogInterfaceC0066c dialog;
    private final DismissEvent dismissEvent;
    private final DialogClick negativeClick;
    private final DialogClick positiveClick;
    private final View view;

    public static class Builder {
        private final DialogInterfaceC0066c.a builder;
        private DialogClick negativeClick;
        private DialogClick positiveClick;
        private View view;

        public Builder(Context context, ThemeManager themeManager) {
            this.builder = new DialogInterfaceC0066c.a(new ContextThemeWrapper(context, themeManager.getAttributeForTheme(C1138R.attr.dialogsTheme).resourceId));
        }

        public RxAlertDialog build() {
            DialogInterfaceC0066c m244a = this.builder.m244a();
            CancelEvent cancelEvent = new CancelEvent(C8955c.m28593f1());
            DismissEvent dismissEvent = new DismissEvent(C8955c.m28593f1());
            m244a.setOnCancelListener(cancelEvent);
            m244a.setOnDismissListener(dismissEvent);
            return new RxAlertDialog(m244a, this.view, this.positiveClick, this.negativeClick, cancelEvent, dismissEvent);
        }

        public Builder setMessage(int i2) {
            this.builder.m252i(i2);
            return this;
        }

        public Builder setNegativeButton(int i2) {
            DialogClick dialogClick = new DialogClick(-2, C8955c.m28593f1());
            this.negativeClick = dialogClick;
            this.builder.m255l(i2, dialogClick);
            return this;
        }

        public Builder setPositiveButton(int i2) {
            DialogClick dialogClick = new DialogClick(-1, C8955c.m28593f1());
            this.positiveClick = dialogClick;
            this.builder.m260q(i2, dialogClick);
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i2) {
            this.builder.m263t(charSequenceArr, i2, null);
            return this;
        }

        public Builder setTitle(int i2) {
            this.builder.m264u(i2);
            return this;
        }

        public Builder setTitleSmall(int i2) {
            TextView textView = new TextView(this.builder.m245b());
            textView.setTextSize(12.0f);
            textView.setTextColor(textView.getResources().getColor(C1138R.color.secondary_text_color));
            textView.setText(i2);
            textView.setPaddingRelative((int) ((textView.getResources().getDisplayMetrics().density * 25.0f) + 0.5f), (int) ((textView.getResources().getDisplayMetrics().density * 20.0f) + 0.5f), 0, (int) ((textView.getResources().getDisplayMetrics().density * 10.0f) + 0.5f));
            this.builder.m248e(textView);
            return this;
        }

        public Builder setView(View view) {
            this.view = view;
            this.builder.m266w(view);
            return this;
        }
    }

    protected static class CancelEvent implements DialogInterface.OnCancelListener {
        private final C8955c<Void> subject;

        public CancelEvent(C8955c<Void> c8955c) {
            this.subject = c8955c;
        }

        public C11186e<Void> cancels() {
            return this.subject;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.subject.call(null);
        }
    }

    protected static class DialogClick implements DialogInterface.OnClickListener {
        private final C8955c<Void> subject;
        private final int which;

        public DialogClick(int i2, C8955c<Void> c8955c) {
            this.which = i2;
            this.subject = c8955c;
        }

        public C11186e<Void> clicks() {
            return this.subject;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (this.which == i2) {
                this.subject.call(null);
            }
        }
    }

    protected static class DismissEvent implements DialogInterface.OnDismissListener {
        private final C8955c<Void> subject;

        public DismissEvent(C8955c<Void> c8955c) {
            this.subject = c8955c;
        }

        public C11186e<Void> dismisses() {
            return this.subject;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.subject.call(null);
        }
    }

    public enum Result {
        CANCEL,
        DISMISS,
        POSITIVE,
        NEGATIVE
    }

    protected RxAlertDialog(DialogInterfaceC0066c dialogInterfaceC0066c, View view, DialogClick dialogClick, DialogClick dialogClick2, CancelEvent cancelEvent, DismissEvent dismissEvent) {
        this.dialog = dialogInterfaceC0066c;
        this.view = view;
        this.positiveClick = dialogClick;
        this.negativeClick = dialogClick2;
        this.cancelEvent = cancelEvent;
        this.dismissEvent = dismissEvent;
    }

    private /* synthetic */ DialogInterface lambda$cancels$2(Void r1) {
        return this;
    }

    private /* synthetic */ DialogInterface lambda$dismisses$3(Void r1) {
        return this;
    }

    private /* synthetic */ DialogInterface lambda$negativeClicks$1(Void r1) {
        return this;
    }

    private /* synthetic */ DialogInterface lambda$positiveClicks$0(Void r1) {
        return this;
    }

    /* renamed from: a */
    public /* synthetic */ DialogInterface m9006a(Void r1) {
        lambda$cancels$2(r1);
        return this;
    }

    /* renamed from: b */
    public /* synthetic */ DialogInterface m9007b(Void r1) {
        lambda$dismisses$3(r1);
        return this;
    }

    /* renamed from: c */
    public /* synthetic */ DialogInterface m9008c(Void r1) {
        lambda$negativeClicks$1(r1);
        return this;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        this.dialog.cancel();
    }

    public C11186e<DialogInterface> cancels() {
        return this.cancelEvent.cancels().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.rx.b
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RxAlertDialog rxAlertDialog = RxAlertDialog.this;
                rxAlertDialog.m9006a((Void) obj);
                return rxAlertDialog;
            }
        });
    }

    /* renamed from: d */
    public /* synthetic */ DialogInterface m9009d(Void r1) {
        lambda$positiveClicks$0(r1);
        return this;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        this.dialog.dismiss();
    }

    public C11186e<DialogInterface> dismisses() {
        return this.dismissEvent.dismisses().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.rx.g
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RxAlertDialog rxAlertDialog = RxAlertDialog.this;
                rxAlertDialog.m9007b((Void) obj);
                return rxAlertDialog;
            }
        });
    }

    public int getCheckedItem() {
        return this.dialog.m242f().getCheckedItemPosition();
    }

    public View getDialogView() {
        return this.view;
    }

    public boolean isShowing() {
        return this.dialog.isShowing();
    }

    public C11186e<DialogInterface> negativeClicks() {
        DialogClick dialogClick = this.negativeClick;
        return dialogClick != null ? dialogClick.clicks().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.rx.a
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RxAlertDialog rxAlertDialog = RxAlertDialog.this;
                rxAlertDialog.m9008c((Void) obj);
                return rxAlertDialog;
            }
        }) : C11186e.m40016B();
    }

    public C11186e<DialogInterface> positiveClicks() {
        DialogClick dialogClick = this.positiveClick;
        return dialogClick != null ? dialogClick.clicks().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.rx.f
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RxAlertDialog rxAlertDialog = RxAlertDialog.this;
                rxAlertDialog.m9009d((Void) obj);
                return rxAlertDialog;
            }
        }) : C11186e.m40016B();
    }

    public void show() {
        this.dialog.show();
    }

    public Single<Result> showWithResult() {
        final DialogInterfaceC0066c dialogInterfaceC0066c = this.dialog;
        dialogInterfaceC0066c.getClass();
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.view.rx.i
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                DialogInterfaceC0066c.this.show();
            }
        }).m39974b(C11186e.m40037c0(this.cancelEvent.cancels().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.rx.d
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RxAlertDialog.Result result;
                result = RxAlertDialog.Result.CANCEL;
                return result;
            }
        }), this.dismissEvent.dismisses().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.rx.h
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RxAlertDialog.Result result;
                result = RxAlertDialog.Result.DISMISS;
                return result;
            }
        }), this.positiveClick.clicks().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.rx.e
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RxAlertDialog.Result result;
                result = RxAlertDialog.Result.POSITIVE;
                return result;
            }
        }), this.negativeClick.clicks().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.rx.c
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RxAlertDialog.Result result;
                result = RxAlertDialog.Result.NEGATIVE;
                return result;
            }
        }))).m40057E().m40085Z0();
    }
}
