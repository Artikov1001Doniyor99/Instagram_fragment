package UserAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.artikov.modul_5_lesson_6_2.R
import com.artikov.modul_5_lesson_6_2.ThreeFragment
import kotlinx.android.synthetic.main.item_user_one.view.*
import models.User_one


class UserOtherAdapterOne(var context: ThreeFragment, var userListOne: List<User_one>): RecyclerView.Adapter<UserOtherAdapterOne.Vh>() {



    inner class Vh(itemView: View): RecyclerView.ViewHolder(itemView){

        fun onBind(user: User_one){
            user.image_one?.let { itemView.tv_one.setImageResource(it) }
            itemView.tv_two.text = user.name_one


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_user_one,parent,false))
    }

    override fun getItemCount(): Int  = userListOne.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(userListOne[position])
    }

}