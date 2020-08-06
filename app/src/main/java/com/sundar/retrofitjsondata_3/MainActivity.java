package com.sundar.retrofitjsondata_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...Wait...");
        progressDialog.setCancelable(false);
        progressDialog.show();

        DataInterface dataInterface = RetrofitClient.getRetrofit().create(DataInterface.class);
        Call<List<DataModel>> data = dataInterface.getAllData();
        data.enqueue(new Callback<List<DataModel>>() {
            @Override
            public void onResponse(Call<List<DataModel>> call, Response<List<DataModel>> response) {

                progressDialog.dismiss();
                generateData(response.body());
            }

            @Override
            public void onFailure(Call<List<DataModel>> call, Throwable t) {
                  progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Something error Try Again.....", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void generateData(List<DataModel> models) {


       RecyclerView recyclerView = findViewById(R.id.recyclerview);
       DataAdapter adapter = new DataAdapter(this, models);
       RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
       recyclerView.setLayoutManager(layoutManager);
       recyclerView.setAdapter(adapter);

    }
}