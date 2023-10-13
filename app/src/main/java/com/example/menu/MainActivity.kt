package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.example.menu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  toolbar: ActionBar
    private lateinit var  binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val menu:Menu
        binding.bottomNavigationView.setOnClickListener{
            when(it.id){

                R.id.home -> replaceFragment(FragmentHome())

            }
        }
    }
private fun  replaceFragment(fragment: Fragment){
    val fragmentManager = supportFragmentManager
    val fragmentTransition = fragmentManager.beginTransaction()
    fragmentTransition.replace(R.id.frame_layout,fragment)
    fragmentTransition.commit()
}

}