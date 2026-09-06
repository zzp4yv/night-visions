package retrofit2.converter.gson;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.stream.C8554c;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p353j.C9670f;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final AbstractC8545q<T> adapter;
    private final C8533e gson;

    GsonRequestBodyConverter(C8533e c8533e, AbstractC8545q<T> abstractC8545q) {
        this.gson = c8533e;
        this.adapter = abstractC8545q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ RequestBody convert(Object obj) throws IOException {
        return convert((GsonRequestBodyConverter<T>) obj);
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t) throws IOException {
        C9670f c9670f = new C9670f();
        C8554c m26930o = this.gson.m26930o(new OutputStreamWriter(c9670f.m32002D(), UTF_8));
        this.adapter.mo26939d(m26930o, t);
        m26930o.close();
        return RequestBody.create(MEDIA_TYPE, c9670f.mo32003D0());
    }
}
