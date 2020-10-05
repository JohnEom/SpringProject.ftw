package com.ftw.weekly.mapper;

import java.util.List;

import com.ftw.weekly.vo.WeeklyVO;

import net.webjjang.util.PageObject;

public interface WeeklyMapper {

	//1. list - 전체 데이터 구하기(페이지 처리)
	public List<WeeklyVO> list(PageObject pageObject);
	public Integer getRow(PageObject pageObject);
	//2. view - 조회수 1증가
	public WeeklyVO view(int no);
	public void increase(int no);
	//3. write
	public void write(WeeklyVO vo);
	//4. update
	public void update(WeeklyVO vo);
	//5. delete - no, pw
	public void delete(WeeklyVO vo);
	
}
