package br.com.sabrina.serique.challenge.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.sabrina.serique.challenge.activities.DetailActivity;
import br.com.sabrina.serique.challenge.activities.MainActivity;
import br.com.sabrina.serique.challenge.R;
import br.com.sabrina.serique.challenge.adapter.CustomListAdapter;
import br.com.sabrina.serique.challenge.constants.Constantes;
import br.com.sabrina.serique.challenge.model.Fundo;
import br.com.sabrina.serique.challenge.service.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListFragment extends Fragment implements Constantes {
    ListView listView ;
    String TAG = "MainActivity";
    List<Fundo> fundoData =new ArrayList<>();
    static CustomListAdapter customListAdapter;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        getListdata(view);

        return view;
    }

    public void getListdata(View view) {
        final View v1 = view;
        try {

            new ApiService().getFundoList(new Callback<List<Fundo>>() {
                @Override
                public void onResponse(Call<List<Fundo>> call, Response<List<Fundo>> response) {

                    Log.d(TAG, "onResponse: response..."+response);

                    fundoData = response.body();
                    createListView(v1);
                }
                @Override
                public void onFailure(Call<List<Fundo>> call, Throwable t) {

                    Log.d(TAG, "onFailure: response...");
                    Toast.makeText(getActivity(), R.string.msgErro, Toast.LENGTH_LONG);
                }
            });

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public  void createListView(View view){
        customListAdapter = new CustomListAdapter(getActivity(), fundoData);
        listView = (ListView) view.findViewById(R.id.listFundosData);
        listView.setAdapter(customListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                bundle.putSerializable(PARAM_OBJ_FUNDO, fundoData.get(i));
                ((MainActivity) getActivity()).abrirActivity(DetailActivity.class, bundle);
            }
        });
    }
}
