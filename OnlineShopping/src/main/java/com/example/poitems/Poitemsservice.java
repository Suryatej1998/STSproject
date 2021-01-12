package com.example.poitems;

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
public class Poitemsservice {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Map<String, String> insertPoitems(Poitems poitems) {

		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "INSERT INTO poitems (poid,itemid,quantity,price,discount) VALUES (:Poid,:Itemid,:Quantity,:Price,:Discount)";
		try
		{
			SqlParameterSource parameters = new MapSqlParameterSource()
					.addValue("Poid", poitems.getPoid())
					.addValue("Itemid",poitems.getItemid())
					.addValue("Quantity", poitems.getQuantity())
					.addValue("Price",poitems.getPrice())
					.addValue("Discount", ((Poitems) poitems).getDiscount());

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
	public Map<String, String> update(Poitems poitems) {
		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "update Poitems set price=?where poid=?";
		try {
			result = jdbcTemplate.update(sql,poitems.getPrice(),poitems.getPoid());
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

	

	public List get(int poid) {
		
		Map dataMap = new HashMap();
		List responseList = new ArrayList();
		List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
		String sql = "select poid,itemid,quantity,price,discount from poitems where poid = ?";
		try {
			dataList = jdbcTemplate.queryForList(sql, poid);

			for (Map<String, Object> row : dataList) {
				dataMap.put("poid", row.get("poid"));
				dataMap.put("itemid", row.get("itemid"));
				dataMap.put("quantity", row.get("quantity"));
				dataMap.put("price", row.get("price"));
				dataMap.put("discount", row.get("discount"));
				responseList.add(dataList);
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
		String sql = "select poid,itemid,quantity,price,discount from poitems";

		try {
			dataList = jdbcTemplate.queryForList(sql);

			for (Map<String, Object> row : dataList) {
				dataMap = new HashMap();
				dataMap.put("poid", row.get("poid"));
				dataMap.put("itemid", row.get("itemid"));
				dataMap.put("quantity", row.get("quantity"));
				dataMap.put("price", row.get("price"));
				dataMap.put("discount", row.get("discount"));
				responseList.add(dataMap);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured");

		}
		
		return responseList;
	}

}


