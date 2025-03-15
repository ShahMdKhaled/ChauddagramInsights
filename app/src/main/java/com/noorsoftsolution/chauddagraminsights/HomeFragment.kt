package com.noorsoftsolution.chauddagraminsights

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView
import me.ibrahimsn.lib.SmoothBottomBar


class HomeFragment : Fragment() {

    var imageslider : ImageSlider? = null



    override fun onCreateView(inflater: LayoutInflater, container:
    ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        imageslider = view?.findViewById(R.id.imageslider)





        //slide
        val slideModels = ArrayList<SlideModel>()

        slideModels.add(SlideModel(R.drawable.ap, ScaleTypes.FIT))
        slideModels.add(SlideModel(R.drawable.logo, ScaleTypes.FIT))
        slideModels.add(SlideModel(R.drawable.logo, ScaleTypes.FIT))
        slideModels.add(SlideModel(R.drawable.logo, ScaleTypes.FIT))
        slideModels.add(SlideModel(R.drawable.logo, ScaleTypes.FIT))

        imageslider?.setImageList(slideModels, ScaleTypes.FIT)

        return view

    }



}