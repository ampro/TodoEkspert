package com.example.amprossd.todoekspert;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TodoListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public boolean onCreateOptionsMenu (Menu menu){
//Inflate the menu. this adds item to the action bar if it is present
        getMenuInflater().inflate(R.menu.todo_list, menu);
        return true;
    }

    public boolean onOtionsItemSelected(MenuItem item){
//HAndle action bar item clicks here the action bar will
        //automatically handle clicks on the home/up button so long
        //ahogy az androidmanifest.xml-ben specifikáltuk

        //TODO be kell fejezni a menü layoutban az itemek hozzáadását. Ezért hiányzik az action_logout

        int id= item.getItemId();
        if (id == R.id.action_logout){
            finish();
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            return true;
        }
        return super.onContextItemSelected(item);
    }

}
