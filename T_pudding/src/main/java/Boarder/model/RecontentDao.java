package Boarder.model;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myRecontentDao")
public class RecontentDao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	String namespace="Boarder.model.Recontent";
	
	public void insertBoard(Recontent recontent) {
		sqlSessionTemplate.insert(namespace+".InsertRecontent", recontent);
	}
	public List<Recontent> getRecontentList() {
		List<Recontent> recontent = new ArrayList<Recontent>();
		recontent = sqlSessionTemplate.selectList(namespace+".SelectRecontent");
		return recontent;    
	}
}
