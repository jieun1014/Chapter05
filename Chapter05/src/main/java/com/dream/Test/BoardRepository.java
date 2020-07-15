package com.dream.Test;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends CrudRepository<Board, Long> {
	public List<Board> findByTitle(String searchKeyword);
	public List<Board> findByContentContaining(String searchKeyword);
	public List<Board> findByTitleContainingOrContentContaining(String title, String content);
	public List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
	public Page<Board> findByTitleContaining(String serachKey, Pageable paging);
	/*
	 * @Query("SELECT b FROM Board b WHERE b.title like %?1% ORDER BY b.seq DESC")
	 * public List<Board> queryAnnotationTest1(String searchKeyword);
	 * 
	 * @Query(value = "SELECT b FROM Board b " +
	 * "WHERE b.title like %:searchKeyword% " + "ORDER BY b.seq DESC") public
	 * List<Object[]> queryAnnotationTest2(@Param("searchKeyword") String
	 * searchKeyword);
	 * 
	 * @Query(value = "select seq, title, writer, createdate" +
	 * "from board where title like '%'||?1||'%'" + "order by seq desc",
	 * nativeQuery=true) public List<Object[]> queryAnnotationTest3(String
	 * searchKeyword);
	 * 
	 * @Query("SELECT b FROM Board b ORDER BY b.seq DESC") public List<Object[]>
	 * queryAnnotationTest4(Pageable paging);
	 */
}


