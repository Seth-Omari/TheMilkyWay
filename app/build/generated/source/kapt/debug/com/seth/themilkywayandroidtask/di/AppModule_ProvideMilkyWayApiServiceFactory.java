// Generated by Dagger (https://dagger.dev).
package com.seth.themilkywayandroidtask.di;

import com.seth.themilkywayandroidtask.data.remote.MilkyWayApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideMilkyWayApiServiceFactory implements Factory<MilkyWayApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideMilkyWayApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MilkyWayApiService get() {
    return provideMilkyWayApiService(retrofitProvider.get());
  }

  public static AppModule_ProvideMilkyWayApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideMilkyWayApiServiceFactory(retrofitProvider);
  }

  public static MilkyWayApiService provideMilkyWayApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideMilkyWayApiService(retrofit));
  }
}