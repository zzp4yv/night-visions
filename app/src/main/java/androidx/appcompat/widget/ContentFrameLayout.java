package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.C0311u;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f */
    private TypedValue f839f;

    /* renamed from: g */
    private TypedValue f840g;

    /* renamed from: h */
    private TypedValue f841h;

    /* renamed from: i */
    private TypedValue f842i;

    /* renamed from: j */
    private TypedValue f843j;

    /* renamed from: k */
    private TypedValue f844k;

    /* renamed from: l */
    private final Rect f845l;

    /* renamed from: m */
    private InterfaceC0125a f846m;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0125a {
        /* renamed from: a */
        void mo365a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m771a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: b */
    public void m772b(int i2, int i3, int i4, int i5) {
        this.f845l.set(i2, i3, i4, i5);
        if (C0311u.m2102O(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f843j == null) {
            this.f843j = new TypedValue();
        }
        return this.f843j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f844k == null) {
            this.f844k = new TypedValue();
        }
        return this.f844k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f841h == null) {
            this.f841h = new TypedValue();
        }
        return this.f841h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f842i == null) {
            this.f842i = new TypedValue();
        }
        return this.f842i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f839f == null) {
            this.f839f = new TypedValue();
        }
        return this.f839f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f840g == null) {
            this.f840g = new TypedValue();
        }
        return this.f840g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0125a interfaceC0125a = this.f846m;
        if (interfaceC0125a != null) {
            interfaceC0125a.mo365a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0125a interfaceC0125a = this.f846m;
        if (interfaceC0125a != null) {
            interfaceC0125a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0125a interfaceC0125a) {
        this.f846m = interfaceC0125a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f845l = new Rect();
    }
}
