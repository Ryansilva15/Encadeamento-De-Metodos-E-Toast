import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.encadeamentodemetodosetoast.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myButton: Button = findViewById(R.id.my_button)


        fun cliqueBotao(view: View){
            Toast.makeText(this,"Sucesso ao fazer algo",Toast.LENGTH_LONG).show()
        }


    }
}
