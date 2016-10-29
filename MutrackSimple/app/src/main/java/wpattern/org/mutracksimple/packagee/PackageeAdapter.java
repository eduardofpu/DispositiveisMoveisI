package wpattern.org.mutracksimple.packagee;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import wpattern.org.mutracksimple.R;

/**
 * Created by Eduardo on 02/09/2016.
 */
public class PackageeAdapter extends ArrayAdapter<PackageeBean> {

    public PackageeAdapter(Context context, ArrayList<PackageeBean>packagees){
        super(context , 0 , packagees);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        final PackageeBean packagee = getItem(position);


        if(convertView == null){

            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.package_row_fragment,parent,false);
        }

        TextView nameTextView = (TextView) convertView.findViewById(R.id.namePackageRow);
        TextView codeTextView = (TextView) convertView.findViewById(R.id.codePackageRow);

        nameTextView.setText(packagee.getName());
        codeTextView.setText(packagee.getCode());


        FloatingActionButton fab = (FloatingActionButton)convertView.findViewById(R.id.buttonDelete);

        View.OnClickListener fabAction = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view,"Deleted"+packagee.getName(),
                          Snackbar.LENGTH_LONG);

                View.OnClickListener snackbarAction = new View.OnClickListener(){
                    @Override
                    public void  onClick(View view){

                        Snackbar.make(view,"code:"+packagee.getCode(),Snackbar.LENGTH_LONG).show();
                    }
                };

                snackbar.setAction("code",snackbarAction).show();

            }
        };

           fab.setOnClickListener(fabAction);

        return convertView;
    }



}
