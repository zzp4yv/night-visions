package p353j;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10514v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JvmOkio.kt */
/* renamed from: j.r */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9686r {

    /* renamed from: a */
    private static final Logger f37071a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final InterfaceC9663b0 m32130b(File file) throws FileNotFoundException {
        C9768m.m32346f(file, "$this$appendingSink");
        return C9685q.m32123g(new FileOutputStream(file, true));
    }

    /* renamed from: c */
    public static final boolean m32131c(AssertionError assertionError) {
        C9768m.m32346f(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C10514v.m37538J(message, "getsockname failed", false, 2, null) : false;
    }

    /* renamed from: d */
    public static final InterfaceC9663b0 m32132d(File file, boolean z) throws FileNotFoundException {
        C9768m.m32346f(file, "$this$sink");
        return C9685q.m32123g(new FileOutputStream(file, z));
    }

    /* renamed from: e */
    public static final InterfaceC9663b0 m32133e(OutputStream outputStream) {
        C9768m.m32346f(outputStream, "$this$sink");
        return new C9689u(outputStream, new C9669e0());
    }

    /* renamed from: f */
    public static final InterfaceC9663b0 m32134f(Socket socket) throws IOException {
        C9768m.m32346f(socket, "$this$sink");
        C9665c0 c9665c0 = new C9665c0(socket);
        OutputStream outputStream = socket.getOutputStream();
        C9768m.m32345e(outputStream, "getOutputStream()");
        return c9665c0.sink(new C9689u(outputStream, c9665c0));
    }

    /* renamed from: g */
    public static /* synthetic */ InterfaceC9663b0 m32135g(File file, boolean z, int i2, Object obj) throws FileNotFoundException {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return C9685q.m32122f(file, z);
    }

    /* renamed from: h */
    public static final InterfaceC9667d0 m32136h(File file) throws FileNotFoundException {
        C9768m.m32346f(file, "$this$source");
        return C9685q.m32127k(new FileInputStream(file));
    }

    /* renamed from: i */
    public static final InterfaceC9667d0 m32137i(InputStream inputStream) {
        C9768m.m32346f(inputStream, "$this$source");
        return new C9684p(inputStream, new C9669e0());
    }

    /* renamed from: j */
    public static final InterfaceC9667d0 m32138j(Socket socket) throws IOException {
        C9768m.m32346f(socket, "$this$source");
        C9665c0 c9665c0 = new C9665c0(socket);
        InputStream inputStream = socket.getInputStream();
        C9768m.m32345e(inputStream, "getInputStream()");
        return c9665c0.source(new C9684p(inputStream, c9665c0));
    }
}
