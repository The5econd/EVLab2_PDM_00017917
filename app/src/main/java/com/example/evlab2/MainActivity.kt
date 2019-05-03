package com.example.evlab2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.toDrawable
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_fragment_colors.*
import kotlinx.android.synthetic.main.fragment_fragment_colors.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var frag = FragmentColors.newInstance()
        supportFragmentManager.beginTransaction().replace(R.id.fragmento_colores, frag).commit()

        boton_atras.setOnClickListener{

        }
        var cont = 0
        boton_adelante.setOnClickListener{
            if (cont == 0){
                color_de_fondo.background = Color.RED.toDrawable()
                cont = 1
            }
            if (color_de_fondo.background == Color.RED.toDrawable()){
                color_de_fondo.background = Color.GREEN.toDrawable()

            }
            if (color_de_fondo.background == Color.GREEN.toDrawable()){
                color_de_fondo.background = Color.BLUE.toDrawable()
                cont = 0
            }

        }

    }
}
