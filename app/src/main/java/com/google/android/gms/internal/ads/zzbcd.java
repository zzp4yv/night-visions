package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzbcd extends zzbco implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: h */
    private static final Map<Integer, String> f22770h;

    /* renamed from: i */
    private final zzbdg f22771i;

    /* renamed from: j */
    private final boolean f22772j;

    /* renamed from: k */
    private int f22773k;

    /* renamed from: l */
    private int f22774l;

    /* renamed from: m */
    private MediaPlayer f22775m;

    /* renamed from: n */
    private Uri f22776n;

    /* renamed from: o */
    private int f22777o;

    /* renamed from: p */
    private int f22778p;

    /* renamed from: q */
    private int f22779q;

    /* renamed from: r */
    private int f22780r;

    /* renamed from: s */
    private int f22781s;

    /* renamed from: t */
    private zzbdd f22782t;

    /* renamed from: u */
    private boolean f22783u;

    /* renamed from: v */
    private int f22784v;

    /* renamed from: w */
    private zzbcn f22785w;

    static {
        HashMap hashMap = new HashMap();
        f22770h = hashMap;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            hashMap.put(-1004, "MEDIA_ERROR_IO");
            hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
            hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
            hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i2 >= 19) {
            hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzbcd(Context context, boolean z, boolean z2, zzbde zzbdeVar, zzbdg zzbdgVar) {
        super(context);
        this.f22773k = 0;
        this.f22774l = 0;
        setSurfaceTextureListener(this);
        this.f22771i = zzbdgVar;
        this.f22783u = z;
        this.f22772j = z2;
        zzbdgVar.m17484b(this);
    }

    /* renamed from: t */
    private final void m17402t(boolean z) {
        zzawz.m17082m("AdMediaPlayerView release");
        zzbdd zzbddVar = this.f22782t;
        if (zzbddVar != null) {
            zzbddVar.m17477j();
            this.f22782t = null;
        }
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f22775m.release();
            this.f22775m = null;
            m17403u(0);
            if (z) {
                this.f22774l = 0;
                this.f22774l = 0;
            }
        }
    }

    /* renamed from: u */
    private final void m17403u(int i2) {
        if (i2 == 3) {
            this.f22771i.m17487e();
            this.f22787g.m17493d();
        } else if (this.f22773k == 3) {
            this.f22771i.m17488f();
            this.f22787g.m17494e();
        }
        this.f22773k = i2;
    }

    /* renamed from: w */
    private final void m17404w(float f2) {
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer == null) {
            zzbad.m17353i("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: x */
    private final void m17405x() {
        zzawz.m17082m("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f22776n == null || surfaceTexture == null) {
            return;
        }
        m17402t(false);
        try {
            zzk.zzlw();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f22775m = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f22775m.setOnCompletionListener(this);
            this.f22775m.setOnErrorListener(this);
            this.f22775m.setOnInfoListener(this);
            this.f22775m.setOnPreparedListener(this);
            this.f22775m.setOnVideoSizeChangedListener(this);
            this.f22779q = 0;
            if (this.f22783u) {
                zzbdd zzbddVar = new zzbdd(getContext());
                this.f22782t = zzbddVar;
                zzbddVar.m17474b(surfaceTexture, getWidth(), getHeight());
                this.f22782t.start();
                SurfaceTexture m17478k = this.f22782t.m17478k();
                if (m17478k != null) {
                    surfaceTexture = m17478k;
                } else {
                    this.f22782t.m17477j();
                    this.f22782t = null;
                }
            }
            this.f22775m.setDataSource(getContext(), this.f22776n);
            zzk.zzlx();
            this.f22775m.setSurface(new Surface(surfaceTexture));
            this.f22775m.setAudioStreamType(3);
            this.f22775m.setScreenOnWhilePlaying(true);
            this.f22775m.prepareAsync();
            m17403u(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
            String valueOf = String.valueOf(this.f22776n);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(valueOf);
            zzbad.m17348d(sb.toString(), e2);
            onError(this.f22775m, 1, 0);
        }
    }

    /* renamed from: y */
    private final void m17406y() {
        if (this.f22772j && m17407z() && this.f22775m.getCurrentPosition() > 0 && this.f22774l != 3) {
            zzawz.m17082m("AdMediaPlayerView nudging MediaPlayer");
            m17404w(0.0f);
            this.f22775m.start();
            int currentPosition = this.f22775m.getCurrentPosition();
            long mo14608a = zzk.zzln().mo14608a();
            while (m17407z() && this.f22775m.getCurrentPosition() == currentPosition && zzk.zzln().mo14608a() - mo14608a <= 250) {
            }
            this.f22775m.pause();
            mo15161b();
        }
    }

    /* renamed from: z */
    private final boolean m17407z() {
        int i2;
        return (this.f22775m == null || (i2 = this.f22773k) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbco, com.google.android.gms.internal.ads.InterfaceC6668g8
    /* renamed from: b */
    public final void mo15161b() {
        m17404w(this.f22787g.m17490a());
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: c */
    public final void mo17408c() {
        zzawz.m17082m("AdMediaPlayerView pause");
        if (m17407z() && this.f22775m.isPlaying()) {
            this.f22775m.pause();
            m17403u(4);
            zzaxi.f22654a.post(new RunnableC7222v7(this));
        }
        this.f22774l = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: d */
    public final void mo17409d() {
        zzawz.m17082m("AdMediaPlayerView play");
        if (m17407z()) {
            this.f22775m.start();
            m17403u(3);
            this.f22786f.m17465b();
            zzaxi.f22654a.post(new RunnableC7185u7(this));
        }
        this.f22774l = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getCurrentPosition() {
        if (m17407z()) {
            return this.f22775m.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getDuration() {
        if (m17407z()) {
            return this.f22775m.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: h */
    public final void mo17410h(int i2) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        zzawz.m17082m(sb.toString());
        if (!m17407z()) {
            this.f22784v = i2;
        } else {
            this.f22775m.seekTo(i2);
            this.f22784v = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: i */
    public final void mo17411i() {
        zzawz.m17082m("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f22775m.release();
            this.f22775m = null;
            m17403u(0);
            this.f22774l = 0;
        }
        this.f22771i.m17483a();
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: j */
    public final void mo17412j(float f2, float f3) {
        zzbdd zzbddVar = this.f22782t;
        if (zzbddVar != null) {
            zzbddVar.m17475e(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: k */
    public final void mo17413k(zzbcn zzbcnVar) {
        this.f22785w = zzbcnVar;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.f22779q = i2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzawz.m17082m("AdMediaPlayerView completion");
        m17403u(5);
        this.f22774l = 5;
        zzaxi.f22654a.post(new RunnableC7000p7(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        Map<Integer, String> map = f22770h;
        String str = map.get(Integer.valueOf(i2));
        String str2 = map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzbad.m17353i(sb.toString());
        m17403u(-1);
        this.f22774l = -1;
        zzaxi.f22654a.post(new RunnableC7037q7(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        Map<Integer, String> map = f22770h;
        String str = map.get(Integer.valueOf(i2));
        String str2 = map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzawz.m17082m(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r1 > r6) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f22777o
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f22778p
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f22777o
            if (r2 <= 0) goto L83
            int r2 = r5.f22778p
            if (r2 <= 0) goto L83
            com.google.android.gms.internal.ads.zzbdd r2 = r5.f22782t
            if (r2 != 0) goto L83
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L47
            if (r1 != r2) goto L47
            int r0 = r5.f22777o
            int r1 = r0 * r7
            int r2 = r5.f22778p
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r0 * r7
            int r0 = r0 / r2
            goto L6a
        L3c:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L67
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L58
        L47:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L5a
            int r0 = r5.f22778p
            int r0 = r0 * r6
            int r2 = r5.f22777o
            int r0 = r0 / r2
            if (r1 != r3) goto L57
            if (r0 <= r7) goto L57
            goto L67
        L57:
            r1 = r0
        L58:
            r0 = r6
            goto L83
        L5a:
            if (r1 != r2) goto L6c
            int r1 = r5.f22777o
            int r1 = r1 * r7
            int r2 = r5.f22778p
            int r1 = r1 / r2
            if (r0 != r3) goto L69
            if (r1 <= r6) goto L69
        L67:
            r0 = r6
            goto L6a
        L69:
            r0 = r1
        L6a:
            r1 = r7
            goto L83
        L6c:
            int r2 = r5.f22777o
            int r4 = r5.f22778p
            if (r1 != r3) goto L78
            if (r4 <= r7) goto L78
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L7a
        L78:
            r1 = r2
            r7 = r4
        L7a:
            if (r0 != r3) goto L69
            if (r1 <= r6) goto L69
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L58
        L83:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzbdd r6 = r5.f22782t
            if (r6 == 0) goto L8d
            r6.m17476i(r0, r1)
        L8d:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r6 != r7) goto La6
            int r6 = r5.f22780r
            if (r6 <= 0) goto L99
            if (r6 != r0) goto L9f
        L99:
            int r6 = r5.f22781s
            if (r6 <= 0) goto La2
            if (r6 == r1) goto La2
        L9f:
            r5.m17406y()
        La2:
            r5.f22780r = r0
            r5.f22781s = r1
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcd.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzawz.m17082m("AdMediaPlayerView prepared");
        m17403u(2);
        this.f22771i.m17486d();
        zzaxi.f22654a.post(new RunnableC6963o7(this));
        this.f22777o = mediaPlayer.getVideoWidth();
        this.f22778p = mediaPlayer.getVideoHeight();
        int i2 = this.f22784v;
        if (i2 != 0) {
            mo17410h(i2);
        }
        m17406y();
        int i3 = this.f22777o;
        int i4 = this.f22778p;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        zzbad.m17352h(sb.toString());
        if (this.f22774l == 3) {
            mo17409d();
        }
        mo15161b();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzawz.m17082m("AdMediaPlayerView surface created");
        m17405x();
        zzaxi.f22654a.post(new RunnableC7074r7(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzawz.m17082m("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f22775m;
        if (mediaPlayer != null && this.f22784v == 0) {
            this.f22784v = mediaPlayer.getCurrentPosition();
        }
        zzbdd zzbddVar = this.f22782t;
        if (zzbddVar != null) {
            zzbddVar.m17477j();
        }
        zzaxi.f22654a.post(new RunnableC7148t7(this));
        m17402t(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzawz.m17082m("AdMediaPlayerView surface changed");
        boolean z = this.f22774l == 3;
        boolean z2 = this.f22777o == i2 && this.f22778p == i3;
        if (this.f22775m != null && z && z2) {
            int i4 = this.f22784v;
            if (i4 != 0) {
                mo17410h(i4);
            }
            mo17409d();
        }
        zzbdd zzbddVar = this.f22782t;
        if (zzbddVar != null) {
            zzbddVar.m17476i(i2, i3);
        }
        zzaxi.f22654a.post(new RunnableC7111s7(this, i2, i3));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f22771i.m17485c(this);
        this.f22786f.m17464a(surfaceTexture, this.f22785w);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzawz.m17082m(sb.toString());
        this.f22777o = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f22778p = videoHeight;
        if (this.f22777o == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        zzawz.m17082m(sb.toString());
        zzaxi.f22654a.post(new Runnable(this, i2) { // from class: com.google.android.gms.internal.ads.n7

            /* renamed from: f */
            private final zzbcd f19992f;

            /* renamed from: g */
            private final int f19993g;

            {
                this.f19992f = this;
                this.f19993g = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19992f.m17415v(this.f19993g);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    /* renamed from: r */
    public final String mo17414r() {
        String str = this.f22783u ? " spherical" : HttpUrl.FRAGMENT_ENCODE_SET;
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzvv m20679z = zzvv.m20679z(parse);
        if (m20679z == null || m20679z.f27230f != null) {
            if (m20679z != null) {
                parse = Uri.parse(m20679z.f27230f);
            }
            this.f22776n = parse;
            this.f22784v = 0;
            m17405x();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzbcd.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* renamed from: v */
    final /* synthetic */ void m17415v(int i2) {
        zzbcn zzbcnVar = this.f22785w;
        if (zzbcnVar != null) {
            zzbcnVar.onWindowVisibilityChanged(i2);
        }
    }
}
