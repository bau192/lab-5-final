package com.example.lab5oficial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//inmportamo libreria de intent
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_escaneo_qr.*
import android.R.attr.data
import android.app.Activity
import android.widget.Toast
import com.google.zxing.integration.android.IntentResult



class escaneoQR : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_escaneo_qr)

        button.setOnClickListener{
            //creamos la una variable de intent
            val escaner=IntentIntegrator(this)
            //corremos el proceso de scanner
            escaner.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE)
            escaner.initiateScan()
        }
        }

   // rkistner. (2 de Noviembre de 2018). https://github.com/journeyapps. Obtenido de https://github.com/journeyapps: https://github.com/journeyapps/zxing-android-embedded
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

       if(resultCode== Activity.RESULT_OK) {
           val resultado = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
           //agregamos programación defensiva basica, basada en cita superior
           if (resultado != null) if (resultado.contents != null) {
               //mostramos en texto de notificación el codigo leido
               Toast.makeText(this, "codigo escaneado es " + resultado.contents, Toast.LENGTH_LONG).show()
           }

       }

         }





    }
