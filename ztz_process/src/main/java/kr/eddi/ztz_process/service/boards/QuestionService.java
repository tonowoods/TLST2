package kr.eddi.ztz_process.service.boards;

import kr.eddi.ztz_process.controller.boards.BoardsRequest;
import kr.eddi.ztz_process.entity.boards.QuestionBoard;

import java.util.List;

public interface QuestionService {
    // 질문게시판 리스트 UI
    public List<QuestionBoard> questionList();
     // 질문게시판 조회(읽기)
    public QuestionBoard questionRead(Long questionNo);
//     // 질문게시판 게시물 등록
//    public void questionRegister(BoardsRequest boardsRequest);
//     //질문게시판 게시물 수정
//    public void questionModify(QuestionBoard questionBoard);
//    // 질문게시판 게시물 삭제
//    public void questionRemove(Long questionNo);
}
