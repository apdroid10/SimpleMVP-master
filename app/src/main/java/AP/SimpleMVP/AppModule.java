package AP.SimpleMVP;

import javax.inject.Singleton;

import AP.SimpleMVP.Presentation.UserPresenter;
import AP.SimpleMVP.Presentation.UserPresenterImpl;
import AP.SimpleMVP.Repository.InMemoryUerRepositoryImpl;
import AP.SimpleMVP.Repository.UserRepository;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 2/7/18.
 */

@Module
public class AppModule {

    @Provides
    @Singleton
    public UserRepository provideRepository(){

        return new InMemoryUerRepositoryImpl();
    }

    @Provides
    public UserPresenter provideUserPresenter(UserRepository userRepository) {
        return new UserPresenterImpl(userRepository);
    }
}
