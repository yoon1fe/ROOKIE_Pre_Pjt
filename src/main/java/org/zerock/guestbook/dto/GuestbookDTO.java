package org.zerock.guestbook.dto;

/**
 * 엔티티 객체는 JPA 내에서만 사용하는 것이 좋다.
 * 따라서 영속 계층 바깥쪽에서는 DTO를 이용하자.
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GuestbookDTO {

    private Long gno;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate, modDate;
}
