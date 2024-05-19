package com.example.rentify.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.rentify.model.Property;
import com.example.rentify.model.User;
import com.example.rentify.service.PropertyService;
import com.example.rentify.service.UserService;

@Controller
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;
    @Autowired private UserService userService;

    @GetMapping
    public String listProperties(@RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "10") int size, Model model) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Property> properties = propertyService.getProperties(pageable);
        model.addAttribute("properties", properties.getContent());
        model.addAttribute("properties", properties.getContent());
        model.addAttribute("currentPage", properties.getNumber());
        model.addAttribute("totalPages", properties.getTotalPages());
        model.addAttribute("totalItems", properties.getTotalElements());
        return "property/properties";
    }

    @GetMapping("/add")
    public String showAddPropertyPage(Model model) {
        model.addAttribute("property", new Property());
        return "property/add-property";
    }

    @PostMapping
    public String addProperty(@ModelAttribute Property property, Principal principal) {
        User user = userService.getUserByEmail(principal.getName());
        property.setSeller(user);
        propertyService.addProperty(property);
        return "redirect:/properties";
    }

    @GetMapping("/edit/{id}")
    public String showEditPropertyPage(@PathVariable Long id, Model model) {
        Property property = propertyService.getPropertyById(id);
        model.addAttribute("property", property);
        return "property/edit-property";
    }

    @PostMapping("/update")
    public String updateProperty(@ModelAttribute Property property, Principal principal) {
        User user = userService.getUserByEmail(principal.getName());
        property.setSeller(user);
        propertyService.updateProperty(property);
        return "redirect:/properties";
    }

    @GetMapping("/delete/{id}")
    public String deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
        return "redirect:/properties";
    }
}

