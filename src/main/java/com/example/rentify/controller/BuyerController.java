package com.example.rentify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.rentify.model.Property;
import com.example.rentify.service.PropertyService;


@Controller
@RequestMapping("/b/properties")
public class BuyerController {
    @Autowired private PropertyService propertyService;
    @GetMapping
    public String viewProperties(@RequestParam(required = false) String location,
                                 @RequestParam(required = false) Integer bedrooms,
                                 @RequestParam(required = false) Integer bathrooms,
                                 @RequestParam(required = false) String nearby,
                                 @RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "10") int size,
                                 Model model) {
        
        Pageable pageable = PageRequest.of(page, size);
        Page<Property> properties;
        if (location != null || bedrooms != null || bathrooms != null || nearby != null) {
            
            properties = propertyService.filterProperties(location, bedrooms, bathrooms, nearby, pageable);
        } else {
            properties = propertyService.getProperties(pageable);
        }
        model.addAttribute("properties", properties.getContent());
        model.addAttribute("currentPage", properties.getNumber());
        model.addAttribute("totalPages", properties.getTotalPages());
        model.addAttribute("totalItems", properties.getTotalElements());
        return "buyer/properties";
    }
    @GetMapping("/{id}")
    public String viewPropertyDetails(@PathVariable Long id, Model model) {
        Property property = propertyService.getPropertyById(id);
        if (property != null) {
            model.addAttribute("property", property);
            return "buyer/property-details";
        }
        return "redirect:/properties";
    }
}
