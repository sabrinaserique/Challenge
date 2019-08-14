package br.com.sabrina.serique.challenge.service;

import br.com.sabrina.serique.challenge.model.Fundo;
import retrofit2.Call;
import retrofit2.Callback;

public class ApiService {
    public void getClientList(Callback<Fundo> callback) {

        ApiClient service = ApiClientBuilder.getMGClient();

        Call<Fundo> result =  service.getJSONData();

        result.enqueue(callback);

    }
}
