package com.terminalmock.test.repositories.specifications;

import com.terminalmock.test.entities.entity.PersonInfo;
import org.springframework.data.jpa.domain.Specification;
import com.terminalmock.test.model.comparison.SearchElement;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Path;


public class SearchPersonInfoSpecification {
    private enum Operations{
        EQUAL,
        LIKE,
        BETWEEN,
        GREATER,
        LESS,
        START,
        IN
    }

    public static Specification<PersonInfo> whereAndStart(){
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.and();
    }

    public static Specification<PersonInfo> addSearchElement(final SearchElement searchElement){

        return (Specification<PersonInfo>) (root, criteriaQuery, criteriaBuilder) -> {

            Expression path;
            Operations curOperation;

            if ("".equals(searchElement.getParentPropertyName())){
                path    = root.get(searchElement.getPropertyName());
            }else{
                path    = root.get(searchElement.getParentPropertyName()).get(searchElement.getPropertyName());
            }

            curOperation = Operations.values()[searchElement.getOperation()-1];

            switch (curOperation){
                case EQUAL:
                    return criteriaBuilder.equal(path,searchElement.getComparisonValue1());
                case LIKE:
                    return criteriaBuilder.like(path,"%" + searchElement.getComparisonValue1().toString() + "%");
                case BETWEEN:
                    return criteriaBuilder.between(path, searchElement.getComparisonValue1(), searchElement.getComparisonValue2());
                case GREATER:
                    return criteriaBuilder.greaterThanOrEqualTo(path,searchElement.getComparisonValue1());
                case LESS:
                    return criteriaBuilder.lessThanOrEqualTo(path,searchElement.getComparisonValue1());
                case START:
                    return criteriaBuilder.like(path, searchElement.getComparisonValue1().toString() + "%");
                case IN:
                    if (searchElement.getListOfValues() != null && searchElement.getListOfValues().size()>0){
                        final Path<Object> type = root.<Object> get(searchElement.getPropertyName());
                        return type.in(searchElement.getListOfValues());
                    }else{
                        return criteriaBuilder.isNull(path);
                    }

                default:
                    return criteriaBuilder.and();
            }
        };
    }

    public static Specification<PersonInfo> addIsNULL(final SearchElement searchElement){

        return (Specification<PersonInfo>) (root, criteriaQuery, criteriaBuilder) -> {

            Expression path;

            if ("".equals(searchElement.getParentPropertyName())){
                path    = root.get(searchElement.getPropertyName());
            }else{
                path    = root.get(searchElement.getParentPropertyName()).get(searchElement.getPropertyName());
            }

            return criteriaBuilder.isNull(path);


        };
    }


}
