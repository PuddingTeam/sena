package Boarder.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Boarder.model.Recontent;
import Boarder.model.RecontentDao;

@Controller
public class RecontentInsert {
	final String command = "/recontentinsert.bd";
	final String getPage = "boarder_contentForm";
	final String gotoPage = "redirect:/recontentlist.bd";
	
	@Autowired
	RecontentDao recontentDao;
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView doAction(Recontent recontent,
			HttpServletRequest request) {
		System.out.println(recontent.getRecontent_boardno());
		ModelAndView mav = new ModelAndView();
		recontentDao.insertBoard(recontent);
		mav.setViewName(getPage);
		return mav;
	}
	
}
