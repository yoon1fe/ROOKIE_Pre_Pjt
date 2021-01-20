package org.zerock.guestbook.service;

/**
 * GuestbookDTO를 이용해서 필요한 내용을 전달받고 반환하도록 처리
 */

import org.zerock.guestbook.dto.GuestbookDTO;
import org.zerock.guestbook.dto.PageRequestDTO;
import org.zerock.guestbook.dto.PageResultDTO;
import org.zerock.guestbook.entity.Guestbook;

public interface GuestbookService {

    // 새로운 방명록 등록
    Long register(GuestbookDTO dto);

    // 방명록 조회
    GuestbookDTO read(Long gno);

    // PageRequestDTO 를  파라미터로 받아 PageResultDTO 를 리턴
    PageResultDTO<GuestbookDTO, Guestbook> getList(PageRequestDTO requestDTO);

    // 방명록 삭제
    void remove(Long gno);

    // 방명록 수정
    void modify(GuestbookDTO dto);

    // DTO를 Entity로 변환하는 default method
    default Guestbook dtoToEntity(GuestbookDTO dto) {
        Guestbook entity = Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();

        return entity;
    }

    // Entity를 DTO로 변환하는 default method
    default GuestbookDTO entityToDto(Guestbook entity) {
        GuestbookDTO dto = GuestbookDTO.builder()
                .gno(entity.getGno())
                .title(entity.getTitle())
                .content(entity.getContent())
                .writer(entity.getWriter())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();

        return dto;
    }


}
