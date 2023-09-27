package com.example.projectbp2711

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/fc
    fun loginCheck():Boolean{
        if(username.equals("stevi") && password.equals("amikom")){
            return true
        }else{
            return false
        }
    }
}