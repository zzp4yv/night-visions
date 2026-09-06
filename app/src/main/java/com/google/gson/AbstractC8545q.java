package com.google.gson;

import com.google.gson.p215t.p216n.C8573f;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;

/* compiled from: TypeAdapter.java */
/* renamed from: com.google.gson.q */
/* loaded from: classes2.dex */
public abstract class AbstractC8545q<T> {

    /* compiled from: TypeAdapter.java */
    /* renamed from: com.google.gson.q$a */
    class a extends AbstractC8545q<T> {
        a() {
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: b */
        public T mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() != EnumC8553b.NULL) {
                return (T) AbstractC8545q.this.mo26938b(c8552a);
            }
            c8552a.mo26999I();
            return null;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: d */
        public void mo26939d(C8554c c8554c, T t) throws IOException {
            if (t == null) {
                c8554c.mo27043y();
            } else {
                AbstractC8545q.this.mo26939d(c8554c, t);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC8545q<T> m26977a() {
        return new a();
    }

    /* renamed from: b */
    public abstract T mo26938b(C8552a c8552a) throws IOException;

    /* renamed from: c */
    public final AbstractC8538j m26978c(T t) {
        try {
            C8573f c8573f = new C8573f();
            mo26939d(c8573f, t);
            return c8573f.m27130e0();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    /* renamed from: d */
    public abstract void mo26939d(C8554c c8554c, T t) throws IOException;
}
