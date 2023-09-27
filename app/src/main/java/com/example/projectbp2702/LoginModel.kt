package com.example.projectbp2702

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method//func
    fun loginCek():Boolean{
    if (username.equals("Reza") && password.equals("amikom")){
        return true
    }else{
    return false
    }
}
}