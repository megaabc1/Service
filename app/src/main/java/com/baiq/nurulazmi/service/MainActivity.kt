package com.baiq.nurulazmi.service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //tombol fb
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fb.com/"))
            startActivity(i)
        })
        //tombol ig
        btn_instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/"))
            startActivity(i)
        })
        //tombol twitter
        btn_twitter.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/"))
            startActivity(i)
        })

        //deklarasi variable mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.uu)
        //btn play
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }
        //btnpause
        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        //stop
        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
