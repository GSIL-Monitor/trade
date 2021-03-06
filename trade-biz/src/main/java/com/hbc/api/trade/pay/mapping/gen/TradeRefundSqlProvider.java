package com.hbc.api.trade.pay.mapping.gen;

import com.hbc.api.trade.pay.mapping.gen.bean.TradeRefund;
import com.hbc.api.trade.pay.mapping.gen.bean.TradeRefundExample.Criteria;
import com.hbc.api.trade.pay.mapping.gen.bean.TradeRefundExample.Criterion;
import com.hbc.api.trade.pay.mapping.gen.bean.TradeRefundExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TradeRefundSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund`
     *
     * @mbggenerated
     */
    public String countByExample(TradeRefundExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`trade_refund`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund`
     *
     * @mbggenerated
     */
    public String deleteByExample(TradeRefundExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`trade_refund`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund`
     *
     * @mbggenerated
     */
    public String insertSelective(TradeRefund record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`trade_refund`");
        
        if (record.getRefundNo() != null) {
            sql.VALUES("refund_no", "#{refundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBatchNo() != null) {
            sql.VALUES("batch_no", "#{batchNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBatchNum() != null) {
            sql.VALUES("batch_num", "#{batchNum,jdbcType=INTEGER}");
        }
        
        if (record.getRefundStatus() != null) {
            sql.VALUES("refund_status", "#{refundStatus,jdbcType=INTEGER}");
        }
        
        if (record.getRefundType() != null) {
            sql.VALUES("refund_type", "#{refundType,jdbcType=INTEGER}");
        }
        
        if (record.getOrderStatus() != null) {
            sql.VALUES("order_status", "#{orderStatus,jdbcType=INTEGER}");
        }
        
        if (record.getOrderStatusName() != null) {
            sql.VALUES("order_status_name", "#{orderStatusName,jdbcType=VARCHAR}");
        }
        
        if (record.getPayNo() != null) {
            sql.VALUES("pay_no", "#{payNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundAccount() != null) {
            sql.VALUES("refund_account", "#{refundAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundMoney() != null) {
            sql.VALUES("refund_money", "#{refundMoney,jdbcType=DOUBLE}");
        }
        
        if (record.getRefundMoneyGuide() != null) {
            sql.VALUES("refund_money_guide", "#{refundMoneyGuide,jdbcType=DOUBLE}");
        }
        
        if (record.getRefundMoneySystem() != null) {
            sql.VALUES("refund_money_system", "#{refundMoneySystem,jdbcType=DOUBLE}");
        }
        
        if (record.getRefundSubject() != null) {
            sql.VALUES("refund_subject", "#{refundSubject,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundDesc() != null) {
            sql.VALUES("refund_desc", "#{refundDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundError() != null) {
            sql.VALUES("refund_error", "#{refundError,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundDetail() != null) {
            sql.VALUES("refund_detail", "#{refundDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundRequest() != null) {
            sql.VALUES("refund_request", "#{refundRequest,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundResponse() != null) {
            sql.VALUES("refund_response", "#{refundResponse,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundTime() != null) {
            sql.VALUES("refund_time", "#{refundTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.VALUES("user_mobile", "#{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getPayGetway() != null) {
            sql.VALUES("pay_getway", "#{payGetway,jdbcType=INTEGER}");
        }
        
        if (record.getPayGatewayName() != null) {
            sql.VALUES("pay_gateway_name", "#{payGatewayName,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundGetway() != null) {
            sql.VALUES("refund_getway", "#{refundGetway,jdbcType=INTEGER}");
        }
        
        if (record.getRefundGetwayName() != null) {
            sql.VALUES("refund_getway_name", "#{refundGetwayName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund`
     *
     * @mbggenerated
     */
    public String selectByExample(TradeRefundExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("refund_no");
        } else {
            sql.SELECT("refund_no");
        }
        sql.SELECT("order_no");
        sql.SELECT("batch_no");
        sql.SELECT("batch_num");
        sql.SELECT("refund_status");
        sql.SELECT("refund_type");
        sql.SELECT("order_status");
        sql.SELECT("order_status_name");
        sql.SELECT("pay_no");
        sql.SELECT("refund_account");
        sql.SELECT("refund_money");
        sql.SELECT("refund_money_guide");
        sql.SELECT("refund_money_system");
        sql.SELECT("refund_subject");
        sql.SELECT("refund_desc");
        sql.SELECT("refund_error");
        sql.SELECT("refund_detail");
        sql.SELECT("refund_request");
        sql.SELECT("refund_response");
        sql.SELECT("refund_time");
        sql.SELECT("user_id");
        sql.SELECT("user_mobile");
        sql.SELECT("pay_getway");
        sql.SELECT("pay_gateway_name");
        sql.SELECT("refund_getway");
        sql.SELECT("refund_getway_name");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("`trade_refund`");
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
     * This method corresponds to the database table `trade_refund`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TradeRefund record = (TradeRefund) parameter.get("record");
        TradeRefundExample example = (TradeRefundExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`trade_refund`");
        
        if (record.getRefundNo() != null) {
            sql.SET("refund_no = #{record.refundNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBatchNo() != null) {
            sql.SET("batch_no = #{record.batchNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBatchNum() != null) {
            sql.SET("batch_num = #{record.batchNum,jdbcType=INTEGER}");
        }
        
        if (record.getRefundStatus() != null) {
            sql.SET("refund_status = #{record.refundStatus,jdbcType=INTEGER}");
        }
        
        if (record.getRefundType() != null) {
            sql.SET("refund_type = #{record.refundType,jdbcType=INTEGER}");
        }
        
        if (record.getOrderStatus() != null) {
            sql.SET("order_status = #{record.orderStatus,jdbcType=INTEGER}");
        }
        
        if (record.getOrderStatusName() != null) {
            sql.SET("order_status_name = #{record.orderStatusName,jdbcType=VARCHAR}");
        }
        
        if (record.getPayNo() != null) {
            sql.SET("pay_no = #{record.payNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundAccount() != null) {
            sql.SET("refund_account = #{record.refundAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundMoney() != null) {
            sql.SET("refund_money = #{record.refundMoney,jdbcType=DOUBLE}");
        }
        
        if (record.getRefundMoneyGuide() != null) {
            sql.SET("refund_money_guide = #{record.refundMoneyGuide,jdbcType=DOUBLE}");
        }
        
        if (record.getRefundMoneySystem() != null) {
            sql.SET("refund_money_system = #{record.refundMoneySystem,jdbcType=DOUBLE}");
        }
        
        if (record.getRefundSubject() != null) {
            sql.SET("refund_subject = #{record.refundSubject,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundDesc() != null) {
            sql.SET("refund_desc = #{record.refundDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundError() != null) {
            sql.SET("refund_error = #{record.refundError,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundDetail() != null) {
            sql.SET("refund_detail = #{record.refundDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundRequest() != null) {
            sql.SET("refund_request = #{record.refundRequest,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundResponse() != null) {
            sql.SET("refund_response = #{record.refundResponse,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundTime() != null) {
            sql.SET("refund_time = #{record.refundTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.SET("user_mobile = #{record.userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getPayGetway() != null) {
            sql.SET("pay_getway = #{record.payGetway,jdbcType=INTEGER}");
        }
        
        if (record.getPayGatewayName() != null) {
            sql.SET("pay_gateway_name = #{record.payGatewayName,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundGetway() != null) {
            sql.SET("refund_getway = #{record.refundGetway,jdbcType=INTEGER}");
        }
        
        if (record.getRefundGetwayName() != null) {
            sql.SET("refund_getway_name = #{record.refundGetwayName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_refund`");
        
        sql.SET("refund_no = #{record.refundNo,jdbcType=VARCHAR}");
        sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("batch_no = #{record.batchNo,jdbcType=VARCHAR}");
        sql.SET("batch_num = #{record.batchNum,jdbcType=INTEGER}");
        sql.SET("refund_status = #{record.refundStatus,jdbcType=INTEGER}");
        sql.SET("refund_type = #{record.refundType,jdbcType=INTEGER}");
        sql.SET("order_status = #{record.orderStatus,jdbcType=INTEGER}");
        sql.SET("order_status_name = #{record.orderStatusName,jdbcType=VARCHAR}");
        sql.SET("pay_no = #{record.payNo,jdbcType=VARCHAR}");
        sql.SET("refund_account = #{record.refundAccount,jdbcType=VARCHAR}");
        sql.SET("refund_money = #{record.refundMoney,jdbcType=DOUBLE}");
        sql.SET("refund_money_guide = #{record.refundMoneyGuide,jdbcType=DOUBLE}");
        sql.SET("refund_money_system = #{record.refundMoneySystem,jdbcType=DOUBLE}");
        sql.SET("refund_subject = #{record.refundSubject,jdbcType=VARCHAR}");
        sql.SET("refund_desc = #{record.refundDesc,jdbcType=VARCHAR}");
        sql.SET("refund_error = #{record.refundError,jdbcType=VARCHAR}");
        sql.SET("refund_detail = #{record.refundDetail,jdbcType=VARCHAR}");
        sql.SET("refund_request = #{record.refundRequest,jdbcType=VARCHAR}");
        sql.SET("refund_response = #{record.refundResponse,jdbcType=VARCHAR}");
        sql.SET("refund_time = #{record.refundTime,jdbcType=TIMESTAMP}");
        sql.SET("user_id = #{record.userId,jdbcType=VARCHAR}");
        sql.SET("user_mobile = #{record.userMobile,jdbcType=VARCHAR}");
        sql.SET("pay_getway = #{record.payGetway,jdbcType=INTEGER}");
        sql.SET("pay_gateway_name = #{record.payGatewayName,jdbcType=VARCHAR}");
        sql.SET("refund_getway = #{record.refundGetway,jdbcType=INTEGER}");
        sql.SET("refund_getway_name = #{record.refundGetwayName,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        TradeRefundExample example = (TradeRefundExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(TradeRefund record) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_refund`");
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBatchNo() != null) {
            sql.SET("batch_no = #{batchNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBatchNum() != null) {
            sql.SET("batch_num = #{batchNum,jdbcType=INTEGER}");
        }
        
        if (record.getRefundStatus() != null) {
            sql.SET("refund_status = #{refundStatus,jdbcType=INTEGER}");
        }
        
        if (record.getRefundType() != null) {
            sql.SET("refund_type = #{refundType,jdbcType=INTEGER}");
        }
        
        if (record.getOrderStatus() != null) {
            sql.SET("order_status = #{orderStatus,jdbcType=INTEGER}");
        }
        
        if (record.getOrderStatusName() != null) {
            sql.SET("order_status_name = #{orderStatusName,jdbcType=VARCHAR}");
        }
        
        if (record.getPayNo() != null) {
            sql.SET("pay_no = #{payNo,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundAccount() != null) {
            sql.SET("refund_account = #{refundAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundMoney() != null) {
            sql.SET("refund_money = #{refundMoney,jdbcType=DOUBLE}");
        }
        
        if (record.getRefundMoneyGuide() != null) {
            sql.SET("refund_money_guide = #{refundMoneyGuide,jdbcType=DOUBLE}");
        }
        
        if (record.getRefundMoneySystem() != null) {
            sql.SET("refund_money_system = #{refundMoneySystem,jdbcType=DOUBLE}");
        }
        
        if (record.getRefundSubject() != null) {
            sql.SET("refund_subject = #{refundSubject,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundDesc() != null) {
            sql.SET("refund_desc = #{refundDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundError() != null) {
            sql.SET("refund_error = #{refundError,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundDetail() != null) {
            sql.SET("refund_detail = #{refundDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundRequest() != null) {
            sql.SET("refund_request = #{refundRequest,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundResponse() != null) {
            sql.SET("refund_response = #{refundResponse,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundTime() != null) {
            sql.SET("refund_time = #{refundTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=VARCHAR}");
        }
        
        if (record.getUserMobile() != null) {
            sql.SET("user_mobile = #{userMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getPayGetway() != null) {
            sql.SET("pay_getway = #{payGetway,jdbcType=INTEGER}");
        }
        
        if (record.getPayGatewayName() != null) {
            sql.SET("pay_gateway_name = #{payGatewayName,jdbcType=VARCHAR}");
        }
        
        if (record.getRefundGetway() != null) {
            sql.SET("refund_getway = #{refundGetway,jdbcType=INTEGER}");
        }
        
        if (record.getRefundGetwayName() != null) {
            sql.SET("refund_getway_name = #{refundGetwayName,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("refund_no = #{refundNo,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_refund`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, TradeRefundExample example, boolean includeExamplePhrase) {
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