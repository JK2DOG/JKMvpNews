package com.jk.mvpnews.contract;

import com.jk.mvpnews.base.BasePresenter;
import com.jk.mvpnews.base.BaseView;

/**
 * HelloWorld
 * Created by ZhangCheng on 2016/11/2.
 */

public interface HiContract {

    interface View extends BaseView {
        void showContent(String msg);

        void showProgress(String msg);

        void hideProgress();
    }

    interface Presenter extends BasePresenter<View> {


        void setMsg(String msg);
    }


}
