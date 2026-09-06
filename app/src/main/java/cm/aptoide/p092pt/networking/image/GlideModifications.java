package cm.aptoide.p092pt.networking.image;

import android.content.Context;
import com.bumptech.glide.C5317d;
import com.bumptech.glide.ComponentCallbacks2C5316c;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.EnumC5333b;
import com.bumptech.glide.load.engine.p123a0.C5345g;
import com.bumptech.glide.load.engine.p123a0.C5347i;
import com.bumptech.glide.load.engine.p126z.C5386k;
import com.bumptech.glide.p139n.InterfaceC5516b;
import com.bumptech.glide.p141p.C5532h;

/* loaded from: classes.dex */
public class GlideModifications implements InterfaceC5516b {
    @Override // com.bumptech.glide.p139n.InterfaceC5516b
    public void applyOptions(Context context, C5317d c5317d) {
        c5317d.m9994c(C5532h.m10945u0(EnumC5333b.PREFER_RGB_565));
        C5347i m10206a = new C5347i.a(context).m10206a();
        c5317d.m9995d(new C5345g(m10206a.m10205d()));
        c5317d.m9993b(new C5386k(m10206a.m10204b()));
    }

    @Override // com.bumptech.glide.p139n.InterfaceC5516b
    public void registerComponents(Context context, ComponentCallbacks2C5316c componentCallbacks2C5316c, Registry registry) {
    }
}
