package com.example.netclan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SeekBar
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import com.example.netclan.databinding.ActivityRefineBinding

class refineActivity : AppCompatActivity() {

    var binding: ActivityRefineBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRefineBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbar)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);


        binding?.toolbar?.setNavigationOnClickListener(){
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

        var options = arrayOf(
            "Available | Hey Let Us Connect", "Away | Stay Discreet And Watch",
            "Busy | Do Not Disturb | Will Catch Up Later", "SOS | Emergency! Need Assistance! Help"
        )


        val arrayAdapter = ArrayAdapter(this, R.layout.list_item, options)

        binding?.autoCompleteTv?.setAdapter(arrayAdapter)


    }
}




