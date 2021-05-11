package com.rubbypaper.board.service;

import org.springframework.data.domain.Page;

import com.rubbypaper.board.domain.Board;
import com.rubbypaper.board.domain.Search;

public interface BoardService {

	void insertBoard(Board board);
	
	void updateBoard(Board board);
	
	void deleteBoard(Board board);
	
	Board getBoard(Board board);
	
	Page<Board> getBoardList(Search search);
}
