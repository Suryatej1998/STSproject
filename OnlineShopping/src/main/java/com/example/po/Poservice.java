package com.example.po;

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
public class Poservice {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Map<String, String> insertPo(Po po) {

		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "INSERT INTO po (poid,customerid,podate,pototal,poshiptoaddress,poshiptozip,poshiptocity,poshiptostate,pobilltoaddress,pobilltozip,pobilltocity,pobilltostate,postatus) VALUES (:Poid,:Customerid,:Podate,:Pototal,:Poshiptoaddress,:Poshiptozip,:Poshiptocity,:Poshiptostate,:Pobilltoaddress,:Pobilltozip,:Pobilltocity,:Pobilltostate,:Postatus)";
		try
		{
			SqlParameterSource parameters = new MapSqlParameterSource()
					.addValue("Poid", po.getPoid())
					.addValue("Customerid",po.getCustomerid())
					.addValue("Podate", po.getPodate())
					.addValue("Pototal",po.getPototal())
					.addValue("Poshiptoaddress", po.getPoshiptoaddress())
					.addValue("Poshiptozip",po.getPoshiptozip())
					.addValue("Poshiptocity", po.getPoshiptocity())
					.addValue("Poshiptostate",po.getPoshiptostate())
					.addValue("Pobilltoaddress", po.getPobilltoaddress())
					.addValue("Pobilltozip",po.getPobilltozip())
					.addValue("Pobilltocity", po.getPobilltocity())
					.addValue("Pobilltostate",po.getPobilltostate())
					.addValue("Postatus", po.getPostatus());

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
	public Map<String, String> update(Po po) {
		
		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "update Po set pototal=?where poid=?";
		try {
			result = jdbcTemplate.update(sql,po.getPototal(),po.getPoid());
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
		String sql = "select poid,customerid,podate,pototal,poshiptoaddress,poshiptozip,poshiptocity,poshiptostate,pobilltoaddress,pobilltozip,pobilltocity,pobilltostate,postatus from po where poid = ?";
		try {
			dataList = jdbcTemplate.queryForList(sql, poid);

			for (Map<String, Object> row : dataList) {
				dataMap.put("poid", row.get("poid"));
				dataMap.put("customerid", row.get("customerid"));
				dataMap.put("podate", row.get("podate"));
				dataMap.put("pototal", row.get("pototal"));
				dataMap.put("customerid", row.get("customerid"));
				dataMap.put("poshiptoaddress", row.get("poshiptoaddress"));
				dataMap.put("poshiptozip", row.get("poshiptozip"));
				dataMap.put("poshiptocity", row.get("poshiptocity"));
				dataMap.put("poshiptostate", row.get("poshiptostate"));
				dataMap.put("pobilltoaddress", row.get("pobilltoaddress"));
				dataMap.put("pobilltozip", row.get("pobilltozip"));
				dataMap.put("pobilltocity", row.get("pobilltocity"));
				dataMap.put("pobilltostate", row.get("pobilltostate"));
				dataMap.put("postatus", row.get("postatus"));
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
		String sql = "select poid,customerid,podate,pototal,poshiptoaddress,poshiptozip,poshiptocity,poshiptostate,pobilltoaddress,pobilltozip,pobilltocity,pobilltostate,postatus from po";

		try {
			dataList = jdbcTemplate.queryForList(sql);

			for (Map<String, Object> row : dataList) {
				dataMap = new HashMap();
				dataMap.put("poid", row.get("poid"));
				dataMap.put("customerid", row.get("customerid"));
				dataMap.put("podate", row.get("podate"));
				dataMap.put("pototal", row.get("pototal"));
				dataMap.put("poshiptoaddress", row.get("poshiptoaddress"));
				dataMap.put("poshiptozip", row.get("poshiptozip"));
				dataMap.put("poshiptocity", row.get("poshiptocity"));
				dataMap.put("poshiptostate", row.get("poshiptostate"));
				dataMap.put("pobilltoaddress", row.get("pobilltoaddress"));
				dataMap.put("pobilltozip", row.get("pobilltozip"));
				dataMap.put("pobilltocity", row.get("pobilltocity"));
				dataMap.put("pobilltostate", row.get("pobilltostate"));
				dataMap.put("postatus", row.get("postatus"));
				
				responseList.add(dataMap);
			}

		} catch (Exception e) {
			dataMap.put("error", "Error occured");

		}
		
		return responseList;
	}

}


