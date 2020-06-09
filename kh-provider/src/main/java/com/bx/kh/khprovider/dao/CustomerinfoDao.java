package com.bx.kh.khprovider.dao;

import com.bx.entity.Customerinfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerinfoDao {


     int addinfo(Customerinfo customerinfo);
}
