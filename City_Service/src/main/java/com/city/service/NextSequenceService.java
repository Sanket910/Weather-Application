package com.city.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.stereotype.Service;

import com.city.model.CitySequence;

@Service
public class NextSequenceService {

	@Autowired
	private MongoOperations mongo;

	/**
	 * This method returns the sequence id to save city in database Same as auto increment id
	 * 
	 * @param seqName
	 * @return {@link Long}
	 */
	public Long getNextSequence(String seqName) {
		
		CitySequence counter = mongo.findAndModify(query(where("_id").is(seqName)), new Update().inc("seq", 1),
				options().returnNew(true).upsert(true), CitySequence.class);
		return counter.getSeq();
	}

}
