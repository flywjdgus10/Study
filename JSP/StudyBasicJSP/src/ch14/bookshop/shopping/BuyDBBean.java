package ch14.bookshop.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BuyDBBean {

	private static BuyDBBean instance = new BuyDBBean();
	public static BuyDBBean getInstance(){
		return instance;
	}
	private BuyDBBean(){}
	
	private Connection getConnection(){
		
	}
	
	public List<String> getAccount(){
		
	}
	
	public void insertBuy(List<CartDataBean> lists,
							String id,String account,String deliveryName,String deliveryTel,
							String deliveryAddress) {
		
	}
	
	public int getListCount(String id){
		
	}
	
	public int getListCount(){
		
	}
	
	public List<BuyDataBean> getBuyList(String id){
		
	}
	
	public List<BuyDataBean> getBuyList(){
		
	}
	
}








