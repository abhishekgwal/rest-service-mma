package com.mma.controller;

import com.mma.exception.ProfileNotFoundException;
import com.mma.model.Profile;
import com.mma.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("mma")
public class Controller {

    @Autowired
    private ProfileService profileService;

    // Get all profiles
    @GetMapping("/profiles")
    public @ResponseBody Iterable<Profile> getAllProfiles() {
        return profileService.findAll();
    }

    // Get Single Profile by id
    @GetMapping("/profiles/{id}")
    public Optional<Profile> getProfileById(@PathVariable(value = "id") Integer id) {
        return profileService.findById(id);
    }

    // Add Profile
    @PostMapping("/addProfile")
    public String addFighters(@RequestBody Profile profile) {
        profileService.save(profile);
        return "Created Profile Id "+profile.getId().toString();
    }

    // Delete Profile by id
    @DeleteMapping("/profiles/{id}")
    public String deleteProfile(@PathVariable Integer id) throws ProfileNotFoundException {
        profileService.deleteById(id);
        return "Deleted Profile Id "+id;
    }
}
