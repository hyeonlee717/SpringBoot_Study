package com.apple.shop.Item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/list")
    String listPage(Model model) {
        List<Item> result = itemService.findAllItems();
        model.addAttribute("items", result);
        return "list.html";
    }

    @GetMapping("/write")
    String writePage() {
        return "write.html";
    }

    @PostMapping("/add")
    String addItem(String title, Integer price) {
        itemService.saveItem(title, price);
        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")
    String detailPage(@PathVariable Long id, Model model) {
        Item result = itemService.findById(id);
        if (result != null) {
            model.addAttribute("data", result);
            return "detail.html";
        } else {
            return "redirect:/list";
        }
    }

    @GetMapping("/edit/{id}")
    String editPage(@PathVariable Long id, Model model) {
        Item result = itemService.findById(id);
        if (result != null) {
            model.addAttribute("data", result);
            return "edit.html";
        } else {
            return "redirect:/list";
        }
    }

    @PostMapping("/edit")
    String editItem(Long id, String title, Integer price) {
        itemService.editItem(id, title, price);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    String deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
        return "redirect:/list";
    }
}
