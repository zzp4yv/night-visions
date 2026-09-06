package cm.aptoide.p092pt.account.view;

import cm.aptoide.p092pt.account.view.exception.InvalidImageException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;
import p456rx.AbstractC11195h;
import p456rx.C11183b;
import p456rx.p460m.InterfaceCallableC11207d;

/* compiled from: ImageValidator.kt */
@Metadata(m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m32267d2 = {"Lcm/aptoide/pt/account/view/ImageValidator;", HttpUrl.FRAGMENT_ENCODE_SET, "scheduler", "Lrx/Scheduler;", "imageInfoProvider", "Lcm/aptoide/pt/account/view/ImageInfoProvider;", "(Lrx/Scheduler;Lcm/aptoide/pt/account/view/ImageInfoProvider;)V", "getInfo", "Lcm/aptoide/pt/account/view/ImageInfo;", "imagePath", HttpUrl.FRAGMENT_ENCODE_SET, "validate", HttpUrl.FRAGMENT_ENCODE_SET, "validateOrGetException", "Lrx/Completable;", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class ImageValidator {
    private static final int MAX_IMAGE_HEIGHT = 10240;
    private static final int MAX_IMAGE_SIZE_IN_BYTES = 5242880;
    private static final int MAX_IMAGE_WIDTH = 10240;
    private static final int MIN_IMAGE_HEIGHT = 600;
    private static final int MIN_IMAGE_WIDTH = 600;
    private final ImageInfoProvider imageInfoProvider;
    private final AbstractC11195h scheduler;

    public ImageValidator(AbstractC11195h abstractC11195h, ImageInfoProvider imageInfoProvider) {
        C9768m.m32346f(abstractC11195h, "scheduler");
        C9768m.m32346f(imageInfoProvider, "imageInfoProvider");
        this.scheduler = abstractC11195h;
        this.imageInfoProvider = imageInfoProvider;
    }

    private final ImageInfo getInfo(String imagePath) throws InvalidImageException {
        ImageInfo info = this.imageInfoProvider.getInfo(imagePath);
        if (info != null) {
            return info;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(InvalidImageException.ImageError.ERROR_DECODING);
        throw new InvalidImageException(arrayList);
    }

    private final void validate(String imagePath) throws InvalidImageException {
        ImageInfo info = getInfo(imagePath);
        ArrayList arrayList = new ArrayList();
        if (info.getHeight() < 600) {
            arrayList.add(InvalidImageException.ImageError.MIN_HEIGHT);
        } else if (info.getHeight() > 10240) {
            arrayList.add(InvalidImageException.ImageError.MAX_HEIGHT);
        }
        if (info.getWidth() < 600) {
            arrayList.add(InvalidImageException.ImageError.MIN_WIDTH);
        } else if (info.getWidth() > 10240) {
            arrayList.add(InvalidImageException.ImageError.MAX_WIDTH);
        }
        if (info.getSize() > 5242880) {
            arrayList.add(InvalidImageException.ImageError.MAX_IMAGE_SIZE);
        }
        if (!arrayList.isEmpty()) {
            throw new InvalidImageException(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: validateOrGetException$lambda-0, reason: not valid java name */
    public static final C11183b m40699validateOrGetException$lambda0(ImageValidator imageValidator, String str) {
        C9768m.m32346f(imageValidator, "this$0");
        C9768m.m32346f(str, "$imagePath");
        imageValidator.validate(str);
        return C11183b.m39946e();
    }

    public C11183b validateOrGetException(final String str) {
        C9768m.m32346f(str, "imagePath");
        return C11183b.m39949i(new InterfaceCallableC11207d() { // from class: cm.aptoide.pt.account.view.u0
            @Override // p456rx.p460m.InterfaceCallableC11207d, java.util.concurrent.Callable
            public final Object call() {
                C11183b m40699validateOrGetException$lambda0;
                m40699validateOrGetException$lambda0 = ImageValidator.m40699validateOrGetException$lambda0(ImageValidator.this, str);
                return m40699validateOrGetException$lambda0;
            }
        }).m39967K(this.scheduler);
    }
}
