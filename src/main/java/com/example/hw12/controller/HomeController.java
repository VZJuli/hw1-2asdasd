package com.example.hw12.controller;

import com.example.hw12.DBManager;
import com.example.hw12.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Item> arrayList = DBManager.getDbManager();
        model.addAttribute("testov", arrayList);
        return "computer";
    }
}
