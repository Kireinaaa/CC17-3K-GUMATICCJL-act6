import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var tipAdapter: TipAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val tips = listOf(
            Tip("Rose Care", "Roses need plenty of sunlight and well-drained soil.", R.drawable.rose),
            Tip("Tulip Tips", "Plant tulips in the fall for spring blooms.", R.drawable.tulip)
            Tip("Sunflower", R.drawable.sunflower)
        )

        tipAdapter = TipAdapter(tips)
        recyclerView.adapter = tipAdapter
    }
}