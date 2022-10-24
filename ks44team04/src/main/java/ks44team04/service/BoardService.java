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
	
	//게시물 등록
	public int boardAdd(Board board) {
		int result = boardMapper.boardAdd(board);
		return result;
	}
	
	//게시물 코드 증가
	public String getBoardNewCode() {
		String boardNewCode = boardMapper.getBoardNewCode();
		return boardNewCode;
	}
	
	//게시물 상세정보 조회 (유저)
	public Board boardByCode(String boardCode) {
		Board board = boardMapper.boardByCode(boardCode);
		return board;
	}
	
	//게시물 조회시 조회수 증가
	public void viewCount(String boardCode) {
		boardMapper.viewCount(boardCode);
	}
	
	//댓글 등록
	public int commentAdd(BoardComment boardComment) {
		int result = boardMapper.commentAdd(boardComment);
		return result;
	}
	
	//댓글 코드 증가
	public String getCommentNewCode() {
		String commentNewCode = boardMapper.getCommentNewCode();
		return commentNewCode;
	}
	
	//게시물 수정
	public int boardModify(Board board) {
		int result = boardMapper.boardModify(board);
		return result;
	}
	
	//게시물 삭제 (delete_yn 컬럼 n -> y 업데이트 쿼리)
	public void boardRemoveByCode(String boardCode) {
		boardMapper.boardRemoveByCode(boardCode);
	}
	
	//게시물 목록 조회(딜리트 n인 것만)
	public List<Board> BoardListUser(String boardCategory) {
		List<Board> BoardListUser = boardMapper.BoardListUser(boardCategory);
		return BoardListUser;
	}
	
	
	
	
	
	/* 좋아요 */
	
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
