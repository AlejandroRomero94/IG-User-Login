package com.alejandro.instagram_user_login.login.core.di

import com.alejandro.instagram_user_login.login.data.network.LoginClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

class NetworkModule {

    @Singleton
    @Provides

    fun provideRetrofit(): Retrofit {
        return  Retrofit.Builder()
            .baseUrl("https://run.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides

    fun provideLoginClient(retrofit:Retrofit): LoginClient {
        return  retrofit.create(LoginClient::class.java)
    }

}