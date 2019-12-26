package com.example.board.board.service;

import com.example.board.board.entity.BoardEntity;
import com.example.board.board.entity.BoardFileEntity;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

public interface JpaBoardService {
    List<BoardEntity> selectBoardList() throws Exception;

    void saveBoard(BoardEntity board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;

    BoardEntity selectBoardDetail(int boardIdx) throws Exception;

    void deleteBoard(int boardIdx);

    BoardFileEntity selectBoardFileInformation(int boardIdx, int idx) throws Exception;
}