package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class GestureDetectorCompat {

    /* renamed from: a */
    private final InterfaceC0277a f2260a;

    /* renamed from: androidx.core.view.GestureDetectorCompat$a */
    interface InterfaceC0277a {
        /* renamed from: a */
        boolean mo1844a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.core.view.GestureDetectorCompat$b */
    static class C0278b implements InterfaceC0277a {

        /* renamed from: a */
        private static final int f2261a = ViewConfiguration.getTapTimeout();

        /* renamed from: b */
        private static final int f2262b = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: c */
        private int f2263c;

        /* renamed from: d */
        private int f2264d;

        /* renamed from: e */
        private int f2265e;

        /* renamed from: f */
        private int f2266f;

        /* renamed from: g */
        private final Handler f2267g;

        /* renamed from: h */
        final GestureDetector.OnGestureListener f2268h;

        /* renamed from: i */
        GestureDetector.OnDoubleTapListener f2269i;

        /* renamed from: j */
        boolean f2270j;

        /* renamed from: k */
        boolean f2271k;

        /* renamed from: l */
        private boolean f2272l;

        /* renamed from: m */
        private boolean f2273m;

        /* renamed from: n */
        private boolean f2274n;

        /* renamed from: o */
        MotionEvent f2275o;

        /* renamed from: p */
        private MotionEvent f2276p;

        /* renamed from: q */
        private boolean f2277q;

        /* renamed from: r */
        private float f2278r;

        /* renamed from: s */
        private float f2279s;

        /* renamed from: t */
        private float f2280t;

        /* renamed from: u */
        private float f2281u;

        /* renamed from: v */
        private boolean f2282v;

        /* renamed from: w */
        private VelocityTracker f2283w;

        C0278b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f2267g = new a(handler);
            } else {
                this.f2267g = new a();
            }
            this.f2268h = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                m1850g((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m1847e(context);
        }

        /* renamed from: b */
        private void m1845b() {
            this.f2267g.removeMessages(1);
            this.f2267g.removeMessages(2);
            this.f2267g.removeMessages(3);
            this.f2283w.recycle();
            this.f2283w = null;
            this.f2277q = false;
            this.f2270j = false;
            this.f2273m = false;
            this.f2274n = false;
            this.f2271k = false;
            if (this.f2272l) {
                this.f2272l = false;
            }
        }

        /* renamed from: c */
        private void m1846c() {
            this.f2267g.removeMessages(1);
            this.f2267g.removeMessages(2);
            this.f2267g.removeMessages(3);
            this.f2277q = false;
            this.f2273m = false;
            this.f2274n = false;
            this.f2271k = false;
            if (this.f2272l) {
                this.f2272l = false;
            }
        }

        /* renamed from: e */
        private void m1847e(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f2268h == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.f2282v = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f2265e = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f2266f = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2263c = scaledTouchSlop * scaledTouchSlop;
            this.f2264d = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        /* renamed from: f */
        private boolean m1848f(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f2274n || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f2262b) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f2264d;
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x021f  */
        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC0277a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo1844a(android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 593
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.GestureDetectorCompat.C0278b.mo1844a(android.view.MotionEvent):boolean");
        }

        /* renamed from: d */
        void m1849d() {
            this.f2267g.removeMessages(3);
            this.f2271k = false;
            this.f2272l = true;
            this.f2268h.onLongPress(this.f2275o);
        }

        /* renamed from: g */
        public void m1850g(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f2269i = onDoubleTapListener;
        }

        /* renamed from: androidx.core.view.GestureDetectorCompat$b$a */
        private class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    C0278b c0278b = C0278b.this;
                    c0278b.f2268h.onShowPress(c0278b.f2275o);
                    return;
                }
                if (i2 == 2) {
                    C0278b.this.m1849d();
                    return;
                }
                if (i2 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                C0278b c0278b2 = C0278b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = c0278b2.f2269i;
                if (onDoubleTapListener != null) {
                    if (c0278b2.f2270j) {
                        c0278b2.f2271k = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(c0278b2.f2275o);
                    }
                }
            }

            a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* renamed from: androidx.core.view.GestureDetectorCompat$c */
    static class C0279c implements InterfaceC0277a {

        /* renamed from: a */
        private final GestureDetector f2285a;

        C0279c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f2285a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC0277a
        /* renamed from: a */
        public boolean mo1844a(MotionEvent motionEvent) {
            return this.f2285a.onTouchEvent(motionEvent);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean m1843a(MotionEvent motionEvent) {
        return this.f2260a.mo1844a(motionEvent);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f2260a = new C0279c(context, onGestureListener, handler);
        } else {
            this.f2260a = new C0278b(context, onGestureListener, handler);
        }
    }
}
