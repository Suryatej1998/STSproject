package com.example.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class Customerservice {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Map<String, String> insertCustomer(Customer customer) {

		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "insert into customer (customerid,customername,phonenumber,shiptoaddress,shiptozip,shiptocity,shiptostate) VALUES (:customerid,:customername,:phonenumber,:shiptoaddress,:shiptozip,:shiptocity,:shiptostate)";
		try
		{
			SqlParameterSource parameters = new MapSqlParameterSource()
					.addValue("customerid", customer.getCustomerid())
					.addValue("customername", customer.getCustomername())
					.addValue("phonenumber",customer.getPhonenumber())
					.addValue("shiptoaddress", customer.getShiptoaddress())
					.addValue("shiptozip", customer.getShiptozip())
					.addValue("shiptocity", customer.getShiptocity())
					.addValue("shiptostate", customer.getShiptostate());

			result = namedParameterJdbcTemplate.update(sql, parameters);
			if (result > 0)
				data.put("success", "Record inserted successfully");
			else
				data.put("failed", "Record failed to insert, please try again!");
		} catch (Exception e) {
			data.put("error", "Error occured, please try again!");
			
		}
		
		return data;

	}
	public Map<String, String> update(Customer customer) {
		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "update customer set phonenumber=? where customerid=?";
		try {
			result = jdbcTemplate.update(sql,customer.getPhonenumber(),customer.getCustomerid());
			if (result > 0)
				data.put("success", "updated successfully");
			else
				data.put("failed", "updation failed");
		} catch (Exception e) {
			data.put("error", "Error occured, please try again!");
	e.printStackTrace();
		}
		
		return data;
	}

	

	public List get(int customerid) {
		
		Map dataMap = new HashMap();
		List responseList = new ArrayList();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String sql = "select customerid,customername,phonenumber,shiptocity,shiptostate from customer where customerid = ?";
		try {
			dataList = jdbcTemplate.queryForList(sql, customerid);
			
			for (Map<String, Object> row : dataList)
			{
				dataMap.put("customerid", row.get("customerid"));
				dataMap.put("customername", row.get("customername"));
				dataMap.put("phonenumber", row.get("phonenumber"));
				dataMap.put("shiptocity", row.get("shiptocity"));
				dataMap.put("shiptostate", row.get("shiptostate"));
				responseList.add(dataMap);
				System.out.println(dataMap);
				System.out.println(responseList);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured");
		}
		
		return responseList;
	}

	public List getAll() {
		
		Map dataMap = null;
		List responseList = new ArrayList();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String sql = "select * from customer";

		try {
			dataList = jdbcTemplate.queryForList(sql);

			for (Map<String, Object> row : dataList) {
				dataMap = new HashMap();
				dataMap.put("customerid", row.get("customerid"));
				dataMap.put("customername", row.get("customername"));
				dataMap.put("phonenumber", row.get("phonenumber"));
				dataMap.put("shiptoaddress", row.get("shiptoaddress"));
				dataMap.put("shiptozip", row.get("shiptozip"));
				dataMap.put("shiptocity", row.get("shiptocity"));
				dataMap.put("shiptostate", row.get("shiptostate"));
				responseList.add(dataMap);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured");

		}
		
		return responseList;
	}

}