package retrofit2;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import okhttp3.HttpUrl;

/* compiled from: KotlinExtensions.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007"}, m32267d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlin/y/d;", HttpUrl.FRAGMENT_ENCODE_SET, "continuation", HttpUrl.FRAGMENT_ENCODE_SET, "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/y/d;)Ljava/lang/Object;"}, m32268k = 3, m32269mv = {1, 4, 0})
@DebugMetadata(m39049c = "retrofit2.KotlinExtensions", m39050f = "KotlinExtensions.kt", m39051l = {113}, m39052m = "suspendAndThrow")
/* loaded from: classes3.dex */
final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    KotlinExtensions$suspendAndThrow$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.suspendAndThrow(null, this);
    }
}
