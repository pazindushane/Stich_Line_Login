package com.stichline.stichline.repo;

import com.stichline.stichline.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String> {

    User findByuserName(String userName);
}
