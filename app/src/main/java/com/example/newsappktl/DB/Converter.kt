package com.example.newsappktl.DB

import androidx.room.TypeConverter
import com.example.newsappktl.Model.Source

class Converter {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }
}