package me.danwi.ffactivity;

import android.app.Application;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainReactPackage;

/**
 * Created with Android Studio.
 * User: HandSome-T
 * Date: 17/6/28
 * Time: 下午4:30
 */
public class App extends Application {

    public static ReactInstanceManager mReactInstanceManager;

    @Override
    public void onCreate() {
        super.onCreate();
        mReactInstanceManager = ReactInstanceManager.builder()
                .setApplication(this)
                .setBundleAssetName("index.android.bundle")
                .setJSMainModuleName("index.android")
                .addPackage(new MainReactPackage())
                .setUseDeveloperSupport(BuildConfig.DEBUG)
                .setInitialLifecycleState(LifecycleState.RESUMED)
                .build();
    }
}
