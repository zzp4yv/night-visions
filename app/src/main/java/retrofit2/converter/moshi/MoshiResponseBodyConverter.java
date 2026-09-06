package retrofit2.converter.moshi;

import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.AbstractC8686i;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import okhttp3.ResponseBody;
import p353j.C9677i;
import p353j.InterfaceC9676h;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final C9677i UTF8_BOM = C9677i.m32084q("EFBBBF");
    private final AbstractC8683f<T> adapter;

    MoshiResponseBodyConverter(AbstractC8683f<T> abstractC8683f) {
        this.adapter = abstractC8683f;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        InterfaceC9676h bodySource = responseBody.getBodySource();
        try {
            if (bodySource.mo32059v0(0L, UTF8_BOM)) {
                bodySource.skip(r3.m32093P());
            }
            AbstractC8686i m27698z = AbstractC8686i.m27698z(bodySource);
            T fromJson = this.adapter.fromJson(m27698z);
            if (m27698z.mo27699A() == AbstractC8686i.b.END_DOCUMENT) {
                return fromJson;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
