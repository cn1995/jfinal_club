package win.yulongsun.jfinal_club.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBill<M extends BaseBill<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setOrderNum(java.lang.Integer orderNum) {
		set("order_num", orderNum);
	}

	public java.lang.Integer getOrderNum() {
		return get("order_num");
	}

	public void setProfit(java.lang.Double profit) {
		set("profit", profit);
	}

	public java.lang.Double getProfit() {
		return get("profit");
	}

	public void setCreateId(java.lang.Integer createId) {
		set("create_id", createId);
	}

	public java.lang.Integer getCreateId() {
		return get("create_id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
