package base;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a123456.zhonggucart.R;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {


    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = initView();
        setOnclick();
        initList();
        return v;
    }
    public abstract View initView();

    //找找控件方法
    public View f(View v,int id){
        return v.findViewById(id);
    }

    //初始化数据源
    public abstract void initList();

    //设置监听
    public abstract void setOnclick();
}
