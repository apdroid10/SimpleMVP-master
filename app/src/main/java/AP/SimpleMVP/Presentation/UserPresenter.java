package AP.SimpleMVP.Presentation;

import android.view.View;

import AP.SimpleMVP.View.UserView;

/**
 * Created by Admin on 2/7/18.
 */

public interface UserPresenter extends LifecyclePresenter {

    void loadUserDetails();
    void setView(UserView view);
    void saveUser();
}
