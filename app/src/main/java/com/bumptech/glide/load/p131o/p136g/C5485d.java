package com.bumptech.glide.load.p131o.p136g;

import android.util.Log;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5334c;
import com.bumptech.glide.load.InterfaceC5395k;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.p145r.C5554a;
import java.io.File;
import java.io.IOException;

/* compiled from: GifDrawableEncoder.java */
/* renamed from: com.bumptech.glide.load.o.g.d */
/* loaded from: classes.dex */
public class C5485d implements InterfaceC5395k<C5484c> {
    @Override // com.bumptech.glide.load.InterfaceC5395k
    /* renamed from: b */
    public EnumC5334c mo10454b(C5393i c5393i) {
        return EnumC5334c.SOURCE;
    }

    @Override // com.bumptech.glide.load.InterfaceC5335d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo10155a(InterfaceC5371u<C5484c> interfaceC5371u, File file, C5393i c5393i) {
        try {
            C5554a.m11017d(interfaceC5371u.get().m10740c(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }
}
