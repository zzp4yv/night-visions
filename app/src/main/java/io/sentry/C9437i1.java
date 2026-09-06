package io.sentry;

import io.sentry.hints.InterfaceC9426i;
import io.sentry.hints.InterfaceC9428k;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EnvelopeSender.java */
@ApiStatus.Internal
/* renamed from: io.sentry.i1 */
/* loaded from: classes2.dex */
public final class C9437i1 extends AbstractC9392e1 implements InterfaceC9558t1 {

    /* renamed from: c */
    private final InterfaceC9625v1 f36351c;

    /* renamed from: d */
    private final InterfaceC9340c2 f36352d;

    /* renamed from: e */
    private final InterfaceC9637w1 f36353e;

    public C9437i1(InterfaceC9625v1 interfaceC9625v1, InterfaceC9340c2 interfaceC9340c2, InterfaceC9637w1 interfaceC9637w1, long j2) {
        super(interfaceC9637w1, j2);
        this.f36351c = (InterfaceC9625v1) C9613q.m31802c(interfaceC9625v1, "Hub is required.");
        this.f36352d = (InterfaceC9340c2) C9613q.m31802c(interfaceC9340c2, "Serializer is required.");
        this.f36353e = (InterfaceC9637w1) C9613q.m31802c(interfaceC9637w1, "Logger is required.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30842h(InterfaceC9426i interfaceC9426i) {
        if (interfaceC9426i.mo30477e()) {
            return;
        }
        this.f36353e.mo30214c(EnumC9554s4.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30843j(Throwable th, File file, InterfaceC9428k interfaceC9428k) {
        interfaceC9428k.mo30476d(false);
        this.f36353e.mo30212a(EnumC9554s4.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m30844l(File file, InterfaceC9428k interfaceC9428k) {
        if (interfaceC9428k.mo30474b()) {
            this.f36353e.mo30214c(EnumC9554s4.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            m30840m(file, "after trying to capture it");
            this.f36353e.mo30214c(EnumC9554s4.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    /* renamed from: m */
    private void m30840m(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f36353e.mo30214c(EnumC9554s4.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.f36353e.mo30212a(EnumC9554s4.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.InterfaceC9558t1
    /* renamed from: a */
    public void mo30841a(String str, C9484n1 c9484n1) {
        C9613q.m31802c(str, "Path is required.");
        mo30760f(new File(str), c9484n1);
    }

    @Override // io.sentry.AbstractC9392e1
    /* renamed from: b */
    protected boolean mo30757b(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.AbstractC9392e1
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo30759e(File file) {
        super.mo30759e(file);
    }

    @Override // io.sentry.AbstractC9392e1
    /* renamed from: f */
    protected void mo30760f(final File file, C9484n1 c9484n1) {
        InterfaceC9637w1 interfaceC9637w1;
        C9609m.a aVar;
        if (!file.isFile()) {
            this.f36353e.mo30214c(EnumC9554s4.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!mo30757b(file.getName())) {
            this.f36353e.mo30214c(EnumC9554s4.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f36353e.mo30214c(EnumC9554s4.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            C9416h4 mo30490d = this.f36352d.mo30490d(bufferedInputStream);
                            if (mo30490d == null) {
                                this.f36353e.mo30214c(EnumC9554s4.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                            } else {
                                this.f36351c.mo31149j(mo30490d, c9484n1);
                            }
                            C9609m.m31790m(c9484n1, InterfaceC9426i.class, this.f36353e, new C9609m.a() { // from class: io.sentry.d
                                @Override // io.sentry.util.C9609m.a
                                /* renamed from: a */
                                public final void mo30156a(Object obj) {
                                    C9437i1.this.m30842h((InterfaceC9426i) obj);
                                }
                            });
                            bufferedInputStream.close();
                            interfaceC9637w1 = this.f36353e;
                            aVar = new C9609m.a() { // from class: io.sentry.e
                                @Override // io.sentry.util.C9609m.a
                                /* renamed from: a */
                                public final void mo30156a(Object obj) {
                                    C9437i1.this.m30844l(file, (InterfaceC9428k) obj);
                                }
                            };
                        } catch (Throwable th) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f36353e.mo30212a(EnumC9554s4.ERROR, th2, "Failed to capture cached envelope %s", file.getAbsolutePath());
                        C9609m.m31790m(c9484n1, InterfaceC9428k.class, this.f36353e, new C9609m.a() { // from class: io.sentry.c
                            @Override // io.sentry.util.C9609m.a
                            /* renamed from: a */
                            public final void mo30156a(Object obj) {
                                C9437i1.this.m30843j(th2, file, (InterfaceC9428k) obj);
                            }
                        });
                        interfaceC9637w1 = this.f36353e;
                        aVar = new C9609m.a() { // from class: io.sentry.e
                            @Override // io.sentry.util.C9609m.a
                            /* renamed from: a */
                            public final void mo30156a(Object obj) {
                                C9437i1.this.m30844l(file, (InterfaceC9428k) obj);
                            }
                        };
                    }
                } catch (FileNotFoundException e2) {
                    this.f36353e.mo30212a(EnumC9554s4.ERROR, e2, "File '%s' cannot be found.", file.getAbsolutePath());
                    interfaceC9637w1 = this.f36353e;
                    aVar = new C9609m.a() { // from class: io.sentry.e
                        @Override // io.sentry.util.C9609m.a
                        /* renamed from: a */
                        public final void mo30156a(Object obj) {
                            C9437i1.this.m30844l(file, (InterfaceC9428k) obj);
                        }
                    };
                }
            } catch (IOException e3) {
                this.f36353e.mo30212a(EnumC9554s4.ERROR, e3, "I/O on file '%s' failed.", file.getAbsolutePath());
                interfaceC9637w1 = this.f36353e;
                aVar = new C9609m.a() { // from class: io.sentry.e
                    @Override // io.sentry.util.C9609m.a
                    /* renamed from: a */
                    public final void mo30156a(Object obj) {
                        C9437i1.this.m30844l(file, (InterfaceC9428k) obj);
                    }
                };
            }
            C9609m.m31790m(c9484n1, InterfaceC9428k.class, interfaceC9637w1, aVar);
        } catch (Throwable th3) {
            C9609m.m31790m(c9484n1, InterfaceC9428k.class, this.f36353e, new C9609m.a() { // from class: io.sentry.e
                @Override // io.sentry.util.C9609m.a
                /* renamed from: a */
                public final void mo30156a(Object obj) {
                    C9437i1.this.m30844l(file, (InterfaceC9428k) obj);
                }
            });
            throw th3;
        }
    }
}
