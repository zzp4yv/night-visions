package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import kotlin.jvm.internal.C9778q;

/* compiled from: PublicSuffixDatabase.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {}, m32267d2 = {}, m32268k = 3, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
final /* synthetic */ class PublicSuffixDatabase$findMatchingRule$1 extends C9778q {
    PublicSuffixDatabase$findMatchingRule$1(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
    }

    @Override // kotlin.jvm.internal.C9778q, kotlin.reflect.KProperty0
    public Object get() {
        return PublicSuffixDatabase.access$getPublicSuffixListBytes$p((PublicSuffixDatabase) this.receiver);
    }

    @Override // kotlin.jvm.internal.C9778q
    public void set(Object obj) {
        ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
    }
}
