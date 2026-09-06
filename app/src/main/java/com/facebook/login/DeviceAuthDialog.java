package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.account.AndroidAccountManagerPersistence;
import com.facebook.AccessToken;
import com.facebook.AsyncTaskC5610b0;
import com.facebook.C5608a0;
import com.facebook.C5620d0;
import com.facebook.EnumC5622e0;
import com.facebook.EnumC5923w;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.C5615b;
import com.facebook.common.C5616c;
import com.facebook.common.C5617d;
import com.facebook.common.C5618e;
import com.facebook.internal.C5637c0;
import com.facebook.internal.C5639d0;
import com.facebook.internal.C5663p0;
import com.facebook.internal.C5665q0;
import com.facebook.internal.EnumC5661o0;
import com.facebook.login.LoginClient;
import com.facebook.p157o0.C5792g0;
import com.facebook.p170p0.p171a.C5914a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeviceAuthDialog.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 D2\u00020\u0001:\u0003jklB\u0007¢\u0006\u0004\bi\u0010\u0017J-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"H\u0015¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0014¢\u0006\u0004\b-\u0010\u0017J\u000f\u0010.\u001a\u00020\"H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u0010\u0017J\u000f\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u0010\u0017JC\u0010>\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u001d2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001d2\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010=\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b>\u0010?J)\u0010B\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\b\u0010=\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bB\u0010CJ;\u0010D\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u001d2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u001d2\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010=\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010VR\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010]R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010[R\u0016\u0010d\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010`R\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006m"}, m32267d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/u;", "onDismiss", "(Landroid/content/DialogInterface;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onDestroyView", "()V", "Lcom/facebook/login/LoginClient$Request;", "request", "E", "(Lcom/facebook/login/LoginClient$Request;)V", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "e", "()Ljava/util/Map;", "g", "()Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "isSmartLogin", "j", "(Z)Landroid/view/View;", HttpUrl.FRAGMENT_ENCODE_SET, "h", "(Z)I", "Lcom/facebook/FacebookException;", "ex", "u", "(Lcom/facebook/FacebookException;)V", "t", "s", "()Z", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "currentRequestState", "D", "(Lcom/facebook/login/DeviceAuthDialog$RequestState;)V", "x", "B", AndroidAccountManagerPersistence.ACCOUNT_ID, "Lcom/facebook/login/DeviceAuthDialog$b;", "permissions", "accessToken", "name", "Ljava/util/Date;", "expirationTime", "dataAccessExpirationTime", "y", "(Ljava/lang/String;Lcom/facebook/login/DeviceAuthDialog$b;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", HttpUrl.FRAGMENT_ENCODE_SET, "expiresIn", "v", "(Ljava/lang/String;JLjava/lang/Long;)V", "f", "(Ljava/lang/String;Lcom/facebook/login/DeviceAuthDialog$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "n", "Ljava/util/concurrent/atomic/AtomicBoolean;", "completed", "Ljava/util/concurrent/ScheduledFuture;", "p", "Ljava/util/concurrent/ScheduledFuture;", "scheduledPoll", "Lcom/facebook/GraphRequest;", "i", "()Lcom/facebook/GraphRequest;", "pollRequest", "Lcom/facebook/login/DeviceAuthMethodHandler;", "m", "Lcom/facebook/login/DeviceAuthMethodHandler;", "deviceAuthMethodHandler", "Landroid/view/View;", "progressBar", "q", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "r", "Z", "isBeingDestroyed", "Lcom/facebook/login/LoginClient$Request;", "Landroid/widget/TextView;", "l", "Landroid/widget/TextView;", "instructions", "isRetry", "k", "confirmationCode", "Lcom/facebook/b0;", "o", "Lcom/facebook/b0;", "currentGraphRequestPoll", "<init>", "a", "b", "RequestState", "facebook-common_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DeviceAuthDialog extends DialogInterfaceOnCancelListenerC0466c {

    /* renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g */
    private static final String f14676g = "device/login";

    /* renamed from: h */
    private static final String f14677h = "device/login_status";

    /* renamed from: i */
    private static final int f14678i = 1349174;

    /* renamed from: j, reason: from kotlin metadata */
    private View progressBar;

    /* renamed from: k, reason: from kotlin metadata */
    private TextView confirmationCode;

    /* renamed from: l, reason: from kotlin metadata */
    private TextView instructions;

    /* renamed from: m, reason: from kotlin metadata */
    private DeviceAuthMethodHandler deviceAuthMethodHandler;

    /* renamed from: n, reason: from kotlin metadata */
    private final AtomicBoolean completed = new AtomicBoolean();

    /* renamed from: o, reason: from kotlin metadata */
    private volatile AsyncTaskC5610b0 currentGraphRequestPoll;

    /* renamed from: p, reason: from kotlin metadata */
    private volatile ScheduledFuture<?> scheduledPoll;

    /* renamed from: q, reason: from kotlin metadata */
    private volatile RequestState currentRequestState;

    /* renamed from: r, reason: from kotlin metadata */
    private boolean isBeingDestroyed;

    /* renamed from: s, reason: from kotlin metadata */
    private boolean isRetry;

    /* renamed from: t, reason: from kotlin metadata */
    private LoginClient.Request request;

    /* compiled from: DeviceAuthDialog.kt */
    private static final class RequestState implements Parcelable {

        /* renamed from: g */
        private String f14691g;

        /* renamed from: h */
        private String f14692h;

        /* renamed from: i */
        private String f14693i;

        /* renamed from: j */
        private long f14694j;

        /* renamed from: k */
        private long f14695k;

        /* renamed from: f */
        public static final C5717b f14690f = new C5717b(null);
        public static final Parcelable.Creator<RequestState> CREATOR = new C5716a();

        /* compiled from: DeviceAuthDialog.kt */
        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        public static final class C5716a implements Parcelable.Creator<RequestState> {
            C5716a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(Parcel parcel) {
                C9768m.m32346f(parcel, "parcel");
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int i2) {
                return new RequestState[i2];
            }
        }

        /* compiled from: DeviceAuthDialog.kt */
        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$b */
        public static final class C5717b {
            private C5717b() {
            }

            public /* synthetic */ C5717b(C9756g c9756g) {
                this();
            }
        }

        public RequestState() {
        }

        /* renamed from: a */
        public final String m11886a() {
            return this.f14691g;
        }

        /* renamed from: b */
        public final long m11887b() {
            return this.f14694j;
        }

        /* renamed from: c */
        public final String m11888c() {
            return this.f14693i;
        }

        /* renamed from: d */
        public final String m11889d() {
            return this.f14692h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final void m11890e(long j2) {
            this.f14694j = j2;
        }

        /* renamed from: f */
        public final void m11891f(long j2) {
            this.f14695k = j2;
        }

        /* renamed from: g */
        public final void m11892g(String str) {
            this.f14693i = str;
        }

        /* renamed from: h */
        public final void m11893h(String str) {
            this.f14692h = str;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            C9768m.m32345e(format, "java.lang.String.format(locale, format, *args)");
            this.f14691g = format;
        }

        /* renamed from: i */
        public final boolean m11894i() {
            return this.f14695k != 0 && (new Date().getTime() - this.f14695k) - (this.f14694j * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            C9768m.m32346f(parcel, "dest");
            parcel.writeString(this.f14691g);
            parcel.writeString(this.f14692h);
            parcel.writeString(this.f14693i);
            parcel.writeLong(this.f14694j);
            parcel.writeLong(this.f14695k);
        }

        protected RequestState(Parcel parcel) {
            C9768m.m32346f(parcel, "parcel");
            this.f14691g = parcel.readString();
            this.f14692h = parcel.readString();
            this.f14693i = parcel.readString();
            this.f14694j = parcel.readLong();
            this.f14695k = parcel.readLong();
        }
    }

    /* compiled from: DeviceAuthDialog.kt */
    /* renamed from: com.facebook.login.DeviceAuthDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C9756g c9756g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final C5719b m11898b(JSONObject jSONObject) throws JSONException {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    String optString2 = optJSONObject.optString("permission");
                    C9768m.m32345e(optString2, "permission");
                    if (!(optString2.length() == 0) && !C9768m.m32341a(optString2, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(optString2);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(optString2);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(optString2);
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return new C5719b(arrayList, arrayList2, arrayList3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeviceAuthDialog.kt */
    /* renamed from: com.facebook.login.DeviceAuthDialog$b */
    static final class C5719b {

        /* renamed from: a */
        private List<String> f14696a;

        /* renamed from: b */
        private List<String> f14697b;

        /* renamed from: c */
        private List<String> f14698c;

        public C5719b(List<String> list, List<String> list2, List<String> list3) {
            C9768m.m32346f(list, "grantedPermissions");
            C9768m.m32346f(list2, "declinedPermissions");
            C9768m.m32346f(list3, "expiredPermissions");
            this.f14696a = list;
            this.f14697b = list2;
            this.f14698c = list3;
        }

        /* renamed from: a */
        public final List<String> m11899a() {
            return this.f14697b;
        }

        /* renamed from: b */
        public final List<String> m11900b() {
            return this.f14698c;
        }

        /* renamed from: c */
        public final List<String> m11901c() {
            return this.f14696a;
        }
    }

    /* compiled from: DeviceAuthDialog.kt */
    /* renamed from: com.facebook.login.DeviceAuthDialog$c */
    public static final class DialogC5720c extends Dialog {
        DialogC5720c(ActivityC0468d activityC0468d, int i2) {
            super(activityC0468d, i2);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (DeviceAuthDialog.this.m11883s()) {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m11857A(DeviceAuthDialog deviceAuthDialog, DialogInterface dialogInterface, int i2) {
        C9768m.m32346f(deviceAuthDialog, "this$0");
        View m11882j = deviceAuthDialog.m11882j(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(m11882j);
        }
        LoginClient.Request request = deviceAuthDialog.request;
        if (request == null) {
            return;
        }
        deviceAuthDialog.m11878E(request);
    }

    /* renamed from: B */
    private final void m11858B() {
        RequestState requestState = this.currentRequestState;
        Long valueOf = requestState == null ? null : Long.valueOf(requestState.m11887b());
        if (valueOf != null) {
            this.scheduledPoll = DeviceAuthMethodHandler.f14700i.m11911a().schedule(new Runnable() { // from class: com.facebook.login.h
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.m11859C(DeviceAuthDialog.this);
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m11859C(DeviceAuthDialog deviceAuthDialog) {
        C9768m.m32346f(deviceAuthDialog, "this$0");
        deviceAuthDialog.m11875x();
    }

    /* renamed from: D */
    private final void m11860D(RequestState currentRequestState) {
        this.currentRequestState = currentRequestState;
        TextView textView = this.confirmationCode;
        if (textView == null) {
            C9768m.m32363w("confirmationCode");
            throw null;
        }
        textView.setText(currentRequestState.m11889d());
        C5914a c5914a = C5914a.f15554a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), C5914a.m12878c(currentRequestState.m11886a()));
        TextView textView2 = this.instructions;
        if (textView2 == null) {
            C9768m.m32363w("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            C9768m.m32363w("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.progressBar;
        if (view == null) {
            C9768m.m32363w("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.isRetry && C5914a.m12881f(currentRequestState.m11889d())) {
            new C5792g0(getContext()).m12244f("fb_smart_login_service");
        }
        if (currentRequestState.m11894i()) {
            m11858B();
        } else {
            m11875x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m11861F(DeviceAuthDialog deviceAuthDialog, C5620d0 c5620d0) {
        C9768m.m32346f(deviceAuthDialog, "this$0");
        C9768m.m32346f(c5620d0, "response");
        if (deviceAuthDialog.isBeingDestroyed) {
            return;
        }
        if (c5620d0.m11338b() != null) {
            FacebookRequestError m11338b = c5620d0.m11338b();
            FacebookException m11143e = m11338b == null ? null : m11338b.m11143e();
            if (m11143e == null) {
                m11143e = new FacebookException();
            }
            deviceAuthDialog.m11885u(m11143e);
            return;
        }
        JSONObject m11339c = c5620d0.m11339c();
        if (m11339c == null) {
            m11339c = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.m11893h(m11339c.getString("user_code"));
            requestState.m11892g(m11339c.getString("code"));
            requestState.m11890e(m11339c.getLong("interval"));
            deviceAuthDialog.m11860D(requestState);
        } catch (JSONException e2) {
            deviceAuthDialog.m11885u(new FacebookException(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m11862d(DeviceAuthDialog deviceAuthDialog, C5620d0 c5620d0) {
        C9768m.m32346f(deviceAuthDialog, "this$0");
        C9768m.m32346f(c5620d0, "response");
        if (deviceAuthDialog.completed.get()) {
            return;
        }
        FacebookRequestError m11338b = c5620d0.m11338b();
        if (m11338b == null) {
            try {
                JSONObject m11339c = c5620d0.m11339c();
                if (m11339c == null) {
                    m11339c = new JSONObject();
                }
                String string = m11339c.getString("access_token");
                C9768m.m32345e(string, "resultObject.getString(\"access_token\")");
                deviceAuthDialog.m11873v(string, m11339c.getLong("expires_in"), Long.valueOf(m11339c.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e2) {
                deviceAuthDialog.m11885u(new FacebookException(e2));
                return;
            }
        }
        int m11145g = m11338b.m11145g();
        boolean z = true;
        if (m11145g != f14678i && m11145g != 1349172) {
            z = false;
        }
        if (z) {
            deviceAuthDialog.m11858B();
            return;
        }
        if (m11145g != 1349152) {
            if (m11145g == 1349173) {
                deviceAuthDialog.m11884t();
                return;
            }
            FacebookRequestError m11338b2 = c5620d0.m11338b();
            FacebookException m11143e = m11338b2 == null ? null : m11338b2.m11143e();
            if (m11143e == null) {
                m11143e = new FacebookException();
            }
            deviceAuthDialog.m11885u(m11143e);
            return;
        }
        RequestState requestState = deviceAuthDialog.currentRequestState;
        if (requestState != null) {
            C5914a c5914a = C5914a.f15554a;
            C5914a.m12876a(requestState.m11889d());
        }
        LoginClient.Request request = deviceAuthDialog.request;
        if (request != null) {
            deviceAuthDialog.m11878E(request);
        } else {
            deviceAuthDialog.m11884t();
        }
    }

    /* renamed from: f */
    private final void m11863f(String userId, C5719b permissions, String accessToken, Date expirationTime, Date dataAccessExpirationTime) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler != null) {
            C5608a0 c5608a0 = C5608a0.f14199a;
            deviceAuthMethodHandler.m11908u(accessToken, C5608a0.m11285d(), userId, permissions.m11901c(), permissions.m11899a(), permissions.m11900b(), EnumC5923w.DEVICE_AUTH, expirationTime, null, dataAccessExpirationTime);
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    /* renamed from: i */
    private final GraphRequest m11864i() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.currentRequestState;
        bundle.putString("code", requestState == null ? null : requestState.m11888c());
        bundle.putString("access_token", m11880g());
        return GraphRequest.f14159a.m11223B(null, f14677h, bundle, new GraphRequest.InterfaceC5598b() { // from class: com.facebook.login.d
            @Override // com.facebook.GraphRequest.InterfaceC5598b
            /* renamed from: b */
            public final void mo11196b(C5620d0 c5620d0) {
                DeviceAuthDialog.m11862d(DeviceAuthDialog.this, c5620d0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m11865k(DeviceAuthDialog deviceAuthDialog, View view) {
        C9768m.m32346f(deviceAuthDialog, "this$0");
        deviceAuthDialog.m11884t();
    }

    /* renamed from: v */
    private final void m11873v(final String accessToken, long expiresIn, Long dataAccessExpirationTime) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = expiresIn != 0 ? new Date(new Date().getTime() + (expiresIn * 1000)) : null;
        if ((dataAccessExpirationTime == null || dataAccessExpirationTime.longValue() != 0) && dataAccessExpirationTime != null) {
            date = new Date(dataAccessExpirationTime.longValue() * 1000);
        }
        C5608a0 c5608a0 = C5608a0.f14199a;
        GraphRequest m11236x = GraphRequest.f14159a.m11236x(new AccessToken(accessToken, C5608a0.m11285d(), "0", null, null, null, null, date2, null, date, null, 1024, null), "me", new GraphRequest.InterfaceC5598b() { // from class: com.facebook.login.b
            @Override // com.facebook.GraphRequest.InterfaceC5598b
            /* renamed from: b */
            public final void mo11196b(C5620d0 c5620d0) {
                DeviceAuthDialog.m11874w(DeviceAuthDialog.this, accessToken, date2, date, c5620d0);
            }
        });
        m11236x.m11176G(EnumC5622e0.GET);
        m11236x.m11177H(bundle);
        m11236x.m11180k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m11874w(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2, C5620d0 c5620d0) {
        EnumSet<EnumC5661o0> m11408l;
        C9768m.m32346f(deviceAuthDialog, "this$0");
        C9768m.m32346f(str, "$accessToken");
        C9768m.m32346f(c5620d0, "response");
        if (deviceAuthDialog.completed.get()) {
            return;
        }
        FacebookRequestError m11338b = c5620d0.m11338b();
        if (m11338b != null) {
            FacebookException m11143e = m11338b.m11143e();
            if (m11143e == null) {
                m11143e = new FacebookException();
            }
            deviceAuthDialog.m11885u(m11143e);
            return;
        }
        try {
            JSONObject m11339c = c5620d0.m11339c();
            if (m11339c == null) {
                m11339c = new JSONObject();
            }
            String string = m11339c.getString(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
            C9768m.m32345e(string, "jsonObject.getString(\"id\")");
            C5719b m11898b = INSTANCE.m11898b(m11339c);
            String string2 = m11339c.getString("name");
            C9768m.m32345e(string2, "jsonObject.getString(\"name\")");
            RequestState requestState = deviceAuthDialog.currentRequestState;
            if (requestState != null) {
                C5914a c5914a = C5914a.f15554a;
                C5914a.m12876a(requestState.m11889d());
            }
            C5639d0 c5639d0 = C5639d0.f14392a;
            C5608a0 c5608a0 = C5608a0.f14199a;
            C5637c0 m11417c = C5639d0.m11417c(C5608a0.m11285d());
            Boolean bool = null;
            if (m11417c != null && (m11408l = m11417c.m11408l()) != null) {
                bool = Boolean.valueOf(m11408l.contains(EnumC5661o0.RequireConfirm));
            }
            if (!C9768m.m32341a(bool, Boolean.TRUE) || deviceAuthDialog.isRetry) {
                deviceAuthDialog.m11863f(string, m11898b, str, date, date2);
            } else {
                deviceAuthDialog.isRetry = true;
                deviceAuthDialog.m11876y(string, m11898b, str, string2, date, date2);
            }
        } catch (JSONException e2) {
            deviceAuthDialog.m11885u(new FacebookException(e2));
        }
    }

    /* renamed from: x */
    private final void m11875x() {
        RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.m11891f(new Date().getTime());
        }
        this.currentGraphRequestPoll = m11864i().m11180k();
    }

    /* renamed from: y */
    private final void m11876y(final String userId, final C5719b permissions, final String accessToken, String name, final Date expirationTime, final Date dataAccessExpirationTime) {
        String string = getResources().getString(C5617d.f14264g);
        C9768m.m32345e(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = getResources().getString(C5617d.f14263f);
        C9768m.m32345e(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = getResources().getString(C5617d.f14262e);
        C9768m.m32345e(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{name}, 1));
        C9768m.m32345e(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: com.facebook.login.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DeviceAuthDialog.m11877z(DeviceAuthDialog.this, userId, permissions, accessToken, expirationTime, dataAccessExpirationTime, dialogInterface, i2);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DeviceAuthDialog.m11857A(DeviceAuthDialog.this, dialogInterface, i2);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m11877z(DeviceAuthDialog deviceAuthDialog, String str, C5719b c5719b, String str2, Date date, Date date2, DialogInterface dialogInterface, int i2) {
        C9768m.m32346f(deviceAuthDialog, "this$0");
        C9768m.m32346f(str, "$userId");
        C9768m.m32346f(c5719b, "$permissions");
        C9768m.m32346f(str2, "$accessToken");
        deviceAuthDialog.m11863f(str, c5719b, str2, date, date2);
    }

    /* renamed from: E */
    public void m11878E(LoginClient.Request request) {
        C9768m.m32346f(request, "request");
        this.request = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.m11967n()));
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5663p0.m11589q0(bundle, "redirect_uri", request.m11962i());
        C5663p0.m11589q0(bundle, "target_user_id", request.m11961h());
        bundle.putString("access_token", m11880g());
        C5914a c5914a = C5914a.f15554a;
        Map<String, String> m11879e = m11879e();
        bundle.putString("device_info", C5914a.m12879d(m11879e == null ? null : C10777q0.m38809u(m11879e)));
        GraphRequest.f14159a.m11223B(null, f14676g, bundle, new GraphRequest.InterfaceC5598b() { // from class: com.facebook.login.c
            @Override // com.facebook.GraphRequest.InterfaceC5598b
            /* renamed from: b */
            public final void mo11196b(C5620d0 c5620d0) {
                DeviceAuthDialog.m11861F(DeviceAuthDialog.this, c5620d0);
            }
        }).m11180k();
    }

    /* renamed from: e */
    public Map<String, String> m11879e() {
        return null;
    }

    /* renamed from: g */
    public String m11880g() {
        StringBuilder sb = new StringBuilder();
        C5665q0 c5665q0 = C5665q0.f14500a;
        sb.append(C5665q0.m11634b());
        sb.append('|');
        sb.append(C5665q0.m11635c());
        return sb.toString();
    }

    /* renamed from: h */
    protected int m11881h(boolean isSmartLogin) {
        return isSmartLogin ? C5616c.f14257d : C5616c.f14255b;
    }

    /* renamed from: j */
    protected View m11882j(boolean isSmartLogin) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        C9768m.m32345e(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(m11881h(isSmartLogin), (ViewGroup) null);
        C9768m.m32345e(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(C5615b.f14253f);
        C9768m.m32345e(findViewById, "view.findViewById(R.id.progress_bar)");
        this.progressBar = findViewById;
        View findViewById2 = inflate.findViewById(C5615b.f14252e);
        if (findViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.confirmationCode = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C5615b.f14248a);
        if (findViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceAuthDialog.m11865k(DeviceAuthDialog.this, view);
            }
        });
        View findViewById4 = inflate.findViewById(C5615b.f14249b);
        if (findViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) findViewById4;
        this.instructions = textView;
        if (textView != null) {
            textView.setText(Html.fromHtml(getString(C5617d.f14258a)));
            return inflate;
        }
        C9768m.m32363w("instructions");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DialogC5720c dialogC5720c = new DialogC5720c(requireActivity(), C5618e.f14266b);
        C5914a c5914a = C5914a.f15554a;
        dialogC5720c.setContentView(m11882j(C5914a.m12880e() && !this.isRetry));
        return dialogC5720c;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RequestState requestState;
        LoginClient m12082i;
        C9768m.m32346f(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        C5769v c5769v = (C5769v) ((FacebookActivity) requireActivity()).getCurrentFragment();
        LoginMethodHandler loginMethodHandler = null;
        if (c5769v != null && (m12082i = c5769v.m12082i()) != null) {
            loginMethodHandler = m12082i.m11941j();
        }
        this.deviceAuthMethodHandler = (DeviceAuthMethodHandler) loginMethodHandler;
        if (savedInstanceState != null && (requestState = (RequestState) savedInstanceState.getParcelable("request_state")) != null) {
            m11860D(requestState);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        AsyncTaskC5610b0 asyncTaskC5610b0 = this.currentGraphRequestPoll;
        if (asyncTaskC5610b0 != null) {
            asyncTaskC5610b0.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.scheduledPoll;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        C9768m.m32346f(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.isBeingDestroyed) {
            return;
        }
        m11884t();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        C9768m.m32346f(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.currentRequestState != null) {
            outState.putParcelable("request_state", this.currentRequestState);
        }
    }

    /* renamed from: s */
    protected boolean m11883s() {
        return true;
    }

    /* renamed from: t */
    protected void m11884t() {
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                C5914a c5914a = C5914a.f15554a;
                C5914a.m12876a(requestState.m11889d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.m11906s();
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* renamed from: u */
    protected void m11885u(FacebookException ex) {
        C9768m.m32346f(ex, "ex");
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                C5914a c5914a = C5914a.f15554a;
                C5914a.m12876a(requestState.m11889d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.m11907t(ex);
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }
}
