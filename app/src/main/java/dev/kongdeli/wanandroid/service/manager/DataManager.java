package dev.kongdeli.wanandroid.service.manager;


import dev.kongdeli.wanandroid.service.RetrofitHelper;
import dev.kongdeli.wanandroid.service.entity.HomeBean;
import io.reactivex.Observable;

public class DataManager {
    public Observable<HomeBean> getHomeArticle(int pageCount) {
        return RetrofitHelper.getInstance().getServer().getHomeArticle(pageCount);
    }
}
