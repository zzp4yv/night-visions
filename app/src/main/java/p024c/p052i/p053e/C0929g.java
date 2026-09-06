package p024c.p052i.p053e;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.p003d.C0260c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p024c.p052i.p057h.C0943f;

/* compiled from: TypefaceCompatApi26Impl.java */
/* renamed from: c.i.e.g */
/* loaded from: classes.dex */
public class C0929g extends C0927e {

    /* renamed from: g */
    protected final Class<?> f6303g;

    /* renamed from: h */
    protected final Constructor<?> f6304h;

    /* renamed from: i */
    protected final Method f6305i;

    /* renamed from: j */
    protected final Method f6306j;

    /* renamed from: k */
    protected final Method f6307k;

    /* renamed from: l */
    protected final Method f6308l;

    /* renamed from: m */
    protected final Method f6309m;

    public C0929g() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> m5942y = m5942y();
            constructor = m5943z(m5942y);
            method2 = m5939v(m5942y);
            method3 = m5940w(m5942y);
            method4 = m5935A(m5942y);
            method5 = m5938u(m5942y);
            method = mo5941x(m5942y);
            cls = m5942y;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f6303g = cls;
        this.f6304h = constructor;
        this.f6305i = method2;
        this.f6306j = method3;
        this.f6307k = method4;
        this.f6308l = method5;
        this.f6309m = method;
    }

    /* renamed from: o */
    private Object m5929o() {
        try {
            return this.f6304h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m5930p(Object obj) {
        try {
            this.f6308l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m5931q(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f6305i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m5932r(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f6306j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m5933s(Object obj) {
        try {
            return ((Boolean) this.f6307k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m5934t() {
        if (this.f6305i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f6305i != null;
    }

    /* renamed from: A */
    protected Method m5935A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // p024c.p052i.p053e.C0927e, p024c.p052i.p053e.C0932j
    /* renamed from: b */
    public Typeface mo5923b(Context context, C0260c.b bVar, Resources resources, int i2) {
        if (!m5934t()) {
            return super.mo5923b(context, bVar, resources, i2);
        }
        Object m5929o = m5929o();
        if (m5929o == null) {
            return null;
        }
        for (C0260c.c cVar : bVar.m1730a()) {
            if (!m5931q(context, m5929o, cVar.m1731a(), cVar.m1733c(), cVar.m1735e(), cVar.m1736f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.m1734d()))) {
                m5930p(m5929o);
                return null;
            }
        }
        if (m5933s(m5929o)) {
            return mo5937l(m5929o);
        }
        return null;
    }

    @Override // p024c.p052i.p053e.C0927e, p024c.p052i.p053e.C0932j
    /* renamed from: c */
    public Typeface mo5924c(Context context, CancellationSignal cancellationSignal, C0943f.b[] bVarArr, int i2) {
        Typeface mo5937l;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m5934t()) {
            C0943f.b mo5945h = mo5945h(bVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo5945h.m6003d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo5945h.m6004e()).setItalic(mo5945h.m6005f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable unused) {
                    }
                }
            } catch (IOException unused2) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m5964h = C0933k.m5964h(context, bVarArr, cancellationSignal);
        Object m5929o = m5929o();
        if (m5929o == null) {
            return null;
        }
        boolean z = false;
        for (C0943f.b bVar : bVarArr) {
            ByteBuffer byteBuffer = m5964h.get(bVar.m6003d());
            if (byteBuffer != null) {
                if (!m5932r(m5929o, byteBuffer, bVar.m6002c(), bVar.m6004e(), bVar.m6005f() ? 1 : 0)) {
                    m5930p(m5929o);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m5930p(m5929o);
            return null;
        }
        if (m5933s(m5929o) && (mo5937l = mo5937l(m5929o)) != null) {
            return Typeface.create(mo5937l, i2);
        }
        return null;
    }

    @Override // p024c.p052i.p053e.C0932j
    /* renamed from: e */
    public Typeface mo5936e(Context context, Resources resources, int i2, String str, int i3) {
        if (!m5934t()) {
            return super.mo5936e(context, resources, i2, str, i3);
        }
        Object m5929o = m5929o();
        if (m5929o == null) {
            return null;
        }
        if (!m5931q(context, m5929o, str, 0, -1, -1, null)) {
            m5930p(m5929o);
            return null;
        }
        if (m5933s(m5929o)) {
            return mo5937l(m5929o);
        }
        return null;
    }

    /* renamed from: l */
    protected Typeface mo5937l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f6303g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f6309m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: u */
    protected Method m5938u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: v */
    protected Method m5939v(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: w */
    protected Method m5940w(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: x */
    protected Method mo5941x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: y */
    protected Class<?> m5942y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: z */
    protected Constructor<?> m5943z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
