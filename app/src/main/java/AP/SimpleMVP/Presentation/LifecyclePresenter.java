package AP.SimpleMVP.Presentation;

/**
 * Created by Admin on 2/7/18.
 */
// parent presenter for any presenter to interact with lifecycle events
public interface LifecyclePresenter {

    void Pause();
    void Resume();
}
