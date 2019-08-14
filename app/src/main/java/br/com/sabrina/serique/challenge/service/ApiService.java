package br.com.sabrina.serique.challenge.service;

import java.util.List;

import br.com.sabrina.serique.challenge.model.Fundo;
import retrofit2.Call;
import retrofit2.Callback;

public class ApiService {
    public void getFundoList(Callback<List<Fundo>> callback) {

        ApiClient service = ApiClientBuilder.getMGClient();

        Call<List<Fundo>> result =  service.getAllFundosData();

        result.enqueue(callback);

    }
}
