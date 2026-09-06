package cm.aptoide.p092pt.apkfy;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.preferences.secure.SecurePreferences;
import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: ApkFyParser.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
@DebugMetadata(m39049c = "cm.aptoide.pt.apkfy.ApkFyParser$run$1", m39050f = "ApkFyParser.kt", m39051l = {30}, m39052m = "invokeSuspend")
/* loaded from: classes.dex */
final class ApkFyParser$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10742u>, Object> {
    int label;
    final /* synthetic */ ApkFyParser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApkFyParser$run$1(ApkFyParser apkFyParser, Continuation<? super ApkFyParser$run$1> continuation) {
        super(2, continuation);
        this.this$0 = apkFyParser;
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
        return new ApkFyParser$run$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10742u> continuation) {
        return ((ApkFyParser$run$1) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m39045c;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        ApkfyManager apkfyManager;
        m39045c = C10822d.m39045c();
        int i2 = this.label;
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (i2 == 0) {
            C10535o.m37655b(obj);
            sharedPreferences = this.this$0.securePreferences;
            String string = sharedPreferences.getString(ApkFyParser.MMP_GUEST_UID, HttpUrl.FRAGMENT_ENCODE_SET);
            boolean z = false;
            boolean z2 = !(string == null || string.length() == 0);
            sharedPreferences2 = this.this$0.securePreferences;
            if (SecurePreferences.shouldRunApkFy(sharedPreferences2) && !z2) {
                z = true;
            }
            if (z) {
                apkfyManager = this.this$0.apkfyManager;
                this.label = 1;
                obj = apkfyManager.getApkfy(this);
                if (obj == m39045c) {
                    return m39045c;
                }
            }
            return C10742u.f41439a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C10535o.m37655b(obj);
        ApkfyModel apkfyModel = (ApkfyModel) obj;
        this.this$0.saveGuestUID(apkfyModel.getGuestUid());
        this.this$0.updateApkfy(apkfyModel);
        this.this$0.setApkfyUtmProperties(apkfyModel);
        return C10742u.f41439a;
    }
}
