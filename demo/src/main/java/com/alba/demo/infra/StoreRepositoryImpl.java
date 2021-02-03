package com.alba.demo.infra;


import com.alba.demo.entity.Category;
import com.alba.demo.entity.QStore;
import com.alba.demo.entity.Store;
import com.alba.demo.repository_support.StoreRepositoryCustom;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.StringOperation;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import javax.persistence.EntityManager;
import java.util.List;

import static com.alba.demo.entity.QCategory.category;
import static com.alba.demo.entity.QStore.store;

public class StoreRepositoryImpl implements StoreRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public StoreRepositoryImpl(EntityManager em) {
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<Store> findByCategory(Long categoryId) {
        return jpaQueryFactory
                .select(store)
                .from(store)
                .leftJoin(store.category, category)
                .where(store.category.id.eq(categoryId)).fetch();
    }
}