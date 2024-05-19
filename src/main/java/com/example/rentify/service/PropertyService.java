package com.example.rentify.service;

import java.util.List;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.rentify.model.Property;
import com.example.rentify.repository.PropertyRepository;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public Property addProperty(Property property) {
        return propertyRepository.save(property);
    }

    public Page<Property> getProperties(Pageable pageable) {
        return propertyRepository.findAll(pageable);
    }

    public List<Property> getPropertiesBySeller(Long sellerId) {
        return propertyRepository.findBySellerId(sellerId);
    }

    public Property updateProperty(Property property) {
        return propertyRepository.save(property);
    }

    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }

    public Property getPropertyById(Long id) {
        return propertyRepository.findById(id).get();
    }

    
    public Page<Property> filterProperties(String location, Integer bedrooms, Integer bathrooms, String nearby, Pageable pageable) {
        Specification<Property> spec = (root, query, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.conjunction();
            
            if (location != null && !location.isEmpty()) {
                predicate = criteriaBuilder.and(predicate,
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("location")), "%" + location.toLowerCase() + "%"));
            }
            
            if (bedrooms != null && bedrooms > 0) {
                predicate = criteriaBuilder.and(predicate,
                    criteriaBuilder.equal(root.get("bedrooms"), bedrooms));
            }
            
            if (bathrooms != null && bathrooms > 0) {
                predicate = criteriaBuilder.and(predicate,
                    criteriaBuilder.equal(root.get("bathrooms"), bathrooms));
            }
            
            
            if (nearby != null && !nearby.isEmpty()) {
                predicate = criteriaBuilder.and(predicate,
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("location")), "%" + location.toLowerCase() + "%"));
            }
            
            return predicate;
        };
    
    
        return propertyRepository.findAll(spec, pageable);
        
    }
}

