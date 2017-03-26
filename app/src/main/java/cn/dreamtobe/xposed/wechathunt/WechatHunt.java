package cn.dreamtobe.xposed.wechathunt;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import static de.robv.android.xposed.XposedHelpers.findClass;

/**
 * Created by Jacksgong on 26/03/2017.
 */

public class WechatHunt implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if (!lpparam.packageName.equals("com.tencent.mm")) return;

        if (BuildConfig.DEBUG) {
            XposedBridge.log("dreamtobe in wechat!");
        }

        final Class<?> pluginHelper = findClass("com.tencent.mm.ay.c", lpparam.classLoader);
        findAndHookMethod(pluginHelper, "FZ", String.class, new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                super.afterHookedMethod(param);

                final String plugin = (String) param.args[0];
                if (plugin.equals("game")) {
                    if (BuildConfig.DEBUG) {
                        XposedBridge.log("dreamtobe change plugin[" + plugin + "] result to false!");
                    }
                    param.setResult(false);
                }
            }
        });
    }
}
