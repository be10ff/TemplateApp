package com.belov.artem.templateapp.presentation.view.activity;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.belov.artem.templateapp.R;
import com.belov.artem.templateapp.data.net.Api;
import com.belov.artem.templateapp.presentation.App;
import com.belov.artem.templateapp.presentation.model.Post;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends BaseActivity {

    @Inject
    SharedPreferences sp;

    @Inject
    OkHttpClient client;

    @Inject
    Retrofit retrofit;

    @BindView(R.id.tvResponce)
    TextView tvResponce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        this.getApplicationComponent().inject(this);


        Call<List<Post>> posts = retrofit.create(Api.class).getPosts();


        //Enque the call
        posts.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                //Set the response to the textview
                tvResponce.setText(response.body().get(0).getBody());

            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                //Set the error to the textview
                tvResponce.setText(t.toString());
            }
        });
    }
}
