package com.android.hellowolrdmvp.contract;

/**
 * Created by sagarkhakhar on 20/09/17.
 */

public interface MainActivityContract {

  interface View {

    void initView();

    void setViewData(String data);

  }

  interface Model {

    String getData();
  }

  interface Presenter {

    void onClickOne(android.view.View view);
    void onClickTwo(android.view.View view);
  }
}
