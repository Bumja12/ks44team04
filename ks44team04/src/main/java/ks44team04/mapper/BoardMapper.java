package ks44team04.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Board;
import ks44team04.dto.BoardComment;
import ks44team04.dto.BoardLike;

@Mapper
public interface BoardMapper {

	// 게시판 목록 조회
	public List<Board> getBoardList();
	
	// 게시물 검색
	public List<Board> getBoardListSearch(Map<String, Object> searchMap);
	
	// 게시물 좋아요 조회
	public List<BoardLike> getBoardLikeList();
	
	// 게시물 좋아요 검색
	public List<BoardLike> getBoardLikeListSearch(Map<String, Object> searchMap);

	// 게시물 댓글 조회
	public List<BoardComment> getBoardCommentList();
	
	// 게시물 댓글 검색
	public List<BoardComment> getBoardCommentListSearch(Map<String, Object> searchMap);

}