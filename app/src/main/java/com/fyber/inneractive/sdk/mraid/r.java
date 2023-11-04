package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k0;
import java.util.Map;

/* loaded from: classes.dex */
public class r extends a {
    public r(Map<String, String> map, com.fyber.inneractive.sdk.web.i iVar, k0 k0Var) {
        super(map, iVar, k0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        String str = this.b.get("uri");
        if (str != null && !"".equals(str)) {
            com.fyber.inneractive.sdk.web.i iVar = this.c;
            Context m = iVar.m();
            if (!com.fyber.inneractive.sdk.util.j.n()) {
                iVar.a(g.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                IAlog.a("Error downloading file. Please check if the Android permission is not granted, or maybe the device does not have an SD card mounted? ", new Object[0]);
                return;
            } else if (m instanceof Activity) {
                new AlertDialog.Builder(iVar.m()).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new com.fyber.inneractive.sdk.web.q(iVar, str)).setCancelable(true).show();
                return;
            } else {
                com.fyber.inneractive.sdk.util.m.b.post(new com.fyber.inneractive.sdk.web.o(iVar, "Downloading image to Picture gallery..."));
                iVar.a(str);
                return;
            }
        }
        this.c.a(g.STORE_PICTURE, "Image can't be stored with null or empty URL");
        IAlog.a("Mraid Store Picture -Invalid URI ", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public String c() {
        return this.b.get("uri");
    }
}
