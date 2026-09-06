package cm.aptoide.p092pt.preferences;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.preferences.Preferences;
import p456rx.AbstractC11197j;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p474t.C11381e;

/* loaded from: classes.dex */
public class Preferences {
    private final SharedPreferences preferences;

    /* renamed from: cm.aptoide.pt.preferences.Preferences$1 */
    class C37461 implements C11186e.a<Void> {
        final /* synthetic */ String val$key;

        C37461(String str) {
            this.val$key = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$call$0, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m8400a(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            Preferences.this.preferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }

        @Override // p456rx.p460m.InterfaceC11205b
        public void call(final AbstractC11197j<? super Void> abstractC11197j) {
            final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: cm.aptoide.pt.preferences.Preferences.1.1
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    if (abstractC11197j.isUnsubscribed() || !str.equals(C37461.this.val$key)) {
                        return;
                    }
                    abstractC11197j.onNext(null);
                }
            };
            abstractC11197j.add(C11381e.m40674a(new InterfaceC11204a() { // from class: cm.aptoide.pt.preferences.d
                @Override // p456rx.p460m.InterfaceC11204a
                public final void call() {
                    Preferences.C37461.this.m8400a(onSharedPreferenceChangeListener);
                }
            }));
            Preferences.this.preferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public Preferences(SharedPreferences sharedPreferences) {
        this.preferences = sharedPreferences;
    }

    private C11186e<Void> change(String str) {
        return C11186e.m40048l(new C37461(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getBoolean$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8393a(String str, boolean z, Void r3) {
        return Boolean.valueOf(this.preferences.getBoolean(str, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getInt$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Integer m8394b(String str, int i2, Void r3) {
        return Integer.valueOf(this.preferences.getInt(str, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getString$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m8395c(String str, String str2, Void r3) {
        return this.preferences.getString(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8396d(String str) {
        this.preferences.edit().remove(str).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8397e(String str, boolean z) {
        this.preferences.edit().putBoolean(str, z).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8398f(String str, String str2) {
        this.preferences.edit().putString(str, str2).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8399g(String str, int i2) {
        this.preferences.edit().putInt(str, i2).commit();
    }

    public Single<Boolean> contains(String str) {
        return Single.m39913m(Boolean.valueOf(this.preferences.contains(str)));
    }

    public C11186e<Boolean> getBoolean(final String str, final boolean z) {
        return change(str).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.preferences.f
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return Preferences.this.m8393a(str, z, (Void) obj);
            }
        }).m40054C0(Boolean.valueOf(this.preferences.getBoolean(str, z)));
    }

    public C11186e<Integer> getInt(final String str, final int i2) {
        return change(str).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.preferences.j
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return Preferences.this.m8394b(str, i2, (Void) obj);
            }
        }).m40054C0(Integer.valueOf(this.preferences.getInt(str, i2)));
    }

    public C11186e<String> getString(final String str, final String str2) {
        return change(str).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.preferences.k
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return Preferences.this.m8395c(str, str2, (Void) obj);
            }
        }).m40054C0(this.preferences.getString(str, str2));
    }

    public C11183b remove(final String str) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.preferences.i
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                Preferences.this.m8396d(str);
            }
        });
    }

    public C11183b save(final String str, final boolean z) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.preferences.e
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                Preferences.this.m8397e(str, z);
            }
        });
    }

    public C11183b save(final String str, final String str2) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.preferences.g
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                Preferences.this.m8398f(str, str2);
            }
        });
    }

    public C11183b save(final String str, final int i2) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.preferences.h
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                Preferences.this.m8399g(str, i2);
            }
        });
    }
}
