package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.C5663p0;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: GraphRequestAsyncTask.kt */
/* renamed from: com.facebook.b0 */
/* loaded from: classes.dex */
public class AsyncTaskC5610b0 extends AsyncTask<Void, Void, List<? extends C5620d0>> {

    /* renamed from: a */
    public static final a f14224a = new a(null);

    /* renamed from: b */
    private static final String f14225b = AsyncTaskC5610b0.class.getCanonicalName();

    /* renamed from: c */
    private final HttpURLConnection f14226c;

    /* renamed from: d */
    private final C5613c0 f14227d;

    /* renamed from: e */
    private Exception f14228e;

    /* compiled from: GraphRequestAsyncTask.kt */
    /* renamed from: com.facebook.b0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public AsyncTaskC5610b0(HttpURLConnection httpURLConnection, C5613c0 c5613c0) {
        C9768m.m32346f(c5613c0, "requests");
        this.f14226c = httpURLConnection;
        this.f14227d = c5613c0;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C5620d0> doInBackground(Void... voidArr) {
        C9768m.m32346f(voidArr, "params");
        try {
            HttpURLConnection httpURLConnection = this.f14226c;
            return httpURLConnection == null ? this.f14227d.m11325i() : GraphRequest.f14159a.m11235m(httpURLConnection, this.f14227d);
        } catch (Exception e2) {
            this.f14228e = e2;
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(List<C5620d0> list) {
        C9768m.m32346f(list, "result");
        super.onPostExecute(list);
        Exception exc = this.f14228e;
        if (exc != null) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            String str = f14225b;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
            C9768m.m32345e(format, "java.lang.String.format(format, *args)");
            C5663p0.m11575j0(str, format);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        C5608a0 c5608a0 = C5608a0.f14199a;
        if (C5608a0.m11302u()) {
            C5663p0 c5663p0 = C5663p0.f14478a;
            String str = f14225b;
            StringCompanionObject stringCompanionObject = StringCompanionObject.f37185a;
            String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
            C9768m.m32345e(format, "java.lang.String.format(format, *args)");
            C5663p0.m11575j0(str, format);
        }
        if (this.f14227d.m11329t() == null) {
            this.f14227d.m11320G(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f14226c + ", requests: " + this.f14227d + "}";
        C9768m.m32345e(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC5610b0(C5613c0 c5613c0) {
        this(null, c5613c0);
        C9768m.m32346f(c5613c0, "requests");
    }
}
