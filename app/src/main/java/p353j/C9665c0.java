package p353j;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C9768m;

/* compiled from: JvmOkio.kt */
/* renamed from: j.c0 */
/* loaded from: classes3.dex */
final class C9665c0 extends C9666d {

    /* renamed from: a */
    private final Socket f37033a;

    public C9665c0(Socket socket) {
        C9768m.m32346f(socket, "socket");
        this.f37033a = socket;
    }

    @Override // p353j.C9666d
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p353j.C9666d
    protected void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.f37033a.close();
        } catch (AssertionError e2) {
            if (!C9685q.m32121e(e2)) {
                throw e2;
            }
            logger2 = C9686r.f37071a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f37033a, (Throwable) e2);
        } catch (Exception e3) {
            logger = C9686r.f37071a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f37033a, (Throwable) e3);
        }
    }
}
