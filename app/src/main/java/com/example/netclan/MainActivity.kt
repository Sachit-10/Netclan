
package com.example.netclan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.netclan.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding?=null

    var tab_layout:TabLayout?=null
    var view_pager:ViewPager?=null

    var fragmentadapter: viewpagerAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        tab_layout=binding?.tablaout
        view_pager=binding?.viewPager

        fragmentadapter=viewpagerAdapter(supportFragmentManager)

        view_pager?.adapter=fragmentadapter

        tab_layout?.setupWithViewPager(view_pager)

        binding?.llRefine?.setOnClickListener(){

            val intent = Intent(this, refineActivity::class.java)
            startActivity(intent)
        }




    }
}