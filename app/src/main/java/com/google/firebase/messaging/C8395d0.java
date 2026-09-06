package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_messaging.zzg;
import com.google.android.gms.internal.firebase_messaging.zzh;
import com.google.android.gms.internal.firebase_messaging.zzo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
/* renamed from: com.google.firebase.messaging.d0 */
/* loaded from: classes2.dex */
class C8395d0 implements Closeable {

    /* renamed from: f */
    private final URL f31983f;

    /* renamed from: g */
    private Task<Bitmap> f31984g;

    /* renamed from: h */
    private volatile InputStream f31985h;

    private C8395d0(URL url) {
        this.f31983f = url;
    }

    /* renamed from: b */
    private byte[] m26506b() throws IOException {
        URLConnection openConnection = this.f31983f.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            this.f31985h = inputStream;
            byte[] m20938a = zzg.m20938a(zzg.m20939b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                String valueOf = String.valueOf(this.f31983f);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Downloaded ");
                sb.append(m20938a.length);
                sb.append(" bytes from ");
                sb.append(valueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (m20938a.length <= 1048576) {
                return m20938a;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    zzo.m20942a(th, th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static C8395d0 m26507c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C8395d0(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    /* renamed from: a */
    public Bitmap m26508a() throws IOException {
        String valueOf = String.valueOf(this.f31983f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] m26506b = m26506b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m26506b, 0, m26506b.length);
        if (decodeByteArray == null) {
            String valueOf2 = String.valueOf(this.f31983f);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf3 = String.valueOf(this.f31983f);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(valueOf3);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        return decodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            zzh.m20941a(this.f31985h);
        } catch (NullPointerException e2) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e2);
        }
    }

    /* renamed from: d */
    public Task<Bitmap> m26509d() {
        return (Task) Preconditions.m14372k(this.f31984g);
    }

    /* renamed from: e */
    public void m26510e(Executor executor) {
        this.f31984g = Tasks.m23661c(executor, new Callable(this) { // from class: com.google.firebase.messaging.c0

            /* renamed from: f */
            private final C8395d0 f31979f;

            {
                this.f31979f = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return this.f31979f.m26508a();
            }
        });
    }
}
