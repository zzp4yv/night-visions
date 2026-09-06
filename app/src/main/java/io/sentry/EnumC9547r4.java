package io.sentry;

import io.sentry.clientreport.C9365b;
import io.sentry.protocol.C9532x;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryItemType.java */
@ApiStatus.Internal
/* renamed from: io.sentry.r4 */
/* loaded from: classes2.dex */
public enum EnumC9547r4 implements InterfaceC9545r2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    CheckIn("check_in"),
    Unknown("__unknown__");

    private final String itemType;

    /* compiled from: SentryItemType.java */
    /* renamed from: io.sentry.r4$a */
    static final class a implements InterfaceC9471l2<EnumC9547r4> {
        a() {
        }

        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC9547r4 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            return EnumC9547r4.valueOfLabel(c9485n2.m31881J().toLowerCase(Locale.ROOT));
        }
    }

    EnumC9547r4(String str) {
        this.itemType = str;
    }

    public static EnumC9547r4 resolve(Object obj) {
        return obj instanceof C9473l4 ? Event : obj instanceof C9532x ? Transaction : obj instanceof C9389d5 ? Session : obj instanceof C9365b ? ClientReport : Attachment;
    }

    public static EnumC9547r4 valueOfLabel(String str) {
        for (EnumC9547r4 enumC9547r4 : values()) {
            if (enumC9547r4.itemType.equals(str)) {
                return enumC9547r4;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30819b(this.itemType);
    }
}
