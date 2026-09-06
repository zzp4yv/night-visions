package cm.aptoide.p092pt.install;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.crashreports.CrashReport;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class CheckRootOnBoot extends BroadcastReceiver {
    private static final String HTC_BOOT_COMPLETED = "android.intent.action.QUICKBOOT_POWERON";
    private CrashReport crashReport;

    static /* synthetic */ void lambda$onReceive$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onReceive$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8204a(Throwable th) {
        this.crashReport.log(th);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.crashReport = CrashReport.getInstance();
        if (intent != null) {
            if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED") || intent.getAction().equals("android.intent.action.REBOOT") || intent.getAction().equals(HTC_BOOT_COMPLETED)) {
                ((AptoideApplication) context.getApplicationContext()).getRootAvailabilityManager().updateRootAvailability().m39967K(Schedulers.computation()).m39965I(new InterfaceC11204a() { // from class: cm.aptoide.pt.install.p
                    @Override // p456rx.p460m.InterfaceC11204a
                    public final void call() {
                        CheckRootOnBoot.lambda$onReceive$0();
                    }
                }, new InterfaceC11205b() { // from class: cm.aptoide.pt.install.q
                    @Override // p456rx.p460m.InterfaceC11205b
                    public final void call(Object obj) {
                        CheckRootOnBoot.this.m8204a((Throwable) obj);
                    }
                });
            }
        }
    }
}
