package com.example.Ecommerce.configuration;

import com.example.Ecommerce.gateway.api.FakeStoreCategoryApi;
//import main.java.com.example.Ecommerce.gateway.api.FakeStoreProductApi;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {
    @Value("${external.api.base-url}")
    private String baseUrl;

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit) {
        return retrofit.create(FakeStoreCategoryApi.class);
    }

    // @Bean
    // public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit) {
    // return retrofit.create(FakeStoreProductApi.class);
    // }

}
