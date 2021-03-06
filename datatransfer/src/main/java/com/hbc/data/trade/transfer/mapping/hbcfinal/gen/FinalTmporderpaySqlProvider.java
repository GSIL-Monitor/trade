package com.hbc.data.trade.transfer.mapping.hbcfinal.gen;

import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalTmporderpay;
import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalTmporderpayCriteria.Criteria;
import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalTmporderpayCriteria.Criterion;
import com.hbc.data.trade.transfer.mapping.hbcfinal.gen.bean.FinalTmporderpayCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FinalTmporderpaySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `tmporderpay`
     *
     * @mbggenerated
     */
    public String countByExample(FinalTmporderpayCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`tmporderpay`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `tmporderpay`
     *
     * @mbggenerated
     */
    public String deleteByExample(FinalTmporderpayCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`tmporderpay`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `tmporderpay`
     *
     * @mbggenerated
     */
    public String insertSelective(FinalTmporderpay record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`tmporderpay`");
        
        if (record.getOrderid() != null) {
            sql.VALUES("orderId", "#{orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderprice() != null) {
            sql.VALUES("orderPrice", "#{orderprice,jdbcType=INTEGER}");
        }
        
        if (record.getAgentprice() != null) {
            sql.VALUES("agentPrice", "#{agentprice,jdbcType=INTEGER}");
        }
        
        if (record.getCouponprice() != null) {
            sql.VALUES("couponPrice", "#{couponprice,jdbcType=INTEGER}");
        }
        
        if (record.getDiffprice() != null) {
            sql.VALUES("diffPrice", "#{diffprice,jdbcType=INTEGER}");
        }
        
        if (record.getRefundprice() != null) {
            sql.VALUES("refundPrice", "#{refundprice,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `tmporderpay`
     *
     * @mbggenerated
     */
    public String selectByExample(FinalTmporderpayCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("orderId");
        } else {
            sql.SELECT("orderId");
        }
        sql.SELECT("orderPrice");
        sql.SELECT("agentPrice");
        sql.SELECT("couponPrice");
        sql.SELECT("diffPrice");
        sql.SELECT("refundPrice");
        sql.SELECT("updated_at");
        sql.SELECT("created_at");
        sql.FROM("`tmporderpay`");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
         String sqlStr = sql.toString();
        if(example.getPage()!=null){
            sqlStr = sqlStr+" limit "+example.getPage().getOffset()+","+example.getPage().getLimit()+"";
             }
            return sqlStr;
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `tmporderpay`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        FinalTmporderpay record = (FinalTmporderpay) parameter.get("record");
        FinalTmporderpayCriteria example = (FinalTmporderpayCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`tmporderpay`");
        
        if (record.getOrderid() != null) {
            sql.SET("orderId = #{record.orderid,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderprice() != null) {
            sql.SET("orderPrice = #{record.orderprice,jdbcType=INTEGER}");
        }
        
        if (record.getAgentprice() != null) {
            sql.SET("agentPrice = #{record.agentprice,jdbcType=INTEGER}");
        }
        
        if (record.getCouponprice() != null) {
            sql.SET("couponPrice = #{record.couponprice,jdbcType=INTEGER}");
        }
        
        if (record.getDiffprice() != null) {
            sql.SET("diffPrice = #{record.diffprice,jdbcType=INTEGER}");
        }
        
        if (record.getRefundprice() != null) {
            sql.SET("refundPrice = #{record.refundprice,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `tmporderpay`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`tmporderpay`");
        
        sql.SET("orderId = #{record.orderid,jdbcType=VARCHAR}");
        sql.SET("orderPrice = #{record.orderprice,jdbcType=INTEGER}");
        sql.SET("agentPrice = #{record.agentprice,jdbcType=INTEGER}");
        sql.SET("couponPrice = #{record.couponprice,jdbcType=INTEGER}");
        sql.SET("diffPrice = #{record.diffprice,jdbcType=INTEGER}");
        sql.SET("refundPrice = #{record.refundprice,jdbcType=INTEGER}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        
        FinalTmporderpayCriteria example = (FinalTmporderpayCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `tmporderpay`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(FinalTmporderpay record) {
        SQL sql = new SQL();
        sql.UPDATE("`tmporderpay`");
        
        if (record.getOrderprice() != null) {
            sql.SET("orderPrice = #{orderprice,jdbcType=INTEGER}");
        }
        
        if (record.getAgentprice() != null) {
            sql.SET("agentPrice = #{agentprice,jdbcType=INTEGER}");
        }
        
        if (record.getCouponprice() != null) {
            sql.SET("couponPrice = #{couponprice,jdbcType=INTEGER}");
        }
        
        if (record.getDiffprice() != null) {
            sql.SET("diffPrice = #{diffprice,jdbcType=INTEGER}");
        }
        
        if (record.getRefundprice() != null) {
            sql.SET("refundPrice = #{refundprice,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("orderId = #{orderid,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `tmporderpay`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, FinalTmporderpayCriteria example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}