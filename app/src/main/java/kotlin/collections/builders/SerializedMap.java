package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C10775p0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;

/* compiled from: MapBuilder.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m32267d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "()V", "map", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Map;)V", "readExternal", HttpUrl.FRAGMENT_ENCODE_SET, "input", "Ljava/io/ObjectInput;", "readResolve", HttpUrl.FRAGMENT_ENCODE_SET, "writeExternal", "output", "Ljava/io/ObjectOutput;", "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.w.z0.i, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class SerializedMap implements Externalizable {

    /* renamed from: f */
    public static final a f41514f = new a(null);

    /* renamed from: g */
    private Map<?, ?> f41515g;

    /* compiled from: MapBuilder.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m32267d2 = {"Lkotlin/collections/builders/SerializedMap$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "serialVersionUID", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.w.z0.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public SerializedMap(Map<?, ?> map) {
        C9768m.m32346f(map, "map");
        this.f41515g = map;
    }

    private final Object readResolve() {
        return this.f41515g;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        Map m38792d;
        Map<?, ?> m38790b;
        C9768m.m32346f(input, "input");
        byte readByte = input.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
        }
        int readInt = input.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        m38792d = C10775p0.m38792d(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            m38792d.put(input.readObject(), input.readObject());
        }
        m38790b = C10775p0.m38790b(m38792d);
        this.f41515g = m38790b;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) {
        C9768m.m32346f(output, "output");
        output.writeByte(0);
        output.writeInt(this.f41515g.size());
        for (Map.Entry<?, ?> entry : this.f41515g.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SerializedMap() {
        /*
            r1 = this;
            java.util.Map r0 = kotlin.collections.C10771n0.m38778i()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.SerializedMap.<init>():void");
    }
}
