package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o;

/* compiled from: AbstractParser.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10710b<MessageType extends InterfaceC10723o> implements InterfaceC10725q<MessageType> {

    /* renamed from: a */
    private static final C10714f f41257a = C10714f.m38347c();

    /* renamed from: e */
    private MessageType m38258e(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m38259f(messagetype).m38254a().m38253i(messagetype);
    }

    /* renamed from: f */
    private UninitializedMessageException m38259f(MessageType messagetype) {
        return messagetype instanceof AbstractC10709a ? ((AbstractC10709a) messagetype).m38255a() : new UninitializedMessageException(messagetype);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public MessageType mo38261c(InputStream inputStream, C10714f c10714f) throws InvalidProtocolBufferException {
        return m38258e(m38266j(inputStream, c10714f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public MessageType mo38260a(InputStream inputStream, C10714f c10714f) throws InvalidProtocolBufferException {
        return m38258e(m38267k(inputStream, c10714f));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10725q
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType mo38262d(AbstractC10712d abstractC10712d, C10714f c10714f) throws InvalidProtocolBufferException {
        return m38258e(m38268l(abstractC10712d, c10714f));
    }

    /* renamed from: j */
    public MessageType m38266j(InputStream inputStream, C10714f c10714f) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return m38267k(new AbstractC10709a.a.C11533a(inputStream, C10713e.m38300B(read, inputStream)), c10714f);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    /* renamed from: k */
    public MessageType m38267k(InputStream inputStream, C10714f c10714f) throws InvalidProtocolBufferException {
        C10713e m38308g = C10713e.m38308g(inputStream);
        MessageType messagetype = (MessageType) mo34086b(m38308g, c10714f);
        try {
            m38308g.m38326a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e2) {
            throw e2.m38253i(messagetype);
        }
    }

    /* renamed from: l */
    public MessageType m38268l(AbstractC10712d abstractC10712d, C10714f c10714f) throws InvalidProtocolBufferException {
        try {
            C10713e mo38291v = abstractC10712d.mo38291v();
            MessageType messagetype = (MessageType) mo34086b(mo38291v, c10714f);
            try {
                mo38291v.m38326a(0);
                return messagetype;
            } catch (InvalidProtocolBufferException e2) {
                throw e2.m38253i(messagetype);
            }
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }
}
