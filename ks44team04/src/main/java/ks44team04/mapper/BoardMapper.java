package ks44team04.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import ks44team04.dto.Board;
import ks44team04.dto.BoardComment;
import ks44team04.dto.BoardLike;

@Mapper
public interface BoardMapper {

	// 좋아요 조회
	public List<BoardLike> getBoardLikeList();

	// 게시물 댓글 조회
	public List<BoardComment> getBoardCommentList();

	// 게시판 목록 조회
	public List<Board> getBoardList();
}