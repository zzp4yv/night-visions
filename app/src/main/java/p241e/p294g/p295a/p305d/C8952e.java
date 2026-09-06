package p241e.p294g.p295a.p305d;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: TextViewTextChangeEventOnSubscribe.java */
/* renamed from: e.g.a.d.e */
/* loaded from: classes2.dex */
final class C8952e implements C11186e.a<C8951d> {

    /* renamed from: f */
    final TextView f34554f;

    /* compiled from: TextViewTextChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.d.e$a */
    class a implements TextWatcher {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f34555f;

        a(AbstractC11197j abstractC11197j) {
            this.f34555f = abstractC11197j;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (this.f34555f.isUnsubscribed()) {
                return;
            }
            this.f34555f.onNext(C8951d.m28586b(C8952e.this.f34554f, charSequence, i2, i3, i4));
        }
    }

    /* compiled from: TextViewTextChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.d.e$b */
    class b extends AbstractC11199a {

        /* renamed from: f */
        final /* synthetic */ TextWatcher f34557f;

        b(TextWatcher textWatcher) {
            this.f34557f = textWatcher;
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8952e.this.f34554f.removeTextChangedListener(this.f34557f);
        }
    }

    C8952e(TextView textView) {
        this.f34554f = textView;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super C8951d> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b(aVar));
        this.f34554f.addTextChangedListener(aVar);
        TextView textView = this.f34554f;
        abstractC11197j.onNext(C8951d.m28586b(textView, textView.getText(), 0, 0, 0));
    }
}
