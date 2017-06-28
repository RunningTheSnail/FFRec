package me.danwi.ffactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created with Android Studio.
 * User: HandSome-T
 * Date: 17/6/28
 * Time: 下午4:43
 */
public class RegisterActivity extends BaseReactNativeActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = new Bundle();
        bundle.putString("register", "register");
        rootView.startReactApplication(mReactInstanceManager, "FFActivity", bundle);
        setContentView(rootView);
    }
}
