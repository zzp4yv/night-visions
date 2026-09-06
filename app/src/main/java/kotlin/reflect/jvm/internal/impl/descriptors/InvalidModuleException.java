package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9768m;

/* compiled from: InvalidModuleException.kt */
/* loaded from: classes2.dex */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String str) {
        super(str);
        C9768m.m32346f(str, "message");
    }
}
