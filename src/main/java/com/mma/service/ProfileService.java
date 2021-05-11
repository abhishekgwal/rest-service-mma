package com.mma.service;

import com.mma.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called Repository
// CRUD refers Create, Read, Update, Delete

public interface ProfileService extends CrudRepository<Profile, Integer> {
}
