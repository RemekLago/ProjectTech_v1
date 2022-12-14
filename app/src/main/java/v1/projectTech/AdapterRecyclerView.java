package v1.projectTech;

import static v1.projectTech.MainActivity2.dbtest3;
import static v1.projectTech.MainActivity2.temp3;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolderRecyclerView> {

    private final RecyclerViewInterface recyclerViewInterface;

        ArrayList<ArrayList> temp3 = dbtest3.doInBackground();
    ArrayList<Integer> FinalListWithColumnsWidth = dbtest3.columnsWidth(temp3);
    ArrayList<Integer> FinalListWithColumnsAdjust = dbtest3.columnsAdjust(temp3);
    ArrayList<String> FinalListWithCellsColor = dbtest3.cellsColor(temp3);
    ArrayList<ArrayList> FinalListWithColumnsData = temp3;

    int position1;
    Context context;
    ArrayList<ArrayList> data1;
    public AdapterRecyclerView(Context context1, ArrayList<ArrayList> dataIn, RecyclerViewInterface recyclerViewInterface){
        this.context = context1;
        this.data1 = dataIn;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolderRecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.linear_layout_row2, parent, false);
        return new ViewHolderRecyclerView(view, recyclerViewInterface);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolderRecyclerView holder, int i) {

        try {
            position1 = holder.getAdapterPosition();

            Log.i("laczenie", "dana1: " + data1.get(i).get(2).toString());

            holder.textView1.setText(data1.get(i).get(0).toString());
            holder.textView2.setText(data1.get(i).get(1).toString());
            holder.textView3.setText(data1.get(i).get(2).toString());
            holder.textView4.setText(data1.get(i).get(3).toString());
            holder.textView5.setText(data1.get(i).get(4).toString());
            holder.textView6.setText(data1.get(i).get(5).toString());
            holder.textView7.setText(data1.get(i).get(6).toString());
            holder.textView8.setText(data1.get(i).get(7).toString());
            holder.textView9.setText(data1.get(i).get(8).toString());
            holder.textView10.setText(data1.get(i).get(9).toString());
            holder.textView11.setText(data1.get(i).get(10).toString());
            holder.textView12.setText(data1.get(i).get(11).toString());
            holder.textView13.setText(data1.get(i).get(12).toString());
            holder.textView14.setText(data1.get(i).get(13).toString());
            holder.textView15.setText(data1.get(i).get(14).toString());

        }
        catch(Exception e) {
            Log.i("laczenie", "exception " + e.toString());
        }


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
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        TextView textView13;
        TextView textView14;
        TextView textView15;

        public ViewHolderRecyclerView(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);


            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
            textView5 = itemView.findViewById(R.id.textView5);
            textView6 = itemView.findViewById(R.id.textView6);
            textView7 = itemView.findViewById(R.id.textView7);
            textView8 = itemView.findViewById(R.id.textView8);
            textView8 = itemView.findViewById(R.id.textView9);
            textView8 = itemView.findViewById(R.id.textView10);
            textView8 = itemView.findViewById(R.id.textView11);
            textView8 = itemView.findViewById(R.id.textView12);
            textView8 = itemView.findViewById(R.id.textView13);
            textView8 = itemView.findViewById(R.id.textView14);
            textView8 = itemView.findViewById(R.id.textView15);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recyclerViewInterface != null) {
                        int position = getAdapterPosition();

                        if (position != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(position);
                        }
                    }
                }
            });

            try {
                int i = position1 +1;
                Log.i("laczenie", "position3: " + i);
                textView1.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                Log.i("laczenie", "position3a: " + (data1.get(i).get(0).toString()));
                textView2.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView3.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView4.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView5.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView6.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView7.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView8.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView9.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView10.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView11.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView12.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView13.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView14.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));
                textView14.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString())));

