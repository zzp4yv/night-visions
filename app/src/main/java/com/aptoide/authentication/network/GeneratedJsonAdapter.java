package com.aptoide.authentication.network;

import com.aptoide.authentication.network.RemoteAuthenticationService;
import com.squareup.moshi.AbstractC8683f;
import com.squareup.moshi.AbstractC8686i;
import com.squareup.moshi.AbstractC8692o;
import com.squareup.moshi.C8695r;
import com.squareup.moshi.C8698u;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.p231w.C8702c;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;

/* compiled from: RemoteAuthenticationService_CredentialsJsonAdapter.kt */
@Metadata(m32266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m32267d2 = {"Lcom/aptoide/authentication/network/RemoteAuthenticationService_CredentialsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "arrayOfStringAdapter", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", HttpUrl.FRAGMENT_ENCODE_SET, "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "aptoide-authentication-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: com.aptoide.authentication.network.RemoteAuthenticationService_CredentialsJsonAdapter, reason: from toString */
/* loaded from: classes.dex */
public final class GeneratedJsonAdapter extends AbstractC8683f<RemoteAuthenticationService.Credentials> {
    private final AbstractC8683f<String[]> arrayOfStringAdapter;
    private final AbstractC8686i.a options;
    private final AbstractC8683f<String> stringAdapter;

    public GeneratedJsonAdapter(C8695r c8695r) {
        Set<? extends Annotation> m38917d;
        Set<? extends Annotation> m38917d2;
        C9768m.m32346f(c8695r, "moshi");
        AbstractC8686i.a m27724a = AbstractC8686i.a.m27724a("credential", "supported");
        C9768m.m32345e(m27724a, "of(\"credential\", \"supported\")");
        this.options = m27724a;
        m38917d = C10789w0.m38917d();
        AbstractC8683f<String> m27813f = c8695r.m27813f(String.class, m38917d, "credential");
        C9768m.m32345e(m27813f, "moshi.adapter(String::cl…et(),\n      \"credential\")");
        this.stringAdapter = m27813f;
        GenericArrayType m27843b = C8698u.m27843b(String.class);
        m38917d2 = C10789w0.m38917d();
        AbstractC8683f<String[]> m27813f2 = c8695r.m27813f(m27843b, m38917d2, "supported");
        C9768m.m32345e(m27813f2, "moshi.adapter(Types.arra… emptySet(), \"supported\")");
        this.arrayOfStringAdapter = m27813f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(61);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RemoteAuthenticationService.Credentials");
        sb.append(')');
        String sb2 = sb.toString();
        C9768m.m32345e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.AbstractC8683f
    public RemoteAuthenticationService.Credentials fromJson(AbstractC8686i abstractC8686i) {
        C9768m.m32346f(abstractC8686i, "reader");
        abstractC8686i.mo27711b();
        String str = null;
        String[] strArr = null;
        while (abstractC8686i.mo27715f()) {
            int mo27702H = abstractC8686i.mo27702H(this.options);
            if (mo27702H == -1) {
                abstractC8686i.mo27706N();
                abstractC8686i.mo27707Q();
            } else if (mo27702H == 0) {
                str = this.stringAdapter.fromJson(abstractC8686i);
                if (str == null) {
                    JsonDataException m27876v = C8702c.m27876v("credential", "credential", abstractC8686i);
                    C9768m.m32345e(m27876v, "unexpectedNull(\"credenti…    \"credential\", reader)");
                    throw m27876v;
                }
            } else if (mo27702H == 1 && (strArr = this.arrayOfStringAdapter.fromJson(abstractC8686i)) == null) {
                JsonDataException m27876v2 = C8702c.m27876v("supported", "supported", abstractC8686i);
                C9768m.m32345e(m27876v2, "unexpectedNull(\"supported\", \"supported\", reader)");
                throw m27876v2;
            }
        }
        abstractC8686i.mo27713d();
        if (str == null) {
            JsonDataException m27868n = C8702c.m27868n("credential", "credential", abstractC8686i);
            C9768m.m32345e(m27868n, "missingProperty(\"credent…l\", \"credential\", reader)");
            throw m27868n;
        }
        if (strArr != null) {
            return new RemoteAuthenticationService.Credentials(str, strArr);
        }
        JsonDataException m27868n2 = C8702c.m27868n("supported", "supported", abstractC8686i);
        C9768m.m32345e(m27868n2, "missingProperty(\"supported\", \"supported\", reader)");
        throw m27868n2;
    }

    @Override // com.squareup.moshi.AbstractC8683f
    public void toJson(AbstractC8692o abstractC8692o, RemoteAuthenticationService.Credentials credentials) {
        C9768m.m32346f(abstractC8692o, "writer");
        if (credentials == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC8692o.mo27757b();
        abstractC8692o.mo27760l("credential");
        this.stringAdapter.toJson(abstractC8692o, (AbstractC8692o) credentials.getCredential());
        abstractC8692o.mo27760l("supported");
        this.arrayOfStringAdapter.toJson(abstractC8692o, (AbstractC8692o) credentials.getSupported());
        abstractC8692o.mo27759e();
    }
}
