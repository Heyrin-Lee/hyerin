package co.dev.service;

import java.util.List;

import co.dev.dao.MemberDAO;
import co.dev.vo.MemberVO;

//MemberDAO 정보를 가져와서 호출
public class MemberService {
	MemberDAO dao = new MemberDAO(); //db CRUD 작업
	
	public void memberDelete(String id) {
		dao.deleteMember(id);
	}
	
	public void memberUpdate(MemberVO member) {
		dao.updateMember(member);
	}
	
	public MemberVO memberSearch(String id) {
		return dao.searchMember(id);
	}
	
	public void memberInsert(MemberVO member) {
		dao.insertMember(member);
	}
	
	public List<MemberVO> memberList() {
		return dao.listMember();
	}
}
