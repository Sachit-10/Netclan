package com.example.netclan

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

 class viewpagerAdapter(fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager,
     BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){


     override fun getCount(): Int {
         return 3
     }

     override fun getItem(position: Int): Fragment {
         if(position==0){
             return personal_Fragment()
         }
         else if(position==1){
             return business_Fragment()
         }
         else {
             return merchant_Fragment()
         }

     }

     override fun getPageTitle(position: Int): CharSequence? {
         if(position==0){
             return "Personal"
         }
         else if(position==1){
             return "Business"
         }
         else {
             return "Merchant"
         }

     }


 }



