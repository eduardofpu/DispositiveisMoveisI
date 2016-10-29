package wpattern.org.mutracksimple.packagee;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Eduardo on 02/09/2016.
 */
public class PackageeListFragment extends ListFragment {


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        ArrayList<PackageeBean> packagees = new ArrayList<>();

        packagees.add(new PackageeBean("Package 1 "  ,"BR12341ASD" ,"Gradle build"));
        packagees.add(new PackageeBean("Package 2 "  ,"BR12341AFF" ,"org.wpattern.muttrack.simple D/Atlas:"));
        packagees.add(new PackageeBean("Package 3 "  ,"xR12341AGG" ,"org.edu.com"));
        packagees.add(new PackageeBean("Package 4 "  ,"fR12341AHJ" ,"org.fpu.com"));
        packagees.add(new PackageeBean("Package 5 "  ,"HR1231AKL"  ,"org.faculdade.fpu"));
        packagees.add(new PackageeBean("Package 6 "  ,"gR12341APO" ,"org.delfino.com"));
        packagees.add(new PackageeBean("Package 7 "  ,"IR12341AFD" ,"org.filho.com"));
        packagees.add(new PackageeBean("Package 8 "  ,"KR12341AWW" ,"org.rodrigues.com"));
        packagees.add(new PackageeBean("Package 9 "  ,"YR12341AAS" ,"org.teste.com"));
        packagees.add(new PackageeBean("Package 10 " ,"WR12341AFR" ,"org.projetos.com"));
        packagees.add(new PackageeBean("Package 11 " ,"QR12341ARR" ,"org.android.com"));
        packagees.add(new PackageeBean("Package 12 " ,"ZR12341ATY" ,"org.programdor.com"));
        packagees.add(new PackageeBean("Package 13 " ,"DR12341AUI" ,"org.desenvolvimento.com"));
        packagees.add(new PackageeBean("Package 14 " ,"FF12341AOI" ,"org.java.com"));
        packagees.add(new PackageeBean("Package 15 " ,"NR12341AEI" ,"org.spring.com"));
        packagees.add(new PackageeBean("Package 16 " ,"MR12341AIW" ,"org.jsf.com"));
        packagees.add(new PackageeBean("Package 17 " ,"UR12341AQR" ,"org.jpa.com"));

        PackageeAdapter adapter = new PackageeAdapter(getActivity(),packagees);
        setListAdapter(adapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(),android.R.color.black));
        getListView().setDividerHeight(2);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);
    }


}
