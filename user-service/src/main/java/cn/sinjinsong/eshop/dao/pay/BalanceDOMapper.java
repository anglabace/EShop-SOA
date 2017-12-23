package cn.sinjinsong.eshop.dao.pay;

import cn.sinjinsong.eshop.common.domain.entity.pay.BalanceDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BalanceDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance
     *
     * @mbggenerated
     */
    int insert(BalanceDO record);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance
     *
     * @mbggenerated
     */
    BalanceDO selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table balance
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BalanceDO record);
    

    int updateBalanceMVCC(BalanceDO record);
}