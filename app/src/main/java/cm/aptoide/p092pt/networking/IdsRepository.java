package cm.aptoide.p092pt.networking;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import cm.aptoide.p092pt.dataprovider.ads.AdNetworkUtils;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.utils.AptoideUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.security.SecureRandom;
import java.util.UUID;
import okhttp3.HttpUrl;
import p456rx.Single;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class IdsRepository {
    private static final String ADVERTISING_ID_CLIENT = "advertisingIdClient";
    private static final String ANDROID_ID_CLIENT = "androidId";
    private static final String APTOIDE_CLIENT_UUID = "aptoide_client_uuid";
    private static final String GOOGLE_ADVERTISING_ID_CLIENT = "googleAdvertisingId";
    private static final String GOOGLE_ADVERTISING_ID_CLIENT_SET = "googleAdvertisingIdSet";
    private static final String TAG = "IdsRepository";
    private final String androidId;
    private final Context context;
    private final SharedPreferences sharedPreferences;

    public IdsRepository(SharedPreferences sharedPreferences, Context context, String str) {
        this.sharedPreferences = sharedPreferences;
        this.context = context;
        this.androidId = str;
    }

    private String generateRandomAdvertisingId() {
        byte[] bArr = new byte[16];
        String str = this.androidId;
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(str.hashCode());
        secureRandom.nextBytes(bArr);
        return UUID.nameUUIDFromBytes(bArr).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdvertisingId$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m8295a(String str) {
        return !TextUtils.isEmpty(str) ? str : generateRandomAdvertisingId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdvertisingId$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8296b(String str, String str2) {
        this.sharedPreferences.edit().putString(ADVERTISING_ID_CLIENT, str).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getGoogleAdvertisingId$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m8297c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (AptoideUtils.ThreadU.isUiThread()) {
            throw new IllegalStateException("You cannot run this method from the main thread");
        }
        if (!AdNetworkUtils.isGooglePlayServicesAvailable(this.context)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.context).getId();
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getGoogleAdvertisingId$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8298d(String str) {
        if (str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return;
        }
        this.sharedPreferences.edit().putString(GOOGLE_ADVERTISING_ID_CLIENT, str).apply();
        this.sharedPreferences.edit().putBoolean(GOOGLE_ADVERTISING_ID_CLIENT_SET, true).apply();
    }

    static /* synthetic */ String lambda$getUniqueIdentifier$0(String str) {
        return !TextUtils.isEmpty(str) ? str : UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getUniqueIdentifier$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8299e(String str) {
        this.sharedPreferences.edit().putString(APTOIDE_CLIENT_UUID, str).apply();
    }

    public synchronized Single<String> getAdvertisingId() {
        final String string = this.sharedPreferences.getString(ADVERTISING_ID_CLIENT, null);
        if (TextUtils.isEmpty(string)) {
            return getGoogleAdvertisingId().m39923n(new InterfaceC11208e() { // from class: cm.aptoide.pt.networking.n
                @Override // p456rx.p460m.InterfaceC11208e
                public final Object call(Object obj) {
                    return IdsRepository.this.m8295a((String) obj);
                }
            }).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.networking.j
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    IdsRepository.this.m8296b(string, (String) obj);
                }
            });
        }
        return Single.m39913m(string);
    }

    public synchronized String getAndroidId() {
        String string = this.sharedPreferences.getString(ANDROID_ID_CLIENT, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String str = this.androidId;
        if (this.sharedPreferences.getString(ANDROID_ID_CLIENT, null) != null) {
            throw new RuntimeException("Android ID already set!");
        }
        this.sharedPreferences.edit().putString(ANDROID_ID_CLIENT, str).apply();
        return str;
    }

    public synchronized Single<String> getGoogleAdvertisingId() {
        return Single.m39913m(this.sharedPreferences.getString(GOOGLE_ADVERTISING_ID_CLIENT, null)).m39923n(new InterfaceC11208e() { // from class: cm.aptoide.pt.networking.m
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return IdsRepository.this.m8297c((String) obj);
            }
        }).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.networking.i
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                IdsRepository.this.m8298d((String) obj);
            }
        }).m39930v(Schedulers.newThread());
    }

    public synchronized Single<String> getUniqueIdentifier() {
        String string = this.sharedPreferences.getString(APTOIDE_CLIENT_UUID, null);
        if (TextUtils.isEmpty(string)) {
            return getGoogleAdvertisingId().m39923n(new InterfaceC11208e() { // from class: cm.aptoide.pt.networking.k
                @Override // p456rx.p460m.InterfaceC11208e
                public final Object call(Object obj) {
                    return IdsRepository.lambda$getUniqueIdentifier$0((String) obj);
                }
            }).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.networking.l
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    IdsRepository.this.m8299e((String) obj);
                }
            });
        }
        Logger.getInstance().m8283v(TAG, "getUniqueIdentifier: in sharedPreferences: " + string);
        return Single.m39913m(string);
    }
}
