package PIA.MiniCommunity.user.domain;

import PIA.MiniCommunity.common.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import javax.persistence.*;

@Getter//Lombok에서 제공,getter란 필드값을 가공후 외부로 전달하여,객체 외부에서 객체 필드값을 사용못하게함
//public String getName(){ return name; } -> 컴파일될때 알아서 이런 형식으로 바뀌줌
@NoArgsConstructor//파라미터 없는 기본 생성자 생성 -> 없으면 오류남ㅠ
@Entity//JAP에서 관리 기본값인 클래스 이름을 사용
@Table(name="user_tbl")//엔티티와 매피할 테이블,
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Long id;

    @Column(name="user_name")
    private String name;

    @Column(name="user_password")
    private String password;

    @Column(name="user_nickname")
    private String nickname;

    @Builder
    public User(Long id, String name, String password, String nickname) {
        Assert.notNull(name,"name must not by empty");
        Assert.notNull(password,"password must not by empty");
        Assert.notNull(nickname,"nickname must not by empty");
        this.id = id;
        this.name = name;
        this.password = password;
        this.nickname = nickname;
    }

}
