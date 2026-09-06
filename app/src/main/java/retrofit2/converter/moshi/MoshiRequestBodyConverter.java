package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.AbstractC8692o;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p353j.C9670f;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class MoshiRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private final AbstractC8683f<T> adapter;

    MoshiRequestBodyConverter(AbstractC8683f<T> abstractC8683f) {
        this.adapter = abstractC8683f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((MoshiRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        C9670f c9670f = new C9670f();
        this.adapter.toJson(AbstractC8692o.m27770p(c9670f), (AbstractC8692o) t);
        return RequestBody.create(MEDIA_TYPE, c9670f.mo32003D0());
    }
}
