package com.sierra117.mongodemo.Repo;

import com.sierra117.mongodemo.Entity.MyLIfe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<MyLIfe ,Integer> {
}
