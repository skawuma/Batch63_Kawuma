package com.cogent.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author samuelkawuma
 *Oct 14, 2022
 *9:52:46 AM
 */

public class ProductBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Double pid;
	private String pname;
	private String pcat;
	private Date manufacture_date;
	private Double price;
	private Date expiry_date;
	/**
	 * 
	 */
	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param pid
	 * @param pname
	 * @param pcat
	 * @param manufacture_date
	 * @param price
	 * @param expiry_date
	 */
	public ProductBean(Double pid, String pname, String pcat, Date manufacture_date, Double price, Date expiry_date) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcat = pcat;
		this.manufacture_date = manufacture_date;
		this.price = price;
		this.expiry_date = expiry_date;
	}
	/**
	 * @return the pid
	 */
	public Double getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(Double pid) {
		this.pid = pid;
	}
	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}
	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}
	/**
	 * @return the pcat
	 */
	public String getPcat() {
		return pcat;
	}
	/**
	 * @param pcat the pcat to set
	 */
	public void setPcat(String pcat) {
		this.pcat = pcat;
	}
	/**
	 * @return the manufacture_date
	 */
	public Date getManufacture_date() {
		return manufacture_date;
	}
	/**
	 * @param manufacture_date the manufacture_date to set
	 */
	public void setManufacture_date(Date manufacture_date) {
		this.manufacture_date = manufacture_date;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the expiry_date
	 */
	public Date getExpiry_date() {
		return expiry_date;
	}
	/**
	 * @param expiry_date the expiry_date to set
	 */
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	
	@Override
	public String toString() {
		return "ProductBean [pid=" + pid + ", pname=" + pname + ", pcat=" + pcat + ", manufacture_date="
				+ manufacture_date + ", price=" + price + ", expiry_date=" + expiry_date + "]";
	}

}

