package com.example.projectweek2.service;

import com.example.projectweek2.modle.Merchant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MerchantService {
    private static ArrayList<Merchant> merchantArrayList = new ArrayList<>();

    public static ArrayList getMerchant() {
        return merchantArrayList;
    }

    public static void addMerchant(Merchant merchant) {
        merchantArrayList.add(merchant);
    }

    public static void updateMerchant(int index, Merchant merchant) {
        merchantArrayList.set(index, merchant);
    }

    public static void delMerchant(int index) {
        merchantArrayList.remove(index);
    }
}