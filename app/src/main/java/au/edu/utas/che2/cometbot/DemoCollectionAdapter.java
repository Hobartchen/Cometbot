package au.edu.utas.che2.cometbot;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class DemoCollectionAdapter extends FragmentStateAdapter {
    public DemoCollectionAdapter(City fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new DemoObjectFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
