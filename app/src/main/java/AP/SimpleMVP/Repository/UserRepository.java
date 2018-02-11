package AP.SimpleMVP.Repository;

import AP.SimpleMVP.Model.User;

/**
 * Created by Admin on 2/7/18.
 */

// this module talks to the DB or an API to fetch the adta and load the Model User
    
public interface UserRepository {

    User getUser(int id);

    void save(User u);
}
