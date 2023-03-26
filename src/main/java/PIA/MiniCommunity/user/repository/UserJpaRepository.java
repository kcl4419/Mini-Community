package PIA.MiniCommunity.user.repository;

import PIA.MiniCommunity.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository는 엔티티에 의해 생성된 db에 접근하는 메소드들을 사용하기 위한 것
//엔티티에서 db 구조를 만들면 , 레포지토리에서 값을 넣고, 조회하는 등 CRUD를 어떻게 할지 정의
//@Repository JpaRepository를 사용하면 어노테이션을 추가하지 않아 된다. 쯘다
public interface UserJpaRepository extends JpaRepository<User, Long> {
    /*JpaRepositroy를 상속받으면 기본동작가능, <대상으로 지정할 엔티티, 해당 엔티티의 PK타입>
    이렇게 상속을 받으면 save(), findALL(), get()등을 사용할 수 있다.
    상속만 받으면 끝남..쩐당..

    jpa는 쿼리를 간단하게 표현해준다.
    1) findll() - db전체 값을 list로 불러올때
    2) findOne() - primary key로 값으 1건 조회할때
    3) findByXX() - SQL Where 절로 XX부분은 Entity의이름을 붙인다. () 안에는 검색조건
    Long id 이런식으로 적는다
    */


}
