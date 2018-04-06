package notes.thesmader.com.notes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "notes.db";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String CREATE_TABLE =
                "CREATE TABLE " + Note.TABLE_NAME + "(" + Note._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                        + Note.COLUMN_NOTE_TITLE + " TEXT,"
                        + Note.COLUMN_NOTE_DES + " TEXT);";
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Note.TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
