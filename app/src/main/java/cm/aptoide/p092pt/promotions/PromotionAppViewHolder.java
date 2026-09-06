package cm.aptoide.p092pt.promotions;

import android.R;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.promotions.PromotionAppClick;
import cm.aptoide.p092pt.themes.ThemeManager;
import java.text.DecimalFormat;
import p024c.p025a.p026k.p027a.C0833a;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public class PromotionAppViewHolder extends RecyclerView.AbstractC0590c0 {
    private TextView appDescription;
    private ImageView appIcon;
    private TextView appName;
    private TextView appRewardMessage;
    private int appState;
    private Button promotionAction;
    private final C11370b<PromotionAppClick> promotionAppClick;
    private final ThemeManager themeManager;

    public PromotionAppViewHolder(View view, int i2, C11370b<PromotionAppClick> c11370b, ThemeManager themeManager) {
        super(view);
        this.appState = i2;
        this.appIcon = (ImageView) view.findViewById(C1138R.id.app_icon);
        this.appName = (TextView) view.findViewById(C1138R.id.app_name);
        this.appDescription = (TextView) view.findViewById(C1138R.id.app_description);
        this.appRewardMessage = (TextView) view.findViewById(C1138R.id.app_reward);
        this.promotionAction = (Button) view.findViewById(C1138R.id.promotion_app_action_button);
        this.promotionAppClick = c11370b;
        this.themeManager = themeManager;
    }

    private int getButtonMessage(int i2) {
        if (i2 == 0) {
            return C1138R.string.appview_button_update;
        }
        if (i2 != 1 && i2 != 3) {
            if (i2 == 4) {
                return C1138R.string.promotion_claim_button;
            }
            if (i2 == 5) {
                return C1138R.string.holidayspromotion_button_claimed;
            }
            if (i2 != 6) {
                throw new IllegalArgumentException("Wrong view type of promotion app");
            }
        }
        return C1138R.string.install;
    }

    private PromotionAppClick.ClickType getClickType(int i2) {
        if (i2 == 0) {
            return PromotionAppClick.ClickType.UPDATE;
        }
        if (i2 == 1) {
            return PromotionAppClick.ClickType.DOWNLOAD;
        }
        if (i2 == 3) {
            return PromotionAppClick.ClickType.INSTALL_APP;
        }
        if (i2 == 4) {
            return PromotionAppClick.ClickType.CLAIM;
        }
        if (i2 == 6) {
            return PromotionAppClick.ClickType.DOWNGRADE;
        }
        throw new IllegalArgumentException("Wrong view type of promotion app");
    }

    private SpannableString handleRewardMessage(float f2, String str, double d2, boolean z) {
        String string;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String num = Integer.toString(Math.round(f2));
        if (z) {
            string = this.itemView.getContext().getString(C1138R.string.FIATpromotion_update_to_get_short, num, str + decimalFormat.format(d2));
        } else {
            string = this.itemView.getContext().getString(C1138R.string.FIATpromotion_install_to_get_short, num, str + decimalFormat.format(d2));
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(this.itemView.getContext().getResources().getColor(C1138R.color.promotions_reward)), string.indexOf(num), string.length(), 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setApp$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8504a(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.NAVIGATE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setApp$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8505b(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(this.appState)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setApp$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8506c(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(this.appState)));
    }

    private void lockInstallButton(boolean z) {
        if (!z) {
            this.promotionAction.setEnabled(true);
            this.promotionAction.setBackground(this.itemView.getContext().getResources().getDrawable(C1138R.drawable.appc_gradient_rounded));
        } else {
            this.promotionAction.setEnabled(false);
            this.promotionAction.setBackground(this.itemView.getResources().getDrawable(this.themeManager.getAttributeForTheme(C1138R.attr.lockedButton).resourceId));
            this.promotionAction.setTextColor(this.itemView.getContext().getResources().getColor(C1138R.color.grey_fog_light));
        }
    }

    private void setAppCardHeader(PromotionViewApp promotionViewApp) {
        ImageLoader.with(this.itemView.getContext()).load(promotionViewApp.getAppIcon(), this.appIcon);
        this.appName.setText(promotionViewApp.getName());
        this.appDescription.setText(promotionViewApp.getDescription());
        this.appRewardMessage.setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), this.appState == 0));
    }

    public void setApp(final PromotionViewApp promotionViewApp, boolean z) {
        setAppCardHeader(promotionViewApp);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromotionAppViewHolder.this.m8504a(promotionViewApp, view);
            }
        });
        this.promotionAction.setText(this.itemView.getContext().getString(getButtonMessage(this.appState), Float.valueOf(promotionViewApp.getAppcValue())));
        if (!z && this.appState != 5) {
            lockInstallButton(true);
            return;
        }
        int i2 = this.appState;
        if (i2 != 5) {
            if (i2 != 4) {
                lockInstallButton(false);
                this.promotionAction.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.g1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionAppViewHolder.this.m8506c(promotionViewApp, view);
                    }
                });
                return;
            } else {
                this.promotionAction.setEnabled(true);
                this.promotionAction.setBackgroundDrawable(this.itemView.getContext().getResources().getDrawable(C1138R.drawable.card_border_rounded_green));
                this.promotionAction.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.promotions.f1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PromotionAppViewHolder.this.m8505b(promotionViewApp, view);
                    }
                });
                return;
            }
        }
        lockInstallButton(true);
        this.promotionAction.setBackground(this.itemView.getResources().getDrawable(this.themeManager.getAttributeForTheme(C1138R.attr.claimedButton).resourceId));
        this.promotionAction.setTextColor(this.themeManager.getAttributeForTheme(R.attr.textColorPrimary).data);
        SpannableString spannableString = new SpannableString("  " + this.itemView.getResources().getString(C1138R.string.holidayspromotion_button_claimed).toUpperCase());
        Drawable m5262d = C0833a.m5262d(this.itemView.getContext(), C1138R.drawable.ic_promotion_claimed_check);
        m5262d.setBounds(0, 0, m5262d.getIntrinsicWidth(), m5262d.getIntrinsicHeight());
        spannableString.setSpan(new ImageSpan(m5262d, 1), 0, 1, 18);
        this.promotionAction.setTransformationMethod(null);
        this.promotionAction.setText(spannableString);
    }
}
