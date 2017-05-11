package xmu.mystore.goodsmgt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="142492_category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false)
	private Long id;	    	 //品类id
	@Column
	private String name;		 //品类名称
	@Column
	private Long upper_category_id;	 //上级品类id
	@Column
	private Integer rank;		 //品类等级
	@Column
	private Integer type;		 //品类状态（目前表示是否在前台显示）
	@Column
	private Integer priority;	         //品类前台显示顺序

	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getUpper_category_id() {
		return upper_category_id;
	}
	public void setUpper_category_id(long upper_category_id) {
		this.upper_category_id = upper_category_id;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
}
