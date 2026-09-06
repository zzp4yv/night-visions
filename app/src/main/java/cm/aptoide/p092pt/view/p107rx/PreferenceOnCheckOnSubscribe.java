package cm.aptoide.p092pt.view.p107rx;

import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* loaded from: classes.dex */
class PreferenceOnCheckOnSubscribe implements C11186e.a<Boolean> {
    private final CheckBoxPreference preference;

    public PreferenceOnCheckOnSubscribe(CheckBoxPreference checkBoxPreference) {
        this.preference = checkBoxPreference;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(final AbstractC11197j<? super Boolean> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        Preference.InterfaceC0544d interfaceC0544d = new Preference.InterfaceC0544d() { // from class: cm.aptoide.pt.view.rx.PreferenceOnCheckOnSubscribe.1
            @Override // androidx.preference.Preference.InterfaceC0544d
            public boolean onPreferenceClick(Preference preference) {
                if (!abstractC11197j.isUnsubscribed()) {
                    abstractC11197j.onNext(Boolean.valueOf(((CheckBoxPreference) preference).m4090Z0()));
                }
                return true;
            }
        };
        abstractC11197j.add(new AbstractC11199a() { // from class: cm.aptoide.pt.view.rx.PreferenceOnCheckOnSubscribe.2
            @Override // p456rx.p457l.AbstractC11199a
            protected void onUnsubscribe() {
                PreferenceOnCheckOnSubscribe.this.preference.m4006N0(null);
            }
        });
        this.preference.m4006N0(interfaceC0544d);
    }
}
