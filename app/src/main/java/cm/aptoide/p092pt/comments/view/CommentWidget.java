package cm.aptoide.p092pt.comments.view;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.comments.ComplexComment;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import com.google.android.material.snackbar.Snackbar;
import p241e.p294g.p295a.p304c.C8942a;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class CommentWidget extends Widget<CommentDisplayable> {
    private static final int MARGIN_IN_DIP = 15;
    private TextView comment;
    private TextView datePos1;
    private TextView datePos2;
    private View outerLayout;
    private View replyLayout;
    private ImageView userAvatar;
    private TextView userName;

    public CommentWidget(View view) {
        super(view);
    }

    private void bindComplexComment(final ComplexComment complexComment) {
        ActivityC0468d context = getContext();
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(C1138R.attr.widgetBackgroundColorPrimary, typedValue, true);
        theme.resolveAttribute(C1138R.attr.widgetBackgroundColorSecondary, typedValue2, true);
        int i2 = complexComment.getLevel() == 1 ? typedValue.resourceId : typedValue2.resourceId;
        this.outerLayout.setBackgroundColor(Build.VERSION.SDK_INT >= 23 ? context.getColor(i2) : context.getResources().getColor(i2));
        setLayoutLeftPadding(complexComment);
        if (complexComment.getLevel() == 1) {
            this.replyLayout.setVisibility(0);
            this.compositeSubscription.m40667a(C8942a.m28573a(this.replyLayout).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.comments.view.b0
                @Override // p456rx.p460m.InterfaceC11208e
                public final Object call(Object obj) {
                    return CommentWidget.this.m7364b(complexComment, (Void) obj);
                }
            }).m40110s0().m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.comments.view.x
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    CommentWidget.lambda$bindComplexComment$5(obj);
                }
            }, new InterfaceC11205b() { // from class: cm.aptoide.pt.comments.view.w
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    CrashReport.getInstance().log((Throwable) obj);
                }
            }));
        } else {
            this.replyLayout.setVisibility(8);
            this.userAvatar.setScaleX(0.7f);
            this.userAvatar.setScaleY(0.7f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindComplexComment$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7363a(Throwable th) {
        Snackbar.m24763Z(this.userAvatar, C1138R.string.error_occured, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindComplexComment$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m7364b(ComplexComment complexComment, Void r2) {
        return complexComment.observeReplySubmission().m39981n(new InterfaceC11205b() { // from class: cm.aptoide.pt.comments.view.v
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CommentWidget.this.m7363a((Throwable) obj);
            }
        }).m39968M();
    }

    static /* synthetic */ void lambda$bindComplexComment$5(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7365c(CommentDisplayable commentDisplayable, Void r2) {
        commentDisplayable.itemClicked(this.itemView);
    }

    static /* synthetic */ void lambda$bindView$1(Void r0) {
    }

    private void setLayoutLeftPadding(ComplexComment complexComment) {
        int level = complexComment.getLevel();
        int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(15, getContext().getResources());
        int i2 = level < 2 ? pixelsForDip : level * pixelsForDip;
        View view = this.outerLayout;
        view.setPadding(i2, view.getPaddingTop(), pixelsForDip, this.outerLayout.getPaddingBottom());
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.userAvatar = (ImageView) view.findViewById(C1138R.id.user_icon);
        this.outerLayout = view.findViewById(C1138R.id.outer_layout);
        this.userName = (TextView) view.findViewById(C1138R.id.user_name);
        this.datePos1 = (TextView) view.findViewById(C1138R.id.added_date_pos1);
        this.datePos2 = (TextView) view.findViewById(C1138R.id.added_date_pos2);
        this.comment = (TextView) view.findViewById(C1138R.id.comment);
        this.replyLayout = view.findViewById(C1138R.id.reply_layout);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final CommentDisplayable commentDisplayable, int i2) {
        Comment comment = commentDisplayable.getComment();
        ActivityC0468d context = getContext();
        ImageLoader.with(context).loadWithCircleTransformAndPlaceHolderAvatarSize(comment.getUser().getAvatar(), this.userAvatar, C1138R.drawable.layer_1);
        this.userName.setText(comment.getUser().getName());
        String timeDiffString = AptoideUtils.DateTimeU.getInstance(getContext()).getTimeDiffString(context, comment.getAdded().getTime(), getContext().getResources());
        this.datePos1.setText(timeDiffString);
        this.datePos2.setText(timeDiffString);
        this.comment.setText(comment.getBody());
        if (ComplexComment.class.isAssignableFrom(comment.getClass())) {
            this.datePos2.setVisibility(0);
            bindComplexComment((ComplexComment) comment);
        } else {
            this.datePos1.setVisibility(0);
        }
        this.compositeSubscription.m40667a(C8942a.m28573a(this.itemView).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.comments.view.a0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CommentWidget.this.m7365c(commentDisplayable, (Void) obj);
            }
        }).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.comments.view.y
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CommentWidget.lambda$bindView$1((Void) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.comments.view.z
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
