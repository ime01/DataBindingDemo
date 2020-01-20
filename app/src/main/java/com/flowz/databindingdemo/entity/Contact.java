package com.flowz.databindingdemo.entity;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class Contact extends BaseObservable {

    public int id;
    public String name;
    public String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getEmail() {
        return email;
    }
    @Bindable
    public int getId() {
        return id;
    }

    @Bindable
    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);

    }

}
