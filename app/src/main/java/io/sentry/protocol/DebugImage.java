package io.sentry.protocol;

import io.sentry.C9485n2;
import io.sentry.InterfaceC9415h3;
import io.sentry.InterfaceC9471l2;
import io.sentry.InterfaceC9545r2;
import io.sentry.InterfaceC9637w1;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DebugImage implements InterfaceC9545r2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    /* renamed from: io.sentry.protocol.DebugImage$a */
    public static final class C9505a implements InterfaceC9471l2<DebugImage> {
        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            DebugImage debugImage = new DebugImage();
            c9485n2.m31884b();
            HashMap hashMap = null;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "debug_file":
                        debugImage.debugFile = c9485n2.m31090N0();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = c9485n2.m31090N0();
                        break;
                    case "image_size":
                        debugImage.imageSize = c9485n2.m31086G0();
                        break;
                    case "code_file":
                        debugImage.codeFile = c9485n2.m31090N0();
                        break;
                    case "arch":
                        debugImage.arch = c9485n2.m31090N0();
                        break;
                    case "type":
                        debugImage.type = c9485n2.m31090N0();
                        break;
                    case "uuid":
                        debugImage.uuid = c9485n2.m31090N0();
                        break;
                    case "debug_id":
                        debugImage.debugId = c9485n2.m31090N0();
                        break;
                    case "code_id":
                        debugImage.codeId = c9485n2.m31090N0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, hashMap, m31879B);
                        break;
                }
            }
            c9485n2.m31889j();
            debugImage.setUnknown(hashMap);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.uuid != null) {
            interfaceC9415h3.mo30828k("uuid").mo30819b(this.uuid);
        }
        if (this.type != null) {
            interfaceC9415h3.mo30828k("type").mo30819b(this.type);
        }
        if (this.debugId != null) {
            interfaceC9415h3.mo30828k("debug_id").mo30819b(this.debugId);
        }
        if (this.debugFile != null) {
            interfaceC9415h3.mo30828k("debug_file").mo30819b(this.debugFile);
        }
        if (this.codeId != null) {
            interfaceC9415h3.mo30828k("code_id").mo30819b(this.codeId);
        }
        if (this.codeFile != null) {
            interfaceC9415h3.mo30828k("code_file").mo30819b(this.codeFile);
        }
        if (this.imageAddr != null) {
            interfaceC9415h3.mo30828k("image_addr").mo30819b(this.imageAddr);
        }
        if (this.imageSize != null) {
            interfaceC9415h3.mo30828k("image_size").mo30822e(this.imageSize);
        }
        if (this.arch != null) {
            interfaceC9415h3.mo30828k("arch").mo30819b(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9415h3.mo30828k(str).mo30824g(interfaceC9637w1, this.unknown.get(str));
            }
        }
        interfaceC9415h3.mo30821d();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j2) {
        this.imageSize = Long.valueOf(j2);
    }
}
