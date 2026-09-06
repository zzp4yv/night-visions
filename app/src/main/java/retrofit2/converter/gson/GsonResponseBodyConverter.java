package retrofit2.converter.gson;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.JsonIOException;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes3.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final AbstractC8545q<T> adapter;
    private final C8533e gson;

    GsonResponseBodyConverter(C8533e c8533e, AbstractC8545q<T> abstractC8545q) {
        this.gson = c8533e;
        this.adapter = abstractC8545q;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        C8552a m26929n = this.gson.m26929n(responseBody.charStream());
        try {
            T mo26938b = this.adapter.mo26938b(m26929n);
            if (m26929n.mo27001Q() == EnumC8553b.END_DOCUMENT) {
                return mo26938b;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
