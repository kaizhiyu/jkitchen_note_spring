package com.sauzny.springmvc.dao.mapper;

import com.sauzny.springmvc.entity.pojo.Ssq;
import com.sauzny.springmvc.entity.pojo.SsqExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SsqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    long countByExample(SsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    int deleteByExample(SsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    @Delete({
        "delete from ssq",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    @Insert({
        "insert into ssq (id, qihao, ",
        "riqi, shunxu1, shunxu2, ",
        "shunxu3, shunxu4, ",
        "shunxu5, shunxu6, ",
        "lan)",
        "values (#{id,jdbcType=INTEGER}, #{qihao,jdbcType=INTEGER}, ",
        "#{riqi,jdbcType=DATE}, #{shunxu1,jdbcType=INTEGER}, #{shunxu2,jdbcType=INTEGER}, ",
        "#{shunxu3,jdbcType=INTEGER}, #{shunxu4,jdbcType=INTEGER}, ",
        "#{shunxu5,jdbcType=INTEGER}, #{shunxu6,jdbcType=INTEGER}, ",
        "#{lan,jdbcType=INTEGER})"
    })
    int insert(Ssq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    int insertSelective(Ssq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    List<Ssq> selectByExample(SsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    @Select({
        "select",
        "id, qihao, riqi, shunxu1, shunxu2, shunxu3, shunxu4, shunxu5, shunxu6, lan",
        "from ssq",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.sauzny.springmvc.dao.mapper.SsqMapper.BaseResultMap")
    Ssq selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    int updateByExampleSelective(@Param("record") Ssq record, @Param("example") SsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    int updateByExample(@Param("record") Ssq record, @Param("example") SsqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    int updateByPrimaryKeySelective(Ssq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ssq
     *
     * @mbg.generated Fri Sep 01 17:11:42 CST 2017
     */
    @Update({
        "update ssq",
        "set qihao = #{qihao,jdbcType=INTEGER},",
          "riqi = #{riqi,jdbcType=DATE},",
          "shunxu1 = #{shunxu1,jdbcType=INTEGER},",
          "shunxu2 = #{shunxu2,jdbcType=INTEGER},",
          "shunxu3 = #{shunxu3,jdbcType=INTEGER},",
          "shunxu4 = #{shunxu4,jdbcType=INTEGER},",
          "shunxu5 = #{shunxu5,jdbcType=INTEGER},",
          "shunxu6 = #{shunxu6,jdbcType=INTEGER},",
          "lan = #{lan,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Ssq record);
}