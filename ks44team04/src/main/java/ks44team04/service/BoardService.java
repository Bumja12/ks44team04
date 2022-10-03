package ks44team04.service;
import java.util.List;
import java.util.Map;
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
	
	//게시판 목록 조회
	public List<Board> getBoardList() {
		List<Board> boardList = boardMapper.getBoardList();
		return boardList;
	}
	
	//게시물 검색
	public List<Board> getBoardListSearch(Map<String, Object> paramMap) {
		List<Board> boardList = boardMapper.getBoardListSearch(paramMap);
		return boardList;
	}
	
	//게시물 좋아요 조회
	public List<BoardLike> getBoardLikeList() {
		List<BoardLike> boardLikeList = boardMapper.getBoardLikeList();
		return boardLikeList;
	}
	
	//게시물 좋아요 검색
	public List<BoardLike> getBoardLikeListSearch(Map<String, Object> paramMap) {
		List<BoardLike> boardLikeList = boardMapper.getBoardLikeListSearch(paramMap);
		return boardLikeList;
	}
		
	//게시물 댓글 조회
	public List<BoardComment> getBoardCommentList() {
		List<BoardComment> boardCommentList = boardMapper.getBoardCommentList();
		return boardCommentList;
	}
	
	//게시물 댓글 검색
	public List<BoardComment> getBoardCommentListSearch(Map<String, Object> paramMap) {
		List<BoardComment> boardCommentList = boardMapper.getBoardCommentListSearch(paramMap);
		return boardCommentList;
	}
}
