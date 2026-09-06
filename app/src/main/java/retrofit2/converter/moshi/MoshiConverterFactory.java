package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.C8695r;
import com.squareup.moshi.InterfaceC8685h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final C8695r moshi;
    private final boolean serializeNulls;

    private MoshiConverterFactory(C8695r c8695r, boolean z, boolean z2, boolean z3) {
        this.moshi = c8695r;
        this.lenient = z;
        this.failOnUnknown = z2;
        this.serializeNulls = z3;
    }

    public static MoshiConverterFactory create() {
        return create(new C8695r.a().m27815b());
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC8685h.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        AbstractC8683f m27812e = this.moshi.m27812e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            m27812e = m27812e.lenient();
        }
        if (this.failOnUnknown) {
            m27812e = m27812e.failOnUnknown();
        }
        if (this.serializeNulls) {
            m27812e = m27812e.serializeNulls();
        }
        return new MoshiRequestBodyConverter(m27812e);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        AbstractC8683f m27812e = this.moshi.m27812e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            m27812e = m27812e.lenient();
        }
        if (this.failOnUnknown) {
            m27812e = m27812e.failOnUnknown();
        }
        if (this.serializeNulls) {
            m27812e = m27812e.serializeNulls();
        }
        return new MoshiResponseBodyConverter(m27812e);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    public static MoshiConverterFactory create(C8695r c8695r) {
        if (c8695r != null) {
            return new MoshiConverterFactory(c8695r, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }
}
