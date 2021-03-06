/*
 * Copyright (c) 2015-2016, CCLX.COM. All rights reserved.
 * WANDA GROUP PROPRIETARY/CONFIDENTIAL. 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is private property; you can't redistribute it and/or modify it
 * under the terms of the LICENSE you obtained from
 *
 *    http://www.cclx.com/
 * 
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. 
 *
 * Author: Jongly Ran
 * Revision: 1.0
 */
package com.hbc.api.trade.order.enums.deliver;

import com.hbc.api.trade.order.enums.TradeReturnCodeEnum;
import com.hbc.api.trade.order.exception.TradeException;

/**
 * 订单详情是否查看 0-初始（默认）；1-已读
 * @author Jongly Ran
 */
public enum IsRead {
	/** 0:初始 */
	INITIAL(0, "初始"),
	
	/** 1:已读 */
	READ(1, "已读");
	
	public Integer value;
	public String name;
	
	IsRead(Integer value,String name){
		this.value = value;
		this.name = name;
	}
	
	public static IsRead getType(Integer value){
		IsRead[] deliverTypes = IsRead.values();
		for(IsRead deliverType : deliverTypes){
			if(deliverType.value.equals(value)){
				return deliverType;
			}
		}
		
		return INITIAL;
	}
}
