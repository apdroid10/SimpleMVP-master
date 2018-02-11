package AP.SimpleMVP;

import android.app.Application;

/**
 * Created by Admin on 2/7/18.
 */

public class MvpApplication extends Application{
    private AppComponent component;


    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder().appModule(new AppModule()).build();

    }

    public AppComponent getComponent() {
        return  component;
    }
}
