package com.bumptech.glide.load.p129n;

import android.util.Log;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5335d;
import com.bumptech.glide.p145r.C5554a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferEncoder.java */
/* renamed from: com.bumptech.glide.load.n.c */
/* loaded from: classes.dex */
public class C5418c implements InterfaceC5335d<ByteBuffer> {
    @Override // com.bumptech.glide.load.InterfaceC5335d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo10155a(ByteBuffer byteBuffer, File file, C5393i c5393i) {
        try {
            C5554a.m11017d(byteBuffer, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }
}
