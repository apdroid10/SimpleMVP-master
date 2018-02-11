package AP.SimpleMVP.Repository;

import AP.SimpleMVP.Model.User;

/**
 * Created by Admin on 2/7/18.
 */

public class InMemoryUerRepositoryImpl implements UserRepository {

    private User u;

    @Override
    public User getUser(int id) {
        // generally you would fetch user with an ID from a DB/etc
        //but here we are just hardcoding the values
        if(u==null){
            u = new User();
            u.setID(id);
            u.setFirstName("Captain");
            u.setLastName("Crunch");
        }
        return u;
    }

    /**
     * Save's the in-memory user.
     *
     * @param u The user.
     */
    @Override
    public void save(User u) {
        if(this.u == null) {
            this.u = getUser(0); // create the in memory user.
        }
        this.u.setID(u.getID());
        this.u.setFirstName(u.getFirstName());
        this.u.setLastName(u.getLastName());
    }
}
