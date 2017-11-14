package com.trendyol.repository;

import com.trendyol.entity.Property;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by cihanozdemir on 13.11.2017.
 */
@Repository
public interface PropertyRepository extends MongoRepository<Property, ObjectId>
{
}
