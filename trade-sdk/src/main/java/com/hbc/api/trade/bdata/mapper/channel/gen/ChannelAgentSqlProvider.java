package com.hbc.api.trade.bdata.mapper.channel.gen;

import com.hbc.api.trade.bdata.mapper.channel.gen.bean.ChannelAgent;
import com.hbc.api.trade.bdata.mapper.channel.gen.bean.ChannelAgentExample.Criteria;
import com.hbc.api.trade.bdata.mapper.channel.gen.bean.ChannelAgentExample.Criterion;
import com.hbc.api.trade.bdata.mapper.channel.gen.bean.ChannelAgentExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ChannelAgentSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    public String countByExample(ChannelAgentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`channel_agent`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    public String deleteByExample(ChannelAgentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`channel_agent`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    public String insertSelective(ChannelAgent record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`channel_agent`");
        
        if (record.getAgentId() != null) {
            sql.VALUES("agent_id", "#{agentId,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentName() != null) {
            sql.VALUES("agent_name", "#{agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentAdminId() != null) {
            sql.VALUES("agent_admin_id", "#{agentAdminId,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentAdminName() != null) {
            sql.VALUES("agent_admin_name", "#{agentAdminName,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceId() != null) {
            sql.VALUES("province_id", "#{provinceId,jdbcType=INTEGER}");
        }
        
        if (record.getProvinceName() != null) {
            sql.VALUES("province_name", "#{provinceName,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.VALUES("city_id", "#{cityId,jdbcType=INTEGER}");
        }
        
        if (record.getCityName() != null) {
            sql.VALUES("city_name", "#{cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getFundAccountId() != null) {
            sql.VALUES("fund_account_id", "#{fundAccountId,jdbcType=VARCHAR}");
        }
        
        if (record.getIndustryType() != null) {
            sql.VALUES("industry_type", "#{industryType,jdbcType=TINYINT}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.VALUES("comment", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        if (record.getIsConfig() != null) {
            sql.VALUES("is_config", "#{isConfig,jdbcType=TINYINT}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundRemain() != null) {
            sql.VALUES("fund_remain", "#{fundRemain,jdbcType=INTEGER}");
        }
        
        if (record.getMemberNum() != null) {
            sql.VALUES("member_num", "#{memberNum,jdbcType=INTEGER}");
        }
        
        if (record.getSupportReceive() != null) {
            sql.VALUES("support_receive", "#{supportReceive,jdbcType=TINYINT}");
        }
        
        if (record.getSupportSend() != null) {
            sql.VALUES("support_send", "#{supportSend,jdbcType=TINYINT}");
        }
        
        if (record.getSupportPerday() != null) {
            sql.VALUES("support_perday", "#{supportPerday,jdbcType=TINYINT}");
        }
        
        if (record.getSupportPertime() != null) {
            sql.VALUES("support_pertime", "#{supportPertime,jdbcType=TINYINT}");
        }
        
        if (record.getChannelServiceType() != null) {
            sql.VALUES("channel_service_type", "#{channelServiceType,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    public String selectByExample(ChannelAgentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("agent_id");
        } else {
            sql.SELECT("agent_id");
        }
        sql.SELECT("agent_name");
        sql.SELECT("agent_admin_id");
        sql.SELECT("agent_admin_name");
        sql.SELECT("province_id");
        sql.SELECT("province_name");
        sql.SELECT("city_id");
        sql.SELECT("city_name");
        sql.SELECT("fund_account_id");
        sql.SELECT("industry_type");
        sql.SELECT("phone");
        sql.SELECT("comment");
        sql.SELECT("status");
        sql.SELECT("is_config");
        sql.SELECT("update_time");
        sql.SELECT("create_time");
        sql.SELECT("fund_remain");
        sql.SELECT("member_num");
        sql.SELECT("support_receive");
        sql.SELECT("support_send");
        sql.SELECT("support_perday");
        sql.SELECT("support_pertime");
        sql.SELECT("channel_service_type");
        sql.FROM("`channel_agent`");
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
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        ChannelAgent record = (ChannelAgent) parameter.get("record");
        ChannelAgentExample example = (ChannelAgentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`channel_agent`");
        
        if (record.getAgentId() != null) {
            sql.SET("agent_id = #{record.agentId,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentName() != null) {
            sql.SET("agent_name = #{record.agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentAdminId() != null) {
            sql.SET("agent_admin_id = #{record.agentAdminId,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentAdminName() != null) {
            sql.SET("agent_admin_name = #{record.agentAdminName,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceId() != null) {
            sql.SET("province_id = #{record.provinceId,jdbcType=INTEGER}");
        }
        
        if (record.getProvinceName() != null) {
            sql.SET("province_name = #{record.provinceName,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        }
        
        if (record.getCityName() != null) {
            sql.SET("city_name = #{record.cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getFundAccountId() != null) {
            sql.SET("fund_account_id = #{record.fundAccountId,jdbcType=VARCHAR}");
        }
        
        if (record.getIndustryType() != null) {
            sql.SET("industry_type = #{record.industryType,jdbcType=TINYINT}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("comment = #{record.comment,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=TINYINT}");
        }
        
        if (record.getIsConfig() != null) {
            sql.SET("is_config = #{record.isConfig,jdbcType=TINYINT}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundRemain() != null) {
            sql.SET("fund_remain = #{record.fundRemain,jdbcType=INTEGER}");
        }
        
        if (record.getMemberNum() != null) {
            sql.SET("member_num = #{record.memberNum,jdbcType=INTEGER}");
        }
        
        if (record.getSupportReceive() != null) {
            sql.SET("support_receive = #{record.supportReceive,jdbcType=TINYINT}");
        }
        
        if (record.getSupportSend() != null) {
            sql.SET("support_send = #{record.supportSend,jdbcType=TINYINT}");
        }
        
        if (record.getSupportPerday() != null) {
            sql.SET("support_perday = #{record.supportPerday,jdbcType=TINYINT}");
        }
        
        if (record.getSupportPertime() != null) {
            sql.SET("support_pertime = #{record.supportPertime,jdbcType=TINYINT}");
        }
        
        if (record.getChannelServiceType() != null) {
            sql.SET("channel_service_type = #{record.channelServiceType,jdbcType=TINYINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`channel_agent`");
        
        sql.SET("agent_id = #{record.agentId,jdbcType=VARCHAR}");
        sql.SET("agent_name = #{record.agentName,jdbcType=VARCHAR}");
        sql.SET("agent_admin_id = #{record.agentAdminId,jdbcType=VARCHAR}");
        sql.SET("agent_admin_name = #{record.agentAdminName,jdbcType=VARCHAR}");
        sql.SET("province_id = #{record.provinceId,jdbcType=INTEGER}");
        sql.SET("province_name = #{record.provinceName,jdbcType=VARCHAR}");
        sql.SET("city_id = #{record.cityId,jdbcType=INTEGER}");
        sql.SET("city_name = #{record.cityName,jdbcType=VARCHAR}");
        sql.SET("fund_account_id = #{record.fundAccountId,jdbcType=VARCHAR}");
        sql.SET("industry_type = #{record.industryType,jdbcType=TINYINT}");
        sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        sql.SET("comment = #{record.comment,jdbcType=VARCHAR}");
        sql.SET("status = #{record.status,jdbcType=TINYINT}");
        sql.SET("is_config = #{record.isConfig,jdbcType=TINYINT}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("fund_remain = #{record.fundRemain,jdbcType=INTEGER}");
        sql.SET("member_num = #{record.memberNum,jdbcType=INTEGER}");
        sql.SET("support_receive = #{record.supportReceive,jdbcType=TINYINT}");
        sql.SET("support_send = #{record.supportSend,jdbcType=TINYINT}");
        sql.SET("support_perday = #{record.supportPerday,jdbcType=TINYINT}");
        sql.SET("support_pertime = #{record.supportPertime,jdbcType=TINYINT}");
        sql.SET("channel_service_type = #{record.channelServiceType,jdbcType=TINYINT}");
        
        ChannelAgentExample example = (ChannelAgentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(ChannelAgent record) {
        SQL sql = new SQL();
        sql.UPDATE("`channel_agent`");
        
        if (record.getAgentName() != null) {
            sql.SET("agent_name = #{agentName,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentAdminId() != null) {
            sql.SET("agent_admin_id = #{agentAdminId,jdbcType=VARCHAR}");
        }
        
        if (record.getAgentAdminName() != null) {
            sql.SET("agent_admin_name = #{agentAdminName,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceId() != null) {
            sql.SET("province_id = #{provinceId,jdbcType=INTEGER}");
        }
        
        if (record.getProvinceName() != null) {
            sql.SET("province_name = #{provinceName,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{cityId,jdbcType=INTEGER}");
        }
        
        if (record.getCityName() != null) {
            sql.SET("city_name = #{cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getFundAccountId() != null) {
            sql.SET("fund_account_id = #{fundAccountId,jdbcType=VARCHAR}");
        }
        
        if (record.getIndustryType() != null) {
            sql.SET("industry_type = #{industryType,jdbcType=TINYINT}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("comment = #{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        if (record.getIsConfig() != null) {
            sql.SET("is_config = #{isConfig,jdbcType=TINYINT}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getFundRemain() != null) {
            sql.SET("fund_remain = #{fundRemain,jdbcType=INTEGER}");
        }
        
        if (record.getMemberNum() != null) {
            sql.SET("member_num = #{memberNum,jdbcType=INTEGER}");
        }
        
        if (record.getSupportReceive() != null) {
            sql.SET("support_receive = #{supportReceive,jdbcType=TINYINT}");
        }
        
        if (record.getSupportSend() != null) {
            sql.SET("support_send = #{supportSend,jdbcType=TINYINT}");
        }
        
        if (record.getSupportPerday() != null) {
            sql.SET("support_perday = #{supportPerday,jdbcType=TINYINT}");
        }
        
        if (record.getSupportPertime() != null) {
            sql.SET("support_pertime = #{supportPertime,jdbcType=TINYINT}");
        }
        
        if (record.getChannelServiceType() != null) {
            sql.SET("channel_service_type = #{channelServiceType,jdbcType=TINYINT}");
        }
        
        sql.WHERE("agent_id = #{agentId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, ChannelAgentExample example, boolean includeExamplePhrase) {
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