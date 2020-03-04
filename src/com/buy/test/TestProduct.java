package com.buy.test;

import com.buy.dao.product.IProductDao;
import com.buy.dao.product.ProductImpl;
import com.buy.utils.ProductParams;
import org.junit.Test;

public class TestProduct {

    @Test
    public void aa(){
        IProductDao productDao=new ProductImpl();
        ProductParams params=new ProductParams();
       /* params.setStartIndex(0);
        params.setPageSize(5);*/
       params.setSort("name");
        System.out.println(productDao.queryProductList(params).size());
    }

    @Test
    public void nn(){
        IProductDao productDao=new ProductImpl();
        ProductParams params=new ProductParams();
       /* params.setStartIndex(0);
        params.setPageSize(5);*/
        params.setSort("name");
        System.out.println(productDao.queryProductCount(params));
    }
}
