package p353j;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.kt */
/* renamed from: j.g */
/* loaded from: classes3.dex */
public interface InterfaceC9672g extends InterfaceC9663b0, WritableByteChannel {
    /* renamed from: A0 */
    InterfaceC9672g mo31997A0(String str, int i2, int i3) throws IOException;

    /* renamed from: B0 */
    long mo31999B0(InterfaceC9667d0 interfaceC9667d0) throws IOException;

    /* renamed from: C */
    InterfaceC9672g mo32000C() throws IOException;

    /* renamed from: C0 */
    InterfaceC9672g mo32001C0(long j2) throws IOException;

    /* renamed from: U0 */
    InterfaceC9672g mo32023U0(C9677i c9677i) throws IOException;

    /* renamed from: c0 */
    InterfaceC9672g mo32032c0() throws IOException;

    @Override // p353j.InterfaceC9663b0, java.io.Flushable
    void flush() throws IOException;

    /* renamed from: i */
    C9670f mo32042i();

    /* renamed from: i1 */
    InterfaceC9672g mo32043i1(long j2) throws IOException;

    /* renamed from: r0 */
    InterfaceC9672g mo32055r0(String str) throws IOException;

    InterfaceC9672g write(byte[] bArr) throws IOException;

    InterfaceC9672g write(byte[] bArr, int i2, int i3) throws IOException;

    InterfaceC9672g writeByte(int i2) throws IOException;

    InterfaceC9672g writeInt(int i2) throws IOException;

    InterfaceC9672g writeShort(int i2) throws IOException;
}
