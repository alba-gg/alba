package com.alba.demo.infra;


import com.alba.demo.entity.Category;
import com.alba.demo.entity.Store;
import com.alba.demo.repository_support.StoreRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

import static com.alba.demo.entity.QCategory.category;
import static com.alba.demo.entity.QStore.store;

public class StoreRepositoryImpl extends QuerydslRepositorySupport implements StoreRepositoryCustom {

    private JPAQueryFactory jpaQueryFactory;

    public StoreRepositoryImpl() {
        super(Store.class);
    }

    @Override
    public List<Store> findByCategory(Long categoryId) {
        Category category1 = jpaQueryFactory.selectFrom(category)
                .where(category.id.eq(categoryId))
                .fetchOne();

        return jpaQueryFactory.selectFrom(store)
                .where(store.category.eq(category1))
//                .where(QStore.store.category.eq(Category.builder().name(category).build()))
                .fetch();
    }
}