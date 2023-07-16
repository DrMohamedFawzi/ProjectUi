package com.msn.projectui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {
 private var value =0
     lateinit var textValue:TextView

    lateinit var btnHide:Button
    lateinit var btnAdd:Button
    lateinit var btnGrow:Button
    lateinit var btnReset:Button
    lateinit var btnTake:Button
    lateinit var btnShirnk:Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       textValue=findViewById(R.id.textValue)
         btnAdd =findViewById(R.id.btnAdd)
         btnGrow=findViewById(R.id.btnGrow)
         btnTake=findViewById(R.id.btnTake)
         btnReset=findViewById(R.id.btnReset)
         btnShirnk=findViewById(R.id.btnShrink)
       btnHide=findViewById(R.id.btnHide)
        btnHide.setOnClickListener(this)
        textValue.setOnClickListener(this)
        btnAdd.setOnClickListener(this)
        btnGrow.setOnClickListener(this)
        btnTake.setOnClickListener(this)
        btnReset.setOnClickListener(this)
        btnShirnk.setOnClickListener(this)

    }

    override fun onClick(v:View) {

        val size:Float

        when (v.id){
            R.id.btnAdd->{
                value++
                textValue.text="$value"

            }
            R.id.btnTake->{
                value--
                textValue.text="$value"
            }
            R.id.btnReset->{
                value=0
                textValue.text="$value"
            }
            R.id.btnGrow->{
                size=textValue.scaleX
                textValue.textScaleX=size + 1
            }
            R.id.btnShrink->{
                size=textValue.textScaleX
                textValue.textScaleX=size - 1
            }


            R.id.btnHide->{
                if(textValue.visibility==View.VISIBLE) {
                    textValue.visibility=View.INVISIBLE
                    btnHide.text="Show"

                }else{
                    textValue.visibility=View.VISIBLE
                    btnHide.text="Hide"
                }
            }
        }
    }
}