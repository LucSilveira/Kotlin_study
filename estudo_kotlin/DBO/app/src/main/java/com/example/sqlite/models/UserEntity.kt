package com.example.sqlite.models

import android.graphics.Bitmap

class UserEntity(val id: Int, var username: String, var password: String, var img: Bitmap?)
{
    override fun toString(): String {
        return "Usuario(id = $id, username = $username, password = $username), img : ${img}";
    }
}