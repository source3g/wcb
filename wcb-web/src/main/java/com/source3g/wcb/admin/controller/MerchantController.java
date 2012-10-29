package com.source3g.wcb.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.source3g.wcb.entity.merchant.Merchant;
import com.source3g.wcb.utils.ConfigParams;

@Controller
@RequestMapping("/admin/merchant")
public class MerchantController {
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView toAdd() {
		return new ModelAndView("admin/merchant/add");
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(@Valid Merchant merchant, BindingResult errorResult) {
		if (errorResult.hasErrors()) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("errors", errorResult.getAllErrors());
			return new ModelAndView("admin/merchant/add", model);
		}
		String uri = ConfigParams.getBaseUrl()+"merchant/";
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Merchant> entity = new HttpEntity<Merchant>(merchant);
		String result = restTemplate.postForObject(uri, entity, String.class);
		if ("\"success\"".equals(result)) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("success", "success");
			return new ModelAndView("admin/merchant/add", model);
		} else {
			return new ModelAndView("admin/error");
		}
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list() {
		String uri = ConfigParams.getBaseUrl()+"merchant/";
		RestTemplate restTemplate = new RestTemplate();
		Merchant[] merchants = restTemplate.getForObject(uri, Merchant[].class);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("merchants", merchants);
		return new ModelAndView("admin/merchant/list", model);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable String id) {
		String uri =  ConfigParams.getBaseUrl()+"merchant/" + id;
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(uri);
		return new ModelAndView("redirect:/admin/merchant/list.html");
	}
}
