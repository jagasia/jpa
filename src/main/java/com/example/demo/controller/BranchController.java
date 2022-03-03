package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Branch;
import com.example.demo.service.BranchService;

@Controller
public class BranchController {
	@Autowired
	private BranchService bs;
	
	@ModelAttribute("branches")
	public List<Branch> branches(@ModelAttribute("branch")Branch branch)
	{
		return bs.read();
	}
	

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String home()
	{
		return "branch";
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST, value="/branch", params = "insert")
	public String addBranch(@ModelAttribute("branch") Branch branch)
	{
		System.out.println("add branch method called now");
		System.out.println(branch);
		bs.create(branch);
		branches(branch);
		return "branch";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/branch", params = "update")
	public String modifyBranch(@ModelAttribute("branch") Branch branch)
	{
		bs.update(branch);
		branches(branch);
		return "branch";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/branch", params = "delete")
	public String deleteBranch(@ModelAttribute("branch") Branch branch)
	{
		bs.delete(branch.getBid());
		branches(branch);
		return "branch";
	}
}
