package com.example.incomemanager.model;

import android.content.Context;

import com.orm.SugarRecord;

import java.math.BigDecimal;

import androidx.databinding.Bindable;

public class User extends SugarRecord {
    BigDecimal amount;
    String title;
    Boolean type;
    Context context;

    public User(BigDecimal amount, String title, Boolean type) {
        this.amount = amount;
        this.title = title;
        this.type = type;
    }
    @Bindable
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }
}

