package com.squareup.moshi;

import com.squareup.moshi.AbstractC8686i;
import com.squareup.moshi.p231w.C8700a;
import com.squareup.moshi.p231w.C8701b;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p353j.C9670f;
import p353j.InterfaceC9672g;
import p353j.InterfaceC9676h;

/* compiled from: JsonAdapter.java */
/* renamed from: com.squareup.moshi.f */
/* loaded from: classes2.dex */
public abstract class AbstractC8683f<T> {

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$a */
    class a extends AbstractC8683f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8683f f33093a;

        a(AbstractC8683f abstractC8683f) {
            this.f33093a = abstractC8683f;
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public T fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return (T) this.f33093a.fromJson(abstractC8686i);
        }

        @Override // com.squareup.moshi.AbstractC8683f
        boolean isLenient() {
            return this.f33093a.isLenient();
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public void toJson(AbstractC8692o abstractC8692o, T t) throws IOException {
            boolean m27777j = abstractC8692o.m27777j();
            abstractC8692o.m27773H(true);
            try {
                this.f33093a.toJson(abstractC8692o, (AbstractC8692o) t);
            } finally {
                abstractC8692o.m27773H(m27777j);
            }
        }

        public String toString() {
            return this.f33093a + ".serializeNulls()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$b */
    class b extends AbstractC8683f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8683f f33095a;

        b(AbstractC8683f abstractC8683f) {
            this.f33095a = abstractC8683f;
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public T fromJson(AbstractC8686i abstractC8686i) throws IOException {
            boolean m27717j = abstractC8686i.m27717j();
            abstractC8686i.m27705K(true);
            try {
                return (T) this.f33095a.fromJson(abstractC8686i);
            } finally {
                abstractC8686i.m27705K(m27717j);
            }
        }

        @Override // com.squareup.moshi.AbstractC8683f
        boolean isLenient() {
            return true;
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public void toJson(AbstractC8692o abstractC8692o, T t) throws IOException {
            boolean m27778k = abstractC8692o.m27778k();
            abstractC8692o.m27772D(true);
            try {
                this.f33095a.toJson(abstractC8692o, (AbstractC8692o) t);
            } finally {
                abstractC8692o.m27772D(m27778k);
            }
        }

        public String toString() {
            return this.f33095a + ".lenient()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$c */
    class c extends AbstractC8683f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8683f f33097a;

        c(AbstractC8683f abstractC8683f) {
            this.f33097a = abstractC8683f;
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public T fromJson(AbstractC8686i abstractC8686i) throws IOException {
            boolean m27714e = abstractC8686i.m27714e();
            abstractC8686i.m27704J(true);
            try {
                return (T) this.f33097a.fromJson(abstractC8686i);
            } finally {
                abstractC8686i.m27704J(m27714e);
            }
        }

        @Override // com.squareup.moshi.AbstractC8683f
        boolean isLenient() {
            return this.f33097a.isLenient();
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public void toJson(AbstractC8692o abstractC8692o, T t) throws IOException {
            this.f33097a.toJson(abstractC8692o, (AbstractC8692o) t);
        }

        public String toString() {
            return this.f33097a + ".failOnUnknown()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$d */
    class d extends AbstractC8683f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC8683f f33099a;

        /* renamed from: b */
        final /* synthetic */ String f33100b;

        d(AbstractC8683f abstractC8683f, String str) {
            this.f33099a = abstractC8683f;
            this.f33100b = str;
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public T fromJson(AbstractC8686i abstractC8686i) throws IOException {
            return (T) this.f33099a.fromJson(abstractC8686i);
        }

        @Override // com.squareup.moshi.AbstractC8683f
        boolean isLenient() {
            return this.f33099a.isLenient();
        }

        @Override // com.squareup.moshi.AbstractC8683f
        public void toJson(AbstractC8692o abstractC8692o, T t) throws IOException {
            String m27775f = abstractC8692o.m27775f();
            abstractC8692o.mo27750B(this.f33100b);
            try {
                this.f33099a.toJson(abstractC8692o, (AbstractC8692o) t);
            } finally {
                abstractC8692o.mo27750B(m27775f);
            }
        }

        public String toString() {
            return this.f33099a + ".indent(\"" + this.f33100b + "\")";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$e */
    public interface e {
        /* renamed from: a */
        AbstractC8683f<?> mo27684a(Type type, Set<? extends Annotation> set, C8695r c8695r);
    }

    public final AbstractC8683f<T> failOnUnknown() {
        return new c(this);
    }

    public abstract T fromJson(AbstractC8686i abstractC8686i) throws IOException;

    public final T fromJson(InterfaceC9676h interfaceC9676h) throws IOException {
        return fromJson(AbstractC8686i.m27698z(interfaceC9676h));
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson(new C8690m(obj));
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public AbstractC8683f<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    boolean isLenient() {
        return false;
    }

    public final AbstractC8683f<T> lenient() {
        return new b(this);
    }

    public final AbstractC8683f<T> nonNull() {
        return this instanceof C8700a ? this : new C8700a(this);
    }

    public final AbstractC8683f<T> nullSafe() {
        return this instanceof C8701b ? this : new C8701b(this);
    }

    public final AbstractC8683f<T> serializeNulls() {
        return new a(this);
    }

    public abstract void toJson(AbstractC8692o abstractC8692o, T t) throws IOException;

    public final void toJson(InterfaceC9672g interfaceC9672g, T t) throws IOException {
        toJson(AbstractC8692o.m27770p(interfaceC9672g), (AbstractC8692o) t);
    }

    public final Object toJsonValue(T t) {
        C8691n c8691n = new C8691n();
        try {
            toJson((AbstractC8692o) c8691n, (C8691n) t);
            return c8691n.m27769W();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final T fromJson(String str) throws IOException {
        AbstractC8686i m27698z = AbstractC8686i.m27698z(new C9670f().mo32055r0(str));
        T fromJson = fromJson(m27698z);
        if (isLenient() || m27698z.mo27699A() == AbstractC8686i.b.END_DOCUMENT) {
            return fromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final String toJson(T t) {
        C9670f c9670f = new C9670f();
        try {
            toJson((InterfaceC9672g) c9670f, (C9670f) t);
            return c9670f.m32021T();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
