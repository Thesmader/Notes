package notes.thesmader.com.notes;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AddNote extends AppCompatActivity {

    FloatingActionButton fab;
    private DBHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        fab = findViewById(R.id.save_fab);
        mHelper = new DBHelper(this);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = mHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                EditText title = findViewById(R.id.note_title);
                EditText des = findViewById(R.id.note_des);
                values.put(Note.COLUMN_NOTE_TITLE,title.toString());
                values.put(Note.COLUMN_NOTE_DES,des.toString());
                db.insert(Note.TABLE_NAME,null,values);
                db.close();
                startActivity(new Intent(AddNote.this, MainActivity.class));
            }
        });

    }

   /* private void updateUI(){

    }*/
}
