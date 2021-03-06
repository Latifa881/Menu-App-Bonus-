package com.example.menuappbonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.Help -> {
                val intent= Intent(this,HelpActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.Home -> {
                val intent= Intent(this,HomeActivity::class.java)
                startActivity(intent)
                return true
            }
            R.id.About -> {
                val intent= Intent(this,AboutActivity::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}