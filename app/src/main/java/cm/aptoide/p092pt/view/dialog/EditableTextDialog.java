package cm.aptoide.p092pt.view.dialog;

import android.content.DialogInterface;
import android.widget.EditText;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class EditableTextDialog implements DialogInterface {
    private final RxAlertDialog dialog;
    private final EditText editText;

    public EditableTextDialog(RxAlertDialog rxAlertDialog, EditText editText) {
        this.dialog = rxAlertDialog;
        this.editText = editText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$positiveClicks$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ CharSequence m8983a(DialogInterface dialogInterface) {
        return this.editText.getText();
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        this.dialog.cancel();
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        this.dialog.dismiss();
    }

    public C11186e<DialogInterface> negativeClicks() {
        return this.dialog.negativeClicks();
    }

    public C11186e<CharSequence> positiveClicks() {
        return this.dialog.positiveClicks().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.dialog.o
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return EditableTextDialog.this.m8983a((DialogInterface) obj);
            }
        });
    }

    protected void setText(String str) {
        this.editText.setText(str);
    }

    public void show() {
        this.dialog.show();
    }
}
