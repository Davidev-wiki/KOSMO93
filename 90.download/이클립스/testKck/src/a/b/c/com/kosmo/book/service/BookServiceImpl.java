package a.b.c.com.kosmo.book.service;

import java.util.ArrayList;

import a.b.c.com.kosmo.book.dao.BookDAO;
import a.b.c.com.kosmo.book.dao.BookDAOImpl;
import a.b.c.com.kosmo.book.vo.BookVO;

public class BookServiceImpl implements BookService {

	@Override
	public ArrayList<BookVO> bookSelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BookVO> bookSelect(BookVO bvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int bookInsert(BookVO bvo) {
		// TODO Auto-generated method stub
		
		BookDAO bdao = new BookDAOImpl();
		return bdao.bookInsert(bvo);
	}

	@Override
	public int bookUpdate(BookVO bvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int bookDelete(BookVO bvo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
