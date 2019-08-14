package br.com.sabrina.serique.challenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.sabrina.serique.challenge.adapter.CustomListAdapter;
import br.com.sabrina.serique.challenge.model.Fundo;
import br.com.sabrina.serique.challenge.service.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView listView ;
    String TAG = "MainActivity";
    List<Fundo> fundoData =new ArrayList<>();
    static CustomListAdapter customListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getListdata();
    }

    public void getListdata() {
        try {

            new ApiService().getFundoList(new Callback<List<Fundo>>() {
                @Override
                public void onResponse(Call<List<Fundo>> call, Response<List<Fundo>> response) {

                    Log.d(TAG, "onResponse: response..."+response);

                    fundoData = response.body();
                    createListView();
                }
                @Override
                public void onFailure(Call<List<Fundo>> call, Throwable t) {

                    Log.d(TAG, "onFailure: response...");
                }
            });

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public  void createListView(){
        customListAdapter = new CustomListAdapter(getApplicationContext(), fundoData);
        listView = (ListView) findViewById(R.id.listFundosData);
        listView.setAdapter(customListAdapter);
    }
}
