package com.example.fragmentsapp1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragmentsapp1.fragments.CategoryFragment
import com.example.fragmentsapp1.fragments.Fragment3
import com.example.fragmentsapp1.fragments.Fragment4
import com.example.fragmentsapp1.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var  bottomNavbar : BottomNavigationView
    private var MainActivityTag = "MENU_ITEM"


    // Este MainActivity gestiona la navegación entre fragments en la actividad principal.
    // Se inicializa el bottomNavigationBar para la navegación entre diferentes secciones de la aplicación.
    // Al hacer clic en los elementos del menú, se reemplaza el fragmento actual con el fragmento correspondiente.


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavbar = findViewById(R.id.bottom_nav_menu)
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,homeFragment).commit()

        bottomNavbar.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.home_menu -> {
                    Log.i(MainActivityTag, "Home Seleccionado")
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,homeFragment).commit()
                }
                R.id.category_menu -> {
                    Log.i(MainActivityTag, "Category Seleccionado")
                    val categoryFragment = CategoryFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, categoryFragment).commit()
                }
                R.id.setting_menu -> {
                    Log.i(MainActivityTag, "Setting Seleccionado")
                    val settingFragment = Fragment3()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, settingFragment).commit()
                }
                R.id.account_menu -> {
                    Log.i(MainActivityTag, "Account Seleccionado")
                    val accountFragment = Fragment4()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, accountFragment).commit()
                }

            }
            true

        }

    }
}