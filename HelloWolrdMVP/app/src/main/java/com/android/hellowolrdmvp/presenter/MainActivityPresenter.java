package com.android.hellowolrdmvp.presenter;

import android.content.Context;
import android.content.Intent;

import com.android.hellowolrdmvp.contract.MainActivityContract;
import com.android.hellowolrdmvp.contract.MainActivityContract.Model;
import com.android.hellowolrdmvp.contract.MainActivityContract.View;
import com.android.hellowolrdmvp.model.MainActivityModel;
import com.android.hellowolrdmvp.view.MainActivity;
import com.android.hellowolrdmvp.view.NextActivity;

/**
 * Created by sagarkhakhar on 20/09/17.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

  private View mView;
  private Model mModel;

  private Context mContext;

  public MainActivityPresenter(View view,Context context) {
    mView = view;
    mContext=context;
    initPresenter();
  }

  private void initPresenter() {
    mModel = new MainActivityModel();
    mView.initView();
  }

  @Override
  public void onClickOne(android.view.View view) {
    String data = mModel.getData();
    mView.setViewData(data);
  }

  @Override
  public void onClickTwo(android.view.View view) {
      Intent i = new Intent (mContext, NextActivity.class);
      //do animation stuff
      i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      mContext.startActivity(i);
  }
}
