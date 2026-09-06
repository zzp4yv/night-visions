package cm.aptoide.p092pt.search.suggestions;

import java.util.List;
import p456rx.Single;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class SearchSuggestionService {
    private final SearchSuggestionRemoteRepository repository;

    public SearchSuggestionService(SearchSuggestionRemoteRepository searchSuggestionRemoteRepository) {
        this.repository = searchSuggestionRemoteRepository;
    }

    public Single<List<String>> getAppSuggestionsForQuery(String str) {
        return this.repository.getSuggestionForApp(str).m39923n(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.suggestions.a
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                List data;
                data = ((Suggestions) obj).getData();
                return data;
            }
        });
    }

    public Single<List<String>> getStoreSuggestionsForQuery(String str) {
        return this.repository.getSuggestionForStore(str).m39923n(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.suggestions.b
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                List data;
                data = ((Suggestions) obj).getData();
                return data;
            }
        });
    }
}
