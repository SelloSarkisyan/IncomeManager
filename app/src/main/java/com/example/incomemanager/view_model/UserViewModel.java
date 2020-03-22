package com.example.incomemanager.view_model;

import android.content.Context;

import com.example.incomemanager.View.Adapter.RecyclerAdapter;
import com.example.incomemanager.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.library.baseAdapters.BR;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewModel extends BaseObservable {
    ArrayList<UserViewModel>myArrayList=new ArrayList<>();
    @Bindable
    public ArrayList<UserViewModel> getMyArrayList() {
        return myArrayList;
    }
  @Bindable
    public void setMyArrayList(ArrayList<UserViewModel> myArrayList) {
        this.myArrayList = myArrayList;
        notifyPropertyChanged(BR.myArrayList);
    }

    BigDecimal amount;
    String title;
    Boolean type;
    Context context;

    @BindingAdapter({"recyclerUser"})
    public static void recyclerViewBinder(final RecyclerView recyclerView, final ArrayList<UserViewModel> myArrayList) {

        RecyclerAdapter userAdapter = new RecyclerAdapter(myArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(userAdapter);
    }

    public UserViewModel(User user) {
     this.amount=user.getAmount();
     this.title=user.getTitle();
     this.type=user.getType();
    }
    @Bindable
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Bindable
    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public UserViewModel(Context context) {
        this.context = context;
    }
}
