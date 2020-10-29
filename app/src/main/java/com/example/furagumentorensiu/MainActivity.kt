package com.example.furagumentorensiu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //参考はこれhttps://qiita.com/daichi77/items/09119cdba435ead4a08c
        //遷移用ボタンの取得
        val firstbutton = findViewById<Button>(R.id.firstButton)
        val secondbutton = findViewById<Button>(R.id.secondButton)
        //FirstFragmentActivityクラスをインスタンス化その下も同様。
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        //buttonをクリックしたときにreplaceFragmentメソッドを実行
        firstbutton.setOnClickListener {
            replaceFragment(firstFragment)
        }
        secondbutton.setOnClickListener {
            replaceFragment(secondFragment)
        }
    }
    //R.id.containerに引数で渡されたフラグメントを入れる。
    fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }
//        button.setOnClickListener {
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.add(R.id.fragment_layout, FirstFragment.createInstance())
//            transaction.addToBackStack(null)
//            transaction.commit()
//        }

    }
