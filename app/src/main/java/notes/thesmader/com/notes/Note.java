package notes.thesmader.com.notes;

import android.provider.BaseColumns;

/**
 * Created by Thesmader on 4/5/2018.
 */

public class Note implements BaseColumns{


    public static final String TABLE_NAME = "Notes";
    public static final String _ID = "_id";
    public static final String COLUMN_NOTE_TITLE = "Title";
    public static final String COLUMN_NOTE_DES = "Description";
}
