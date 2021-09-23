package a.b.c.com.kosmo.book.service;

import java.util.ArrayList;

import a.b.c.com.kosmo.book.dao.BookDAO;
import a.b.c.com.kosmo.book.dao.BookDAOImpl;
import a.b.c.com.kosmo.book.vo.BookVO;

public class BookServiceImpl implements BookService {

	@Override
	public ArrayList<BookVO> bookSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("BookServiceImpl.bookSelectAll() ����");
		BookDAO bdao = new BookDAOImpl();
		System.out.println("BookServiceImpl.bookSelectAll() ����");
		return bdao.bookSelectAll();
	}

	@Override
	public ArrayList<BookVO> bookSelect(BookVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BookServiceImpl.bookSelect() ����");
		BookDAO bdao = new BookDAOImpl();
		System.out.println("BookServiceImpl.bookSelect() ����");
		return bdao.bookSelect(bvo);
	}

	@Override
	public int bookInsert(BookVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BookServiceImpl.bookInsert() ����");
		BookDAO bdao = new BookDAOImpl();
		System.out.println("BookServiceImpl.bookInsert() ����");
		return bdao.bookInsert(bvo);
	}

	@Override
	public int bookUpdate(BookVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BookServiceImpl.bookUpdate() ����");
		BookDAO bdao = new BookDAOImpl();
		System.out.println("BookServiceImpl.bookUpdate() ����");
		return bdao.bookUpdate(bvo);
	}

	@Override
	public int bookDelete(BookVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BookServiceImpl.bookDelete() ����");
		BookDAO bdao = new BookDAOImpl();
		System.out.println("BookServiceImpl.bookDelete() ����");
		return bdao.bookDelete(bvo);
	}

}
