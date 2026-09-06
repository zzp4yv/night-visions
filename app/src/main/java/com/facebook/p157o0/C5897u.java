package com.facebook.p157o0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C5608a0;
import com.facebook.p157o0.p165q0.C5869g;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: AnalyticsUserIDStore.kt */
/* renamed from: com.facebook.o0.u */
/* loaded from: classes.dex */
public final class C5897u {

    /* renamed from: a */
    public static final C5897u f15488a = new C5897u();

    /* renamed from: b */
    private static final String f15489b = C5897u.class.getSimpleName();

    /* renamed from: c */
    private static final ReentrantReadWriteLock f15490c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static String f15491d;

    /* renamed from: e */
    private static volatile boolean f15492e;

    private C5897u() {
    }

    /* renamed from: a */
    public static final String m12770a() {
        if (!f15492e) {
            Log.w(f15489b, "initStore should have been called before calling setUserID");
            f15488a.m12771b();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f15490c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f15491d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            f15490c.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: b */
    private final void m12771b() {
        if (f15492e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f15490c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f15492e) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            C5608a0 c5608a0 = C5608a0.f14199a;
            f15491d = PreferenceManager.getDefaultSharedPreferences(C5608a0.m11284c()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f15492e = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f15490c.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public static final void m12772c() {
        if (f15492e) {
            return;
        }
        C5792g0.f14949a.m12250b().execute(new Runnable() { // from class: com.facebook.o0.b
            @Override // java.lang.Runnable
            public final void run() {
                C5897u.m12773d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m12773d() {
        f15488a.m12771b();
    }

    /* renamed from: g */
    public static final void m12776g(final String str) {
        C5869g c5869g = C5869g.f15370a;
        C5869g.m12625b();
        if (!f15492e) {
            Log.w(f15489b, "initStore should have been called before calling setUserID");
            f15488a.m12771b();
        }
        C5792g0.f14949a.m12250b().execute(new Runnable() { // from class: com.facebook.o0.a
            @Override // java.lang.Runnable
            public final void run() {
                C5897u.m12777h(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m12777h(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = f15490c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            f15491d = str;
            C5608a0 c5608a0 = C5608a0.f14199a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C5608a0.m11284c()).edit();
            edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", f15491d);
            edit.apply();
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f15490c.writeLock().unlock();
            throw th;
        }
    }
}
