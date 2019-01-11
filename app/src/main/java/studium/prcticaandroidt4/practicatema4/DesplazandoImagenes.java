package studium.prcticaandroidt4.practicatema4;



import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class DesplazandoImagenes extends FragmentActivity {
    MyPageAdapter pageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);

        List<Fragment> fragments = getFragments();

        pageAdapter = new MyPageAdapter(getSupportFragmentManager(), fragments);
        ViewPager pager = (ViewPager)findViewById(R.id.viewpager);
        pager.setAdapter(pageAdapter);
    }

    private List<Fragment> getFragments(){
        List<Fragment> fList = new ArrayList<Fragment>();

        fList.add(FragmentsDesplazandoImagenes.newInstance(R.drawable.perro));
        fList.add(FragmentsDesplazandoImagenes.newInstance(R.drawable.gato));

        return fList;
    }

    private class MyPageAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragments;
        private int[] mResources;

        public MyPageAdapter(FragmentManager fm, List<Fragment> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments.get(position);
        }

        @Override
        public int getCount() {
            return this.fragments.size();
        }
    }
}
