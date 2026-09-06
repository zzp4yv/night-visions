package cm.aptoide.aptoideviews.video;

import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;
import cm.aptoide.aptoideviews.C1103R;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: YoutubePlayer.kt */
@Metadata(m32266d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
final class YoutubePlayer$setListeners$1 extends Lambda implements Function0<C10742u> {
    final /* synthetic */ YoutubePlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YoutubePlayer$setListeners$1(YoutubePlayer youtubePlayer) {
        super(0);
        this.this$0 = youtubePlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m40690invoke$lambda0(YoutubePlayer youtubePlayer) {
        C9768m.m32346f(youtubePlayer, "this$0");
        ((YoutubeWebViewPlayer) youtubePlayer._$_findCachedViewById(C1103R.id.webview)).setVisibility(0);
        ((ProgressBar) youtubePlayer._$_findCachedViewById(C1103R.id.progress_bar)).setVisibility(8);
        ((TextView) youtubePlayer._$_findCachedViewById(C1103R.id.status_text)).setVisibility(8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C10742u invoke() {
        invoke2();
        return C10742u.f41439a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Handler handler;
        handler = this.this$0.threadHandler;
        final YoutubePlayer youtubePlayer = this.this$0;
        handler.postDelayed(new Runnable() { // from class: cm.aptoide.aptoideviews.video.b
            @Override // java.lang.Runnable
            public final void run() {
                YoutubePlayer$setListeners$1.m40690invoke$lambda0(YoutubePlayer.this);
            }
        }, 500L);
    }
}
