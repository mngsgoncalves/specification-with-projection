package th.co.geniustree.springdata.jpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.query.JpaEntityGraph;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by pramoth on 9/29/2016 AD.
 */
@NoRepositoryBean
public interface JpaSpecificationExecutorWithProjection<T> {

    <R> Optional<R> findOne(Specification<T> spec, Class<R> projectionClass);

    <R> Page<R> findAll(Specification<T> spec, Class<R> projectionClass, Pageable pageable);

    <R> Page<R> findFirstPage(Specification<T> spec, Class<R> projectionClass, Pageable pageable);

    <R> Page<R> findAll(Specification<T> spec, Class<R> projectionType, String namedEntityGraph, EntityGraph.EntityGraphType type, Pageable pageable);

    <R> Page<R> findAll(Specification<T> spec, Class<R> projectionClass, JpaEntityGraph dynamicEntityGraph, Pageable pageable);
}
