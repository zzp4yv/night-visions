package cm.aptoide.p092pt.view.p107rx;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* loaded from: classes.dex */
class SwitchOnCheckOnSubscribe implements C11186e.a<Boolean> {
    private final SwitchCompat switchCompat;

    public SwitchOnCheckOnSubscribe(SwitchCompat switchCompat) {
        this.switchCompat = switchCompat;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(final AbstractC11197j<? super Boolean> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: cm.aptoide.pt.view.rx.SwitchOnCheckOnSubscribe.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (abstractC11197j.isUnsubscribed()) {
                    return;
                }
                abstractC11197j.onNext(Boolean.valueOf(z));
            }
        };
        abstractC11197j.add(new AbstractC11199a() { // from class: cm.aptoide.pt.view.rx.SwitchOnCheckOnSubscribe.2
            @Override // p456rx.p457l.AbstractC11199a
            protected void onUnsubscribe() {
                SwitchOnCheckOnSubscribe.this.switchCompat.setOnCheckedChangeListener(null);
            }
        });
        this.switchCompat.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
