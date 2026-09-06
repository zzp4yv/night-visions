package com.bumptech.glide.p138m;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p138m.InterfaceC5501c;
import com.bumptech.glide.p145r.C5563j;

/* compiled from: DefaultConnectivityMonitor.java */
/* renamed from: com.bumptech.glide.m.e */
/* loaded from: classes.dex */
final class C5503e implements InterfaceC5501c {

    /* renamed from: f */
    private final Context f13858f;

    /* renamed from: g */
    final InterfaceC5501c.a f13859g;

    /* renamed from: h */
    boolean f13860h;

    /* renamed from: i */
    private boolean f13861i;

    /* renamed from: j */
    private final BroadcastReceiver f13862j = new a();

    /* compiled from: DefaultConnectivityMonitor.java */
    /* renamed from: com.bumptech.glide.m.e$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C5503e c5503e = C5503e.this;
            boolean z = c5503e.f13860h;
            c5503e.f13860h = c5503e.m10791a(context);
            if (z != C5503e.this.f13860h) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C5503e.this.f13860h);
                }
                C5503e c5503e2 = C5503e.this;
                c5503e2.f13859g.mo10048a(c5503e2.f13860h);
            }
        }
    }

    C5503e(Context context, InterfaceC5501c.a aVar) {
        this.f13858f = context.getApplicationContext();
        this.f13859g = aVar;
    }

    /* renamed from: b */
    private void m10789b() {
        if (this.f13861i) {
            return;
        }
        this.f13860h = m10791a(this.f13858f);
        try {
            this.f13858f.registerReceiver(this.f13862j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f13861i = true;
        } catch (SecurityException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e2);
            }
        }
    }

    /* renamed from: c */
    private void m10790c() {
        if (this.f13861i) {
            this.f13858f.unregisterReceiver(this.f13862j);
            this.f13861i = false;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    boolean m10791a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) C5563j.m11042d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onStart() {
        m10789b();
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onStop() {
        m10790c();
    }
}
