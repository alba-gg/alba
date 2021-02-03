package com.alba.demo.service;

import com.alba.demo.entity.Category;
import com.alba.demo.entity.Store;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Transactional
class StoreServiceTest {

    @Autowired
    EntityManager em;

    JPAQueryFactory queryFactory;

    @BeforeEach
    public void before() {
        queryFactory = new JPAQueryFactory(em);
    }

    @Test
    void contextLoads() {
        List<Store> storeList1 = new ArrayList<>();
        List<Store> storeList2 = new ArrayList<>();
        List<Store> storeList3 = new ArrayList<>();
        Category category1 = Category.builder()
                .name("요식업")
                .stores(storeList1)
                .build();

        Category category2 = Category.builder()
                .name("엔터테인")
                .stores(storeList2)
                .build();

        Category category3 = Category.builder()
                .name("스포츠")
                .stores(storeList3)
                .build();

        em.persist(category1);
        em.persist(category2);
        em.persist(category3);

    }

//    @InjectMocks
//    private StoreService storeService;
//
//    @Mock
//    private StoreRepository storeRepository;
//    @Mock
//    private UserRepository userRepository;
//    @Mock
//    private CategoryRepository categoryRepository;
//    @Mock
//    private SubwayStationRepository subwayStationRepository;
//
//
//    @BeforeEach
//    void initDateSetting() {
//

//

//
//        User user = User.builder()
//                .userId("testId")
//                .password("1234")
//                .email("test@gmail.com")
//                .name("김기동")
//                .age(22)
//                .gender(Gender.MAN)
//                .address(Address.builder()
//                        .city("서울시")
//                        .street("성북구 장위로 19길")
//                        .zipCode("12345")
//                        .build())
//                .build();
//
//        userRepository.save(user);
//
//        SubwayStation subwayStation = SubwayStation.builder()
//                .name("석계역")
//                .line("1호선")
//                .build();
//
//        subwayStationRepository.save(subwayStation);
//
//        Store store1 = Store.builder()
//                .name("김밥 천국")
//                .address(Address.builder()
//                        .city("서울시")
//                        .street("강남구 역삼로 19길")
//                        .zipCode("54321")
//                        .build())
//                .category(category1)
//                .president(user)
//                .subwayStation(subwayStation)
//                .build();
//
//        Store store2 = Store.builder()
//                .name("맥도날드")
//                .address(Address.builder()
//                        .city("서울시")
//                        .street("마포구 월드로 19길")
//                        .zipCode("54321")
//                        .build())
//                .category(category2)
//                .president(user)
//                .subwayStation(subwayStation)
//                .build();
//
//        Store store3 = Store.builder()
//                .name("VIPS")
//                .address(Address.builder()
//                        .city("서울시")
//                        .street("강북구 몰라 19길")
//                        .zipCode("54321")
//                        .build())
//                .category(category2)
//                .president(user)
//                .subwayStation(subwayStation)
//                .build();
//
//        Store store4 = Store.builder()
//                .name("이도 곰탕")
//                .address(Address.builder()
//                        .city("서울시")
//                        .street("동대문구 동대문로 19길")
//                        .zipCode("54321")
//                        .build())
//                .category(category3)
//                .president(user)
//                .subwayStation(subwayStation)
//                .build();
//
//        Store store5 = Store.builder()
//                .name("서브웨이")
//                .address(Address.builder()
//                        .city("서울시")
//                        .street("성동구 성수로 19길")
//                        .zipCode("54321")
//                        .build())
//                .category(category3)
//                .president(user)
//                .subwayStation(subwayStation)
//                .build();
//
//        storeRepository.save(store1);
//        storeRepository.save(store2);
//        storeRepository.save(store3);
//        storeRepository.save(store4);
//        storeRepository.save(store5);
//    }

}