package com.sierra117.mongodemo.Service;

import com.sierra117.mongodemo.Entity.MyLIfe;
import com.sierra117.mongodemo.Repo.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {

    @Autowired
    private MongoRepo mongoRepo;

    public MyLIfe saveData(MyLIfe myLIfe) {

        return mongoRepo.save(myLIfe);
    }
}
