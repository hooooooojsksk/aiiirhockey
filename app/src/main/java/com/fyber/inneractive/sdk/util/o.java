package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;

/* loaded from: classes.dex */
public class o extends AsyncTask<Void, Void, Bitmap> {
    public Context a;
    public a b;
    public String c;
    public String d = null;
    public int e;

    /* loaded from: classes.dex */
    public interface a {
    }

    public o(Context context, a aVar, String str, String str2, int i) {
        this.a = context;
        this.b = aVar;
        this.c = str;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00c9 A[Catch: all -> 0x00e0, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:159:0x00ba, B:161:0x00c9), top: B:185:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00d3 A[Catch: all -> 0x00dc, DONT_GENERATE, TryCatch #13 {all -> 0x00dc, blocks: (B:163:0x00ce, B:165:0x00d3, B:167:0x00d8), top: B:210:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00d8 A[Catch: all -> 0x00dc, DONT_GENERATE, TRY_LEAVE, TryCatch #13 {all -> 0x00dc, blocks: (B:163:0x00ce, B:165:0x00d3, B:167:0x00d8), top: B:210:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap doInBackground(java.lang.Void[] r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.o.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        a aVar = this.b;
        if (aVar == null) {
            return;
        }
        if (bitmap2 != null) {
            com.fyber.inneractive.sdk.player.c cVar = (com.fyber.inneractive.sdk.player.c) aVar;
            com.fyber.inneractive.sdk.player.b bVar = cVar.a;
            if (bVar.n != null) {
                bVar.a(bitmap2);
                com.fyber.inneractive.sdk.player.b bVar2 = cVar.a;
                bVar2.m = null;
                bVar2.n = null;
            }
            IAlog.a("MediaPlayerController: fetching video frame success!", new Object[0]);
        } else {
            com.fyber.inneractive.sdk.player.c cVar2 = (com.fyber.inneractive.sdk.player.c) aVar;
            com.fyber.inneractive.sdk.player.b bVar3 = cVar2.a;
            if (bVar3.n != null) {
                bVar3.a((Bitmap) null);
                com.fyber.inneractive.sdk.player.b bVar4 = cVar2.a;
                bVar4.m = null;
                bVar4.n = null;
            }
            IAlog.a("MediaPlayerController: fetching video frame failed!", new Object[0]);
        }
        this.b = null;
    }
}
