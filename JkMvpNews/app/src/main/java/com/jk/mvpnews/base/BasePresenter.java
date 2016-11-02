package com.jk.mvpnews.base;

/**
 * Created by ZhangCheng on 2016/11/2.
 */

public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();

}
