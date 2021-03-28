package com.example.instantnotes.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.instantnotes.model.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addNote(user: User)

    @Update
    suspend fun updateNote(user: User)

    @Delete
    suspend fun deleteNote(user: User)

    @Query("DELETE FROM user_table")
    suspend fun deleteAllNotes()

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllNotes(): LiveData<List<User>>

}