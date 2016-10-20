 package io.salon.web;

 import java.util.List;
 import io.salon.domain.Addon;
 import io.salon.repositories.AddonRepository;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.HttpStatus;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.bind.annotation.RestController;


 @RestController
 public final class AddonsController {

     private final AddonRepository addonRepository;

     @Autowired
     AddonsController(AddonRepository addonRepository) {
         this.addonRepository = addonRepository;
     }

     @RequestMapping(method = RequestMethod.GET, value = "/addons/{addon_id}")
     ResponseEntity<Addon> findByAddonId(@PathVariable String addonId) {
         Addon addon = addonRepository.findByAddonId(addonId);

         if (addon == null) {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         } else {
             return new ResponseEntity<>(addon, HttpStatus.OK);
         }
     }

     @RequestMapping(method = RequestMethod.GET, value = "/addons/name/{name}")
     ResponseEntity<Addon> findAllByName(@PathVariable String name) {
         Addon addon = addonRepository.findByName(name);

         if (addon == null) {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         } else {
             return new ResponseEntity<>(addon, HttpStatus.OK);
         }
     }

     @RequestMapping(method = RequestMethod.GET, value = "/addons")
     ResponseEntity<List<Addon>> findAll() {
         List<Addon> addons = addonRepository.findAll();

         if (addons.size() == 0) {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         } else {
             return new ResponseEntity<>(addons, HttpStatus.OK);
         }
     }


 }
