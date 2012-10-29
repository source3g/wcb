package com.source3g.wcb.merchant.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.source3g.wcb.entity.merchant.Merchant;

@Service
public class MerchantServiceImpl implements MerchantService {
	@Autowired
	private MongoTemplate mongoTemplate;
	private String collectionName="source3g.wcb.merchant";
	@Override
	public void add(Merchant merchant) {
		merchant.setId(ObjectId.get());
		mongoTemplate.insert(merchant, collectionName);
		
	}

	@Override
	public List<Merchant> list() {
		List<Merchant> list= mongoTemplate.findAll(Merchant.class,collectionName);
		return list;
	}

	@Override
	public void delete(String id) {
		ObjectId objId=new ObjectId(id);
		mongoTemplate.remove(
				new Query(
		                    Criteria.where("_id").is(objId)
		                ), collectionName
		          );
	}
	
}
