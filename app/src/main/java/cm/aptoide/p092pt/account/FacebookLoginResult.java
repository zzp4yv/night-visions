package cm.aptoide.p092pt.account;

import com.facebook.FacebookException;
import com.facebook.login.C5772y;

/* loaded from: classes.dex */
public class FacebookLoginResult {
    public static final int STATE_CANCELLED = 1;
    public static final int STATE_ERROR = 99;
    public static final int STATE_SUCCESS = 0;
    private final FacebookException error;
    private final C5772y result;
    private final int state;

    public FacebookLoginResult(C5772y c5772y, int i2, FacebookException facebookException) {
        this.result = c5772y;
        this.state = i2;
        this.error = facebookException;
    }

    public FacebookException getError() {
        return this.error;
    }

    public C5772y getResult() {
        return this.result;
    }

    public int getState() {
        return this.state;
    }
}
