package com.example.lab5oficial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener(View.OnClickListener {
            val tryOne= Intent(this,ventanaNuevoProducto::class.java)
            startActivity(tryOne)
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }




    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item1->
            {
                Toast.makeText(this, "Nuevo producto seleccionado" , Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }
            R.id.item2->
            {
                Toast.makeText(this, "reinicio de lista selecccionado " , Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }
            R.id.item3->
            {
                Toast.makeText(this, "Inventario actual seleccionado " , Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }
            else -> return super.onOptionsItemSelected(item)
        }


    }

}
