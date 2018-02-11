package AP.SimpleMVP.Presentation;

import android.text.TextUtils;

import AP.SimpleMVP.Model.User;
import AP.SimpleMVP.Repository.UserRepository;
import AP.SimpleMVP.View.UserView;

/**
 * Created by Admin on 2/7/18.
 */

public class UserPresenterImpl implements UserPresenter {
    private UserView userView;
    private UserRepository userRepository;
    private User u;



    // userRepository param here is provided by Dagger
    public  UserPresenterImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public void Pause() {

    }

    @Override
    public void Resume() {

        loadUserDetails();
    }

    @Override
    public void loadUserDetails() {

        int userId = userView.getUserId();
        u = userRepository.getUser(userId);
        if(u==null){
            userView.showUserNotFoundMessage();
        } else{
            userView.displayFirstName(u.getFirstName());
            userView.displayLastName(u.getLastName());

        }

    }

    @Override
    public void setView(UserView view) {
        this.userView = view;

    }

    @Override
    public void saveUser() {

        if(u!=null){
            if(TextUtils.isEmpty(userView.getFirstName())|| TextUtils.isEmpty(userView.getLastName())){
                userView.showUserNameIsRequired();
            }else {
                u.setFirstName(userView.getFirstName());
                u.setLastName((userView.getLastName()));
                userRepository.save(u);
                userView.showUserSavedMessage();
            }
        }
    }
}
