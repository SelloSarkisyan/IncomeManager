package com.example.incomemanager.View.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.incomemanager.R;
import com.example.incomemanager.view_model.UserViewModel;
import com.example.incomemanager.databinding.ItemUserBinding;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myHolder> {
    public RecyclerAdapter(ArrayList<UserViewModel> arrayList) {
        this.arrayList = arrayList;
    }

    LayoutInflater inflater;
ArrayList<UserViewModel> arrayList=new ArrayList<>();

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater=LayoutInflater.from(parent.getContext());
        ItemUserBinding itemUserBinding= DataBindingUtil.inflate(inflater,R.layout.item,parent,false);
        return new myHolder(itemUserBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder holder, int position) {
     UserViewModel userViewModel=arrayList.get(position);
     holder.bind(userViewModel);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class myHolder extends RecyclerView.ViewHolder{
       private ItemUserBinding itemUserBinding;

        public myHolder( ItemUserBinding itemUserBinding) {
            super(itemUserBinding.getRoot());
            this.itemUserBinding=itemUserBinding;
        }
        void bind(UserViewModel userViewModel){
            this.itemUserBinding.setItem(userViewModel);
            this.itemUserBinding.executePendingBindings();
        }
    }
}
