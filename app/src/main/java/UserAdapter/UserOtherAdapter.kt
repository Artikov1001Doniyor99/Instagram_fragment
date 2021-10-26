package UserAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.artikov.modul_5_lesson_6_2.FirstFragment
import com.artikov.modul_5_lesson_6_2.R
import kotlinx.android.synthetic.main.item_user.view.*
import models.User

class UserOtherAdapter(var context: FirstFragment, var userList: List<User>):RecyclerView.Adapter<UserOtherAdapter.Vh>() {



    inner class Vh(itemView: View):RecyclerView.ViewHolder(itemView){

        fun onBind(user: User){
            user.image_one?.let { itemView.image_one.setImageResource(it) }
            user.image_two?.let { itemView.image_two.setImageResource(it) }
            itemView.txt_one.text = user.text_one
            itemView.txt_two.text = user.text_two
            itemView.txt_three.text = user.text_three
            itemView.txt_four.text = user.text_four
            itemView.txt_five.text = user.text_five
            itemView.txt_six.text = user.text_six


/*            itemView.animation = AnimationUtils.loadAnimation(context,R.anim.anim4)*/

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int  = userList.size

}