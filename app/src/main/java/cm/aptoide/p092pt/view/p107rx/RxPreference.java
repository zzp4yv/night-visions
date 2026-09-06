package cm.aptoide.p092pt.view.p107rx;

import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import p241e.p294g.p295a.p296a.C8925b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public class RxPreference {
    private RxPreference() {
        throw new AssertionError("No instances.");
    }

    public static C11186e<Boolean> checks(CheckBoxPreference checkBoxPreference) {
        C8925b.m28554a(checkBoxPreference, "preference == null");
        return C11186e.m40048l(new PreferenceOnCheckOnSubscribe(checkBoxPreference));
    }

    public static C11186e<Preference> clicks(Preference preference) {
        C8925b.m28554a(preference, "preference == null");
        return C11186e.m40048l(new PreferenceClickOnSubscribe(preference));
    }
}
