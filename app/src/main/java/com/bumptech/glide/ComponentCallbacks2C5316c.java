package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.EnumC5333b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.engine.C5361k;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5346h;
import com.bumptech.glide.load.engine.p125c0.C5353a;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.load.p127m.C5407k;
import com.bumptech.glide.load.p129n.C5416a;
import com.bumptech.glide.load.p129n.C5417b;
import com.bumptech.glide.load.p129n.C5418c;
import com.bumptech.glide.load.p129n.C5419d;
import com.bumptech.glide.load.p129n.C5420e;
import com.bumptech.glide.load.p129n.C5421f;
import com.bumptech.glide.load.p129n.C5422g;
import com.bumptech.glide.load.p129n.C5426k;
import com.bumptech.glide.load.p129n.C5434s;
import com.bumptech.glide.load.p129n.C5435t;
import com.bumptech.glide.load.p129n.C5436u;
import com.bumptech.glide.load.p129n.C5437v;
import com.bumptech.glide.load.p129n.C5438w;
import com.bumptech.glide.load.p129n.C5439x;
import com.bumptech.glide.load.p129n.p130y.C5440a;
import com.bumptech.glide.load.p129n.p130y.C5441b;
import com.bumptech.glide.load.p129n.p130y.C5442c;
import com.bumptech.glide.load.p129n.p130y.C5443d;
import com.bumptech.glide.load.p129n.p130y.C5444e;
import com.bumptech.glide.load.p131o.p132c.C5447a;
import com.bumptech.glide.load.p131o.p132c.C5448b;
import com.bumptech.glide.load.p131o.p132c.C5449c;
import com.bumptech.glide.load.p131o.p132c.C5452f;
import com.bumptech.glide.load.p131o.p132c.C5456j;
import com.bumptech.glide.load.p131o.p132c.C5458l;
import com.bumptech.glide.load.p131o.p132c.C5461o;
import com.bumptech.glide.load.p131o.p132c.C5466t;
import com.bumptech.glide.load.p131o.p132c.C5468v;
import com.bumptech.glide.load.p131o.p132c.C5470x;
import com.bumptech.glide.load.p131o.p132c.C5471y;
import com.bumptech.glide.load.p131o.p133d.C5472a;
import com.bumptech.glide.load.p131o.p134e.C5478e;
import com.bumptech.glide.load.p131o.p134e.C5479f;
import com.bumptech.glide.load.p131o.p135f.C5480a;
import com.bumptech.glide.load.p131o.p136g.C5482a;
import com.bumptech.glide.load.p131o.p136g.C5484c;
import com.bumptech.glide.load.p131o.p136g.C5485d;
import com.bumptech.glide.load.p131o.p136g.C5489h;
import com.bumptech.glide.load.p131o.p136g.C5491j;
import com.bumptech.glide.load.p131o.p137h.C5492a;
import com.bumptech.glide.load.p131o.p137h.C5493b;
import com.bumptech.glide.load.p131o.p137h.C5494c;
import com.bumptech.glide.load.p131o.p137h.C5495d;
import com.bumptech.glide.p122l.InterfaceC5327a;
import com.bumptech.glide.p138m.C5510l;
import com.bumptech.glide.p138m.InterfaceC5502d;
import com.bumptech.glide.p139n.C5518d;
import com.bumptech.glide.p139n.InterfaceC5516b;
import com.bumptech.glide.p141p.C5532h;
import com.bumptech.glide.p141p.InterfaceC5531g;
import com.bumptech.glide.p141p.p142l.C5540e;
import com.bumptech.glide.p141p.p142l.InterfaceC5544i;
import com.bumptech.glide.p145r.C5563j;
import com.bumptech.glide.p145r.C5564k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Glide.java */
/* renamed from: com.bumptech.glide.c */
/* loaded from: classes.dex */
public class ComponentCallbacks2C5316c implements ComponentCallbacks2 {

    /* renamed from: f */
    private static volatile ComponentCallbacks2C5316c f13041f;

    /* renamed from: g */
    private static volatile boolean f13042g;

