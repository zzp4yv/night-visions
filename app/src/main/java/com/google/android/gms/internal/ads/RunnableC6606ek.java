package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.ads.ek */
/* loaded from: classes2.dex */
final class RunnableC6606ek implements Runnable {
    private RunnableC6606ek() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            MessageDigest unused = C6753ij.f19383b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused2) {
        } finally {
            C6753ij.f19386e.countDown();
        }
    }
}
