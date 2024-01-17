package com.example.weather.check_weather.service;

import com.example.weather.check_weather.model.currentweather.CurrentWeatherResponse;
import com.example.weather.check_weather.model.daysweather.MultipleDaysWeatherResponse;
import com.example.weather.check_weather.model.fivedayweather.FiveDayResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

  /**
   * Get current weather of city
   *
   * @param q     String name of city
   * @param units String units of response
   * @param lang  String language of response
   * @param appId String api key
   * @return instance of {@link CurrentWeatherResponse}
   */
  @GET("weather")
  Single<CurrentWeatherResponse> getCurrentWeather(
      @Query("q") String q,
      @Query("units") String units,
      @Query("lang") String lang,
      @Query("appid") String appId
  );

  /**
   * Get five days weather forecast.
   *
   * @param q     String name of city
   * @param units String units of response
   * @param lang  String language of response
   * @param appId String api key
   * @return instance of {@link FiveDayResponse}
   */
  @GET("forecast")
  Single<FiveDayResponse> getFiveDaysWeather(
      @Query("q") String q,
      @Query("units") String units,
      @Query("lang") String lang,
      @Query("appid") String appId
  );

  /**
   * Get multiple days weather
   *
   * @param q     String name of city
   * @param units String units of response
   * @param lang  String language of response
   * @param appId String api key
   * @return instance of {@link MultipleDaysWeatherResponse}
   */
  @GET("forecast/daily")
  Single<MultipleDaysWeatherResponse> getMultipleDaysWeather(
      @Query("q") String q,
      @Query("units") String units,
      @Query("lang") String lang,
      @Query("cnt") int dayCount,
      @Query("appid") String appId
  );
}
