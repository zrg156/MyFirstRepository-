package com.test.ssm.mapper;

import com.test.ssm.pojo.Order;
import com.test.ssm.pojo.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

<<<<<<< HEAD
    int deleteByPrimaryKey(String id);

=======
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

<<<<<<< HEAD
    Order selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
=======
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);
>>>>>>> 801bf36b6f521930cd2e4be05c30078d1378f728
}