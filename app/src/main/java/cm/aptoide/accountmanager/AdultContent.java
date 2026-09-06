package cm.aptoide.accountmanager;

import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface AdultContent {
    C11183b disable(boolean z);

    C11183b enable(int i2);

    C11183b enable(boolean z);

    C11186e<Boolean> enabled();

    C11186e<Boolean> pinRequired();

    C11183b removePin(int i2);

    C11183b requirePin(int i2);
}
