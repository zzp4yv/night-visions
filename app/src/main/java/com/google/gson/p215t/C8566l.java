package com.google.gson.p215t;

import com.google.gson.AbstractC8538j;
import com.google.gson.C8539k;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p215t.p216n.C8581n;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* renamed from: com.google.gson.t.l */
/* loaded from: classes2.dex */
public final class C8566l {
    /* renamed from: a */
    public static AbstractC8538j m27110a(C8552a c8552a) throws JsonParseException {
        boolean z;
        try {
            try {
                c8552a.mo27001Q();
                z = false;
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            try {
                return C8581n.f32661X.mo26938b(c8552a);
            } catch (EOFException e3) {
                e = e3;
                if (z) {
                    return C8539k.f32449a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e4) {
            throw new JsonSyntaxException(e4);
        } catch (IOException e5) {
            throw new JsonIOException(e5);
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }

    /* renamed from: b */
    public static void m27111b(AbstractC8538j abstractC8538j, C8554c c8554c) throws IOException {
        C8581n.f32661X.mo26939d(c8554c, abstractC8538j);
    }

    /* renamed from: c */
    public static Writer m27112c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams.java */
    /* renamed from: com.google.gson.t.l$a */
    private static final class a extends Writer {

        /* renamed from: f */
        private final Appendable f32569f;

        /* renamed from: g */
        private final C11471a f32570g = new C11471a();

        /* compiled from: Streams.java */
        /* renamed from: com.google.gson.t.l$a$a, reason: collision with other inner class name */
        static class C11471a implements CharSequence {

            /* renamed from: f */
            char[] f32571f;

            C11471a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.f32571f[i2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f32571f.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f32571f, i2, i3 - i2);
            }
        }

        a(Appendable appendable) {
            this.f32569f = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            C11471a c11471a = this.f32570g;
            c11471a.f32571f = cArr;
            this.f32569f.append(c11471a, i2, i3 + i2);
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.f32569f.append((char) i2);
        }
    }
}
