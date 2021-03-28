package com.example.instantnotes.repository

import androidx.lifecycle.LiveData
import com.example.instantnotes.data.UserDao
import com.example.instantnotes.model.User

class UserRepository(private val userDao: UserDao) {

    val readAllNotes: LiveData<List<User>> = userDao.readAllNotes()

    suspend fun addNote(user: User){
        userDao.addNote(user)
    }

    suspend fun updateNote(user: User){
        userDao.updateNote(user)
    }

    suspend fun deleteNote(user: User){
        userDao.deleteNote(user)
    }

    suspend fun deleteAllNotes(){
        userDao.deleteAllNotes()
    }

}