package ks44team04.service;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ks44team04.mapper.BoardMapper;
import ks44team04.dto.Board;
import ks44team04.dto.BoardComment;
import ks44team04.dto.BoardLike;


@Service
@Transactional
public class BoardService {
	
	//의존성 주입
    private final BoardMapper boardMapper;
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	@PostConstruct
	public void boardServiceInit() {
	}
	
	//게시물 좋아요 내역
	public List<BoardLike> getBoardLikeList() {
		List<BoardLike> boardLikeList = boardMapper.getBoardLikeList();
		return boardLikeList;
	}
		
	//게시물 댓글 조회
	public List<BoardComment> getBoardCommentList() {
		List<BoardComment> boardCommentList = boardMapper.getBoardCommentList();
		return boardCommentList;
	}
		
	//게시판 목록 조회
	public List<Board> getBoardList() {
		List<Board> boardList = boardMapper.getBoardList();
		return boardList;
	}
}
