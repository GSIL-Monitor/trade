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
package com.hbc.api.trade.order.enums.order;

import com.hbc.api.trade.order.enums.TradeReturnCodeEnum;
import com.hbc.api.trade.order.exception.TradeException;

/**
 * @author Jongly Ran
 */
public enum CarGroupFlag {
	/** 0: 正常 */
	NORMAL(0,"正常"),

	/** 1: 拼车 */
	COORPERATION(1,"拼车");
	
	public Integer value;
	
	public String name;
	
	CarGroupFlag(Integer value,String name){
		this.value = value;
		this.name = name;
	}
	
	public static CarGroupFlag getType(Integer type) {
		for( CarGroupFlag visaType : values()) {
			if(visaType.value.equals(type))	return visaType;
		}
		throw new TradeException(TradeReturnCodeEnum.ORDER_PARAM_FAILED, "CarGroupFlag");
	}
	
	/**
	 * 如果不存在，抛出TradeException
	 */
	public static void isValidate(Integer type) {
		getType(type);
	}
}
