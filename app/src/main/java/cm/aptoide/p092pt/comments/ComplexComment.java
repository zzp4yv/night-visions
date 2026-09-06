package cm.aptoide.p092pt.comments;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import p456rx.C11183b;

/* loaded from: classes.dex */
public class ComplexComment extends Comment {
    private final int level;
    private final C11183b onClickReplyAction;

    public ComplexComment(CommentNode commentNode, C11183b c11183b) {
        this.level = commentNode.getLevel();
        Comment comment = commentNode.getComment();
        setAdded(comment.getAdded());
        setBody(comment.getBody());
        setId(comment.getId());
        if (comment.getParent() != null) {
            setParent(comment.getParent());
        }
        setParentReview(comment.getParentReview());
        setUser(comment.getUser());
        this.onClickReplyAction = c11183b;
    }

    public int getLevel() {
        return this.level;
    }

    public C11183b observeReplySubmission() {
        return this.onClickReplyAction;
    }
}