//                for (int j = 0; j < FinalListWithColumnsAdjust.size(); j++) {
//                    Log.i("adjust", "adjust1: " + FinalListWithColumnsAdjust.get(j).toString());
//                    Log.i("adjust", "adjust2: " + (data1.get(j).get(0).toString()));
//                }

            }catch(Exception e){
                Log.i("laczenie", "exception " + e.toString());
            }

            try {
////                ViewGroup.LayoutParams params1 = textView1.getLayoutParams();
//            ViewGroup.LayoutParams params2 = textView2.getLayoutParams();
//            ViewGroup.LayoutParams params3 = textView3.getLayoutParams();
//            ViewGroup.LayoutParams params4 = textView4.getLayoutParams();
//            ViewGroup.LayoutParams params5 = textView5.getLayoutParams();
//            ViewGroup.LayoutParams params6 = textView6.getLayoutParams();
//            ViewGroup.LayoutParams params7 = textView7.getLayoutParams();
//            ViewGroup.LayoutParams params8 = textView8.getLayoutParams();
//            ViewGroup.LayoutParams params9 = textView9.getLayoutParams();
//            ViewGroup.LayoutParams params10 = textView10.getLayoutParams();
//            ViewGroup.LayoutParams params11 = textView11.getLayoutParams();
//            ViewGroup.LayoutParams params12 = textView12.getLayoutParams();
//            ViewGroup.LayoutParams params13 = textView13.getLayoutParams();
//            ViewGroup.LayoutParams params14 = textView14.getLayoutParams();
//            ViewGroup.LayoutParams params15 = textView15.getLayoutParams();
////            params1.width = FinalListWithColumnsWidth.get(0);
//            params2.width = FinalListWithColumnsWidth.get(1);
//            Log.i("szerokosc", "szeroko????1 " + FinalListWithColumnsWidth.get(1));
//            params3.width = FinalListWithColumnsWidth.get(2);
//            Log.i("szerokosc", "szeroko????1 " + FinalListWithColumnsWidth.get(2));
//            params4.width = FinalListWithColumnsWidth.get(3);
//            Log.i("szerokosc", "szeroko????1 " + FinalListWithColumnsWidth.get(3));
//            params5.width = FinalListWithColumnsWidth.get(4);
//            params6.width = FinalListWithColumnsWidth.get(5);
//            params7.width = FinalListWithColumnsWidth.get(6);
//            params8.width = FinalListWithColumnsWidth.get(7);
//            params9.width = FinalListWithColumnsWidth.get(8);
//            params10.width = FinalListWithColumnsWidth.get(9);
//            params11.width = FinalListWithColumnsWidth.get(10);
//            params12.width = 0;
//            params13.width = 0;
//            params14.width = 0;
//            params15.width = FinalListWithColumnsWidth.get(14);
////            textView1.setLayoutParams(params1);
//            textView2.setLayoutParams(params2);
//            textView3.setLayoutParams(params3);
//            textView4.setLayoutParams(params4);
//            textView5.setLayoutParams(params5);
//            textView6.setLayoutParams(params6);
//            textView7.setLayoutParams(params7);
//            textView8.setLayoutParams(params8);
//            textView9.setLayoutParams(params9);
//            textView10.setLayoutParams(params10);
//            textView11.setLayoutParams(params11);
//            textView12.setLayoutParams(params12);
//            textView13.setLayoutParams(params13);
//            textView14.setLayoutParams(params14);
//            textView15.setLayoutParams(params15);


                textView2.setGravity(Gravity.CENTER);
                Log.i("laczenie", "gravity2: " + FinalListWithColumnsAdjust.get(1));
                textView3.setGravity(Gravity.CENTER);
                Log.i("laczenie", "gravity2: " + FinalListWithColumnsAdjust.get(2));
                textView4.setGravity(FinalListWithColumnsAdjust.get(3));
                Log.i("laczenie", "gravity2: " + FinalListWithColumnsAdjust.get(3));
                textView5.setGravity(FinalListWithColumnsAdjust.get(4));
                textView6.setGravity(FinalListWithColumnsAdjust.get(5));
                textView7.setGravity(FinalListWithColumnsAdjust.get(6));
                textView8.setGravity(FinalListWithColumnsAdjust.get(7));
                textView9.setGravity(FinalListWithColumnsAdjust.get(8));
                textView10.setGravity(FinalListWithColumnsAdjust.get(9));
                textView11.setGravity(FinalListWithColumnsAdjust.get(10));
                textView12.setGravity(FinalListWithColumnsAdjust.get(11));
                textView13.setGravity(FinalListWithColumnsAdjust.get(12));
                textView14.setGravity(FinalListWithColumnsAdjust.get(13));
                textView15.setGravity(FinalListWithColumnsAdjust.get(14));

            }catch(Exception e){
                Log.i("laczenie", "exception " + e.toString());
            }

        }

    }

