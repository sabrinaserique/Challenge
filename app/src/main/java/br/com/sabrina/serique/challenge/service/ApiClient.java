package br.com.sabrina.serique.challenge.service;

import br.com.sabrina.serique.challenge.model.Fundo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import org.json.JSONArray;

import java.util.List;

public interface ApiClient {
    @GET("/orama-media/json/fund_detail_full.json?limit=1000&offset=0&serializer=fund_detail_full")
    Call<List<Fundo>> getAllFundosData();
}
