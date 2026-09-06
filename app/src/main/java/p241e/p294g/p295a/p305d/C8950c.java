package p241e.p294g.p295a.p305d;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* compiled from: TextViewAfterTextChangeEventOnSubscribe.java */
/* renamed from: e.g.a.d.c */
/* loaded from: classes2.dex */
final class C8950c implements C11186e.a<C8949b> {

    /* renamed from: f */
    final TextView f34545f;

    /* compiled from: TextViewAfterTextChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.d.c$a */
    class a implements TextWatcher {

        /* renamed from: f */
        final /* synthetic */ AbstractC11197j f34546f;

        a(AbstractC11197j abstractC11197j) {
            this.f34546f = abstractC11197j;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.f34546f.isUnsubscribed()) {
                return;
            }
            this.f34546f.onNext(C8949b.m28583b(C8950c.this.f34545f, editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: TextViewAfterTextChangeEventOnSubscribe.java */
    /* renamed from: e.g.a.d.c$b */
    class b extends AbstractC11199a {

        /* renamed from: f */
        final /* synthetic */ TextWatcher f34548f;

        b(TextWatcher textWatcher) {
            this.f34548f = textWatcher;
        }

        @Override // p456rx.p457l.AbstractC11199a
        protected void onUnsubscribe() {
            C8950c.this.f34545f.removeTextChangedListener(this.f34548f);
        }
    }

    C8950c(TextView textView) {
        this.f34545f = textView;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(AbstractC11197j<? super C8949b> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        a aVar = new a(abstractC11197j);
        abstractC11197j.add(new b(aVar));
        this.f34545f.addTextChangedListener(aVar);
        TextView textView = this.f34545f;
        abstractC11197j.onNext(C8949b.m28583b(textView, textView.getEditableText()));
    }
}
