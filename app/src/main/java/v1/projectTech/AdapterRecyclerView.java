package v1.projectTech;

import static v1.projectTech.MainActivity2.temp3;

import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolderRecyclerView> {

    Context context;
    ArrayList<ArrayList> data1;
    public AdapterRecyclerView(Context context1, ArrayList<ArrayList> dataIn){
        context = context1;
        data1 = dataIn;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolderRecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.linear_layout_row2, parent, false);
        return new ViewHolderRecyclerView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolderRecyclerView holder, int position) {
        Log.i("laczenie", "dana1: " + data1.get(position).get(1).toString());
        holder.textView1.setText(data1.get(position).get(0).toString());
        holder.textView2.setText(data1.get(position).get(1).toString());
        holder.textView3.setText(data1.get(position).get(2).toString());
        holder.textView4.setText(data1.get(position).get(3).toString());
//        holder.textView5.setText(data1.get(position).get(4).toString());
//        holder.textView6.setText(data1.get(position).get(5).toString());
//        holder.textView7.setText(data1.get(position).get(6).toString());
//        holder.textView8.setText(data1.get(position).get(7).toString());
//        holder.textView9.setText(data1.get(position).get(8).toString());
//        holder.textView10.setText(data1.get(position).get(9).toString());
//        holder.textView11.setText(data1.get(position).get(10).toString());
//        holder.textView12.setText(data1.get(position).get(11).toString());
//        holder.textView13.setText(data1.get(position).get(12).toString());
//        holder.textView14.setText(data1.get(position).get(13).toString());
//        holder.textView15.setText(data1.get(position).get(14).toString());
    }

    @Override
    public int getItemCount() {
        return data1.size();
    }

    public class ViewHolderRecyclerView extends RecyclerView.ViewHolder{

        TextView textView1;
        TextView textView2;
        TextView textView3;
        TextView textView4;
//        TextView textView5;
//        TextView textView6;
//        TextView textView7;
//        TextView textView8;
//        TextView textView9;
//        TextView textView10;
//        TextView textView11;
//        TextView textView12;
//        TextView textView13;
//        TextView textView14;
//        TextView textView15;

        public ViewHolderRecyclerView(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
//            textView5 = itemView.findViewById(R.id.textView5);
//            textView6 = itemView.findViewById(R.id.textView6);
//            textView7 = itemView.findViewById(R.id.textView7);
//            textView8 = itemView.findViewById(R.id.textView8);
//            textView8 = itemView.findViewById(R.id.textView9);
//            textView8 = itemView.findViewById(R.id.textView10);
//            textView8 = itemView.findViewById(R.id.textView11);
//            textView8 = itemView.findViewById(R.id.textView12);
//            textView8 = itemView.findViewById(R.id.textView13);
//            textView8 = itemView.findViewById(R.id.textView14);
//            textView8 = itemView.findViewById(R.id.textView15);

        }
    }


}
