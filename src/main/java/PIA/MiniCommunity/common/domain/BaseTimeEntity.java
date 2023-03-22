package PIA.MiniCommunity.common.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass //baseEntity를 상속한 엔티티들은 아래 필드들을 컬럼으로 인식
@EntityListeners(AuditingEntityListener.class)//Auditing(자동 값 매핑)기능
public abstract class BaseTimeEntity {

    @CreatedDate//Entity가 최초로 생성, 저장 될때의 시간 자동 저장
    private LocalDateTime createdTime;

    @LastModifiedDate//조회한 Entity의 값을 변경할때 시간 자동 저
    private LocalDateTime lastModifiedTime;
}
