package cm.aptoide.p092pt.share;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.DialogInterfaceC0066c;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import com.bumptech.glide.p141p.p142l.AbstractC5542g;
import com.bumptech.glide.p141p.p143m.InterfaceC5549d;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p474t.C11381e;

/* loaded from: classes.dex */
public class ShareDialogs {

    public enum ShareResponse {
        USING
    }

    public static C11186e<ShareResponse> createStoreShareDialog(final Context context, final String str, final String str2) {
        return C11186e.m40048l(new C11186e.a() { // from class: cm.aptoide.pt.share.c
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ShareDialogs.lambda$createStoreShareDialog$2(context, str, str2, (AbstractC11197j) obj);
            }
        });
    }

    static /* synthetic */ void lambda$createStoreShareDialog$0(AbstractC11197j abstractC11197j, DialogInterface dialogInterface, int i2) {
        if (abstractC11197j.isUnsubscribed() || i2 != 0) {
            return;
        }
        abstractC11197j.onNext(ShareResponse.USING);
        abstractC11197j.onCompleted();
    }

    static /* synthetic */ void lambda$createStoreShareDialog$2(Context context, String str, String str2, final AbstractC11197j abstractC11197j) {
        final DialogInterfaceC0066c m244a = new DialogInterfaceC0066c.a(context).m265v(str).m251h(C1138R.array.store_share_options_array, new DialogInterface.OnClickListener() { // from class: cm.aptoide.pt.share.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ShareDialogs.lambda$createStoreShareDialog$0(AbstractC11197j.this, dialogInterface, i2);
            }
        }).m244a();
        ImageLoader.with(context).loadIntoTarget(str2, new AbstractC5542g<Drawable>() { // from class: cm.aptoide.pt.share.ShareDialogs.1
            @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, InterfaceC5549d interfaceC5549d) {
                onResourceReady((Drawable) obj, (InterfaceC5549d<? super Drawable>) interfaceC5549d);
            }

            public void onResourceReady(Drawable drawable, InterfaceC5549d<? super Drawable> interfaceC5549d) {
                DialogInterfaceC0066c.this.m243h(drawable);
            }
        });
        abstractC11197j.add(C11381e.m40674a(new InterfaceC11204a() { // from class: cm.aptoide.pt.share.b
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                DialogInterfaceC0066c.this.dismiss();
            }
        }));
        m244a.show();
    }
}
