package com.example.feelings

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.transformation.ExpandableTransformationBehavior
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {

    private var mood:Int = 0 //0 = neutral,1 = happy, -1 = sad

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        buttonSave.setOnClickListener {
            saveFeeling()
        }

        imageViewHappy.setOnClickListener {
            mood = 1
            //it.background.setColorFilter()//set color
        }

        imageViewNeutral.setOnClickListener {
            mood = 0
            //it.background
        }

        imageViewSad.setOnClickListener {
            mood = -1
            //set color
        }
    }

    private fun saveFeeling(){
        val intent = Intent()
        intent.putExtra(EXTRA_MOOD,mood)
        intent.putExtra(EXTRA_REMARK,editTextRemark.text.toString())
        setResult(Activity.RESULT_OK,intent)
        finish()
    }

    companion object{
        const val EXTRA_MOOD = "com.example.feelings.MOOD"
        const val EXTRA_REMARK = "com.example.feelings.REMARK"
    }




}
