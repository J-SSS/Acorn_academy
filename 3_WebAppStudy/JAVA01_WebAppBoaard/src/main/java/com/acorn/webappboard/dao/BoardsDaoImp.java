package com.acorn.webappboard.dao;

import com.acorn.webappboard.Vo.PageVo;
import com.acorn.webappboard.dto.BoardsDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardsDaoImp implements BoardsDao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public BoardsDaoImp(Connection conn) {
        this.conn = conn;
    }

    public int countAll() throws Exception {
        int cnt = 0;
        String sql = "select * from boards";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        if(rs.next()){
            while (rs.next()){
               cnt++;
            }
        }
        return cnt;
    }
    @Override
    public List<BoardsDto> findAll() throws Exception {
        List<BoardsDto> boards = new ArrayList<>();
        String sql = "select * from boards";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        if(rs.next()){
            while (rs.next()){
                boards.add(parseBoardDto(rs));
            }
        }
        return boards;
    }

    @Override
    public List<BoardsDto> findBySearchAndPaging(PageVo pageVo) throws Exception {
//        int cnt = countAll();
//        pageVo = new PageVo(countAll(),);
        List<BoardsDto> boards = new ArrayList<>();
        String sql = "select * from boards LIMIT ?,?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, pageVo.getOffSet());
        pstmt.setInt(2, pageVo.getRowLength());
        rs = pstmt.executeQuery();
        if(rs.next()){
            while (rs.next()){
                boards.add(parseBoardDto(rs));
            }
        }
        return boards;
    }

    @Override
    public BoardsDto findByBId(int bId) throws Exception {
        BoardsDto board = null;
        String sql = "select * from boards where b_id =?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, bId);
        rs = pstmt.executeQuery();
        if(rs.next()){
           board = parseBoardDto(rs);
        }
        return board;
    }

    @Override
    public int save(BoardsDto board) throws Exception {
        int save = 0;
        String sql = "insert into boards(u_id,status,title,content) values(?,?,?,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, board.getUId());
        pstmt.setString(2, board.getStatus());
        pstmt.setString(3, board.getTitle());
        pstmt.setString(4, board.getContent());
        save = pstmt.executeUpdate();
        return save;
    }

    @Override
    public int updateByPk(BoardsDto board) throws Exception {
        int update = 0;

        String sql = "update boards set u_id =?,status =?,title =?,content =? where b_id =?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, board.getUId());
        pstmt.setString(2, board.getStatus());
        pstmt.setString(3, board.getTitle());
        pstmt.setString(4, board.getContent());
        pstmt.setInt(5, board.getBId());
        update = pstmt.executeUpdate();
        return update;
    }

    @Override
    public int deleteByPk(int bId) throws Exception {
        int delete = 0;
        String sql = "delete from boards where b_id =?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, bId);
        delete = pstmt.executeUpdate();
        return delete;
    }
    public BoardsDto parseBoardDto(ResultSet rs) throws Exception {
        BoardsDto board = new BoardsDto();
        board.setBId(rs.getInt("b_id"));
        board.setUId(rs.getString("u_id"));
        board.setPostTime(rs.getTimestamp("post_time"));
        board.setUpdateTime(rs.getTimestamp("update_time"));
        board.setStatus(rs.getString("status"));
        board.setTitle(rs.getString("title"));
        board.setContent(rs.getString("content"));
        board.setViewCount(rs.getInt("view_count"));
        return board;
    }
}
