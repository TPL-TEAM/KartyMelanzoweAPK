package pl.jdteam.kartymelanzowe

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import pl.jdteam.kartymelanzowe.databinding.ActivityUzytkownicyBinding

class UzytkownicyAc : ComponentActivity() {
    private lateinit var binding: ActivityUzytkownicyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUzytkownicyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.start.setOnClickListener() {
            val dzikie_karty_switch = binding.switch1.isChecked
            val startgra = Intent(applicationContext, GameplayAc::class.java)
            startgra.putExtra("DZIKIE_KARTY", dzikie_karty_switch)
            startActivity(startgra)
        }
    }
}