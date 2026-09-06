package androidx.appcompat.app;

/* compiled from: TwilightCalculator.java */
/* renamed from: androidx.appcompat.app.m */
/* loaded from: classes.dex */
class C0076m {

    /* renamed from: a */
    private static C0076m f402a;

    /* renamed from: b */
    public long f403b;

    /* renamed from: c */
    public long f404c;

    /* renamed from: d */
    public int f405d;

    C0076m() {
    }

    /* renamed from: b */
    static C0076m m422b() {
        if (f402a == null) {
            f402a = new C0076m();
        }
        return f402a;
    }

    /* renamed from: a */
    public void m423a(long j2, double d2, double d3) {
        float f2 = (j2 - 946728000000L) / 8.64E7f;
        double d4 = (0.01720197f * f2) + 6.24006f;
        double sin = Math.sin(d4) * 0.03341960161924362d;
        Double.isNaN(d4);
        double sin2 = sin + d4 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        Double.isNaN(f2 - 9.0E-4f);
        double round = Math.round(r11 - r9) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = round + ((-d3) / 360.0d) + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * sin2) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d2;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.f405d = 1;
            this.f403b = -1L;
            this.f404c = -1L;
            return;
        }
        if (sin4 <= -1.0d) {
            this.f405d = 0;
            this.f403b = -1L;
            this.f404c = -1L;
            return;
        }
        double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
        Double.isNaN(acos);
        this.f403b = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
        Double.isNaN(acos);
        long round2 = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
        this.f404c = round2;
        if (round2 >= j2 || this.f403b <= j2) {
            this.f405d = 1;
        } else {
            this.f405d = 0;
        }
    }
}
