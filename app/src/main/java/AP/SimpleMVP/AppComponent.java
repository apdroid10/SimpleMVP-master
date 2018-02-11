package AP.SimpleMVP;

/**
 * Created by Admin on 2/7/18.
 */

import javax.inject.Singleton;
import AP.SimpleMVP.View.Fragment.UserFragment;
import dagger.Component;

@Singleton
@Component(modules = { AppModule.class })
public interface AppComponent {
    void inject(UserFragment target);
}