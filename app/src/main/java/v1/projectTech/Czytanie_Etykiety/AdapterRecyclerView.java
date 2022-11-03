package v1.projectTech.Czytanie_Etykiety;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import v1.projectTech.Pobieranie_danych_z_bazy.RecyclerViewInterface;
import v1.projectTech.R;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolderRecyclerView> {

    private final RecyclerViewInterface recyclerViewInterface;

    int position1;
    Context context;
    ArrayList<ArrayList<String>> database;
    public AdapterRecyclerView(Context context1, ArrayList<ArrayList<String>> dataIn, RecyclerViewInterface recyclerViewInterface){
        this.context = context1;
        this.database = dataIn;
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
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolderRecyclerView holder, int position) {

    }

    @Override
    public int getItemCount() {
        return database.size();
    }


    public class ViewHolderRecyclerView extends RecyclerView.ViewHolder {

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
        }
    }
}
