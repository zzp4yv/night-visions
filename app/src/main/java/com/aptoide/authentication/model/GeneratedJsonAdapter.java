package com.aptoide.authentication.model;

import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import com.aptoide.authentication.model.OAuth2;
import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.AbstractC8686i;
import com.squareup.moshi.AbstractC8692o;
import com.squareup.moshi.C8695r;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.p231w.C8702c;
import java.lang.annotation.Annotation;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;

/* compiled from: OAuth2_DataJsonAdapter.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m32267d2 = {"Lcom/aptoide/authentication/model/OAuth2_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/model/OAuth2$Data;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "intAdapter", HttpUrl.FRAGMENT_ENCODE_SET, "nullableStringAdapter", HttpUrl.FRAGMENT_ENCODE_SET, "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", HttpUrl.FRAGMENT_ENCODE_SET, "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: com.aptoide.authentication.model.OAuth2_DataJsonAdapter, reason: from toString */
/* loaded from: classes.dex */
public final class GeneratedJsonAdapter extends AbstractC8683f<OAuth2.Data> {
    private final AbstractC8683f<Integer> intAdapter;
    private final AbstractC8683f<String> nullableStringAdapter;
    private final AbstractC8686i.a options;
    private final AbstractC8683f<String> stringAdapter;

    public GeneratedJsonAdapter(C8695r c8695r) {
        Set<? extends Annotation> m38917d;
        Set<? extends Annotation> m38917d2;
        Set<? extends Annotation> m38917d3;
        C9768m.m32346f(c8695r, "moshi");
        AbstractC8686i.a m27724a = AbstractC8686i.a.m27724a("access_token", "expires_in", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, "token_type", "scope");
        C9768m.m32345e(m27724a, "of(\"access_token\", \"expi…\", \"token_type\", \"scope\")");
        this.options = m27724a;
        m38917d = C10789w0.m38917d();
        AbstractC8683f<String> m27813f = c8695r.m27813f(String.class, m38917d, "accessToken");
        C9768m.m32345e(m27813f, "moshi.adapter(String::cl…t(),\n      \"accessToken\")");
        this.stringAdapter = m27813f;
        Class cls = Integer.TYPE;
        m38917d2 = C10789w0.m38917d();
        AbstractC8683f<Integer> m27813f2 = c8695r.m27813f(cls, m38917d2, "expiresIn");
        C9768m.m32345e(m27813f2, "moshi.adapter(Int::class… emptySet(), \"expiresIn\")");
        this.intAdapter = m27813f2;
        m38917d3 = C10789w0.m38917d();
        AbstractC8683f<String> m27813f3 = c8695r.m27813f(String.class, m38917d3, "scope");
        C9768m.m32345e(m27813f3, "moshi.adapter(String::cl…     emptySet(), \"scope\")");
        this.nullableStringAdapter = m27813f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OAuth2.Data");
        sb.append(')');
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.AbstractC8683f
    public OAuth2.Data fromJson(AbstractC8686i abstractC8686i) {
        C9768m.m32346f(abstractC8686i, "reader");
        abstractC8686i.mo27711b();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (abstractC8686i.mo27715f()) {
            int mo27702H = abstractC8686i.mo27702H(this.options);
            String str5 = str4;
            if (mo27702H == -1) {
                abstractC8686i.mo27706N();
                abstractC8686i.mo27707Q();
            } else if (mo27702H == 0) {
                str = this.stringAdapter.fromJson(abstractC8686i);
                if (str == null) {
                    JsonDataException m27876v = C8702c.m27876v("accessToken", "access_token", abstractC8686i);
                    C9768m.m32345e(m27876v, "unexpectedNull(\"accessTo…, \"access_token\", reader)");
                    throw m27876v;
                }
            } else if (mo27702H == 1) {
                num = this.intAdapter.fromJson(abstractC8686i);
                if (num == null) {
                    JsonDataException m27876v2 = C8702c.m27876v("expiresIn", "expires_in", abstractC8686i);
                    C9768m.m32345e(m27876v2, "unexpectedNull(\"expiresI…    \"expires_in\", reader)");
                    throw m27876v2;
                }
            } else if (mo27702H == 2) {
                str2 = this.stringAdapter.fromJson(abstractC8686i);
                if (str2 == null) {
                    JsonDataException m27876v3 = C8702c.m27876v("refreshToken", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, abstractC8686i);
                    C9768m.m32345e(m27876v3, "unexpectedNull(\"refreshT… \"refresh_token\", reader)");
                    throw m27876v3;
                }
            } else if (mo27702H == 3) {
                str3 = this.stringAdapter.fromJson(abstractC8686i);
                if (str3 == null) {
                    JsonDataException m27876v4 = C8702c.m27876v("tokenType", "token_type", abstractC8686i);
                    C9768m.m32345e(m27876v4, "unexpectedNull(\"tokenTyp…    \"token_type\", reader)");
                    throw m27876v4;
                }
            } else if (mo27702H == 4) {
                str4 = this.nullableStringAdapter.fromJson(abstractC8686i);
            }
            str4 = str5;
        }
        String str6 = str4;
        abstractC8686i.mo27713d();
        if (str == null) {
            JsonDataException m27868n = C8702c.m27868n("accessToken", "access_token", abstractC8686i);
            C9768m.m32345e(m27868n, "missingProperty(\"accessT…ken\",\n            reader)");
            throw m27868n;
        }
        if (num == null) {
            JsonDataException m27868n2 = C8702c.m27868n("expiresIn", "expires_in", abstractC8686i);
            C9768m.m32345e(m27868n2, "missingProperty(\"expiresIn\", \"expires_in\", reader)");
            throw m27868n2;
        }
        int intValue = num.intValue();
        if (str2 == null) {
            JsonDataException m27868n3 = C8702c.m27868n("refreshToken", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, abstractC8686i);
            C9768m.m32345e(m27868n3, "missingProperty(\"refresh…ken\",\n            reader)");
            throw m27868n3;
        }
        if (str3 != null) {
            return new OAuth2.Data(str, intValue, str2, str3, str6);
        }
        JsonDataException m27868n4 = C8702c.m27868n("tokenType", "token_type", abstractC8686i);
        C9768m.m32345e(m27868n4, "missingProperty(\"tokenType\", \"token_type\", reader)");
        throw m27868n4;
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public void toJson(AbstractC8692o abstractC8692o, OAuth2.Data data) {
        C9768m.m32346f(abstractC8692o, "writer");
        if (data == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC8692o.mo27757b();
        abstractC8692o.mo27760l("access_token");
        this.stringAdapter.toJson(abstractC8692o, (AbstractC8692o) data.getAccessToken());
        abstractC8692o.mo27760l("expires_in");
        this.intAdapter.toJson(abstractC8692o, (AbstractC8692o) Integer.valueOf(data.getExpiresIn()));
        abstractC8692o.mo27760l(AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN);
        this.stringAdapter.toJson(abstractC8692o, (AbstractC8692o) data.getRefreshToken());
        abstractC8692o.mo27760l("token_type");
        this.stringAdapter.toJson(abstractC8692o, (AbstractC8692o) data.getTokenType());
        abstractC8692o.mo27760l("scope");
        this.nullableStringAdapter.toJson(abstractC8692o, (AbstractC8692o) data.getScope());
        abstractC8692o.mo27759e();
    }
}
