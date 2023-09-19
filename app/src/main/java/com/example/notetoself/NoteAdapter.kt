package com.example.notetoself
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NoteAdapter ( private val mainActivity: MainActivity,
                    private  val noteList: List<Note>)
    : RecyclerView.Adapter<NoteAdapter.ListItemHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {
       val itemView = layoutInflater.from(parent.context).inflate(R.layout.listitem,parent,false)
        return ListItemHolder(itemView)

    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {
      val note = noteList[position]
        holder.title.text = note.title
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


   inner class ListItemHolder(view: View):
   RecyclerView.ViewHolder(view),
   View.OnClickListener{
       init {

       }

       override fun onClick(v: View?) {
           TODO("Not yet implemented")
       }


    }
}

private fun Any.inflate(listitem: Int, parent: ViewGroup, b: Boolean): View {

    return TODO("Provide the return value")
}

object layoutInflater {
    fun from(context: Context?): Any {
        TODO("Not yet implemented")
    }

    object from {

    }

}
