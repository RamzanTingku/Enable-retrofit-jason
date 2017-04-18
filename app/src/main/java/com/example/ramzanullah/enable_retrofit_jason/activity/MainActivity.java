package com.example.ramzanullah.enable_retrofit_jason.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ramzanullah.enable_retrofit_jason.R;
import com.example.ramzanullah.enable_retrofit_jason.adapter.RecyclerViewAdapter;
import com.example.ramzanullah.enable_retrofit_jason.model.User;
import com.example.ramzanullah.enable_retrofit_jason.network.ApiClint;
import com.example.ramzanullah.enable_retrofit_jason.service.APIService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserList();
    }

    private void getUserList() {
        try {
            APIService service = ApiClint.getRetrofit().create(APIService.class);
            Call<List<User>> call = service.getUserData();

            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                    //Log.d("onResponse", response.message());

                    List<User> userList = response.body();
                    layoutManager = new LinearLayoutManager(MainActivity.this);

                    RecyclerView recyclerView = (RecyclerView)
                            findViewById(R.id.recycler);
                    recyclerView.setLayoutManager(layoutManager);

                    RecyclerViewAdapter recyclerViewAdapter =
                            new RecyclerViewAdapter(userList);

                    recyclerView.setAdapter(recyclerViewAdapter);


                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {

                }
            });
        }catch (Exception e) {}
    }
}
