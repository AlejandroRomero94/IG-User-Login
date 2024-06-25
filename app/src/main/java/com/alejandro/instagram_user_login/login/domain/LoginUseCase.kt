package com.alejandro.instagram_user_login.login.domain

import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository:LoginRepository) {
    suspend operator fun invoke (user:String,password:String):Boolean{
        return repository.doLogin(user,password)
    }
}