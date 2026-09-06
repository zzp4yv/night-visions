package cm.aptoide.p092pt.database.room;

import com.google.gson.C8533e;
import com.google.gson.p219u.C8586a;
import java.util.List;

/* loaded from: classes.dex */
public class SplitTypeConverter {
    public static List<RoomSplit> restoreSplitList(String str) {
        return (List) new C8533e().m26925i(str, new C8586a<List<RoomSplit>>() { // from class: cm.aptoide.pt.database.room.SplitTypeConverter.1
        }.getType());
    }

    public static String saveSplitList(List<RoomSplit> list) {
        return new C8533e().m26932q(list);
    }
}
