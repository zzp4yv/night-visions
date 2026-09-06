package cm.aptoide.p092pt.reactions;

import cm.aptoide.p092pt.reactions.network.LoadReactionModel;
import cm.aptoide.p092pt.reactions.network.ReactionsResponse;
import cm.aptoide.p092pt.reactions.network.ReactionsService;
import java.util.HashMap;
import okhttp3.HttpUrl;
import p456rx.Single;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class ReactionsManager {
    private final ReactionsService reactionsService;
    private HashMap<String, UserReaction> userReactions;

    public ReactionsManager(ReactionsService reactionsService, HashMap<String, UserReaction> hashMap) {
        this.reactionsService = reactionsService;
        this.userReactions = hashMap;
    }

    private String getUID(String str) {
        UserReaction userReaction = this.userReactions.get(str);
        return userReaction != null ? userReaction.getUserId() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    private Single<Boolean> hasNotReacted(String str, String str2) {
        boolean z;
        if (getUID(str + str2) != null) {
            if (!getUID(str + str2).equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                z = false;
                return Single.m39913m(Boolean.valueOf(z));
            }
        }
        z = true;
        return Single.m39913m(Boolean.valueOf(z));
    }

    private boolean isSameReaction(String str, String str2, String str3) {
        UserReaction userReaction = this.userReactions.get(str + str2);
        return userReaction != null && userReaction.getReaction().equals(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deleteReaction$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8587a(String str, String str2, ReactionsResponse reactionsResponse) {
        if (reactionsResponse.wasSuccess()) {
            this.userReactions.remove(str + str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadReactionModel$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8588b(String str, String str2, LoadReactionModel loadReactionModel) {
        this.userReactions.put(str + str2, new UserReaction(loadReactionModel.getUserId(), loadReactionModel.getMyReaction()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setReaction$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8589c(String str, String str2, String str3, Boolean bool) {
        if (bool.booleanValue()) {
            return this.reactionsService.setReaction(str, str2, str3);
        }
        if (isSameReaction(str, str2, str3)) {
            return Single.m39913m(new ReactionsResponse(ReactionsResponse.ReactionResponseMessage.SAME_REACTION));
        }
        return this.reactionsService.setSecondReaction(getUID(str + str2), str3);
    }

    public Single<ReactionsResponse> deleteReaction(final String str, final String str2) {
        return this.reactionsService.deleteReaction(getUID(str + str2)).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.reactions.a
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ReactionsManager.this.m8587a(str, str2, (ReactionsResponse) obj);
            }
        });
    }

    public Single<Boolean> isFirstReaction(String str, String str2) {
        return hasNotReacted(str, str2);
    }

    public Single<LoadReactionModel> loadReactionModel(final String str, final String str2) {
        return this.reactionsService.loadReactionModel(str, str2).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.reactions.b
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ReactionsManager.this.m8588b(str, str2, (LoadReactionModel) obj);
            }
        });
    }

    public Single<ReactionsResponse> setReaction(final String str, final String str2, final String str3) {
        return hasNotReacted(str, str2).m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.reactions.c
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ReactionsManager.this.m8589c(str, str2, str3, (Boolean) obj);
            }
        });
    }
}