    /* renamed from: h */
    private final C5361k f13043h;

    /* renamed from: i */
    private final InterfaceC5380e f13044i;

    /* renamed from: j */
    private final InterfaceC5346h f13045j;

    /* renamed from: k */
    private final C5353a f13046k;

    /* renamed from: l */
    private final C5318e f13047l;

    /* renamed from: m */
    private final Registry f13048m;

    /* renamed from: n */
    private final InterfaceC5377b f13049n;

    /* renamed from: o */
    private final C5510l f13050o;

    /* renamed from: p */
    private final InterfaceC5502d f13051p;

    /* renamed from: q */
    private final List<C5322i> f13052q = new ArrayList();

    /* renamed from: r */
    private EnumC5319f f13053r = EnumC5319f.NORMAL;

    ComponentCallbacks2C5316c(Context context, C5361k c5361k, InterfaceC5346h interfaceC5346h, InterfaceC5380e interfaceC5380e, InterfaceC5377b interfaceC5377b, C5510l c5510l, InterfaceC5502d interfaceC5502d, int i2, C5532h c5532h, Map<Class<?>, AbstractC5323j<?, ?>> map, List<InterfaceC5531g<Object>> list, boolean z) {
        this.f13043h = c5361k;
        this.f13044i = interfaceC5380e;
        this.f13049n = interfaceC5377b;
        this.f13045j = interfaceC5346h;
        this.f13050o = c5510l;
        this.f13051p = interfaceC5502d;
        this.f13046k = new C5353a(interfaceC5346h, interfaceC5380e, (EnumC5333b) c5532h.m10914r().m10449a(C5458l.f13738a));
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f13048m = registry;
        registry.m9965o(new C5456j());
        if (Build.VERSION.SDK_INT >= 27) {
            registry.m9965o(new C5461o());
        }
        List<ImageHeaderParser> m9957g = registry.m9957g();
        C5458l c5458l = new C5458l(m9957g, resources.getDisplayMetrics(), interfaceC5380e, interfaceC5377b);
        C5482a c5482a = new C5482a(context, m9957g, interfaceC5380e, interfaceC5377b);
        InterfaceC5394j<ParcelFileDescriptor, Bitmap> m10694g = C5471y.m10694g(interfaceC5380e);
        C5452f c5452f = new C5452f(c5458l);
        C5468v c5468v = new C5468v(c5458l, interfaceC5377b);
        C5478e c5478e = new C5478e(context);
        C5434s.c cVar = new C5434s.c(resources);
        C5434s.d dVar = new C5434s.d(resources);
        C5434s.b bVar = new C5434s.b(resources);
        C5434s.a aVar = new C5434s.a(resources);
        C5449c c5449c = new C5449c(interfaceC5377b);
        C5492a c5492a = new C5492a();
        C5495d c5495d = new C5495d();
        ContentResolver contentResolver = context.getContentResolver();
        Registry m9966p = registry.m9952a(ByteBuffer.class, new C5418c()).m9952a(InputStream.class, new C5435t(interfaceC5377b)).m9956e("Bitmap", ByteBuffer.class, Bitmap.class, c5452f).m9956e("Bitmap", InputStream.class, Bitmap.class, c5468v).m9956e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m10694g).m9956e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C5471y.m10690c(interfaceC5380e)).m9955d(Bitmap.class, Bitmap.class, C5437v.a.m10586a()).m9956e("Bitmap", Bitmap.class, Bitmap.class, new C5470x()).m9953b(Bitmap.class, c5449c).m9956e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C5447a(resources, c5452f)).m9956e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C5447a(resources, c5468v)).m9956e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C5447a(resources, m10694g)).m9953b(BitmapDrawable.class, new C5448b(interfaceC5380e, c5449c)).m9956e("Gif", InputStream.class, C5484c.class, new C5491j(m9957g, c5482a, interfaceC5377b)).m9956e("Gif", ByteBuffer.class, C5484c.class, c5482a).m9953b(C5484c.class, new C5485d()).m9955d(InterfaceC5327a.class, InterfaceC5327a.class, C5437v.a.m10586a()).m9956e("Bitmap", InterfaceC5327a.class, Bitmap.class, new C5489h(interfaceC5380e)).m9954c(Uri.class, Drawable.class, c5478e).m9954c(Uri.class, Bitmap.class, new C5466t(c5478e, interfaceC5380e)).m9966p(new C5472a.a()).m9955d(File.class, ByteBuffer.class, new C5419d.b()).m9955d(File.class, InputStream.class, new C5421f.e()).m9954c(File.class, File.class, new C5480a()).m9955d(File.class, ParcelFileDescriptor.class, new C5421f.b()).m9955d(File.class, File.class, C5437v.a.m10586a()).m9966p(new C5407k.a(interfaceC5377b));
        Class cls = Integer.TYPE;
        m9966p.m9955d(cls, InputStream.class, cVar).m9955d(cls, ParcelFileDescriptor.class, bVar).m9955d(Integer.class, InputStream.class, cVar).m9955d(Integer.class, ParcelFileDescriptor.class, bVar).m9955d(Integer.class, Uri.class, dVar).m9955d(cls, AssetFileDescriptor.class, aVar).m9955d(Integer.class, AssetFileDescriptor.class, aVar).m9955d(cls, Uri.class, dVar).m9955d(String.class, InputStream.class, new C5420e.c()).m9955d(Uri.class, InputStream.class, new C5420e.c()).m9955d(String.class, InputStream.class, new C5436u.c()).m9955d(String.class, ParcelFileDescriptor.class, new C5436u.b()).m9955d(String.class, AssetFileDescriptor.class, new C5436u.a()).m9955d(Uri.class, InputStream.class, new C5441b.a()).m9955d(Uri.class, InputStream.class, new C5416a.c(context.getAssets())).m9955d(Uri.class, ParcelFileDescriptor.class, new C5416a.b(context.getAssets())).m9955d(Uri.class, InputStream.class, new C5442c.a(context)).m9955d(Uri.class, InputStream.class, new C5443d.a(context)).m9955d(Uri.class, InputStream.class, new C5438w.d(contentResolver)).m9955d(Uri.class, ParcelFileDescriptor.class, new C5438w.b(contentResolver)).m9955d(Uri.class, AssetFileDescriptor.class, new C5438w.a(contentResolver)).m9955d(Uri.class, InputStream.class, new C5439x.a()).m9955d(URL.class, InputStream.class, new C5444e.a()).m9955d(Uri.class, File.class, new C5426k.a(context)).m9955d(C5422g.class, InputStream.class, new C5440a.a()).m9955d(byte[].class, ByteBuffer.class, new C5417b.a()).m9955d(byte[].class, InputStream.class, new C5417b.d()).m9955d(Uri.class, Uri.class, C5437v.a.m10586a()).m9955d(Drawable.class, Drawable.class, C5437v.a.m10586a()).m9954c(Drawable.class, Drawable.class, new C5479f()).m9967q(Bitmap.class, BitmapDrawable.class, new C5493b(resources)).m9967q(Bitmap.class, byte[].class, c5492a).m9967q(Drawable.class, byte[].class, new C5494c(interfaceC5380e, c5492a, c5495d)).m9967q(C5484c.class, byte[].class, c5495d);
        this.f13047l = new C5318e(context, interfaceC5377b, registry, new C5540e(), c5532h, map, list, c5361k, z, i2);
    }

    /* renamed from: a */
    private static void m9971a(Context context) {
        if (f13042g) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f13042g = true;
        m9975m(context);
        f13042g = false;
    }

    /* renamed from: c */
    public static ComponentCallbacks2C5316c m9972c(Context context) {
        if (f13041f == null) {
            synchronized (ComponentCallbacks2C5316c.class) {
                if (f13041f == null) {
                    m9971a(context);
                }
            }
        }
        return f13041f;
    }

    /* renamed from: d */
    private static AbstractC5314a m9973d() {
        try {
            return (AbstractC5314a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e2) {
            m9977q(e2);
            return null;
        } catch (InstantiationException e3) {
            m9977q(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            m9977q(e4);
            return null;
        } catch (InvocationTargetException e5) {
            m9977q(e5);
            return null;
        }
    }

    /* renamed from: l */
    private static C5510l m9974l(Context context) {
        C5563j.m11043e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m9972c(context).m9987k();
    }

    /* renamed from: m */
    private static void m9975m(Context context) {
        m9976n(context, new C5317d());
    }

    /* renamed from: n */
    private static void m9976n(Context context, C5317d c5317d) {
        Context applicationContext = context.getApplicationContext();
        AbstractC5314a m9973d = m9973d();
        List<InterfaceC5516b> emptyList = Collections.emptyList();
        if (m9973d == null || m9973d.m10838c()) {
            emptyList = new C5518d(applicationContext).m10842a();
        }
        if (m9973d != null && !m9973d.m9969d().isEmpty()) {
            Set<Class<?>> m9969d = m9973d.m9969d();
            Iterator<InterfaceC5516b> it = emptyList.iterator();
            while (it.hasNext()) {
                InterfaceC5516b next = it.next();
                if (m9969d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC5516b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        c5317d.m9996e(m9973d != null ? m9973d.m9970e() : null);
        Iterator<InterfaceC5516b> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().applyOptions(applicationContext, c5317d);
        }
        if (m9973d != null) {
            m9973d.m10837b(applicationContext, c5317d);
        }
        ComponentCallbacks2C5316c m9992a = c5317d.m9992a(applicationContext);
        Iterator<InterfaceC5516b> it4 = emptyList.iterator();
        while (it4.hasNext()) {
            it4.next().registerComponents(applicationContext, m9992a, m9992a.f13048m);
        }
        if (m9973d != null) {
            m9973d.m10839a(applicationContext, m9992a, m9992a.f13048m);
        }
        applicationContext.registerComponentCallbacks(m9992a);
        f13041f = m9992a;
    }

    /* renamed from: q */
    private static void m9977q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static C5322i m9978t(Context context) {
        return m9974l(context).m10810d(context);
    }

    /* renamed from: u */
    public static C5322i m9979u(Fragment fragment) {
        return m9974l(fragment.getActivity()).m10811e(fragment);
    }

    /* renamed from: b */
    public void m9980b() {
        C5564k.m11045b();
        this.f13045j.m10198b();
        this.f13044i.mo10386b();
        this.f13049n.mo10366b();
    }

    /* renamed from: e */
    public InterfaceC5377b m9981e() {
        return this.f13049n;
    }

    /* renamed from: f */
    public InterfaceC5380e m9982f() {
        return this.f13044i;
    }

    /* renamed from: g */
    InterfaceC5502d m9983g() {
        return this.f13051p;
    }

    /* renamed from: h */
    public Context m9984h() {
        return this.f13047l.getBaseContext();
    }

    /* renamed from: i */
    C5318e m9985i() {
        return this.f13047l;
    }

    /* renamed from: j */
    public Registry m9986j() {
        return this.f13048m;
    }

    /* renamed from: k */
    public C5510l m9987k() {
        return this.f13050o;
    }

    /* renamed from: o */
    void m9988o(C5322i c5322i) {
        synchronized (this.f13052q) {
            if (this.f13052q.contains(c5322i)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f13052q.add(c5322i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m9980b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        m9990r(i2);
    }

    /* renamed from: p */
    boolean m9989p(InterfaceC5544i<?> interfaceC5544i) {
        synchronized (this.f13052q) {
            Iterator<C5322i> it = this.f13052q.iterator();
            while (it.hasNext()) {
                if (it.next().m10047p(interfaceC5544i)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void m9990r(int i2) {
        C5564k.m11045b();
        this.f13045j.mo10190a(i2);
        this.f13044i.mo10385a(i2);
        this.f13049n.mo10365a(i2);
    }

    /* renamed from: s */
    void m9991s(C5322i c5322i) {
        synchronized (this.f13052q) {
            if (!this.f13052q.contains(c5322i)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f13052q.remove(c5322i);
        }
    }
}
