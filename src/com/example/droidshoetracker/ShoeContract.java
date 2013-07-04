package com.example.droidshoetracker;

import android.provider.BaseColumns;

public final class ShoeContract {

	public ShoeContract() {}
	
    public static abstract class ShoeEntry implements BaseColumns {
        public static final String TABLE_NAME = "shoe";
        public static final String COLUMN_NAME_SHOE_ID = "shoeId";
        public static final String COLUMN_NAME_SHOE_NAME = "shoeName";
    }
}
