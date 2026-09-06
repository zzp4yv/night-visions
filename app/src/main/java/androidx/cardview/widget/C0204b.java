package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: CardViewApi21Impl.java */
/* renamed from: androidx.cardview.widget.b */
/* loaded from: classes.dex */
class C0204b implements InterfaceC0207e {
    C0204b() {
    }

    /* renamed from: p */
    private C0208f m1264p(InterfaceC0206d interfaceC0206d) {
        return (C0208f) interfaceC0206d.mo1260f();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: a */
    public void mo1265a(InterfaceC0206d interfaceC0206d, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        interfaceC0206d.mo1257c(new C0208f(colorStateList, f2));
        View mo1261g = interfaceC0206d.mo1261g();
        mo1261g.setClipToOutline(true);
        mo1261g.setElevation(f3);
        mo1278o(interfaceC0206d, f4);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: b */
    public void mo1266b(InterfaceC0206d interfaceC0206d, float f2) {
        m1264p(interfaceC0206d).m1289h(f2);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: c */
    public float mo1267c(InterfaceC0206d interfaceC0206d) {
        return interfaceC0206d.mo1261g().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: d */
    public float mo1268d(InterfaceC0206d interfaceC0206d) {
        return m1264p(interfaceC0206d).m1286d();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: e */
    public void mo1269e(InterfaceC0206d interfaceC0206d) {
        mo1278o(interfaceC0206d, mo1271g(interfaceC0206d));
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: f */
    public void mo1270f(InterfaceC0206d interfaceC0206d, float f2) {
        interfaceC0206d.mo1261g().setElevation(f2);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: g */
    public float mo1271g(InterfaceC0206d interfaceC0206d) {
        return m1264p(interfaceC0206d).m1285c();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: h */
    public ColorStateList mo1272h(InterfaceC0206d interfaceC0206d) {
        return m1264p(interfaceC0206d).m1284b();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: i */
    public void mo1273i(InterfaceC0206d interfaceC0206d) {
        if (!interfaceC0206d.mo1259e()) {
            interfaceC0206d.mo1255a(0, 0, 0, 0);
            return;
        }
        float mo1271g = mo1271g(interfaceC0206d);
        float mo1268d = mo1268d(interfaceC0206d);
        int ceil = (int) Math.ceil(C0209g.m1292c(mo1271g, mo1268d, interfaceC0206d.mo1258d()));
        int ceil2 = (int) Math.ceil(C0209g.m1293d(mo1271g, mo1268d, interfaceC0206d.mo1258d()));
        interfaceC0206d.mo1255a(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: j */
    public void mo1262j() {
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: k */
    public float mo1274k(InterfaceC0206d interfaceC0206d) {
        return mo1268d(interfaceC0206d) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: l */
    public float mo1275l(InterfaceC0206d interfaceC0206d) {
        return mo1268d(interfaceC0206d) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: m */
    public void mo1276m(InterfaceC0206d interfaceC0206d) {
        mo1278o(interfaceC0206d, mo1271g(interfaceC0206d));
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: n */
    public void mo1277n(InterfaceC0206d interfaceC0206d, ColorStateList colorStateList) {
        m1264p(interfaceC0206d).m1287f(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: o */
    public void mo1278o(InterfaceC0206d interfaceC0206d, float f2) {
        m1264p(interfaceC0206d).m1288g(f2, interfaceC0206d.mo1259e(), interfaceC0206d.mo1258d());
        mo1273i(interfaceC0206d);
    }
}
