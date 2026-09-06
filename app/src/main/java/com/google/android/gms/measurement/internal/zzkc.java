package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzbo;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzky;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.HttpUrl;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public class zzkc implements InterfaceC7784s4 {

    /* renamed from: a */
    private static volatile zzkc f29356a;

    /* renamed from: b */
    private zzfr f29357b;

    /* renamed from: c */
    private zzex f29358c;

    /* renamed from: d */
    private C7635c f29359d;

    /* renamed from: e */
    private C7756p3 f29360e;

    /* renamed from: f */
    private zzjy f29361f;

    /* renamed from: g */
    private C7769q7 f29362g;

    /* renamed from: h */
    private final zzkg f29363h;

    /* renamed from: i */
    private C7785s5 f29364i;

    /* renamed from: j */
    private final zzfx f29365j;

    /* renamed from: k */
    private boolean f29366k;

    /* renamed from: l */
    private boolean f29367l;

    /* renamed from: m */
    private boolean f29368m;

    /* renamed from: n */
    @VisibleForTesting
    private long f29369n;

    /* renamed from: o */
    private List<Runnable> f29370o;

    /* renamed from: p */
    private int f29371p;

    /* renamed from: q */
    private int f29372q;

    /* renamed from: r */
    private boolean f29373r;

    /* renamed from: s */
    private boolean f29374s;

    /* renamed from: t */
    private boolean f29375t;

    /* renamed from: u */
    private FileLock f29376u;

    /* renamed from: v */
    private FileChannel f29377v;

    /* renamed from: w */
    private List<Long> f29378w;

    /* renamed from: x */
    private List<Long> f29379x;

    /* renamed from: y */
    private long f29380y;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    /* renamed from: com.google.android.gms.measurement.internal.zzkc$a */
    class C7849a implements InterfaceC7653e {

        /* renamed from: a */
        zzbr.zzg f29381a;

        /* renamed from: b */
        List<Long> f29382b;

        /* renamed from: c */
        List<zzbr.zzc> f29383c;

        /* renamed from: d */
        private long f29384d;

        private C7849a() {
        }

        /* renamed from: c */
        private static long m23466c(zzbr.zzc zzcVar) {
            return ((zzcVar.m21689W() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC7653e
        /* renamed from: a */
        public final void mo22770a(zzbr.zzg zzgVar) {
            Preconditions.m14372k(zzgVar);
            this.f29381a = zzgVar;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC7653e
        /* renamed from: b */
        public final boolean mo22771b(long j2, zzbr.zzc zzcVar) {
            Preconditions.m14372k(zzcVar);
            if (this.f29383c == null) {
                this.f29383c = new ArrayList();
            }
            if (this.f29382b == null) {
                this.f29382b = new ArrayList();
            }
            if (this.f29383c.size() > 0 && m23466c(this.f29383c.get(0)) != m23466c(zzcVar)) {
                return false;
            }
            long mo22272i = this.f29384d + zzcVar.mo22272i();
            if (mo22272i >= Math.max(0, zzap.f29161p.m23095a(null).intValue())) {
                return false;
            }
            this.f29384d = mo22272i;
            this.f29383c.add(zzcVar);
            this.f29382b.add(Long.valueOf(j2));
            return this.f29383c.size() < Math.max(1, zzap.f29163q.m23095a(null).intValue());
        }

        /* synthetic */ C7849a(zzkc zzkcVar, RunnableC7697i7 runnableC7697i7) {
            this();
        }
    }

    private zzkc(zzkh zzkhVar) {
        this(zzkhVar, null);
    }

    @VisibleForTesting
    /* renamed from: C */
    private final boolean m23406C(int i2, FileChannel fileChannel) {
        m23423j0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f29365j.mo22836h().m23137H().m23147a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f29365j.mo22836h().m23137H().m23148b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.f29365j.mo22836h().m23137H().m23148b("Failed to write to channel", e2);
            return false;
        }
    }

    /* renamed from: D */
    private final boolean m23407D(zzbr.zzc.zza zzaVar, zzbr.zzc.zza zzaVar2) {
        Preconditions.m14362a("_e".equals(zzaVar.m21704K()));
        m23448Z();
        zzbr.zze m23480z = zzkg.m23480z((zzbr.zzc) ((zzfd) zzaVar.mo22283y()), "_sc");
        String m21735N = m23480z == null ? null : m23480z.m21735N();
        m23448Z();
        zzbr.zze m23480z2 = zzkg.m23480z((zzbr.zzc) ((zzfd) zzaVar2.mo22283y()), "_pc");
        String m21735N2 = m23480z2 != null ? m23480z2.m21735N() : null;
        if (m21735N2 == null || !m21735N2.equals(m21735N)) {
            return false;
        }
        m23413L(zzaVar, zzaVar2);
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(8:10|(2:567|568)(1:12)|13|(1:15)|16|17|18|(5:20|21|(2:26|(31:28|(3:29|30|(4:32|33|(6:35|(4:40|(1:44)|45|46)|48|(2:42|44)|45|46)(24:49|50|(2:52|(2:54|(6:56|(3:220|(1:217)(1:65)|(1:67)(13:216|95|(14:97|(5:101|(2:103|104)(2:106|(2:108|109)(1:110))|105|98|99)|111|112|(2:114|(11:119|(1:121)(3:177|(4:180|(3:183|(2:186|187)(1:185)|181)|188|189)(0)|179)|(1:123)|124|(7:126|(2:128|(6:(2:133|(6:135|136|(2:140|(1:142)(2:143|(1:145)(3:146|147|148)))|149|147|148))|150|(3:138|140|(0)(0))|149|147|148)(2:151|152))(2:155|(3:157|(6:(2:162|(6:164|136|(0)|149|147|148))|165|(0)|149|147|148)|152)(2:166|(2:170|(1:175))))|154|(0)|149|147|148)(1:176)|153|154|(0)|149|147|148)(1:118))|190|124|(0)(0)|153|154|(0)|149|147|148)|191|190|124|(0)(0)|153|154|(0)|149|147|148))|59|(1:61)|217|(0)(0))(6:221|(4:223|(0)|217|(0)(0))|59|(0)|217|(0)(0)))(6:224|(4:226|(0)|217|(0)(0))|59|(0)|217|(0)(0)))(1:227)|68|(3:69|70|(3:72|(2:74|75)(2:77|(2:79|80)(2:81|82))|76)(1:83))|84|(1:87)|(1:89)|90|(1:92)(1:215)|93|(4:195|(4:198|(2:200|201)(2:203|(2:205|206)(1:207))|202|196)|208|(1:(1:213)(1:214))(1:211))|95|(0)|191|190|124|(0)(0)|153|154|(0)|149|147|148)|47)(1:228))|229|(4:231|(5:233|(2:235|(3:237|238|239))|240|(1:253)(3:242|(1:244)(1:252)|(2:248|249))|239)|254|255)(1:502)|256|257|(6:259|(2:260|(2:262|(2:264|265)(1:496))(2:497|498))|(1:267)|268|(3:272|(1:274)(1:494)|(2:276|(1:278)))|495)(2:499|(1:501))|279|(2:281|(3:289|(2:290|(2:292|(2:295|296)(1:294))(2:299|300))|(1:298)))|301|(1:303)|304|(9:368|369|(7:372|373|(5:375|(1:377)|378|(5:380|(1:382)|383|(1:387)|388)|389)(5:393|(2:396|(2:397|(2:399|(3:402|403|(1:413)(0))(1:401))(1:478)))(0)|479|(1:415)(1:477)|(1:417)(7:418|(1:476)(2:422|(1:424)(1:475))|425|(1:427)(1:474)|428|429|(3:431|(1:439)|440)(5:441|(4:443|(1:445)|446|447)(5:450|451|(3:453|(2:455|456)(1:470)|457)(3:471|(2:473|459)|469)|(3:461|(1:463)|464)(2:466|(1:468))|465)|448|449|392)))|390|391|392|370)|480|481|(1:483)|484|(2:487|485)|488)|306|307|(1:309)|310|(1:312)(2:349|(9:351|(1:353)(1:367)|354|(1:356)(1:366)|357|(1:359)(1:365)|360|(1:362)(1:364)|363))|313|(5:315|(2:320|321)|322|(1:324)(1:325)|321)|326|(3:(2:330|331)(1:333)|332|327)|334|335|(1:337)|338|339|340|341|342|343)(3:503|504|505))|506|(0)(0))(4:507|508|509|510))(7:572|(1:574)(1:584)|575|(1:577)|578|579|(5:581|21|(3:23|26|(0)(0))|506|(0)(0))(2:582|583))|511|512|(2:514|515)(10:516|517|518|519|(1:521)|522|(1:524)(1:547)|525|526|(2:528|529)(1:(8:530|531|532|533|534|(2:541|542)|536|(2:538|539)(1:540))))|21|(0)|506|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0d01, code lost:
    
        if (r5 != r14) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0237, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x025b, code lost:
    
        r9.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0686 A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:20:0x0086, B:21:0x025e, B:23:0x0262, B:28:0x026e, B:29:0x0296, B:32:0x02aa, B:35:0x02d0, B:37:0x0309, B:42:0x031f, B:44:0x0329, B:47:0x0822, B:49:0x0352, B:52:0x036a, B:69:0x03cd, B:72:0x03d7, B:74:0x03e5, B:76:0x0438, B:77:0x0406, B:79:0x0415, B:87:0x0447, B:89:0x0477, B:90:0x04a5, B:92:0x04d9, B:93:0x04df, B:97:0x05af, B:98:0x05bb, B:101:0x05c5, B:105:0x05e8, B:106:0x05d7, B:114:0x05ee, B:116:0x05fa, B:118:0x0606, B:123:0x0655, B:124:0x0672, B:126:0x0686, B:128:0x0692, B:131:0x06a5, B:133:0x06b7, B:135:0x06c5, B:138:0x07ae, B:140:0x07b8, B:142:0x07be, B:143:0x07d8, B:145:0x07eb, B:146:0x0805, B:147:0x080e, B:155:0x06ee, B:157:0x06fe, B:160:0x0713, B:162:0x0725, B:164:0x0733, B:166:0x0743, B:168:0x075b, B:170:0x0767, B:173:0x077a, B:175:0x078e, B:177:0x0627, B:181:0x063b, B:183:0x0641, B:185:0x064c, B:193:0x04eb, B:195:0x0520, B:196:0x053d, B:198:0x0543, B:200:0x0551, B:202:0x0565, B:203:0x055a, B:211:0x056c, B:213:0x0573, B:214:0x0592, B:218:0x038c, B:221:0x0396, B:224:0x03a0, B:233:0x083f, B:235:0x084d, B:237:0x0856, B:239:0x0888, B:240:0x085e, B:242:0x0867, B:244:0x086d, B:246:0x0879, B:248:0x0883, B:256:0x088f, B:259:0x08a7, B:260:0x08af, B:262:0x08b5, B:267:0x08cc, B:268:0x08d7, B:270:0x08dd, B:272:0x08ef, B:276:0x08fc, B:278:0x0902, B:279:0x0941, B:281:0x0953, B:283:0x0972, B:285:0x0980, B:287:0x0986, B:289:0x0990, B:290:0x09c2, B:292:0x09c8, B:296:0x09d6, B:298:0x09e1, B:294:0x09db, B:301:0x09e4, B:303:0x09f6, B:304:0x09f9, B:375:0x0a64, B:377:0x0a7f, B:378:0x0a90, B:380:0x0a94, B:382:0x0aa0, B:383:0x0aa8, B:385:0x0aac, B:387:0x0ab2, B:388:0x0ac0, B:389:0x0acb, B:396:0x0b0c, B:397:0x0b14, B:399:0x0b1a, B:403:0x0b2c, B:405:0x0b3a, B:407:0x0b3e, B:409:0x0b48, B:411:0x0b4c, B:415:0x0b62, B:417:0x0b78, B:420:0x0bab, B:422:0x0bbf, B:424:0x0bee, B:431:0x0c59, B:433:0x0c6a, B:435:0x0c6e, B:437:0x0c72, B:439:0x0c76, B:440:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:455:0x0ce7, B:475:0x0c14, B:307:0x0dc5, B:309:0x0dd7, B:310:0x0dda, B:312:0x0dea, B:313:0x0e5f, B:315:0x0e65, B:317:0x0e7a, B:320:0x0e81, B:321:0x0eb4, B:322:0x0e89, B:324:0x0e95, B:325:0x0e9b, B:326:0x0ec5, B:327:0x0edc, B:330:0x0ee4, B:332:0x0ee9, B:335:0x0ef9, B:337:0x0f13, B:338:0x0f2c, B:340:0x0f34, B:341:0x0f56, B:348:0x0f45, B:349:0x0e04, B:351:0x0e0a, B:353:0x0e14, B:354:0x0e1b, B:359:0x0e2b, B:360:0x0e32, B:362:0x0e51, B:363:0x0e58, B:364:0x0e55, B:365:0x0e2f, B:367:0x0e18, B:495:0x091f, B:499:0x0924, B:501:0x0936, B:503:0x0f66, B:515:0x012b, B:529:0x01c9, B:542:0x01ff, B:539:0x021c, B:552:0x0233, B:558:0x025b, B:562:0x0f7b, B:563:0x0f7e, B:581:0x00df, B:518:0x0134), top: B:2:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07ae A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:20:0x0086, B:21:0x025e, B:23:0x0262, B:28:0x026e, B:29:0x0296, B:32:0x02aa, B:35:0x02d0, B:37:0x0309, B:42:0x031f, B:44:0x0329, B:47:0x0822, B:49:0x0352, B:52:0x036a, B:69:0x03cd, B:72:0x03d7, B:74:0x03e5, B:76:0x0438, B:77:0x0406, B:79:0x0415, B:87:0x0447, B:89:0x0477, B:90:0x04a5, B:92:0x04d9, B:93:0x04df, B:97:0x05af, B:98:0x05bb, B:101:0x05c5, B:105:0x05e8, B:106:0x05d7, B:114:0x05ee, B:116:0x05fa, B:118:0x0606, B:123:0x0655, B:124:0x0672, B:126:0x0686, B:128:0x0692, B:131:0x06a5, B:133:0x06b7, B:135:0x06c5, B:138:0x07ae, B:140:0x07b8, B:142:0x07be, B:143:0x07d8, B:145:0x07eb, B:146:0x0805, B:147:0x080e, B:155:0x06ee, B:157:0x06fe, B:160:0x0713, B:162:0x0725, B:164:0x0733, B:166:0x0743, B:168:0x075b, B:170:0x0767, B:173:0x077a, B:175:0x078e, B:177:0x0627, B:181:0x063b, B:183:0x0641, B:185:0x064c, B:193:0x04eb, B:195:0x0520, B:196:0x053d, B:198:0x0543, B:200:0x0551, B:202:0x0565, B:203:0x055a, B:211:0x056c, B:213:0x0573, B:214:0x0592, B:218:0x038c, B:221:0x0396, B:224:0x03a0, B:233:0x083f, B:235:0x084d, B:237:0x0856, B:239:0x0888, B:240:0x085e, B:242:0x0867, B:244:0x086d, B:246:0x0879, B:248:0x0883, B:256:0x088f, B:259:0x08a7, B:260:0x08af, B:262:0x08b5, B:267:0x08cc, B:268:0x08d7, B:270:0x08dd, B:272:0x08ef, B:276:0x08fc, B:278:0x0902, B:279:0x0941, B:281:0x0953, B:283:0x0972, B:285:0x0980, B:287:0x0986, B:289:0x0990, B:290:0x09c2, B:292:0x09c8, B:296:0x09d6, B:298:0x09e1, B:294:0x09db, B:301:0x09e4, B:303:0x09f6, B:304:0x09f9, B:375:0x0a64, B:377:0x0a7f, B:378:0x0a90, B:380:0x0a94, B:382:0x0aa0, B:383:0x0aa8, B:385:0x0aac, B:387:0x0ab2, B:388:0x0ac0, B:389:0x0acb, B:396:0x0b0c, B:397:0x0b14, B:399:0x0b1a, B:403:0x0b2c, B:405:0x0b3a, B:407:0x0b3e, B:409:0x0b48, B:411:0x0b4c, B:415:0x0b62, B:417:0x0b78, B:420:0x0bab, B:422:0x0bbf, B:424:0x0bee, B:431:0x0c59, B:433:0x0c6a, B:435:0x0c6e, B:437:0x0c72, B:439:0x0c76, B:440:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:455:0x0ce7, B:475:0x0c14, B:307:0x0dc5, B:309:0x0dd7, B:310:0x0dda, B:312:0x0dea, B:313:0x0e5f, B:315:0x0e65, B:317:0x0e7a, B:320:0x0e81, B:321:0x0eb4, B:322:0x0e89, B:324:0x0e95, B:325:0x0e9b, B:326:0x0ec5, B:327:0x0edc, B:330:0x0ee4, B:332:0x0ee9, B:335:0x0ef9, B:337:0x0f13, B:338:0x0f2c, B:340:0x0f34, B:341:0x0f56, B:348:0x0f45, B:349:0x0e04, B:351:0x0e0a, B:353:0x0e14, B:354:0x0e1b, B:359:0x0e2b, B:360:0x0e32, B:362:0x0e51, B:363:0x0e58, B:364:0x0e55, B:365:0x0e2f, B:367:0x0e18, B:495:0x091f, B:499:0x0924, B:501:0x0936, B:503:0x0f66, B:515:0x012b, B:529:0x01c9, B:542:0x01ff, B:539:0x021c, B:552:0x0233, B:558:0x025b, B:562:0x0f7b, B:563:0x0f7e, B:581:0x00df, B:518:0x0134), top: B:2:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07be A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:20:0x0086, B:21:0x025e, B:23:0x0262, B:28:0x026e, B:29:0x0296, B:32:0x02aa, B:35:0x02d0, B:37:0x0309, B:42:0x031f, B:44:0x0329, B:47:0x0822, B:49:0x0352, B:52:0x036a, B:69:0x03cd, B:72:0x03d7, B:74:0x03e5, B:76:0x0438, B:77:0x0406, B:79:0x0415, B:87:0x0447, B:89:0x0477, B:90:0x04a5, B:92:0x04d9, B:93:0x04df, B:97:0x05af, B:98:0x05bb, B:101:0x05c5, B:105:0x05e8, B:106:0x05d7, B:114:0x05ee, B:116:0x05fa, B:118:0x0606, B:123:0x0655, B:124:0x0672, B:126:0x0686, B:128:0x0692, B:131:0x06a5, B:133:0x06b7, B:135:0x06c5, B:138:0x07ae, B:140:0x07b8, B:142:0x07be, B:143:0x07d8, B:145:0x07eb, B:146:0x0805, B:147:0x080e, B:155:0x06ee, B:157:0x06fe, B:160:0x0713, B:162:0x0725, B:164:0x0733, B:166:0x0743, B:168:0x075b, B:170:0x0767, B:173:0x077a, B:175:0x078e, B:177:0x0627, B:181:0x063b, B:183:0x0641, B:185:0x064c, B:193:0x04eb, B:195:0x0520, B:196:0x053d, B:198:0x0543, B:200:0x0551, B:202:0x0565, B:203:0x055a, B:211:0x056c, B:213:0x0573, B:214:0x0592, B:218:0x038c, B:221:0x0396, B:224:0x03a0, B:233:0x083f, B:235:0x084d, B:237:0x0856, B:239:0x0888, B:240:0x085e, B:242:0x0867, B:244:0x086d, B:246:0x0879, B:248:0x0883, B:256:0x088f, B:259:0x08a7, B:260:0x08af, B:262:0x08b5, B:267:0x08cc, B:268:0x08d7, B:270:0x08dd, B:272:0x08ef, B:276:0x08fc, B:278:0x0902, B:279:0x0941, B:281:0x0953, B:283:0x0972, B:285:0x0980, B:287:0x0986, B:289:0x0990, B:290:0x09c2, B:292:0x09c8, B:296:0x09d6, B:298:0x09e1, B:294:0x09db, B:301:0x09e4, B:303:0x09f6, B:304:0x09f9, B:375:0x0a64, B:377:0x0a7f, B:378:0x0a90, B:380:0x0a94, B:382:0x0aa0, B:383:0x0aa8, B:385:0x0aac, B:387:0x0ab2, B:388:0x0ac0, B:389:0x0acb, B:396:0x0b0c, B:397:0x0b14, B:399:0x0b1a, B:403:0x0b2c, B:405:0x0b3a, B:407:0x0b3e, B:409:0x0b48, B:411:0x0b4c, B:415:0x0b62, B:417:0x0b78, B:420:0x0bab, B:422:0x0bbf, B:424:0x0bee, B:431:0x0c59, B:433:0x0c6a, B:435:0x0c6e, B:437:0x0c72, B:439:0x0c76, B:440:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:455:0x0ce7, B:475:0x0c14, B:307:0x0dc5, B:309:0x0dd7, B:310:0x0dda, B:312:0x0dea, B:313:0x0e5f, B:315:0x0e65, B:317:0x0e7a, B:320:0x0e81, B:321:0x0eb4, B:322:0x0e89, B:324:0x0e95, B:325:0x0e9b, B:326:0x0ec5, B:327:0x0edc, B:330:0x0ee4, B:332:0x0ee9, B:335:0x0ef9, B:337:0x0f13, B:338:0x0f2c, B:340:0x0f34, B:341:0x0f56, B:348:0x0f45, B:349:0x0e04, B:351:0x0e0a, B:353:0x0e14, B:354:0x0e1b, B:359:0x0e2b, B:360:0x0e32, B:362:0x0e51, B:363:0x0e58, B:364:0x0e55, B:365:0x0e2f, B:367:0x0e18, B:495:0x091f, B:499:0x0924, B:501:0x0936, B:503:0x0f66, B:515:0x012b, B:529:0x01c9, B:542:0x01ff, B:539:0x021c, B:552:0x0233, B:558:0x025b, B:562:0x0f7b, B:563:0x0f7e, B:581:0x00df, B:518:0x0134), top: B:2:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x07d8 A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:20:0x0086, B:21:0x025e, B:23:0x0262, B:28:0x026e, B:29:0x0296, B:32:0x02aa, B:35:0x02d0, B:37:0x0309, B:42:0x031f, B:44:0x0329, B:47:0x0822, B:49:0x0352, B:52:0x036a, B:69:0x03cd, B:72:0x03d7, B:74:0x03e5, B:76:0x0438, B:77:0x0406, B:79:0x0415, B:87:0x0447, B:89:0x0477, B:90:0x04a5, B:92:0x04d9, B:93:0x04df, B:97:0x05af, B:98:0x05bb, B:101:0x05c5, B:105:0x05e8, B:106:0x05d7, B:114:0x05ee, B:116:0x05fa, B:118:0x0606, B:123:0x0655, B:124:0x0672, B:126:0x0686, B:128:0x0692, B:131:0x06a5, B:133:0x06b7, B:135:0x06c5, B:138:0x07ae, B:140:0x07b8, B:142:0x07be, B:143:0x07d8, B:145:0x07eb, B:146:0x0805, B:147:0x080e, B:155:0x06ee, B:157:0x06fe, B:160:0x0713, B:162:0x0725, B:164:0x0733, B:166:0x0743, B:168:0x075b, B:170:0x0767, B:173:0x077a, B:175:0x078e, B:177:0x0627, B:181:0x063b, B:183:0x0641, B:185:0x064c, B:193:0x04eb, B:195:0x0520, B:196:0x053d, B:198:0x0543, B:200:0x0551, B:202:0x0565, B:203:0x055a, B:211:0x056c, B:213:0x0573, B:214:0x0592, B:218:0x038c, B:221:0x0396, B:224:0x03a0, B:233:0x083f, B:235:0x084d, B:237:0x0856, B:239:0x0888, B:240:0x085e, B:242:0x0867, B:244:0x086d, B:246:0x0879, B:248:0x0883, B:256:0x088f, B:259:0x08a7, B:260:0x08af, B:262:0x08b5, B:267:0x08cc, B:268:0x08d7, B:270:0x08dd, B:272:0x08ef, B:276:0x08fc, B:278:0x0902, B:279:0x0941, B:281:0x0953, B:283:0x0972, B:285:0x0980, B:287:0x0986, B:289:0x0990, B:290:0x09c2, B:292:0x09c8, B:296:0x09d6, B:298:0x09e1, B:294:0x09db, B:301:0x09e4, B:303:0x09f6, B:304:0x09f9, B:375:0x0a64, B:377:0x0a7f, B:378:0x0a90, B:380:0x0a94, B:382:0x0aa0, B:383:0x0aa8, B:385:0x0aac, B:387:0x0ab2, B:388:0x0ac0, B:389:0x0acb, B:396:0x0b0c, B:397:0x0b14, B:399:0x0b1a, B:403:0x0b2c, B:405:0x0b3a, B:407:0x0b3e, B:409:0x0b48, B:411:0x0b4c, B:415:0x0b62, B:417:0x0b78, B:420:0x0bab, B:422:0x0bbf, B:424:0x0bee, B:431:0x0c59, B:433:0x0c6a, B:435:0x0c6e, B:437:0x0c72, B:439:0x0c76, B:440:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:455:0x0ce7, B:475:0x0c14, B:307:0x0dc5, B:309:0x0dd7, B:310:0x0dda, B:312:0x0dea, B:313:0x0e5f, B:315:0x0e65, B:317:0x0e7a, B:320:0x0e81, B:321:0x0eb4, B:322:0x0e89, B:324:0x0e95, B:325:0x0e9b, B:326:0x0ec5, B:327:0x0edc, B:330:0x0ee4, B:332:0x0ee9, B:335:0x0ef9, B:337:0x0f13, B:338:0x0f2c, B:340:0x0f34, B:341:0x0f56, B:348:0x0f45, B:349:0x0e04, B:351:0x0e0a, B:353:0x0e14, B:354:0x0e1b, B:359:0x0e2b, B:360:0x0e32, B:362:0x0e51, B:363:0x0e58, B:364:0x0e55, B:365:0x0e2f, B:367:0x0e18, B:495:0x091f, B:499:0x0924, B:501:0x0936, B:503:0x0f66, B:515:0x012b, B:529:0x01c9, B:542:0x01ff, B:539:0x021c, B:552:0x0233, B:558:0x025b, B:562:0x0f7b, B:563:0x0f7e, B:581:0x00df, B:518:0x0134), top: B:2:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0262 A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:20:0x0086, B:21:0x025e, B:23:0x0262, B:28:0x026e, B:29:0x0296, B:32:0x02aa, B:35:0x02d0, B:37:0x0309, B:42:0x031f, B:44:0x0329, B:47:0x0822, B:49:0x0352, B:52:0x036a, B:69:0x03cd, B:72:0x03d7, B:74:0x03e5, B:76:0x0438, B:77:0x0406, B:79:0x0415, B:87:0x0447, B:89:0x0477, B:90:0x04a5, B:92:0x04d9, B:93:0x04df, B:97:0x05af, B:98:0x05bb, B:101:0x05c5, B:105:0x05e8, B:106:0x05d7, B:114:0x05ee, B:116:0x05fa, B:118:0x0606, B:123:0x0655, B:124:0x0672, B:126:0x0686, B:128:0x0692, B:131:0x06a5, B:133:0x06b7, B:135:0x06c5, B:138:0x07ae, B:140:0x07b8, B:142:0x07be, B:143:0x07d8, B:145:0x07eb, B:146:0x0805, B:147:0x080e, B:155:0x06ee, B:157:0x06fe, B:160:0x0713, B:162:0x0725, B:164:0x0733, B:166:0x0743, B:168:0x075b, B:170:0x0767, B:173:0x077a, B:175:0x078e, B:177:0x0627, B:181:0x063b, B:183:0x0641, B:185:0x064c, B:193:0x04eb, B:195:0x0520, B:196:0x053d, B:198:0x0543, B:200:0x0551, B:202:0x0565, B:203:0x055a, B:211:0x056c, B:213:0x0573, B:214:0x0592, B:218:0x038c, B:221:0x0396, B:224:0x03a0, B:233:0x083f, B:235:0x084d, B:237:0x0856, B:239:0x0888, B:240:0x085e, B:242:0x0867, B:244:0x086d, B:246:0x0879, B:248:0x0883, B:256:0x088f, B:259:0x08a7, B:260:0x08af, B:262:0x08b5, B:267:0x08cc, B:268:0x08d7, B:270:0x08dd, B:272:0x08ef, B:276:0x08fc, B:278:0x0902, B:279:0x0941, B:281:0x0953, B:283:0x0972, B:285:0x0980, B:287:0x0986, B:289:0x0990, B:290:0x09c2, B:292:0x09c8, B:296:0x09d6, B:298:0x09e1, B:294:0x09db, B:301:0x09e4, B:303:0x09f6, B:304:0x09f9, B:375:0x0a64, B:377:0x0a7f, B:378:0x0a90, B:380:0x0a94, B:382:0x0aa0, B:383:0x0aa8, B:385:0x0aac, B:387:0x0ab2, B:388:0x0ac0, B:389:0x0acb, B:396:0x0b0c, B:397:0x0b14, B:399:0x0b1a, B:403:0x0b2c, B:405:0x0b3a, B:407:0x0b3e, B:409:0x0b48, B:411:0x0b4c, B:415:0x0b62, B:417:0x0b78, B:420:0x0bab, B:422:0x0bbf, B:424:0x0bee, B:431:0x0c59, B:433:0x0c6a, B:435:0x0c6e, B:437:0x0c72, B:439:0x0c76, B:440:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:455:0x0ce7, B:475:0x0c14, B:307:0x0dc5, B:309:0x0dd7, B:310:0x0dda, B:312:0x0dea, B:313:0x0e5f, B:315:0x0e65, B:317:0x0e7a, B:320:0x0e81, B:321:0x0eb4, B:322:0x0e89, B:324:0x0e95, B:325:0x0e9b, B:326:0x0ec5, B:327:0x0edc, B:330:0x0ee4, B:332:0x0ee9, B:335:0x0ef9, B:337:0x0f13, B:338:0x0f2c, B:340:0x0f34, B:341:0x0f56, B:348:0x0f45, B:349:0x0e04, B:351:0x0e0a, B:353:0x0e14, B:354:0x0e1b, B:359:0x0e2b, B:360:0x0e32, B:362:0x0e51, B:363:0x0e58, B:364:0x0e55, B:365:0x0e2f, B:367:0x0e18, B:495:0x091f, B:499:0x0924, B:501:0x0936, B:503:0x0f66, B:515:0x012b, B:529:0x01c9, B:542:0x01ff, B:539:0x021c, B:552:0x0233, B:558:0x025b, B:562:0x0f7b, B:563:0x0f7e, B:581:0x00df, B:518:0x0134), top: B:2:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x026e A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:20:0x0086, B:21:0x025e, B:23:0x0262, B:28:0x026e, B:29:0x0296, B:32:0x02aa, B:35:0x02d0, B:37:0x0309, B:42:0x031f, B:44:0x0329, B:47:0x0822, B:49:0x0352, B:52:0x036a, B:69:0x03cd, B:72:0x03d7, B:74:0x03e5, B:76:0x0438, B:77:0x0406, B:79:0x0415, B:87:0x0447, B:89:0x0477, B:90:0x04a5, B:92:0x04d9, B:93:0x04df, B:97:0x05af, B:98:0x05bb, B:101:0x05c5, B:105:0x05e8, B:106:0x05d7, B:114:0x05ee, B:116:0x05fa, B:118:0x0606, B:123:0x0655, B:124:0x0672, B:126:0x0686, B:128:0x0692, B:131:0x06a5, B:133:0x06b7, B:135:0x06c5, B:138:0x07ae, B:140:0x07b8, B:142:0x07be, B:143:0x07d8, B:145:0x07eb, B:146:0x0805, B:147:0x080e, B:155:0x06ee, B:157:0x06fe, B:160:0x0713, B:162:0x0725, B:164:0x0733, B:166:0x0743, B:168:0x075b, B:170:0x0767, B:173:0x077a, B:175:0x078e, B:177:0x0627, B:181:0x063b, B:183:0x0641, B:185:0x064c, B:193:0x04eb, B:195:0x0520, B:196:0x053d, B:198:0x0543, B:200:0x0551, B:202:0x0565, B:203:0x055a, B:211:0x056c, B:213:0x0573, B:214:0x0592, B:218:0x038c, B:221:0x0396, B:224:0x03a0, B:233:0x083f, B:235:0x084d, B:237:0x0856, B:239:0x0888, B:240:0x085e, B:242:0x0867, B:244:0x086d, B:246:0x0879, B:248:0x0883, B:256:0x088f, B:259:0x08a7, B:260:0x08af, B:262:0x08b5, B:267:0x08cc, B:268:0x08d7, B:270:0x08dd, B:272:0x08ef, B:276:0x08fc, B:278:0x0902, B:279:0x0941, B:281:0x0953, B:283:0x0972, B:285:0x0980, B:287:0x0986, B:289:0x0990, B:290:0x09c2, B:292:0x09c8, B:296:0x09d6, B:298:0x09e1, B:294:0x09db, B:301:0x09e4, B:303:0x09f6, B:304:0x09f9, B:375:0x0a64, B:377:0x0a7f, B:378:0x0a90, B:380:0x0a94, B:382:0x0aa0, B:383:0x0aa8, B:385:0x0aac, B:387:0x0ab2, B:388:0x0ac0, B:389:0x0acb, B:396:0x0b0c, B:397:0x0b14, B:399:0x0b1a, B:403:0x0b2c, B:405:0x0b3a, B:407:0x0b3e, B:409:0x0b48, B:411:0x0b4c, B:415:0x0b62, B:417:0x0b78, B:420:0x0bab, B:422:0x0bbf, B:424:0x0bee, B:431:0x0c59, B:433:0x0c6a, B:435:0x0c6e, B:437:0x0c72, B:439:0x0c76, B:440:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:455:0x0ce7, B:475:0x0c14, B:307:0x0dc5, B:309:0x0dd7, B:310:0x0dda, B:312:0x0dea, B:313:0x0e5f, B:315:0x0e65, B:317:0x0e7a, B:320:0x0e81, B:321:0x0eb4, B:322:0x0e89, B:324:0x0e95, B:325:0x0e9b, B:326:0x0ec5, B:327:0x0edc, B:330:0x0ee4, B:332:0x0ee9, B:335:0x0ef9, B:337:0x0f13, B:338:0x0f2c, B:340:0x0f34, B:341:0x0f56, B:348:0x0f45, B:349:0x0e04, B:351:0x0e0a, B:353:0x0e14, B:354:0x0e1b, B:359:0x0e2b, B:360:0x0e32, B:362:0x0e51, B:363:0x0e58, B:364:0x0e55, B:365:0x0e2f, B:367:0x0e18, B:495:0x091f, B:499:0x0924, B:501:0x0936, B:503:0x0f66, B:515:0x012b, B:529:0x01c9, B:542:0x01ff, B:539:0x021c, B:552:0x0233, B:558:0x025b, B:562:0x0f7b, B:563:0x0f7e, B:581:0x00df, B:518:0x0134), top: B:2:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0f66 A[Catch: all -> 0x0f7f, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:20:0x0086, B:21:0x025e, B:23:0x0262, B:28:0x026e, B:29:0x0296, B:32:0x02aa, B:35:0x02d0, B:37:0x0309, B:42:0x031f, B:44:0x0329, B:47:0x0822, B:49:0x0352, B:52:0x036a, B:69:0x03cd, B:72:0x03d7, B:74:0x03e5, B:76:0x0438, B:77:0x0406, B:79:0x0415, B:87:0x0447, B:89:0x0477, B:90:0x04a5, B:92:0x04d9, B:93:0x04df, B:97:0x05af, B:98:0x05bb, B:101:0x05c5, B:105:0x05e8, B:106:0x05d7, B:114:0x05ee, B:116:0x05fa, B:118:0x0606, B:123:0x0655, B:124:0x0672, B:126:0x0686, B:128:0x0692, B:131:0x06a5, B:133:0x06b7, B:135:0x06c5, B:138:0x07ae, B:140:0x07b8, B:142:0x07be, B:143:0x07d8, B:145:0x07eb, B:146:0x0805, B:147:0x080e, B:155:0x06ee, B:157:0x06fe, B:160:0x0713, B:162:0x0725, B:164:0x0733, B:166:0x0743, B:168:0x075b, B:170:0x0767, B:173:0x077a, B:175:0x078e, B:177:0x0627, B:181:0x063b, B:183:0x0641, B:185:0x064c, B:193:0x04eb, B:195:0x0520, B:196:0x053d, B:198:0x0543, B:200:0x0551, B:202:0x0565, B:203:0x055a, B:211:0x056c, B:213:0x0573, B:214:0x0592, B:218:0x038c, B:221:0x0396, B:224:0x03a0, B:233:0x083f, B:235:0x084d, B:237:0x0856, B:239:0x0888, B:240:0x085e, B:242:0x0867, B:244:0x086d, B:246:0x0879, B:248:0x0883, B:256:0x088f, B:259:0x08a7, B:260:0x08af, B:262:0x08b5, B:267:0x08cc, B:268:0x08d7, B:270:0x08dd, B:272:0x08ef, B:276:0x08fc, B:278:0x0902, B:279:0x0941, B:281:0x0953, B:283:0x0972, B:285:0x0980, B:287:0x0986, B:289:0x0990, B:290:0x09c2, B:292:0x09c8, B:296:0x09d6, B:298:0x09e1, B:294:0x09db, B:301:0x09e4, B:303:0x09f6, B:304:0x09f9, B:375:0x0a64, B:377:0x0a7f, B:378:0x0a90, B:380:0x0a94, B:382:0x0aa0, B:383:0x0aa8, B:385:0x0aac, B:387:0x0ab2, B:388:0x0ac0, B:389:0x0acb, B:396:0x0b0c, B:397:0x0b14, B:399:0x0b1a, B:403:0x0b2c, B:405:0x0b3a, B:407:0x0b3e, B:409:0x0b48, B:411:0x0b4c, B:415:0x0b62, B:417:0x0b78, B:420:0x0bab, B:422:0x0bbf, B:424:0x0bee, B:431:0x0c59, B:433:0x0c6a, B:435:0x0c6e, B:437:0x0c72, B:439:0x0c76, B:440:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:455:0x0ce7, B:475:0x0c14, B:307:0x0dc5, B:309:0x0dd7, B:310:0x0dda, B:312:0x0dea, B:313:0x0e5f, B:315:0x0e65, B:317:0x0e7a, B:320:0x0e81, B:321:0x0eb4, B:322:0x0e89, B:324:0x0e95, B:325:0x0e9b, B:326:0x0ec5, B:327:0x0edc, B:330:0x0ee4, B:332:0x0ee9, B:335:0x0ef9, B:337:0x0f13, B:338:0x0f2c, B:340:0x0f34, B:341:0x0f56, B:348:0x0f45, B:349:0x0e04, B:351:0x0e0a, B:353:0x0e14, B:354:0x0e1b, B:359:0x0e2b, B:360:0x0e32, B:362:0x0e51, B:363:0x0e58, B:364:0x0e55, B:365:0x0e2f, B:367:0x0e18, B:495:0x091f, B:499:0x0924, B:501:0x0936, B:503:0x0f66, B:515:0x012b, B:529:0x01c9, B:542:0x01ff, B:539:0x021c, B:552:0x0233, B:558:0x025b, B:562:0x0f7b, B:563:0x0f7e, B:581:0x00df, B:518:0x0134), top: B:2:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x025b A[Catch: all -> 0x0f7f, TRY_ENTER, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:20:0x0086, B:21:0x025e, B:23:0x0262, B:28:0x026e, B:29:0x0296, B:32:0x02aa, B:35:0x02d0, B:37:0x0309, B:42:0x031f, B:44:0x0329, B:47:0x0822, B:49:0x0352, B:52:0x036a, B:69:0x03cd, B:72:0x03d7, B:74:0x03e5, B:76:0x0438, B:77:0x0406, B:79:0x0415, B:87:0x0447, B:89:0x0477, B:90:0x04a5, B:92:0x04d9, B:93:0x04df, B:97:0x05af, B:98:0x05bb, B:101:0x05c5, B:105:0x05e8, B:106:0x05d7, B:114:0x05ee, B:116:0x05fa, B:118:0x0606, B:123:0x0655, B:124:0x0672, B:126:0x0686, B:128:0x0692, B:131:0x06a5, B:133:0x06b7, B:135:0x06c5, B:138:0x07ae, B:140:0x07b8, B:142:0x07be, B:143:0x07d8, B:145:0x07eb, B:146:0x0805, B:147:0x080e, B:155:0x06ee, B:157:0x06fe, B:160:0x0713, B:162:0x0725, B:164:0x0733, B:166:0x0743, B:168:0x075b, B:170:0x0767, B:173:0x077a, B:175:0x078e, B:177:0x0627, B:181:0x063b, B:183:0x0641, B:185:0x064c, B:193:0x04eb, B:195:0x0520, B:196:0x053d, B:198:0x0543, B:200:0x0551, B:202:0x0565, B:203:0x055a, B:211:0x056c, B:213:0x0573, B:214:0x0592, B:218:0x038c, B:221:0x0396, B:224:0x03a0, B:233:0x083f, B:235:0x084d, B:237:0x0856, B:239:0x0888, B:240:0x085e, B:242:0x0867, B:244:0x086d, B:246:0x0879, B:248:0x0883, B:256:0x088f, B:259:0x08a7, B:260:0x08af, B:262:0x08b5, B:267:0x08cc, B:268:0x08d7, B:270:0x08dd, B:272:0x08ef, B:276:0x08fc, B:278:0x0902, B:279:0x0941, B:281:0x0953, B:283:0x0972, B:285:0x0980, B:287:0x0986, B:289:0x0990, B:290:0x09c2, B:292:0x09c8, B:296:0x09d6, B:298:0x09e1, B:294:0x09db, B:301:0x09e4, B:303:0x09f6, B:304:0x09f9, B:375:0x0a64, B:377:0x0a7f, B:378:0x0a90, B:380:0x0a94, B:382:0x0aa0, B:383:0x0aa8, B:385:0x0aac, B:387:0x0ab2, B:388:0x0ac0, B:389:0x0acb, B:396:0x0b0c, B:397:0x0b14, B:399:0x0b1a, B:403:0x0b2c, B:405:0x0b3a, B:407:0x0b3e, B:409:0x0b48, B:411:0x0b4c, B:415:0x0b62, B:417:0x0b78, B:420:0x0bab, B:422:0x0bbf, B:424:0x0bee, B:431:0x0c59, B:433:0x0c6a, B:435:0x0c6e, B:437:0x0c72, B:439:0x0c76, B:440:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:455:0x0ce7, B:475:0x0c14, B:307:0x0dc5, B:309:0x0dd7, B:310:0x0dda, B:312:0x0dea, B:313:0x0e5f, B:315:0x0e65, B:317:0x0e7a, B:320:0x0e81, B:321:0x0eb4, B:322:0x0e89, B:324:0x0e95, B:325:0x0e9b, B:326:0x0ec5, B:327:0x0edc, B:330:0x0ee4, B:332:0x0ee9, B:335:0x0ef9, B:337:0x0f13, B:338:0x0f2c, B:340:0x0f34, B:341:0x0f56, B:348:0x0f45, B:349:0x0e04, B:351:0x0e0a, B:353:0x0e14, B:354:0x0e1b, B:359:0x0e2b, B:360:0x0e32, B:362:0x0e51, B:363:0x0e58, B:364:0x0e55, B:365:0x0e2f, B:367:0x0e18, B:495:0x091f, B:499:0x0924, B:501:0x0936, B:503:0x0f66, B:515:0x012b, B:529:0x01c9, B:542:0x01ff, B:539:0x021c, B:552:0x0233, B:558:0x025b, B:562:0x0f7b, B:563:0x0f7e, B:581:0x00df, B:518:0x0134), top: B:2:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05af A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:20:0x0086, B:21:0x025e, B:23:0x0262, B:28:0x026e, B:29:0x0296, B:32:0x02aa, B:35:0x02d0, B:37:0x0309, B:42:0x031f, B:44:0x0329, B:47:0x0822, B:49:0x0352, B:52:0x036a, B:69:0x03cd, B:72:0x03d7, B:74:0x03e5, B:76:0x0438, B:77:0x0406, B:79:0x0415, B:87:0x0447, B:89:0x0477, B:90:0x04a5, B:92:0x04d9, B:93:0x04df, B:97:0x05af, B:98:0x05bb, B:101:0x05c5, B:105:0x05e8, B:106:0x05d7, B:114:0x05ee, B:116:0x05fa, B:118:0x0606, B:123:0x0655, B:124:0x0672, B:126:0x0686, B:128:0x0692, B:131:0x06a5, B:133:0x06b7, B:135:0x06c5, B:138:0x07ae, B:140:0x07b8, B:142:0x07be, B:143:0x07d8, B:145:0x07eb, B:146:0x0805, B:147:0x080e, B:155:0x06ee, B:157:0x06fe, B:160:0x0713, B:162:0x0725, B:164:0x0733, B:166:0x0743, B:168:0x075b, B:170:0x0767, B:173:0x077a, B:175:0x078e, B:177:0x0627, B:181:0x063b, B:183:0x0641, B:185:0x064c, B:193:0x04eb, B:195:0x0520, B:196:0x053d, B:198:0x0543, B:200:0x0551, B:202:0x0565, B:203:0x055a, B:211:0x056c, B:213:0x0573, B:214:0x0592, B:218:0x038c, B:221:0x0396, B:224:0x03a0, B:233:0x083f, B:235:0x084d, B:237:0x0856, B:239:0x0888, B:240:0x085e, B:242:0x0867, B:244:0x086d, B:246:0x0879, B:248:0x0883, B:256:0x088f, B:259:0x08a7, B:260:0x08af, B:262:0x08b5, B:267:0x08cc, B:268:0x08d7, B:270:0x08dd, B:272:0x08ef, B:276:0x08fc, B:278:0x0902, B:279:0x0941, B:281:0x0953, B:283:0x0972, B:285:0x0980, B:287:0x0986, B:289:0x0990, B:290:0x09c2, B:292:0x09c8, B:296:0x09d6, B:298:0x09e1, B:294:0x09db, B:301:0x09e4, B:303:0x09f6, B:304:0x09f9, B:375:0x0a64, B:377:0x0a7f, B:378:0x0a90, B:380:0x0a94, B:382:0x0aa0, B:383:0x0aa8, B:385:0x0aac, B:387:0x0ab2, B:388:0x0ac0, B:389:0x0acb, B:396:0x0b0c, B:397:0x0b14, B:399:0x0b1a, B:403:0x0b2c, B:405:0x0b3a, B:407:0x0b3e, B:409:0x0b48, B:411:0x0b4c, B:415:0x0b62, B:417:0x0b78, B:420:0x0bab, B:422:0x0bbf, B:424:0x0bee, B:431:0x0c59, B:433:0x0c6a, B:435:0x0c6e, B:437:0x0c72, B:439:0x0c76, B:440:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:455:0x0ce7, B:475:0x0c14, B:307:0x0dc5, B:309:0x0dd7, B:310:0x0dda, B:312:0x0dea, B:313:0x0e5f, B:315:0x0e65, B:317:0x0e7a, B:320:0x0e81, B:321:0x0eb4, B:322:0x0e89, B:324:0x0e95, B:325:0x0e9b, B:326:0x0ec5, B:327:0x0edc, B:330:0x0ee4, B:332:0x0ee9, B:335:0x0ef9, B:337:0x0f13, B:338:0x0f2c, B:340:0x0f34, B:341:0x0f56, B:348:0x0f45, B:349:0x0e04, B:351:0x0e0a, B:353:0x0e14, B:354:0x0e1b, B:359:0x0e2b, B:360:0x0e32, B:362:0x0e51, B:363:0x0e58, B:364:0x0e55, B:365:0x0e2f, B:367:0x0e18, B:495:0x091f, B:499:0x0924, B:501:0x0936, B:503:0x0f66, B:515:0x012b, B:529:0x01c9, B:542:0x01ff, B:539:0x021c, B:552:0x0233, B:558:0x025b, B:562:0x0f7b, B:563:0x0f7e, B:581:0x00df, B:518:0x0134), top: B:2:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v42, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m23408E(java.lang.String r61, long r62) {
        /*
            Method dump skipped, instructions count: 3979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23408E(java.lang.String, long):boolean");
    }

    /* renamed from: F */
    private final void m23409F() {
        m23423j0();
        if (this.f29373r || this.f29374s || this.f29375t) {
            this.f29365j.mo22836h().m23145P().m23150d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f29373r), Boolean.valueOf(this.f29374s), Boolean.valueOf(this.f29375t));
            return;
        }
        this.f29365j.mo22836h().m23145P().m23147a("Stopping uploading service(s)");
        List<Runnable> list = this.f29370o;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f29370o.clear();
    }

    @VisibleForTesting
    /* renamed from: H */
    private final boolean m23410H() {
        FileLock fileLock;
        m23423j0();
        if (this.f29365j.m23243y().m23587r(zzap.f29104L0) && (fileLock = this.f29376u) != null && fileLock.isValid()) {
            this.f29365j.mo22836h().m23145P().m23147a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f29365j.mo22834f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f29377v = channel;
            FileLock tryLock = channel.tryLock();
            this.f29376u = tryLock;
            if (tryLock != null) {
                this.f29365j.mo22836h().m23145P().m23147a("Storage concurrent access okay");
                return true;
            }
            this.f29365j.mo22836h().m23137H().m23147a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            this.f29365j.mo22836h().m23137H().m23148b("Failed to acquire storage lock", e2);
            return false;
        } catch (IOException e3) {
            this.f29365j.mo22836h().m23137H().m23148b("Failed to access storage lock file", e3);
            return false;
        } catch (OverlappingFileLockException e4) {
            this.f29365j.mo22836h().m23140K().m23148b("Storage lock already acquired", e4);
            return false;
        }
    }

    /* renamed from: I */
    private final boolean m23411I() {
        m23423j0();
        m23451c0();
        return this.f29367l;
    }

    /* renamed from: K */
    private final Boolean m23412K(C7845z3 c7845z3) {
        try {
            if (c7845z3.m22903V() != -2147483648L) {
                if (c7845z3.m22903V() == Wrappers.m14674a(this.f29365j.mo22834f()).m14671e(c7845z3.m22940t(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.m14674a(this.f29365j.mo22834f()).m14671e(c7845z3.m22940t(), 0).versionName;
                if (c7845z3.m22901T() != null && c7845z3.m22901T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: L */
    private final void m23413L(zzbr.zzc.zza zzaVar, zzbr.zzc.zza zzaVar2) {
        Preconditions.m14362a("_e".equals(zzaVar.m21704K()));
        m23448Z();
        zzbr.zze m23480z = zzkg.m23480z((zzbr.zzc) ((zzfd) zzaVar.mo22283y()), "_et");
        if (!m23480z.m21736P() || m23480z.m21737Q() <= 0) {
            return;
        }
        long m21737Q = m23480z.m21737Q();
        m23448Z();
        zzbr.zze m23480z2 = zzkg.m23480z((zzbr.zzc) ((zzfd) zzaVar2.mo22283y()), "_et");
        if (m23480z2 != null && m23480z2.m21737Q() > 0) {
            m21737Q += m23480z2.m21737Q();
        }
        m23448Z();
        zzkg.m23470I(zzaVar2, "_et", Long.valueOf(m21737Q));
        m23448Z();
        zzkg.m23470I(zzaVar, "_fr", 1L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:225|(1:227)(1:251)|228|(2:230|(1:232)(8:233|234|235|(1:237)|238|(0)|43|(0)(0)))|243|244|245|246|234|235|(0)|238|(0)|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0234, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0236, code lost:
    
        r7.mo22836h().m23137H().m23149c("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzet.m23131x(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0845 A[Catch: all -> 0x08ba, TryCatch #2 {all -> 0x08ba, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b1, B:45:0x02f0, B:47:0x02f5, B:48:0x030e, B:52:0x031f, B:54:0x0334, B:56:0x033b, B:57:0x0354, B:61:0x0377, B:65:0x039f, B:66:0x03b8, B:69:0x03c8, B:72:0x03eb, B:73:0x0409, B:76:0x0413, B:78:0x0421, B:80:0x042d, B:82:0x0433, B:83:0x043e, B:85:0x0446, B:87:0x0456, B:89:0x0464, B:90:0x046f, B:92:0x047b, B:93:0x0492, B:95:0x04bf, B:98:0x04cf, B:101:0x050b, B:102:0x0533, B:104:0x056d, B:105:0x0572, B:107:0x057a, B:108:0x057f, B:110:0x0587, B:111:0x058c, B:113:0x0595, B:114:0x0599, B:116:0x05a6, B:117:0x05ab, B:119:0x05b9, B:121:0x05c3, B:123:0x05cb, B:124:0x05de, B:126:0x05e6, B:127:0x05e9, B:129:0x05fe, B:131:0x0608, B:132:0x060b, B:134:0x0619, B:136:0x0623, B:138:0x0627, B:140:0x0632, B:141:0x069e, B:143:0x06e6, B:145:0x06ec, B:147:0x06f5, B:148:0x06fa, B:150:0x0706, B:151:0x076d, B:153:0x0777, B:154:0x077e, B:156:0x0788, B:157:0x078f, B:158:0x079a, B:160:0x07a0, B:163:0x07d1, B:164:0x07e1, B:166:0x07e9, B:167:0x07ed, B:169:0x07f3, B:174:0x083f, B:176:0x0845, B:177:0x0861, B:179:0x0875, B:183:0x0806, B:185:0x082a, B:191:0x0849, B:192:0x063c, B:194:0x064e, B:196:0x0652, B:198:0x0664, B:199:0x069b, B:200:0x067e, B:202:0x0684, B:203:0x05d1, B:205:0x05d9, B:206:0x0525, B:209:0x0125, B:212:0x0137, B:214:0x014e, B:220:0x016a, B:221:0x0196, B:223:0x019c, B:225:0x01aa, B:227:0x01b2, B:228:0x01bc, B:230:0x01c7, B:233:0x01ce, B:235:0x0261, B:237:0x026b, B:240:0x02a2, B:243:0x01fb, B:245:0x0219, B:246:0x0247, B:250:0x0236, B:251:0x01b7, B:253:0x016f, B:254:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0875 A[Catch: all -> 0x08ba, TRY_LEAVE, TryCatch #2 {all -> 0x08ba, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b1, B:45:0x02f0, B:47:0x02f5, B:48:0x030e, B:52:0x031f, B:54:0x0334, B:56:0x033b, B:57:0x0354, B:61:0x0377, B:65:0x039f, B:66:0x03b8, B:69:0x03c8, B:72:0x03eb, B:73:0x0409, B:76:0x0413, B:78:0x0421, B:80:0x042d, B:82:0x0433, B:83:0x043e, B:85:0x0446, B:87:0x0456, B:89:0x0464, B:90:0x046f, B:92:0x047b, B:93:0x0492, B:95:0x04bf, B:98:0x04cf, B:101:0x050b, B:102:0x0533, B:104:0x056d, B:105:0x0572, B:107:0x057a, B:108:0x057f, B:110:0x0587, B:111:0x058c, B:113:0x0595, B:114:0x0599, B:116:0x05a6, B:117:0x05ab, B:119:0x05b9, B:121:0x05c3, B:123:0x05cb, B:124:0x05de, B:126:0x05e6, B:127:0x05e9, B:129:0x05fe, B:131:0x0608, B:132:0x060b, B:134:0x0619, B:136:0x0623, B:138:0x0627, B:140:0x0632, B:141:0x069e, B:143:0x06e6, B:145:0x06ec, B:147:0x06f5, B:148:0x06fa, B:150:0x0706, B:151:0x076d, B:153:0x0777, B:154:0x077e, B:156:0x0788, B:157:0x078f, B:158:0x079a, B:160:0x07a0, B:163:0x07d1, B:164:0x07e1, B:166:0x07e9, B:167:0x07ed, B:169:0x07f3, B:174:0x083f, B:176:0x0845, B:177:0x0861, B:179:0x0875, B:183:0x0806, B:185:0x082a, B:191:0x0849, B:192:0x063c, B:194:0x064e, B:196:0x0652, B:198:0x0664, B:199:0x069b, B:200:0x067e, B:202:0x0684, B:203:0x05d1, B:205:0x05d9, B:206:0x0525, B:209:0x0125, B:212:0x0137, B:214:0x014e, B:220:0x016a, B:221:0x0196, B:223:0x019c, B:225:0x01aa, B:227:0x01b2, B:228:0x01bc, B:230:0x01c7, B:233:0x01ce, B:235:0x0261, B:237:0x026b, B:240:0x02a2, B:243:0x01fb, B:245:0x0219, B:246:0x0247, B:250:0x0236, B:251:0x01b7, B:253:0x016f, B:254:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x026b A[Catch: all -> 0x08ba, TryCatch #2 {all -> 0x08ba, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b1, B:45:0x02f0, B:47:0x02f5, B:48:0x030e, B:52:0x031f, B:54:0x0334, B:56:0x033b, B:57:0x0354, B:61:0x0377, B:65:0x039f, B:66:0x03b8, B:69:0x03c8, B:72:0x03eb, B:73:0x0409, B:76:0x0413, B:78:0x0421, B:80:0x042d, B:82:0x0433, B:83:0x043e, B:85:0x0446, B:87:0x0456, B:89:0x0464, B:90:0x046f, B:92:0x047b, B:93:0x0492, B:95:0x04bf, B:98:0x04cf, B:101:0x050b, B:102:0x0533, B:104:0x056d, B:105:0x0572, B:107:0x057a, B:108:0x057f, B:110:0x0587, B:111:0x058c, B:113:0x0595, B:114:0x0599, B:116:0x05a6, B:117:0x05ab, B:119:0x05b9, B:121:0x05c3, B:123:0x05cb, B:124:0x05de, B:126:0x05e6, B:127:0x05e9, B:129:0x05fe, B:131:0x0608, B:132:0x060b, B:134:0x0619, B:136:0x0623, B:138:0x0627, B:140:0x0632, B:141:0x069e, B:143:0x06e6, B:145:0x06ec, B:147:0x06f5, B:148:0x06fa, B:150:0x0706, B:151:0x076d, B:153:0x0777, B:154:0x077e, B:156:0x0788, B:157:0x078f, B:158:0x079a, B:160:0x07a0, B:163:0x07d1, B:164:0x07e1, B:166:0x07e9, B:167:0x07ed, B:169:0x07f3, B:174:0x083f, B:176:0x0845, B:177:0x0861, B:179:0x0875, B:183:0x0806, B:185:0x082a, B:191:0x0849, B:192:0x063c, B:194:0x064e, B:196:0x0652, B:198:0x0664, B:199:0x069b, B:200:0x067e, B:202:0x0684, B:203:0x05d1, B:205:0x05d9, B:206:0x0525, B:209:0x0125, B:212:0x0137, B:214:0x014e, B:220:0x016a, B:221:0x0196, B:223:0x019c, B:225:0x01aa, B:227:0x01b2, B:228:0x01bc, B:230:0x01c7, B:233:0x01ce, B:235:0x0261, B:237:0x026b, B:240:0x02a2, B:243:0x01fb, B:245:0x0219, B:246:0x0247, B:250:0x0236, B:251:0x01b7, B:253:0x016f, B:254:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02a2 A[Catch: all -> 0x08ba, TRY_LEAVE, TryCatch #2 {all -> 0x08ba, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b1, B:45:0x02f0, B:47:0x02f5, B:48:0x030e, B:52:0x031f, B:54:0x0334, B:56:0x033b, B:57:0x0354, B:61:0x0377, B:65:0x039f, B:66:0x03b8, B:69:0x03c8, B:72:0x03eb, B:73:0x0409, B:76:0x0413, B:78:0x0421, B:80:0x042d, B:82:0x0433, B:83:0x043e, B:85:0x0446, B:87:0x0456, B:89:0x0464, B:90:0x046f, B:92:0x047b, B:93:0x0492, B:95:0x04bf, B:98:0x04cf, B:101:0x050b, B:102:0x0533, B:104:0x056d, B:105:0x0572, B:107:0x057a, B:108:0x057f, B:110:0x0587, B:111:0x058c, B:113:0x0595, B:114:0x0599, B:116:0x05a6, B:117:0x05ab, B:119:0x05b9, B:121:0x05c3, B:123:0x05cb, B:124:0x05de, B:126:0x05e6, B:127:0x05e9, B:129:0x05fe, B:131:0x0608, B:132:0x060b, B:134:0x0619, B:136:0x0623, B:138:0x0627, B:140:0x0632, B:141:0x069e, B:143:0x06e6, B:145:0x06ec, B:147:0x06f5, B:148:0x06fa, B:150:0x0706, B:151:0x076d, B:153:0x0777, B:154:0x077e, B:156:0x0788, B:157:0x078f, B:158:0x079a, B:160:0x07a0, B:163:0x07d1, B:164:0x07e1, B:166:0x07e9, B:167:0x07ed, B:169:0x07f3, B:174:0x083f, B:176:0x0845, B:177:0x0861, B:179:0x0875, B:183:0x0806, B:185:0x082a, B:191:0x0849, B:192:0x063c, B:194:0x064e, B:196:0x0652, B:198:0x0664, B:199:0x069b, B:200:0x067e, B:202:0x0684, B:203:0x05d1, B:205:0x05d9, B:206:0x0525, B:209:0x0125, B:212:0x0137, B:214:0x014e, B:220:0x016a, B:221:0x0196, B:223:0x019c, B:225:0x01aa, B:227:0x01b2, B:228:0x01bc, B:230:0x01c7, B:233:0x01ce, B:235:0x0261, B:237:0x026b, B:240:0x02a2, B:243:0x01fb, B:245:0x0219, B:246:0x0247, B:250:0x0236, B:251:0x01b7, B:253:0x016f, B:254:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f0 A[Catch: all -> 0x08ba, TryCatch #2 {all -> 0x08ba, blocks: (B:36:0x0108, B:39:0x0117, B:43:0x02b1, B:45:0x02f0, B:47:0x02f5, B:48:0x030e, B:52:0x031f, B:54:0x0334, B:56:0x033b, B:57:0x0354, B:61:0x0377, B:65:0x039f, B:66:0x03b8, B:69:0x03c8, B:72:0x03eb, B:73:0x0409, B:76:0x0413, B:78:0x0421, B:80:0x042d, B:82:0x0433, B:83:0x043e, B:85:0x0446, B:87:0x0456, B:89:0x0464, B:90:0x046f, B:92:0x047b, B:93:0x0492, B:95:0x04bf, B:98:0x04cf, B:101:0x050b, B:102:0x0533, B:104:0x056d, B:105:0x0572, B:107:0x057a, B:108:0x057f, B:110:0x0587, B:111:0x058c, B:113:0x0595, B:114:0x0599, B:116:0x05a6, B:117:0x05ab, B:119:0x05b9, B:121:0x05c3, B:123:0x05cb, B:124:0x05de, B:126:0x05e6, B:127:0x05e9, B:129:0x05fe, B:131:0x0608, B:132:0x060b, B:134:0x0619, B:136:0x0623, B:138:0x0627, B:140:0x0632, B:141:0x069e, B:143:0x06e6, B:145:0x06ec, B:147:0x06f5, B:148:0x06fa, B:150:0x0706, B:151:0x076d, B:153:0x0777, B:154:0x077e, B:156:0x0788, B:157:0x078f, B:158:0x079a, B:160:0x07a0, B:163:0x07d1, B:164:0x07e1, B:166:0x07e9, B:167:0x07ed, B:169:0x07f3, B:174:0x083f, B:176:0x0845, B:177:0x0861, B:179:0x0875, B:183:0x0806, B:185:0x082a, B:191:0x0849, B:192:0x063c, B:194:0x064e, B:196:0x0652, B:198:0x0664, B:199:0x069b, B:200:0x067e, B:202:0x0684, B:203:0x05d1, B:205:0x05d9, B:206:0x0525, B:209:0x0125, B:212:0x0137, B:214:0x014e, B:220:0x016a, B:221:0x0196, B:223:0x019c, B:225:0x01aa, B:227:0x01b2, B:228:0x01bc, B:230:0x01c7, B:233:0x01ce, B:235:0x0261, B:237:0x026b, B:240:0x02a2, B:243:0x01fb, B:245:0x0219, B:246:0x0247, B:250:0x0236, B:251:0x01b7, B:253:0x016f, B:254:0x018c), top: B:35:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x031d  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m23414M(com.google.android.gms.measurement.internal.zzan r28, com.google.android.gms.measurement.internal.zzm r29) {
        /*
            Method dump skipped, instructions count: 2246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23414M(com.google.android.gms.measurement.internal.zzan, com.google.android.gms.measurement.internal.zzm):void");
    }

    /* renamed from: N */
    private static void m23415N(AbstractC7670f7 abstractC7670f7) {
        if (abstractC7670f7 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (abstractC7670f7.m22777s()) {
            return;
        }
        String valueOf = String.valueOf(abstractC7670f7.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    @VisibleForTesting
    /* renamed from: a */
    private final int m23416a(FileChannel fileChannel) {
        m23423j0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f29365j.mo22836h().m23137H().m23147a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                this.f29365j.mo22836h().m23140K().m23148b("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e2) {
            this.f29365j.mo22836h().m23137H().m23148b("Failed to read from channel", e2);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.measurement.internal.C7845z3 m23417b(com.google.android.gms.measurement.internal.zzm r9, com.google.android.gms.measurement.internal.C7845z3 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23417b(com.google.android.gms.measurement.internal.zzm, com.google.android.gms.measurement.internal.z3, java.lang.String):com.google.android.gms.measurement.internal.z3");
    }

    /* renamed from: c */
    public static zzkc m23418c(Context context) {
        Preconditions.m14372k(context);
        Preconditions.m14372k(context.getApplicationContext());
        if (f29356a == null) {
            synchronized (zzkc.class) {
                if (f29356a == null) {
                    f29356a = new zzkc(new zzkh(context));
                }
            }
        }
        return f29356a;
    }

    /* renamed from: d */
    private final zzm m23419d(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j2, String str3, String str4) {
        String str5;
        String str6;
        int i2;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f29365j.mo22836h().m23137H().m23147a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str5 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.f29365j.mo22836h().m23137H().m23148b("Error retrieving installer package name. appId", zzet.m23131x(str));
            str5 = "Unknown";
        }
        if (str5 == null) {
            str5 = "manual_install";
        } else if ("com.android.vending".equals(str5)) {
            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str7 = str5;
        try {
            PackageInfo m14671e = Wrappers.m14674a(context).m14671e(str, 0);
            if (m14671e != null) {
                CharSequence m14670d = Wrappers.m14674a(context).m14670d(str);
                if (!TextUtils.isEmpty(m14670d)) {
                    m14670d.toString();
                }
                str6 = m14671e.versionName;
                i2 = m14671e.versionCode;
            } else {
                str6 = "Unknown";
                i2 = Integer.MIN_VALUE;
            }
            this.f29365j.mo22832G();
            return new zzm(str, str2, str6, i2, str7, this.f29365j.m23243y().m23565C(), this.f29365j.m23217I().m23551w(context, str), (String) null, z, false, HttpUrl.FRAGMENT_ENCODE_SET, 0L, this.f29365j.m23243y().m23572K(str) ? j2 : 0L, 0, z2, z3, false, str3, (Boolean) null, 0L, (List<String>) null, (zzky.m22475b() && this.f29365j.m23243y().m23564B(str, zzap.f29108N0)) ? str4 : null);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.f29365j.mo22836h().m23137H().m23149c("Error retrieving newly installed package info. appId, appName", zzet.m23131x(str), "Unknown");
            return null;
        }
    }

    /* renamed from: e */
    private final zzm m23420e(String str) {
        C7845z3 m22746j0 = m23445W().m22746j0(str);
        if (m22746j0 == null || TextUtils.isEmpty(m22746j0.m22901T())) {
            this.f29365j.mo22836h().m23144O().m23148b("No app data available; dropping", str);
            return null;
        }
        Boolean m23412K = m23412K(m22746j0);
        if (m23412K == null || m23412K.booleanValue()) {
            return new zzm(str, m22746j0.m22882A(), m22746j0.m22901T(), m22746j0.m22903V(), m22746j0.m22905X(), m22746j0.m22907Z(), m22746j0.m22911b0(), (String) null, m22746j0.m22917e0(), false, m22746j0.m22894M(), m22746j0.m22928k(), 0L, 0, m22746j0.m22930l(), m22746j0.m22932m(), false, m22746j0.m22885D(), m22746j0.m22934n(), m22746j0.m22915d0(), m22746j0.m22935o(), (zzky.m22475b() && this.f29365j.m23243y().m23564B(str, zzap.f29108N0)) ? m22746j0.m22888G() : null);
        }
        this.f29365j.mo22836h().m23137H().m23148b("App version does not match; dropping. appId", zzet.m23131x(str));
        return null;
    }

    /* renamed from: h0 */
    private final C7756p3 m23421h0() {
        C7756p3 c7756p3 = this.f29360e;
        if (c7756p3 != null) {
            return c7756p3;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: i0 */
    private final zzjy m23422i0() {
        m23415N(this.f29361f);
        return this.f29361f;
    }

    /* renamed from: j0 */
    private final void m23423j0() {
        this.f29365j.mo22835g().mo22792d();
    }

    /* renamed from: k0 */
    private final long m23424k0() {
        long mo14608a = this.f29365j.mo22837j().mo14608a();
        C7774r3 m23211B = this.f29365j.m23211B();
        m23211B.m22807p();
        m23211B.mo22792d();
        long m23155a = m23211B.f28857j.m23155a();
        if (m23155a == 0) {
            m23155a = 1 + m23211B.mo22839l().m23555z0().nextInt(86400000);
            m23211B.f28857j.m23156b(m23155a);
        }
        return ((((mo14608a + m23155a) / 1000) / 60) / 60) / 24;
    }

    @VisibleForTesting
    /* renamed from: l */
    private static void m23425l(zzbr.zzc.zza zzaVar, int i2, String str) {
        List<zzbr.zze> m21700G = zzaVar.m21700G();
        for (int i3 = 0; i3 < m21700G.size(); i3++) {
            if ("_err".equals(m21700G.get(i3).m21733B())) {
                return;
            }
        }
        zzaVar.m21697D((zzbr.zze) ((zzfd) zzbr.zze.m21728T().m21742C("_err").m21741B(Long.valueOf(i2).longValue()).mo22283y())).m21697D((zzbr.zze) ((zzfd) zzbr.zze.m21728T().m21742C("_ev").m21744E(str).mo22283y()));
    }

    /* renamed from: l0 */
    private final boolean m23426l0() {
        m23423j0();
        m23451c0();
        return m23445W().m22729F0() || !TextUtils.isEmpty(m23445W().m22763y());
    }

    @VisibleForTesting
    /* renamed from: m */
    private static void m23427m(zzbr.zzc.zza zzaVar, String str) {
        List<zzbr.zze> m21700G = zzaVar.m21700G();
        for (int i2 = 0; i2 < m21700G.size(); i2++) {
            if (str.equals(m21700G.get(i2).m21733B())) {
                zzaVar.m21702I(i2);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01bf  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m23428m0() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23428m0():void");
    }

    /* renamed from: n */
    private static void m23429n(zzbr.zzg.zza zzaVar) {
        zzaVar.m21945N(Long.MAX_VALUE).m21954T(Long.MIN_VALUE);
        for (int i2 = 0; i2 < zzaVar.m21942L(); i2++) {
            zzbr.zzc m21944M = zzaVar.m21944M(i2);
            if (m21944M.m21689W() < zzaVar.m21966j0()) {
                zzaVar.m21945N(m21944M.m21689W());
            }
            if (m21944M.m21689W() > zzaVar.m21970n0()) {
                zzaVar.m21954T(m21944M.m21689W());
            }
        }
    }

    @VisibleForTesting
    /* renamed from: o */
    private final void m23430o(zzbr.zzg.zza zzaVar, long j2, boolean z) {
        String str = z ? "_se" : "_lte";
        C7733m7 m22751o0 = m23445W().m22751o0(zzaVar.m21926C0(), str);
        C7733m7 c7733m7 = (m22751o0 == null || m22751o0.f28781e == null) ? new C7733m7(zzaVar.m21926C0(), "auto", str, this.f29365j.mo22837j().mo14608a(), Long.valueOf(j2)) : new C7733m7(zzaVar.m21926C0(), "auto", str, this.f29365j.mo22837j().mo14608a(), Long.valueOf(((Long) m22751o0.f28781e).longValue() + j2));
        zzbr.zzk zzkVar = (zzbr.zzk) ((zzfd) zzbr.zzk.m22062X().m22078C(str).m22077B(this.f29365j.mo22837j().mo14608a()).m22080E(((Long) c7733m7.f28781e).longValue()).mo22283y());
        boolean z2 = false;
        int m23479w = zzkg.m23479w(zzaVar, str);
        if (m23479w >= 0) {
            zzaVar.m21923B(m23479w, zzkVar);
            z2 = true;
        }
        if (!z2) {
            zzaVar.m21933G(zzkVar);
        }
        if (j2 > 0) {
            m23445W().m22742T(c7733m7);
            this.f29365j.mo22836h().m23144O().m23149c("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", c7733m7.f28781e);
        }
    }

    /* renamed from: r */
    private final void m23431r(C7845z3 c7845z3) {
        m23423j0();
        if (TextUtils.isEmpty(c7845z3.m22882A()) && TextUtils.isEmpty(c7845z3.m22885D())) {
            m23434A(c7845z3.m22940t(), 204, null, null, null);
            return;
        }
        zzx m23243y = this.f29365j.m23243y();
        Uri.Builder builder = new Uri.Builder();
        String m22882A = c7845z3.m22882A();
        if (TextUtils.isEmpty(m22882A)) {
            m22882A = c7845z3.m22885D();
        }
        C0867a c0867a = null;
        Uri.Builder encodedAuthority = builder.scheme(zzap.f29153l.m23095a(null)).encodedAuthority(zzap.f29155m.m23095a(null));
        String valueOf = String.valueOf(m22882A);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", c7845z3.m22944x()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(m23243y.m23565C()));
        String uri = builder.build().toString();
        try {
            URL url = new URL(uri);
            this.f29365j.mo22836h().m23145P().m23148b("Fetching remote configuration", c7845z3.m22940t());
            zzbo.zzb m23186w = m23441S().m23186w(c7845z3.m22940t());
            String m23176B = m23441S().m23176B(c7845z3.m22940t());
            if (m23186w != null && !TextUtils.isEmpty(m23176B)) {
                c0867a = new C0867a();
                c0867a.put("If-Modified-Since", m23176B);
            }
            this.f29373r = true;
            zzex m23443U = m23443U();
            String m22940t = c7845z3.m22940t();
            C7706j7 c7706j7 = new C7706j7(this);
            m23443U.mo22792d();
            m23443U.m22778t();
            Preconditions.m14372k(url);
            Preconditions.m14372k(c7706j7);
            m23443U.mo22835g().m23197C(new RunnableC7729m3(m23443U, m22940t, url, null, c0867a, c7706j7));
        } catch (MalformedURLException unused) {
            this.f29365j.mo22836h().m23137H().m23149c("Failed to parse config URL. Not fetching. appId", zzet.m23131x(c7845z3.m22940t()), uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m23433u(zzkh zzkhVar) {
        this.f29365j.mo22835g().mo22792d();
        C7635c c7635c = new C7635c(this);
        c7635c.m22779u();
        this.f29359d = c7635c;
        this.f29365j.m23243y().m23586q(this.f29357b);
        C7769q7 c7769q7 = new C7769q7(this);
        c7769q7.m22779u();
        this.f29362g = c7769q7;
        C7785s5 c7785s5 = new C7785s5(this);
        c7785s5.m22779u();
        this.f29364i = c7785s5;
        zzjy zzjyVar = new zzjy(this);
        zzjyVar.m22779u();
        this.f29361f = zzjyVar;
        this.f29360e = new C7756p3(this);
        if (this.f29371p != this.f29372q) {
            this.f29365j.mo22836h().m23137H().m23149c("Not all upload components initialized", Integer.valueOf(this.f29371p), Integer.valueOf(this.f29372q));
        }
        this.f29366k = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        r6.f29365j.m23211B().f28855h.m23156b(r6.f29365j.mo22837j().mo14608a());
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:5:0x0029, B:12:0x0045, B:13:0x0179, B:23:0x0061, B:30:0x00b0, B:31:0x00c5, B:34:0x00cd, B:36:0x00d9, B:38:0x00df, B:42:0x00ec, B:47:0x0124, B:49:0x013a, B:50:0x0162, B:52:0x016c, B:54:0x0172, B:55:0x0176, B:56:0x014a, B:57:0x0103, B:59:0x010d), top: B:4:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:5:0x0029, B:12:0x0045, B:13:0x0179, B:23:0x0061, B:30:0x00b0, B:31:0x00c5, B:34:0x00cd, B:36:0x00d9, B:38:0x00df, B:42:0x00ec, B:47:0x0124, B:49:0x013a, B:50:0x0162, B:52:0x016c, B:54:0x0172, B:55:0x0176, B:56:0x014a, B:57:0x0103, B:59:0x010d), top: B:4:0x0029, outer: #0 }] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m23434A(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23434A(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* renamed from: B */
    final void m23435B(boolean z) {
        m23428m0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: G */
    public final zzw mo22832G() {
        return this.f29365j.mo22832G();
    }

    /* renamed from: J */
    public final zzx m23436J() {
        return this.f29365j.m23243y();
    }

    /* renamed from: O */
    final void m23437O(zzkj zzkjVar, zzm zzmVar) {
        m23423j0();
        m23451c0();
        if (TextUtils.isEmpty(zzmVar.f29402g) && TextUtils.isEmpty(zzmVar.f29418w)) {
            return;
        }
        if (!zzmVar.f29408m) {
            m23442T(zzmVar);
            return;
        }
        if (!this.f29365j.m23243y().m23564B(zzmVar.f29401f, zzap.f29152k0)) {
            this.f29365j.mo22836h().m23144O().m23148b("Removing user property", this.f29365j.m23218J().m23120B(zzkjVar.f29388g));
            m23445W().m22760w0();
            try {
                m23442T(zzmVar);
                m23445W().m22749m0(zzmVar.f29401f, zzkjVar.f29388g);
                m23445W().m22759w();
                this.f29365j.mo22836h().m23144O().m23148b("User property removed", this.f29365j.m23218J().m23120B(zzkjVar.f29388g));
                return;
            } finally {
            }
        }
        if ("_npa".equals(zzkjVar.f29388g) && zzmVar.f29419x != null) {
            this.f29365j.mo22836h().m23144O().m23147a("Falling back to manifest metadata value for ad personalization");
            m23461v(new zzkj("_npa", this.f29365j.mo22837j().mo14608a(), Long.valueOf(zzmVar.f29419x.booleanValue() ? 1L : 0L), "auto"), zzmVar);
            return;
        }
        this.f29365j.mo22836h().m23144O().m23148b("Removing user property", this.f29365j.m23218J().m23120B(zzkjVar.f29388g));
        m23445W().m22760w0();
        try {
            m23442T(zzmVar);
            m23445W().m22749m0(zzmVar.f29401f, zzkjVar.f29388g);
            m23445W().m22759w();
            this.f29365j.mo22836h().m23144O().m23148b("User property removed", this.f29365j.m23218J().m23120B(zzkjVar.f29388g));
        } finally {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:108|109|(2:111|(8:113|(3:115|(2:117|(1:119))(1:138)|120)(1:139)|121|(1:123)(1:137)|124|125|126|(4:128|(1:130)|131|(1:133))))|140|125|126|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03bf, code lost:
    
        r21.f29365j.mo22836h().m23137H().m23149c("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzet.m23131x(r22.f29401f), r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d7 A[Catch: all -> 0x04d5, TryCatch #0 {all -> 0x04d5, blocks: (B:30:0x00b9, B:32:0x00c9, B:34:0x00d7, B:36:0x00e1, B:38:0x00e5, B:41:0x00f6, B:43:0x010e, B:45:0x0136, B:47:0x0142, B:49:0x0159, B:51:0x0181, B:53:0x01cb, B:57:0x01de, B:59:0x01f2, B:61:0x01fd, B:64:0x020c, B:66:0x0214, B:68:0x021a, B:71:0x0229, B:73:0x022c, B:74:0x0250, B:76:0x0255, B:78:0x0275, B:81:0x0289, B:83:0x02aa, B:84:0x02b8, B:86:0x02e9, B:87:0x02f1, B:89:0x02f5, B:90:0x02f8, B:92:0x0319, B:96:0x03f3, B:97:0x03f6, B:98:0x0465, B:100:0x0475, B:102:0x048d, B:103:0x0494, B:104:0x04c6, B:109:0x0332, B:111:0x035d, B:113:0x0365, B:115:0x036d, B:119:0x0381, B:121:0x038f, B:124:0x039a, B:126:0x03ac, B:128:0x03d7, B:130:0x03dd, B:131:0x03e2, B:133:0x03e8, B:136:0x03bf, B:138:0x0387, B:143:0x0345, B:147:0x040e, B:149:0x0442, B:150:0x044a, B:152:0x044e, B:153:0x0451, B:155:0x04a9, B:157:0x04ad, B:160:0x0265, B:166:0x0118, B:170:0x0122), top: B:29:0x00b9, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022c A[Catch: all -> 0x04d5, TryCatch #0 {all -> 0x04d5, blocks: (B:30:0x00b9, B:32:0x00c9, B:34:0x00d7, B:36:0x00e1, B:38:0x00e5, B:41:0x00f6, B:43:0x010e, B:45:0x0136, B:47:0x0142, B:49:0x0159, B:51:0x0181, B:53:0x01cb, B:57:0x01de, B:59:0x01f2, B:61:0x01fd, B:64:0x020c, B:66:0x0214, B:68:0x021a, B:71:0x0229, B:73:0x022c, B:74:0x0250, B:76:0x0255, B:78:0x0275, B:81:0x0289, B:83:0x02aa, B:84:0x02b8, B:86:0x02e9, B:87:0x02f1, B:89:0x02f5, B:90:0x02f8, B:92:0x0319, B:96:0x03f3, B:97:0x03f6, B:98:0x0465, B:100:0x0475, B:102:0x048d, B:103:0x0494, B:104:0x04c6, B:109:0x0332, B:111:0x035d, B:113:0x0365, B:115:0x036d, B:119:0x0381, B:121:0x038f, B:124:0x039a, B:126:0x03ac, B:128:0x03d7, B:130:0x03dd, B:131:0x03e2, B:133:0x03e8, B:136:0x03bf, B:138:0x0387, B:143:0x0345, B:147:0x040e, B:149:0x0442, B:150:0x044a, B:152:0x044e, B:153:0x0451, B:155:0x04a9, B:157:0x04ad, B:160:0x0265, B:166:0x0118, B:170:0x0122), top: B:29:0x00b9, inners: #1, #2, #3 }] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m23438P(com.google.android.gms.measurement.internal.zzm r22) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23438P(com.google.android.gms.measurement.internal.zzm):void");
    }

    /* renamed from: Q */
    final void m23439Q(zzv zzvVar) {
        zzm m23420e = m23420e(zzvVar.f29422f);
        if (m23420e != null) {
            m23440R(zzvVar, m23420e);
        }
    }

    /* renamed from: R */
    final void m23440R(zzv zzvVar, zzm zzmVar) {
        Preconditions.m14372k(zzvVar);
        Preconditions.m14368g(zzvVar.f29422f);
        Preconditions.m14372k(zzvVar.f29424h);
        Preconditions.m14368g(zzvVar.f29424h.f29388g);
        m23423j0();
        m23451c0();
        if (TextUtils.isEmpty(zzmVar.f29402g) && TextUtils.isEmpty(zzmVar.f29418w)) {
            return;
        }
        if (!zzmVar.f29408m) {
            m23442T(zzmVar);
            return;
        }
        m23445W().m22760w0();
        try {
            m23442T(zzmVar);
            zzv m22752q0 = m23445W().m22752q0(zzvVar.f29422f, zzvVar.f29424h.f29388g);
            if (m22752q0 != null) {
                this.f29365j.mo22836h().m23144O().m23149c("Removing conditional user property", zzvVar.f29422f, this.f29365j.m23218J().m23120B(zzvVar.f29424h.f29388g));
                m23445W().m22754s0(zzvVar.f29422f, zzvVar.f29424h.f29388g);
                if (m22752q0.f29426j) {
                    m23445W().m22749m0(zzvVar.f29422f, zzvVar.f29424h.f29388g);
                }
                zzan zzanVar = zzvVar.f29432p;
                if (zzanVar != null) {
                    zzam zzamVar = zzanVar.f29078g;
                    Bundle m22960Y = zzamVar != null ? zzamVar.m22960Y() : null;
                    zzkk m23217I = this.f29365j.m23217I();
                    String str = zzvVar.f29422f;
                    zzan zzanVar2 = zzvVar.f29432p;
                    m23414M(m23217I.m23522C(str, zzanVar2.f29077f, m22960Y, m22752q0.f29423g, zzanVar2.f29080i, true, false), zzmVar);
                }
            } else {
                this.f29365j.mo22836h().m23140K().m23149c("Conditional user property doesn't exist", zzet.m23131x(zzvVar.f29422f), this.f29365j.m23218J().m23120B(zzvVar.f29424h.f29388g));
            }
            m23445W().m22759w();
        } finally {
            m23445W().m22721A0();
        }
    }

    /* renamed from: S */
    public final zzfr m23441S() {
        m23415N(this.f29357b);
        return this.f29357b;
    }

    /* renamed from: T */
    final C7845z3 m23442T(zzm zzmVar) {
        m23423j0();
        m23451c0();
        Preconditions.m14372k(zzmVar);
        Preconditions.m14368g(zzmVar.f29401f);
        C7845z3 m22746j0 = m23445W().m22746j0(zzmVar.f29401f);
        String m22830y = this.f29365j.m23211B().m22830y(zzmVar.f29401f);
        if (!zzkm.m22459b() || !zzap.f29124V0.m23095a(null).booleanValue()) {
            return m23417b(zzmVar, m22746j0, m22830y);
        }
        if (m22746j0 == null) {
            m22746j0 = new C7845z3(this.f29365j, zzmVar.f29401f);
            m22746j0.m22912c(this.f29365j.m23217I().m23523C0());
            m22746j0.m22884C(m22830y);
        } else if (!m22830y.equals(m22746j0.m22891J())) {
            m22746j0.m22884C(m22830y);
            m22746j0.m22912c(this.f29365j.m23217I().m23523C0());
        }
        m22746j0.m22938r(zzmVar.f29402g);
        m22746j0.m22942v(zzmVar.f29418w);
        if (zzky.m22475b() && this.f29365j.m23243y().m23564B(m22746j0.m22940t(), zzap.f29108N0)) {
            m22746j0.m22946z(zzmVar.f29400A);
        }
        if (!TextUtils.isEmpty(zzmVar.f29411p)) {
            m22746j0.m22887F(zzmVar.f29411p);
        }
        long j2 = zzmVar.f29405j;
        if (j2 != 0) {
            m22746j0.m22945y(j2);
        }
        if (!TextUtils.isEmpty(zzmVar.f29403h)) {
            m22746j0.m22890I(zzmVar.f29403h);
        }
        m22746j0.m22941u(zzmVar.f29410o);
        String str = zzmVar.f29404i;
        if (str != null) {
            m22746j0.m22893L(str);
        }
        m22746j0.m22883B(zzmVar.f29406k);
        m22746j0.m22916e(zzmVar.f29408m);
        if (!TextUtils.isEmpty(zzmVar.f29407l)) {
            m22746j0.m22896O(zzmVar.f29407l);
        }
        m22746j0.m22913c0(zzmVar.f29412q);
        m22746j0.m22939s(zzmVar.f29415t);
        m22746j0.m22943w(zzmVar.f29416u);
        if (this.f29365j.m23243y().m23564B(zzmVar.f29401f, zzap.f29152k0)) {
            m22746j0.m22910b(zzmVar.f29419x);
        }
        m22746j0.m22886E(zzmVar.f29420y);
        if (m22746j0.m22918f()) {
            m23445W().m22737O(m22746j0);
        }
        return m22746j0;
    }

    /* renamed from: U */
    public final zzex m23443U() {
        m23415N(this.f29358c);
        return this.f29358c;
    }

    /* renamed from: V */
    final String m23444V(zzm zzmVar) {
        try {
            return (String) this.f29365j.mo22835g().m23200w(new CallableC7724l7(this, zzmVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.f29365j.mo22836h().m23137H().m23149c("Failed to get app instance id. appId", zzet.m23131x(zzmVar.f29401f), e2);
            return null;
        }
    }

    /* renamed from: W */
    public final C7635c m23445W() {
        m23415N(this.f29359d);
        return this.f29359d;
    }

    /* renamed from: X */
    public final C7769q7 m23446X() {
        m23415N(this.f29362g);
        return this.f29362g;
    }

    /* renamed from: Y */
    public final C7785s5 m23447Y() {
        m23415N(this.f29364i);
        return this.f29364i;
    }

    /* renamed from: Z */
    public final zzkg m23448Z() {
        m23415N(this.f29363h);
        return this.f29363h;
    }

    /* renamed from: a0 */
    public final zzer m23449a0() {
        return this.f29365j.m23218J();
    }

    /* renamed from: b0 */
    public final zzkk m23450b0() {
        return this.f29365j.m23217I();
    }

    /* renamed from: c0 */
    final void m23451c0() {
        if (!this.f29366k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: d0 */
    final void m23452d0() {
        C7845z3 m22746j0;
        String str;
        m23423j0();
        m23451c0();
        this.f29375t = true;
        try {
            this.f29365j.mo22832G();
            Boolean m23375a0 = this.f29365j.m23226R().m23375a0();
            if (m23375a0 == null) {
                this.f29365j.mo22836h().m23140K().m23147a("Upload data called on the client side before use of service was decided");
                return;
            }
            if (m23375a0.booleanValue()) {
                this.f29365j.mo22836h().m23137H().m23147a("Upload called in the client side when service should be used");
                return;
            }
            if (this.f29369n > 0) {
                m23428m0();
                return;
            }
            m23423j0();
            if (this.f29378w != null) {
                this.f29365j.mo22836h().m23145P().m23147a("Uploading requested multiple times");
                return;
            }
            if (!m23443U().m23154z()) {
                this.f29365j.mo22836h().m23145P().m23147a("Network not connected, ignoring upload request");
                m23428m0();
                return;
            }
            long mo14608a = this.f29365j.mo22837j().mo14608a();
            m23408E(null, mo14608a - zzx.m23558U());
            long m23155a = this.f29365j.m23211B().f28853f.m23155a();
            if (m23155a != 0) {
                this.f29365j.mo22836h().m23144O().m23148b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(mo14608a - m23155a)));
            }
            String m22763y = m23445W().m22763y();
            if (TextUtils.isEmpty(m22763y)) {
                this.f29380y = -1L;
                String m22731H = m23445W().m22731H(mo14608a - zzx.m23558U());
                if (!TextUtils.isEmpty(m22731H) && (m22746j0 = m23445W().m22746j0(m22731H)) != null) {
                    m23431r(m22746j0);
                }
            } else {
                if (this.f29380y == -1) {
                    this.f29380y = m23445W().m22745Y();
                }
                List<Pair<zzbr.zzg, Long>> m22733J = m23445W().m22733J(m22763y, this.f29365j.m23243y().m23588t(m22763y, zzap.f29157n), Math.max(0, this.f29365j.m23243y().m23588t(m22763y, zzap.f29159o)));
                if (!m22733J.isEmpty()) {
                    Iterator<Pair<zzbr.zzg, Long>> it = m22733J.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = null;
                            break;
                        }
                        zzbr.zzg zzgVar = (zzbr.zzg) it.next().first;
                        if (!TextUtils.isEmpty(zzgVar.m21891d0())) {
                            str = zzgVar.m21891d0();
                            break;
                        }
                    }
                    if (str != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= m22733J.size()) {
                                break;
                            }
                            zzbr.zzg zzgVar2 = (zzbr.zzg) m22733J.get(i2).first;
                            if (!TextUtils.isEmpty(zzgVar2.m21891d0()) && !zzgVar2.m21891d0().equals(str)) {
                                m22733J = m22733J.subList(0, i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    zzbr.zzf.zza m21749F = zzbr.zzf.m21749F();
                    int size = m22733J.size();
                    ArrayList arrayList = new ArrayList(m22733J.size());
                    boolean z = zzx.m23559X() && this.f29365j.m23243y().m23592x(m22763y);
                    for (int i3 = 0; i3 < size; i3++) {
                        zzbr.zzg.zza m22274v = ((zzbr.zzg) m22733J.get(i3).first).m22274v();
                        arrayList.add((Long) m22733J.get(i3).second);
                        zzbr.zzg.zza m21925C = m22274v.m21972q0(this.f29365j.m23243y().m23565C()).m21925C(mo14608a);
                        this.f29365j.mo22832G();
                        m21925C.m21951Q(false);
                        if (!z) {
                            m22274v.m21946N0();
                        }
                        if (this.f29365j.m23243y().m23564B(m22763y, zzap.f29164q0)) {
                            m22274v.m21934G0(m23448Z().m23492x(((zzbr.zzg) ((zzfd) m22274v.mo22283y())).m22136j()));
                        }
                        m21749F.m21754w(m22274v);
                    }
                    String m23483D = this.f29365j.mo22836h().m23136C(2) ? m23448Z().m23483D((zzbr.zzf) ((zzfd) m21749F.mo22283y())) : null;
                    m23448Z();
                    byte[] m22136j = ((zzbr.zzf) ((zzfd) m21749F.mo22283y())).m22136j();
                    String m23095a = zzap.f29177x.m23095a(null);
                    try {
                        URL url = new URL(m23095a);
                        Preconditions.m14362a(!arrayList.isEmpty());
                        if (this.f29378w != null) {
                            this.f29365j.mo22836h().m23137H().m23147a("Set uploading progress before finishing the previous upload");
                        } else {
                            this.f29378w = new ArrayList(arrayList);
                        }
                        this.f29365j.m23211B().f28854g.m23156b(mo14608a);
                        this.f29365j.mo22836h().m23145P().m23150d("Uploading data. app, uncompressed size, data", size > 0 ? m21749F.m21753A(0).m21877L2() : "?", Integer.valueOf(m22136j.length), m23483D);
                        this.f29374s = true;
                        zzex m23443U = m23443U();
                        C7715k7 c7715k7 = new C7715k7(this, m22763y);
                        m23443U.mo22792d();
                        m23443U.m22778t();
                        Preconditions.m14372k(url);
                        Preconditions.m14372k(m22136j);
                        Preconditions.m14372k(c7715k7);
                        m23443U.mo22835g().m23197C(new RunnableC7729m3(m23443U, m22763y, url, m22136j, null, c7715k7));
                    } catch (MalformedURLException unused) {
                        this.f29365j.mo22836h().m23137H().m23149c("Failed to parse upload URL. Not uploading. appId", zzet.m23131x(m22763y), m23095a);
                    }
                }
            }
        } finally {
            this.f29375t = false;
            m23409F();
        }
    }

    /* renamed from: e0 */
    final void m23453e0() {
        m23423j0();
        m23451c0();
        if (!this.f29368m) {
            this.f29368m = true;
            m23423j0();
            m23451c0();
            if ((this.f29365j.m23243y().m23587r(zzap.f29158n0) || m23411I()) && m23410H()) {
                int m23416a = m23416a(this.f29377v);
                int m23113F = this.f29365j.m23228T().m23113F();
                m23423j0();
                if (m23416a > m23113F) {
                    this.f29365j.mo22836h().m23137H().m23149c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(m23416a), Integer.valueOf(m23113F));
                } else if (m23416a < m23113F) {
                    if (m23406C(m23113F, this.f29377v)) {
                        this.f29365j.mo22836h().m23145P().m23149c("Storage version upgraded. Previous, current version", Integer.valueOf(m23416a), Integer.valueOf(m23113F));
                    } else {
                        this.f29365j.mo22836h().m23137H().m23149c("Storage version upgrade failed. Previous, current version", Integer.valueOf(m23416a), Integer.valueOf(m23113F));
                    }
                }
            }
        }
        if (this.f29367l || this.f29365j.m23243y().m23587r(zzap.f29158n0)) {
            return;
        }
        this.f29365j.mo22836h().m23143N().m23147a("This instance being marked as an uploader");
        this.f29367l = true;
        m23428m0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: f */
    public final Context mo22834f() {
        return this.f29365j.mo22834f();
    }

    /* renamed from: f0 */
    final void m23454f0() {
        this.f29372q++;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: g */
    public final zzfu mo22835g() {
        return this.f29365j.mo22835g();
    }

    /* renamed from: g0 */
    final zzfx m23455g0() {
        return this.f29365j;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: h */
    public final zzet mo22836h() {
        return this.f29365j.mo22836h();
    }

    /* renamed from: i */
    protected final void m23456i() {
        this.f29365j.mo22835g().mo22792d();
        m23445W().m22725C0();
        if (this.f29365j.m23211B().f28853f.m23155a() == 0) {
            this.f29365j.m23211B().f28853f.m23156b(this.f29365j.mo22837j().mo14608a());
        }
        m23428m0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7784s4
    /* renamed from: j */
    public final Clock mo22837j() {
        return this.f29365j.mo22837j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0156, code lost:
    
        r8.f29365j.m23211B().f28855h.m23156b(r8.f29365j.mo22837j().mo14608a());
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m23457k(int r9, java.lang.Throwable r10, byte[] r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23457k(int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    /* renamed from: p */
    final void m23458p(zzan zzanVar, zzm zzmVar) {
        List<zzv> m22735L;
        List<zzv> m22735L2;
        List<zzv> m22735L3;
        List<String> list;
        zzan zzanVar2 = zzanVar;
        Preconditions.m14372k(zzmVar);
        Preconditions.m14368g(zzmVar.f29401f);
        m23423j0();
        m23451c0();
        String str = zzmVar.f29401f;
        long j2 = zzanVar2.f29080i;
        if (m23448Z().m23488R(zzanVar2, zzmVar)) {
            if (!zzmVar.f29408m) {
                m23442T(zzmVar);
                return;
            }
            if (this.f29365j.m23243y().m23564B(str, zzap.f29174v0) && (list = zzmVar.f29421z) != null) {
                if (!list.contains(zzanVar2.f29077f)) {
                    this.f29365j.mo22836h().m23144O().m23150d("Dropping non-safelisted event. appId, event name, origin", str, zzanVar2.f29077f, zzanVar2.f29079h);
                    return;
                } else {
                    Bundle m22960Y = zzanVar2.f29078g.m22960Y();
                    m22960Y.putLong("ga_safelisted", 1L);
                    zzanVar2 = new zzan(zzanVar2.f29077f, new zzam(m22960Y), zzanVar2.f29079h, zzanVar2.f29080i);
                }
            }
            m23445W().m22760w0();
            try {
                C7635c m23445W = m23445W();
                Preconditions.m14368g(str);
                m23445W.mo22792d();
                m23445W.m22778t();
                if (j2 < 0) {
                    m23445W.mo22836h().m23140K().m23149c("Invalid time querying timed out conditional properties", zzet.m23131x(str), Long.valueOf(j2));
                    m22735L = Collections.emptyList();
                } else {
                    m22735L = m23445W.m22735L("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (zzv zzvVar : m22735L) {
                    if (zzvVar != null) {
                        this.f29365j.mo22836h().m23144O().m23150d("User property timed out", zzvVar.f29422f, this.f29365j.m23218J().m23120B(zzvVar.f29424h.f29388g), zzvVar.f29424h.m23494y());
                        if (zzvVar.f29428l != null) {
                            m23414M(new zzan(zzvVar.f29428l, j2), zzmVar);
                        }
                        m23445W().m22754s0(str, zzvVar.f29424h.f29388g);
                    }
                }
                C7635c m23445W2 = m23445W();
                Preconditions.m14368g(str);
                m23445W2.mo22792d();
                m23445W2.m22778t();
                if (j2 < 0) {
                    m23445W2.mo22836h().m23140K().m23149c("Invalid time querying expired conditional properties", zzet.m23131x(str), Long.valueOf(j2));
                    m22735L2 = Collections.emptyList();
                } else {
                    m22735L2 = m23445W2.m22735L("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(m22735L2.size());
                for (zzv zzvVar2 : m22735L2) {
                    if (zzvVar2 != null) {
                        this.f29365j.mo22836h().m23144O().m23150d("User property expired", zzvVar2.f29422f, this.f29365j.m23218J().m23120B(zzvVar2.f29424h.f29388g), zzvVar2.f29424h.m23494y());
                        m23445W().m22749m0(str, zzvVar2.f29424h.f29388g);
                        zzan zzanVar3 = zzvVar2.f29432p;
                        if (zzanVar3 != null) {
                            arrayList.add(zzanVar3);
                        }
                        m23445W().m22754s0(str, zzvVar2.f29424h.f29388g);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    m23414M(new zzan((zzan) obj, j2), zzmVar);
                }
                C7635c m23445W3 = m23445W();
                String str2 = zzanVar2.f29077f;
                Preconditions.m14368g(str);
                Preconditions.m14368g(str2);
                m23445W3.mo22792d();
                m23445W3.m22778t();
                if (j2 < 0) {
                    m23445W3.mo22836h().m23140K().m23150d("Invalid time querying triggered conditional properties", zzet.m23131x(str), m23445W3.mo22838k().m23124y(str2), Long.valueOf(j2));
                    m22735L3 = Collections.emptyList();
                } else {
                    m22735L3 = m23445W3.m22735L("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(m22735L3.size());
                for (zzv zzvVar3 : m22735L3) {
                    if (zzvVar3 != null) {
                        zzkj zzkjVar = zzvVar3.f29424h;
                        C7733m7 c7733m7 = new C7733m7(zzvVar3.f29422f, zzvVar3.f29423g, zzkjVar.f29388g, j2, zzkjVar.m23494y());
                        if (m23445W().m22742T(c7733m7)) {
                            this.f29365j.mo22836h().m23144O().m23150d("User property triggered", zzvVar3.f29422f, this.f29365j.m23218J().m23120B(c7733m7.f28779c), c7733m7.f28781e);
                        } else {
                            this.f29365j.mo22836h().m23137H().m23150d("Too many active user properties, ignoring", zzet.m23131x(zzvVar3.f29422f), this.f29365j.m23218J().m23120B(c7733m7.f28779c), c7733m7.f28781e);
                        }
                        zzan zzanVar4 = zzvVar3.f29430n;
                        if (zzanVar4 != null) {
                            arrayList2.add(zzanVar4);
                        }
                        zzvVar3.f29424h = new zzkj(c7733m7);
                        zzvVar3.f29426j = true;
                        m23445W().m22743U(zzvVar3);
                    }
                }
                m23414M(zzanVar2, zzmVar);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    m23414M(new zzan((zzan) obj2, j2), zzmVar);
                }
                m23445W().m22759w();
            } finally {
                m23445W().m22721A0();
            }
        }
    }

    /* renamed from: q */
    final void m23459q(zzan zzanVar, String str) {
        C7845z3 m22746j0 = m23445W().m22746j0(str);
        if (m22746j0 == null || TextUtils.isEmpty(m22746j0.m22901T())) {
            this.f29365j.mo22836h().m23144O().m23148b("No app data available; dropping event", str);
            return;
        }
        Boolean m23412K = m23412K(m22746j0);
        if (m23412K == null) {
            if (!"_ui".equals(zzanVar.f29077f)) {
                this.f29365j.mo22836h().m23140K().m23148b("Could not find package. appId", zzet.m23131x(str));
            }
        } else if (!m23412K.booleanValue()) {
            this.f29365j.mo22836h().m23137H().m23148b("App version does not match; dropping event. appId", zzet.m23131x(str));
            return;
        }
        m23458p(zzanVar, new zzm(str, m22746j0.m22882A(), m22746j0.m22901T(), m22746j0.m22903V(), m22746j0.m22905X(), m22746j0.m22907Z(), m22746j0.m22911b0(), (String) null, m22746j0.m22917e0(), false, m22746j0.m22894M(), m22746j0.m22928k(), 0L, 0, m22746j0.m22930l(), m22746j0.m22932m(), false, m22746j0.m22885D(), m22746j0.m22934n(), m22746j0.m22915d0(), m22746j0.m22935o(), (zzky.m22475b() && this.f29365j.m23243y().m23564B(m22746j0.m22940t(), zzap.f29108N0)) ? m22746j0.m22888G() : null));
    }

    /* renamed from: s */
    final void m23460s(AbstractC7670f7 abstractC7670f7) {
        this.f29371p++;
    }

    /* renamed from: v */
    final void m23461v(zzkj zzkjVar, zzm zzmVar) {
        C7680h m22726D;
        m23423j0();
        m23451c0();
        if (TextUtils.isEmpty(zzmVar.f29402g) && TextUtils.isEmpty(zzmVar.f29418w)) {
            return;
        }
        if (!zzmVar.f29408m) {
            m23442T(zzmVar);
            return;
        }
        int m23545o0 = this.f29365j.m23217I().m23545o0(zzkjVar.f29388g);
        if (m23545o0 != 0) {
            this.f29365j.m23217I();
            String m23498F = zzkk.m23498F(zzkjVar.f29388g, 24, true);
            String str = zzkjVar.f29388g;
            this.f29365j.m23217I().m23537T(zzmVar.f29401f, m23545o0, "_ev", m23498F, str != null ? str.length() : 0);
            return;
        }
        int m23543j0 = this.f29365j.m23217I().m23543j0(zzkjVar.f29388g, zzkjVar.m23494y());
        if (m23543j0 != 0) {
            this.f29365j.m23217I();
            String m23498F2 = zzkk.m23498F(zzkjVar.f29388g, 24, true);
            Object m23494y = zzkjVar.m23494y();
            this.f29365j.m23217I().m23537T(zzmVar.f29401f, m23543j0, "_ev", m23498F2, (m23494y == null || !((m23494y instanceof String) || (m23494y instanceof CharSequence))) ? 0 : String.valueOf(m23494y).length());
            return;
        }
        Object m23546p0 = this.f29365j.m23217I().m23546p0(zzkjVar.f29388g, zzkjVar.m23494y());
        if (m23546p0 == null) {
            return;
        }
        if ("_sid".equals(zzkjVar.f29388g) && this.f29365j.m23243y().m23577Q(zzmVar.f29401f)) {
            long j2 = zzkjVar.f29389h;
            String str2 = zzkjVar.f29393l;
            long j3 = 0;
            C7733m7 m22751o0 = m23445W().m22751o0(zzmVar.f29401f, "_sno");
            if (m22751o0 != null) {
                Object obj = m22751o0.f28781e;
                if (obj instanceof Long) {
                    j3 = ((Long) obj).longValue();
                    m23461v(new zzkj("_sno", j2, Long.valueOf(j3 + 1), str2), zzmVar);
                }
            }
            if (m22751o0 != null) {
                this.f29365j.mo22836h().m23140K().m23148b("Retrieved last session number from database does not contain a valid (long) value", m22751o0.f28781e);
            }
            if (this.f29365j.m23243y().m23564B(zzmVar.f29401f, zzap.f29138d0) && (m22726D = m23445W().m22726D(zzmVar.f29401f, "_s")) != null) {
                j3 = m22726D.f28664c;
                this.f29365j.mo22836h().m23145P().m23148b("Backfill the session number. Last used session number", Long.valueOf(j3));
            }
            m23461v(new zzkj("_sno", j2, Long.valueOf(j3 + 1), str2), zzmVar);
        }
        C7733m7 c7733m7 = new C7733m7(zzmVar.f29401f, zzkjVar.f29393l, zzkjVar.f29388g, zzkjVar.f29389h, m23546p0);
        this.f29365j.mo22836h().m23144O().m23149c("Setting user property", this.f29365j.m23218J().m23120B(c7733m7.f28779c), m23546p0);
        m23445W().m22760w0();
        try {
            m23442T(zzmVar);
            boolean m22742T = m23445W().m22742T(c7733m7);
            m23445W().m22759w();
            if (m22742T) {
                this.f29365j.mo22836h().m23144O().m23149c("User property set", this.f29365j.m23218J().m23120B(c7733m7.f28779c), c7733m7.f28781e);
            } else {
                this.f29365j.mo22836h().m23137H().m23149c("Too many unique user properties are set. Ignoring user property", this.f29365j.m23218J().m23120B(c7733m7.f28779c), c7733m7.f28781e);
                this.f29365j.m23217I().m23537T(zzmVar.f29401f, 9, null, null, 0);
            }
        } finally {
            m23445W().m22721A0();
        }
    }

    @VisibleForTesting
    /* renamed from: w */
    final void m23462w(zzm zzmVar) {
        if (this.f29378w != null) {
            ArrayList arrayList = new ArrayList();
            this.f29379x = arrayList;
            arrayList.addAll(this.f29378w);
        }
        C7635c m23445W = m23445W();
        String str = zzmVar.f29401f;
        Preconditions.m14368g(str);
        m23445W.mo22792d();
        m23445W.m22778t();
        try {
            SQLiteDatabase m22761x = m23445W.m22761x();
            String[] strArr = {str};
            int delete = m22761x.delete(DeepLinkIntentReceiver.DeepLinksTargets.APPS, "app_id=?", strArr) + 0 + m22761x.delete("events", "app_id=?", strArr) + m22761x.delete("user_attributes", "app_id=?", strArr) + m22761x.delete("conditional_properties", "app_id=?", strArr) + m22761x.delete("raw_events", "app_id=?", strArr) + m22761x.delete("raw_events_metadata", "app_id=?", strArr) + m22761x.delete("queue", "app_id=?", strArr) + m22761x.delete("audience_filter_values", "app_id=?", strArr) + m22761x.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                m23445W.mo22836h().m23145P().m23149c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            m23445W.mo22836h().m23137H().m23149c("Error resetting analytics data. appId, error", zzet.m23131x(str), e2);
        }
        if (com.google.android.gms.internal.measurement.zzkh.m22453b() && this.f29365j.m23243y().m23587r(zzap.f29118S0)) {
            if (zzmVar.f29408m) {
                m23438P(zzmVar);
            }
        } else {
            zzm m23419d = m23419d(this.f29365j.mo22834f(), zzmVar.f29401f, zzmVar.f29402g, zzmVar.f29408m, zzmVar.f29415t, zzmVar.f29416u, zzmVar.f29413r, zzmVar.f29418w, zzmVar.f29400A);
            if (zzmVar.f29408m) {
                m23438P(m23419d);
            }
        }
    }

    /* renamed from: x */
    final void m23463x(zzv zzvVar) {
        zzm m23420e = m23420e(zzvVar.f29422f);
        if (m23420e != null) {
            m23464y(zzvVar, m23420e);
        }
    }

    /* renamed from: y */
    final void m23464y(zzv zzvVar, zzm zzmVar) {
        boolean z;
        Preconditions.m14372k(zzvVar);
        Preconditions.m14368g(zzvVar.f29422f);
        Preconditions.m14372k(zzvVar.f29423g);
        Preconditions.m14372k(zzvVar.f29424h);
        Preconditions.m14368g(zzvVar.f29424h.f29388g);
        m23423j0();
        m23451c0();
        if (TextUtils.isEmpty(zzmVar.f29402g) && TextUtils.isEmpty(zzmVar.f29418w)) {
            return;
        }
        if (!zzmVar.f29408m) {
            m23442T(zzmVar);
            return;
        }
        zzv zzvVar2 = new zzv(zzvVar);
        boolean z2 = false;
        zzvVar2.f29426j = false;
        m23445W().m22760w0();
        try {
            zzv m22752q0 = m23445W().m22752q0(zzvVar2.f29422f, zzvVar2.f29424h.f29388g);
            if (m22752q0 != null && !m22752q0.f29423g.equals(zzvVar2.f29423g)) {
                this.f29365j.mo22836h().m23140K().m23150d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f29365j.m23218J().m23120B(zzvVar2.f29424h.f29388g), zzvVar2.f29423g, m22752q0.f29423g);
            }
            if (m22752q0 != null && (z = m22752q0.f29426j)) {
                zzvVar2.f29423g = m22752q0.f29423g;
                zzvVar2.f29425i = m22752q0.f29425i;
                zzvVar2.f29429m = m22752q0.f29429m;
                zzvVar2.f29427k = m22752q0.f29427k;
                zzvVar2.f29430n = m22752q0.f29430n;
                zzvVar2.f29426j = z;
                zzkj zzkjVar = zzvVar2.f29424h;
                zzvVar2.f29424h = new zzkj(zzkjVar.f29388g, m22752q0.f29424h.f29389h, zzkjVar.m23494y(), m22752q0.f29424h.f29393l);
            } else if (TextUtils.isEmpty(zzvVar2.f29427k)) {
                zzkj zzkjVar2 = zzvVar2.f29424h;
                zzvVar2.f29424h = new zzkj(zzkjVar2.f29388g, zzvVar2.f29425i, zzkjVar2.m23494y(), zzvVar2.f29424h.f29393l);
                zzvVar2.f29426j = true;
                z2 = true;
            }
            if (zzvVar2.f29426j) {
                zzkj zzkjVar3 = zzvVar2.f29424h;
                C7733m7 c7733m7 = new C7733m7(zzvVar2.f29422f, zzvVar2.f29423g, zzkjVar3.f29388g, zzkjVar3.f29389h, zzkjVar3.m23494y());
                if (m23445W().m22742T(c7733m7)) {
                    this.f29365j.mo22836h().m23144O().m23150d("User property updated immediately", zzvVar2.f29422f, this.f29365j.m23218J().m23120B(c7733m7.f28779c), c7733m7.f28781e);
                } else {
                    this.f29365j.mo22836h().m23137H().m23150d("(2)Too many active user properties, ignoring", zzet.m23131x(zzvVar2.f29422f), this.f29365j.m23218J().m23120B(c7733m7.f28779c), c7733m7.f28781e);
                }
                if (z2 && zzvVar2.f29430n != null) {
                    m23414M(new zzan(zzvVar2.f29430n, zzvVar2.f29425i), zzmVar);
                }
            }
            if (m23445W().m22743U(zzvVar2)) {
                this.f29365j.mo22836h().m23144O().m23150d("Conditional property added", zzvVar2.f29422f, this.f29365j.m23218J().m23120B(zzvVar2.f29424h.f29388g), zzvVar2.f29424h.m23494y());
            } else {
                this.f29365j.mo22836h().m23137H().m23150d("Too many conditional properties, ignoring", zzet.m23131x(zzvVar2.f29422f), this.f29365j.m23218J().m23120B(zzvVar2.f29424h.f29388g), zzvVar2.f29424h.m23494y());
            }
            m23445W().m22759w();
        } finally {
            m23445W().m22721A0();
        }
    }

    /* renamed from: z */
    final void m23465z(Runnable runnable) {
        m23423j0();
        if (this.f29370o == null) {
            this.f29370o = new ArrayList();
        }
        this.f29370o.add(runnable);
    }

    private zzkc(zzkh zzkhVar, zzfx zzfxVar) {
        this.f29366k = false;
        Preconditions.m14372k(zzkhVar);
        zzfx m23203a = zzfx.m23203a(zzkhVar.f29386a, null);
        this.f29365j = m23203a;
        this.f29380y = -1L;
        zzkg zzkgVar = new zzkg(this);
        zzkgVar.m22779u();
        this.f29363h = zzkgVar;
        zzex zzexVar = new zzex(this);
        zzexVar.m22779u();
        this.f29358c = zzexVar;
        zzfr zzfrVar = new zzfr(this);
        zzfrVar.m22779u();
        this.f29357b = zzfrVar;
        m23203a.mo22835g().m23201z(new RunnableC7697i7(this, zzkhVar));
    }
}
