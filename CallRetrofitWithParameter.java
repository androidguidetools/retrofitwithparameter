package com.retrofitdemo.retrofitlearnigtopics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.retrofitdemo.retrofitlearnigtopics.adapter.MyFruitListAdapter;
import com.retrofitdemo.retrofitlearnigtopics.model.FruitModel;
import com.retrofitdemo.retrofitlearnigtopics.rest.ApiClient2;
import com.retrofitdemo.retrofitlearnigtopics.rest.ApiInterface2;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CallRetrofitWithParameter extends AppCompatActivity {

    private ApiInterface2 apiInterface2;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<FruitModel> fruitList;
    private MyFruitListAdapter myFruitListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_retrofit_with_parameter);

        String parameter = getIntent().getStringExtra("parameter");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        apiInterface2 = ApiClient2.getApiClient().create(ApiInterface2.class);
        Call<List<FruitModel>> call = apiInterface2.getAppList(parameter);

        call.enqueue(new Callback<List<FruitModel>>() {
            @Override
            public void onResponse(Call<List<FruitModel>> call, Response<List<FruitModel>> response) {
                fruitList = response.body();
                myFruitListAdapter = new MyFruitListAdapter(CallRetrofitWithParameter.this, fruitList);
                recyclerView.setAdapter(myFruitListAdapter);
            }

            @Override
            public void onFailure(Call<List<FruitModel>> call, Throwable t) {

            }
        });

    }
}
