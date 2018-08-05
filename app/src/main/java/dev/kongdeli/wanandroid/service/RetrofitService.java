package dev.kongdeli.wanandroid.service;

import dev.kongdeli.wanandroid.service.entity.HomeBean;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitService {
    @GET("article/list/{page}/json")
    Observable<HomeBean> getHomeArticle(@Path("page") int pageCount);
}
