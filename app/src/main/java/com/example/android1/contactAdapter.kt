package com.example.android1

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.list_item.view.*
import org.w3c.dom.Text
import java.nio.file.Files.size
import android.widget.Toast.makeText

class contactAdapter(private val JsonList:ArrayList<list_item>):
        RecyclerView.Adapter<contactAdapter.ViewHolder>(){

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var name = itemView.findViewById<TextView>(R.id.tv_name)
        var number = itemView.findViewById<TextView>(R.id.tv_number)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactAdapter.ViewHolder {
            val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
            return contactAdapter.ViewHolder(inflatedView).apply {
                /*val curPos: Int = adapterPosition
                var item: list_item = JsonList.get(curPos)
                Toast.makeText(parent.context, "clicked ${item.name}\n ${item.number}", Toast.LENGTH_SHORT).show()*/
            }
        }


    override fun getItemCount(): Int {
       return JsonList.size
    }

    override fun onBindViewHolder(holder: contactAdapter.ViewHolder, position: Int) { //class ViewHolder을 연결
        holder.name.setText((JsonList.get(position).name))
        holder.number.setText((JsonList.get(position).number))
    }

}