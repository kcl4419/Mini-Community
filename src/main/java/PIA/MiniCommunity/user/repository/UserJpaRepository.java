package PIA.MiniCommunity.user.repository;

import PIA.MiniCommunity.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository는 엔티티에 의해 생성된 db에 접근하는 메소드들을 사용하기 위한 것
//엔티티에서 db 구조를 만들면 , 레포지토리에서 값을 넣고, 조회하는 등 CRUD를 어떻게 할지 정의
@Repository
public interface UserJpaRepository extends JpaRepository<User, Long> {
    // JpaRepositroy를 상속받으면 기본동작가능, <대상으로 지정할 엔티티, 해당 엔티티의 PK타입>
    //이렇게 상속을 받으면 save(), findALL(), get()등을 사용할 수 있다.
    //상속만 받으면 끝남..쩐당..

}
