package com.huang.trade.goods.service;

import com.huang.trade.goods.db.model.Goods;

public interface GoodsService {
    /**
     * 插入一个商品
     *
     * @param goods
     * @return
     */
    boolean insertGoods(Goods goods);

    /**
     * 查询商品信息
     *
     * @param id
     * @return
     */
    Goods queryGoodsById(long id);
}
