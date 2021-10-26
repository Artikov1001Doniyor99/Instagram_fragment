package com.artikov.modul_5_lesson_6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.next_to_secondActivity

class MainActivity : AppCompatActivity() {


    var a = true
    var b = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fourFragment = FourFragment()
        val firstFragment = FirstFragment()


            supportFragmentManager.beginTransaction().add(R.id.container, firstFragment).commit()
        a = false
        b = true

            lock_id.isVisible = false
            android.isVisible = false
            bottom_icon.isVisible = false
            menu_icon.isVisible = false

            val threeFragment = ThreeFragment()
            supportFragmentManager.beginTransaction().add(R.id.activity_two_c, threeFragment)
                .commit()

            next_to_secondActivity.setOnClickListener {

                if(!a && b){
                    supportFragmentManager.beginTransaction().remove(firstFragment).commit()
                    supportFragmentManager.beginTransaction().add(R.id.container, fourFragment)
                        .commit()

                    activity_two_c.isVisible = false

                    lock_id.isVisible = true
                    android.isVisible = true
                    bottom_icon.isVisible = true
                    menu_icon.isVisible = true

                    instagram_icon.isVisible = false
                    id_instagram.isVisible = false
                    igtv.isVisible = false
                    pilot.isVisible = false

                    home_black.isVisible = false
                    home_white.isVisible = true

                    a = true
                    b = false

                }
            }

        home_white.setOnClickListener {




            if(a && !b){
                supportFragmentManager.beginTransaction().remove(fourFragment).commit()

                supportFragmentManager.beginTransaction().add(R.id.container, firstFragment)
                    .commit()


                activity_two_c.isVisible = true

                lock_id.isVisible = false
                android.isVisible = false
                bottom_icon.isVisible = false
                menu_icon.isVisible = false

                instagram_icon.isVisible = true
                id_instagram.isVisible = true
                igtv.isVisible = true
                pilot.isVisible = true

                home_black.isVisible = true
                home_white.isVisible = false
                a = false
                b = true
            }
        }

        id_instagram.setOnClickListener {
            Toast.makeText(this, "Artikov Doniyor Xo'jamurodovich", Toast.LENGTH_SHORT).show()
        }

    }
//Bitta activty da bo'lyabdi,bundagi lycycle lar ishlamayadi



}