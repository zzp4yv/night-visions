package cm.aptoide.p092pt.preferences;

import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class LocalPersistenceAdultContent {
    private static final String ADULT_CONTENT_PIN_PREFERENCES_KEY = "Maturepin";
    private static final String ADULT_CONTENT_PREFERENCES_KEY = "matureChkBox";
    private final Preferences preferences;
    private final SecurePreferences securePreferences;

    public LocalPersistenceAdultContent(Preferences preferences, SecurePreferences securePreferences) {
        this.preferences = preferences;
        this.securePreferences = securePreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$enable$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8391a(int i2, Integer num) {
        return num.equals(Integer.valueOf(i2)) ? enable() : C11183b.m39951s(new SecurityException("Pin does not match."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removePin$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8392b(int i2, Integer num) {
        return num.equals(Integer.valueOf(i2)) ? this.securePreferences.remove(ADULT_CONTENT_PIN_PREFERENCES_KEY) : C11183b.m39951s(new SecurityException("Pin does not match."));
    }

    public C11183b disable() {
        return this.preferences.save(ADULT_CONTENT_PREFERENCES_KEY, false);
    }

    public C11183b enable() {
        return this.preferences.save(ADULT_CONTENT_PREFERENCES_KEY, true);
    }

    public C11186e<Boolean> enabled() {
        return this.preferences.getBoolean(ADULT_CONTENT_PREFERENCES_KEY, false);
    }

    public C11186e<Boolean> pinRequired() {
        return this.securePreferences.getInt(ADULT_CONTENT_PIN_PREFERENCES_KEY, -1).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.preferences.c
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.intValue() != -1);
                return valueOf;
            }
        });
    }

    public C11183b removePin(final int i2) {
        return this.securePreferences.getInt(ADULT_CONTENT_PIN_PREFERENCES_KEY, -1).m40057E().m40085Z0().m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.preferences.b
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return LocalPersistenceAdultContent.this.m8392b(i2, (Integer) obj);
            }
        });
    }

    public C11183b requirePin(int i2) {
        return this.securePreferences.save(ADULT_CONTENT_PIN_PREFERENCES_KEY, i2);
    }

    public C11183b enable(final int i2) {
        return this.securePreferences.getInt(ADULT_CONTENT_PIN_PREFERENCES_KEY, -1).m40057E().m40085Z0().m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.preferences.a
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return LocalPersistenceAdultContent.this.m8391a(i2, (Integer) obj);
            }
        });
    }
}
