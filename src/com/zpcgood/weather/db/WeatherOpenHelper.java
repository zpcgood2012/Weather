package com.zpcgood.weather.db;

import com.zpcgood.weather.utils.Constants;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class WeatherOpenHelper extends SQLiteOpenHelper {

	public WeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(Constants.CREATE_PROVINCE);
		db.execSQL(Constants.CREATE_CITY);
		db.execSQL(Constants.CREATE_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
}
