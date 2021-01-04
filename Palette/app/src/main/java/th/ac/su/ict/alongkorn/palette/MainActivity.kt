package th.ac.su.ict.alongkorn.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ResultShow = findViewById<TextView>(R.id.result)
        val ButtonColor1 = findViewById<Button>(R.id.button1)
        val ButtonColor2 = findViewById<Button>(R.id.button2)
        val ButtonColor3 = findViewById<Button>(R.id.button3)
        val ButtonColor4 = findViewById<Button>(R.id.button4)
        val ButtonColor5 = findViewById<Button>(R.id.button5)
        val ButtonColor6 = findViewById<Button>(R.id.button6)

        ButtonColor1.setOnClickListener(){
            ResultShow.text = "235-255-221"
            ResultShow.setBackgroundColor(Color.parseColor("#e9e2de"))

        }
        ButtonColor2.setOnClickListener(){
            ResultShow.text = "233-255-221"
            ResultShow.setBackgroundColor(Color.parseColor("#e7cdcb"))
        }
        ButtonColor3.setOnClickListener(){
            ResultShow.text = "235-255-221"
            ResultShow.setBackgroundColor(Color.parseColor("#78839a"))
        }
        ButtonColor4.setOnClickListener(){
            ResultShow.text = "235-255-221"
            ResultShow.setBackgroundColor(Color.parseColor("#9da9be"))
        }
        ButtonColor5.setOnClickListener(){
            ResultShow.text = "235-255-221"
            ResultShow.setBackgroundColor(Color.parseColor("#c6cbd4"))
        }
        ButtonColor6.setOnClickListener(){
            ResultShow.text = "235-255-221"
            ResultShow.setBackgroundColor(Color.parseColor("#dfe2e5"))
        }
    }

}