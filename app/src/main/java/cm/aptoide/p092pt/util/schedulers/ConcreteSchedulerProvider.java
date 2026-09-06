package cm.aptoide.p092pt.util.schedulers;

import p456rx.AbstractC11195h;
import p456rx.p457l.p459c.C11202a;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class ConcreteSchedulerProvider implements SchedulerProvider {
    private static ConcreteSchedulerProvider INSTANCE;

    private ConcreteSchedulerProvider() {
    }

    public static synchronized ConcreteSchedulerProvider getInstance() {
        ConcreteSchedulerProvider concreteSchedulerProvider;
        synchronized (ConcreteSchedulerProvider.class) {
            if (INSTANCE == null) {
                INSTANCE = new ConcreteSchedulerProvider();
            }
            concreteSchedulerProvider = INSTANCE;
        }
        return concreteSchedulerProvider;
    }

    @Override // cm.aptoide.p092pt.util.schedulers.SchedulerProvider
    public AbstractC11195h computation() {
        return Schedulers.computation();
    }

    @Override // cm.aptoide.p092pt.util.schedulers.SchedulerProvider
    /* renamed from: io */
    public AbstractC11195h mo8879io() {
        return Schedulers.m40658io();
    }

    @Override // cm.aptoide.p092pt.util.schedulers.SchedulerProvider
    /* renamed from: ui */
    public AbstractC11195h mo8880ui() {
        return C11202a.m40156b();
    }
}
