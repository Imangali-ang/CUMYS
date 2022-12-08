package com.example.cumpot.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cumpot.data.dao.CumuysDao
import com.example.cumpot.data.model.FoodDto

@Database(entities = [FoodDto::class], version = 1, exportSchema = true)
abstract class CumysDatabase : RoomDatabase() {
    abstract fun dao(): CumuysDao

    companion object {
        @Volatile
        private var database: CumysDatabase? = null

        fun getInstance(applicationContext: Context): CumysDatabase {
            synchronized(this) {
                if (database == null) {
                    val INSTANCE = Room.databaseBuilder(
                        applicationContext,
                        CumysDatabase::class.java,
                        "CumysDatabase"
                    )
// TODO                        .createFromAsset("database/CumysDatabase.db")
                        .build()
                    database = INSTANCE
                    return INSTANCE
                }
                return database as CumysDatabase
            }
        }
    }
}