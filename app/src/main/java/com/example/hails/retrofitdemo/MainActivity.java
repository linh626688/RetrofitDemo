package com.example.hails.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.hails.retrofitdemo.model.GoogleApiModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitHelper.getVideo().enqueue(new Callback<GoogleApiModel>() {
            @Override
            public void onResponse(Call<GoogleApiModel> call, Response<GoogleApiModel> response) {
                GoogleApiModel googleApiModel = response.body();
                Log.d("@@GoogleApiModel", googleApiModel.toString());
            }

            @Override
            public void onFailure(Call<GoogleApiModel> call, Throwable t) {

            }
        });
    }

}