//    public void setCellsAdjustment() {
//        try {
//            textView2.setGravity(FinalListWithColumnsAdjust.get(1));
//            textView3.setGravity(FinalListWithColumnsAdjust.get(2));
//            textView4.setGravity(FinalListWithColumnsAdjust.get(3));
//            textView5.setGravity(FinalListWithColumnsAdjust.get(4));
//            textView6.setGravity(FinalListWithColumnsAdjust.get(5));
//            textView7.setGravity(FinalListWithColumnsAdjust.get(6));
//            textView8.setGravity(FinalListWithColumnsAdjust.get(7));
//            textView9.setGravity(FinalListWithColumnsAdjust.get(8));
//            textView10.setGravity(FinalListWithColumnsAdjust.get(9));
//            textView11.setGravity(FinalListWithColumnsAdjust.get(10));
//            textView12.setGravity(FinalListWithColumnsAdjust.get(11));
//            textView13.setGravity(FinalListWithColumnsAdjust.get(12));
//            textView14.setGravity(FinalListWithColumnsAdjust.get(13));
//            textView15.setGravity(FinalListWithColumnsAdjust.get(14));
//        } catch(Exception e){
//            Log.i("laczenie", "exception " + e.toString());
//        }
//    }

//    @NonNull
//    public void setCellWith(View itemView) {
//        try {
//            ViewGroup.LayoutParams params1 = textView1.getLayoutParams();
//            ViewGroup.LayoutParams params2 = textView2.getLayoutParams();
//            ViewGroup.LayoutParams params3 = textView3.getLayoutParams();
//            ViewGroup.LayoutParams params4 = textView4.getLayoutParams();
//            ViewGroup.LayoutParams params5 = textView5.getLayoutParams();
//            ViewGroup.LayoutParams params6 = textView6.getLayoutParams();
//            ViewGroup.LayoutParams params7 = textView7.getLayoutParams();
//            ViewGroup.LayoutParams params8 = textView8.getLayoutParams();
//            ViewGroup.LayoutParams params9 = textView9.getLayoutParams();
//            ViewGroup.LayoutParams params10 = textView10.getLayoutParams();
//            ViewGroup.LayoutParams params11 = textView11.getLayoutParams();
//            ViewGroup.LayoutParams params12 = textView12.getLayoutParams();
//            ViewGroup.LayoutParams params13 = textView13.getLayoutParams();
//            ViewGroup.LayoutParams params14 = textView14.getLayoutParams();
//            ViewGroup.LayoutParams params15 = textView15.getLayoutParams();
////            params1.width = FinalListWithColumnsWidth.get(0);
//            params2.width = FinalListWithColumnsWidth.get(1);
//            Log.i("szerokosc", "szeroko????1 " + FinalListWithColumnsWidth.get(1));
//            params3.width = FinalListWithColumnsWidth.get(2);
//            Log.i("szerokosc", "szeroko????1 " + FinalListWithColumnsWidth.get(2));
//            params4.width = FinalListWithColumnsWidth.get(3);
//            Log.i("szerokosc", "szeroko????1 " + FinalListWithColumnsWidth.get(3));
//            params5.width = FinalListWithColumnsWidth.get(4);
//            params6.width = FinalListWithColumnsWidth.get(5);
//            params7.width = FinalListWithColumnsWidth.get(6);
//            params8.width = FinalListWithColumnsWidth.get(7);
//            params9.width = FinalListWithColumnsWidth.get(8);
//            params10.width = FinalListWithColumnsWidth.get(9);
//            params11.width = FinalListWithColumnsWidth.get(10);
//            params12.width = FinalListWithColumnsWidth.get(11);
//            params13.width = FinalListWithColumnsWidth.get(12);
//            params14.width = FinalListWithColumnsWidth.get(13);
//            params15.width = FinalListWithColumnsWidth.get(14);
////            textView1.setLayoutParams(params1);
//            textView2.setLayoutParams(params2);
//            textView3.setLayoutParams(params3);
//            textView4.setLayoutParams(params4);
//            textView5.setLayoutParams(params5);
//            textView6.setLayoutParams(params6);
//            textView7.setLayoutParams(params7);
//            textView8.setLayoutParams(params8);
//            textView9.setLayoutParams(params9);
//            textView10.setLayoutParams(params10);
//            textView11.setLayoutParams(params11);
//            textView12.setLayoutParams(params12);
//            textView13.setLayoutParams(params13);
//            textView14.setLayoutParams(params14);
//            textView15.setLayoutParams(params15);
//        } catch(Exception e){
//            Log.i("laczenie", "exception " + e.toString());
//        }
//    }
//
//    public void setCellsColor(){
//        try {
////            textView1.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(5)));
//            textView2.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString()));
//            textView3.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView4.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString()));
//            textView5.setBackgroundColor(Color.parseColor((data1.get(i).get(0).toString()));
//            textView6.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView7.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView8.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView9.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView10.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView11.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView12.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView13.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView14.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//            textView14.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(1)));
//        } catch(Exception e){
//            Log.i("laczenie", "exception " + e.toString());
//        }
//    }
}