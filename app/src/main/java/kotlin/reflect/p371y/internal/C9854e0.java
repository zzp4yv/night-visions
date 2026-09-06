package kotlin.reflect.p371y.internal;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.C10770n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10670d;
import okhttp3.HttpUrl;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m32267d2 = {RoomInstalled.SIGNATURE, HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflection"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.e0 */
/* loaded from: classes2.dex */
public final class C9854e0 {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.e0$a */
    static final class a extends Lambda implements Function1<Class<?>, CharSequence> {

        /* renamed from: f */
        public static final a f37301f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Class<?> cls) {
            C9768m.m32345e(cls, "it");
            return C10670d.m38070b(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m32535b(Method method) {
        String m38729I;
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        C9768m.m32345e(parameterTypes, "parameterTypes");
        m38729I = C10770n.m38729I(parameterTypes, HttpUrl.FRAGMENT_ENCODE_SET, "(", ")", 0, null, a.f37301f, 24, null);
        sb.append(m38729I);
        Class<?> returnType = method.getReturnType();
        C9768m.m32345e(returnType, "returnType");
        sb.append(C10670d.m38070b(returnType));
        return sb.toString();
    }
}
