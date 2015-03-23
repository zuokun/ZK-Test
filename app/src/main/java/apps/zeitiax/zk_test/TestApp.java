package apps.zeitiax.zk_test;

import android.app.Application;
import android.content.Context;

/**
 * Created by User on 23/3/2015.
 */
public class TestApp extends Application {

    private static TestApp instance;

    public static Context getContext() {

        return instance;

    }

}
