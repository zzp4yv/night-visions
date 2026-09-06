package com.google.zxing.p228k.p230c;

import com.google.zxing.p228k.p229b.C8651c;
import com.google.zxing.p228k.p229b.EnumC8649a;
import com.google.zxing.p228k.p229b.EnumC8650b;

/* compiled from: QRCode.java */
/* renamed from: com.google.zxing.k.c.f */
/* loaded from: classes2.dex */
public final class C8657f {

    /* renamed from: a */
    private EnumC8650b f32963a;

    /* renamed from: b */
    private EnumC8649a f32964b;

    /* renamed from: c */
    private C8651c f32965c;

    /* renamed from: d */
    private int f32966d = -1;

    /* renamed from: e */
    private C8653b f32967e;

    /* renamed from: b */
    public static boolean m27508b(int i2) {
        return i2 >= 0 && i2 < 8;
    }

    /* renamed from: a */
    public C8653b m27509a() {
        return this.f32967e;
    }

    /* renamed from: c */
    public void m27510c(EnumC8649a enumC8649a) {
        this.f32964b = enumC8649a;
    }

    /* renamed from: d */
    public void m27511d(int i2) {
        this.f32966d = i2;
    }

    /* renamed from: e */
    public void m27512e(C8653b c8653b) {
        this.f32967e = c8653b;
    }

    /* renamed from: f */
    public void m27513f(EnumC8650b enumC8650b) {
        this.f32963a = enumC8650b;
    }

    /* renamed from: g */
    public void m27514g(C8651c c8651c) {
        this.f32965c = c8651c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f32963a);
        sb.append("\n ecLevel: ");
        sb.append(this.f32964b);
        sb.append("\n version: ");
        sb.append(this.f32965c);
        sb.append("\n maskPattern: ");
        sb.append(this.f32966d);
        if (this.f32967e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f32967e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
