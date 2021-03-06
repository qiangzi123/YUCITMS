package com.yucitms.orm.netLesson;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 参考资料
 * @author qiangzi
 *
 */
public class ReferenceData implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String referenceName;//参考资料名字
	private String pdfPath;//文档位置
	private String oldFilePath;//源文件
	private Date createDate;//创建时间
	private ExcellentCourse courses;//对应的精品课程
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReferenceName() {
		return referenceName;
	}
	public void setReferenceName(String referenceName) {
		this.referenceName = referenceName;
	}
	public String getPdfPath() {
		return pdfPath;
	}
	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public ExcellentCourse getCourses() {
		return courses;
	}
	public void setCourses(ExcellentCourse courses) {
		this.courses = courses;
	}
	public String getOldFilePath() {
		return oldFilePath;
	}
	public void setOldFilePath(String oldFilePath) {
		this.oldFilePath = oldFilePath;
	}
	
	
}
