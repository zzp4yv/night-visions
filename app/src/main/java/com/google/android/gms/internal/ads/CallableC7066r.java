package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: com.google.android.gms.internal.ads.r */
/* loaded from: classes2.dex */
final class CallableC7066r<T> implements Callable<T> {

    /* renamed from: f */
    private final /* synthetic */ zzacj f20417f;

    /* renamed from: g */
    private final /* synthetic */ zzacr f20418g;

    CallableC7066r(zzacr zzacrVar, zzacj zzacjVar) {
        this.f20418g = zzacrVar;
        this.f20417f = zzacjVar;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        SharedPreferences sharedPreferences;
        zzacj zzacjVar = this.f20417f;
        sharedPreferences = this.f20418g.f21588j;
        return (T) zzacjVar.mo15498h(sharedPreferences);
    }
}
