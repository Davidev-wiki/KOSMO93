package com.kosmo.kck.member;

import java.util.ArrayList;

public class KckMemberServiceImpl implements KckMemberService {

	@Override
	public ArrayList<KckMemberVO> kmemselectAll() {
		// TODO Auto-generated method stub
		System.out.println("KckMemberServiceImpl.kmemselectAll() ½ÇÇà");
		KckMemberDAO kdao = new KckMemberDAOImpl();
		return kdao.kmemselectAll();
	}

	@Override
	public ArrayList<KckMemberVO> kmemselect(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean kmemInsert(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kmemUpdate(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kmemDelete(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<KckMemberVO> kmemSelectName(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KckMemberVO> kmemSelectId(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean kmemIdCheck(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return false;
	}

}
