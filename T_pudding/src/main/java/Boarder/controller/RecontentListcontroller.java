package Boarder.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Boarder.model.Recontent;
import Boarder.model.RecontentDao;

@Controller
public class RecontentListcontroller {

	final String command="/recontentList.bd";
	final String getPage="boarder_contentForm";
	
	@Autowired
	RecontentDao recontentDao;
	
	@RequestMapping(command)
	public ModelAndView doAction(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();  
		List<Recontent> recontent = recontentDao.getRecontentList();
		
		mav.addObject("recontent",recontent);
		mav.setViewName(getPage);
		
		return mav;
	}
	


}
