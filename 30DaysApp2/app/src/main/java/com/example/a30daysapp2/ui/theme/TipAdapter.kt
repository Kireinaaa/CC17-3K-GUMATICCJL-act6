import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipAdapter(private val tips: List<Tip>) : RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    class TipViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tipTitle: TextView = view.findViewById(R.id.tipTitle)
        val tipDescription: TextView = view.findViewById(R.id.tipDescription)
        val imageTip: ImageView = view.findViewById(R.id.imageTip)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]
        holder.tipTitle.text = tip.title
        holder.tipDescription.text = tip.description
        holder.imageTip.setImageResource(tip.imageResId)
    }

    override fun getItemCount(): Int = tips.size
}