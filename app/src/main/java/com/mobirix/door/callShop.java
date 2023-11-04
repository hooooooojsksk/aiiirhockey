package com.mobirix.door;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.google.android.gms.drive.DriveFile;
import java.io.PrintStream;
import java.util.List;

/* loaded from: classes2.dex */
public class callShop {
    private static final String NEW_PACKAGENAME = "com.lguplus.appstore";
    public static final int NEW_VERSION_INSTALLED = 2;
    public static final int NOT_INSTALLED = 0;
    public static final int OLD_VERSION_INSTALLED = 1;
    private static final String PRE_PACKAGENAME = "android.lgt.appstore";
    private boolean _isActivity;
    private int marketVersion;

    public static final void Test(Activity activity) {
        try {
            activity.startActivity(shopSearchGoogle("mobirix"));
            activity.startActivity(shopSearchSK("모비릭스"));
            activity.startActivity(shopSearchKT("모비릭스"));
            activity.startActivity(shopSearchLG(activity, "모비릭스"));
            activity.startActivity(shopProductGoogle("com.mobirix.YutGame"));
            activity.startActivity(shopProductSK(activity, "OA00256492"));
            activity.startActivity(shopProductKT("51200001734559"));
            activity.startActivity(shopProductLG(activity, "Q02010057053"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final boolean shopCheckInstallSK(Context context) {
        try {
            List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
            int size = installedApplications.size();
            for (int i = 0; i < size; i++) {
                if (installedApplications.get(i).packageName.indexOf("com.skt.skaf.A000Z00040") != -1) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static final Intent shopSearchGoogle(String str) {
        try {
            return new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:" + str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final Intent shopProductGoogle(String str) {
        try {
            Uri parse = Uri.parse("market://details?id=" + str);
            PrintStream printStream = System.out;
            printStream.println("market://details?id=" + str);
            return new Intent("android.intent.action.VIEW", parse);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final Intent shopSearchSK(String str) {
        try {
            Intent intent = new Intent();
            intent.addFlags(DriveFile.MODE_WRITE_ONLY);
            intent.setClassName("com.skt.skaf.A000Z00040", "com.skt.skaf.A000Z00040.A000Z00040");
            intent.setAction("COLLAB_ACTION");
            intent.putExtra("com.skt.skaf.COL.URI", ("SEARCH_ACTION/0/" + str).getBytes());
            intent.putExtra("com.skt.skaf.COL.REQUESTER", "A000Z00040");
            return intent;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean isInstalled(Context context, String str) {
        try {
            List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
            int size = installedApplications.size();
            for (int i = 0; i < size; i++) {
                if (installedApplications.get(i).packageName.equals(str)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final Intent shopProductSK(Context context, String str) {
        try {
            String[] split = str.split(",");
            Intent intent = new Intent();
            if (split.length == 4) {
                if (isInstalled(context, split[1])) {
                    intent.addFlags(DriveFile.MODE_WRITE_ONLY);
                    intent.setClassName("com.skt.skaf.A000Z00040", "com.skt.skaf.A000Z00040.A000Z00040");
                    intent.setAction("COLLAB_ACTION");
                    intent.putExtra("com.skt.skaf.COL.URI", ("PRODUCT_VIEW/" + split[0] + "/0").getBytes());
                    intent.putExtra("com.skt.skaf.COL.REQUESTER", "A000Z00040");
                } else {
                    intent.addFlags(DriveFile.MODE_WRITE_ONLY);
                    intent.setClassName("com.skt.skaf.A000Z00040", "com.skt.skaf.A000Z00040.A000Z00040");
                    intent.setAction("COLLAB_ACTION");
                    intent.putExtra("com.skt.skaf.COL.URI", ("MULTI_DOWNLOAD/1/" + split[0] + "/0/" + split[2] + "/" + split[3] + "/0/CTXX").getBytes());
                    intent.putExtra("com.skt.skaf.COL.REQUESTER", "A000Z00040");
                }
            } else {
                intent.addFlags(DriveFile.MODE_WRITE_ONLY);
                intent.setClassName("com.skt.skaf.A000Z00040", "com.skt.skaf.A000Z00040.A000Z00040");
                intent.setAction("COLLAB_ACTION");
                intent.putExtra("com.skt.skaf.COL.URI", ("PRODUCT_VIEW/" + str + "/0").getBytes());
                intent.putExtra("com.skt.skaf.COL.REQUESTER", "A000Z00040");
            }
            return intent;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final Intent shopSearchKT(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(DriveFile.MODE_WRITE_ONLY);
            intent.setType("vnd.kt.olleh.storefront/search.kt.olleh.storefront");
            intent.putExtra("N_ID", "A");
            intent.putExtra("KEYWORD", str);
            return intent;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final Intent shopSearchLG(Context context, String str) {
        try {
            int LGMarketVersionCheck = LGMarketVersionCheck(context);
            if (LGMarketVersionCheck == 1) {
                Intent intent = new Intent();
                intent.setClassName(PRE_PACKAGENAME, "android.lgt.appstore.SearchResultList");
                intent.putExtra("Recognition", true);
                intent.putExtra("SearchWord", str);
                return intent;
            } else if (LGMarketVersionCheck != 2) {
                return null;
            } else {
                String str2 = "ozstore://SEARCH/" + str;
                Intent intent2 = new Intent("ozstore.external.linked");
                intent2.setData(Uri.parse(str2));
                return intent2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final Intent shopProductKT(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.kt.olleh.storefront/detail.kt.olleh.storefront");
            intent.putExtra("CONTENT_TYPE", "APPLICATION");
            intent.putExtra("P_TYPE", "c");
            intent.putExtra("P_ID", str);
            intent.putExtra("N_ID", "A001");
            return intent;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final Intent shopProductLG(Context context, String str) {
        try {
            int LGMarketVersionCheck = LGMarketVersionCheck(context);
            if (LGMarketVersionCheck == 1) {
                Intent intent = new Intent();
                intent.setClassName(PRE_PACKAGENAME, "android.lgt.appstore.Store");
                intent.putExtra("payload", "PID=" + str);
                return intent;
            } else if (LGMarketVersionCheck != 2) {
                return null;
            } else {
                String str2 = "ozstore://STORE/PID=" + str;
                Intent intent2 = new Intent("ozstore.external.linked");
                intent2.setData(Uri.parse(str2));
                return intent2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int LGMarketVersionCheck(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        for (int i = 0; i < installedPackages.size(); i++) {
            PackageInfo packageInfo = installedPackages.get(i);
            if (packageInfo.packageName.equals(PRE_PACKAGENAME)) {
                return 1;
            }
            if (packageInfo.packageName.equals(NEW_PACKAGENAME)) {
                return 2;
            }
        }
        return 0;
    }
}
