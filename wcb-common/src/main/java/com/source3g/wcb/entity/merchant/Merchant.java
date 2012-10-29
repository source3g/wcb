package com.source3g.wcb.entity.merchant;

import org.hibernate.validator.constraints.NotEmpty;

import com.source3g.wcb.entity.AbstractEntity;

public class Merchant extends AbstractEntity{
	@NotEmpty(message="name can not be null")
	private String name;
	@NotEmpty(message="addr can not be null")
	private String addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
