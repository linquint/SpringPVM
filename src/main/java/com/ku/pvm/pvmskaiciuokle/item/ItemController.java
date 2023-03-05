package com.ku.pvm.pvmskaiciuokle.item;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {
    @GetMapping("/")
    public String home(Model model) {
        return "add";
    }

    @PostMapping("/")
    public String addItem(
            @RequestParam("name") String name,
            @RequestParam("price") Double price,
            @RequestParam("amount") Integer amount,
            Model model
    ) {
        model.addAttribute("item", new Item(name, price, amount));
        return "pvm";
    }
}
