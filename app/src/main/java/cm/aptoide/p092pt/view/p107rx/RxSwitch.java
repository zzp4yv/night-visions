package cm.aptoide.p092pt.view.p107rx;

import androidx.appcompat.widget.SwitchCompat;
import p241e.p294g.p295a.p296a.C8925b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public class RxSwitch {
    private RxSwitch() {
        throw new AssertionError("No instances.");
    }

    public static C11186e<Boolean> checks(SwitchCompat switchCompat) {
        C8925b.m28554a(switchCompat, "switchCompat == null");
        return C11186e.m40048l(new SwitchOnCheckOnSubscribe(switchCompat));
    }
}
