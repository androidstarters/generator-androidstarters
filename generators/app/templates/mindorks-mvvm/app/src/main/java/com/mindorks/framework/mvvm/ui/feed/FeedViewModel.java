package <%= appPackage %>.ui.feed;

import <%= appPackage %>.data.DataManager;
import <%= appPackage %>.ui.base.BaseViewModel;
import <%= appPackage %>.utils.rx.SchedulerProvider;

/**
 * Created by Jyoti on 29/07/17.
 */

public class FeedViewModel extends BaseViewModel {

    public FeedViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

}
