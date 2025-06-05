package com.javaex.ex04;

import java.util.List;

public class AuthorApp {

	public static void main(String[] args) {
	
		AuthorDAO authorDAO = new AuthorDAO();
		
		//int c01 = authorDAO.authorInsert("하하", "런닝맨");
		
		int c02 = authorDAO.authorUpdate(14, "양세찬", "런닝맨");

		//int c03 = authorDAO.authorDelete(2);
		
		//List<AuthorVO> authorList = authorDAO.authorSelect();
		
		
		
		
	}

}
