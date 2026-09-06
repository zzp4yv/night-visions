package cm.aptoide.analytics.implementation;

import cm.aptoide.analytics.implementation.data.Event;
import java.util.List;
import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface EventsPersistence {
    C11186e<List<Event>> getAll();

    C11183b remove(List<Event> list);

    C11183b save(Event event);

    C11183b save(List<Event> list);
}
