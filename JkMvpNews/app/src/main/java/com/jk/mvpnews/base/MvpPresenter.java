package com.jk.mvpnews.base;

/**
 * Created by ZhangCheng on 2016/11/3.
 */

public class MvpPresenter<T extends BaseView> implements BasePresenter<T> {

    private T view;


    @Override
    public void attachView(T view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view=null;
    }
}
