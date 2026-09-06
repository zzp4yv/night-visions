package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C0529y;
import androidx.savedstate.InterfaceC0674c;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: SavedStateViewModelFactory.java */
/* renamed from: androidx.lifecycle.v */
/* loaded from: classes.dex */
public final class C0526v extends C0529y.c {

    /* renamed from: a */
    private static final Class<?>[] f3501a = {Application.class, C0525u.class};

    /* renamed from: b */
    private static final Class<?>[] f3502b = {C0525u.class};

    /* renamed from: c */
    private final Application f3503c;

    /* renamed from: d */
    private final C0529y.b f3504d;

    /* renamed from: e */
    private final Bundle f3505e;

    /* renamed from: f */
    private final AbstractC0511g f3506f;

    /* renamed from: g */
    private final SavedStateRegistry f3507g;

    @SuppressLint({"LambdaLast"})
    public C0526v(Application application, InterfaceC0674c interfaceC0674c, Bundle bundle) {
        this.f3507g = interfaceC0674c.getSavedStateRegistry();
        this.f3506f = interfaceC0674c.getLifecycle();
        this.f3505e = bundle;
        this.f3503c = application;
        this.f3504d = application != null ? C0529y.a.m3917c(application) : C0529y.d.m3918b();
    }

    /* renamed from: d */
    private static <T> Constructor<T> m3902d(Class<T> cls, Class<?>[] clsArr) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.C0529y.c, androidx.lifecycle.C0529y.b
    /* renamed from: a */
    public <T extends AbstractC0528x> T mo3685a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo3904c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C0529y.e
    /* renamed from: b */
    void mo3903b(AbstractC0528x abstractC0528x) {
        SavedStateHandleController.m3837b(abstractC0528x, this.f3507g, this.f3506f);
    }

    @Override // androidx.lifecycle.C0529y.c
    /* renamed from: c */
    public <T extends AbstractC0528x> T mo3904c(String str, Class<T> cls) {
        T t;
        boolean isAssignableFrom = C0500a.class.isAssignableFrom(cls);
        Constructor m3902d = (!isAssignableFrom || this.f3503c == null) ? m3902d(cls, f3502b) : m3902d(cls, f3501a);
        if (m3902d == null) {
            return (T) this.f3504d.mo3685a(cls);
        }
        SavedStateHandleController m3838d = SavedStateHandleController.m3838d(this.f3507g, this.f3506f, str, this.f3505e);
        if (isAssignableFrom) {
            try {
                Application application = this.f3503c;
                if (application != null) {
                    t = (T) m3902d.newInstance(application, m3838d.m3841e());
                    t.m3914e("androidx.lifecycle.savedstate.vm.tag", m3838d);
                    return t;
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
            }
        }
        t = (T) m3902d.newInstance(m3838d.m3841e());
        t.m3914e("androidx.lifecycle.savedstate.vm.tag", m3838d);
        return t;
    }
}
