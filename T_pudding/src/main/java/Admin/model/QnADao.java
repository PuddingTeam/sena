package Admin.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component("myQnADao")
public class QnADao {
	private String namespace = "Admin.model.QnA";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int getTotalCount(Map<String,String> map){
		int cnt = sqlSessionTemplate.selectOne(namespace+".GetTotalCount",map);
		return cnt;
	}
	public int deleteData(int qna_no) {
		int cnt  = sqlSessionTemplate.delete(namespace+".deletedata",qna_no);
		return cnt;
	}
	
	public List<QnA> getDataList(){
		List<QnA> lists = new ArrayList<QnA>();
		lists = sqlSessionTemplate.selectList(namespace+".GetDataList");
		return lists;
	}
	public Notice getOneData(int noticeno){
		Notice notice=new Notice();
		notice = sqlSessionTemplate.selectOne(namespace+".getOneData",noticeno);
		return notice;
	}
	
	public int insertData(QnA qna) {
		int cnt =sqlSessionTemplate.insert(namespace+".insertdata",qna);
		return cnt;
	}
	
	public void addCount(int noticeno) {
		sqlSessionTemplate.update(namespace+".addCount",noticeno);
	}
	
}
