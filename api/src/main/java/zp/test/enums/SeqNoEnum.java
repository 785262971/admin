/**
 * File : SeqNoEnum.java <br/>
 * Author : zk <br/>
 * Version : 2.0 <br/>
 * Date : 2018年1月31日 <br/>
 * Modify : <br/>
 * Package Name : com.zp.enums <br/>
 * Project Name : zp-scm-price-api <br/>
 * Description : <br/>
 * 
 */

/**
 * File : SeqNoEnum.java <br/>
 * Author : zk <br/>
 * Version : 1.0 <br/>
 * Date : 2018年1月31日
 * Modify : <br/>
 * Package Name : com.zp.enums <br/>
 * Project Name : zp-scm-price-api <br/>
 * Description : <br/>
 * 
 */
package zp.test.enums;

/**
 * ClassName : SeqNoEnum <br/>
 * Function : TODO ADD FUNCTION. <br/>
 * Reason : TODO ADD REASON. <br/>
 * Date : 2018年1月31日 上午11:16:34 <br/>
 * 
 * @author : zk <br/>
 * @version : 1.0 <br/>
 * @since : JDK 1.8 <br/>
 * @see
 */

/**
 * 类名：SeqNoEnum  <br />
 *
 * 功能：code生成枚举类
 *
 * @author : zk <br />
 * @Date : 2018年1月31日 上午11:16:34  <br />
 * @version : 2018年1月31日 <br />
 */
public enum SeqNoEnum {
	FAC("FAC", "工厂基础价单"),
	REG("REG", "区域因素调价单"),
	CHA("CHA", "渠道因素调价单"),
	CON("CON", "合同因素调价单"),
	DIS("DIS", "物流因素调价单"),
	DEA("DEA", "客户定价单")
	;
	

    
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	SeqNoEnum(String code, String name){
        this.code = code;
        this.name = name;
    }
    
	
    public static String getNameByCode (String code){
        for (SeqNoEnum enuma : SeqNoEnum.values()){
            if (enuma.getCode().equals(code)){
                return enuma.getName();
            }
        }
        return "未知枚举项";
    }
	}
