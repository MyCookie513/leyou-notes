package com.leyou.repository;

import com.leyou.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Author: taft
 * @Date: 2018-8-28 18:35
 */
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {

    List<Item> findByPriceBetween(double price1, double price2);
}
