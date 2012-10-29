package com.source3g.wcb.entity;

import org.bson.types.ObjectId;

public abstract class AbstractEntity {
	private ObjectId id;

	public String getId() {
		if (id == null) {
			return null;
		}
		return id.toString();
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

}
