package com.example.lab5oficial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ventana_nuevo_producto.*

class ventanaNuevoProducto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_nuevo_producto)



        button4.setOnClickListener(View.OnClickListener {
            val tryOne= Intent(this,escaneoQR::class.java)
            startActivity(tryOne)
        })
    }
}
