package com.source3g.wcb.merchant.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.source3g.wcb.constants.ReturnConstants;
import com.source3g.wcb.entity.merchant.Merchant;
import com.source3g.wcb.merchant.service.MerchantService;

@Controller
@RequestMapping("/merchant/**")
public class MerchantApi {
	
	private Logger logger=LoggerFactory.getLogger(MerchantApi.class);
	
	@Autowired
	private MerchantService merchantService;

	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String add( @RequestBody Merchant merchant){
		logger.debug("add merchant....");
		merchantService.add(merchant);
		return ReturnConstants.SUCCESS;
	}
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<Merchant> list(){
		logger.debug("list merchant....");
		return merchantService.list();
	}
	
	@RequestMapping(value="{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public String delete(@PathVariable String id){
		logger.debug("delete merchant....");
		 merchantService.delete(id);
		 return ReturnConstants.SUCCESS;
	}
	
}
