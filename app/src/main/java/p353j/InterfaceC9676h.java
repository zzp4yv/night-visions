package p353j;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
/* renamed from: j.h */
/* loaded from: classes3.dex */
public interface InterfaceC9676h extends InterfaceC9667d0, ReadableByteChannel {
    /* renamed from: D0 */
    C9677i mo32003D0() throws IOException;

    /* renamed from: L0 */
    String mo32011L0() throws IOException;

    /* renamed from: M */
    byte[] mo32012M() throws IOException;

    /* renamed from: O0 */
    byte[] mo32015O0(long j2) throws IOException;

    /* renamed from: P */
    long mo32016P(C9677i c9677i) throws IOException;

    /* renamed from: R */
    boolean mo32019R() throws IOException;

    /* renamed from: X */
    void mo32025X(C9670f c9670f, long j2) throws IOException;

    /* renamed from: Y0 */
    long mo32026Y0(InterfaceC9663b0 interfaceC9663b0) throws IOException;

    /* renamed from: b0 */
    long mo32031b0(C9677i c9677i) throws IOException;

    /* renamed from: d0 */
    long mo32035d0() throws IOException;

    /* renamed from: g0 */
    String mo32040g0(long j2) throws IOException;

    /* renamed from: g1 */
    void mo32041g1(long j2) throws IOException;

    /* renamed from: i */
    C9670f mo32042i();

    /* renamed from: m1 */
    long mo32049m1() throws IOException;

    /* renamed from: o1 */
    InputStream mo32051o1();

    /* renamed from: p1 */
    int mo32053p1(C9688t c9688t) throws IOException;

    InterfaceC9676h peek();

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j2) throws IOException;

    void skip(long j2) throws IOException;

    /* renamed from: t */
    C9670f mo32056t();

    /* renamed from: u */
    C9677i mo32058u(long j2) throws IOException;

    /* renamed from: v0 */
    boolean mo32059v0(long j2, C9677i c9677i) throws IOException;

    /* renamed from: w0 */
    String mo32060w0(Charset charset) throws IOException;
}
