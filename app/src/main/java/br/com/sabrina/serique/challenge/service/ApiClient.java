package br.com.sabrina.serique.challenge.service;

import br.com.sabrina.serique.challenge.model.Fundo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import org.json.JSONArray;

public interface ApiClient {
    @GET("/orama-media/json/fund_detail_full.json")
    Call<Fundo> getJSONData();
}
