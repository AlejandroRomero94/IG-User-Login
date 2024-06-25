package com.alejandro.instagram_user_login.login.data

import com.alejandro.instagram_user_login.login.data.network.LoginService
import javax.inject.Inject

class LoginRepository @Inject constructor(private val api: LoginService) {
    suspend fun doLogin(user:String, password:String):Boolean{
        return api.doLogin(user,password)
    }
}