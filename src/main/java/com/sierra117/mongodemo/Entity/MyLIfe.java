package com.sierra117.mongodemo.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class MyLIfe {
    @Id
    private ObjectId id;
    private String name;
    private Integer roll;
}
